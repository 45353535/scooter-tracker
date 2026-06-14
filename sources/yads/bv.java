package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class bv implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<bv> CREATOR = new av();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109121c;

    public bv(int i10, String str) {
        this.f109120b = i10;
        this.f109121c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        return this.f109120b == bvVar.f109120b && Intrinsics.areEqual(this.f109121c, bvVar.f109121c);
    }

    public final int hashCode() {
        return this.f109121c.hashCode() + (this.f109120b * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f109120b + ", rewardType=" + this.f109121c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f109120b);
        parcel.writeString(this.f109121c);
    }
}
