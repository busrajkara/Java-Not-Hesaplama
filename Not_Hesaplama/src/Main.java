import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Turk_Dili_ve_Edebiyati, Matematik, Fizik, Kimya, Biyoloji, Tarih, Cografya, Felsefe, Sosyoloji, Psikoloji, Din_Kulturu_ve_Ahlak_Bilgisi, Gorsel_Sanatlar, Muzik, Beden_Egitimi_ve_Spor, Bilisim_Teknolojileri, Saglik_Bilgisi, Ingilizce, Almanca, Fransizca, Ispanyolca, sonuc;

        System.out.print("Turk_Dili_ve_Edebiyati NOTUNUZ : ");
        Turk_Dili_ve_Edebiyati = input.nextInt();

        System.out.print("Matematik NOTUNUZ : ");
        Matematik = input.nextInt();

        System.out.print("Fizik NOTUNUZ : ");
        Fizik = input.nextInt();

        System.out.print("Kimya NOTUNUZ : ");
        Kimya = input.nextInt();

        System.out.print("Biyoloji NOTUNUZ : ");
        Biyoloji = input.nextInt();

        System.out.print("Tarih NOTUNUZ : ");
        Tarih = input.nextInt();

        System.out.print("Cografya NOTUNUZ : ");
        Cografya = input.nextInt();

        System.out.print("Felsefe NOTUNUZ : ");
        Felsefe = input.nextInt();

        System.out.print("Sosyoloji NOTUNUZ : ");
        Sosyoloji = input.nextInt();

        System.out.print("Psikoloji NOTUNUZ : ");
        Psikoloji = input.nextInt();

        System.out.print("Din_Kulturu_ve_Ahlak_Bilgisi NOTUNUZ : ");
        Din_Kulturu_ve_Ahlak_Bilgisi = input.nextInt();

        System.out.print("Gorsel_Sanatlar NOTUNUZ : ");
        Gorsel_Sanatlar = input.nextInt();

        System.out.print("Muzik NOTUNUZ : ");
        Muzik = input.nextInt();

        System.out.print("Beden_Egitimi_ve_Spor NOTUNUZ : ");
        Beden_Egitimi_ve_Spor = input.nextInt();

        System.out.print("Bilisim_Teknolojileri NOTUNUZ : ");
        Bilisim_Teknolojileri = input.nextInt();

        System.out.print("Saglik_Bilgisi NOTUNUZ : ");
        Saglik_Bilgisi = input.nextInt();

        System.out.print("Ingilizce NOTUNUZ : ");
        Ingilizce = input.nextInt();

        System.out.print("Almanca NOTUNUZ : ");
        Almanca = input.nextInt();

        System.out.print("Fransizca NOTUNUZ : ");
        Fransizca = input.nextInt();

        System.out.print("Ispanyolca NOTUNUZ : ");
        Ispanyolca = input.nextInt();

        sonuc = (Turk_Dili_ve_Edebiyati + Matematik + Fizik + Kimya + Biyoloji + Tarih + Cografya + Felsefe + Sosyoloji + Psikoloji + Din_Kulturu_ve_Ahlak_Bilgisi + Gorsel_Sanatlar + Muzik + Beden_Egitimi_ve_Spor + Bilisim_Teknolojileri + Saglik_Bilgisi + Ingilizce + Almanca + Fransizca + Ispanyolca) / 21;

        System.out.println("Derslerin Ortalama Notu: " + sonuc);
    }
}
