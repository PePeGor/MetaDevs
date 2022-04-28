package OOPLessons;

import java.util.ArrayList;

public class Company {
        ArrayList<Specialist> arrayOfCompany = new ArrayList<>();
        private Object Specialist;


        public Object addNewWorker (String nameOfPerson, int ageOfPerson, int salary){
                arrayOfCompany.add(new Specialist("Vasya", 31, 3000));
                System.out.println(arrayOfCompany);
                return arrayOfCompany;
        }
        public void layOffWorker (){
                arrayOfCompany.remove(Specialist);
        }
}
