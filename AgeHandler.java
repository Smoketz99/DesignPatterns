public class AgeHandler implements Container {
    public Integer ages[] = {20, 30, 40, 50};

    @Override
    public Iterator getIterator() {
        return new AgeIterator();
    }

    private class AgeIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext(){
            if(index < ages.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return ages[index++];
            }
            return null;
        }
    }
}
