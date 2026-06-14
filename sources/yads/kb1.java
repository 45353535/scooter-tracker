package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class kb1 extends g11 {
    public static final Parcelable.Creator<kb1> CREATOR = new jb1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f112673e;

    public kb1(Parcel parcel) {
        super("----");
        this.f112671c = (String) w83.a((Object) parcel.readString());
        this.f112672d = (String) w83.a((Object) parcel.readString());
        this.f112673e = (String) w83.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kb1.class == obj.getClass()) {
            kb1 kb1Var = (kb1) obj;
            if (w83.a(this.f112672d, kb1Var.f112672d) && w83.a(this.f112671c, kb1Var.f112671c) && w83.a(this.f112673e, kb1Var.f112673e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f112671c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f112672d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112673e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": domain=" + this.f112671c + ", description=" + this.f112672d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f111025b);
        parcel.writeString(this.f112671c);
        parcel.writeString(this.f112673e);
    }

    public kb1(String str, String str2, String str3) {
        super("----");
        this.f112671c = str;
        this.f112672d = str2;
        this.f112673e = str3;
    }
}
