package com.moloco.sdk.acm.http;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54074b;

    public h(List counts, List timers) {
        Intrinsics.checkNotNullParameter(counts, "counts");
        Intrinsics.checkNotNullParameter(timers, "timers");
        this.f54073a = counts;
        this.f54074b = timers;
    }

    public final List a() {
        return this.f54073a;
    }

    public final List b() {
        return this.f54074b;
    }
}
