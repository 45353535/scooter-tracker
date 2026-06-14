package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5631z implements Parcelable {

    @NotNull
    public static final C5630y CREATOR = new C5630y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79052a;

    public C5631z(boolean z10) {
        this.f79052a = z10;
    }

    public final boolean a() {
        return this.f79052a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f79052a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f79052a ? (byte) 1 : (byte) 0);
    }

    public C5631z(h0 h0Var) {
        this(h0Var.a());
    }
}
