package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class wr1 extends g11 {
    public static final Parcelable.Creator<wr1> CREATOR = new vr1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f117537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f117538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f117539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f117540g;

    public wr1(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f117536c = i10;
        this.f117537d = i11;
        this.f117538e = i12;
        this.f117539f = iArr;
        this.f117540g = iArr2;
    }

    @Override // yads.g11, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wr1.class == obj.getClass()) {
            wr1 wr1Var = (wr1) obj;
            if (this.f117536c == wr1Var.f117536c && this.f117537d == wr1Var.f117537d && this.f117538e == wr1Var.f117538e && Arrays.equals(this.f117539f, wr1Var.f117539f) && Arrays.equals(this.f117540g, wr1Var.f117540g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f117540g) + ((Arrays.hashCode(this.f117539f) + ((((((this.f117536c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f117537d) * 31) + this.f117538e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f117536c);
        parcel.writeInt(this.f117537d);
        parcel.writeInt(this.f117538e);
        parcel.writeIntArray(this.f117539f);
        parcel.writeIntArray(this.f117540g);
    }

    public wr1(Parcel parcel) {
        super("MLLT");
        this.f117536c = parcel.readInt();
        this.f117537d = parcel.readInt();
        this.f117538e = parcel.readInt();
        this.f117539f = (int[]) w83.a(parcel.createIntArray());
        this.f117540g = (int[]) w83.a(parcel.createIntArray());
    }
}
