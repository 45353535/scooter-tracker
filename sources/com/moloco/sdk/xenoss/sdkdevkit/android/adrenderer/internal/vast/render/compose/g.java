package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.android.exoplayer2.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f57864a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Function5 f57865b = ComposableLambdaKt.composableLambdaInstance(-1970835476, false, a.f57866b);

    public static final class a implements Function5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57866b = new a();

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g$a$a, reason: collision with other inner class name */
        public static final class C0758a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f57867b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g$a$a$a, reason: collision with other inner class name */
            public static final class C0759a implements Function3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f57868b;

                public C0759a(boolean z10) {
                    this.f57868b = z10;
                }

                public final void a(RowScope TextButton, Composer composer, int i10) {
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i10 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-919554769, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:55)");
                    }
                    TextKt.m1192TextfLXpl1I(this.f57868b ? LogConstants.EVENT_PAUSE : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f93236a;
                }
            }

            public C0758a(Function0 function0) {
                this.f57867b = function0;
            }

            public final void a(boolean z10, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.changed(z10) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(170935244, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:54)");
                }
                ButtonKt.TextButton(this.f57867b, null, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -919554769, true, new C0759a(z10)), composer, C.ENCODING_PCM_32BIT, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                return Unit.f93236a;
            }
        }

        public final void a(BoxScope boxScope, boolean z10, Function0 onClick, Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(onClick) ? 256 : 128;
            }
            if ((i11 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970835476, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:48)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z10), PaddingKt.m418padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m3951constructorimpl(4)), null, ComposableLambdaKt.composableLambda(composer, 170935244, true, new C0758a(onClick)), composer, ((i11 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (Function0) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return Unit.f93236a;
        }
    }

    public final Function5 a() {
        return f57865b;
    }
}
