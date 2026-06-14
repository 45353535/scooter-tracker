package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.i;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J'\u0010\u0011\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", C4240b4.i.f42653t0, C4240b4.i.f42655u0, "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;", "expectedOrientationSettings", "Lkotlinx/coroutines/CoroutineScope;", "scope", "H", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V", "orientationSettings", "D", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;", "", "z", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;)Ljava/lang/Integer;", "Landroidx/activity/OnBackPressedCallback;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroidx/activity/OnBackPressedCallback;", "backCallback", "d", "a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class FullscreenWebviewActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56951e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f56952f = "FullscreenWebviewActivity";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static WeakReference f56953g = new WeakReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static WeakReference f56954h = new WeakReference(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static WeakReference f56955i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static MutableStateFlow f56956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static MutableStateFlow f56957k;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public OnBackPressedCallback backCallback;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, FullscreenWebviewActivity.f56952f, "Closing ad", null, false, 12, null);
            FullscreenWebviewActivity.f56953g.clear();
            MutableStateFlow mutableStateFlow = FullscreenWebviewActivity.f56956j;
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(Boolean.FALSE);
            }
            FullscreenWebviewActivity.f56956j = null;
            FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) FullscreenWebviewActivity.f56954h.get();
            if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
                fullscreenWebviewActivity.finish();
            }
            FullscreenWebviewActivity.f56954h.clear();
            FullscreenWebviewActivity.f56955i.clear();
        }

        public final void b(Context context, MutableStateFlow isAdDisplayingEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c webviewAd, com.moloco.sdk.acm.recorder.a metricsRecorder, MutableStateFlow isAdForciblyClosed) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(isAdDisplayingEvent, "isAdDisplayingEvent");
            Intrinsics.checkNotNullParameter(webviewAd, "webviewAd");
            Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
            Intrinsics.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
            MolocoLogger.info$default(MolocoLogger.INSTANCE, FullscreenWebviewActivity.f56952f, "Showing ad", null, false, 12, null);
            FullscreenWebviewActivity.f56953g = new WeakReference(webviewAd);
            FullscreenWebviewActivity.f56956j = isAdDisplayingEvent;
            FullscreenWebviewActivity.f56957k = isAdForciblyClosed;
            FullscreenWebviewActivity.f56955i = new WeakReference(metricsRecorder);
            Intent intent = new Intent(context, (Class<?>) FullscreenWebviewActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56959a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56733c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56734d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56735e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56959a = iArr;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
        public c(Object obj) {
            super(2, obj, FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, Continuation continuation) {
            return FullscreenWebviewActivity.I((FullscreenWebviewActivity) this.receiver, bVar, continuation);
        }
    }

    public static final Unit C(OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f56952f, "Back press detected, but disabled", false, 4, null);
        return Unit.f93236a;
    }

    public static /* synthetic */ void E(FullscreenWebviewActivity fullscreenWebviewActivity, StateFlow stateFlow, CoroutineScope coroutineScope, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineScope = i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        }
        fullscreenWebviewActivity.H(stateFlow, coroutineScope);
    }

    public static final /* synthetic */ Object I(FullscreenWebviewActivity fullscreenWebviewActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, Continuation continuation) {
        fullscreenWebviewActivity.D(bVar);
        return Unit.f93236a;
    }

    public static final Unit P() {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f56952f, "WebviewAd is null in onPause, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return Unit.f93236a;
    }

    public static final Unit Q() {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f56952f, "WebviewAd is null in onResume, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return Unit.f93236a;
    }

    public final void D(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b orientationSettings) {
        if (orientationSettings.a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56735e) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, f56952f, "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        Integer numZ = z(orientationSettings.a());
        if (numZ != null) {
            int iIntValue = numZ.intValue();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f56952f, "Setting orientation to " + iIntValue, null, false, 12, null);
            setRequestedOrientation(iIntValue);
        }
    }

    public final void H(StateFlow expectedOrientationSettings, CoroutineScope scope) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f56952f, "Starting to listen to orientation events", null, false, 12, null);
        D((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b) expectedOrientationSettings.getValue());
        hg.i.F(hg.i.K(expectedOrientationSettings, new c(this)), scope);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f56952f;
        MolocoLogger.info$default(molocoLogger, str, "onCreate called", null, false, 12, null);
        com.moloco.sdk.acm.recorder.a aVar = (com.moloco.sdk.acm.recorder.a) f56955i.get();
        if (aVar != null) {
            aVar.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.Y.g()));
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        this.backCallback = OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FullscreenWebviewActivity.C((OnBackPressedCallback) obj);
            }
        }, 2, null);
        f56954h = new WeakReference(this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) f56953g.get();
        if (cVar == null) {
            MolocoLogger.error$default(molocoLogger, str, "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarY = cVar.y();
        if (bVarY.getParent() != null) {
            ViewParent parent = bVarY.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(bVarY);
        }
        setContentView(bVarY);
        MutableStateFlow mutableStateFlow = f56956j;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        MolocoLogger.info$default(molocoLogger, str, "WebView is not null, proceeding to notify viewReady and viewVisible", null, false, 12, null);
        cVar.z().a();
        a0.a(this);
        E(this, cVar.A(), null, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f56952f, "onDestroy called for FullscreenWebviewActivity", null, false, 12, null);
        MutableStateFlow mutableStateFlow = f56957k;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        f56957k = null;
        OnBackPressedCallback onBackPressedCallback = this.backCallback;
        if (onBackPressedCallback != null && onBackPressedCallback.getIsEnabled()) {
            onBackPressedCallback.remove();
        }
        INSTANCE.a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a aVarZ;
        super.onPause();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f56952f;
        MolocoLogger.info$default(molocoLogger, str, "Lifecycle onPause called", null, false, 12, null);
        if (isFinishing() || isDestroyed()) {
            MolocoLogger.info$default(molocoLogger, str, "Activity is finishing or destroyed, skipping viewVisible call", null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, str, "Activity is not finishing or destroyed, setting viewVisible to false", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) f56953g.get();
        if (cVar == null || (aVarZ = cVar.z()) == null) {
            new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FullscreenWebviewActivity.P();
                }
            };
        } else {
            aVarZ.a(false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a aVarZ;
        super.onResume();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f56952f, "Lifecycle onResume called", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) f56953g.get();
        if (cVar == null || (aVarZ = cVar.z()) == null) {
            new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FullscreenWebviewActivity.Q();
                }
            };
        } else {
            aVarZ.a(true);
        }
    }

    public final Integer z(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar) {
        int i10 = b.f56959a[aVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return null;
        }
        throw new m();
    }
}
