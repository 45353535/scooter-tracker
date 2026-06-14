package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4724a;
import com.moloco.sdk.internal.ortb.model.C4725b;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import hg.c0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "Lkotlinx/coroutines/CoroutineScope;", "d", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;", "storeInstallerImpl", InneractiveMediationDefs.GENDER_FEMALE, "a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class VastActivity extends ComponentActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f57352g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MutableSharedFlow f57353h = c0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static WeakReference f57354i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f57355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Function2 f57356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Function0 f57357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Job f57358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static g0 f57359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static com.moloco.sdk.acm.recorder.a f57360o;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a ac;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final CoroutineScope scope = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o storeInstallerImpl;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        public static final class C0738a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f57364r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f57365s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ f0 f57366t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function1 f57367u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f57368v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f57369w;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0739a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f57370r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f57371s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Function1 f57372t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Context f57373u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ f0 f57374v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f57375w;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C0740a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public int f57376r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ Function1 f57377s;

                    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0741a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        public int f57378r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        public /* synthetic */ Object f57379s;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        public final /* synthetic */ Function1 f57380t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0741a(Function1 function1, Continuation continuation) {
                            super(2, continuation);
                            this.f57380t = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
                            return ((C0741a) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Continuation create(Object obj, Continuation continuation) {
                            C0741a c0741a = new C0741a(this.f57380t, continuation);
                            c0741a.f57379s = obj;
                            return c0741a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            pf.b.g();
                            if (this.f57378r != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.d.b(obj);
                            this.f57380t.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f57379s);
                            return Unit.f93236a;
                        }
                    }

                    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        public int f57381r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        public /* synthetic */ Object f57382s;

                        public b(Continuation continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
                            return ((b) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Continuation create(Object obj, Continuation continuation) {
                            b bVar = new b(continuation);
                            bVar.f57382s = obj;
                            return bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            pf.b.g();
                            if (this.f57381r != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.d.b(obj);
                            return kotlin.coroutines.jvm.internal.b.a(VastActivity.INSTANCE.g((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f57382s));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0740a(Function1 function1, Continuation continuation) {
                        super(2, continuation);
                        this.f57377s = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C0740a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C0740a(this.f57377s, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.f57376r;
                        if (i10 == 0) {
                            kotlin.d.b(obj);
                            Flow flowK = hg.i.K(VastActivity.f57353h, new C0741a(this.f57377s, null));
                            b bVar = new b(null);
                            this.f57376r = 1;
                            if (hg.i.A(flowK, bVar, this) == objG) {
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

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public int f57383r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ Context f57384s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ f0 f57385t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ String f57386u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Context context, f0 f0Var, String str, Continuation continuation) {
                        super(2, continuation);
                        this.f57384s = context;
                        this.f57385t = f0Var;
                        this.f57386u = str;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new b(this.f57384s, this.f57385t, this.f57386u, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        String clickthroughUrl;
                        pf.b.g();
                        if (this.f57383r != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                        Context context = this.f57384s;
                        Intent intent = new Intent(this.f57384s, (Class<?>) VastActivity.class);
                        f0 f0Var = this.f57385t;
                        String str = this.f57386u;
                        x0.t(intent, f0Var.i());
                        x0.b(intent, f0Var.e());
                        x0.f(intent, f0Var.f());
                        x0.c(intent, f0Var.g());
                        x0.k(intent, f0Var.h());
                        x0.q(intent, f0Var.d());
                        x0.o(intent, f0Var.c());
                        C4724a c4724aA = f0Var.a();
                        if (c4724aA != null) {
                            x0.m(intent, c4724aA.getEnabled());
                        }
                        C4724a c4724aA2 = f0Var.a();
                        if (c4724aA2 != null) {
                            x0.l(intent, c4724aA2.getUrl());
                        }
                        if (f0Var.b() != null) {
                            x0.e(intent, true);
                        }
                        C4725b c4725bB = f0Var.b();
                        if (c4725bB != null) {
                            x0.h(intent, c4725bB.getOnSkip());
                        }
                        C4725b c4725bB2 = f0Var.b();
                        if (c4725bB2 != null) {
                            x0.g(intent, c4725bB2.getEventLink());
                        }
                        C4725b c4725bB3 = f0Var.b();
                        if (c4725bB3 != null && (clickthroughUrl = c4725bB3.getClickthroughUrl()) != null) {
                            x0.d(intent, clickthroughUrl);
                        }
                        if (str != null) {
                            x0.n(intent, str);
                        }
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        return Unit.f93236a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0739a(Function1 function1, Context context, f0 f0Var, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f57372t = function1;
                    this.f57373u = context;
                    this.f57374v = f0Var;
                    this.f57375w = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0739a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C0739a c0739a = new C0739a(this.f57372t, this.f57373u, this.f57374v, this.f57375w, continuation);
                    c0739a.f57371s = obj;
                    return c0739a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f57370r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f57371s;
                    Companion companion = VastActivity.INSTANCE;
                    VastActivity.f57358m = eg.i.d(coroutineScope, null, null, new C0740a(this.f57372t, null), 3, null);
                    return eg.i.d(coroutineScope, null, null, new b(this.f57373u, this.f57374v, this.f57375w, null), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0738a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, f0 f0Var, Function1 function1, Context context, String str, Continuation continuation) {
                super(2, continuation);
                this.f57365s = aVar;
                this.f57366t = f0Var;
                this.f57367u = function1;
                this.f57368v = context;
                this.f57369w = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0738a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0738a(this.f57365s, this.f57366t, this.f57367u, this.f57368v, this.f57369w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f57364r;
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Companion companion = VastActivity.INSTANCE;
                        VastActivity.f57355j = this.f57365s;
                        VastActivity.f57356k = this.f57366t.j();
                        C0739a c0739a = new C0739a(this.f57367u, this.f57368v, this.f57366t, this.f57369w, null);
                        this.f57364r = 1;
                        obj = kotlinx.coroutines.i.g(c0739a, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    Job job = (Job) obj;
                    Companion companion2 = VastActivity.INSTANCE;
                    VastActivity vastActivityH = companion2.h();
                    if (vastActivityH != null) {
                        vastActivityH.finish();
                    }
                    VastActivity.f57357l = null;
                    VastActivity.f57355j = null;
                    VastActivity.f57360o = null;
                    VastActivity.f57356k = null;
                    companion2.b();
                    return job;
                } catch (Throwable th2) {
                    Companion companion3 = VastActivity.INSTANCE;
                    VastActivity vastActivityH2 = companion3.h();
                    if (vastActivityH2 != null) {
                        vastActivityH2.finish();
                    }
                    VastActivity.f57357l = null;
                    VastActivity.f57355j = null;
                    VastActivity.f57360o = null;
                    VastActivity.f57356k = null;
                    companion3.b();
                    throw th2;
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Context context, f0 f0Var, Function0 function0, g0 g0Var, String str, com.moloco.sdk.acm.recorder.a aVar2, Function1 function1, Continuation continuation) {
            VastActivity.f57359n = g0Var;
            VastActivity.f57357l = function0;
            VastActivity.f57360o = aVar2;
            Object objG = eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getMain(), new C0738a(aVar, f0Var, function1, context, str, null), continuation);
            return objG == pf.b.g() ? objG : Unit.f93236a;
        }

        public final void b() {
            Job job = VastActivity.f57358m;
            if (job == null || !job.isActive()) {
                return;
            }
            Job job2 = VastActivity.f57358m;
            if (job2 != null) {
                Job.a.a(job2, null, 1, null);
            }
            VastActivity.f57358m = null;
        }

        public final void e(VastActivity vastActivity) {
            VastActivity.f57354i = new WeakReference(vastActivity);
            if (vastActivity == null) {
                b();
            }
        }

        public final boolean g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof b.f) || Intrinsics.areEqual(bVar, b.e.f57680a);
        }

        public final VastActivity h() {
            return (VastActivity) VastActivity.f57354i.get();
        }

        public Companion() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57387r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57388s;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = VastActivity.this.new b(continuation);
            bVar.f57388s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object objG = pf.b.g();
            int i10 = this.f57387r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f57388s;
                MutableSharedFlow mutableSharedFlow = VastActivity.f57353h;
                this.f57388s = bVar2;
                this.f57387r = 1;
                if (mutableSharedFlow.emit(bVar2, this) == objG) {
                    return objG;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f57388s;
                kotlin.d.b(obj);
            }
            if (VastActivity.INSTANCE.g(bVar)) {
                VastActivity.this.finish();
            }
            return Unit.f93236a;
        }
    }

    public static final class c implements Function2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f57391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function2 f57392d;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2 function2) {
            this.f57391c = aVar;
            this.f57392d = function2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009520481, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:168)");
            }
            f.c(VastActivity.this, this.f57391c, this.f57392d, VastActivity.f57359n, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }
    }

    public static final void x(VastActivity vastActivity, ActivityResult activityResult) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "VastActivity", "Activity result received: resultCode=" + activityResult.getResultCode(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "VastActivity", "Activity result received: resultData=" + activityResult.getData(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = vastActivity.storeInstallerImpl;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            oVar = null;
        }
        oVar.a(activityResult.getResultCode());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.f57046b;
        foregroundMonitor.a();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                VastActivity.x(this.f57393a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        t0 t0VarF = b.h.f55827a.f();
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.r(this, activityResultLauncherRegisterForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), foregroundMonitor.b(), 0L, null, null, 112, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean zR = x0.r(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        boolean zI = x0.i(intent2);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(zR, zI, x0.p(intent3));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar2 = this.storeInstallerImpl;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            oVar = null;
        } else {
            oVar = oVar2;
        }
        Intent intent4 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        String strW = x0.w(intent4);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d();
        Intent intent5 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
        boolean zR2 = x0.r(intent5);
        Intent intent6 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(zR2, x0.s(intent6));
        Intent intent7 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
        boolean zI2 = x0.i(intent7);
        Intent intent8 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
        boolean zP = x0.p(intent8);
        Intent intent9 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
        String strJ = x0.j(intent9);
        Intent intent10 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVarA = lVar.a(t0VarF, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k(oVar, strW, dVar, bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(zI2, zP, strJ, x0.a(intent10)), f57360o));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = f57355j;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        Function2 function2 = f57356k;
        if (function2 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVarB = b.k.f55843a.b();
        Intent intent11 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
        boolean zB = x0.B(intent11);
        Intent intent12 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
        Boolean boolZ = x0.z(intent12);
        Intent intent13 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
        int iA = x0.A(intent13);
        Intent intent14 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
        int iX = x0.x(intent14);
        Intent intent15 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
        int iY = x0.y(intent15);
        Intent intent16 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
        boolean zV = x0.v(intent16);
        Intent intent17 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarB2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b(aVar, t0VarF, this, aVarB, zB, boolZ, iA, iX, iY, zV, x0.u(intent17), nVarA);
        this.ac = aVarB2;
        INSTANCE.e(this);
        hg.i.F(hg.i.K(aVarB2.a(), new b(null)), this.scope);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1009520481, true, new c(aVarB2, function2)), 1, null);
        aVarB2.d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Function0 function0 = f57357l;
        if (function0 != null) {
            function0.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.ac;
        if (aVar != null) {
            aVar.destroy();
        }
        this.ac = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = this.storeInstallerImpl;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            oVar = null;
        }
        oVar.cancel();
        kotlinx.coroutines.i.f(this.scope, null, 1, null);
        INSTANCE.e(null);
    }
}
