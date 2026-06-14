package yads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ew1 extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient k23 f110507h;

    public ew1(Map map, aw1 aw1Var) {
        super(map);
        this.f110507h = (k23) ie2.a(aw1Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f110507h = (k23) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f108502f = map;
        this.f108503g = 0;
        for (Collection collection : map.values()) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.f108503g = collection.size() + this.f108503g;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f110507h);
        objectOutputStream.writeObject(this.f108502f);
    }
}
