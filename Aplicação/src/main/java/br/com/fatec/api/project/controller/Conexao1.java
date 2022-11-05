package br.com.fatec.api.project.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Conexao1 {

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
//        String filePath = "C:\\Users\\Pedro\\Downloads\\";
//        String originalFileName = "card_stmt2022_11_01_13_13_01.pdf";
//        String newFileName = "test.pdf";
//
//        byte[] input_file = Files.readAllBytes(Paths.get(filePath+originalFileName));
//
//        byte[] encodedBytes = Base64.getEncoder().encode(input_file);
//        String encodedString =  new String(encodedBytes);
//        byte[] decodedBytes = Base64.getDecoder().decode(encodedString.getBytes());
//
//        FileOutputStream fos = new FileOutputStream(filePath+newFileName);
//        fos.write(decodedBytes);
//        fos.flush();
//        fos.close();
//        //System.out.println(encodedString);
//        postDados("http://187.60.56.85:5414/envioEmail",encodedString);
        String attachment = null;
        String fileName = null;
        String extensao = null;
        String adress = null;
        String subject = null;
        String message = null;

        String Json = "{\n" +
                "\"attachment\": \""+attachment+"\",\n" +
                "\"fileName\": \""+fileName+"\",\n" +
                "\"extensao\": \""+extensao+"\",\n" +
                "\"adress\": ["+adress+"],\n" +
                "\"subject\": \""+subject+"\",\n" +
                "\"message\": \""+message+"\"\n" +
                "}";
        System.out.println(Json);
    }
}