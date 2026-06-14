package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 {

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {
        public a(Object obj) {
            super(1, obj, b.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((b) this.receiver).e0(continuation);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f58729o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar, MutableStateFlow mutableStateFlow, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0 a0Var) {
            super(context, str, a0Var, null, null, null, t0Var, false, mVar, 184, null);
            this.f58729o = mutableStateFlow;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
        public void p0() {
            super.p0();
            this.f58729o.setValue(Boolean.FALSE);
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function0 {
        public c(Object obj) {
            super(0, obj, b.class, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", 0);
        }

        public final void a() {
            ((b) this.receiver).p0();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u a(Context context, com.moloco.sdk.internal.ortb.model.e bid, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return s.b(context, bid, b.g.f55823a.b().d(), watermark, metricsRecorder, null, null, 96, null);
    }

    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adm, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        return i.a(context, customUserEventBuilderService, adm, externalLinkHandler, watermark);
    }

    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u c(Context context, CoroutineScope scope, com.moloco.sdk.internal.ortb.model.e bid, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, MutableStateFlow isAdDisplaying, boolean z10, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(isAdDisplaying, "isAdDisplaying");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.a(context, scope, z10);
        b bVar = new b(context, externalLinkHandler, mVarA, isAdDisplaying, bid.getAdm(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0.f56371d);
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a.a(context, watermark, new y0(scope, bid, b.a.f55792a.a(), new a(bVar)), bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s(true, new c(bVar), scope, lf.t.c(kotlin.ranges.g.e(0, 0)), mVarA.c(), mVarA.v(), null, 64, null), MraidActivity.INSTANCE, bid.getBundle(), metricsRecorder);
    }
}
