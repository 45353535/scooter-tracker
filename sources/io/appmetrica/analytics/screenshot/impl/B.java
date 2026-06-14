package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class B implements Parcelable {

    @NotNull
    public static final A CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78950c;

    public B(boolean z10, List list, long j10) {
        this.f78948a = z10;
        this.f78949b = list;
        this.f78950c = j10;
    }

    public final long a() {
        return this.f78950c;
    }

    public final boolean b() {
        return this.f78948a;
    }

    public final List c() {
        return this.f78949b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f78948a + ", mediaStoreColumnNames=" + this.f78949b + ", detectWindowSeconds=" + this.f78950c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f78948a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f78949b);
        parcel.writeLong(this.f78950c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
