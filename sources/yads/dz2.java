package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class dz2 implements er1 {
    public static final Parcelable.Creator<dz2> CREATOR = new cz2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f110116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110117c;

    public dz2(int i10, float f10) {
        this.f110116b = f10;
        this.f110117c = i10;
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
        if (obj != null && dz2.class == obj.getClass()) {
            dz2 dz2Var = (dz2) obj;
            if (this.f110116b == dz2Var.f110116b && this.f110117c == dz2Var.f110117c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f110116b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f110117c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f110116b + ", svcTemporalLayerCount=" + this.f110117c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f110116b);
        parcel.writeInt(this.f110117c);
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }

    public dz2(Parcel parcel) {
        this.f110116b = parcel.readFloat();
        this.f110117c = parcel.readInt();
    }
}
