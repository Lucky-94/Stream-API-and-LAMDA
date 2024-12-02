public class Person {

        String name;
        int age;
        Person(String name, int age) { this.name = name; this.age = age; }

        public String getName(){return this.name;}
        public int getAge(){return this.age;}
        public String toString(){
                return "Person[name: " + name + ", " +  "Age: " + age + "]";
        }

}
