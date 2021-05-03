class BitwiseOperator{
public static void main(String[] args){

int p = 100;
int q = 200;
int r = 300;

System.out.println(p>q & ++p<r);
System.out.println("p:"+p);
System.out.println(p<q | p>r++);
System.out.println("r:"+r);
System.out.println(p>r | ++q<r);
System.out.println("q:"+q);
}
}