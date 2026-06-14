package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class D implements Parcelable {

    @NotNull
    public static final C CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f78952b;

    public D(boolean z10, F f10) {
        this.f78951a = z10;
        this.f78952b = f10;
    }

    public final F a() {
        return this.f78952b;
    }

    public final boolean b() {
        return this.f78951a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f78951a + ", config=" + this.f78952b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f78951a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f78952b, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(j0 j0Var) {
        boolean zB = j0Var.b();
        k0 k0VarA = j0Var.a();
        this(zB, k0VarA != null ? new F(k0VarA) : null);
    }
}
