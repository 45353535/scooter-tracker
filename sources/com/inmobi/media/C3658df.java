package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3658df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38446a;

    public C3658df(Map requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f38446a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3658df) && Intrinsics.areEqual(this.f38446a, ((C3658df) obj).f38446a);
    }

    public final int hashCode() {
        return this.f38446a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f38446a + ")";
    }
}
