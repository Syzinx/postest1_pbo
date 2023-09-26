/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import com.mycompany.posttest1.Person;
import java.util.ArrayList;

/**
 *
 * @author fx506
 */
public class Posttest1 {

    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        Person person1 = new Person("Chandra Perdana Phang", 20, "Jl. Perjuangan", "chandraperdana@gmail.com");
        Person person2 = new Person("Abdulah Dian", 22, "Jl. Pramuka", "diangagah@gmail.com");
        Person person3 = new Person("Irfan Anggoro Rachmadi", 19, "Jl. Loabakung", "irfan.30l@gmail.com");
        Person person4 = new Person("Abdul Saputra Jaya", 16, "Jl. Loajanan", "abdulsaputra@gmail.com");
        Person person5 = new Person("Muhammad Rahman Maulana", 20, "Jl. Juanda 4", "rahmaulana@gmail.com");
        
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        
        for (Person person : persons){
            String name = "Saya " + person.name;
            String age = " memiliki umur " + person.age;
            String address = " dan tinggal di " + person.address;
            String email = ". Hubungi saya di " + person.email;
            System.out.println(name.concat(age + address + email));
        }
    }
}
