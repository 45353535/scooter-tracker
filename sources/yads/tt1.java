package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class tt1 implements er1 {
    public static final Parcelable.Creator<tt1> CREATOR = new st1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f116377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f116378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f116379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f116380f;

    public tt1(long j10, long j11, long j12, long j13, long j14) {
        this.f116376b = j10;
        this.f116377c = j11;
        this.f116378d = j12;
        this.f116379e = j13;
        this.f116380f = j14;
    }

    @Override // yads.er1
    public /* synthetic */ yv0 a() {
        return i6.a(this);
    }

    @Override // yads.er1
    public /* synthetic */ byte[] b() {
        return i6.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tt1.class == obj.getClass()) {
            tt1 tt1Var = (tt1) obj;
            if (this.f116376b == tt1Var.f116376b && this.f116377c == tt1Var.f116377c && this.f116378d == tt1Var.f116378d && this.f116379e == tt1Var.f116379e && this.f116380f == tt1Var.f116380f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f116376b;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        long j11 = this.f116377c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f116378d;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f116379e;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f116380f;
        return i13 + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f116376b + ", photoSize=" + this.f116377c + ", photoPresentationTimestampUs=" + this.f116378d + ", videoStartPosition=" + this.f116379e + ", videoSize=" + this.f116380f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f116376b);
        parcel.writeLong(this.f116377c);
        parcel.writeLong(this.f116378d);
        parcel.writeLong(this.f116379e);
        parcel.writeLong(this.f116380f);
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }

    public tt1(Parcel parcel) {
        this.f116376b = parcel.readLong();
        this.f116377c = parcel.readLong();
        this.f116378d = parcel.readLong();
        this.f116379e = parcel.readLong();
        this.f116380f = parcel.readLong();
    }
}
