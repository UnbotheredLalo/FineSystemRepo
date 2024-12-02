package transit;

import datetimeutils.DateTimeUtils;
import ticket.Category;
import ticket.GovAuthorities;
import ticket.Ticket;

public class Transit extends Ticket {

    public Category trafficType = Category.TRAFFIC ;
    private static final int MINIMUM_FINE_TRAFFIC = 1;
    private static final double MAX_DISCOUNT_TRAFFIC = 0.50;

    public Transit(Category trafficType, long fineID, DateTimeUtils issueDate,
                   GovAuthorities authorityName, Boolean isPaid ) {
        super(fineID, issueDate, authorityName, isPaid);
        this.trafficType = trafficType;
    }
}
