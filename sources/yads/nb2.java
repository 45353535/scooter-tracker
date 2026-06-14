package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class nb2 implements er1 {
    public static final Parcelable.Creator<nb2> CREATOR = new mb2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f113774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f113776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f113777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f113778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f113779i;

    public nb2(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f113772b = i10;
        this.f113773c = str;
        this.f113774d = str2;
        this.f113775e = i11;
        this.f113776f = i12;
        this.f113777g = i13;
        this.f113778h = i14;
        this.f113779i = bArr;
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
        if (obj != null && nb2.class == obj.getClass()) {
            nb2 nb2Var = (nb2) obj;
            if (this.f113772b == nb2Var.f113772b && this.f113773c.equals(nb2Var.f113773c) && this.f113774d.equals(nb2Var.f113774d) && this.f113775e == nb2Var.f113775e && this.f113776f == nb2Var.f113776f && this.f113777g == nb2Var.f113777g && this.f113778h == nb2Var.f113778h && Arrays.equals(this.f113779i, nb2Var.f113779i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f113779i) + ((((((((j4.a(this.f113774d, j4.a(this.f113773c, (this.f113772b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f113775e) * 31) + this.f113776f) * 31) + this.f113777g) * 31) + this.f113778h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f113773c + ", description=" + this.f113774d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f113772b);
        parcel.writeString(this.f113773c);
        parcel.writeString(this.f113774d);
        parcel.writeInt(this.f113775e);
        parcel.writeInt(this.f113776f);
        parcel.writeInt(this.f113777g);
        parcel.writeInt(this.f113778h);
        parcel.writeByteArray(this.f113779i);
    }

    @Override // yads.er1
    public final void a(uk1 uk1Var) {
        byte[] bArr = this.f113779i;
        int i10 = this.f113772b;
        if (uk1Var.f116686j == null || w83.a((Object) Integer.valueOf(i10), (Object) 3) || !w83.a((Object) uk1Var.f116687k, (Object) 3)) {
            uk1Var.f116686j = (byte[]) bArr.clone();
            uk1Var.f116687k = Integer.valueOf(i10);
        }
    }

    public nb2(Parcel parcel) {
        this.f113772b = parcel.readInt();
        this.f113773c = (String) w83.a((Object) parcel.readString());
        this.f113774d = (String) w83.a((Object) parcel.readString());
        this.f113775e = parcel.readInt();
        this.f113776f = parcel.readInt();
        this.f113777g = parcel.readInt();
        this.f113778h = parcel.readInt();
        this.f113779i = (byte[]) w83.a((Object) parcel.createByteArray());
    }
}
