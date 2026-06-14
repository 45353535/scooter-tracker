package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {
    ArrayList<Keys> mKeys = new ArrayList<>();

    public void add(Keys keys) {
        this.mKeys.add(keys);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.mKeys.isEmpty()) {
            sb2.append("keyFrames:{\n");
            Iterator<Keys> it = this.mKeys.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        return sb2.toString();
    }
}
