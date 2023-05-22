
public class Selection_Sort {

	public static void Selection_Sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) {
			int minpos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minpos]>arr[j])
				{
					minpos=j;
				}
			}
			int temp=arr[minpos];
			arr[minpos]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,5,2,1,4};
		 Selection_Sort(arr);

}
}
