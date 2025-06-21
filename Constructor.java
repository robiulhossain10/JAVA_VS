public class Constructor {
    public static void main(String[] args) {
        Constructor std1 = new Constructor();
        Constructor std2 = new Constructor();
        
        total(26);
    }
    
    public Constructor(){
    
        System.out.println("This is a Constructor");
  }
    
    public static void sysPrint(){
        System.out.println("This is Instance Method");
    }
    
      public static int total(int age){
        System.out.println("This is Return Method " + age);
        return 0;
    }
      
      public static void staticmethod(){
        System.out.println("This is Static Method");
    }
      
        public static void methodparam(String name){
        System.out.println("This is Method With Parameters");
    }
        
            public static void methodparamoverload(String name, int age){
        System.out.println("This is Method With Parameters" + name+ age);
    }
            
                    public static void methodparamoverload(int age, String name){
        System.out.println("This is Method With Parameters" + age+ name);
    }
}
