package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.i0;
import com.moloco.sdk.internal.publisher.n;
import com.moloco.sdk.internal.publisher.nativead.c;
import com.moloco.sdk.internal.publisher.r0;
import com.moloco.sdk.internal.publisher.t;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements NativeAd, i0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f54856q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f54857r = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f54859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.a f54860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f54861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f54862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0 f54863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f54864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f54865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public NativeAd.InteractionListener f54867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdFormatType f54868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CoroutineScope f54869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.acm.f f54870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f54871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Job f54872p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.b$b, reason: collision with other inner class name */
    public static final class C0670b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54873r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f54874s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f54876u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f54877v;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.b$b$a */
        public /* synthetic */ class a extends y implements Function0 {
            public a(Object obj) {
                super(0, obj, b.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0);
            }

            public final void a() {
                ((b) this.receiver).handleGeneralAdClick();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0670b(AdLoad.Listener listener, String str, Continuation continuation) {
            super(2, continuation);
            this.f54876u = listener;
            this.f54877v = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0670b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0670b(this.f54876u, this.f54877v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            r0 r0Var;
            Object objL;
            Object objG = pf.b.g();
            int i10 = this.f54874s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                b bVar = b.this;
                r0 r0VarB = bVar.b(bVar.f54870n, this.f54876u);
                c cVar = b.this.f54859c;
                String str = this.f54877v;
                com.moloco.sdk.acm.f fVar = b.this.f54870n;
                this.f54873r = r0VarB;
                this.f54874s = 1;
                Object objL2 = cVar.l(str, fVar, r0VarB, this);
                if (objL2 == objG) {
                    return objG;
                }
                r0Var = r0VarB;
                objL = objL2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0Var = (r0) this.f54873r;
                kotlin.d.b(obj);
                objL = ((Result) obj).l();
            }
            Throwable thG = Result.g(objL);
            if (thG != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "Failed to load native ad.", thG, false, 8, null);
                return Unit.f93236a;
            }
            c.b bVar2 = (c.b) objL;
            b bVar3 = b.this;
            bVar3.d(new f(bVar3.f54858b, bVar2.a(), bVar2.b(), bVar3.f54861e, bVar3.f54862f, bVar3.f54868l, bVar3.f54864h, bVar3.f54863g, bVar3.f54866j));
            bVar3.getAssets().e(bVar2.c());
            bVar3.getAssets().f(new a(bVar3));
            r0Var.b(MolocoAdKt.createAdInfo$default(bVar3.f54858b, kotlin.coroutines.jvm.internal.b.c(bVar2.a().getPrice()), null, 4, null), bVar2.a().getExt().getSdkEvents());
            return Unit.f93236a;
        }
    }

    public b(String adUnitId, c nativeAdLoader, com.moloco.sdk.internal.publisher.nativead.a assets, q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, t0 externalLinkHandler, l persistentHttpRequest, n createLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54858b = adUnitId;
        this.f54859c = nativeAdLoader;
        this.f54860d = assets;
        this.f54861e = appLifecycleTrackerService;
        this.f54862f = customUserEventBuilderService;
        this.f54863g = externalLinkHandler;
        this.f54864h = persistentHttpRequest;
        this.f54865i = createLoadTimeoutManager;
        this.f54866j = metricsRecorder;
        this.f54868l = AdFormatType.NATIVE;
        this.f54869m = i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f54870n = metricsRecorder.c(com.moloco.sdk.internal.client_metrics_data.d.f54191k.g());
    }

    public final r0 b(com.moloco.sdk.acm.f fVar, AdLoad.Listener listener) {
        return t.a(listener, fVar, this.f54868l, this.f54866j);
    }

    public final void d(f fVar) {
        this.f54871o = fVar;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        i.f(this.f54869m, null, 1, null);
        getAssets().c();
        setInteractionListener(null);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public NativeAd.InteractionListener getInteractionListener() {
        return this.f54867k;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleGeneralAdClick() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        f fVar = this.f54871o;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleImpression() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        f fVar = this.f54871o;
        if (fVar != null) {
            fVar.f();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return getAssets().g() != null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.publisher.nativead.a getAssets() {
        return this.f54860d;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public synchronized void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Job job = this.f54872p;
        if (job != null && job.isActive()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            this.f54872p = eg.i.d(this.f54869m, null, null, new C0670b(listener, bidResponseJson, null), 3, null);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.i0
    public void setCreateAdObjectStartTime(long j10) {
        this.f54865i.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void setInteractionListener(NativeAd.InteractionListener interactionListener) {
        this.f54867k = interactionListener;
    }
}
