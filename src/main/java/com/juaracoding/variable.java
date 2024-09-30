package com.juaracoding;

public class variable {

    public static void main(String[] args) {

        // camelCase
        // snake_case
        // numeric
        byte countCart = 100;
        short stock = 1000;
        int price = 1000000;
        long saldo = 3000000000L;

        float grade = 95.5f;
        double salary = 1000000.95;

        //char
        char akreditasi = 'A';

        //boolean
        boolean isResult = true;


        //buatkan tampilan ke console user profile gunakan variabel dan tipe data yang tepat

        String address = "Jakarta";
        address = "Bogor";
        System.out.println(address);

        String name = "Chintya Mailarosa";
        byte age = 26;
        String city = "Bandung";
        short height = 153;
        short weight = 57;
        boolean isMarried = false;

        System.out.println("Nama = " + name);
        System.out.println("Umur = " + age);
        System.out.println("City = " + city);
        System.out.println("Tinggi Badan = " + height);
        System.out.println("Berat Badan = " + weight);
        System.out.println("Status = " + isMarried);

        //automatic casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);
        char data2 ='Z';
        long dataLong = data2;
        System.out.println(dataLong);

        //manual casting
        long data = 9223372036854775000L;
        int dataInt = (int) data;
        System.out.println(dataInt);
    }
}
