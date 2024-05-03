package keanperson;

import java.util.Date;


class KeanPerson
{
String name;
int age;


public KeanPerson(String name, int age)
{
this.name = name;
this.age = age;
}

@Override
public String toString()
{
String str = "\nName: "+this.name+", Age: "+this.age;

return str;
}

//setters for class attributes

public void setName(String name) {
this.name = name;
}

public void setAge(int age) {
this.age = age;
}

//getters for class

public String getName() {
return this.name;
}

public int getAge() {
return this.age;
}

}
