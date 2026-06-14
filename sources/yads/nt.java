package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class nt extends g11 {
    public static final Parcelable.Creator<nt> CREATOR = new mt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f114018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f114019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f114020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g11[] f114021g;

    public nt(Parcel parcel) {
        super("CTOC");
        this.f114017c = (String) w83.a((Object) parcel.readString());
        this.f114018d = parcel.readByte() != 0;
        this.f114019e = parcel.readByte() != 0;
        this.f114020f = (String[]) w83.a(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f114021g = new g11[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f114021g[i11] = (g11) parcel.readParcelable(g11.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nt.class == obj.getClass()) {
            nt ntVar = (nt) obj;
            if (this.f114018d == ntVar.f114018d && this.f114019e == ntVar.f114019e && w83.a(this.f114017c, ntVar.f114017c) && Arrays.equals(this.f114020f, ntVar.f114020f) && Arrays.equals(this.f114021g, ntVar.f114021g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f114018d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f114019e ? 1 : 0)) * 31;
        String str = this.f114017c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f114017c);
        parcel.writeByte(this.f114018d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f114019e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f114020f);
        parcel.writeInt(this.f114021g.length);
        for (g11 g11Var : this.f114021g) {
            parcel.writeParcelable(g11Var, 0);
        }
    }

    public nt(String str, boolean z10, boolean z11, String[] strArr, g11[] g11VarArr) {
        super("CTOC");
        this.f114017c = str;
        this.f114018d = z10;
        this.f114019e = z11;
        this.f114020f = strArr;
        this.f114021g = g11VarArr;
    }
}
