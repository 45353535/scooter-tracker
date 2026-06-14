package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function5 f58082a = g.f57864a.a();

    public static final class a implements Function7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function5 f58083b;

        public a(Function5 function5) {
            this.f58083b = function5;
        }

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Function0 function0, Function1 function1, boolean z10) {
            if (iVar instanceof i.a) {
                function0.invoke();
            } else {
                function1.invoke(Boolean.valueOf(!z10));
            }
            return Unit.f93236a;
        }

        public final void b(BoxScope boxScope, final boolean z10, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, final Function1 onShouldPlay, final Function0 onShouldReplay, Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(onShouldPlay, "onShouldPlay");
            Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(progress) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.changed(onShouldPlay) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i11 |= composer.changed(onShouldReplay) ? 16384 : 8192;
            }
            if ((74899 & i11) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901828083, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl.<anonymous> (PlaybackControl.kt:32)");
            }
            composer.startReplaceableGroup(263769922);
            boolean zChanged = composer.changed(progress) | composer.changed(onShouldReplay) | composer.changed(onShouldPlay) | composer.changed(z10);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.a.a(progress, onShouldReplay, onShouldPlay, z10);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            this.f58083b.invoke(boxScope, Boolean.valueOf(z10), (Function0) objRememberedValue, composer, Integer.valueOf(i11 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            b((BoxScope) obj, ((Boolean) obj2).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.f93236a;
        }
    }

    public static final Function7 a(Function5 function5, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(718660168);
        if ((i11 & 1) != 0) {
            function5 = f58082a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(718660168, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl (PlaybackControl.kt:30)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1901828083, true, new a(function5));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
