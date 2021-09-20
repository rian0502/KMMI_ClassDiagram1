# KMMI_ClassDiagram1
Tugas KMMI PBO tentang kelas Diagram
- Muhammad Febrian Hasibuan 2017051033
- Alif Akbar Kartadinata 2017051049
- Miftahul Huda Guntara 2015061038

code diagram

classDiagram
-    Employee <|--SalariedEmployee
-    Employee <|--HourlyEmployee
-    class Employee{
-        <<abstract>>
-        #String name
-        #String afm
-        +Employee(String name,String afm)
-        +setName(String name) 
-        +setAfm(String afm)   
-        +getName() : String
-        +getAfm()  : String
-        +abstract payment()
-    }
-    class SalariedEmployee{
-        -int salary
-        +SalariedEmployee(String name,String afm,int salary)
-        +setSalary(int salary)
-        +getSalary() : int 
-        +payment() : int
-    }
-  class HourlyEmployee{
-       -int hourlyWorked
-       -int hourlyPayment
-       +HourlyEmployee(String name,String afm,int hourlyWorked,nt hourlyPayment)
-       +setHourlyWorked(int hourlyWorked)
-       +setHourlyPayment(int hourlyPayment)
-       +getHourlyWorked()  : int
-       +getHourlyPayment() : int
-       +payment() : int
-   }
  
![image](https://user-images.githubusercontent.com/83405871/133996449-67bd18cd-c04e-4cc9-8e57-f5dc47d50b72.png)
