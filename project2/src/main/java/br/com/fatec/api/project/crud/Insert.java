package br.com.fatec.api.project.crud;

import br.com.fatec.api.project.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Wesley
 */
public class Insert {
    private final Connection connection;

    public Insert(Connection connection) {
        this.connection = connection;
    }


    public void Regiao(Regiao usuario) throws SQLException {

        String sql = "insert into regiao(nome_regiao) values ('"+usuario.getNome_regiao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Estado(Estado usuario) throws SQLException {

        String sql = "insert into estado(nome_estado, fk_regiao_nome_regiao) values ('"+usuario.getNome_estado()+"','"+usuario.getRegiao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Estacao(Estacao usuario) throws SQLException {

        String sql = "insert into estacao(nome_estacao, cod_wmo, latitude, longitude, altitude, data_fundacao, fk_estado_nome_estado) values ('"+usuario.getNome_estacao()+"','"+usuario.getCodigo()+"','"+usuario.getLatitude()+"','"+usuario.getLongitude()+"','"+usuario.getAltitude()+"','"+usuario.getData_fundacao()+"','"+usuario.getEstado()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Precipitacao(Precipitacao usuario) throws SQLException {

        String sql = "insert into precipitacao(prec_data, prec_hora, prec_total, fk_estacao_cod_wmo) values ('"+usuario.getPrec_data()+"','"+usuario.getPrec_hora()+"','"+usuario.getPrec_total()+"','"+usuario.getEstacao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void PressaoAtm(PressaoAtm usuario) throws SQLException {
        String sql = "insert into pressao_atmosferica(pre_data, pre_hora, pre_atm_estacao, pre_atm_max, pre_atm_min, fk_estacao_cod_wmo) values " +
                "('"+usuario.getPressao_data()+"','"+usuario.getPressao_hora()+"','"+usuario.getPressao_estacao()+"','"+usuario.getPressao_max()+"','"+usuario.getPressao_min()+"','"+usuario.getEstacao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Radiacao(Radiacao usuario) throws SQLException {

        String sql = "insert into radiacao_global(rad_data, rad_hora, rad_global, fk_estacao_cod_wmo) values " +
                "('" + usuario.getRad_data() + "','" + usuario.getRad_hora() + "','" + usuario.getRad_global() + "','" + usuario.getEstacao() + "'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Temperatura(Temperatura usuario) throws SQLException {

        String sql = "insert into temperatura(temp_data, temp_hora, temp_ar, temp_ponto_orvalho, temp_max, temp_min, temp_orvalho_max, temp_orvalho_min, fk_estacao_cod_wmo) values " +
                "('"+usuario.getTemp_data()+"','"+usuario.getTemp_hora()+"','"+usuario.getTemp_ar()+"','"+usuario.getTemp_ponto_orvalho()+"','"+usuario.getTemp_max()+"','"+usuario.getTemp_min()+"','"+usuario.getTemp_orvalho_max()+"','"+usuario.getTemp_orvalho_min()+"','"+usuario.getEstacao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Umidade(Umidade usuario) throws SQLException {

        String sql = "insert into umidade(umi_data, umi_hora, umi_rel_max, umi_rel_min, umi_rel_ar, fk_estacao_cod_wmo) values " +
                "('"+usuario.getUmi_data()+"','"+usuario.getUmi_hora()+"','"+usuario.getUmi_max()+"','"+usuario.getUmi_min()+"','"+usuario.getUmi_ar()+"','"+usuario.getEstacao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();
    }

    public void Vento(Vento usuario) throws SQLException {

        String sql = "insert into vento(ven_data, ven_hora, ven_direcao_hor, ven_rajada_max, ven_velocidade_hor, fk_estacao_cod_wmo) values " +
                "('"+usuario.getVento_data()+"','"+usuario.getVento_hora()+"','"+usuario.getVento_dir_horaria()+"','"+usuario.getVento_rajada_max()+"','"+usuario.getVento_vel_horaria()+"','"+usuario.getEstacao()+"'); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        connection.close();
    }
}

