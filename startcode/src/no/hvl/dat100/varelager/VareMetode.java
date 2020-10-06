package no.hvl.dat100.varelager;

public class VareMetode {

	public static void main(String[] args) {
		Vare T1=new Vare(1, "ostepops", 200.0);
		System.out.println(T1.toString());
		System.out.println("\n");
		
		Vare T2=new Vare();
		System.out.println(T2.toString());
		int a=5;
		
		Varelager S1=new Varelager(a);
		skriveUtTab(S1.varer);
		skriveUtTab(S1.getVarer());
		
		Vare v=new Vare(10, "caroot" , 30);
		System.out.println(S1.leggTilVare(v));
		skriveUtTab(S1.varer);
		Vare w=new Vare(11, "bananas" , 50);
		System.out.println(S1.leggTilVare(w));
		skriveUtTab(S1.varer);
		Vare x=new Vare(12, "apples" , 80);
		System.out.println(S1.leggTilVare(x));
		skriveUtTab(S1.varer);
		Vare y=new Vare(13, "orange" , 120);
		System.out.println(S1.leggTilVare(y));
		skriveUtTab(S1.varer);
		
		S1.leggTil(14, "druer", 170);
		skriveUtTab(S1.varer);
		
		S1.finnVare(10);
		System.out.println(S1.finnVare(14));
		
		S1.printVarelager();
		
		System.out.println(x.erBilligereEnn(y));
		
		VarelagerUtils S2=new VarelagerUtils();
		Vare zVarer=S2.finnBilligste(S1.varer);
		System.out.println(zVarer.toString());
		
		double totalVarer=S2.totalPris(S1.varer);
		System.out.println(totalVarer);
		
		int [] varerTabelen=S2.finnVarenr(S1.varer);
		skriveUtTabInt(varerTabelen);
		
		double [] diffPriservarer=S2.finnPrisDifferanser(S1.varer);
		skriveUtTabDouble(diffPriservarer);
		
	}
	
	public static void skriveUtTab(Vare[] tab) {
		System.out.print("[");
		for (int i=0; i<tab.length;i++) {
			if(i<tab.length-1) {
				System.out.print(tab[i]+ ",\t");	
			}else 
				{System.out.print(tab[i]+ "");
			}
		}System.out.print("]");
		System.out.println("\n");
	}

	public static void skriveUtTabInt(int[] tab) {
		System.out.print("[");
		for (int i=0; i<tab.length;i++) {
			if(i<tab.length-1) {
				System.out.print(tab[i]+ ",\t");	
			}else 
				{System.out.print(tab[i]+ "");
			}
		}System.out.print("]");
		System.out.println("\n");
	}
	
	public static void skriveUtTabDouble(double[] tab) {
		System.out.print("[");
		for (int i=0; i<tab.length;i++) {
			if(i<tab.length-1) {
				System.out.print(tab[i]+ ",\t");	
			}else 
				{System.out.print(tab[i]+ "");
			}
		}System.out.print("]");
		System.out.println("\n");
	}
	
}
