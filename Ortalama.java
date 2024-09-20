import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        double matematik, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        //KULLANICIDAN DEĞERLERİ ALIYORUZ

        System.out.print("MATEMATİK NOTUNU GİRİNİZ:");
        matematik = inp.nextDouble();
        System.out.print("FİZİK NOTUNU GİRİNİZ:");
        fizik = inp.nextDouble();
        System.out.print("türkçe notunu giriniz:");
        turkce = inp.nextDouble();
        System.out.print("KİMYA NOTUNU GİRİNİZ");
        kimya = inp.nextDouble();
        System.out.print("MÜZİK NOTUNU GİRİNİZ");
        muzik = inp.nextDouble();

        //ORTALAMAYI HESAPLIYORUZ
        double toplam = (matematik + fizik + turkce + kimya + muzik) / 5;

        //KOŞULLARI SAĞLATIYORUZ
        if (toplam<55){
            System.out.print("MALESEF SINIFTA KALDINIZ");
        }

        else {

            System.out.println("TEBRİKLER SINIFI GEÇTİNİZ");




        }
        System.out.println("ORTALAMANIZ:"+toplam);





        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;

        } else {
            System.out.println("Matematik notu geçersiz.");
        }

        // Fizik notu kontrolü
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;

        } else {
            System.out.println("Fizik notu geçersiz.");
        }

        // Türkçe notu kontrolü
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;

        } else {
            System.out.println("Türkçe notu geçersiz.");
        }

        // Kimya notu kontrolü
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;

        } else {
            System.out.println("Kimya notu geçersiz.");
        }

        // Müzik notu kontrolü
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;

        } else {
            System.out.println("Müzik notu geçersiz.");
        }








    }

}
   