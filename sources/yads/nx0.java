package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class nx0 extends g11 {
    public static final Parcelable.Creator<nx0> CREATOR = new mx0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f114068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f114069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f114070f;

    public nx0(Parcel parcel) {
        super("GEOB");
        this.f114067c = (String) w83.a((Object) parcel.readString());
        this.f114068d = (String) w83.a((Object) parcel.readString());
        this.f114069e = (String) w83.a((Object) parcel.readString());
        this.f114070f = (byte[]) w83.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nx0.class == obj.getClass()) {
            nx0 nx0Var = (nx0) obj;
            if (w83.a(this.f114067c, nx0Var.f114067c) && w83.a(this.f114068d, nx0Var.f114068d) && w83.a(this.f114069e, nx0Var.f114069e) && Arrays.equals(this.f114070f, nx0Var.f114070f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f114067c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f114068d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f114069e;
        return Arrays.hashCode(this.f114070f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": mimeType=" + this.f114067c + ", filename=" + this.f114068d + ", description=" + this.f114069e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f114067c);
        parcel.writeString(this.f114068d);
        parcel.writeString(this.f114069e);
        parcel.writeByteArray(this.f114070f);
    }

    public nx0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f114067c = str;
        this.f114068d = str2;
        this.f114069e = str3;
        this.f114070f = bArr;
    }
}
