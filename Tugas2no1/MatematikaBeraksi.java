package Tugas2;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        math.angka1 = 20;
        math.angka2 = 10;
        math.angka3 = 10;
        math.angka4 = 5;
        math.angka5 = 10;
        math.angka6 = 3;
        math.angka7 = 21;
        math.angka8 = 2;
        System.out.println("Pertambahan  : " + math.angka1 + " + " + math.angka2 + " = " + math.pertambahan(math.angka1, math.angka2));
        System.out.println("Pengurangan  : " + math.angka3 + " - " + math.angka4 + " = " + math.pengurangan(math.angka3, math.angka4));
        System.out.println("Perklian     : " + math.angka5 + " x " + math.angka6 + " = " + math.perkalian(math.angka5, math.angka6));
        System.out.println("Pembagian    : " + math.angka7 + " / " + math.angka8 + " = " + math.pembagian(math.angka7, math.angka8));
    }
}
