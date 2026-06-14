package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23201e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f23197a = i10;
        this.f23198b = i11;
        this.f23199c = i12;
        this.f23200d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f23197a == cVar.f23197a && this.f23198b == cVar.f23198b && this.f23199c == cVar.f23199c && Arrays.equals(this.f23200d, cVar.f23200d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f23201e == 0) {
            this.f23201e = Arrays.hashCode(this.f23200d) + ((((((this.f23197a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f23198b) * 31) + this.f23199c) * 31);
        }
        return this.f23201e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f23197a);
        sb2.append(", ");
        sb2.append(this.f23198b);
        sb2.append(", ");
        sb2.append(this.f23199c);
        sb2.append(", ");
        sb2.append(this.f23200d != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23197a);
        parcel.writeInt(this.f23198b);
        parcel.writeInt(this.f23199c);
        parcel.writeInt(this.f23200d != null ? 1 : 0);
        byte[] bArr = this.f23200d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public c(Parcel parcel) {
        this.f23197a = parcel.readInt();
        this.f23198b = parcel.readInt();
        this.f23199c = parcel.readInt();
        this.f23200d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
