package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class tg2 extends vz2 {
    public static final Parcelable.Creator<tg2> CREATOR = new sg2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f116237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f116238d;

    public tg2(long j10, byte[] bArr, long j11) {
        this.f116236b = j11;
        this.f116237c = j10;
        this.f116238d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f116236b);
        parcel.writeLong(this.f116237c);
        parcel.writeByteArray(this.f116238d);
    }

    public tg2(Parcel parcel) {
        this.f116236b = parcel.readLong();
        this.f116237c = parcel.readLong();
        this.f116238d = (byte[]) w83.a((Object) parcel.createByteArray());
    }
}
