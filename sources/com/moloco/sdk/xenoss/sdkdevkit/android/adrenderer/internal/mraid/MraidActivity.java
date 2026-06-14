package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
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
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4724a;
import com.moloco.sdk.internal.ortb.model.C4725b;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 02\u00020\u0001:\u00011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w$f;", "expectedOrientation", "B", "(Lkotlinx/coroutines/flow/StateFlow;)V", "orientationCommand", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w$f;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/y;", "", "v", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/y;)Ljava/lang/Integer;", "Lkotlinx/coroutines/CoroutineScope;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;", "d", "Lkotlin/Lazy;", ExifInterface.LONGITUDE_EAST, "()Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;", "customUserEventBuilderService", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "_adPlaylistController", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/q;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/q;", "_mraidContentController", "", "g", "Z", "isClosedByUser", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;", "h", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;", "storeInstallerImpl", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MraidActivity extends ComponentActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f56352j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final MutableSharedFlow f56353k = hg.c0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final CoroutineScope scope = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Lazy customUserEventBuilderService = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MraidActivity.C();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a _adPlaylistController;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public q _mraidContentController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isClosedByUser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o storeInstallerImpl;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean c(g adData, q controller, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, Function0 function0, Function0 function02, Function0 onShowListenerClick, String str, com.moloco.sdk.acm.recorder.a metricsRecorder) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
            Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
            if (!d(controller)) {
                return false;
            }
            f fVar = f.f56410a;
            fVar.d(adData);
            fVar.h(g0Var);
            fVar.k(options.a());
            fVar.j(options.e());
            fVar.i(function0);
            fVar.e(controller);
            fVar.m(function02);
            fVar.o(onShowListenerClick);
            C4724a c4724aB = options.b();
            fVar.g(c4724aB != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(c4724aB.getEnabled(), c4724aB.getUrl()) : null);
            C4725b c4725bC = options.c();
            fVar.f(c4725bC != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(true, c4725bC.getOnSkip(), c4725bC.getEventLink(), c4725bC.getClickthroughUrl()) : null);
            fVar.c(metricsRecorder);
            Intent intent = new Intent(context, (Class<?>) MraidActivity.class);
            x0.b(intent, options.d());
            x0.f(intent, options.f());
            if (str != null) {
                x0.n(intent, str);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        }

        public final boolean d(q qVar) {
            WebView webViewC;
            f fVar = f.f56410a;
            q qVarX = fVar.x();
            if (qVarX != null && !Intrinsics.areEqual(qVarX, qVar)) {
                return false;
            }
            fVar.e(null);
            ViewParent parent = (qVarX == null || (webViewC = qVarX.c()) == null) ? null : webViewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(qVarX.c());
            }
            fVar.k(null);
            fVar.d(null);
            fVar.h(null);
            Activity activityW = fVar.w();
            if (activityW != null) {
                activityW.finish();
            }
            fVar.b(null);
            return true;
        }

        public final boolean e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return Intrinsics.areEqual(bVar, b.e.f57680a);
        }

        public final boolean g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return bVar instanceof b.f;
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56360a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.f56535c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.f56536d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.f56537e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56360a = iArr;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56361r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56362s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = MraidActivity.this.new c(continuation);
            cVar.f56362s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object objG = pf.b.g();
            int i10 = this.f56361r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f56362s;
                MutableSharedFlow mutableSharedFlow = MraidActivity.f56353k;
                this.f56362s = bVar2;
                this.f56361r = 1;
                if (mutableSharedFlow.emit(bVar2, this) == objG) {
                    return objG;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f56362s;
                kotlin.d.b(obj);
            }
            if (bVar instanceof b.a) {
                f.f56410a.u().invoke();
            } else {
                Companion companion = MraidActivity.INSTANCE;
                if (companion.g(bVar)) {
                    MraidActivity.this.finish();
                } else if (companion.e(bVar)) {
                    MraidActivity.this.isClosedByUser = true;
                    MraidActivity.this.finish();
                }
            }
            return Unit.f93236a;
        }
    }

    public static final class d implements Function2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f56365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f56366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function9 f56367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function2 f56368f;

        public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {
            public a(Object obj) {
                super(0, obj, q.class, "onSkipOrClose", "onSkipOrClose()V", 0);
            }

            public final void a() {
                ((q) this.receiver).B();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, q qVar, Function9 function9, Function2 function2) {
            this.f56365c = aVar;
            this.f56366d = qVar;
            this.f56367e = function9;
            this.f56368f = function2;
        }

        public static final Unit a(a.AbstractC0780a.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f93236a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1048815572, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.onCreate.<anonymous> (MraidActivity.kt:169)");
            }
            MraidActivity mraidActivity = MraidActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f56365c;
            WebView webViewC = this.f56366d.c();
            Intent intent = MraidActivity.this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            int iX = x0.x(intent);
            composer.startReplaceableGroup(-674031980);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MraidActivity.d.a((a.AbstractC0780a.c) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceableGroup();
            q qVar = this.f56366d;
            composer.startReplaceableGroup(-674029931);
            boolean zChanged = composer.changed(qVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new a(qVar);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p.l(mraidActivity, aVar, webViewC, iX, function1, (Function0) ((KFunction) objRememberedValue2), this.f56367e, f.f56410a.v(), (Function10) this.f56368f.invoke(composer, 0), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255), composer, 24576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
        public e(Object obj) {
            super(2, obj, MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.f fVar, Continuation continuation) {
            return MraidActivity.D((MraidActivity) this.receiver, fVar, continuation);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a C() {
        return b.k.f55843a.b();
    }

    public static final /* synthetic */ Object D(MraidActivity mraidActivity, w.f fVar, Continuation continuation) {
        mraidActivity.A(fVar);
        return Unit.f93236a;
    }

    public static final void y(MraidActivity mraidActivity, ActivityResult activityResult) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = mraidActivity.storeInstallerImpl;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            oVar = null;
        }
        oVar.a(activityResult.getResultCode());
    }

    public final void A(w.f orientationCommand) {
        y yVarD;
        Integer numV;
        if (orientationCommand == null || (yVarD = orientationCommand.d()) == null || (numV = v(yVarD)) == null) {
            return;
        }
        setRequestedOrientation(numV.intValue());
    }

    public final void B(StateFlow expectedOrientation) {
        A((w.f) expectedOrientation.getValue());
        hg.i.F(hg.i.K(expectedOrientation, new e(this)), this.scope);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a E() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) this.customUserEventBuilderService.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar;
        final MraidActivity mraidActivity = this;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(mraidActivity.getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.f57046b;
        foregroundMonitor.a();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = mraidActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MraidActivity.y(this.f56369a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        mraidActivity.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.r(mraidActivity, activityResultLauncherRegisterForActivityResult, LifecycleOwnerKt.getLifecycleScope(mraidActivity), foregroundMonitor.b(), 0L, null, null, 112, null);
        t0 t0VarF = b.h.f55827a.f();
        f fVar = f.f56410a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVarN = fVar.n();
        boolean zA = bVarN != null ? bVarN.a() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL = fVar.l();
        boolean zB = aVarL != null ? aVarL.b() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVarL2 = fVar.l();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(zA, zB, aVarL2 != null ? aVarL2.d() : false);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar2 = mraidActivity.storeInstallerImpl;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            oVar = null;
        } else {
            oVar = oVar2;
        }
        Intent intent = mraidActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVarA = lVar.a(t0VarF, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k(oVar, x0.w(intent), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(), fVar.n(), fVar.l(), fVar.q()));
        fVar.b(mraidActivity);
        Function2 function2P = fVar.p();
        Function9 function9R = fVar.r();
        if (function9R == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: MraidRenderer is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        q qVarX = fVar.x();
        if (qVarX == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid controller is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        g gVarA = fVar.a();
        if (gVarA != null) {
            Intent intent2 = mraidActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(gVarA, t0VarF, mraidActivity, qVarX, x0.y(intent2), mraidActivity.E(), nVarA);
            mraidActivity = mraidActivity;
            aVar = aVarA;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid ad data is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        qVarX.g(nVarA);
        mraidActivity.B(qVarX.e());
        hg.i.F(hg.i.K(aVar.a(), mraidActivity.new c(null)), mraidActivity.scope);
        ComponentActivityKt.setContent$default(mraidActivity, null, ComposableLambdaKt.composableLambdaInstance(-1048815572, true, mraidActivity.new d(aVar, qVarX, function9R, function2P)), 1, null);
        aVar.d();
        mraidActivity._adPlaylistController = aVar;
        mraidActivity._mraidContentController = qVarX;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Function0 function0T;
        super.onDestroy();
        if (!this.isClosedByUser && (function0T = f.f56410a.t()) != null) {
            function0T.invoke();
        }
        Function0 function0S = f.f56410a.s();
        if (function0S != null) {
            function0S.invoke();
        }
        INSTANCE.d(this._mraidContentController);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this._adPlaylistController;
        if (aVar != null) {
            aVar.destroy();
        }
        this._adPlaylistController = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = this.storeInstallerImpl;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            oVar = null;
        }
        oVar.cancel();
        kotlinx.coroutines.i.f(this.scope, null, 1, null);
    }

    public final Integer v(y yVar) {
        int i10 = b.f56360a[yVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return null;
        }
        throw new lf.m();
    }
}
