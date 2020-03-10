package stackcontainer;

import java.util.Arrays;

public class BlackList {
    private Class[] blacklist;

    BlackList() {
        super();
        this.blacklist = new Class[0];
    }

    public boolean contains(Class checkClass) {
        for (Class i : blacklist) {
            if (i.equals(checkClass)) return true;
        }
        return false;
    }

    public boolean contains(Object checkObject) {
        for (Object i : blacklist) {
            if (i.equals(checkObject)) return true;
        }
        return false;
    }

    public void addToBlackList(Class addClass) {
        if (!contains(addClass)) {
            Class[] temp = new Class[blacklist.length + 1];
            for (int i = 0; i < blacklist.length; i++) temp[i] = blacklist[i];
            blacklist = temp;
            for (int i = 0; i < blacklist.length; i++) {
                if (blacklist[i] == null) {
                    blacklist[i] = addClass;
                    return;
                }
            }

        }
        System.out.printf("Object %s is in the blacklist\n", addClass.getName());
    }

    @Override
    public String toString() {
        if (blacklist.length == 0) {
            return "\nBlacklist is empty";
        } else {
            StringBuilder st = new StringBuilder();
            st.append("\nBlack list contains: ");
            for (Class temp : blacklist) {
                st.append("\n- " + temp);
            }
            return st.toString();
        }
    }
}
