class Datamatik {
  String name;
  Datamatik(String name) {
    this.name = name;
  }
}
void setup() {
  Teacher Teach = new Teacher("Signe", 48, true);
  Student Me = new Student("Sebastian", 20, false, new Datamatik("D"));
  Student Friend = new Student("Marcus", -1, false, new Datamatik("D"));

  println(Teach.name);
  println(Me.name + " in group: " + Me.datamatikerTeam.name);
  println(Friend.name + " in group: " + Friend.datamatikerTeam.name);
}
