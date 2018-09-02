package outerinner;

public class OuterDemo {
	
	int num;

    public static class InnerDemo{
        public void showmessage(){

            System.out.println("Let me show the Cricinfo");
        }
    }
    public static class InnerDemo2 {
        public void print (){

            System.out.println("Please print the page");
        }
    }

    public static void main(String[] args) {
        OuterDemo.InnerDemo id = new OuterDemo.InnerDemo();
        id.showmessage();
        OuterDemo.InnerDemo2 id2 = new OuterDemo.InnerDemo2();
        id2.print();
    }

}
