public class Fandango_Yacht extends Vehicle{
String MainSailColor = "White";
	
void Float() {
System.out.println("The yacht is sailing");
}
//Used overriding for method STOP()
@Override
void Stop() {
super.Stop();
}
}
