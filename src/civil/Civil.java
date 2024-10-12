package civil;

import datetimeutils.DateTimeUtils;
import ticket.Ticket;

public class Civil extends Ticket {
    public static final String CIVIL_TYPE = "Civil Fine";
    private final String civilType;

    private String imposedSanction;

    public Civil(String CIVIL_TYPE, long fineID, DateTimeUtils dateInfo, String authorityName,
                   String description, Boolean status ) {
        super(fineID, dateInfo, authorityName, description, status);
        civilType = CIVIL_TYPE;
    }
}
