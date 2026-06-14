package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22785c;

    public s(String str, String str2, String str3) {
        super(str);
        this.f22784b = str2;
        this.f22785c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f22781a.equals(sVar.f22781a) && z.a(this.f22784b, sVar.f22784b) && z.a(this.f22785c, sVar.f22785c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22781a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f22784b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22785c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22781a);
        parcel.writeString(this.f22784b);
        parcel.writeString(this.f22785c);
    }

    public s(Parcel parcel) {
        super(parcel.readString());
        this.f22784b = parcel.readString();
        this.f22785c = parcel.readString();
    }
}
