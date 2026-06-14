package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e0 {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56990r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f56991s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f56992t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.f56991s = z10;
            this.f56992t = activity;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f56991s, this.f56992t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56990r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (this.f56991s) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0.a(this.f56992t);
            }
            return Unit.f93236a;
        }
    }

    public static final Unit a(Activity activity, int i10, Composer composer, int i11) {
        b(activity, composer, i10 | 1);
        return Unit.f93236a;
    }

    public static final void b(final Activity activity, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-726701488);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-726701488, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HideSystemUI (HideSystemUI.kt:9)");
            }
            boolean zIsWindowFocused = ((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused();
            Boolean boolValueOf = Boolean.valueOf(zIsWindowFocused);
            composerStartRestartGroup.startReplaceableGroup(-1598618285);
            boolean zChanged = composerStartRestartGroup.changed(zIsWindowFocused) | composerStartRestartGroup.changed(activity);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(zIsWindowFocused, activity, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.a(activity, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
