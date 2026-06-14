package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f36755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36756b;

    public Dn(CoroutineScope coroutineScope, int i10) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36755a = coroutineScope;
        this.f36756b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dn)) {
            return false;
        }
        Dn dn = (Dn) obj;
        return Intrinsics.areEqual(this.f36755a, dn.f36755a) && this.f36756b == dn.f36756b;
    }

    public final int hashCode() {
        return this.f36756b + (this.f36755a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f36755a + ", impressionMinDuration=" + this.f36756b + ")";
    }
}
