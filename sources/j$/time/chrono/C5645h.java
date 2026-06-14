package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5645h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f84562e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f84563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84566d;

    static {
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Objects.requireNonNull(objArr[i10]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public C5645h(m mVar, int i10, int i11, int i12) {
        Objects.requireNonNull(mVar, "chrono");
        this.f84563a = mVar;
        this.f84564b = i10;
        this.f84565c = i11;
        this.f84566d = i12;
    }

    public final String toString() {
        m mVar = this.f84563a;
        int i10 = this.f84566d;
        int i11 = this.f84565c;
        int i12 = this.f84564b;
        if (i12 == 0 && i11 == 0 && i10 == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.toString());
        sb2.append(" P");
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('Y');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5645h) {
            C5645h c5645h = (C5645h) obj;
            if (this.f84564b == c5645h.f84564b && this.f84565c == c5645h.f84565c && this.f84566d == c5645h.f84566d && this.f84563a.equals(c5645h.f84563a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84563a.hashCode() ^ (Integer.rotateLeft(this.f84566d, 16) + (Integer.rotateLeft(this.f84565c, 8) + this.f84564b));
    }

    public Object writeReplace() {
        return new F((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
