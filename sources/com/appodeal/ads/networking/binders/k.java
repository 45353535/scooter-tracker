package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f14061a;

    public k(JSONObject customState) {
        Intrinsics.checkNotNullParameter(customState, "customState");
        this.f14061a = customState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f14061a, ((k) obj).f14061a);
    }

    public final int hashCode() {
        return this.f14061a.hashCode();
    }

    public final String toString() {
        return "Segment(customState=" + this.f14061a + ")";
    }
}
