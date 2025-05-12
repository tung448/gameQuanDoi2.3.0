package network;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Message {

    private byte command;
    private ByteArrayOutputStream byteArrayOutputStream;
    private DataOutputStream dataOutputStream;
    private ByteArrayInputStream byteArrayIutputStream;
    private DataInputStream dataInputStream;

    public Message(int command) {
        this((byte) command);
    }

    public Message(byte command) { // output
        this.command = command;
        byteArrayOutputStream = new ByteArrayOutputStream();
        dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    }

    public Message(byte command, byte[] data) { // input
        this.command = command;
        byteArrayIutputStream = new ByteArrayInputStream(data);
        dataInputStream = new DataInputStream(byteArrayIutputStream);
    }

    public byte getCommand() {
        return command;
    }

    public void setCommand(int cmd) {
        setCommand((byte) cmd);
    }

    public void setCommand(byte cmd) {
        command = cmd;
    }

    public byte[] getData() {
        return byteArrayOutputStream.toByteArray();
    }

    public DataInputStream reader() { // client send
        return dataInputStream;
    }

    public DataOutputStream writer() {
        return dataOutputStream;
    }

    public void cleanup() {
        try {
            if (dataInputStream != null)
                dataInputStream.close();

            if (dataOutputStream != null)
                dataOutputStream.close();

        } catch (IOException e) {
        }
    }

}
