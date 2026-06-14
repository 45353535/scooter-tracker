package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f84742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f84743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f84744d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f84741a, ((b) obj).f84741a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f84741a = j$.com.android.tools.r8.a.r(localDateTime, zoneOffset);
        this.f84742b = localDateTime;
        this.f84743c = zoneOffset;
        this.f84744d = zoneOffset2;
    }

    public b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f84741a = j10;
        this.f84742b = LocalDateTime.G(j10, 0, zoneOffset);
        this.f84743c = zoneOffset;
        this.f84744d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f84741a == bVar.f84741a && this.f84743c.equals(bVar.f84743c) && this.f84744d.equals(bVar.f84744d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f84742b.hashCode() ^ this.f84743c.f84540a) ^ Integer.rotateLeft(this.f84744d.f84540a, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        ZoneOffset zoneOffset = this.f84744d;
        int i10 = zoneOffset.f84540a;
        ZoneOffset zoneOffset2 = this.f84743c;
        sb2.append(i10 > zoneOffset2.f84540a ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f84742b);
        sb2.append(zoneOffset2);
        sb2.append(" to ");
        sb2.append(zoneOffset);
        sb2.append(']');
        return sb2.toString();
    }
}
