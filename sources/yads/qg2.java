package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class qg2 extends g11 {
    public static final Parcelable.Creator<qg2> CREATOR = new pg2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f114995d;

    public qg2(Parcel parcel) {
        super("PRIV");
        this.f114994c = (String) w83.a((Object) parcel.readString());
        this.f114995d = (byte[]) w83.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qg2.class == obj.getClass()) {
            qg2 qg2Var = (qg2) obj;
            if (w83.a(this.f114994c, qg2Var.f114994c) && Arrays.equals(this.f114995d, qg2Var.f114995d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f114994c;
        return Arrays.hashCode(this.f114995d) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": owner=" + this.f114994c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f114994c);
        parcel.writeByteArray(this.f114995d);
    }

    public qg2(String str, byte[] bArr) {
        super("PRIV");
        this.f114994c = str;
        this.f114995d = bArr;
    }
}
