import java.util.*;  

class Passenger implements Comparable<Passenger>{  
String firstName;		
String lastName;			//Arguments to fit in constructor
String dOB;
String category;
int priority;
Passenger [] loader = new Passenger[15];	//Object arrays used to hold passengers
Passenger [] temp = new Passenger[15];
Queue<Passenger> loading=new PriorityQueue<Passenger>();  //Priority Queue being used in 
	public Passenger(){ // Default contsructor 
	}
	public Passenger(String f, String l,String date, String c,int p){  // Constructor used to create Passengers
	this.firstName = f;  
	this.lastName = l;
	this.dOB = date;
	this.category = c;
	this.priority = p;  
	}  
	public Queue<Passenger> loadPassengers(){ //Method that creates passengers and adds them to queue
		Passenger p1= new Passenger("Bill","Cosby","June 1950","Elderly",5);
		loader[0] =p1;
		Passenger p2= new Passenger("Amlan","Chatterjee","March 1965","Elderly",5);
		loader[1] =p2;
		Passenger p3= new Passenger("Idris","Elba","July 1978","First class",15);
		loader[2] =p3;
		Passenger p4= new Passenger("Rosy","Williams","May 1995","Travelling with infant",1);
		loader[3] =p4;
		Passenger p5= new Passenger("Ram","Bo","October 1967","Armed Services",10);
		loader[4] =p5;
		Passenger p6= new Passenger("Orlando","Brown","April 2000","Economy",20);
		loader[5] =p6;
		Passenger p7= new Passenger("John","Johnson","April 1980","Economy",20);
		loader[6] =p7;
		Passenger p8= new Passenger("Vin","Diesel","July 1980","Armed Services",10);	// Passenger objects being created
		loader[7] =p8;
		Passenger p9= new Passenger("Moses","Jones","Feb 1996","First class",15);
		loader[8] =p9;
		Passenger p10= new Passenger("Sheila","Richards","December 1989","Travelling with infant",1);
		loader[9] =p10;
		Passenger p11= new Passenger("Shaquille","O'Neal","August 1985","First class",15);
		loader[10] =p11;
		Passenger p12= new Passenger("James","Bond","Jan 1950","Elderly",5);
		loader[11] =p12;
		Passenger p13= new Passenger("Bob","Hope","September 1945","Elderly",5);
		loader[12] =p13;
		Passenger p14= new Passenger("Amy","Williams","Feb 1992","Travelling with infant",1);
		loader[13] =p14;
		Passenger p15= new Passenger("Jim","James","Jan 1977","Economy",20);
		loader[14] =p15;
		temp[14] = p15;
		Passenger tempP;
		for (int i = 0; i> loader.length; i++){ // for loop used to place priorities in proper order 
			for (int j = 0; j>temp.length; j++){
				if(loader[i].priority < temp[j].priority){ //if statement used to check priority sizes
					tempP = loader[i];
					loader[i] = loader[j]; //Swap objects if statement is true
					loader[j] = tempP;
				}
				else{
					continue; //loop constantly checks for sizes
				}
			}
		}
		for (int k = 0; k <loader.length; k++){ //places objects placed in array into priortiy queue
			loading.add(loader[k]);
		}	
			return loading;	
	}
	public void printPassengers(){ //Method to print out passengers boarded on the plane
		System.out.println("Boarding passengers.....");  
		System.out.println("-------------------------");  

		for(Passenger p:loading){  //loop to print out queue
		System.out.println(p.firstName+" "+p.lastName+" is born "+p.dOB+", and is " +p.category+ " and has (Priority): "+p.priority);  
		}  
		System.out.println("-------------------------");
		System.out.println("Passengers Boarded!!!");
	}
	public void printArrival(){ // Method used to load passengers who arrived
		
		for(Passenger p:loading){  //loop to print out queue
		System.out.println(p.firstName+" "+p.lastName+" is born "+p.dOB+", and is " +p.category+ " and has (Priority): "+p.priority);  
		System.out.println("-------------------------");
		System.out.println("!!ARRIVED!!");
		}  
		/*
		for(int i= 0; i <loader.length;i++){
			System.out.println(Arrays.toString(loader));
		}
		*/
			}
	public int compareTo(Passenger p){  //CompareTo method needed for interface
		if(this.priority>p.priority){  
			return 1;  
		}
		else if(priority<p.priority){  
			return -1;  
		}
		else{  
			return 0;  
		}  
	}	
}




