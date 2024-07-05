import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print("Doğum yılınızı giriniz: ");
        a = sc.nextInt();
        a = a%12;
        switch(a){
            case 0:
                System.out.print("Çin zodyağınız Maymun");
                break;
            case 1:
                System.out.print("Çin zodyağınız Horoz");break;
            case 2:
                System.out.print("Çin zodyağınız Köpek");break;
            case 3:
                System.out.print("Çin zodyağınız Domuz");break;
            case 4:
                System.out.print("Çin zodyağınız Fare");break;
            case 5:
                System.out.print("Çin zodyağınız Öküz");break;
            case 6:
                System.out.print("Çin zodyağınız Kaplan");break;
            case 7:
                System.out.print("Çin zodyağınız Tavşan");break;
            case 8:
                System.out.print("Çin zodyağınız Ejderha");break;
            case 9:
                System.out.print("Çin zodyağınız Yılan");break;
            case 10:
                System.out.print("Çin zodyağınız At");break;
            case 11:
                System.out.print("Çin zodyağınız Koyun");break;
        }

    }
}