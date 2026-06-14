package j$.time;

import com.ironsource.C4240b4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j$.com.android.tools.r8.a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f84542b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneOffset f84543a;

    public a(ZoneOffset zoneOffset) {
        this.f84543a = zoneOffset;
    }

    static {
        System.currentTimeMillis();
        f84542b = new a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f84543a.equals(((a) obj).f84543a);
    }

    public final String toString() {
        return "SystemClock[" + this.f84543a + C4240b4.j.f42674e;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    public final int hashCode() {
        return this.f84543a.f84540a + 1;
    }
}
