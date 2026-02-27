// write a java program to find the largest number among three
class largest_number{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5000;
        int largest;
        if (a>=b && a>=c){
        largest = a;
        }
        else if (b>=a && b>=c){
            largest = b;
        }
        else {
         largest = c ;
        }
        System.out.println("The largest Number is " + largest);
    }
}