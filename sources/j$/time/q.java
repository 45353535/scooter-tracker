package j$.time;

import com.google.common.base.Ascii;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f84686d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84689c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Objects.requireNonNull(objArr[i10]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public q(int i10, int i11, int i12) {
        this.f84687a = i10;
        this.f84688b = i11;
        this.f84689c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f84687a == qVar.f84687a && this.f84688b == qVar.f84688b && this.f84689c == qVar.f84689c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f84689c, 16) + Integer.rotateLeft(this.f84688b, 8) + this.f84687a;
    }

    public final String toString() {
        if (this == f84686d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f84687a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f84688b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f84689c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r(Ascii.SO, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
