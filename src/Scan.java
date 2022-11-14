import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scan {
    //object should store data from two consecutive lines of sd card:
    //tag name, id, time and date of scan
    String name;
    String id;
    String dateAndTime;
    String time;
        String hour;
        String minute;
        String second;
    String date;
        String month;
        String day;
        String year;

    String endtime;
        String endhour;
        String endminute;
        String endsecond;
    String enddate;
        String endmonth;
        String endday;
        String endyear;
    boolean readThis;

    //map of names to ids
    //TreeMap<String, String> myMap;

    //may not need isTool
    boolean isTool;

    public Scan(){
        id="00000";
        time="00:00:00";
        date="00/00/0000";
        endtime="00:00:00";
        enddate="00/00/0000";
        isTool=true;
        readThis = true;
    }

    public Scan(String fileName) throws FileNotFoundException{
        File f = new File(fileName);
        //name=null;
        id="00000";
        time="00:00:00";
        date="00/00/0000";
        endtime="00:00:00";
        enddate="00/00/0000";
        isTool=true;
        readThis = true;
        reader(f);
        //File m = new File(fileMap);
        /*myMap = new TreeMap<String, String>();
        mapper(m);*/
    }

    public void reader(File f) throws FileNotFoundException{
        Scanner scan = new Scanner("data/data.txt");
        //line should be of ID
        String myLine = scan.nextLine();
        boolean fullBreak = false;
        if(!myLine.equals("END")){
            while(myLine.length()<=5){
                myLine=scan.nextLine();
                if(myLine.equals("END")){
                    fullBreak = true;
                }
                if(fullBreak){
                    scan.close();
                    break;
                }
            }
            if(fullBreak){
                scan.close();
                return;
            }
            //goes to next ID
            while(!myLine.substring(0,10).equals("Card UID: ")){
                myLine=scan.nextLine();
            }
            id = myLine.substring(10);
            //goes to next time
            while(!myLine.substring(0,6).equals("TIME: ")){
                myLine=scan.nextLine();
            }
            //gets whole line
            String dateAndTime = myLine.substring(6);
            //splits at space to seperate date and time
            String[] splitdt = dateAndTime.split(" ");
            time = splitdt[0];
            date = splitdt[1];
            readThis = true;
        }
        scan.close();
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setID(String id){
        this.id=id;
    }

    public void setTime(String time){
        this.time = time;
        String[] timeArr = time.split(":");
        hour = timeArr[0];
        minute = timeArr[1];
        second = timeArr[2];
    }

    public String getHour(){
        return hour;
    }

    public String getMinute(){
        return minute;
    }

    public String getSecond(){
        return second;
    }

    public void setDate(String date){
        this.date = date;
        String[] dateArr = date.split("/");
        month = dateArr[0];
        day = dateArr[1];
        year = dateArr[2];
    }

    public String getMonth(){
        return month;
    }

    public String getDay(){
        return day;
    }

    public String getYear(){
        return year;
    }

    public void setEndTime(String etime){
        this.endtime = etime;
        String[] etimeArr = etime.split(":");
        endhour = etimeArr[0];
        endminute = etimeArr[1];
        endsecond = etimeArr[2];
    }

    public String getEndHour(){
        return endhour;
    }

    public String getEndMinute(){
        return endminute;
    }

    public String getEndSecond(){
        return endsecond;
    }

    public void setEndDate(String edate){
        this.enddate = edate;
        String[] edateArr = edate.split("/");
        endmonth = edateArr[0];
        endday = edateArr[1];
        endyear = edateArr[2];
    }

    public String getEndMonth(){
        return endmonth;
    }

    public String getEndDay(){
        return endday;
    }

    public String getEndYear(){
        return endyear;
    }

    public void setDateAndTime(String dateAndTime){
        this.dateAndTime = dateAndTime;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return id;
    }

    public String getTime(){
        return time;
    }

    public String getDate(){
        return date;
    }

    public void setRead(boolean b){
        readThis = b;
    }

    public boolean getRead(){
        return readThis;
    }

    public String toString(){
        String output = new String();
        output=name+"\n"
            +id+"\n"
            +hour+":"+minute+":"+second+"\n"
            +month+"/"+day+"/"+year+"\n"
            +endtime+"\n"
            +enddate;
        return output;
    }
}
