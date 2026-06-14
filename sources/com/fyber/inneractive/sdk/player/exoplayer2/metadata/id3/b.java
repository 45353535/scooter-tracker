package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends o {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f22756e;

    public b(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f22753b = str;
        this.f22754c = str2;
        this.f22755d = i10;
        this.f22756e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f22755d == bVar.f22755d && z.a(this.f22753b, bVar.f22753b) && z.a(this.f22754c, bVar.f22754c) && Arrays.equals(this.f22756e, bVar.f22756e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f22755d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f22753b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22754c;
        return Arrays.hashCode(this.f22756e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22753b);
        parcel.writeString(this.f22754c);
        parcel.writeInt(this.f22755d);
        parcel.writeByteArray(this.f22756e);
    }

    public b(Parcel parcel) {
        super("APIC");
        this.f22753b = parcel.readString();
        this.f22754c = parcel.readString();
        this.f22755d = parcel.readInt();
        this.f22756e = parcel.createByteArray();
    }
}
