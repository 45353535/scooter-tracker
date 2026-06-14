package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends o {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o[] f22763g;

    public f(String str, int i10, int i11, long j10, long j11, o[] oVarArr) {
        super("CHAP");
        this.f22758b = str;
        this.f22759c = i10;
        this.f22760d = i11;
        this.f22761e = j10;
        this.f22762f = j11;
        this.f22763g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f22759c == fVar.f22759c && this.f22760d == fVar.f22760d && this.f22761e == fVar.f22761e && this.f22762f == fVar.f22762f && z.a(this.f22758b, fVar.f22758b) && Arrays.equals(this.f22763g, fVar.f22763g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f22759c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f22760d) * 31) + ((int) this.f22761e)) * 31) + ((int) this.f22762f)) * 31;
        String str = this.f22758b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22758b);
        parcel.writeInt(this.f22759c);
        parcel.writeInt(this.f22760d);
        parcel.writeLong(this.f22761e);
        parcel.writeLong(this.f22762f);
        parcel.writeInt(this.f22763g.length);
        for (o oVar : this.f22763g) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public f(Parcel parcel) {
        super("CHAP");
        this.f22758b = parcel.readString();
        this.f22759c = parcel.readInt();
        this.f22760d = parcel.readInt();
        this.f22761e = parcel.readLong();
        this.f22762f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f22763g = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22763g[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
