public class InnerClasses {
    static class Inner{
        public int no = 5;
    }

    class InnerNormal{
        public int no = 10;
    }
    public static void main(String[] args) {
        Inner i = new Inner();
        System.out.println(i.no);
        InnerClasses x = new InnerClasses();
        InnerClasses.InnerNormal i2 =  x.new InnerNormal();
        System.out.println(i2.no);
    }
}
