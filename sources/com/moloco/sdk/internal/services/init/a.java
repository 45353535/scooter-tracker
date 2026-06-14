package com.moloco.sdk.internal.services.init;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55607a;

    public a(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f55607a = appKey;
    }

    public final String a() {
        return this.f55607a;
    }

    public final String b() {
        return this.f55607a + "___v1";
    }

    public final List c() {
        return CollectionsKt.emptyList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f55607a, ((a) obj).f55607a);
    }

    public int hashCode() {
        return this.f55607a.hashCode();
    }

    public String toString() {
        return "CacheKey(appKey=" + this.f55607a + ')';
    }
}
