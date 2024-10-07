import java.util.Scanner;

public class burcc {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("1-Dogdugunuz Ayi Giriniz :");
        month = input.nextInt();

        System.out.print("2-Dogdugunuz Günü Giriniz :");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {

                burc = (day < 22) ? "Oglak Burcu" : "Kova Burcu";
            } else {
                isError = true;
            }
        } else if (month == 2) {

            if (day >= 1 && day <= 28) {

                burc = (day < 20) ? "Kova Burcu" : "Balik Burcu";
            }

            else {
                isError = true;
            }
        }

        else if (month == 3) {
            if (day >= 1 && day <= 30) {

                burc = (day < 22) ? "Balik Burcu" : "Koc Burcu";

            } else {
                isError = true;
            }

        }

        else if (month == 4) {

            if (day >= 1 && day <= 31) {
                burc = (day < 20) ? "Koc Burcu" : "Boga Burcu";

            } else {
                isError = true;
            }
        }

        else if (month == 5) {

            if (day >= 1 && day <= 30) {
                burc = (day < 22) ? "Boga Burcu" : "İkizler Burcu";
            } else {
                isError = true;
            }
        }

        else if (month == 6) {

            if (day >= 1 && day <= 31) {
                burc = (day < 23) ? "İkizler Burcu" : "Yengec Burcu";

            } else {
                isError = true;
            }
        }

        else if (month == 7) {

            if (day >= 1 && day <= 31) {
                burc = (day < 23) ? "Yengec Burcu" : "Aslan Burcu";

            }

            else {
                isError = true;
            }
        }

        else if (month == 8) {

            if (day >= 1 && day < 31) {
                burc = (day < 23) ? "Aslan Burcu" : "Basak Burcu";

            }

            else {
                isError = true;
            }
        }

        else if (month == 9) {

            if (day >= 1 && day < 30) {
                burc = (day < 23) ? "Basak Burcu" : "Terazi Burcu";
            } else {
                isError = true;
            }
        }

        else if (month == 10) {

            if (day >= 1 && day < 31) {
                burc = (day < 23) ? "Terazi Burcu" : "Akrep Burcu";

            } else {
                isError = true;
            }
        }

        else if (month == 11) {

            if (day >= 1 && day < 31) {
                burc = (day < 23) ? "Akrep Burcu" : "Yay Burcu";
            }

            else {
                isError = true;
            }
        }

        else if (month == 12) {

            if (day >= 1 && day < 30) {
                burc = (day < 22) ? "Yay Burcu" : "Oğlak Burcu";

            } else {
                isError = true;
            }
        }

        else if (month == 1) {

            if (day >= 30 && day < 31) {
                burc = (day < 23) ? "Oğlak Burcu" : "Kova Burcu";

            } else {
                isError = true;
            }
        }

        else{
            isError = true;
        }

        if (isError) {
            System.out.println("Hatali Giris Yaptiniz ! Tekrar deneyiniz...");
        } else {
            System.out.println("Burcunuz:" + burc);
        }

    }

}
/*
 * Koç Burcu : 21 Mart - 20 Nisan
 * 
 * Boğa Burcu : 21 Nisan - 21 Mayıs
 * 
 * İkizler Burcu : 22 Mayıs - 22 Haziran
 * 
 * Yengeç Burcu : 23 Haziran - 22 Temmuz
 * 
 * Aslan Burcu : 23 Temmuz - 22 Ağustos
 * 
 * Başak Burcu : 23 Ağustos - 22 Eylül
 * 
 * Terazi Burcu : 23 Eylül - 22 Ekim
 * 
 * Akrep Burcu : 23 Ekim - 21 Kasım
 * 
 * Yay Burcu : 22 Kasım - 21 Aralık
 * 
 * Oğlak Burcu : 22 Aralık - 21 Ocak
 * 
 * Kova Burcu : 22 Ocak - 19 Şubat
 * 
 * Balık Burcu : 20 Şubat - 20 Mart
 * 
 * Ödev
 * Aynı örneği switch-case kullanmadan yapınız.
 */
