package Doublyquiz2;

import java.io.*;
import java.util.Scanner;

public class passengerFunctions {
    Scanner input=new Scanner(System.in);
    private Scanner b;
    Passenger headPassenger;
    Passenger tailPassenger;
    /*public void insertPassengerInFile(String fname,String lname,int age,String cnic,String flightNo,int tripNo,String depCity,String arrCity,int depTime,int arrTime,String seatNo) throws FileNotFoundException, IOException {
        File file=new File("Passengers.txt");
        FileWriter filewriter=new FileWriter(file,true);
        BufferedWriter buffer=new BufferedWriter(filewriter);
        PrintWriter printInFile=new PrintWriter(buffer);
        b=new Scanner(new File("Passengers.txt"));
        printInFile.print(lname+",");
        printInFile.print(fname+",");
        printInFile.print(age+",");
        printInFile.print(cnic+",");
        printInFile.print(flightNo+",");
        printInFile.print(tripNo+",");
        printInFile.print(depCity+",");
        printInFile.print(arrCity+",");
        printInFile.print(depTime+",");
        printInFile.print(arrTime+",");
        printInFile.print(seatNo+"\n");
    }
    */
    public void getPassengersFromFile() throws FileNotFoundException {

        b=new Scanner(new File("Passengers1.txt"));
        b.useDelimiter("[,\n]");
        while (b.hasNext()) {
            System.out.println("Passenger Name: " + b.next() + " " + b.next());
            System.out.println("Age: " + b.next());
            System.out.println("Cnic: " + b.next());
            System.out.println("Flight Number: " + b.next());

        }
    }
  /*  public void insertPassengerAtHead(String fname,String lname,int age,String cnic,String flightNo,int tripNo,String depCity,String arrCity,int depTime,int arrTime,String seatNo){
        Passenger node=new Passenger();
        node.fname=fname;
        node.lname=lname;
        node.age=age;
        node.cnic=cnic;
        node.flightNo=flightNo;
        node.tripNo=tripNo;
        node.depCity=depCity;
        node.arrCity=arrCity;
        node.depTime=depTime;
        node.arrTime=arrTime;
        node.seatNo=seatNo;
        node.nextPassenger=null;
        node.prevPassenger=null;
        if(headPassenger==null){
            headPassenger=node;
        }
        else {
            headPassenger.prevPassenger=node;
            node.nextPassenger=headPassenger;
            headPassenger=node;
        }
        System.out.println("\nPassenger Data successfulyy inserted at Head.");
    }*/
    public void insertPassengerAtTail(String fname,String lname,int age,String cnic,String flightNo,int tripNo,String depCity,String arrCity,int depTime,int arrTime,String seatNo){
        Passenger node=new Passenger();
        node.nextPassenger=null;
        node.prevPassenger=null;
        node.fname=fname;
        node.lname=lname;
        node.age=age;
        node.cnic=cnic;
        node.flightNo=flightNo;
        node.tripNo=tripNo;
        node.depCity=depCity;
        node.arrCity=arrCity;
        node.depTime=depTime;
        node.arrTime=arrTime;
        node.seatNo=seatNo;
        if(headPassenger==null){
            headPassenger=tailPassenger=node;
        }
        else {
            Passenger current=headPassenger;
            while(current.nextPassenger!=null){
                current=current.nextPassenger;
            }
            node.prevPassenger=current;
            current.nextPassenger=node;
            tailPassenger=node;
        }
        System.out.println("\nPassenger Data successfuly inserted at Tail.");
    }
    public void printPassengers(){
        System.out.println("\nList Of Passengers:\n\n\n");
        Passenger current=headPassenger;
        int i=1;
        System.out.println("\n\n"+i+"-PASSENGERS'S INFO: \n\n\n");
        System.out.println("\n\nPassenger Name: "+ current.lname+" "+current.fname);
        System.out.println("\nPassenger CNIC: "+current.cnic);
        System.out.println("\nAge: "+current.age);
        System.out.println("\n\nFLIGHT'S INFO: \n\n\n");
        System.out.println("\nFlight Number :"+current.flightNo);
        System.out.println("\nTrip Number :"+current.tripNo);
        System.out.println("\nDeparture City :"+current.depCity);
        System.out.println("\nArrival City :"+current.arrCity);
        System.out.println("\nDeparture Time :"+current.depTime);
        System.out.println("\nArrival Time :"+current.arrTime);
        while(current.nextPassenger!=null){
            i++;
            current=current.nextPassenger;
            System.out.println("\n\n"+i+"-PASSENGERS'S INFO: \n\n\n");
            System.out.println("\n\nPassenger Name: "+ current.lname+" "+current.fname);
            System.out.println("\nPassenger CNIC: "+current.cnic);
            System.out.println("\nAge: "+current.age);
            System.out.println("\n\nFLIGHT'S INFO: \n\n\n");
            System.out.println("\nFlight Number :"+current.flightNo);
            System.out.println("\nTrip Number :"+current.tripNo);
            System.out.println("\nDeparture City :"+current.depCity);
            System.out.println("\nArrival City :"+current.arrCity);
            System.out.println("\nDeparture Time :"+current.depTime);
            System.out.println("\nArrival Time :"+current.arrTime);
        }
    }
    public void reversePrint(){
        System.out.println("\nReverse List of Passengers:");
        Passenger current=tailPassenger;
        int i=1;
        System.out.println("\n\n"+i+"-PASSENGERS'S INFO: \n\n\n");
        System.out.println("\n\nPassenger Name: "+ current.lname+" "+current.fname);
        System.out.println("\nPassenger CNIC: "+current.cnic);
        System.out.println("\nAge: "+current.age);
        System.out.println("\n\nFLIGHT'S INFO: \n\n\n");
        System.out.println("\nFlight Number :"+current.flightNo);
        System.out.println("\nTrip Number :"+current.tripNo);
        System.out.println("\nDeparture City :"+current.depCity);
        System.out.println("\nArrival City :"+current.arrCity);
        System.out.println("\nDeparture Time :"+current.depTime);
        System.out.println("\nArrival Time :"+current.arrTime);
        while(current.prevPassenger!=null){
            i++;
            current=current.prevPassenger;
            System.out.println("\n\n"+i+"-PASSENGERS'S INFO: \n\n\n");
            System.out.println("\n\nPassenger Name: "+ current.lname+" "+current.fname);
            System.out.println("\nPassenger CNIC: "+current.cnic);
            System.out.println("\nAge: "+current.age);
            System.out.println("\n\nFLIGHT'S INFO: \n\n\n");
            System.out.println("\nFlight Number :"+current.flightNo);
            System.out.println("\nTrip Number :"+current.tripNo);
            System.out.println("\nDeparture City :"+current.depCity);
            System.out.println("\nArrival City :"+current.arrCity);
            System.out.println("\nDeparture Time :"+current.depTime);
            System.out.println("\nArrival Time :"+current.arrTime);
        }
    }
    public void addAtIndex(String fname,String lname,int age,String cnic,String flightNo,int tripNo,String depCity,String arrCity,int depTime,int arrTime,String seatNo,int index){
        Passenger newNode=new Passenger();
        newNode.nextPassenger=null;
        newNode.prevPassenger=null;
        newNode.fname=fname;
        newNode.lname=lname;
        newNode.age=age;
        newNode.cnic=cnic;
        newNode.flightNo=flightNo;
        newNode.tripNo=tripNo;
        newNode.depCity=depCity;
        newNode.arrCity=arrCity;
        newNode.depTime=depTime;
        newNode.arrTime=arrTime;
        newNode.seatNo=seatNo;
        Passenger current=headPassenger;
        Passenger previous=new Passenger();
        for(int i=0;i<index;i++){
            previous=current;
            current=current.nextPassenger;
        }
        newNode.nextPassenger=current;
        newNode.prevPassenger=previous;
        current.prevPassenger=newNode;
        previous.nextPassenger=newNode;
        System.out.println("\nPassenger Data successfulyy inserted at position number: "+index);
    }
    public void deletePassenger(String flightNo){
        Passenger current=new Passenger();
        Passenger previous=new Passenger();
        Passenger nextNode=new Passenger();
        while(!current.flightNo.equalsIgnoreCase(flightNo)){
            previous=current;
            current=current.nextPassenger;
            nextNode=current.nextPassenger;
        }
        previous.nextPassenger=nextNode;
        nextNode.prevPassenger=previous;
        current.nextPassenger=current.prevPassenger=null;
        System.out.println("\nFlight Data successfulyy deleted.");
    }
    public void insertPassengerAtHead(String fname,String lname,int age,String cnic,String flightNo){
        Passenger node=new Passenger();
        node.fname=fname;
        node.lname=lname;
        node.age=age;
        node.cnic=cnic;
        node.flightNo=flightNo;
        node.nextPassenger=null;
        node.prevPassenger=null;
        if(headPassenger==null){
            headPassenger=node;
        }
        else {
            headPassenger.prevPassenger=node;
            node.nextPassenger=headPassenger;
            headPassenger=node;
        }
        System.out.println("\nPassenger Data successfulyy inserted at Head.");
    }

}

	
	
	

