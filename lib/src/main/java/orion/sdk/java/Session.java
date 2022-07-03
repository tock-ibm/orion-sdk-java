package orion.sdk.java;

import java.time.Duration;

import orion.sdk.java.config.Replica;

public class Session implements DBSession {
    String userID;
    Replica[] replicas;
    Duration txTimeout;

    public Session(String userID, Replica[] replicas, Duration txTimeout) {
        this.userID = userID;
        this.replicas = replicas;
        this.txTimeout = txTimeout;
    }

    public DataTxContext createDataTx() {
        return new DataTx();
    }
}
