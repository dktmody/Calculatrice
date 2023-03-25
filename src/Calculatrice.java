import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenue sur Calculinette, quel opération souhaitez vous effectuer ?");
        System.out.println("1. pour l'addition, saisissez juste  +\n2. Soustraction saisissez juste - " +
                "\n3. Multiplication saisissez juste * \n4. Division saisissez juste / ");
        String saisiUtilisateur = scan.nextLine();
        calculer(saisiUtilisateur);
    }
    public static void calculer(String s){
        TypeOperation operation = new TypeOperation(s);
        switch (operation.getSymboleOperation()){
            case "+" :
                addition();
                break;
            case "-" :
                soustraction();
                break;
            case "*" :
                multiplication();
                break;
            case "/" :
                division();
                break;
            default:
                System.out.println("Vous n'avez pas choisi d'opération");
        }
    }
    public static void addition(){
        float n = getN();
        boolean correct;
        Operande operandeA = new Operande(n);
        do{
            Scanner sc =  new Scanner(System.in);
            try{
                System.out.println("Saisissez le 2e nombre que vous souhaitez additionner");
                n = sc.nextFloat();
                correct=true;
            }catch(Exception e){
                System.out.println("Vous avez tapé autre chose qu’un nombre");
                System.out.println(" Veuillez recommencer");
                correct = false;
            }
        }while(!correct);
        Operande operandeB = new Operande(n);
        System.out.println(operandeA.getNombre() +" + " + operandeB.getNombre() +
                " égal => " + (operandeA.getNombre() + operandeB.getNombre()));
    }

    private static float getN() {
        float n =0;
        boolean correct;
        do{
            try{
                System.out.println("Saisissez le 1e nombre que vous souhaitez additionner");
                Scanner sc =  new Scanner(System.in);
                n = sc.nextFloat();
                correct=true;
            }catch(Exception e){
                System.out.println("Vous avez tapé autre chose qu’un nombre");
                System.out.println(" Veuillez recommencer");
                correct = false;
            }
        }while(!correct);
        return n;
    }

    public static void soustraction(){
        float n =0;
        boolean correct;
        do{
            try{
                Scanner sc =  new Scanner(System.in);
                System.out.println("Que voulez-vous soustraire? saisissez le plus grand des 2!");
                 n = sc.nextFloat();
                correct=true;
            }catch(Exception e){
                System.out.println("Vous avez tapé autre chose qu’un nombre");
                System.out.println(" Veuillez recommencer");
                correct = false;
            }
        }while(!correct);
        //----------------------------
        Operande operandeA = new Operande(n);
        //-----------------------
        do{
            try{
                Scanner sc =  new Scanner(System.in);
                System.out.println("de combien ?");
                n = sc.nextFloat();
                correct=true;
            }catch(Exception e){
                System.out.println("Vous avez tapé autre chose qu’un nombre");
                System.out.println(" Veuillez recommencer");
                correct = false;
            }
        }while(!correct);

        Operande operandeB = new Operande(n);
        System.out.println(operandeA.getNombre() +" - " + operandeB.getNombre() +
                " égal => " + (operandeA.getNombre() - operandeB.getNombre()));
    }
    public static void multiplication(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Saisissez le nombre que vous souhaitez multiplier");
        float n = sc.nextFloat();
        Operande operandeA = new Operande(n);
        System.out.println("Vouhaitez multiplier " + operandeA.getNombre() + " par ?");
        n = sc.nextFloat();
        Operande operandeB = new Operande(n);
        System.out.println(operandeA.getNombre() +" * " + operandeB.getNombre() +
                " égal => " + (operandeA.getNombre() * operandeB.getNombre()));
    }
    public static void division(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Saisissez le nombre que vous souhaitez diviser");
        float n = sc.nextFloat();
        Operande operandeA = new Operande(n);
        System.out.println("Vous souhaitez diviser " + operandeA.getNombre() + " par ?");
        n = sc.nextFloat();
        Operande operandeB = new Operande(n);
        System.out.println(operandeA.getNombre() +" / " + operandeB.getNombre() +
                " égal => " + (operandeA.getNombre() / operandeB.getNombre()));
    }
}