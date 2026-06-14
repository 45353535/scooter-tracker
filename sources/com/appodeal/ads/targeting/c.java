package com.appodeal.ads.targeting;

import com.appodeal.ads.initializing.j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f14884b;

    public c(j networkRegistry, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(networkRegistry, "networkRegistry");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f14883a = networkRegistry;
        this.f14884b = scope;
    }
}
