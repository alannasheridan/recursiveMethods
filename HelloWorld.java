class HelloWorld {
    
    public static void print_n (int n){ 
        if ( n < 0) 
            return; // this is how you get out of the method 
        else
            print_n(n-1); 
            System.out.print( n +"");
    }
    
    public static int array_sum(int[] a, int n){
        if (n == 0)
            return a[0];
        else
            return a[n] + array_sum(a, n-1);

    }
    
    public static String reverse(String str){
        if (str.length() == 0)
            return str;
        else
            return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }
    
    public static int bunnyEars(int bunnies){
        if (bunnies == 0)
            return bunnies;
        else
            return 2 + bunnyEars(bunnies-1);
        
    }
    
    public static void main(String[] args){
        
    //HelloWorld.print_n(3);
    int[] a = {1,2,3,4};
    System.out.println(HelloWorld.array_sum(a, 3));
    System.out.println(HelloWorld.reverse("cow"));
    System.out.println(HelloWorld.bunnyEars(12));
    }
}
