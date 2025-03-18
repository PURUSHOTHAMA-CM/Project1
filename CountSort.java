public class CountSort {

    public static void main(String[] args)
    {
        int input[]={3,1,3,2,1,4,6,4,3};

        int max=input[0];

        for(int i=1;i<input.length;i++)
        {
            if(input[i]>max)
            {
                max=input[i];
            }
        }
        
        System.out.println(max);
        int count[]=new int[max+1];
        count[0]=0;
        for(int i=0;i<input.length;i++)
        {
            count[input[i]]+=1;
        }
        

        for(int i=1;i<count.length;i++)
        {
            
            count[i]=count[i-1]+count[i];
            System.out.print(" "+count[i]);
        }
        System.out.println();

        int output[]=new int[input.length];
        for(int i=input.length-1;i>=0;i--)
        {
                count[input[i]]=count[input[i]]-1;
                output[count[input[i]]]=input[i];               
        }
        for(int i=0;i<output.length;i++)
        {
            System.out.print(" "+output[i]);
        }
        System.out.println();
    }
}