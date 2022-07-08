class Strings {
    String str1 = "Java";
    String str2 = "Training";

    void operation(){
        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        System.out.println("Length Of str1: "+str1.length()+" Length Of str2: "+str2.length());
        System.out.println("Concatenation Of Two Strings: "+str1.concat(str2));

        System.out.println("===StringBuffer Operation===");
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Append : "+sb.append("Java"));
        System.out.println("Replace : "+sb.replace(6,10,"Vivek"));
        System.out.println("Insert : "+sb.insert(6,"TEST"));
        System.out.println("Delete : "+sb.delete(6,10));

        System.out.println("===StringBuilder Operation===");
        StringBuilder sb1 = new StringBuilder("Hello ");
        System.out.println("Append : "+sb1.append("Java"));
        System.out.println("Replace : "+sb1.replace(6,10,"Vivek"));
        System.out.println("Insert : "+sb1.insert(6,"TEST"));
        System.out.println("Delete : "+sb1.delete(6,10));
    }

    public static void main(String[] args){
        Strings s = new Strings();
        s.operation();
    }
}
