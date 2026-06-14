package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class lv2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<lv2> CREATOR = new kv2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113237b;

    public lv2(String str) {
        this.f113237b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv2) && Intrinsics.areEqual(this.f113237b, ((lv2) obj).f113237b);
    }

    public final int hashCode() {
        return this.f113237b.hashCode();
    }

    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.f113237b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f113237b);
    }
}
