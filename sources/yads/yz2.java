package yads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class yz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118472c;

    public yz2(int i10, long j10, long j11) {
        this.f118470a = i10;
        this.f118471b = j10;
        this.f118472c = j11;
    }

    public static yz2 a(Parcel parcel) {
        return new yz2(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }
}
