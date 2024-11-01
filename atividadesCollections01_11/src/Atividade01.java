import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01 {
    public void colorsList(){
        Scanner read = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();



        for(int i=0; i<5;i++){
            System.out.println("Digite uma cor: ");
            colors.add(read.nextLine());
        }

        System.out.println("\nListar Todas as cores: ");
        for(String color : colors){
            System.out.println(color);
        }

        System.out.println("\nOrdenar as cores: ");
        colors.sort(null);
        for(String color : colors){
            System.out.println(color);
        }


    }
}
