package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONArray f14074a;

    public o(JSONArray previousSessions) {
        Intrinsics.checkNotNullParameter(previousSessions, "previousSessions");
        this.f14074a = previousSessions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f14074a, ((o) obj).f14074a);
    }

    public final int hashCode() {
        return this.f14074a.hashCode();
    }

    public final String toString() {
        return "Sessions(previousSessions=" + this.f14074a + ")";
    }
}
