package MembershipRegistration;

public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }

    public double getMonthlyFee() {
        if (membershipType.equalsIgnoreCase("Premium")) {
            return 2500; // Premium monthly fee is 2500
        } else {
            return 1000; // Regular monthly fee is 1000
        }
    }

    public double getMembershipFee() {
        double totalFee = this.getMonthlyFee() * numberOfMonths;
        if (newsletterSelected) {
            totalFee += 200; // If newsletter is selected, add 200 flat fee
        }
        return totalFee;
    }
}