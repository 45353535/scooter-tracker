package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends o {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22757b;

    public d(String str, byte[] bArr) {
        super(str);
        this.f22757b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f22781a.equals(dVar.f22781a) && Arrays.equals(this.f22757b, dVar.f22757b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22757b) + ((this.f22781a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22781a);
        parcel.writeByteArray(this.f22757b);
    }

    public d(Parcel parcel) {
        super(parcel.readString());
        this.f22757b = parcel.createByteArray();
    }
}
