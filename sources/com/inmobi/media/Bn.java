package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4134wg f36641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dn f36642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f36643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cn f36644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f36645e;

    public Bn(C4134wg visibilityTracker, Dn viewabilityTrackerConfig) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(viewabilityTrackerConfig, "viewabilityTrackerConfig");
        this.f36641a = visibilityTracker;
        this.f36642b = viewabilityTrackerConfig;
        this.f36643c = hg.c0.b(0, 0, null, 6, null);
        this.f36644d = new Cn();
    }
}
