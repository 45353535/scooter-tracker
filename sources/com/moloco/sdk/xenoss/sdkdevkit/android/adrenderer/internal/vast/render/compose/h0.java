package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.R$id;
import com.moloco.sdk.R$string;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h0 {

    public static final class a implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f57879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function7 f57880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function5 f57881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function6 f57882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function7 f57883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t f57884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f57885h;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0760a extends kotlin.jvm.internal.y implements Function0 {
            public C0760a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onReplay", "onReplay()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).z();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        public a(u uVar, Function7 function7, Function5 function5, Function6 function6, Function7 function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar) {
            this.f57879b = uVar;
            this.f57880c = function7;
            this.f57881d = function5;
            this.f57882e = function6;
            this.f57883f = function72;
            this.f57884g = tVar;
            this.f57885h = iVar;
        }

        public final void a(i.a aVar, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(aVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1837331254, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer.<anonymous>.<anonymous> (VastRenderer.kt:88)");
            }
            if (aVar instanceof i.a.C0751a) {
                composer.startReplaceableGroup(1864270639);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVarB = ((i.a.C0751a) aVar).b();
                u uVar = this.f57879b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.e(jVarB, uVar != null ? uVar.a() : null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1864278356);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVarB = ((i.a.c) aVar).b();
                u uVar2 = this.f57879b;
                Function0 function0C = uVar2 != null ? uVar2.c() : null;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function7 function7 = this.f57880c;
                Function5 function5 = this.f57881d;
                Function6 function6 = this.f57882e;
                Function7 function72 = this.f57883f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar = this.f57884g;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.f57885h;
                composer.startReplaceableGroup(1864289963);
                boolean zChanged = composer.changed(iVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C0760a(iVar);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                s.l(mVarB, function0C, modifierFillMaxSize$default, function7, function5, function6, function72, tVar, (Function0) ((KFunction) objRememberedValue), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(1864292898);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVarB = ((i.a.b) aVar).b();
                u uVar3 = this.f57879b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.d(eVarB, uVar3 != null ? uVar3.b() : null, this.f57882e, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 3072, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(1958779838);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(1864269410);
                    composer.endReplaceableGroup();
                    throw new lf.m();
                }
                composer.startReplaceableGroup(1958818154);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((i.a) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC0780a.c p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).m(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.AbstractC0780a.c) obj);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function0 {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).A();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.y implements Function1 {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC0780a.c p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).m(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.AbstractC0780a.c) obj);
            return Unit.f93236a;
        }
    }

    public static final class e implements Function7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f57886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f57887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f57888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f57889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f57890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f57891g;

        public static final class a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function1 f57892b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ State f57893c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f57894d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f57895e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f57896f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Function0 f57897g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Function0 f57898h;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0$e$a$a, reason: collision with other inner class name */
            public static final class C0761a implements Function3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f57899b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f57900c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f57901d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f57902e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f57903f;

                public C0761a(String str, String str2, long j10, Function0 function0, Function0 function02) {
                    this.f57899b = str;
                    this.f57900c = str2;
                    this.f57901d = j10;
                    this.f57902e = function0;
                    this.f57903f = function02;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.f93236a;
                }

                public final void b(Modifier it, Composer composer, int i10) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-832302220, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:320)");
                    }
                    String str = this.f57899b;
                    String str2 = this.f57900c;
                    long j10 = this.f57901d;
                    composer.startReplaceableGroup(-1483997351);
                    boolean zChanged = composer.changed(this.f57902e) | composer.changed(this.f57903f);
                    final Function0 function0 = this.f57902e;
                    final Function0 function02 = this.f57903f;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h0.e.a.C0761a.a(function0, function02);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    y.c(it, str, str2, j10, (Function0) objRememberedValue, composer, i10 & 14, 0);
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

            public static final class b implements Function3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f57904b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f57905c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f57906d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f57907e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f57908f;

                public b(String str, String str2, long j10, Function0 function0, Function0 function02) {
                    this.f57904b = str;
                    this.f57905c = str2;
                    this.f57906d = j10;
                    this.f57907e = function0;
                    this.f57908f = function02;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.f93236a;
                }

                public final void b(Modifier it, Composer composer, int i10) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1517460509, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:337)");
                    }
                    String str = this.f57904b;
                    String str2 = this.f57905c;
                    long j10 = this.f57906d;
                    composer.startReplaceableGroup(-1483978279);
                    boolean zChanged = composer.changed(this.f57907e) | composer.changed(this.f57908f);
                    final Function0 function0 = this.f57907e;
                    final Function0 function02 = this.f57908f;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h0.e.a.b.a(function0, function02);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    y.c(it, str, str2, j10, (Function0) objRememberedValue, composer, i10 & 14, 0);
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

            public a(Function1 function1, State state, String str, String str2, long j10, Function0 function0, Function0 function02) {
                this.f57892b = function1;
                this.f57893c = state;
                this.f57894d = str;
                this.f57895e = str2;
                this.f57896f = j10;
                this.f57897g = function0;
                this.f57898h = function02;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1004334236, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous> (VastRenderer.kt:314)");
                }
                i.a aVarC = e.c(this.f57893c);
                if (aVarC instanceof i.a.C0751a) {
                    composer.startReplaceableGroup(1203605395);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58916h, this.f57892b, ComposableLambdaKt.composableLambda(composer, -832302220, true, new C0761a(this.f57894d, this.f57895e, this.f57896f, this.f57897g, this.f57898h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.c) {
                    composer.startReplaceableGroup(1204196627);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58916h, this.f57892b, ComposableLambdaKt.composableLambda(composer, 1517460509, true, new b(this.f57894d, this.f57895e, this.f57896f, this.f57897g, this.f57898h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.b) {
                    composer.startReplaceableGroup(1204770127);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.d) {
                    composer.startReplaceableGroup(1204855532);
                    composer.endReplaceableGroup();
                } else {
                    if (aVarC != null) {
                        composer.startReplaceableGroup(-1485196057);
                        composer.endReplaceableGroup();
                        throw new lf.m();
                    }
                    composer.startReplaceableGroup(1204890283);
                    composer.endReplaceableGroup();
                }
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

        public e(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j10, Function0 function0) {
            this.f57886b = alignment;
            this.f57887c = paddingValues;
            this.f57888d = str;
            this.f57889e = str2;
            this.f57890f = j10;
            this.f57891g = function0;
        }

        public static final i.a c(State state) {
            return (i.a) state.getValue();
        }

        public final void b(BoxScope boxScope, boolean z10, StateFlow currentAdPartFlow, Function1 onButtonRendered, Function0 onCTA, Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432764356, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous> (VastRenderer.kt:295)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z10, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f57886b)), this.f57887c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1004334236, true, new a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i10 >> 6) & 14, 1), this.f57888d, this.f57889e, this.f57890f, onCTA, this.f57891g)), composer, ((i10 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            b((BoxScope) obj, ((Boolean) obj2).booleanValue(), (StateFlow) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.f93236a;
        }
    }

    public static final class f implements Function7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f57909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f57910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Painter f57911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Painter f57912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f57913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f57914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f57915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f57916i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Shape f57917j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f57918k;

        public static final class a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f57919b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Painter f57920c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Painter f57921d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MutableState f57922e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Function2 f57923f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Function1 f57924g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Function0 f57925h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ boolean f57926i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f57927j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ long f57928k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f57929l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Shape f57930m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f57931n;

            public a(boolean z10, Painter painter, Painter painter2, MutableState mutableState, Function2 function2, Function1 function1, Function0 function0, boolean z11, long j10, long j11, long j12, Shape shape, long j13) {
                this.f57919b = z10;
                this.f57920c = painter;
                this.f57921d = painter2;
                this.f57922e = mutableState;
                this.f57923f = function2;
                this.f57924g = function1;
                this.f57925h = function0;
                this.f57926i = z11;
                this.f57927j = j10;
                this.f57928k = j11;
                this.f57929l = j12;
                this.f57930m = shape;
                this.f57931n = j13;
            }

            public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                SemanticsPropertiesKt.setTestTag(semantics, str);
                return Unit.f93236a;
            }

            public static final Unit b(Function1 function1, boolean z10, Function2 function2, Function0 function0, MutableState mutableState) {
                function1.invoke(Boolean.valueOf(!z10));
                f.e(mutableState, new a.AbstractC0780a.c(z10 ? a.AbstractC0780a.c.EnumC0782a.f58914f : a.AbstractC0780a.c.EnumC0782a.f58915g, f.d(mutableState).d(), f.d(mutableState).e()));
                function2.invoke(f.d(mutableState), z10 ? a.AbstractC0780a.c.EnumC0782a.f58915g : a.AbstractC0780a.c.EnumC0782a.f58914f);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f93236a;
            }

            public static final Unit c(Function2 function2, boolean z10, MutableState mutableState, a.AbstractC0780a.c it) {
                Intrinsics.checkNotNullParameter(it, "it");
                f.e(mutableState, it);
                function2.invoke(f.d(mutableState), z10 ? a.AbstractC0780a.c.EnumC0782a.f58914f : a.AbstractC0780a.c.EnumC0782a.f58915g);
                return Unit.f93236a;
            }

            public final void d(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2071462974, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous>.<anonymous> (VastRenderer.kt:242)");
                }
                Painter painter = this.f57919b ? this.f57920c : this.f57921d;
                Modifier.Companion companion = Modifier.INSTANCE;
                a.AbstractC0780a.c cVarD = f.d(this.f57922e);
                composer.startReplaceableGroup(-133206795);
                boolean zChanged = composer.changed(this.f57922e) | composer.changed(this.f57923f) | composer.changed(this.f57919b);
                final Function2 function2 = this.f57923f;
                final boolean z10 = this.f57919b;
                final MutableState mutableState = this.f57922e;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h0.f.a.c(function2, z10, mutableState, (a.AbstractC0780a.c) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.b.a(companion, cVarD, (Function1) objRememberedValue);
                composer.startReplaceableGroup(-133199711);
                final String str = "mute_button";
                boolean zChanged2 = composer.changed("mute_button");
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h0.f.a.a(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierA, false, (Function1) objRememberedValue2, 1, null);
                composer.startReplaceableGroup(-133193381);
                boolean zChanged3 = composer.changed(this.f57924g) | composer.changed(this.f57919b) | composer.changed(this.f57922e) | composer.changed(this.f57923f) | composer.changed(this.f57925h);
                final Function1 function1 = this.f57924g;
                final boolean z11 = this.f57919b;
                final Function2 function22 = this.f57923f;
                final Function0 function0 = this.f57925h;
                final MutableState mutableState2 = this.f57922e;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h0.f.a.b(function1, z11, function22, function0, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0.b(painter, (Function0) objRememberedValue3, modifierSemantics$default, this.f57926i, "mute/unmute", this.f57927j, this.f57928k, this.f57929l, this.f57930m, this.f57931n, composer, 24576, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                d((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.f93236a;
            }
        }

        public f(Alignment alignment, PaddingValues paddingValues, Painter painter, Painter painter2, Function0 function0, long j10, long j11, long j12, Shape shape, long j13) {
            this.f57909b = alignment;
            this.f57910c = paddingValues;
            this.f57911d = painter;
            this.f57912e = painter2;
            this.f57913f = function0;
            this.f57914g = j10;
            this.f57915h = j11;
            this.f57916i = j12;
            this.f57917j = shape;
            this.f57918k = j13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final a.AbstractC0780a.c d(MutableState mutableState) {
            return (a.AbstractC0780a.c) mutableState.getValue();
        }

        public static final void e(MutableState mutableState, a.AbstractC0780a.c cVar) {
            mutableState.setValue(cVar);
        }

        public final void b(BoxScope boxScope, boolean z10, boolean z11, Function2 onButtonReplaced, Function1 onMuteChange, Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonReplaced, "onButtonReplaced");
            Intrinsics.checkNotNullParameter(onMuteChange, "onMuteChange");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(z11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.changed(onButtonReplaced) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i11 |= composer.changed(onMuteChange) ? 16384 : 8192;
            }
            int i12 = i11;
            if ((74899 & i12) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545982054, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous> (VastRenderer.kt:231)");
            }
            composer.startReplaceableGroup(-1304253143);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(a.AbstractC0780a.c.EnumC0782a.f58914f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z10, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f57909b)), this.f57910c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -2071462974, true, new a(z11, this.f57911d, this.f57912e, (MutableState) objRememberedValue, onButtonReplaced, onMuteChange, this.f57913f, z10, this.f57914g, this.f57915h, this.f57916i, this.f57917j, this.f57918k)), composer, ((i12 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            b((BoxScope) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Function2) obj4, (Function1) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.f93236a;
        }
    }

    public static final class g implements Function5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f57932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f57933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f57934d;

        public static final class a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f57935b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i f57936c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f57937d;

            public a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, long j10) {
                this.f57935b = z10;
                this.f57936c = iVar;
                this.f57937d = j10;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1435522410, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous>.<anonymous> (VastRenderer.kt:378)");
                }
                e0.g(this.f57935b, this.f57936c, null, this.f57937d, composer, 0, 4);
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

        public g(Alignment alignment, PaddingValues paddingValues, long j10) {
            this.f57932b = alignment;
            this.f57933c = paddingValues;
            this.f57934d = j10;
        }

        public final void a(BoxScope boxScope, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(progress, "progress");
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
            if ((i11 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967084142, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous> (VastRenderer.kt:370)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z10 || ((progress instanceof i.c) && ((i.c) progress).a() > 0), PaddingKt.padding(boxScope.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.f57932b), this.f57933c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -1435522410, true, new a(z10, progress, this.f57934d)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return Unit.f93236a;
        }
    }

    public static final class h implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f57938b = new h();

        public final Function7 a(Composer composer, int i10) {
            composer.startReplaceableGroup(838284708);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838284708, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:174)");
            }
            Function7 function7G = h0.g(0L, 0L, null, 0L, null, null, 0L, null, null, null, composer, 0, 1023);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function7G;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class i implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f57939b = new i();

        public final Function10 a(Composer composer, int i10) {
            composer.startReplaceableGroup(-562763068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-562763068, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:175)");
            }
            Function10 function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class j implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f57940b = new j();

        public final Function10 a(Composer composer, int i10) {
            composer.startReplaceableGroup(-450891997);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-450891997, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:176)");
            }
            Function10 function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function10B;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class k implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f57941b = new k();

        public final Function7 a(Composer composer, int i10) {
            composer.startReplaceableGroup(-832109727);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-832109727, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:177)");
            }
            Function7 function7H = h0.h(null, null, 0L, null, null, null, composer, 0, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function7H;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class l implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f57942b = new l();

        public final Function5 a(Composer composer, int i10) {
            composer.startReplaceableGroup(976926819);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(976926819, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:179)");
            }
            Function5 function5F = h0.f(null, null, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function5F;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class m implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f57943b = new m();

        public final Function6 a(Composer composer, int i10) {
            composer.startReplaceableGroup(658271039);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(658271039, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:180)");
            }
            Function6 function6I = s.i(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function6I;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class n implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f57944b = new n();

        public final Void a(Composer composer, int i10) {
            composer.startReplaceableGroup(-1106742594);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106742594, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:181)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class o implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f57945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f57946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function2 f57947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function2 f57948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function2 f57949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function2 f57950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ u f57951h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function2 f57952i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function2 f57953j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2 f57954k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t f57955l;

        public static final class a implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f57956b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f57957c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function2 f57958d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Function2 f57959e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Function2 f57960f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Function2 f57961g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ u f57962h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function2 f57963i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function2 f57964j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Function2 f57965k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t f57966l;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j10, Function2 function2, Function2 function22, Function2 function23, Function2 function24, u uVar, Function2 function25, Function2 function26, Function2 function27, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar) {
                this.f57956b = iVar;
                this.f57957c = j10;
                this.f57958d = function2;
                this.f57959e = function22;
                this.f57960f = function23;
                this.f57961g = function24;
                this.f57962h = uVar;
                this.f57963i = function25;
                this.f57964j = function26;
                this.f57965k = function27;
                this.f57966l = tVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(831245532, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:189)");
                }
                h0.i(this.f57956b, null, this.f57957c, (Function7) this.f57958d.invoke(composer, 0), (Function10) this.f57959e.invoke(composer, 0), (Function10) this.f57960f.invoke(composer, 0), (Function7) this.f57961g.invoke(composer, 0), this.f57962h, (Function5) this.f57963i.invoke(composer, 0), (Function6) this.f57964j.invoke(composer, 0), (Function7) this.f57965k.invoke(composer, 0), this.f57966l, composer, 0, 0, 2);
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

        public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j10, Function2 function2, Function2 function22, Function2 function23, Function2 function24, u uVar, Function2 function25, Function2 function26, Function2 function27, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar) {
            this.f57945b = iVar;
            this.f57946c = j10;
            this.f57947d = function2;
            this.f57948e = function22;
            this.f57949f = function23;
            this.f57950g = function24;
            this.f57951h = uVar;
            this.f57952i = function25;
            this.f57953j = function26;
            this.f57954k = function27;
            this.f57955l = tVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876197241, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:188)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.b(false, ComposableLambdaKt.composableLambda(composer, 831245532, true, new a(this.f57945b, this.f57946c, this.f57947d, this.f57948e, this.f57949f, this.f57950g, this.f57951h, this.f57952i, this.f57953j, this.f57954k, this.f57955l)), composer, 48, 1);
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

    public static final ComposeView a(long j10, Function2 function2, Function2 function22, Function2 function23, Function2 function24, u uVar, Function2 function25, Function2 function26, Function2 function27, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R$id.f53887a);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(876197241, true, new o(adViewModel, j10, function2, function22, function23, function24, uVar, function25, function26, function27, tVar)));
        return composeView;
    }

    public static final i.a b(State state) {
        return (i.a) state.getValue();
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Modifier modifier, long j10, Function7 function7, Function10 function10, Function10 function102, Function7 function72, u uVar, Function5 function5, Function6 function6, Function7 function73, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, int i10, int i11, int i12, Composer composer, int i13) {
        i(iVar, modifier, j10, function7, function10, function102, function72, uVar, function5, function6, function73, tVar, composer, i10 | 1, i11, i12);
        return Unit.f93236a;
    }

    public static final Function2 d(final long j10, final Function2 muteButton, final Function2 adCloseCountdownButton, final Function2 adSkipCountdownButton, final Function2 ctaButton, final u uVar, final Function2 progressBar, final Function2 vastIcon, final Function2 playbackControl, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker) {
        Intrinsics.checkNotNullParameter(muteButton, "muteButton");
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButton, "adSkipCountdownButton");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(vastIcon, "vastIcon");
        Intrinsics.checkNotNullParameter(playbackControl, "playbackControl");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        return new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h0.a(j10, muteButton, adCloseCountdownButton, adSkipCountdownButton, ctaButton, uVar, progressBar, vastIcon, playbackControl, viewVisibilityTracker, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static /* synthetic */ Function2 e(long j10, Function2 function2, Function2 function22, Function2 function23, Function2 function24, u uVar, Function2 function25, Function2 function26, Function2 function27, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Color.INSTANCE.m1630getBlack0d7_KjU();
        }
        if ((i10 & 2) != 0) {
            function2 = h.f57938b;
        }
        if ((i10 & 4) != 0) {
            function22 = i.f57939b;
        }
        if ((i10 & 8) != 0) {
            function23 = j.f57940b;
        }
        if ((i10 & 16) != 0) {
            function24 = k.f57941b;
        }
        if ((i10 & 32) != 0) {
            uVar = null;
        }
        if ((i10 & 64) != 0) {
            function25 = l.f57942b;
        }
        if ((i10 & 128) != 0) {
            function26 = m.f57943b;
        }
        if ((i10 & 256) != 0) {
            function27 = n.f57944b;
        }
        if ((i10 & 512) != 0) {
            tVar = b.h.f55827a.j();
        }
        Function2 function28 = function27;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar2 = tVar;
        Function2 function29 = function25;
        Function2 function210 = function26;
        u uVar2 = uVar;
        Function2 function211 = function23;
        Function2 function212 = function2;
        return d(j10, function212, function22, function211, function24, uVar2, function29, function210, function28, tVar2);
    }

    public static final Function5 f(Alignment alignment, PaddingValues paddingValues, long j10, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(716005120);
        if ((i11 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomCenter();
        }
        if ((i11 & 2) != 0) {
            paddingValues = PaddingKt.m411PaddingValues0680j_4(Dp.m3951constructorimpl(0));
        }
        if ((i11 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m962getPrimary0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(716005120, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar (VastRenderer.kt:369)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1967084142, true, new g(alignment, paddingValues, j10));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Function7 g(long j10, long j11, Shape shape, long j12, Alignment alignment, PaddingValues paddingValues, long j13, Painter painter, Painter painter2, Function0 function0, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(447650301);
        long jB = (i11 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j10;
        long j14 = (i11 & 2) != 0 ? jB : j11;
        Shape shapeE = (i11 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : shape;
        long jD = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j12;
        Alignment topStart = (i11 & 16) != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
        PaddingValues paddingValuesM411PaddingValues0680j_4 = (i11 & 32) != 0 ? PaddingKt.m411PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long jM962getPrimary0d7_KjU = (i11 & 64) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m962getPrimary0d7_KjU() : j13;
        Painter painterPainterResource = (i11 & 128) != 0 ? PainterResources_androidKt.painterResource(R$drawable.f53876c, composer, 0) : painter;
        Painter painterPainterResource2 = (i11 & 256) != 0 ? PainterResources_androidKt.painterResource(R$drawable.f53877d, composer, 0) : painter2;
        Function0 function02 = (i11 & 512) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447650301, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton (VastRenderer.kt:226)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -545982054, true, new f(topStart, paddingValuesM411PaddingValues0680j_4, painterPainterResource, painterPainterResource2, function02, jM962getPrimary0d7_KjU, jB, j14, shapeE, jD));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Function7 h(Alignment alignment, PaddingValues paddingValues, long j10, String str, String str2, Function0 function0, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-926425258);
        if ((i11 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        Alignment alignment2 = alignment;
        if ((i11 & 2) != 0) {
            paddingValues = PaddingKt.m411PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i11 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m962getPrimary0d7_KjU();
        }
        long j11 = j10;
        String strStringResource = (i11 & 8) != 0 ? StringResources_androidKt.stringResource(R$string.f53888a, composer, 0) : str;
        String str3 = (i11 & 16) != 0 ? null : str2;
        Function0 function02 = (i11 & 32) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926425258, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton (VastRenderer.kt:294)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 432764356, true, new e(alignment2, paddingValues2, str3, strStringResource, j11, function02));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final void i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, Modifier modifier, long j10, Function7 function7, Function10 function10, Function10 function102, Function7 function72, u uVar, Function5 function5, Function6 function6, Function7 function73, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long jM1630getBlack0d7_KjU;
        Function7 function7G;
        Function10 function10B;
        Function10 function10B2;
        u uVar2;
        Function5 function5F;
        Function6 function6I;
        int i18;
        int i19;
        Function7 function7H;
        Composer composer2;
        Modifier modifier2;
        Function7 function74;
        Function7 function75;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar;
        Composer composer3;
        final Function5 function52;
        final Function10 function103;
        final Function7 function76;
        final Modifier modifier3;
        final Function7 function77;
        final long j11;
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Composer composerStartRestartGroup = composer.startRestartGroup(1056246356);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = i10 | (composerStartRestartGroup.changed(adViewModel) ? 4 : 2);
        } else {
            i13 = i10;
        }
        int i20 = i12 & 2;
        if (i20 != 0) {
            i15 = i13 | 48;
            i14 = -3670017;
        } else {
            i14 = -3670017;
            if ((i10 & 48) == 0) {
                i13 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i15 = i13;
        }
        int i21 = i12 & 4;
        if (i21 != 0) {
            i15 |= 384;
            i17 = 1;
            i16 = 16;
            jM1630getBlack0d7_KjU = j10;
        } else {
            i16 = 16;
            i17 = 1;
            jM1630getBlack0d7_KjU = j10;
            if ((i10 & 384) == 0) {
                i15 |= composerStartRestartGroup.changed(jM1630getBlack0d7_KjU) ? 256 : 128;
            }
        }
        if ((i10 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                function7G = function7;
                int i22 = composerStartRestartGroup.changed(function7G) ? 2048 : 1024;
                i15 |= i22;
            } else {
                function7G = function7;
            }
            i15 |= i22;
        } else {
            function7G = function7;
        }
        if ((i10 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                function10B = function10;
                int i23 = composerStartRestartGroup.changed(function10B) ? 16384 : 8192;
                i15 |= i23;
            } else {
                function10B = function10;
            }
            i15 |= i23;
        } else {
            function10B = function10;
        }
        if ((i10 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            function10B2 = function102;
            i15 |= ((i12 & 32) == 0 && composerStartRestartGroup.changed(function10B2)) ? 131072 : 65536;
        } else {
            function10B2 = function102;
        }
        if ((i10 & 1572864) == 0) {
            i15 |= ((i12 & 64) == 0 && composerStartRestartGroup.changed(function72)) ? 1048576 : 524288;
        }
        int i24 = 128 & i12;
        if (i24 != 0) {
            i15 |= 12582912;
            uVar2 = uVar;
        } else {
            uVar2 = uVar;
            if ((i10 & 12582912) == 0) {
                i15 |= composerStartRestartGroup.changed(uVar2) ? 8388608 : 4194304;
            }
        }
        if ((i10 & 100663296) == 0) {
            if ((i12 & 256) == 0) {
                function5F = function5;
                int i25 = composerStartRestartGroup.changed(function5F) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i15 |= i25;
            } else {
                function5F = function5;
            }
            i15 |= i25;
        } else {
            function5F = function5;
        }
        if ((i10 & C.ENCODING_PCM_32BIT) == 0) {
            if ((i12 & 512) == 0) {
                function6I = function6;
                int i26 = composerStartRestartGroup.changed(function6I) ? 536870912 : 268435456;
                i15 |= i26;
            } else {
                function6I = function6;
            }
            i15 |= i26;
        } else {
            function6I = function6;
        }
        int i27 = 1024 & i12;
        if (i27 != 0) {
            i19 = i11 | 6;
            i18 = i27;
        } else {
            i18 = i27;
            if ((i11 & 6) == 0) {
                i19 = i11 | (composerStartRestartGroup.changed(function73) ? 4 : 2);
            } else {
                i19 = i11;
            }
        }
        if ((2048 & i12) != 0) {
            i19 |= 48;
        } else if ((i11 & 48) == 0) {
            i19 |= composerStartRestartGroup.changed(viewVisibilityTracker) ? 32 : i16;
        }
        int i28 = i19;
        Composer composer4 = composerStartRestartGroup;
        if ((i15 & 306783379) == 306783378 && (i28 & 19) == 18 && composer4.getSkipping()) {
            composer4.skipToGroupEnd();
            iVar = adViewModel;
            modifier3 = modifier;
            function76 = function72;
            j11 = jM1630getBlack0d7_KjU;
            function52 = function5F;
            function103 = function10B;
            function77 = function73;
        } else {
            composer4.startDefaults();
            if ((i10 & 1) == 0 || composer4.getDefaultsInvalid()) {
                Modifier modifier4 = i20 != 0 ? Modifier.INSTANCE : modifier;
                if (i21 != 0) {
                    jM1630getBlack0d7_KjU = Color.INSTANCE.m1630getBlack0d7_KjU();
                }
                if ((i12 & 8) != 0) {
                    function7G = g(0L, 0L, null, 0L, null, null, 0L, null, null, null, composer4, 0, 1023);
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    function10B = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.b(null, null, 0L, 0L, 0L, null, null, null, composer4, 0, 255);
                    i15 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    function10B2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.b(null, null, 0L, 0L, 0L, null, null, null, composer4, 0, 255);
                    i15 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    function7H = h(null, null, 0L, null, null, null, composer4, 0, 63);
                    i15 &= i14;
                } else {
                    function7H = function72;
                }
                if (i24 != 0) {
                    uVar2 = null;
                }
                if ((256 & i12) != 0) {
                    function5F = f(null, null, 0L, composer4, 0, 7);
                    composer2 = composer4;
                    i15 &= -234881025;
                } else {
                    composer2 = composer4;
                }
                Modifier modifier5 = modifier4;
                if ((i12 & 512) != 0) {
                    function6I = s.i(null, null, composer2, 0, 3);
                    i15 &= -1879048193;
                }
                modifier2 = modifier5;
                function74 = i18 != 0 ? null : function73;
            } else {
                composer4.skipToGroupEnd();
                if ((i12 & 8) != 0) {
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    i15 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    i15 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    i15 &= i14;
                }
                if ((256 & i12) != 0) {
                    i15 &= -234881025;
                }
                if ((i12 & 512) != 0) {
                    i15 &= -1879048193;
                }
                modifier2 = modifier;
                function7H = function72;
                function74 = function73;
                composer2 = composer4;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                function75 = function74;
                ComposerKt.traceEventStart(1056246356, i15, i28, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer (VastRenderer.kt:79)");
            } else {
                function75 = function74;
            }
            Modifier modifierM170backgroundbw27NRU$default = BackgroundKt.m170backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, i17, null), jM1630getBlack0d7_KjU, null, 2, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifier6 = modifier2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            long j12 = jM1630getBlack0d7_KjU;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM170backgroundbw27NRU$default);
            if (!androidx.activity.s.a(composer2.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer2);
            Function5 function53 = function5F;
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            State stateCollectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer2, 0, 1);
            Function7 function78 = function75;
            Composer composer5 = composer2;
            CrossfadeKt.Crossfade(b(stateCollectAsState), null, null, ComposableLambdaKt.composableLambda(composer2, -1837331254, true, new a(uVar2, function7G, function53, function6I, function78, viewVisibilityTracker, adViewModel)), composer5, 3072, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.e(boxScopeInstance, adViewModel, b(stateCollectAsState), function10B2, function10B, composer5, ((i15 << 3) & 112) | 6 | ((i15 >> 6) & 7168) | (57344 & i15));
            iVar = adViewModel;
            composer5.startReplaceableGroup(-1443724119);
            if (function7H == null) {
                composer3 = composer5;
            } else {
                Boolean boolValueOf = Boolean.valueOf(j(SnapshotStateKt.collectAsState(iVar.n(), null, composer5, 0, 1)));
                StateFlow stateFlowK = iVar.k();
                composer5.startReplaceableGroup(1864315475);
                boolean zChanged = composer5.changed(iVar);
                Object objRememberedValue = composer5.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new b(iVar);
                    composer5.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer5.endReplaceableGroup();
                composer5.startReplaceableGroup(1864316968);
                boolean zChanged2 = composer5.changed(iVar);
                Object objRememberedValue2 = composer5.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new c(iVar);
                    composer5.updateRememberedValue(objRememberedValue2);
                }
                composer5.endReplaceableGroup();
                function7H.invoke(boxScopeInstance, boolValueOf, stateFlowK, kFunction, (KFunction) objRememberedValue2, composer5, 6);
                composer3 = composer5;
                Unit unit = Unit.f93236a;
            }
            composer3.endReplaceableGroup();
            Composer composer6 = composer3;
            Function5 function5F2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f.f(PaddingKt.m418padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getBottomStart()), Dp.m3951constructorimpl(12)), null, null, null, composer6, 0, 14);
            composer6.startReplaceableGroup(-1443710796);
            boolean zChanged3 = composer6.changed(iVar);
            Object objRememberedValue3 = composer6.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new d(iVar);
                composer6.updateRememberedValue(objRememberedValue3);
            }
            composer6.endReplaceableGroup();
            function5F2.invoke(boxScopeInstance, (KFunction) objRememberedValue3, iVar.k(), composer6, 6);
            composer4 = composer6;
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            composer4.endNode();
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function52 = function53;
            function103 = function10B;
            function76 = function7H;
            modifier3 = modifier6;
            function77 = function78;
            j11 = j12;
        }
        final Function7 function79 = function7G;
        final Function6 function62 = function6I;
        final u uVar3 = uVar2;
        final Function10 function104 = function10B2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h0.c(iVar, modifier3, j11, function79, function103, function104, function76, uVar3, function52, function62, function77, viewVisibilityTracker, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean j(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
