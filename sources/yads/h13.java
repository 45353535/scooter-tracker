package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class h13 implements Comparable, Parcelable {
    public static final Parcelable.Creator<h13> CREATOR = new g13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111440d;

    public h13(int i10, int i11, int i12) {
        this.f111438b = i10;
        this.f111439c = i11;
        this.f111440d = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h13 h13Var = (h13) obj;
        int i10 = this.f111438b - h13Var.f111438b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f111439c - h13Var.f111439c;
        return i11 == 0 ? this.f111440d - h13Var.f111440d : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h13.class == obj.getClass()) {
            h13 h13Var = (h13) obj;
            if (this.f111438b == h13Var.f111438b && this.f111439c == h13Var.f111439c && this.f111440d == h13Var.f111440d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f111438b * 31) + this.f111439c) * 31) + this.f111440d;
    }

    public final String toString() {
        return this.f111438b + "." + this.f111439c + "." + this.f111440d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f111438b);
        parcel.writeInt(this.f111439c);
        parcel.writeInt(this.f111440d);
    }

    public h13(Parcel parcel) {
        this.f111438b = parcel.readInt();
        this.f111439c = parcel.readInt();
        this.f111440d = parcel.readInt();
    }
}
