package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class qy2 implements Parcelable {
    public static final Parcelable.Creator<qy2> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f115218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115219d;

    static {
        new Comparator() { // from class: yads.xj0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                qy2 qy2Var = (qy2) obj;
                qy2 qy2Var2 = (qy2) obj2;
                return qx.f115188a.a(qy2Var.f115217b, qy2Var2.f115217b).a(qy2Var.f115218c, qy2Var2.f115218c).a(qy2Var.f115219d, qy2Var2.f115219d).a();
            }
        };
        CREATOR = new py2();
    }

    public qy2(int i10, long j10, long j11) {
        fi.a(j10 < j11);
        this.f115217b = j10;
        this.f115218c = j11;
        this.f115219d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qy2.class == obj.getClass()) {
            qy2 qy2Var = (qy2) obj;
            if (this.f115217b == qy2Var.f115217b && this.f115218c == qy2Var.f115218c && this.f115219d == qy2Var.f115219d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f115217b), Long.valueOf(this.f115218c), Integer.valueOf(this.f115219d)});
    }

    public final String toString() {
        long j10 = this.f115217b;
        long j11 = this.f115218c;
        int i10 = this.f115219d;
        int i11 = w83.f117341a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + j10 + ", endTimeMs=" + j11 + ", speedDivisor=" + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f115217b);
        parcel.writeLong(this.f115218c);
        parcel.writeInt(this.f115219d);
    }
}
