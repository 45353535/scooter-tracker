package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Tc extends Y4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3920o1 f37762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Hc f37763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Ac f37764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tc(C3920o1 adManagerComponent, Hc nativeCallback, Ac stateMachine) {
        super(adManagerComponent, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f37762k = adManagerComponent;
        this.f37763l = nativeCallback;
        this.f37764m = stateMachine;
    }
}
