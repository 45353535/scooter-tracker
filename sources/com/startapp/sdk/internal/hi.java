package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64651a;

    public hi(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f64651a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(hi.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.startapp.sdk.eventtracer.Traceable");
        return Intrinsics.areEqual(this.f64651a, ((hi) obj).f64651a);
    }

    public final int hashCode() {
        return this.f64651a.hashCode();
    }
}
