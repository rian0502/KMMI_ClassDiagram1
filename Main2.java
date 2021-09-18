public class Main2{
    public static void main(String[] args){
        Employee[] em = {new SalariedEmployee("nama", "afm", 2000),new HourtlyEmployee("nama", "afm", 2000, 2000)};
    
        for (int i = 0; i < 2; i++)
            System.out.println(em[i].payment());
        
    }
}
