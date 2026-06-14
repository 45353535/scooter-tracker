package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41018a;

    public H0(long j10) {
        this.f41018a = j10;
    }

    public final long a() {
        return this.f41018a;
    }

    public final long b() {
        return this.f41018a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H0) && this.f41018a == ((H0) obj).f41018a;
    }

    public int hashCode() {
        return androidx.collection.b.a(this.f41018a);
    }

    @NotNull
    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f41018a + ")";
    }

    @NotNull
    public final H0 a(long j10) {
        return new H0(j10);
    }

    public static /* synthetic */ H0 a(H0 h02, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = h02.f41018a;
        }
        return h02.a(j10);
    }
}
