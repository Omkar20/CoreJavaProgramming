package ArrayPkg;

public class FrequencyOfEachNoinArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,20,30,30,40,40,40};
		
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int count=0;
			
			if(x==0)continue;
			
			for(int j=0;j<arr.length;j++) {
				
				if(x==arr[j]) {
					count++;
					arr[j]=0;
				}
			}
			
			System.out.println(x+"- "+count);
		}

	}

}
