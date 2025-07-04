class Test{
    void printThis() {
        System.out.println(this);
    }
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t);
        // System.out.println(this);// This line will cause a compilation error because 'this' cannot be used in a static context. so we create an non-static method to print 'this'.
        t.printThis();
        // this = new Test();
        // The above line will cause a compilation error because 'this' is a reserved keyword in Java and cannot be assigned a new value.
        // However, we can use 'this' to refer to the current instance of the class.
        // The 'this' keyword is used to refer to the current object in a non-static context.
        // In a static context, 'this' cannot be used because there is no instance of the class associated with it.
        
    }
}