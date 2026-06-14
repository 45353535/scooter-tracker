package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function10;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w a(Painter painter, long j10, Shape shape, long j11, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-571269297);
        if ((i11 & 1) != 0) {
            painter = PainterResources_androidKt.painterResource(R$drawable.f53875b, composer, 0);
        }
        Painter painter2 = painter;
        if ((i11 & 2) != 0) {
            j10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            shape = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e();
        }
        Shape shape2 = shape;
        long jD = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-571269297, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownIcon (DefaultAdSkipCountdownButton.kt:53)");
        }
        w.b bVar = new w.b(painter2, "Skip", j12, shape2, jD, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    public static final Function10 b(Alignment alignment, PaddingValues paddingValues, long j10, long j11, long j12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w wVar, Function0 function0, com.moloco.sdk.internal.ortb.model.k kVar, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-78614409);
        Alignment topEnd = (i11 & 1) != 0 ? Alignment.INSTANCE.getTopEnd() : alignment;
        PaddingValues paddingValuesM411PaddingValues0680j_4 = (i11 & 2) != 0 ? PaddingKt.m411PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long jM962getPrimary0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m962getPrimary0d7_KjU() : j10;
        long jB = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j11;
        long jC = (i11 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.c() : j12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w wVarA = (i11 & 32) != 0 ? a(null, 0L, null, 0L, composer, 0, 15) : wVar;
        Function0 function02 = (i11 & 64) != 0 ? null : function0;
        com.moloco.sdk.internal.ortb.model.k kVar2 = (i11 & 128) == 0 ? kVar : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-78614409, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultAdSkipCountdownButton (DefaultAdSkipCountdownButton.kt:35)");
        }
        int i12 = i10 << 3;
        Function10 function10A = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l.a(topEnd, paddingValuesM411PaddingValues0680j_4, jM962getPrimary0d7_KjU, jB, jC, wVarA, a.AbstractC0780a.c.EnumC0782a.f58912d, function02, kVar2, composer, (i12 & 234881024) | (i10 & 14) | 1572864 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (29360128 & i12));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function10A;
    }
}
