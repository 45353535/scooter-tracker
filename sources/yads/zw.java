package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zw extends g11 {
    public static final Parcelable.Creator<zw> CREATOR = new yw();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f118854e;

    public zw(Parcel parcel) {
        super("COMM");
        this.f118852c = (String) w83.a((Object) parcel.readString());
        this.f118853d = (String) w83.a((Object) parcel.readString());
        this.f118854e = (String) w83.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zw.class == obj.getClass()) {
            zw zwVar = (zw) obj;
            if (w83.a(this.f118853d, zwVar.f118853d) && w83.a(this.f118852c, zwVar.f118852c) && w83.a(this.f118854e, zwVar.f118854e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f118852c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f118853d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f118854e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": language=" + this.f118852c + ", description=" + this.f118853d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f111025b);
        parcel.writeString(this.f118852c);
        parcel.writeString(this.f118854e);
    }

    public zw(String str, String str2, String str3) {
        super("COMM");
        this.f118852c = str;
        this.f118853d = str2;
        this.f118854e = str3;
    }
}
