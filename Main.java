
class A{
	int i;
	A(int i){
		this.i = i;
	}
  A(){
    this.i = 100;
  }
	public void setI(int I){
    this.i = i;
  }
  public String toString(){
    return "A i=" + i;
  }
}

class Main {
  public static void main(String[] args) {
A a = new A();
  System.out.println(a);

A b = a;
System.out.println(b);
    b.setI(50);
    System.out.println(a);
    }
}