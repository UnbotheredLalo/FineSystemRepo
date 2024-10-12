package commercial;

import datetimeutils.DateTimeUtils;
import ticket.Ticket;

public class Commercial extends Ticket {
    public static final String COMMERCIAL_TYPE = "Commercial Fine";
    private final String commercialType;

    private String imposedSanction;

    public Commercial(String COMMERCIAL_TYPE, long fineID, DateTimeUtils dateInfo, String authorityName,
                      String description, Boolean status) {
        super(fineID, dateInfo, authorityName, description, status);
        commercialType = COMMERCIAL_TYPE;
    }
}