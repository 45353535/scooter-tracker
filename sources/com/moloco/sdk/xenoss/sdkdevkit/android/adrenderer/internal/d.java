package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f55979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f55980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f55982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlow f55983g;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55984r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f55986t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l.a f55987u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, l.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f55986t = j10;
            this.f55987u = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new a(this.f55986t, this.f55987u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55984r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = d.this.f55980d;
                String str = d.this.f55978b;
                long j10 = this.f55986t;
                this.f55984r = 1;
                obj = aVar.b(str, j10, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            com.moloco.sdk.internal.h0 h0Var = (com.moloco.sdk.internal.h0) obj;
            if (h0Var instanceof h0.b) {
                d.this.f55982f.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                l.a aVar2 = this.f55987u;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                l.a aVar3 = this.f55987u;
                if (aVar3 != null) {
                    aVar3.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((h0.a) h0Var).a());
                }
            }
            return Unit.f93236a;
        }
    }

    public d(String adm, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(staticWebView, "staticWebView");
        this.f55978b = adm;
        this.f55979c = scope;
        this.f55980d = staticWebView;
        this.f55981e = "StaticAdLoad";
        MutableStateFlow mutableStateFlowA = hg.l0.a(Boolean.FALSE);
        this.f55982f = mutableStateFlowA;
        this.f55983g = mutableStateFlowA;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f55983g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        eg.i.d(this.f55979c, null, null, new a(j10, aVar, null), 3, null);
    }
}
