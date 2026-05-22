package AppointmentSelector;

/**
 * OOP logic class for managing Appointment rules.
 */
public class Appointment {
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;

    public Appointment(String patientName, String appointmentType, String patientCategory, double baseFee) {
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public double calculateFinalFee() {
        double finalFee = baseFee;

        // type fees
        if (appointmentType.equals("Specialist")) {
            finalFee += 1500;
        } else if (appointmentType.equals("Online")) {
            finalFee -= 500;
        }

        // age category
        if (patientCategory.equals("Child")) {
            finalFee -= 300;
        }else if (patientCategory.equals("Senior")) {
            finalFee -= 500;
        }

        return finalFee;
    }

    public String getAppointmentMessage() {
        return appointmentType + " appointment selected";
    }
}