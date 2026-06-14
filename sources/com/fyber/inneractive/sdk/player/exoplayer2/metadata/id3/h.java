package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends o {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f22767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o[] f22768f;

    public h(String str, boolean z10, boolean z11, String[] strArr, o[] oVarArr) {
        super("CTOC");
        this.f22764b = str;
        this.f22765c = z10;
        this.f22766d = z11;
        this.f22767e = strArr;
        this.f22768f = oVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f22765c == hVar.f22765c && this.f22766d == hVar.f22766d && z.a(this.f22764b, hVar.f22764b) && Arrays.equals(this.f22767e, hVar.f22767e) && Arrays.equals(this.f22768f, hVar.f22768f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f22765c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f22766d ? 1 : 0)) * 31;
        String str = this.f22764b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22764b);
        parcel.writeByte(this.f22765c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22766d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f22767e);
        parcel.writeInt(this.f22768f.length);
        int i11 = 0;
        while (true) {
            o[] oVarArr = this.f22768f;
            if (i11 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i11], 0);
            i11++;
        }
    }

    public h(Parcel parcel) {
        super("CTOC");
        this.f22764b = parcel.readString();
        this.f22765c = parcel.readByte() != 0;
        this.f22766d = parcel.readByte() != 0;
        this.f22767e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f22768f = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22768f[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
