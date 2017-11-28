public class PersonDriver {

    public static void main(String [] args){

        Person driverOne = new Person("Chris", "30");
        Person driverTwo = new Person("Chris", "20");

        System.out.println("Driver 1");
        System.out.println("Name: " + driverOne.name);
        System.out.println("Age: " + driverOne.age);

        System.out.println("Driver 2");
        System.out.println("Name: " + driverTwo.name);
        System.out.println("Age: " + driverTwo.age);

        if(driverOne.getName().equals(driverTwo.getName())) {
            System.out.println("Driver 1 and Driver 2 have the same name!");
        } else {
            System.out.println("Driver 1 and Driver 2 do not have the same name!");
        }

        int age1 = Integer.parseInt(driverOne.getAge());
        int age2 = Integer.parseInt(driverTwo.getAge());

        if(driverOne.getAge().equals(driverTwo.getAge())) {
            System.out.println("Driver 1 and Driver 2 are the same age!");
        } else if (age1 > age2){
            System.out.println("Driver 1 and Driver 2 age not the same age!");
            System.out.println("Driver 1 is older than Driver 2!");
            System.out.println("Driver 2 is younger than Driver 1!");
        } else {
            System.out.println("Driver 1 and Driver 2 age not the same age!");
            System.out.println("Driver 2 is older than Driver 1!");
            System.out.println("Driver 1 is younger than Driver 2!");
        }

        if(driverOne.getName().equals(driverTwo.getName())){

            if(driverOne.getAge().equals(driverTwo.getAge())){
                System.out.println("Driver 1 and Driver 2 are equal!");
            } else {
                System.out.println("Driver 1 and Driver 2 are not equal!");
            }
        }




    }
}
