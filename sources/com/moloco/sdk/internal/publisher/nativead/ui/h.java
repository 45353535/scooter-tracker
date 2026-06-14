package com.moloco.sdk.internal.publisher.nativead.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0;
import kotlin.jvm.functions.Function7;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {
    public static final Function7 a(Composer composer, int i10) {
        composer.startReplaceableGroup(-1062465295);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062465295, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.nativeVideoMuteButton (NativeVideoMuteButton.kt:11)");
        }
        Function7 function7G = h0.g(0L, 0L, null, 0L, Alignment.INSTANCE.getTopStart(), null, Color.INSTANCE.m1641getWhite0d7_KjU(), PainterResources_androidKt.painterResource(R$drawable.f53883j, composer, 0), PainterResources_androidKt.painterResource(R$drawable.f53884k, composer, 0), null, composer, 1597440, 559);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function7G;
    }
}
