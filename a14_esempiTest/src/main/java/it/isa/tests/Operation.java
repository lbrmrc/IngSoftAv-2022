package it.isa.tests;

public class Operation {
    private ServerInterface si;
    private int operationsCounter;

    public Operation() {
        operationsCounter = 0;
    }

    public Operation(int operationsCounter) {
        this.operationsCounter = operationsCounter;
    }

    public Operation(ServerInterface si) {
        this.si = si;
    }

    public int getServerStatus() {
        return si.getStatus();
    }

    public String getUrl(String serviceName, String state) {
        return si.getUrl(serviceName, state);
    }

    public float sum(float a, float b) {
        operationsCounter++;
        return a+b;
    }

    public int getCount() {
        return operationsCounter;
    }

    public boolean positivi(int a, int b) {
        if(a > 0 && b > 0) {
            return true;
        }
        else {
            return false;
        }

        // return ((a > 0) && (b > 0))
    }
}