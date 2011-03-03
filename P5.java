public class P5 {
	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i <= 20; ++i) {
			if(a%i==0) continue;
			else {
				int j;
				for(j = i-1;j>1;--j) {
					if((i%j==0)&&(a%j==0)) {
						a = a*i/j;
						break;
					}
				}
				if(j==1) a *=i;
			}
		}
		System.out.println(a);
	}

}