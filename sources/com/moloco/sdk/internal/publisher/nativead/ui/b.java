package com.moloco.sdk.internal.publisher.nativead.ui;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.internal.publisher.nativead.ui.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f55034a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Function5 f55035b = ComposableLambdaKt.composableLambdaInstance(1019496058, false, a.f55036b);

    public static final class a implements Function5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f55036b = new a();

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.ui.b$a$a, reason: collision with other inner class name */
        public static final class C0676a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f55037b;

            public C0676a(Function0 function0) {
                this.f55037b = function0;
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
                    ComposerKt.traceEventStart(1776469658, i11, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous>.<anonymous> (NativeVideoPlaybackControlUI.kt:30)");
                }
                c0.b(PainterResources_androidKt.painterResource(z10 ? R$drawable.f53881h : R$drawable.f53882i, composer, 0), this.f55037b, null, false, "play/pause", Color.INSTANCE.m1641getWhite0d7_KjU(), 0L, 0L, null, 0L, composer, 221184, 972);
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

        public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, str);
            SemanticsPropertiesKt.setTestTag(semantics, str);
            return Unit.f93236a;
        }

        public final void b(BoxScope boxScope, boolean z10, Function0 onClick, Composer composer, int i10) {
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
                ComposerKt.traceEventStart(1019496058, i11, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous> (NativeVideoPlaybackControlUI.kt:17)");
            }
            Modifier modifierM418padding3ABfNKs = PaddingKt.m418padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m3951constructorimpl(4));
            composer.startReplaceableGroup(277443603);
            final String str = "playback_control_button";
            boolean zChanged = composer.changed("playback_control_button");
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a.a(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            CrossfadeKt.Crossfade(Boolean.valueOf(z10), SemanticsModifierKt.semantics$default(modifierM418padding3ABfNKs, false, (Function1) objRememberedValue, 1, null), null, ComposableLambdaKt.composableLambda(composer, 1776469658, true, new C0676a(onClick)), composer, ((i11 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            b((BoxScope) obj, ((Boolean) obj2).booleanValue(), (Function0) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return Unit.f93236a;
        }
    }

    public final Function5 a() {
        return f55035b;
    }
}
