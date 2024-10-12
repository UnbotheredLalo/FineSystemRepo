package transit;

import datetimeutils.DateTimeUtils;
import ticket.Ticket;

public class Transit extends Ticket {

    public static final String TRAFFIC_TYPE = "Traffic Ticket";
    private final String trafficType;

    private String imposedSanction;

    public Transit(String TRAFFIC_TYPE, long fineID, DateTimeUtils dateInfo, String authorityName,
                         String description, Boolean status ) {
        super(fineID, dateInfo, authorityName, description, status);
        trafficType = TRAFFIC_TYPE;
    }

    public void setImposedSanction(String imposedSanction) { this.imposedSanction = imposedSanction; }

    public String getImposedSanction() { return this.imposedSanction; }
}
