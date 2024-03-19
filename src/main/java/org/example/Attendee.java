package org.example;

public class Attendee {
    private String name;
    private char gender;
    private int age;
    private String email;
    private String seatNO;


    public Attendee(String name, char gender, int age, String email, String seat){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        seatNO = seat;
    }
    public String getName(){

        return name;
    }
    public char getGender() {

        return gender;
    }


    public int getAge() {

        return age;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setAge(int age) {

        this.age = age;
    }


    public void setGender(char gender) {

        this.gender = gender;
    }

    public void setName(String name){

        this.name = name;
    }
    public String getSeatNO() {

        return seatNO;
    }

    public void setSeatNO(String seat) {

        this.seatNO = seat;
    }

    public String toString() {
        return "\n" + "Attendee Name:" + name +
                "\n" + "Email" + email +
                "\n" + "Age" + age +
                "\n" + "Seat NO" + seatNO;

    }


}
