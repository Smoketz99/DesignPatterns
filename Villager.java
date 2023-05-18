public class Villager extends AbstractRezident{

    public Villager(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean isNull(){
        return false;
    }

}
