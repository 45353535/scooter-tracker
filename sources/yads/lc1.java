package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class lc1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<lc1> CREATOR = new kc1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113038d;

    public lc1(String str, String str2, boolean z10) {
        this.f113036b = str;
        this.f113037c = str2;
        this.f113038d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc1)) {
            return false;
        }
        lc1 lc1Var = (lc1) obj;
        return Intrinsics.areEqual(this.f113036b, lc1Var.f113036b) && Intrinsics.areEqual(this.f113037c, lc1Var.f113037c) && this.f113038d == lc1Var.f113038d;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f113038d) + j4.a(this.f113037c, this.f113036b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.f113036b + ", url=" + this.f113037c + ", browserOptional=" + this.f113038d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f113036b);
        parcel.writeString(this.f113037c);
        parcel.writeInt(this.f113038d ? 1 : 0);
    }
}
