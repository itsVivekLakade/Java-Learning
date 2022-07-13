class person {
    protected String name, address;
    person() {
        name = "Vivek";
        address = "Maharastra";
    }
}

class student extends person{
    public String studName, studAddress;
    student(){
        super();
        studName = "Akshay";
        studAddress = "Karnataka";
    }
    void print_data(String name, String address){
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
    }

}

class temp{
    public static void main(String[] args) {
        student s1 = new student();

        s1.print_data(s1.studName,s1.studAddress);
        s1.print_data(s1.name,s1.address);
    }
}