package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22783c;

    public q(String str, byte[] bArr) {
        super("PRIV");
        this.f22782b = str;
        this.f22783c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (z.a(this.f22782b, qVar.f22782b) && Arrays.equals(this.f22783c, qVar.f22783c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22782b;
        return Arrays.hashCode(this.f22783c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22782b);
        parcel.writeByteArray(this.f22783c);
    }

    public q(Parcel parcel) {
        super("PRIV");
        this.f22782b = parcel.readString();
        this.f22783c = parcel.createByteArray();
    }
}
