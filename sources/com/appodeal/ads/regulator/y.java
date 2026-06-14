package com.appodeal.ads.regulator;

import hg.c0;
import hg.l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.appodeal.ads.context.o f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.regulator.usecases.h f14412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.ads.regulator.usecases.d f14413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f14414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f14415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableSharedFlow f14416f;

    public y(com.appodeal.ads.context.o contextProvider, com.appodeal.ads.regulator.usecases.h loadConsent, com.appodeal.ads.regulator.usecases.d loadConsentForm, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(loadConsent, "loadConsent");
        Intrinsics.checkNotNullParameter(loadConsentForm, "loadConsentForm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f14411a = contextProvider;
        this.f14412b = loadConsent;
        this.f14413c = loadConsentForm;
        this.f14414d = scope;
        MutableStateFlow mutableStateFlowA = l0.a(j.f14360a);
        this.f14415e = mutableStateFlowA;
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f14416f = mutableSharedFlowB;
        hg.i.F(hg.i.K(hg.i.Q(mutableSharedFlowB, mutableStateFlowA.getValue(), new q(this, null)), new r(this, null)), scope);
    }

    public final void b(g gVar) {
        eg.i.d(this.f14414d, null, null, new v(this, gVar, null), 3, null);
    }
}
