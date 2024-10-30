import java.util.Scanner;

public class Atividade04 {
    public void animal(){
        Scanner rad = new Scanner(System.in);
        System.out.println("É vertebrado ou invertebrado? ");
        String classificacão = rad.nextLine();
            if(classificacão.equalsIgnoreCase("vertebrado")){
            System.out.println("É ave ou mamifero?");
            String familia = rad.nextLine();
            if(familia.equalsIgnoreCase("mamifero")){
                System.out.println("É onívoro ou herbívoro");
                String alimentacao = rad.nextLine();
                if(alimentacao.equalsIgnoreCase("onivoro")){
                    System.out.println("Homem");
                }else{
                    System.out.println("Vaca");
                }
            }else{
                System.out.println("É onívoro ou herbívoro");
                String alimentacao = rad.nextLine();
                if(alimentacao.equalsIgnoreCase("onivoro")){
                    System.out.println("Pomba");
                }else{
                    System.out.println("Águia");
                }
            }
        }else{
                System.out.println("É inseto ou anelídeo?");
                String familia = rad.nextLine();
                if(familia.equalsIgnoreCase("Inseto")){
                    System.out.println("É hematófago ou herbívoro");
                    String alimentacao = rad.nextLine();
                    if(alimentacao.equalsIgnoreCase("hematofago")){
                        System.out.println("Pulga");
                    }else{
                        System.out.println("Lagarta");
                    }
                }else{
                    System.out.println("É hematófago ou onívoro");
                    String alimentacao = rad.nextLine();
                    if(alimentacao.equalsIgnoreCase("hematofago")){
                        System.out.println("Sanguessuga");
                    }else{
                        System.out.println("Minhoca");
                    }
                }
            }
    }
}
