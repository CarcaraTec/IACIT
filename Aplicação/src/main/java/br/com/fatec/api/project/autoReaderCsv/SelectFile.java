package br.com.fatec.api.project.autoReaderCsv;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectFile {

        private ArrayList<File> listar(String caminho, String extensao) {
            File pasta = new File(caminho);

            return this.listar(pasta, extensao);
        }

        private ArrayList<File> listar(File pasta, String extensao) {
            ArrayList<File> arquivos;

            arquivos = new ArrayList<>(Arrays.asList(pasta.listFiles()));
            arquivos.removeIf(arquivo -> !arquivo.getName().endsWith(extensao));

            return arquivos;

        }
        public void escolher (){
            Program prog = new Program();
            final JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.showOpenDialog(null);
            prog.arquivos = (this.listar(chooser.getSelectedFile(), ".CSV"));

            prog.ultimo = prog.arquivos.size();
        }
    }

