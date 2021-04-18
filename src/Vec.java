import java.util.Scanner;

public class Vec {

    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {

        this.isim= isim;

        Scanner scanner = new Scanner(System.in);
        System.out.println(isim +" Vektörün i, j ve k değerlerini giriniz: ");

        System.out.print("i: ");
        this.i=scanner.nextInt();

        System.out.print("j: ");
        this.j=scanner.nextInt();

        System.out.print("k: ");
        this.k=scanner.nextInt();

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim= isim;
    }

    public int getI() {
        return i;
    }

    public int setI() {
        return this.i= i;
    }

    public int getJ() {
        return j;
    }

    public int setJ() {
        return this.j= j;
    }


    public int getK() {
        return k;
    }

    public int setK() {
        return this.k= k;
    }



}

