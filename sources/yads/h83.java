package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class h83 extends g11 {
    public static final Parcelable.Creator<h83> CREATOR = new g83();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f111518d;

    public h83(Parcel parcel) {
        super((String) w83.a((Object) parcel.readString()));
        this.f111517c = parcel.readString();
        this.f111518d = (String) w83.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h83.class == obj.getClass()) {
            h83 h83Var = (h83) obj;
            if (this.f111025b.equals(h83Var.f111025b) && w83.a(this.f111517c, h83Var.f111517c) && w83.a(this.f111518d, h83Var.f111518d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = j4.a(this.f111025b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f111517c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f111518d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": url=" + this.f111518d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f111025b);
        parcel.writeString(this.f111517c);
        parcel.writeString(this.f111518d);
    }

    public h83(String str, String str2, String str3) {
        super(str);
        this.f111517c = str2;
        this.f111518d = str3;
    }
}
