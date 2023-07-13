package NestedClassesandTypes;

import java.util.HashMap;

public class EmployeeStaticNested {
    private int employeeName;
    private String name;
    private int yearStarted;

    public EmployeeStaticNested() {
    }

    public EmployeeStaticNested(int employeeName, String name, int yearStarted) {
        this.employeeName = employeeName;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmployeeStaticNested{" +
                "employeeName=" + employeeName +
                ", name='" + name + '\'' +
                ", yearStarted=" + yearStarted +
                '}';
    }

    public static void main(String[] args) {
        String s = "Saurav";
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i< s.length();i++) {
            if(freq.containsKey(s.charAt(i))){
                freq.put((s.charAt(i)),(freq.get(s.charAt(i))) + 1);
            }
            else{
                freq.put(s.charAt(i),1);
            }
        }
    }

}
