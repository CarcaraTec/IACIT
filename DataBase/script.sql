CREATE TABLE public.regiao
(
    id_regiao serial NOT NULL,
    nome_regiao character varying COLLATE pg_catalog."default",
    CONSTRAINT regiao_pkey PRIMARY KEY (id_regiao)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.regiao
    OWNER to postgres;

INSERT INTO public.regiao(nome_regiao) VALUES ('Centro-Oeste');
INSERT INTO public.regiao(nome_regiao) VALUES ('Norte');
INSERT INTO public.regiao(nome_regiao) VALUES ('Nordeste');
INSERT INTO public.regiao(nome_regiao) VALUES ('Sul');
INSERT INTO public.regiao(nome_regiao) VALUES ('Sudeste');
	


CREATE TABLE public.estacao
(
    id_estacao serial NOT NULL,
    nome character varying COLLATE pg_catalog."default",
    codigo character varying COLLATE pg_catalog."default",
    latitude numeric,
    longitude numeric,
    altitude numeric,
    data_fundacao date,
    unidade_federativa character varying COLLATE pg_catalog."default",
    fk_regiao_id_regiao integer NOT NULL,
    CONSTRAINT estacao_pkey PRIMARY KEY (id_estacao),
    CONSTRAINT fk_estacao_2 FOREIGN KEY (fk_regiao_id_regiao)
        REFERENCES public.regiao (id_regiao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.estacao
    OWNER to postgres;


CREATE TABLE public.descritivo_dado
(
    id_descritivo serial NOT NULL,
    precipitacao_total numeric,
    pressao_atmosferica_ao_nivel_da_estacao_horaria numeric,
    pressao_atmosferica_max_hora_ant numeric,
    pressao_atmosferica_min_hora_ant numeric,
    radiacao_global numeric,
    temperatura_ar_bulbo_seco_horaria numeric,
    temperatura_ponto_orvalho numeric,
    temperatura_maxima_hora_ant numeric,
    temperatura_minima_hora_ant numeric,
    temperatura_orvalho_max_hora_ant numeric,
    temperatura_orvalho_min_hora_ant numeric,
    umidade_rel_max_hora_ant numeric,
    umidade_rel_min_hora_ant numeric,
    umidade_relativa_ar_horaria numeric,
    vento_direcao_horaria numeric,
    vento_rajada_maxima numeric,
    vento_velocidade_horaria numeric,
    data_hora timestamp without time zone,
    fk_estacao_id_estacao integer,
    CONSTRAINT descritivo_dado_pkey PRIMARY KEY (id_descritivo),
    CONSTRAINT fk_descritivo_dado_2 FOREIGN KEY (fk_estacao_id_estacao)
        REFERENCES public.estacao (id_estacao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.descritivo_dado
    OWNER to postgres;