package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class lo2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<lo2> CREATOR = new jo2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv f113180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lv2 f113181d;

    public lo2(boolean z10, bv bvVar, lv2 lv2Var) {
        this.f113179b = z10;
        this.f113180c = bvVar;
        this.f113181d = lv2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo2)) {
            return false;
        }
        lo2 lo2Var = (lo2) obj;
        return this.f113179b == lo2Var.f113179b && Intrinsics.areEqual(this.f113180c, lo2Var.f113180c) && Intrinsics.areEqual(this.f113181d, lo2Var.f113181d);
    }

    public final int hashCode() {
        int iA = androidx.compose.foundation.c.a(this.f113179b) * 31;
        bv bvVar = this.f113180c;
        int iHashCode = (iA + (bvVar == null ? 0 : bvVar.hashCode())) * 31;
        lv2 lv2Var = this.f113181d;
        return iHashCode + (lv2Var != null ? lv2Var.f113237b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f113179b + ", clientSideReward=" + this.f113180c + ", serverSideReward=" + this.f113181d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f113179b ? 1 : 0);
        bv bvVar = this.f113180c;
        if (bvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bvVar.f109120b);
            parcel.writeString(bvVar.f109121c);
        }
        lv2 lv2Var = this.f113181d;
        if (lv2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lv2Var.f113237b);
        }
    }
}
