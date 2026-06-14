package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class sl0 implements er1 {
    public static final Parcelable.Creator<sl0> CREATOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final yv0 f115854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final yv0 f115855i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f115857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f115858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f115859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f115860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115861g;

    static {
        xv0 xv0Var = new xv0();
        xv0Var.f117982k = "application/id3";
        f115854h = new yv0(xv0Var);
        xv0 xv0Var2 = new xv0();
        xv0Var2.f117982k = "application/x-scte35";
        f115855i = new yv0(xv0Var2);
        CREATOR = new rl0();
    }

    public sl0(Parcel parcel) {
        this.f115856b = (String) w83.a((Object) parcel.readString());
        this.f115857c = (String) w83.a((Object) parcel.readString());
        this.f115858d = parcel.readLong();
        this.f115859e = parcel.readLong();
        this.f115860f = (byte[]) w83.a((Object) parcel.createByteArray());
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }

    @Override // yads.er1
    public final byte[] b() {
        if (a() != null) {
            return this.f115860f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sl0.class == obj.getClass()) {
            sl0 sl0Var = (sl0) obj;
            if (this.f115858d == sl0Var.f115858d && this.f115859e == sl0Var.f115859e && w83.a(this.f115856b, sl0Var.f115856b) && w83.a(this.f115857c, sl0Var.f115857c) && Arrays.equals(this.f115860f, sl0Var.f115860f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f115861g == 0) {
            String str = this.f115856b;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f115857c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f115858d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f115859e;
            this.f115861g = Arrays.hashCode(this.f115860f) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f115861g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f115856b + ", id=" + this.f115859e + ", durationMs=" + this.f115858d + ", value=" + this.f115857c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f115856b);
        parcel.writeString(this.f115857c);
        parcel.writeLong(this.f115858d);
        parcel.writeLong(this.f115859e);
        parcel.writeByteArray(this.f115860f);
    }

    @Override // yads.er1
    public final yv0 a() {
        String str = this.f115856b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f115855i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f115854h;
            default:
                return null;
        }
    }

    public sl0(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f115856b = str;
        this.f115857c = str2;
        this.f115858d = j10;
        this.f115859e = j11;
        this.f115860f = bArr;
    }
}
