package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5617k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79024c;

    public C5617k(boolean z10, List list, long j10) {
        this.f79022a = z10;
        this.f79023b = list;
        this.f79024c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5617k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C5617k c5617k = (C5617k) obj;
        return this.f79022a == c5617k.f79022a && Intrinsics.areEqual(this.f79023b, c5617k.f79023b) && this.f79024c == c5617k.f79024c;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f79024c) + ((this.f79023b.hashCode() + (androidx.compose.foundation.c.a(this.f79022a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f79022a + ", mediaStoreColumnNames=" + this.f79023b + ", detectWindowSeconds=" + this.f79024c + ')';
    }

    public C5617k(B b10) {
        this(b10.b(), b10.c(), b10.a());
    }
}
