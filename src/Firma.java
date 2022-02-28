
import java.sql.SQLOutput;
import java.util.Scanner;
class Sotrudnik {
    String fam, im, otch, doljnost;
    int oklad;
    int kolDet;
    Child[] childrens = null;
}
class Child{
    String name;
    int age;
}

public class Firma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input count");
        int count = sc.nextInt();
        Sotrudnik[] sotrudniks = new Sotrudnik[count];
        System.out.println("Input into");
        sc.nextLine();

        for (int i = 0; i < count; i++){
            sotrudniks[i]= new Sotrudnik();
            System.out.println("fam " + (i+1));
            sotrudniks[i].fam = sc.nextLine();
            System.out.println("im " + (i+1));
            sotrudniks[i].im = sc.nextLine();
            System.out.println("otch " + (i+1));
            sotrudniks[i].otch = sc.nextLine();
            System.out.println("doljnost " + (i+1));
            sotrudniks[i].doljnost = sc.nextLine();
            System.out.println("oklad " + (i+1));
            sotrudniks[i].oklad = sc.nextInt();
            System.out.println("count childrens");
            sotrudniks[i].kolDet = sc.nextInt();
            if (sotrudniks[i].kolDet!=0){
                sotrudniks[i].childrens =new Child[sotrudniks[i].kolDet];
                sc.nextLine();
                for (int j = 0; j < sotrudniks[j].kolDet; j++){
                    System.out.println("Children name");
                    sotrudniks[i].childrens[j] = new Child();
                    sotrudniks[i].childrens[j].name = sc.nextLine();
                    System.out.println("Children age");
                    sotrudniks[i].childrens[j].age = sc.nextInt();
                }
            }
            sc.nextLine();
        }
        System.out.println("Info about sotr");
        for (int i =0; i < count; i++){
            System.out.println(sotrudniks[i].fam + " " + sotrudniks[i].im + " " + sotrudniks[i].otch +
                    sotrudniks[i].doljnost + " " + sotrudniks[i].oklad);
            if (sotrudniks[i].kolDet!=0) {
                for (Child c : sotrudniks[i].childrens){
                    System.out.println("Name child " + c.name + " age child " + c.age);
                }
            }
        }
    }
}
