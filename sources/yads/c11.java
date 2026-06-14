package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c11 implements er1 {
    public static final Parcelable.Creator<c11> CREATOR = new b11();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f109175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f109177d;

    public c11(Parcel parcel) {
        this.f109175b = (byte[]) fi.a(parcel.createByteArray());
        this.f109176c = parcel.readString();
        this.f109177d = parcel.readString();
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
        if (obj == null || c11.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f109175b, ((c11) obj).f109175b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f109175b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f109176c + "\", url=\"" + this.f109177d + "\", rawMetadata.length=\"" + this.f109175b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f109175b);
        parcel.writeString(this.f109176c);
        parcel.writeString(this.f109177d);
    }

    @Override // yads.er1
    public final void a(uk1 uk1Var) {
        String str = this.f109176c;
        if (str != null) {
            uk1Var.f116677a = str;
        }
    }

    public c11(byte[] bArr, String str, String str2) {
        this.f109175b = bArr;
        this.f109176c = str;
        this.f109177d = str2;
    }
}
