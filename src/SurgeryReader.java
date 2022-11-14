import java.io.FileNotFoundException;
import java.util.*;

public class SurgeryReader {
    ArrayList<Scan> myScans;

    public static void main(String[] args) throws FileNotFoundException{
        //@author Harrison York
        //Intro to device use and credits
            /*System.out.println("SURGERY 1 DEVICE DRIVER");
            System.out.println("");
            System.out.println("DESIGN TEAM:");
            System.out.println("Jaden Coward");
            System.out.println("Vidal de Paz Benito");
            System.out.println("Luke Villalpando");
            System.out.println("Harrison York");
            System.out.println("");
            System.out.println("DUKE UNIVERSITY");
            System.out.println("EGR 101 - FALL 2022");
            System.out.println();*/
        
        //FILE OF NAMES AND TOOL IDS
        String filename = "data/mapper.txt";
            MapperReader myMapper = new MapperReader(filename);
            //uses myMapper to get list of tag names and IDs
            TreeMap<String, String> myTree = myMapper.getMap();

        //FILE OF DATA
        filename = "data/data.txt";
            DataReader myData = new DataReader(filename, myTree);
            //each element is one tag name and corresponding ID
            /*ArrayList<String> idsFromInput = new ArrayList<String>();
            idsFromInput = myData.getFormatted();*/

            /*System.out.println("-----");
            System.out.println("SCAN LOG:");
            for(String str: idsFromInput){
                System.out.println(str);
            }*/

            ArrayList<Scan> myScans = myData.getScans();
            ArrayList<Scan> output = new ArrayList<Scan>();
            //searches for the next scan of same tool and sets end point
            for(int i=0;i<myScans.size();i++){
                Scan scI = myScans.get(i);
                for(int j=i+1;j<myScans.size();j++){
                    Scan scJ = myScans.get(j);
                    if((scI.getID().equals(scJ.getID()))&&scJ.getRead()==true&&scI.getRead()==true){
                        scI.setEndDate(scJ.getDate());
                        scI.setEndTime(scJ.getTime());
                        scJ.setRead(false);
                        output.add(scI);
                        j=myScans.size()-1;
                    }
                    
                }
            }
            myScans=output;
            int counter=0;
            for(Scan sc: myScans){
                if(sc.getRead()==true){
                    //System.out.println(sc);
                    if(counter==myScans.size()-1){
                        System.out.println("{\nid: "+sc.getID()+",\n"+
                        "start: new Date("+sc.getYear()+", "+sc.getMonth()+"-1, "+sc.getDay()+", "+sc.getHour()+", "+Integer.parseInt(sc.getMinute())+", "+sc.getSecond()+"),\n"+
                        "end: new Date("+sc.getEndYear()+", "+sc.getEndMonth()+", "+sc.getEndDay()+", "+sc.getEndHour()+", "+sc.getEndMinute()+", "+sc.getEndSecond()+"),\n"+
                        "name: \""+sc.getName()+"\"\n"+"}"
                        );
                    }
                    else{
                        System.out.println("{\nid: "+sc.getID()+",\n"+
                        "start: new Date("+sc.getYear()+", "+sc.getMonth()+"-1, "+sc.getDay()+", "+sc.getHour()+", "+Integer.parseInt(sc.getMinute())+", "+sc.getSecond()+"),\n"+
                        "end: new Date("+sc.getEndYear()+", "+sc.getEndMonth()+", "+sc.getEndDay()+", "+sc.getEndHour()+", "+sc.getEndMinute()+", "+sc.getEndSecond()+"),\n"+
                        "name: \""+sc.getName()+"\"\n"+"},"
                        );
                    }
                    
                }
                counter++;
            }
    }

    public ArrayList<Scan> getScans(){
        return myScans;
    }    
    
}
