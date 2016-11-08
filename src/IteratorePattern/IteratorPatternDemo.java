package IteratorePattern;

/**
 * Created by sethugayu on 8/15/16.
 */
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository=new NameRepository();

        for(Iterator iter= nameRepository.getIterator();iter.hasNext();){
            String name= (String)iter.next();
            System.out.println("Name: "+name);
        }
    }
}
