//https://www.geeksforgeeks.org/
class tailRecursion{
    static int tailRecursion(int n)
    {
        if (n == 0)
            return 1;
 
        return n * tailRecursion(n - 1);
    }
 
    public static void main(String[] args)
    {
        System.out.println(tailRecursion(5));
    }
}

