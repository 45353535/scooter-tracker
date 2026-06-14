package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationFilter f78692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheArguments f78693b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f78692a = locationFilter;
        this.f78693b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f78692a, iVar.f78692a) && Intrinsics.areEqual(this.f78693b, iVar.f78693b);
    }

    public final int hashCode() {
        return this.f78693b.hashCode() + (this.f78692a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f78692a + ", cacheArguments=" + this.f78693b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
