package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.ironsource.W2;
import com.moloco.sdk.R$id;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f58798a = Dp.m3951constructorimpl(12);

    public static final class a implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function9 f58799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebView f58800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f58801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f58802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function1 f58803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f58804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ g0 f58805h;

        public a(Function9 function9, WebView webView, int i10, MutableStateFlow mutableStateFlow, Function1 function1, Function0 function0, g0 g0Var) {
            this.f58799b = function9;
            this.f58800c = webView;
            this.f58801d = i10;
            this.f58802e = mutableStateFlow;
            this.f58803f = function1;
            this.f58804g = function0;
            this.f58805h = g0Var;
        }

        public static final View a(Function9 function9, WebView webView, int i10, final MutableStateFlow mutableStateFlow, Function1 function1, g0 g0Var, final Function0 function0, Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (View) function9.invoke(it, webView, Integer.valueOf(i10), mutableStateFlow, function1, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a.b(mutableStateFlow, function0);
                }
            }, g0Var, Dp.m3949boximpl(p.a()), Boolean.TRUE);
        }

        public static final Unit b(MutableStateFlow mutableStateFlow, Function0 function0) {
            p.n(mutableStateFlow, function0);
            return Unit.f93236a;
        }

        public final void c(i.a aVar, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(aVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1684775380, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen.<anonymous>.<anonymous> (AdWebViewRenderer.kt:229)");
            }
            if (aVar instanceof i.a.C0751a) {
                composer.startReplaceableGroup(1826486423);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1826548919);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(-1880738963);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.d(((i.a.b) aVar).b(), null, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, W2.b.f41925f, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(-1880729756);
                composer.startReplaceableGroup(-1880728321);
                boolean zChanged = composer.changed(this.f58799b) | composer.changed(this.f58800c) | composer.changed(this.f58801d) | composer.changed(this.f58802e) | composer.changed(this.f58803f) | composer.changed(this.f58804g) | composer.changed(this.f58805h);
                final Function9 function9 = this.f58799b;
                final WebView webView = this.f58800c;
                final int i12 = this.f58801d;
                final MutableStateFlow mutableStateFlow = this.f58802e;
                final Function1 function1 = this.f58803f;
                final g0 g0Var = this.f58805h;
                final Function0 function0 = this.f58804g;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function12 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return p.a.a(function9, webView, i12, mutableStateFlow, function1, g0Var, function0, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(function12);
                    objRememberedValue = function12;
                }
                composer.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, null, null, composer, 0, 6);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(-1880744781);
                    composer.endReplaceableGroup();
                    throw new lf.m();
                }
                composer.startReplaceableGroup(1827504835);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((i.a) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.f93236a;
        }
    }

    public static final class b implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f58806b = new b();

        public final Function10 a(Composer composer, int i10) {
            composer.startReplaceableGroup(-1994751775);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994751775, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous> (AdWebViewRenderer.kt:145)");
            }
            Function10 function10B = a0.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class c implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f58807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f58808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f58809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function1 f58810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f58811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f58812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function2 f58813h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ g0 f58814i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Dp f58815j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f58816k;

        public static final class a implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebView f58817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MutableStateFlow f58818c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f58819d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Function1 f58820e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Function0 f58821f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f58822g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Function2 f58823h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ g0 f58824i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Dp f58825j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ boolean f58826k;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p$c$a$a, reason: collision with other inner class name */
            public static final class C0775a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f58827r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ MutableState f58828s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ MutableStateFlow f58829t;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p$c$a$a$a, reason: collision with other inner class name */
                public static final class C0776a implements FlowCollector {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MutableStateFlow f58830b;

                    public C0776a(MutableStateFlow mutableStateFlow) {
                        this.f58830b = mutableStateFlow;
                    }

                    public final Object a(boolean z10, Continuation continuation) {
                        this.f58830b.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                        return Unit.f93236a;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return a(((Boolean) obj).booleanValue(), continuation);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0775a(MutableState mutableState, MutableStateFlow mutableStateFlow, Continuation continuation) {
                    super(2, continuation);
                    this.f58828s = mutableState;
                    this.f58829t = mutableStateFlow;
                }

                public static final boolean c(MutableState mutableState) {
                    return ((Boolean) mutableState.getValue()).booleanValue();
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0775a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0775a(this.f58828s, this.f58829t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.f58827r;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        final MutableState mutableState = this.f58828s;
                        Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(p.c.a.C0775a.c(mutableState));
                            }
                        });
                        C0776a c0776a = new C0776a(this.f58829t);
                        this.f58827r = 1;
                        if (flowSnapshotFlow.collect(c0776a, this) == objG) {
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

            public a(WebView webView, MutableStateFlow mutableStateFlow, int i10, Function1 function1, Function0 function0, long j10, Function2 function2, g0 g0Var, Dp dp, boolean z10) {
                this.f58817b = webView;
                this.f58818c = mutableStateFlow;
                this.f58819d = i10;
                this.f58820e = function1;
                this.f58821f = function0;
                this.f58822g = j10;
                this.f58823h = function2;
                this.f58824i = g0Var;
                this.f58825j = dp;
                this.f58826k = z10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126697744, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:152)");
                }
                composer.startReplaceableGroup(1335684812);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = b.h.f55827a.j();
                    composer.updateRememberedValue(objRememberedValue);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335689638);
                boolean zChanged = composer.changed(this.f58817b);
                WebView webView = this.f58817b;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = tVar.a(webView);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Flow flow = (Flow) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335694287);
                MutableStateFlow mutableStateFlow = this.f58818c;
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mutableStateFlow.getValue(), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState = (MutableState) objRememberedValue3;
                composer.endReplaceableGroup();
                Unit unit = Unit.f93236a;
                composer.startReplaceableGroup(1335698124);
                boolean zChanged2 = composer.changed(mutableState) | composer.changed(this.f58818c);
                MutableStateFlow mutableStateFlow2 = this.f58818c;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new C0775a(mutableState, mutableStateFlow2, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue4, composer, 6);
                p.m(this.f58817b, this.f58819d, mutableState, this.f58820e, this.f58821f, null, this.f58822g, (Function10) this.f58823h.invoke(composer, 0), this.f58824i, this.f58825j.m3965unboximpl(), this.f58826k, flow, composer, 384, 0, 32);
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

        public c(WebView webView, MutableStateFlow mutableStateFlow, int i10, Function1 function1, Function0 function0, long j10, Function2 function2, g0 g0Var, Dp dp, boolean z10) {
            this.f58807b = webView;
            this.f58808c = mutableStateFlow;
            this.f58809d = i10;
            this.f58810e = function1;
            this.f58811f = function0;
            this.f58812g = j10;
            this.f58813h = function2;
            this.f58814i = g0Var;
            this.f58815j = dp;
            this.f58816k = z10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1932677773, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:151)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.b(false, ComposableLambdaKt.composableLambda(composer, -126697744, true, new a(this.f58807b, this.f58808c, this.f58809d, this.f58810e, this.f58811f, this.f58812g, this.f58813h, this.f58814i, this.f58815j, this.f58816k)), composer, 48, 1);
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

    public static final float a() {
        return f58798a;
    }

    public static final View b(Function9 function9, WebView webView, int i10, final MutableStateFlow mutableStateFlow, Function1 function1, g0 g0Var, final Function0 function0, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (View) function9.invoke(it, webView, Integer.valueOf(i10), mutableStateFlow, function1, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.r(mutableStateFlow, function0);
            }
        }, g0Var, Dp.m3949boximpl(f58798a), Boolean.FALSE);
    }

    public static final ComposeView c(long j10, Function2 function2, Context context, WebView webView, int i10, MutableStateFlow canClose, Function1 onButtonRendered, Function0 onClose, g0 g0Var, Dp dp, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(canClose, "canClose");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R$id.f53887a);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1932677773, true, new c(webView, canClose, i10, onButtonRendered, onClose, j10, function2, g0Var, dp, z10)));
        return composeView;
    }

    public static final i.a d(State state) {
        return (i.a) state.getValue();
    }

    public static final Unit e(Activity activity, WebView webView, int i10, Function1 function1, Function0 function0, Function9 function9, g0 g0Var, int i11, Composer composer, int i12) {
        k(activity, webView, i10, function1, function0, function9, g0Var, composer, i11 | 1);
        return Unit.f93236a;
    }

    public static final Unit f(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, WebView webView, int i10, Function1 function1, Function0 function0, Function9 function9, g0 g0Var, Function10 function10, Function10 function102, int i11, Composer composer, int i12) {
        l(activity, iVar, webView, i10, function1, function0, function9, g0Var, function10, function102, composer, i11 | 1);
        return Unit.f93236a;
    }

    public static final Unit g(WebView webView, int i10, MutableState mutableState, Function1 function1, Function0 function0, Modifier modifier, long j10, Function10 function10, g0 g0Var, float f10, boolean z10, Flow flow, int i11, int i12, int i13, Composer composer, int i14) {
        m(webView, i10, mutableState, function1, function0, modifier, j10, function10, g0Var, f10, z10, flow, composer, i11 | 1, i12, i13);
        return Unit.f93236a;
    }

    public static final Unit h(MutableState mutableState) {
        mutableState.setValue(Boolean.TRUE);
        return Unit.f93236a;
    }

    public static final Function9 i(final long j10, final Function2 adCloseCountdownButton) {
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        return new Function9() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i
            @Override // kotlin.jvm.functions.Function9
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return p.c(j10, adCloseCountdownButton, (Context) obj, (WebView) obj2, ((Integer) obj3).intValue(), (MutableStateFlow) obj4, (Function1) obj5, (Function0) obj6, (g0) obj7, (Dp) obj8, ((Boolean) obj9).booleanValue());
            }
        };
    }

    public static /* synthetic */ Function9 j(long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Color.INSTANCE.m1630getBlack0d7_KjU();
        }
        if ((i10 & 2) != 0) {
            function2 = b.f58806b;
        }
        return i(j10, function2);
    }

    public static final void k(final Activity activity, final WebView webView, final int i10, final Function1 onButtonRendered, final Function0 onClose, final Function9 adWebViewRenderer, final g0 g0Var, Composer composer, final int i11) {
        int i12;
        final Function0 function0;
        Composer composer2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1336318846);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(activity) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(webView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(onButtonRendered) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(onClose) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(adWebViewRenderer) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(g0Var) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((599187 & i13) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1336318846, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.StaticAdWebViewScreen (AdWebViewRenderer.kt:281)");
            }
            Modifier modifierM170backgroundbw27NRU$default = BackgroundKt.m170backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1630getBlack0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM170backgroundbw27NRU$default);
            if (!androidx.activity.s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1609910659);
            boolean zChanged = composerStartRestartGroup.changed(i10);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = l0.a(Boolean.valueOf(i10 == 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableStateFlow mutableStateFlow = (MutableStateFlow) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1609918202);
            boolean zChanged2 = composerStartRestartGroup.changed(adWebViewRenderer) | composerStartRestartGroup.changed(webView) | composerStartRestartGroup.changed(i10) | composerStartRestartGroup.changed(mutableStateFlow) | composerStartRestartGroup.changed(onButtonRendered) | composerStartRestartGroup.changed(onClose) | composerStartRestartGroup.changed(g0Var);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.b(adWebViewRenderer, webView, i10, mutableStateFlow, onButtonRendered, g0Var, onClose, (Context) obj);
                    }
                };
                mutableStateFlow = mutableStateFlow;
                function0 = onClose;
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue2 = function1;
            } else {
                function0 = onClose;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, null, null, composer2, 0, 6);
            composer2.startReplaceableGroup(1609930744);
            boolean zChanged3 = composer2.changed(mutableStateFlow) | composer2.changed(function0);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.s(mutableStateFlow, function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, composer2, 0, 1);
            e0.b(activity, composer2, i13 & 14);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.e(activity, webView, i10, onButtonRendered, onClose, adWebViewRenderer, g0Var, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void l(final Activity activity, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, final WebView webView, final int i10, final Function1 onButtonRendered, Function0 onClose, final Function9 adWebViewRenderer, final g0 g0Var, final Function10 function10, final Function10 function102, Composer composer, final int i11) {
        int i12;
        final Function0 function0;
        Composer composer2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-476084514);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(activity) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(adViewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(webView) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(onButtonRendered) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(onClose) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(adWebViewRenderer) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(g0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(function10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(function102) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if ((306783379 & i13) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onClose;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476084514, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen (AdWebViewRenderer.kt:211)");
            }
            Modifier modifierTestTag = TestTagKt.testTag(BackgroundKt.m170backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1630getBlack0d7_KjU(), null, 2, null), "MraidAdContainerScreen");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierTestTag);
            if (!androidx.activity.s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1204554426);
            boolean zChanged = composerStartRestartGroup.changed(i10);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = l0.a(Boolean.valueOf(i10 == 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableStateFlow mutableStateFlow = (MutableStateFlow) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            State stateCollectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, composerStartRestartGroup, 0, 1);
            i.a aVarD = d(stateCollectAsState);
            function0 = onClose;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1684775380, true, new a(adWebViewRenderer, webView, i10, mutableStateFlow, onButtonRendered, onClose, g0Var));
            composer2 = composerStartRestartGroup;
            CrossfadeKt.Crossfade(aVarD, null, null, composableLambda, composer2, 3072, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.e(boxScopeInstance, adViewModel, d(stateCollectAsState), function102, function10, composer2, (i13 & 112) | 6 | ((i13 >> 18) & 7168) | ((i13 >> 12) & 57344));
            composer2.startReplaceableGroup(1204610383);
            boolean zChanged2 = composer2.changed(mutableStateFlow) | composer2.changed(function0);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.o(mutableStateFlow, function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composer2, 0, 1);
            e0.b(activity, composer2, i13 & 14);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function02 = function0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.f(activity, adViewModel, webView, i10, onButtonRendered, function02, adWebViewRenderer, g0Var, function10, function102, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(final android.webkit.WebView r35, final int r36, final androidx.compose.runtime.MutableState r37, kotlin.jvm.functions.Function1 r38, final kotlin.jvm.functions.Function0 r39, androidx.compose.ui.Modifier r40, long r41, kotlin.jvm.functions.Function10 r43, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 r44, final float r45, final boolean r46, kotlinx.coroutines.flow.Flow r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p.m(android.webkit.WebView, int, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, kotlin.jvm.functions.Function10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0, float, boolean, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void n(MutableStateFlow mutableStateFlow, Function0 function0) {
        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
            function0.invoke();
        }
    }

    public static final Unit o(MutableStateFlow mutableStateFlow, Function0 function0) {
        n(mutableStateFlow, function0);
        return Unit.f93236a;
    }

    public static final void q(MutableStateFlow mutableStateFlow, Function0 function0) {
        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
            function0.invoke();
        }
    }

    public static final Unit r(MutableStateFlow mutableStateFlow, Function0 function0) {
        q(mutableStateFlow, function0);
        return Unit.f93236a;
    }

    public static final Unit s(MutableStateFlow mutableStateFlow, Function0 function0) {
        q(mutableStateFlow, function0);
        return Unit.f93236a;
    }
}
