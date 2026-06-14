package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class lt extends g11 {
    public static final Parcelable.Creator<lt> CREATOR = new kt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f113216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f113217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g11[] f113218h;

    public lt(Parcel parcel) {
        super("CHAP");
        this.f113213c = (String) w83.a((Object) parcel.readString());
        this.f113214d = parcel.readInt();
        this.f113215e = parcel.readInt();
        this.f113216f = parcel.readLong();
        this.f113217g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f113218h = new g11[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f113218h[i11] = (g11) parcel.readParcelable(g11.class.getClassLoader());
        }
    }

    @Override // yads.g11, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (this.f113214d == ltVar.f113214d && this.f113215e == ltVar.f113215e && this.f113216f == ltVar.f113216f && this.f113217g == ltVar.f113217g && w83.a(this.f113213c, ltVar.f113213c) && Arrays.equals(this.f113218h, ltVar.f113218h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f113214d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f113215e) * 31) + ((int) this.f113216f)) * 31) + ((int) this.f113217g)) * 31;
        String str = this.f113213c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f113213c);
        parcel.writeInt(this.f113214d);
        parcel.writeInt(this.f113215e);
        parcel.writeLong(this.f113216f);
        parcel.writeLong(this.f113217g);
        parcel.writeInt(this.f113218h.length);
        for (g11 g11Var : this.f113218h) {
            parcel.writeParcelable(g11Var, 0);
        }
    }

    public lt(String str, int i10, int i11, long j10, long j11, g11[] g11VarArr) {
        super("CHAP");
        this.f113213c = str;
        this.f113214d = i10;
        this.f113215e = i11;
        this.f113216f = j10;
        this.f113217g = j11;
        this.f113218h = g11VarArr;
    }
}
