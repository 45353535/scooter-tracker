package ge;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f72758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f72759d;

    public a(int i10, int i11, int i12) {
        this.f72757b = i10;
        this.f72758c = i11;
        this.f72759d = i12;
    }

    public static a g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i10 < strArrSplit.length) {
                if (i10 == 0) {
                    i11 = Integer.parseInt(strArrSplit[0]);
                } else if (i10 != 1) {
                    i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArrSplit[i10]) : Integer.parseInt(strArrSplit[2]);
                } else {
                    i12 = Integer.parseInt(strArrSplit[1]);
                }
                i10++;
            }
            return new a(i11, i12, i13);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        int iCompare = Integer.compare(this.f72757b, aVar.f72757b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f72758c, aVar.f72758c);
        return iCompare2 != 0 ? iCompare2 : Integer.compare(this.f72759d, aVar.f72759d);
    }

    public boolean c(a aVar) {
        return compareTo(aVar) > 0;
    }

    public boolean d(a aVar) {
        return compareTo(aVar) >= 0;
    }

    public boolean e(a aVar) {
        return compareTo(aVar) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f72757b == aVar.f72757b && this.f72758c == aVar.f72758c && this.f72759d == aVar.f72759d) {
                return true;
            }
        }
        return false;
    }

    public boolean f(a aVar) {
        return compareTo(aVar) <= 0;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f72757b), Integer.valueOf(this.f72758c), Integer.valueOf(this.f72759d));
    }

    public String toString() {
        return this.f72757b + "." + this.f72758c + "." + this.f72759d;
    }
}
