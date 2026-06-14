package com.appodeal.ads.networking.binders;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14012a;

    public c(LinkedHashMap adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f14012a = adapters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f14012a, ((c) obj).f14012a);
    }

    public final int hashCode() {
        return this.f14012a.hashCode();
    }

    public final String toString() {
        return "Adapters(adapters=" + this.f14012a + ")";
    }
}
