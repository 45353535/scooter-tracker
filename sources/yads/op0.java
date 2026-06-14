package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class op0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<op0> CREATOR = new np0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f114383c;

    public op0(String str, long j10) {
        this.f114382b = str;
        this.f114383c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op0)) {
            return false;
        }
        op0 op0Var = (op0) obj;
        return Intrinsics.areEqual(this.f114382b, op0Var.f114382b) && this.f114383c == op0Var.f114383c;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f114383c) + (this.f114382b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.f114382b + ", interval=" + this.f114383c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f114382b);
        parcel.writeLong(this.f114383c);
    }
}
