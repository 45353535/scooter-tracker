package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends o {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f22775e;

    public l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f22772b = str;
        this.f22773c = str2;
        this.f22774d = str3;
        this.f22775e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (z.a(this.f22772b, lVar.f22772b) && z.a(this.f22773c, lVar.f22773c) && z.a(this.f22774d, lVar.f22774d) && Arrays.equals(this.f22775e, lVar.f22775e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22772b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f22773c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22774d;
        return Arrays.hashCode(this.f22775e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22772b);
        parcel.writeString(this.f22773c);
        parcel.writeString(this.f22774d);
        parcel.writeByteArray(this.f22775e);
    }

    public l(Parcel parcel) {
        super("GEOB");
        this.f22772b = parcel.readString();
        this.f22773c = parcel.readString();
        this.f22774d = parcel.readString();
        this.f22775e = parcel.createByteArray();
    }
}
