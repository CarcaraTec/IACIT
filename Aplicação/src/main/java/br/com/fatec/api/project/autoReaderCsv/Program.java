package br.com.fatec.api.project.autoReaderCsv;



import br.com.fatec.api.project.crud.Conexao;
import br.com.fatec.api.project.crud.Insert;
import br.com.fatec.api.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {
@Autowired
    public static int ultimo;
    public static int index;
    public static ArrayList<File> arquivos = new ArrayList<>();


    public static void main(String[] args) {
     /*   SelectFile sf = new SelectFile();
        sf.escolher();

        while(index<ultimo) {
            String path = String.valueOf(arquivos.get(index));

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                String line = br.readLine();
                int linha = 1;
                //Entidades
                //INFOS LOCALIZAÇÃO

                //REGIAO
                String nome_regiao = null;
                //ESTADO
                String nome_estado = null;
                //REMOCAO
                String regiao = null;

                //ESTACAO
                String codigo = "0";
                String nome_estacao = null;
                String latitude = "0";
                String longitude = "0";
                String altitude = "0";
                String data_fundacao = "0";
                //REMOCAO
                String estado = "1";

                //PRECIPITACAO

                String prec_total = null;
                String hora = null;
                String data = null;

                //PRESSAO
                String pressao_estacao = null;
                String pressao_max = null;
                String pressao_min = null;


                //RADIACAO
                String rad_global = null;


                //TEMPERATURA
                String temp_ar = null;
                String temp_ponto_orvalho = null;
                String temp_max = null;
                String temp_min = null;
                String temp_orvalho_max = null;
                String temp_orvalho_min = null;


                //UMIDADE
                String umi_max = null;
                String umi_min = null;
                String umi_ar = null;


                //VENTO
                String vento_dir_horaria = null;
                String vento_rajada_max = null;
                String vento_vel_horaria = null;


                while (line != null) {

                    String[] vect = line.split(";");
                    if (linha == 1) {
                        regiao = vect[1];
                    }
                    if (linha == 2) {
                        nome_estado = vect[1];
                    }
                    if (linha == 3) {
                        nome_estacao = vect[1];
                    }
                    if (linha == 4) {
                        codigo = vect[1];
                    }
                    if (linha == 5) {
                        latitude = vect[1].replace(",", ".").replace("null", "0");
                    }
                    if (linha == 6) {
                        longitude = vect[1].replace(",", ".").replace("null", "0");
                    }
                    if (linha == 7) {
                        altitude = vect[1].replace(",", ".").replace("null", "0");

                    }
                    if (linha == 8) {
                        data_fundacao = vect[1];

                        try {

                            Connection conexao = new Conexao().getConnection();
                            Insert cadastro = new Insert();
                            Estacao est = new Estacao();
                            Regiao reg = new Regiao();
                            Estado estad = new Estado();

                            est.setCodigo(codigo);
                            est.setLatitude(Double.parseDouble(latitude));
                            est.setAltitude(Double.parseDouble(altitude));
                            est.setLongitude(Double.parseDouble(longitude));
                            est.setNome_estacao(nome_estacao);
                            est.setData_fundacao(data_fundacao);

                            est.setEstado(nome_estado);

                            reg.setNome_regiao(regiao);

                            estad.setNome_estado(nome_estado);
                            estad.setRegiao(regiao);

                            //cadastro.Regiao(reg);

                            //cadastro.Estado(estad);

                            cadastro.Estacao(est);


                        } catch (SQLException ex) {
                            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }


                    if (linha > 9) {
                        data = vect[0];
                        hora = vect[1];

                        try {
                            prec_total = vect[2].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            prec_total = "-999";
                        }
                        if (prec_total.isEmpty()) {
                            prec_total = "-999";
                        }

                        try {
                            pressao_estacao = vect[3].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            pressao_estacao = "-999";
                        }
                        if (pressao_estacao.isEmpty()) {
                            pressao_estacao = "-999";
                        }

                        try {
                            pressao_max = vect[4].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            pressao_max = "-999";
                        }
                        if (pressao_max.isEmpty()) {
                            pressao_max = "-999";
                        }

                        try {
                            pressao_min = vect[5].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            pressao_min = "-999";
                        }
                        if (pressao_min.isEmpty()) {
                            pressao_min = "-999";
                        }

                        try {
                            rad_global = vect[6].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            rad_global = "-999";
                        }
                        if (rad_global.isEmpty()) {
                            rad_global = "-999";
                        }

                        try {
                            temp_ar = vect[7].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            temp_ar = "-999";
                        }
                        if (temp_ar.isEmpty()) {
                            temp_ar = "-999";
                        }

                        try {
                            temp_ponto_orvalho = vect[8].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            temp_ponto_orvalho = "-999";
                        }
                        if (temp_ponto_orvalho.isEmpty()) {
                            temp_ponto_orvalho = "-999";
                        }

                        try {
                            temp_max = vect[9].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            temp_max = "-999";
                        }
                        if (temp_max.isEmpty()) {
                            temp_max = "-999";
                        }

                        try {
                            temp_min = vect[10].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            temp_min = "-999";
                        }
                        if (temp_min.isEmpty()) {
                            temp_min = "-999";
                        }

                        try {
                            temp_orvalho_max = vect[11].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            temp_orvalho_max = "-999";
                        }
                        if (temp_orvalho_max.isEmpty()) {
                            temp_orvalho_max = "-999";
                        }

                        try {
                            temp_orvalho_min = vect[12].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            temp_orvalho_min = "-999";
                        }
                        if (temp_orvalho_min.isEmpty()) {
                            temp_orvalho_min = "-999";
                        }

                        try {
                            umi_max = vect[13].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            umi_max = "-999";
                        }
                        if (umi_max.isEmpty()) {
                            umi_max = "-999";
                        }

                        try {
                            umi_min = vect[14].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            umi_min = "-999";
                        }
                        if (umi_min.isEmpty()) {
                            umi_min = "-999";
                        }

                        try {
                            umi_ar = vect[15].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            umi_ar = "-999";
                        }
                        if (umi_ar.isEmpty()) {
                            umi_ar = "-999";
                        }

                        try {
                            vento_dir_horaria = vect[16].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            vento_dir_horaria = "-999";
                        }
                        if (vento_dir_horaria.isEmpty()) {
                            vento_dir_horaria = "-999";
                        }

                        try {
                            vento_rajada_max = vect[17].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            vento_rajada_max = "-999";
                        }
                        if (vento_rajada_max.isEmpty()) {
                            vento_rajada_max = "-999";
                        }

                        try {
                            vento_vel_horaria = vect[18].replace(",", ".");
                        } catch (ArrayIndexOutOfBoundsException ex) {
                            vento_vel_horaria = "-999";
                        }
                        if (vento_vel_horaria.isEmpty()) {
                            vento_vel_horaria = "-999";
                        }

                        try {
                            Connection conexao = new Conexao().getConnection();
                            Insert inserir = new Insert();
                            Precipitacao prec = new Precipitacao();


                            prec.setPrec_data(data);
                            prec.setPrec_hora(hora);
                            prec.setPrec_total(Double.parseDouble(prec_total));
                            prec.setEstacao(codigo);

                            inserir.Precipitacao(prec);

                            PressaoAtm press = new PressaoAtm();

                            press.setPressao_data(data);
                            press.setPressao_hora(hora);

                            press.setPressao_estacao(Double.parseDouble(pressao_estacao));
                            press.setPressao_max(Double.parseDouble(pressao_max));
                            press.setPressao_min(Double.parseDouble(pressao_min));
                            press.setEstacao(codigo);

                            inserir.PressaoAtm(press);

                            Radiacao rad = new Radiacao();
                            rad.setRad_data(data);
                            rad.setRad_hora(hora);
                            rad.setRad_global(Double.parseDouble(rad_global));
                            rad.setEstacao(codigo);

                            inserir.Radiacao(rad);

                            Temperatura temp = new Temperatura();

                            temp.setTemp_data(data);
                            temp.setTemp_hora(hora);
                            temp.setTemp_ar(Double.parseDouble(temp_ar));
                            temp.setTemp_ponto_orvalho(Double.parseDouble(temp_ponto_orvalho));
                            temp.setTemp_max(Double.parseDouble(temp_max));
                            temp.setTemp_min(Double.parseDouble(temp_min));
                            temp.setTemp_orvalho_max(Double.parseDouble(temp_orvalho_max));
                            temp.setTemp_orvalho_min(Double.parseDouble(temp_orvalho_min));
                            temp.setEstacao(codigo);

                            inserir.Temperatura(temp);

                            Umidade umi = new Umidade();
                            umi.setUmi_data(data);
                            umi.setUmi_hora(hora);
                            umi.setUmi_max(Double.parseDouble(umi_max));
                            umi.setUmi_min(Double.parseDouble(umi_min));
                            umi.setUmi_ar(Double.parseDouble(umi_ar));
                            umi.setEstacao(codigo);

                            inserir.Umidade(umi);

                            Vento vento = new Vento();
                            vento.setVento_data(data);
                            vento.setVento_hora(hora);
                            vento.setVento_dir_horaria(Double.parseDouble(vento_dir_horaria));
                            vento.setVento_rajada_max(Double.parseDouble(vento_rajada_max));
                            vento.setVento_vel_horaria(Double.parseDouble(vento_vel_horaria));
                            vento.setEstacao(codigo);

                            inserir.Vento(vento);

                        } catch (SQLException ex) {
                            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    line = br.readLine();
                    linha = linha + 1;

                }


            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            index++;
        }
    */}
}