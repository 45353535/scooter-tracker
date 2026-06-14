package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class H implements Parcelable {

    @NotNull
    public static final G CREATOR = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78957b;

    public H(boolean z10, long j10) {
        this.f78956a = z10;
        this.f78957b = j10;
    }

    public final long a() {
        return this.f78957b;
    }

    public final boolean b() {
        return this.f78956a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f78956a + ", delaySeconds=" + this.f78957b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f78956a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f78957b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
