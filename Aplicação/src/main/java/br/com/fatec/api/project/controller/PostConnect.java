package br.com.fatec.api.project.controller;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class PostConnect {

    public static String postDados(String urlUsuario, String parametrosUsuario) {
        URL url;
        HttpURLConnection connection = null;

        try {

            url = new URL(urlUsuario);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");

            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

            connection.setRequestProperty("Content-Lenght", "" + parametrosUsuario.getBytes().length);

            connection.setRequestProperty("Content-Language", "pt-BR");

            //connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Envio
            OutputStreamWriter outPutStream = new OutputStreamWriter(connection.getOutputStream(), StandardCharsets.UTF_8);
            outPutStream.write(parametrosUsuario);
            outPutStream.flush();
            outPutStream.close();
            //Recepção
            InputStream inputStream = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String linha;
            StringBuffer resposta = new StringBuffer();

            while ((linha = bufferedReader.readLine()) != null) {
                resposta.append(linha);
                resposta.append('\r');
            }

            bufferedReader.close();

            return resposta.toString();

        } catch (Exception erro) {

            return null;
        } finally {

            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String conteudo = "teste123";
        String Json = "{\n" +
                "\"conteudo\": \""+conteudo+"\"\n" +
                "}";
        postDados("eth0gvh1bd5nx8udpt9rth9lmiuvorxc@hook.us1.make.com",Json);
    }
}