package me.learn.DesignPattern.Behavioral.Command;

public class Receiver {

    public static final int TYPE_SEND = 1;
    public static final int TYPE_CANCEL = 2;

    private String keys = "";

    public void action(int type, char key) {
        switch (type) {
            case TYPE_SEND:
                keys += key;
//                Util.show(this, "action.send = ", key);
                break;

            case TYPE_CANCEL:
                if (keys.length() > 0 && keys.charAt(keys.length() - 1) == key) {
                    keys = keys.substring(0, keys.length() - 1);
//                    Util.show(this, "action.cancel ", key);
                }
                break;
        }
    }

    public String getKeys() {
        return keys;
    }

    public void clearKeys() {
        keys = "";
    }

}
