public interface Event {
    Long getTimeStamp();
    void process();
}

//pattern: interface -> abstract -> concrete.
