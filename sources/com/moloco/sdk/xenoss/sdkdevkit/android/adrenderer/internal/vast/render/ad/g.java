package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57734r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Flow f57735s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f57736t;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a, reason: collision with other inner class name */
        public static final class C0749a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f57737r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f57738s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ MutableStateFlow f57739t;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a$a, reason: collision with other inner class name */
            public static final class C0750a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MutableStateFlow f57740b;

                public C0750a(MutableStateFlow mutableStateFlow) {
                    this.f57740b = mutableStateFlow;
                }

                public final Object a(boolean z10, Continuation continuation) {
                    this.f57740b.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                    return Unit.f93236a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((Boolean) obj).booleanValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0749a(MutableStateFlow mutableStateFlow, Continuation continuation) {
                super(2, continuation);
                this.f57739t = mutableStateFlow;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k kVar, Continuation continuation) {
                return ((C0749a) create(kVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C0749a c0749a = new C0749a(this.f57739t, continuation);
                c0749a.f57738s = obj;
                return c0749a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f57737r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    k kVar = (k) this.f57738s;
                    if (!(kVar instanceof k.c)) {
                        this.f57739t.setValue(null);
                        return Unit.f93236a;
                    }
                    StateFlow stateFlowIsPlaying = ((k.c) kVar).a().isPlaying();
                    C0750a c0750a = new C0750a(this.f57739t);
                    this.f57737r = 1;
                    if (stateFlowIsPlaying.collect(c0750a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                throw new lf.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, MutableStateFlow mutableStateFlow, Continuation continuation) {
            super(2, continuation);
            this.f57735s = flow;
            this.f57736t = mutableStateFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57735s, this.f57736t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57734r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow flow = this.f57735s;
                C0749a c0749a = new C0749a(this.f57736t, null);
                this.f57734r = 1;
                if (hg.i.l(flow, c0749a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g mraidAdData, t0 externalLinkHandler, Context context, q mraidFullscreenContentController, int i10, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, n linkHandler) {
        Intrinsics.checkNotNullParameter(mraidAdData, "mraidAdData");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        return new f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(mraidAdData, mraidFullscreenContentController, i10, context, externalLinkHandler, customUserEventBuilderService, linkHandler), null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a ad2, t0 externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, n linkHandler) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        return new f(j.a(ad2, externalLinkHandler, context, customUserEventBuilderService, z10, bool, i10, i11, i12, z11, z12, linkHandler), new h(ad2.f(), ad2.g().i().b(), ad2.e(), null, 8, null));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a g(List list, k kVar) {
        k kVar2 = (k) CollectionsKt.getOrNull(list, CollectionsKt.indexOf((List<? extends k>) list, kVar) + 1);
        k.b bVar = kVar2 instanceof k.b ? (k.b) kVar2 : null;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static final a.AbstractC0780a.c.EnumC0782a h(List list, k kVar, a.AbstractC0780a.c.EnumC0782a enumC0782a) {
        return (enumC0782a != a.AbstractC0780a.c.EnumC0782a.f58912d || g(list, kVar) == null) ? enumC0782a : a.AbstractC0780a.c.EnumC0782a.f58913e;
    }

    public static final a.AbstractC0780a.c i(List list, k kVar, a.AbstractC0780a.c cVar) {
        a.AbstractC0780a.c.EnumC0782a enumC0782aH = h(list, kVar, cVar.c());
        return enumC0782aH == cVar.c() ? cVar : a.AbstractC0780a.c.b(cVar, enumC0782aH, null, null, 6, null);
    }

    public static final Flow j(Flow flow, CoroutineScope coroutineScope) {
        MutableStateFlow mutableStateFlowA = l0.a(null);
        eg.i.d(coroutineScope, null, null, new a(flow, mutableStateFlowA, null), 3, null);
        return mutableStateFlowA;
    }
}
