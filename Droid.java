public class Droid {
  // instance fields
  int batteryLevel;
  String name;

  // constructor assigns name and default batteryLevel of 100
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  // method return string message with name
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }

  // method prints task and reduces battery level by 10
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  // method prints the instance’s batteryLevel
  public void energyReport(){
    System.out.println(name + " battery level: " + batteryLevel);
  }

  // method exchanges batteryLevel between instances
  public void energyTransfer(Droid droid) {
    int batteryTransferValue = droid.batteryLevel;
    droid.batteryLevel = batteryLevel;
    batteryLevel = batteryTransferValue;
    System.out.println("Battery level transfer complete: " + name + " and " + droid.name);
  }

  // main method
  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("Tidy the room");
    codey.energyReport();
    Droid tim = new Droid("Tim");
    System.out.println(tim);
    tim.performTask("Water the plants");
    tim.performTask("Cut the lawn");
    tim.energyReport();
    tim.energyTransfer(codey);
    codey.energyReport();
    tim.energyReport();
  }
}