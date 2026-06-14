package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class F implements Parcelable {

    @NotNull
    public static final E CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5631z f78953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f78954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f78955c;

    public F(C5631z c5631z, H h10, B b10) {
        this.f78953a = c5631z;
        this.f78954b = h10;
        this.f78955c = b10;
    }

    public final C5631z a() {
        return this.f78953a;
    }

    public final B b() {
        return this.f78955c;
    }

    public final H c() {
        return this.f78954b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f78953a + ", serviceCaptorConfig=" + this.f78954b + ", contentObserverCaptorConfig=" + this.f78955c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f78953a, i10);
        parcel.writeParcelable(this.f78954b, i10);
        parcel.writeParcelable(this.f78955c, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(k0 k0Var) {
        h0 h0VarA = k0Var.a();
        C5631z c5631z = h0VarA != null ? new C5631z(h0VarA) : null;
        l0 l0VarC = k0Var.c();
        H h10 = l0VarC != null ? new H(l0VarC) : null;
        i0 i0VarB = k0Var.b();
        this(c5631z, h10, i0VarB != null ? new B(i0VarB) : null);
    }
}
