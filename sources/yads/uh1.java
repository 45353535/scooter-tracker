package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class uh1 implements er1 {
    public static final Parcelable.Creator<uh1> CREATOR = new th1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f116639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f116640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f116641e;

    public uh1(int i10, int i11, String str, byte[] bArr) {
        this.f116638b = str;
        this.f116639c = bArr;
        this.f116640d = i10;
        this.f116641e = i11;
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
        if (obj != null && uh1.class == obj.getClass()) {
            uh1 uh1Var = (uh1) obj;
            if (this.f116638b.equals(uh1Var.f116638b) && Arrays.equals(this.f116639c, uh1Var.f116639c) && this.f116640d == uh1Var.f116640d && this.f116641e == uh1Var.f116641e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f116639c) + j4.a(this.f116638b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f116640d) * 31) + this.f116641e;
    }

    public final String toString() {
        return "mdta: key=" + this.f116638b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f116638b);
        parcel.writeByteArray(this.f116639c);
        parcel.writeInt(this.f116640d);
        parcel.writeInt(this.f116641e);
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }

    public uh1(Parcel parcel) {
        this.f116638b = (String) w83.a((Object) parcel.readString());
        this.f116639c = (byte[]) w83.a((Object) parcel.createByteArray());
        this.f116640d = parcel.readInt();
        this.f116641e = parcel.readInt();
    }
}
