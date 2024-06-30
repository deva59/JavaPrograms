class oops{


    String name;
    int age;


    public void printInfo(String name){
        System.out.println(name);
    }


    public void printInfo(int age){
        System.out.println(age);
    }


    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

    class kk{
        public static void main(String[] args) {
            oops o1 = new oops();
            o1.name="deva";
            o1.age=22;
            o1.printInfo(o1.name ,o1.age);
        }
    }
