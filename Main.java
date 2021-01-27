import java.util.Scanner;
class ClassRoom{
  double length;
  double breadth;
  double height;
  double airSpace;
}
class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ClassRoom room = new ClassRoom();

    room = getDimensions();

    int maxPeople = numberOfPeople(room);

    displayPersons(maxPeople);

    
  }

  public static ClassRoom getDimensions(){
    Scanner scan = new Scanner(System.in);
    ClassRoom temproom = new ClassRoom();
    
    temproom.length = getValid(2,20,"Enter length of room in meters");

    temproom.breadth = getValid(2,20,"Enter breadth of room in meters");

    temproom.height = getValid(2,10,"Enter height of room in meters");

    temproom.airSpace = getValid(3,15,"Enter regulation air space of room in meters cubed");

    return temproom;
  }

  public static double getValid(double min, double max, String msg){
    Scanner scan = new Scanner(System.in);
    System.out.println(msg);
    double dimension = scan.nextDouble();

    while(dimension < 2 || dimension > 20){
     System.out.println("invalid value");
     System.out.println("" +msg);
     dimension = scan.nextDouble();
    }

    return dimension;
  }

  public static int numberOfPeople(ClassRoom inputRoom){
    double volume = inputRoom.length * inputRoom.breadth * inputRoom.height;
    int people = (int) Math.floor(volume/ inputRoom.airSpace);

    return people;

  }
  public static void displayPersons(int people){
    System.out.println("The maximum number of people allowed in this room is " + people);
  }
}
