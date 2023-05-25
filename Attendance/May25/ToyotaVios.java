public class Toyota_VIOS extends Vehicle {
String TireType = "Performance Tire";
		
void Drive() {
System.out.println("The car is now moving");
}
//Used overriding for method STOP()
@Override
void Stop() {
super.Stop();
}
}
