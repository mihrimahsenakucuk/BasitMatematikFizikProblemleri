import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Matematik ve fizik problemleri programına hoş geldiniz...");

        String islemler= "İşlemler...\n"
                +"1.Daire Alanı Hesaplama\n"
                +"2.Üçgen Çevresi Hesaplama\n"
                +"3. 2 Vektörün İç Çarpımını Hesaplama\n"
                +"Çıkış için q'ya basınız...";



        while(true) {

            System.out.println(islemler);
            System.out.println("İşlemi seçiniz: ");
            String islem= scanner.nextLine();

            if(islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")) {
                System.out.print("Dairenin yarıçapı: ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();

                Problem.Matemetik.daireAlan(yaricap);

            }
            else if(islem.equals("2")) {
                System.out.print("Kenar 1: ");
                int kenar1= scanner.nextInt();
                System.out.print("Kenar 2: ");
                int kenar2= scanner.nextInt();
                System.out.print("Kenar 3: ");
                int kenar3= scanner.nextInt();
                scanner.nextLine();


                Problem.Matemetik.ucgenCevresi(kenar1, kenar2, kenar3);

            }
            else if(islem.equals("3")) {
                Vec vec1= new Vec("Vectör1");
                Vec vec2= new Vec("Vectör2");

                Problem.Fizik.icCarpim(vec1,vec2);
            }
            else {

                System.out.println("Geçersiz işlem...");
            }
        }





    }

}

