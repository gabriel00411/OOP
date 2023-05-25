public class U_2SpyPlane extends Vehicle {
String Wingspan = "105ft";

void Fly() {
System.out.println("Plane is taking off");
}
//Used overriding for method STOP()
@Override
void Stop() {
super.Stop();
}
}
