class Test
{
    static void decToBinary(int n) 
    {   
        int[] Num = new int[1000]; 
      int i = 0; 
        while (n > 0)  
        { 
            Num[i] = n % 2; 
            n = n / 2; 
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(Num[j]); 
    } 
    public static void main (String[] args)  
    { 
        int n = 17; 
          System.out.println("Decimal - " + n); 
        System.out.print("Binary - "); 
          decToBinary(n); 
    } 
}




