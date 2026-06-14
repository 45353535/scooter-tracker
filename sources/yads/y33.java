package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class y33 extends vz2 {
    public static final Parcelable.Creator<y33> CREATOR = new x33();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118070c;

    public y33(long j10, long j11) {
        this.f118069b = j10;
        this.f118070c = j11;
    }

    public static long a(long j10, w92 w92Var) {
        long jM = w92Var.m();
        if ((128 & jM) != 0) {
            return 8589934591L & ((((jM & 1) << 32) | w92Var.n()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f118069b);
        parcel.writeLong(this.f118070c);
    }
}
