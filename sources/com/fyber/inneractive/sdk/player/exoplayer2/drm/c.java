package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f21725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21728e;

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f21725b = uuid;
        this.f21726c = str;
        bArr.getClass();
        this.f21727d = bArr;
        this.f21728e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.f21726c.equals(cVar.f21726c) && z.a(this.f21725b, cVar.f21725b) && Arrays.equals(this.f21727d, cVar.f21727d);
    }

    public final int hashCode() {
        if (this.f21724a == 0) {
            this.f21724a = Arrays.hashCode(this.f21727d) + ((this.f21726c.hashCode() + (this.f21725b.hashCode() * 31)) * 31);
        }
        return this.f21724a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21725b.getMostSignificantBits());
        parcel.writeLong(this.f21725b.getLeastSignificantBits());
        parcel.writeString(this.f21726c);
        parcel.writeByteArray(this.f21727d);
        parcel.writeByte(this.f21728e ? (byte) 1 : (byte) 0);
    }

    public c(Parcel parcel) {
        this.f21725b = new UUID(parcel.readLong(), parcel.readLong());
        this.f21726c = parcel.readString();
        this.f21727d = parcel.createByteArray();
        this.f21728e = parcel.readByte() != 0;
    }
}
