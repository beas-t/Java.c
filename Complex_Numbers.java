public class Complex_Numbers {
    int real, image;
    public Complex_Numbers(int r, int i){
        this.real=r;
        this.image=i;
    }
    public void showC(){
        System.out.print("("+this.real+"+"+this.image+"i"+")");
    }
    public static Complex_Numbers add(Complex_Numbers n1,Complex_Numbers n2){
        Complex_Numbers res=new Complex_Numbers(0,0);
        res.real=n1.real+n2.real;
        res.image=n1.image+n2.image;
        return res;
    }
    public static void main(String[] args) {
        Complex_Numbers c1=new Complex_Numbers(5,4);
        Complex_Numbers c2=new Complex_Numbers(5,5);
        System.out.println("First Complex number:");
        c1.showC();
        System.out.println("\nSum of the Complex Number:" );
        c2.showC();
        Complex_Numbers result=add(c1,c2);
        System.out.println("\n Sum of the two complex numbers:");
        result.showC();



    }
}
