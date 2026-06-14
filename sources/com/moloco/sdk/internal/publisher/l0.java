package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C4726c;
import com.moloco.sdk.internal.publisher.l0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.b;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements FullscreenAd, i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.q f54796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f54797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f54799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 f54800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f54801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f54802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AdFormatType f54803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f54804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f54805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineScope f54807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.acm.f f54808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.moloco.sdk.acm.f f54809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AdLoad f54810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q f54811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C4726c f54812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function1 f54813t;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {
        public a(Object obj) {
            super(1, obj, n.class, "calculateTimeout", "calculateTimeout-5sfh64U(J)J", 0);
        }

        public final long a(long j10) {
            return ((n) this.receiver).a(j10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return kotlin.time.b.g(a(((Number) obj).longValue()));
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {
        public b(Object obj) {
            super(1, obj, l0.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l invoke(com.moloco.sdk.internal.ortb.model.e p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((l0) this.receiver).e(p02);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54814r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f54815s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ s0 f54816t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l0 f54817u;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f54818r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ boolean f54819s;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            public final Object c(boolean z10, Continuation continuation) {
                return ((a) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f54819s = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f54818r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f54819s);
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f54820r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ boolean f54821s;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            public final Object c(boolean z10, Continuation continuation) {
                return ((b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(continuation);
                bVar.f54821s = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f54820r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f54821s);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, s0 s0Var, l0 l0Var, Continuation continuation) {
            super(2, continuation);
            this.f54815s = kVar;
            this.f54816t = s0Var;
            this.f54817u = l0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f54815s, this.f54816t, this.f54817u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        
            if (hg.i.y(r7, r1, r6) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f54814r
                r2 = 6
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.d.b(r7)
                goto L5c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.d.b(r7)
                goto L37
            L20:
                kotlin.d.b(r7)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k r7 = r6.f54815s
                kotlinx.coroutines.flow.StateFlow r7 = r7.l()
                com.moloco.sdk.internal.publisher.l0$c$a r1 = new com.moloco.sdk.internal.publisher.l0$c$a
                r1.<init>(r5)
                r6.f54814r = r4
                java.lang.Object r7 = hg.i.y(r7, r1, r6)
                if (r7 != r0) goto L37
                goto L5b
            L37:
                com.moloco.sdk.internal.publisher.s0 r7 = r6.f54816t
                if (r7 == 0) goto L48
                com.moloco.sdk.internal.publisher.l0 r1 = r6.f54817u
                java.lang.String r1 = com.moloco.sdk.internal.publisher.l0.s(r1)
                com.moloco.sdk.publisher.MolocoAd r1 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r1, r5, r5, r2, r5)
                r7.onAdShowSuccess(r1)
            L48:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k r7 = r6.f54815s
                kotlinx.coroutines.flow.StateFlow r7 = r7.l()
                com.moloco.sdk.internal.publisher.l0$c$b r1 = new com.moloco.sdk.internal.publisher.l0$c$b
                r1.<init>(r5)
                r6.f54814r = r3
                java.lang.Object r7 = hg.i.y(r7, r1, r6)
                if (r7 != r0) goto L5c
            L5b:
                return r0
            L5c:
                com.moloco.sdk.internal.publisher.s0 r7 = r6.f54816t
                if (r7 == 0) goto L6d
                com.moloco.sdk.internal.publisher.l0 r0 = r6.f54817u
                java.lang.String r0 = com.moloco.sdk.internal.publisher.l0.s(r0)
                com.moloco.sdk.publisher.MolocoAd r0 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r0, r5, r5, r2, r5)
                r7.onAdHidden(r0)
            L6d:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.l0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54822r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f54824t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f54825u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, AdLoad.Listener listener, Continuation continuation) {
            super(2, continuation);
            this.f54824t = str;
            this.f54825u = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l0.this.new d(this.f54824t, this.f54825u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54822r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            l0.this.f54810q.load(this.f54824t, this.f54825u);
            return Unit.f93236a;
        }
    }

    public static final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f54829b;

        public f(s0 s0Var) {
            this.f54829b = s0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            l0 l0Var = l0.this;
            l0Var.j(com.moloco.sdk.internal.e0.a(l0Var.f54798e, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a() {
            s0 s0Var = this.f54829b;
            if (s0Var != null) {
                s0Var.onAdClicked(MolocoAdKt.createAdInfo$default(l0.this.f54798e, null, null, 6, null));
            }
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54830r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdShowListener f54831s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0 f54832t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdShowListener adShowListener, l0 l0Var, Continuation continuation) {
            super(2, continuation);
            this.f54831s = adShowListener;
            this.f54832t = l0Var;
        }

        public static final com.moloco.sdk.internal.ortb.model.z c(l0 l0Var) {
            return l0Var.q();
        }

        public static final w i(l0 l0Var) {
            return l0Var.a();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f54831s, this.f54832t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54830r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar = null;
            if (this.f54831s != null) {
                k0 k0Var = this.f54832t.f54802i;
                AdShowListener adShowListener = this.f54831s;
                com.moloco.sdk.internal.services.q qVar = this.f54832t.f54796c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = this.f54832t.f54797d;
                final l0 l0Var = this.f54832t;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.internal.publisher.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l0.g.c(l0Var);
                    }
                };
                final l0 l0Var2 = this.f54832t;
                k0Var.d(new com.moloco.sdk.internal.publisher.c(adShowListener, qVar, aVar, function0, new Function0() { // from class: com.moloco.sdk.internal.publisher.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l0.g.i(l0Var2);
                    }
                }, this.f54832t.f54803j, this.f54832t.f54806m));
            } else {
                this.f54832t.f54802i.d(null);
            }
            s0 s0VarI = this.f54832t.f54802i.i();
            if (this.f54832t.f54802i.a() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarA = this.f54832t.f54802i.a();
                if (uVarA instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0) {
                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0) uVarA;
                }
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarA2 = this.f54832t.f54802i.a();
                if (uVarA2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) {
                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) uVarA2;
                }
            }
            if (kVar == null || !this.f54832t.isLoaded()) {
                if (s0VarI != null) {
                    s0VarI.a(com.moloco.sdk.internal.e0.a(this.f54832t.f54798e, MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.s.f55257e));
                }
                return Unit.f93236a;
            }
            if (((Boolean) kVar.l().getValue()).booleanValue()) {
                if (s0VarI != null) {
                    s0VarI.a(com.moloco.sdk.internal.e0.a(this.f54832t.f54798e, MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.s.f55258f));
                }
                return Unit.f93236a;
            }
            this.f54832t.k(kVar, s0VarI);
            if (kVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0) kVar).b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0(), this.f54832t.n(s0VarI));
            } else if (kVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x) kVar).b(this.f54832t.f54811r, this.f54832t.d(s0VarI));
            }
            return Unit.f93236a;
        }
    }

    public l0(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 externalLinkHandler, Function1 generateAggregatedOptions, k0 adDataHolder, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, n adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(generateAggregatedOptions, "generateAggregatedOptions");
        Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54795b = context;
        this.f54796c = appLifecycleTrackerService;
        this.f54797d = customUserEventBuilderService;
        this.f54798e = adUnitId;
        this.f54799f = persistentHttpRequest;
        this.f54800g = externalLinkHandler;
        this.f54801h = generateAggregatedOptions;
        this.f54802i = adDataHolder;
        this.f54803j = adFormatType;
        this.f54804k = watermark;
        this.f54805l = adCreateLoadTimeoutManager;
        this.f54806m = metricsRecorder;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f54807n = coroutineScopeA;
        com.moloco.sdk.acm.f fVarC = metricsRecorder.c(com.moloco.sdk.internal.client_metrics_data.d.f54198r.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f54808o = fVarC.f(strG, lowerCase);
        this.f54810q = r.a(coroutineScopeA, new a(adCreateLoadTimeoutManager), adUnitId, new b(this), adFormatType, b.a.f55792a.b(), metricsRecorder);
        this.f54811r = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q) generateAggregatedOptions.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l e(com.moloco.sdk.internal.ortb.model.e eVar) {
        com.moloco.sdk.internal.ortb.model.x player;
        h(this, null, 1, null);
        com.moloco.sdk.internal.ortb.model.v configs = eVar.getExt().getConfigs();
        if (configs != null ? Intrinsics.areEqual(configs.getServerRenderingEnabled(), Boolean.TRUE) : false) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarC = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w.c(this.f54795b, eVar.getAdm(), new com.moloco.sdk.internal.services.d0(this.f54800g, this.f54797d), this.f54804k, this.f54806m);
            k0 k0Var = this.f54802i;
            k0Var.e(uVarC);
            com.moloco.sdk.internal.ortb.model.f ext = eVar.getExt();
            k0Var.b(ext != null ? ext.getSdkEvents() : null);
            k0Var.c(eVar.getBurl() != null ? new w(eVar.getBurl(), Float.valueOf(eVar.getPrice())) : null);
            return uVarC;
        }
        Function1 function1 = this.f54801h;
        com.moloco.sdk.internal.ortb.model.f ext2 = eVar.getExt();
        this.f54811r = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q) function1.invoke(ext2 != null ? ext2.getPlayer() : null);
        com.moloco.sdk.internal.ortb.model.f ext3 = eVar.getExt();
        this.f54812s = (ext3 == null || (player = ext3.getPlayer()) == null) ? null : player.getAutoStore();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w.b(this.f54795b, this.f54797d, null, eVar, this.f54800g, this.f54804k, this.f54806m, 4, null);
        k0 k0Var2 = this.f54802i;
        k0Var2.e(uVarB);
        com.moloco.sdk.internal.ortb.model.f ext4 = eVar.getExt();
        k0Var2.b(ext4 != null ? ext4.getSdkEvents() : null);
        k0Var2.c(eVar.getBurl() != null ? new w(eVar.getBurl(), Float.valueOf(eVar.getPrice())) : null);
        return uVarB;
    }

    public static /* synthetic */ void h(l0 l0Var, com.moloco.sdk.internal.d0 d0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d0Var = null;
        }
        l0Var.j(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(com.moloco.sdk.internal.d0 d0Var) {
        StateFlow stateFlowL;
        k0 k0Var = this.f54802i;
        Job jobG = k0Var.g();
        if (jobG != null) {
            Job.a.a(jobG, null, 1, null);
        }
        k0Var.f(null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarA = this.f54802i.a();
        boolean z10 = (uVarA == null || (stateFlowL = uVarA.l()) == null || !((Boolean) stateFlowL.getValue()).booleanValue()) ? false : true;
        k0 k0Var2 = this.f54802i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarA2 = k0Var2.a();
        if (uVarA2 != null) {
            uVarA2.destroy();
        }
        k0Var2.e(null);
        k0 k0Var3 = this.f54802i;
        s0 s0VarI = k0Var3.i();
        k0Var3.d(null);
        if (d0Var != null && s0VarI != null) {
            s0VarI.a(d0Var);
        }
        if (z10 && s0VarI != null) {
            s0VarI.onAdHidden(MolocoAdKt.createAdInfo$default(this.f54798e, null, null, 6, null));
        }
        this.f54802i.b(null);
        this.f54802i.c(null);
    }

    public final w a() {
        return this.f54802i.h();
    }

    public final e d(s0 s0Var) {
        return new e(s0Var);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.i.f(this.f54807n, null, 1, null);
        h(this, null, 1, null);
        this.f54813t = null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f54810q.isLoaded();
    }

    public final void k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, s0 s0Var) {
        k0 k0Var = this.f54802i;
        Job jobG = k0Var.g();
        if (jobG != null) {
            Job.a.a(jobG, null, 1, null);
        }
        k0Var.f(eg.i.d(this.f54807n, null, null, new c(kVar, s0Var, this, null), 3, null));
    }

    public final void l(Function1 function1) {
        this.f54813t = function1;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f54806m.a(this.f54808o);
        this.f54809p = this.f54806m.c(com.moloco.sdk.internal.client_metrics_data.d.f54197q.g());
        eg.i.d(this.f54807n, null, null, new d(bidResponseJson, listener, null), 3, null);
    }

    public final f n(s0 s0Var) {
        return new f(s0Var);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r p() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarA = this.f54802i.a();
        if (uVarA != null) {
            return uVarA.getCreativeType();
        }
        return null;
    }

    public final com.moloco.sdk.internal.ortb.model.z q() {
        return this.f54802i.j();
    }

    @Override // com.moloco.sdk.internal.publisher.i0
    public void setCreateAdObjectStartTime(long j10) {
        this.f54805l.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(AdShowListener adShowListener) {
        com.moloco.sdk.acm.f fVar = this.f54809p;
        if (fVar != null) {
            com.moloco.sdk.acm.recorder.a aVar = this.f54806m;
            String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
            String lowerCase = this.f54803j.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            aVar.a(fVar.f(strG, lowerCase));
        }
        com.moloco.sdk.acm.recorder.a aVar2 = this.f54806m;
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.C.g());
        String strG2 = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase2 = this.f54803j.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        aVar2.b(cVar.e(strG2, lowerCase2));
        eg.i.d(this.f54807n, null, null, new g(adShowListener, this, null), 3, null);
    }

    public final Function1 t() {
        return this.f54813t;
    }

    public final Boolean v() {
        StateFlow stateFlowK;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarA = this.f54802i.a();
        if (uVarA == null || (stateFlowK = uVarA.k()) == null) {
            return null;
        }
        return (Boolean) stateFlowK.getValue();
    }

    public static final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f54827b;

        public e(s0 s0Var) {
            this.f54827b = s0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0
        public void a(boolean z10) {
            String strC;
            C4726c c4726c = l0.this.f54812s;
            if (c4726c != null) {
                l0 l0Var = l0.this;
                if (c4726c.getEnabled() && ((!z10 || c4726c.getOnSkip()) && (strC = c4726c.getEventLink()) != null)) {
                    l0Var.f54799f.a(strC);
                }
            }
            Function1 function1T = l0.this.t();
            if (function1T != null) {
                function1T.invoke(Boolean.valueOf(z10));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            l0 l0Var = l0.this;
            l0Var.j(com.moloco.sdk.internal.e0.a(l0Var.f54798e, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a() {
            s0 s0Var = this.f54827b;
            if (s0Var != null) {
                s0Var.onAdClicked(MolocoAdKt.createAdInfo$default(l0.this.f54798e, null, null, 6, null));
            }
        }
    }
}
