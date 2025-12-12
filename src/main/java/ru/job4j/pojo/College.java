package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Komarov Ilya Alekseevich");
        student.setGroup("\"Geological exploration technology\"");
        student.setAdmission(2016, 9, 1);

        System.out.println(student.getFio() + " was studied at group " + student.getGroup()
                + " from  " + student.getAdmission());
    }
}
