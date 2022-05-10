package it.isa.tests;

public interface ServerInterface {
    public float setup();
    public int getStatus();
    public String getUrl(String serviceName, String state);
}