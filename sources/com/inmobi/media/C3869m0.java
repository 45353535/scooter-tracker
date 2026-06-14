package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3869m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f38999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3945p1 f39000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3617c0 f39001c;

    public C3869m0(CoroutineScope coroutineScope, C3945p1 adManagerContext, C3617c0 adLifecycleData) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.f38999a = coroutineScope;
        this.f39000b = adManagerContext;
        this.f39001c = adLifecycleData;
    }
}
