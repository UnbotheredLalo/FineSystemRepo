package ticket;

import datetimeutils.DateTimeUtils;

public class Ticket {

    public double fine;
    public long fineID;
    public String govInstitution;
    public String authorityName;
    public DateTimeUtils dateInfo;
    public String description;
    public Boolean status;
    private static final double UMA = 207.44;

    public Ticket(long fineID, DateTimeUtils dateInfo, String authorityName,
                  String description, Boolean status ) {
        this.fineID = fineID;
        this.dateInfo = dateInfo;
        this.authorityName = authorityName;
        this.description = description;
        this.status = status;
    }


    public String showDetails() {
        String ticketInfo = "Date: " + dateInfo + "\n"
                + "Officer Name: " + authorityName + "\n"
                + "You've got a Ticket for: " + description + "\n"
                + "Your Fine ID is: " + fineID + "\n";
        return ticketInfo;
    }
}
