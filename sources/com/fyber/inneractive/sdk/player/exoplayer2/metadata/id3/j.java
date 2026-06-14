package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends o {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22771d;

    public j(String str, String str2, String str3) {
        super("COMM");
        this.f22769b = str;
        this.f22770c = str2;
        this.f22771d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (z.a(this.f22770c, jVar.f22770c) && z.a(this.f22769b, jVar.f22769b) && z.a(this.f22771d, jVar.f22771d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22769b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f22770c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22771d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22781a);
        parcel.writeString(this.f22769b);
        parcel.writeString(this.f22771d);
    }

    public j(Parcel parcel) {
        super("COMM");
        this.f22769b = parcel.readString();
        this.f22770c = parcel.readString();
        this.f22771d = parcel.readString();
    }
}
