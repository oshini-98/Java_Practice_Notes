public class Array {

    public static void main(String[] args) {
        // int nums[][] = new int[3][4];

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        // for(int n[] :  nums)
        // {
        //     for(int m: n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }



        int nums1[][] = new int[3][]; // jagged
    
        nums1[0] = new int[3];
        nums1[1] = new int[4];
        nums1[2] = new int[2];

        for(int i=0; i<nums1.length; i++)
        {
            for(int j=0; j<nums1[i].length; j++)
            {
                System.out.print(nums1[i][j]+ " ");
            }
            System.out.println();
        }

        for(int n[]: nums1)
        {
            for(int m: n)
            {
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }

}