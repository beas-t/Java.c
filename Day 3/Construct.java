public class Construct {
    int a=5;
    int b=9;
    Construct(int a,int b){
        a=5;
        b=9;
    }
    void add(int a,int b){
        a=1;
        b=2;

        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Construct s=new Construct(5,6);
        s.add(2,4);
    }
}
