package workPractice;

public class Main {
    public static void  main(String[] arg){
        Human human = new Human("Saad" ,"Khan" , 25.9 , 1201012324);
        human.getHumanInfo();

        Parent parent = new Parent("Asfar" , "Khan" , 44 , 131012122 , "Shujahat Khan");
        parent.getParentDetails();

        Child child = new Child("Hamza" , "Ahmed" , 19 , 1310121221 , "fahad");
        child.getHumanInfo();

    }

}
