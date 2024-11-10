package homework;
import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Mat notunuz:");
		mat = inp.nextInt();
		
		System.out.print("Fizik notunuz:");
		fizik = inp.nextInt();
		
		System.out.print("Türkçe notunuz:");
		turkce = inp.nextInt();
		
		System.out.print("Kimya notunuz:");
		kimya = inp.nextInt();
		
		System.out.print("Tarih notunuz:");
		tarih = inp.nextInt();
		
		System.out.print("Müzik notunuz:");
		muzik = inp.nextInt();
		
		
        int toplam = (mat + fizik + turkce + kimya + muzik + tarih );
        double sonuc = (toplam / 6.0 );
        
        System.out.print("ortalama: " + sonuc);
        
        
	}

}
