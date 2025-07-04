class Test{
    void printThis() {
        System.out.println(this);
    }
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t);
        // System.out.println(this);// This line will cause a compilation error because 'this' cannot be used in a static context. so we create an non-static method to print 'this'.
        t.printThis();
    }
}