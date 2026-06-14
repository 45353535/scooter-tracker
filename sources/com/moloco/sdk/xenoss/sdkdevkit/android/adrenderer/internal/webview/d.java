package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Unit f58737b;

        public a(Unit unit) {
            this.f58737b = unit;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1018657295, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView.<anonymous>.<anonymous> (AdWebView.kt:40)");
            }
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

    public static final class b implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f58738a;

        public b(WebView webView) {
            this.f58738a = webView;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            ViewParent parent = this.f58738a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f58738a);
            }
        }
    }

    public static final FrameLayout a(WebView webView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        frameLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final DisposableEffectResult b(WebView webView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new b(webView);
    }

    public static final Unit c(WebView webView, Modifier modifier, g0 g0Var, int i10, int i11, Composer composer, int i12) {
        d(webView, modifier, g0Var, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final void d(final WebView webView, Modifier modifier, final g0 g0Var, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1111633024);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(webView) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(g0Var) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1111633024, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView (AdWebView.kt:13)");
            }
            composerStartRestartGroup.startReplaceableGroup(1539490980);
            composerStartRestartGroup.startReplaceableGroup(1539458953);
            boolean zChanged = composerStartRestartGroup.changed(webView);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.a(webView, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, null, composerStartRestartGroup, i12 & 112, 4);
            Unit unit = Unit.f93236a;
            composerStartRestartGroup.startReplaceableGroup(1539491745);
            if (g0Var != null) {
                g0Var.a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1018657295, true, new a(unit)), composerStartRestartGroup, ((i12 >> 3) & 112) | 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1539498319);
            boolean zChanged2 = composerStartRestartGroup.changed(webView);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.b(webView, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(webView, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(webView, modifier2, g0Var, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
