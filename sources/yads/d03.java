package yads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class d03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f109687b;

    public d03(int i10, long j10) {
        this.f109686a = i10;
        this.f109687b = j10;
    }

    public static d03 a(Parcel parcel) {
        return new d03(parcel.readInt(), parcel.readLong());
    }
}
