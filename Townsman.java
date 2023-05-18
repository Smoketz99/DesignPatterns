public class Townsman extends AbstractRezident {

    public Townsman(String name){
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
