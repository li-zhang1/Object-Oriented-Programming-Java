import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {

    protected Long createdTimestamp;
    protected String id;

    public AbstractEvent(String id){
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }
    @Override
    public Long getTimeStamp(){return this.createdTimestamp;}
    public abstract void process();



}

//We cannot create instance for the abstract class directly.
