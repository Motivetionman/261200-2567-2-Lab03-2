public class Patient {
    // Private fields
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private int phonenumber;
    

    // Parameterized constructor
    public Patient(int id, String name, int birthYear, double height, double weight,String bloodGroup,int phonenumber) {
        this.id = id;
        this.name = name;
        // Validation for birthYear
        if (birthYear <= 0) {
            System.out.println("Invalid birth year provided. Setting to default (2000).");
            this.birthYear = 2000;
        } else {
            this.birthYear = birthYear;
        }
        // Validation for height
        if (height <= 0) {
            System.out.println("Invalid height provided. Setting to default (170.0 cm).");
            this.height = 170.0;
        } else {
            this.height = height;
        }
        // Validation for weight
        if (weight <= 0) {
            System.out.println("Invalid weight provided. Setting to default (70.0 kg).");
            this.weight = 70.0;
        } else {
            this.weight = weight;
        }
        this.bloodGroup = bloodGroup;
        this.phonenumber =phonenumber;
        

    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    public String getbloodGroup(){
        return bloodGroup;
    }
    public int getphonenumber(){
        return phonenumber;
    }
    public double getBMI(){
        double heightinmeters= height/100;
        double BMI =weight/(heightinmeters*heightinmeters);
        if(height<=0 || weight<=0 ){
            return 0;
        }
        else{
        return BMI;
        }
    }

    // Calculate age
    public int getAge(int currentYear) {
        if (currentYear < birthYear) {
            System.out.println("Invalid current year provided. Cannot calculate age.");
            return -1; // Indicate an error
        }
        return currentYear - birthYear;
    }

    // Display details
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        int age = getAge(currentYear);
        if (age >= 0) {
            System.out.println("Patient Age: " + age);
        }
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodGroup(A/B/O/AB):"+ bloodGroup);
        System.out.println("Patient phonenumber:"+ phonenumber);
        System.out.println();
    }



    public static void main(String[] args) {
        int currentYear = 2024;

        // Valid Patient
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,"AB",01234567);
        patient.displayDetails(currentYear);

        // Invalid Patient
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"B",01234567);
        invalidPatient.displayDetails(currentYear);
    }

}


