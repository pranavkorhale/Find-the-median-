
public class Main
{
	public static void main(String[] args) {
	    int arr[][] = {{1,3,6},{2,6,9},{3,6,9}};
	    int r = arr.length;
	    int c = arr[0].length;
	    
	    System.out.println("the median is : "+findMedian(arr,r,c));
	    
	}
	
	public static int findCount(int[]arr,int mid,int c)
	{
	    int sum = 0;
	    for(int j=c-1;j>=0;j--)
	    {
	        if(arr[j]<=mid)
	        {
	            return (j-0+1);
	        }
	    }
	    return 0;
	    
	}
	
	public static int findMedian(int[][]arr,int r,int c)
	{
	    int low = 0;
	    int high = 9;
	    int desired = (r*c)/2;
	    while(low<=high)
	    {
	        int mid = (low+high)/2;
	        int sum = 0;
	        for(int i=0;i<r;i++)
	        {
	           sum = sum+findCount(arr[i],mid,c);
	        }
	         if(sum<=desired)
            {
                low =mid+1;
            }else{
                high= mid-1;
            }
	    }
	    return low;
	}
}
