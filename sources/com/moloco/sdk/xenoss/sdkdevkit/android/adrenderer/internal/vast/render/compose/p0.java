package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p0 {
    public static final Unit a(j.a aVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(aVar, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final void b(final j.a htmlResource, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(htmlResource, "htmlResource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1230364815);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(htmlResource) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = 2 & i11;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230364815, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastResourceHtml (VastResourceHtml.kt:11)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1944712831);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z zVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.f58866a;
                Object obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z.f58867b.get(Integer.valueOf(htmlResource.a()));
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0)) {
                    obj = null;
                }
                objRememberedValue = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0) obj;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0 d0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            if (d0Var == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return p0.a(htmlResource, modifier2, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d.d(d0Var, modifier2, null, composerStartRestartGroup, (i12 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return p0.c(htmlResource, modifier, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit c(j.a aVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(aVar, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }
}
