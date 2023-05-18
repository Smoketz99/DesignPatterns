public class IteratorPattern {

    public static void main(String[] args) {
        AgeHandler ageHandler = new AgeHandler();

        for(Iterator iterator = ageHandler.getIterator(); iterator.hasNext();){
            Integer age = (Integer)iterator.next();
            System.out.println("Age: "+ age);
        }
    }
}
