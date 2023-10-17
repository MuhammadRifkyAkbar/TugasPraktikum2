package Tugas2;

public class Matematika {
    int angka1, angka2, angka3, angka4, angka5, angka6;
    double angka7, angka8;
    int pertambahan(int a, int b){
        angka1 = a;
        angka2 = b;
        return a + b;
    }
    int pengurangan(int a, int b){
        angka3 = a;
        angka4 = b;
        return a - b;
    }
    int perkalian(int a, int b){
        angka5 = a;
        angka6 = b;
        return a * b;
    }
    double pembagian(double a, double b){
        angka7 = a;
        angka8 = b;
        if (b != 0){
            return (double) a/b;
        }else{
            System.out.println("tidak dapat dibagi dengan 0");
            return 0;
        }
    }
}