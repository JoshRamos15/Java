package keanperson;
import java.util.Date;

class KeanStaff extends KeanPerson
{
String office;
String title;
double salary;
Date dateOfHire;

public KeanStaff(String name, int age, String office, String title, double salary,
Date dateOfHire)
{
super(name, age);
this.office = office;
this.title = title;
this.salary = salary;
this.dateOfHire = dateOfHire;
}

@Override
public String toString()
{
return super.toString()+", Office: "+this.office+", Title: "+this.title+
", Salary: "+this.salary+", Date of Hire: "+this.dateOfHire;
}
}

//class KeanStudent.java
class KeanStudent extends KeanPerson
{
String roll_no;
String subject;

public KeanStudent(String name, int age, String roll_no, String subject)
{
super(name, age);
this.roll_no = roll_no;
this.subject = subject;
}

@Override
public String toString()
{
return super.toString()+", roll_no: "+this.roll_no+", subject: "+this.subject;
}
}

//class KeanFaculty.java
class KeanFaculty extends KeanPerson
{
String designation;
double salary;

public KeanFaculty(String name, int age, String designation, double salary)
{
super(name, age);
this.designation = designation;
this.salary = salary;
}

@Override
public String toString()
{
return super.toString()+", Designation: "+this.designation+", Salary: "+this.salary;
}
}

//test class
class Test
{
//main driver function
@SuppressWarnings("deprecation")
public static void main(String[] args)
{
Date date = new Date();
date.setDate(date.getDate());

KeanStaff staff = new KeanStaff("josh", 30, "kean abc", "Teacher xyz", 34000.0, date);

KeanStudent std = new KeanStudent("Dom", 19, "110", "computer science");

KeanFaculty fac = new KeanFaculty("Abi",35, "professor", 5000.0);

System.out.println("\n"+staff.toString());
System.out.println("\n"+std.toString());
System.out.println("\n"+fac.toString());
}
}