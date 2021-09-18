public class Main2{
    public static void main(String[] args){
        Employee[] em = {new SalariedEmployee(),new HourtlyEmployee()};
    
        for (int i = 0; i < 2; i++)
            System.out.println(em[i].payment());
        
        em[0].setName("Nama ");
        em[0].setAfm("Afm ");
        em[0].setSalary(0);
    }
}
