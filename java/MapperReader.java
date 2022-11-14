import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MapperReader {
    private TreeMap<String, String> myMap;
    private ArrayList<String> keyList;
    private ArrayList<String> nameList;
    
    public MapperReader(String fName) throws FileNotFoundException{
        File f = new File(fName);
        myMap = new TreeMap<String, String>();
        keyList = new ArrayList<String>();
        nameList = new ArrayList<String>();
        mapper(f);
    }

    public void mapper(File fileText) throws FileNotFoundException{
        Scanner scan = new Scanner(fileText);
        TreeMap<String, String> output = new TreeMap<String, String>();
        String myLine = scan.nextLine();
        while(!myLine.equals("END")){
            if(myLine.equals("END")){
                scan.close();
                break;
            }
            String uid = myLine.substring(0,5);
            if(!output.containsKey(uid)){
                //uid is substring 0, 11, 11 to end is the name
                output.put(uid, myLine.substring(6));
                keyList.add(uid);
                nameList.add(myLine.substring(6));
            }
            myLine = scan.nextLine();
        }
        myMap = output;
    }

    public TreeMap<String, String> getMap(){
        return myMap;
    }

    public ArrayList<String> getKeys(){
        return keyList;
    }

    public ArrayList<String> getNames(){
        return nameList;
    }
}
