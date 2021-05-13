package exercicios;

import java.io.*;
import java.util.Scanner;

public class Arquivos {

    public void lendoArquivoTxt() {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        // instanciar scanner para abrir o arquivo
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine()); // le a linha do arquivo
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public void lendoArquivosRapidamente() {
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void escrevendoNoArquivo() {
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "C:\\temp\\out.txt"; // cria arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void editandoArquivo() {
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "C:\\temp\\out.txt"; // cria arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // true significa que o arquivo sera o mesmo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
