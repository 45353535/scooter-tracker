package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final a.AbstractC0780a.c a(MutableState mutableState) {
        return (a.AbstractC0780a.c) mutableState.getValue();
    }

    public static final Unit b(Modifier modifier, a.AbstractC0780a.c.EnumC0782a enumC0782a, Function1 function1, Function3 function3, int i10, int i11, Composer composer, int i12) {
        e(modifier, enumC0782a, function1, function3, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Unit c(Function1 function1, MutableState mutableState, a.AbstractC0780a.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        d(mutableState, it);
        function1.invoke(it);
        return Unit.f93236a;
    }

    public static final void d(MutableState mutableState, a.AbstractC0780a.c cVar) {
        mutableState.setValue(cVar);
    }

    public static final void e(Modifier modifier, final a.AbstractC0780a.c.EnumC0782a buttonType, final Function1 onButtonRendered, final Function3 content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1040306081);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(buttonType) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(onButtonRendered) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1040306081, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableButton (TrackableButton.kt:22)");
            }
            composerStartRestartGroup.startReplaceableGroup(-334659178);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(buttonType), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            a.AbstractC0780a.c cVarA = a(mutableState);
            composerStartRestartGroup.startReplaceableGroup(-334654626);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onButtonRendered);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p0.c(onButtonRendered, mutableState, (a.AbstractC0780a.c) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            content.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.b.a(modifier, cVarA, (Function1) objRememberedValue2), composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p0.b(modifier2, buttonType, onButtonRendered, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
