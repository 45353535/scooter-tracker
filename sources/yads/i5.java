package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class i5 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111860b;

    @NotNull
    public static final g5 Companion = new g5();

    @NotNull
    public static final Parcelable.Creator<i5> CREATOR = new h5();

    public i5(String str) {
        this.f111860b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5) && Intrinsics.areEqual(this.f111860b, ((i5) obj).f111860b);
    }

    public final int hashCode() {
        return this.f111860b.hashCode();
    }

    public final String toString() {
        return "AdImpressionData(rawData=" + this.f111860b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f111860b);
    }
}
