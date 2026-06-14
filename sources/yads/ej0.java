package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ej0 implements Parcelable {
    public static final Parcelable.Creator<ej0> CREATOR = new dj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f110384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f110386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f110387f;

    public ej0(Parcel parcel) {
        this.f110384c = new UUID(parcel.readLong(), parcel.readLong());
        this.f110385d = parcel.readString();
        this.f110386e = (String) w83.a((Object) parcel.readString());
        this.f110387f = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return ar.f108751a.equals(this.f110384c) || uuid.equals(this.f110384c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ej0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ej0 ej0Var = (ej0) obj;
        return w83.a(this.f110385d, ej0Var.f110385d) && w83.a(this.f110386e, ej0Var.f110386e) && w83.a(this.f110384c, ej0Var.f110384c) && Arrays.equals(this.f110387f, ej0Var.f110387f);
    }

    public final int hashCode() {
        if (this.f110383b == 0) {
            int iHashCode = this.f110384c.hashCode() * 31;
            String str = this.f110385d;
            this.f110383b = Arrays.hashCode(this.f110387f) + j4.a(this.f110386e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f110383b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f110384c.getMostSignificantBits());
        parcel.writeLong(this.f110384c.getLeastSignificantBits());
        parcel.writeString(this.f110385d);
        parcel.writeString(this.f110386e);
        parcel.writeByteArray(this.f110387f);
    }

    public ej0(UUID uuid, String str, String str2, byte[] bArr) {
        this.f110384c = (UUID) fi.a(uuid);
        this.f110385d = str;
        this.f110386e = (String) fi.a((Object) str2);
        this.f110387f = bArr;
    }
}
