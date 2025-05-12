package network;

public interface IMessageHandler {

    public void onMessage(Message message); // thực hiên API

    public void onConnectionFail();

    public void onDataInputStreamConnected();

    public void onConnectOK();

}
