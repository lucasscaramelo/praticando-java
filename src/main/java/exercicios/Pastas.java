package exercicios;

import java.io.File;
import java.util.Scanner;

public class Pastas {

    public void manipulandoPastas() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de sua pasta: ");
        String pastaPath = sc.nextLine();

        File path = new File(pastaPath);

        // lista de pastas
        File[] folders = path.listFiles(File::isDirectory); // filtragem com funcao lambda que filtra apenas o que for pastas/ diretorios
        System.out.println("FOLDERS: ");
        for (File f: folders) {
            System.out.println(f);
        }

        // lista arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File f: files) {
            System.out.println(f);
        }

        sc.close();
    }


    public void criandoSubpasta() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de sua pasta: ");
        String pastaPath = sc.nextLine();

        boolean sucess = new File(pastaPath + "\\subdir").mkdir(); // cria pasta subdir a partir do caminho passado
        System.out.println("Diretorio criado com sucesso " + sucess);

        sc.close();
    }

    public void pegandoInformacoesArquivo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de sua pasta: ");
        String pastaPath = sc.nextLine();

        File path = new File(pastaPath);

        System.out.println("Metodo getName: " + path.getName()); // pegar nome do arquivo
        System.out.println("Metodo getParent: " + path.getParent()); // pegar somente caminho
        System.out.println("Metodo getPath: " + path.getPath()); // pegar o caminho completo

        sc.close();
    }
}
