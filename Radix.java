public class Radix {

    static int arr[]={1,124,111,315,9,5,4};
    public static void countsort(int[] output)
    {
        int result[]=new int[arr.length];

        // 

        // for(int i=0;i<output.length;i++)
        // {
            
        //     System.out.print(" "+output[i]);
            
        // }
        

        int count[]=new int[10];
        count[0]=0;
        for(int i=0;i<output.length;i++)
        {
            
            count[output[i]]+=1;
            
        }

        for(int i=1;i<count.length;i++)
        {
            
            count[i]=count[i-1]+count[i];
            
        }
        System.out.println();

        for(int i=arr.length-1;i>=0;i--)
        {
                count[output[i]]=count[output[i]]-1;
                result[count[output[i]]]=arr[i];               
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+result[i]);
        }
        System.out.println();

        // 

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=result[i];
        }
        
    }


    // radix function

    static void  radix()
    {
        
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        String maxl= Integer.toString(max);
        int lenmax=maxl.length();

        int i=0;
        int dup=0;
        int divisor=1;
        while (i<lenmax) {
            int output[]=new int[arr.length];
            
            for(int j=0;j<arr.length;j++)
            {
                dup=arr[j]/divisor;
                output[j]=dup%10;
                
            }


            // System.out.println("inside radix");
            // for(int j=0;j<output.length;j++)
            // {
            //     System.out.println(" "+output[j]);
            // }

            System.out.print("pass: "+(i+1)+" result");
            countsort(output);
            System.out.println();
            divisor=divisor*10;
            i++;

        }
        System.out.println("After Sorting:");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(" "+arr[k]);
        }
    }
    public static void main(String[] args)
    {
        radix();
    }
}



// finally 