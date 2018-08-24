class paternn { paternn() {}
  
  public static void main(String... paramVarArgs) { int j = 0;int k = 4;
    for (int m = 1; m <= k; m++)
    {
      int i;
      
      if (m % 2 != 0)
      {
        for (i = j + 1; i < j + m; i++)
          System.out.print(i + " ");
        System.out.println(i++);
        j = i;
      }
      else
      {
        j = j + m - 1;
        
        for (i = j; i > j - m + 1; i--)
          System.out.print(i + " ");
        System.out.println(i);
      }
    }
  }
}