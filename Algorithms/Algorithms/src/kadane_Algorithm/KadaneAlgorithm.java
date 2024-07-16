package kadane_Algorithm;

public class KadaneAlgorithm {
	
	public static void sumaRecoore (int [] a) {
		int[]sumaArr = new int[a.length];
		int sumaMax = 0;
		int sumai =  a[0];
		for(int i = 0 ; i<a.length; i++) {
			sumaArr[i] = sumai;
			if (i+1< a.length) {
				sumai = sumai + a[i+1];
			}else if(i+1 == a.length) {
				int[] b = new int [a.length-1];
				for(int m : a) {
					if(m == a[0]) {
						continue;
					}else {
						for(int n = 0 ; n< b.length;n++) {
							b[n] = m;
						}
					}
				}
				
				for(int n : b) {
					System.out.println(n);
				}
			}	
			if(sumai>sumaMax) {
				sumaMax = sumai;
			}
		}
		
		System.out.println(sumaMax);
		
	}
	
	public static void kadane() {
		
		int[] a = {-10,2,-3,10,-7,12,5,7};
		
		int[]sumaArr = new int[a.length];
		int sumaMax = 0;
		int sumai =  a[0];
		
		for(int i = 0 ; i<a.length; i++) {
			sumaArr[i] = sumai;
			if (i+1< a.length) {
				sumai = sumai + a[i+1];
			}else if(i+1 == a.length) {
		
				a[0] = 0;
			}	
			if(sumai>sumaMax) {
				sumaMax = sumai;
			}
		}
		
		
		
		for(int i : sumaArr) {
			System.out.println(i);
		}
		
		System.out.println("la suma maxima es : " + sumaMax);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		kadane();
		
		System.out.println("-----------------------");
		int[] a = {-10,2,-3,10,-7,12,5,7};
		
		sumaRecoore(a);
		
		
		
		
	}
}
