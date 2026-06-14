package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t;
import hg.c0;
import hg.g0;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f58712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f58713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StateFlow f58714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableSharedFlow f58715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f58716f;

    public static final class a extends k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58717r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f58718s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f58719t;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, boolean z11, Continuation continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f58718s = z10;
            aVar.f58719t = z11;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58717r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            boolean z10 = this.f58718s;
            boolean z11 = this.f58719t;
            if (z10 && z11) {
                h.this.f58712b.play();
            } else {
                h.this.f58712b.pause();
            }
            return Unit.f93236a;
        }
    }

    public static final class b extends k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58721r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58722s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f58723t;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, boolean z10, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f58722s = aVar;
            bVar.f58723t = z10;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58721r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f58722s, false, this.f58723t, false, 5, null);
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58724r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58725s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = h.this.new c(continuation);
            cVar.f58725s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58724r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            h.this.f58716f.setValue((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f58725s);
            return Unit.f93236a;
        }
    }

    public h(d basePlayer, t viewVisibilityTracker) {
        Intrinsics.checkNotNullParameter(basePlayer, "basePlayer");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.f58712b = basePlayer;
        CoroutineScope coroutineScopeB = kotlinx.coroutines.i.b();
        this.f58713c = coroutineScopeB;
        StateFlow stateFlowT = hg.i.T(i.b(viewVisibilityTracker, basePlayer.N()), coroutineScopeB, g0.f73226a.c(), Boolean.FALSE);
        this.f58714d = stateFlowT;
        MutableSharedFlow mutableSharedFlowB = c0.b(1, 0, gg.a.f72766c, 2, null);
        this.f58715e = mutableSharedFlowB;
        this.f58716f = l0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) basePlayer.isPlaying().getValue(), false, ((Boolean) stateFlowT.getValue()).booleanValue(), false, 5, null));
        hg.i.F(hg.i.m(stateFlowT, mutableSharedFlowB, new a(null)), coroutineScopeB);
        hg.i.F(hg.i.K(hg.i.m(basePlayer.isPlaying(), stateFlowT, new b(null)), new c(null)), coroutineScopeB);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public View N() {
        return this.f58712b.N();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public Object a(Continuation continuation) {
        return this.f58712b.a(continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void b(boolean z10) {
        this.f58712b.b(z10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f58713c, null, 1, null);
        this.f58712b.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow f() {
        return this.f58712b.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow isPlaying() {
        return this.f58716f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow o() {
        return this.f58712b.o();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void pause() {
        this.f58715e.g(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void play() {
        this.f58715e.g(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void seekTo(long j10) {
        this.f58712b.seekTo(j10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void a(String str) {
        this.f58712b.a(str);
    }
}
