package Array_part1;

public class ThirdLargestEle {

	public static int thirdLargestEle(int[] a) {
		
		int l=0;
		int sl=-1;
		int tl=-1;
		
		for(int i =0; i<a.length; i++) {
			if(a[i]>a[l]) {
				tl = sl;
				sl = l;
				l = i;
			}else if(a[i] < a[l]) {
				if(sl == -1 || a[i]>a[sl]) {
					tl = sl;
					sl = i;
				} else if( tl == -1 || a[i]>a[tl]) {
					tl = i;
				}
			}
		}
		
		return tl;
	}
	
	public static void main(String[] args) {
		int[] a = {4,9,1,5,3,8};
		
		int index = thirdLargestEle(a);
		System.out.println(a[index]);

	}

}
