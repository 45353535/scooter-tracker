package com.moloco.sdk.internal;

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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.R$string;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f54246a = ColorKt.Color(4278354171L);

    public static final class a implements Function7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f54247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f54248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f54249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f54250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f54251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f54252g;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.g0$a$a, reason: collision with other inner class name */
        public static final class C0659a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function1 f54253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ State f54254c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f54255d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f54256e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f54257f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f54258g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Function0 f54259h;

            /* JADX INFO: renamed from: com.moloco.sdk.internal.g0$a$a$a, reason: collision with other inner class name */
            public static final class C0660a implements Function3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f54260b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f54261c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f54262d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f54263e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f54264f;

                public C0660a(String str, String str2, long j10, long j11, Function0 function0) {
                    this.f54260b = str;
                    this.f54261c = str2;
                    this.f54262d = j10;
                    this.f54263e = j11;
                    this.f54264f = function0;
                }

                public final void a(Modifier it, Composer composer, int i10) {
                    int i11;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i11 = (composer.changed(it) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1938502477, i11, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:72)");
                    }
                    g0.d(it, this.f54260b, this.f54261c, this.f54262d, this.f54263e, this.f54264f, composer, i11 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f93236a;
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.internal.g0$a$a$b */
            public static final class b implements Function3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f54265b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f54266c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f54267d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f54268e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f54269f;

                public b(String str, String str2, long j10, long j11, Function0 function0) {
                    this.f54265b = str;
                    this.f54266c = str2;
                    this.f54267d = j10;
                    this.f54268e = j11;
                    this.f54269f = function0;
                }

                public final void a(Modifier it, Composer composer, int i10) {
                    int i11;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i11 = (composer.changed(it) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-868048676, i11, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:87)");
                    }
                    g0.d(it, this.f54265b, this.f54266c, this.f54267d, this.f54268e, this.f54269f, composer, i11 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f93236a;
                }
            }

            public C0659a(Function1 function1, State state, String str, String str2, long j10, long j11, Function0 function0) {
                this.f54253b = function1;
                this.f54254c = state;
                this.f54255d = str;
                this.f54256e = str2;
                this.f54257f = j10;
                this.f54258g = j11;
                this.f54259h = function0;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657845797, i10, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:66)");
                }
                i.a aVarC = a.c(this.f54254c);
                if (aVarC instanceof i.a.C0751a) {
                    composer.startReplaceableGroup(-388830153);
                    p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58916h, this.f54253b, ComposableLambdaKt.composableLambda(composer, -1938502477, true, new C0660a(this.f54255d, this.f54256e, this.f54257f, this.f54258g, this.f54259h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.c) {
                    composer.startReplaceableGroup(-388268681);
                    p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58916h, this.f54253b, ComposableLambdaKt.composableLambda(composer, -868048676, true, new b(this.f54255d, this.f54256e, this.f54257f, this.f54258g, this.f54259h)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.b) {
                    composer.startReplaceableGroup(-387725902);
                    composer.endReplaceableGroup();
                } else if (aVarC instanceof i.a.d) {
                    composer.startReplaceableGroup(-387668366);
                    composer.endReplaceableGroup();
                } else {
                    if (aVarC != null) {
                        composer.startReplaceableGroup(-843828347);
                        composer.endReplaceableGroup();
                        throw new lf.m();
                    }
                    composer.startReplaceableGroup(-387633677);
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

        public a(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j10, long j11) {
            this.f54247b = alignment;
            this.f54248c = paddingValues;
            this.f54249d = str;
            this.f54250e = str2;
            this.f54251f = j10;
            this.f54252g = j11;
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
                ComposerKt.traceEventStart(-927135997, i10, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:48)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z10, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f54247b)), this.f54248c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -657845797, true, new C0659a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i10 >> 6) & 14, 1), this.f54249d, this.f54250e, this.f54251f, this.f54252g, onCTA)), composer, ((i10 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
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

    public static final long a() {
        return f54246a;
    }

    public static final Unit b(Modifier modifier, String str, String str2, long j10, long j11, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(modifier, str, str2, j10, j11, function0, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Function7 c(Alignment alignment, PaddingValues paddingValues, String str, long j10, long j11, String str2, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(959702933);
        if ((i11 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        Alignment alignment2 = alignment;
        if ((i11 & 2) != 0) {
            paddingValues = PaddingKt.m411PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i11 & 4) != 0) {
            str = StringResources_androidKt.stringResource(R$string.f53888a, composer, 0);
        }
        String str3 = str;
        long jM1641getWhite0d7_KjU = (i11 & 8) != 0 ? Color.INSTANCE.m1641getWhite0d7_KjU() : j10;
        long j12 = (i11 & 16) != 0 ? f54246a : j11;
        String str4 = (i11 & 32) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959702933, i10, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:47)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -927135997, true, new a(alignment2, paddingValues2, str4, str3, jM1641getWhite0d7_KjU, j12));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r34, java.lang.String r35, final java.lang.String r36, final long r37, final long r39, final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.g0.d(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, long, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
