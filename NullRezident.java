public class NullRezident extends AbstractRezident {

    @Override
    public String getName(){
        return "Without residency";
    }

    @Override
    public boolean isNull(){
        return true;
    }

}
