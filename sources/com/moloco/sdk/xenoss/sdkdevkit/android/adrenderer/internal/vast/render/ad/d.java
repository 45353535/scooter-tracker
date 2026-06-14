package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import hg.g0;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateFlow f57685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f57686c;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57687r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57688s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Continuation continuation) {
            return ((a) create(kVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f57688s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f57687r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            k kVar = (k) this.f57688s;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f fVarA = kVar instanceof k.a ? ((k.a) kVar).a() : kVar instanceof k.b ? ((k.b) kVar).a() : null;
            if (fVarA == null) {
                return Unit.f93236a;
            }
            fVarA.reset();
            return Unit.f93236a;
        }
    }

    public d(StateFlow currentPlaylistItem, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(currentPlaylistItem, "currentPlaylistItem");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f57685b = currentPlaylistItem;
        hg.i.T(hg.i.K(currentPlaylistItem, new a(null)), scope, g0.f73226a.c(), null);
        this.f57686c = l0.a(d.a.c.f58160a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        k kVar = (k) this.f57685b.getValue();
        if (kVar instanceof k.a) {
            return ((k.a) kVar).a().l();
        }
        if (kVar instanceof k.b) {
            return ((k.b) kVar).a().l();
        }
        if (kVar instanceof k.c) {
            return ((k.c) kVar).a().l();
        }
        if (kVar instanceof k.d) {
            return ((k.d) kVar).a().l();
        }
        if (kVar == null) {
            return this.f57686c;
        }
        throw new m();
    }
}
