package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l {

    public static final class a implements Function10 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f57107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f57108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0780a.c.EnumC0782a f57109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ w f57110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f57111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f57112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f57113h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f57114i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f57115j;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l$a$a, reason: collision with other inner class name */
        public static final class C0733a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0780a.c.EnumC0782a f57116b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function1 f57117c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f57118d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ w f57119e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ boolean f57120f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f57121g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f57122h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function0 f57123i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function0 f57124j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ long f57125k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f57126l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f57127m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f57128n;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l$a$a$a, reason: collision with other inner class name */
            public static final class C0734a implements Function3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f57129b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f57130c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f57131d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f57132e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f57133f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f57134g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function0 f57135h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f57136i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ long f57137j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f57138k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k f57139l;

                public C0734a(boolean z10, w wVar, boolean z11, int i10, int i11, Function0 function0, Function0 function02, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar) {
                    this.f57129b = z10;
                    this.f57130c = wVar;
                    this.f57131d = z11;
                    this.f57132e = i10;
                    this.f57133f = i11;
                    this.f57134g = function0;
                    this.f57135h = function02;
                    this.f57136i = j10;
                    this.f57137j = j11;
                    this.f57138k = j12;
                    this.f57139l = kVar;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.f93236a;
                }

                public final void b(Modifier modifier, Composer composer, int i10) {
                    int i11;
                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.changed(modifier) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1495696596, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous>.<anonymous> (AdCountdownButton.kt:67)");
                    }
                    w aVar = this.f57129b ? this.f57130c : new w.a(this.f57131d, this.f57132e, this.f57133f, null);
                    composer.startReplaceableGroup(1166285558);
                    boolean zChanged = composer.changed(this.f57134g) | composer.changed(this.f57135h);
                    final Function0 function0 = this.f57134g;
                    final Function0 function02 = this.f57135h;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l.a.C0733a.C0734a.a(function0, function02);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    v.b(aVar, modifier, (Function0) objRememberedValue, this.f57129b, this.f57136i, this.f57137j, this.f57138k, this.f57139l, composer, (i11 << 3) & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f93236a;
                }
            }

            public C0733a(a.AbstractC0780a.c.EnumC0782a enumC0782a, Function1 function1, boolean z10, w wVar, boolean z11, int i10, int i11, Function0 function0, Function0 function02, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar) {
                this.f57116b = enumC0782a;
                this.f57117c = function1;
                this.f57118d = z10;
                this.f57119e = wVar;
                this.f57120f = z11;
                this.f57121g = i10;
                this.f57122h = i11;
                this.f57123i = function0;
                this.f57124j = function02;
                this.f57125k = j10;
                this.f57126l = j11;
                this.f57127m = j12;
                this.f57128n = kVar;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(411500084, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous> (AdCountdownButton.kt:62)");
                }
                p0.e(Modifier.INSTANCE, this.f57116b, this.f57117c, ComposableLambdaKt.composableLambda(composer, 1495696596, true, new C0734a(this.f57118d, this.f57119e, this.f57120f, this.f57121g, this.f57122h, this.f57123i, this.f57124j, this.f57125k, this.f57126l, this.f57127m, this.f57128n)), composer, 3078, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.f93236a;
            }
        }

        public a(Alignment alignment, PaddingValues paddingValues, a.AbstractC0780a.c.EnumC0782a enumC0782a, w wVar, Function0 function0, long j10, long j11, long j12, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f57107b = alignment;
            this.f57108c = paddingValues;
            this.f57109d = enumC0782a;
            this.f57110e = wVar;
            this.f57111f = function0;
            this.f57112g = j10;
            this.f57113h = j11;
            this.f57114i = j12;
            this.f57115j = kVar;
        }

        public final void a(BoxScope boxScope, boolean z10, boolean z11, Function0 onClick, Function1 onButtonRendered, boolean z12, int i10, int i11, Composer composer, int i12) {
            int i13;
            boolean z13;
            boolean z14;
            int i14;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i12 & 6) == 0) {
                i13 = (composer.changed(boxScope) ? 4 : 2) | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 48) == 0) {
                z13 = z10;
                i13 |= composer.changed(z13) ? 32 : 16;
            } else {
                z13 = z10;
            }
            if ((i12 & 384) == 0) {
                i13 |= composer.changed(z11) ? 256 : 128;
            }
            if ((i12 & 3072) == 0) {
                i13 |= composer.changed(onClick) ? 2048 : 1024;
            }
            if ((i12 & 24576) == 0) {
                i13 |= composer.changed(onButtonRendered) ? 16384 : 8192;
            }
            if ((i12 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                z14 = z12;
                i13 |= composer.changed(z14) ? 131072 : 65536;
            } else {
                z14 = z12;
            }
            if ((1572864 & i12) == 0) {
                i13 |= composer.changed(i10) ? 1048576 : 524288;
            }
            if ((i12 & 12582912) == 0) {
                i14 = i11;
                i13 |= composer.changed(i14) ? 8388608 : 4194304;
            } else {
                i14 = i11;
            }
            if ((38347923 & i13) == 38347922 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563618292, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous> (AdCountdownButton.kt:55)");
            }
            boolean z15 = z14;
            int i15 = i14;
            AnimatedVisibilityKt.AnimatedVisibility(z11, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f57107b)), this.f57108c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 411500084, true, new C0733a(this.f57109d, onButtonRendered, z13, this.f57110e, z15, i10, i15, onClick, this.f57111f, this.f57112g, this.f57113h, this.f57114i, this.f57115j)), composer, ((i13 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function10
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Function0) obj4, (Function1) obj5, ((Boolean) obj6).booleanValue(), ((lf.t) obj7).g(), ((lf.t) obj8).g(), (Composer) obj9, ((Number) obj10).intValue());
            return Unit.f93236a;
        }
    }

    public static final Function10 a(Alignment alignment, PaddingValues padding, long j10, long j11, long j12, w afterCountdownButtonPart, a.AbstractC0780a.c.EnumC0782a buttonType, Function0 function0, com.moloco.sdk.internal.ortb.model.k kVar, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(afterCountdownButtonPart, "afterCountdownButtonPart");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        composer.startReplaceableGroup(410719381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410719381, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton (AdCountdownButton.kt:53)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -563618292, true, new a(alignment, padding, buttonType, afterCountdownButtonPart, function0, j10, j11, j12, kVar));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
