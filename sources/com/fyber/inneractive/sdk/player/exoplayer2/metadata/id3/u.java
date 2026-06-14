package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends o {
    public static final Parcelable.Creator<u> CREATOR = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22787c;

    public u(String str, String str2, String str3) {
        super(str);
        this.f22786b = str2;
        this.f22787c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f22781a.equals(uVar.f22781a) && z.a(this.f22786b, uVar.f22786b) && z.a(this.f22787c, uVar.f22787c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22781a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f22786b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22787c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22781a);
        parcel.writeString(this.f22786b);
        parcel.writeString(this.f22787c);
    }

    public u(Parcel parcel) {
        super(parcel.readString());
        this.f22786b = parcel.readString();
        this.f22787c = parcel.readString();
    }
}
