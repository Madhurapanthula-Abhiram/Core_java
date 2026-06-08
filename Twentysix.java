class Twentysix{
static void m1(){
System.out.println("This is m1");

new Twentysix().m3();
}
static void m2(){
System.out.println("This is m2");
new Twentysix().m4();
}
void m3(){
System.out.println("This is m3");

}
void m4(){
System.out.println("This is m4");

}
public static void main(String[] args){
System.out.println("This is main");
m1();
m2();
}
}