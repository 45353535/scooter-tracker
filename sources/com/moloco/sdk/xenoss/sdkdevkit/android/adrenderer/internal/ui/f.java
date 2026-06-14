package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    public static final class a implements Function5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f56993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f56994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f56995d;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f$a$a, reason: collision with other inner class name */
        public static final class C0729a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Modifier f56996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f56997c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f56998d;

            public C0729a(Modifier modifier, String str, Function1 function1) {
                this.f56996b = modifier;
                this.f56997c = str;
                this.f56998d = function1;
            }

            public final void a(Modifier trackableModifier, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(trackableModifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(trackableModifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901554514, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous>.<anonymous>.<anonymous> (AdBadge.kt:89)");
                }
                f.d(this.f56996b.then(trackableModifier), this.f56997c, this.f56998d, composer, 0, 0);
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

        public static final class b implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Modifier f56999b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f57000c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f57001d;

            public b(Modifier modifier, String str, Function1 function1) {
                this.f56999b = modifier;
                this.f57000c = str;
                this.f57001d = function1;
            }

            public final void a(Modifier trackableModifier, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(trackableModifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(trackableModifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1149096507, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous>.<anonymous>.<anonymous> (AdBadge.kt:101)");
                }
                f.d(this.f56999b.then(trackableModifier), this.f57000c, this.f57001d, composer, 0, 0);
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

        public a(Modifier modifier, String str, Function1 function1) {
            this.f56993b = modifier;
            this.f56994c = str;
            this.f56995d = function1;
        }

        public static final i.a a(State state) {
            return (i.a) state.getValue();
        }

        public final void b(BoxScope boxScope, Function1 onButtonRendered, StateFlow stateFlow, Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(781429248, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous> (AdBadge.kt:81)");
            }
            if (stateFlow != null) {
                Modifier modifier = this.f56993b;
                String str = this.f56994c;
                Function1 function1 = this.f56995d;
                i.a aVarA = a(SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1));
                if (aVarA instanceof i.a.c) {
                    composer.startReplaceableGroup(-784868645);
                    p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58918j, onButtonRendered, ComposableLambdaKt.composableLambda(composer, 1901554514, true, new C0729a(modifier, str, function1)), composer, ((i10 << 3) & 896) | 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarA instanceof i.a.C0751a) {
                    composer.startReplaceableGroup(-784421253);
                    p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58918j, onButtonRendered, ComposableLambdaKt.composableLambda(composer, 1149096507, true, new b(modifier, str, function1)), composer, ((i10 << 3) & 896) | 3120, 1);
                    composer.endReplaceableGroup();
                } else if (aVarA instanceof i.a.b) {
                    composer.startReplaceableGroup(-783991872);
                    composer.endReplaceableGroup();
                } else if (aVarA instanceof i.a.d) {
                    composer.startReplaceableGroup(-783934336);
                    composer.endReplaceableGroup();
                } else {
                    if (aVarA != null) {
                        composer.startReplaceableGroup(-1687887796);
                        composer.endReplaceableGroup();
                        throw new lf.m();
                    }
                    composer.startReplaceableGroup(-783899616);
                    composer.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            b((BoxScope) obj, (Function1) obj2, (StateFlow) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return Unit.f93236a;
        }
    }

    public static final class b implements Function4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f57002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f57003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f57004d;

        public static final class a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Modifier f57005b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f57006c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f57007d;

            public a(Modifier modifier, String str, Function1 function1) {
                this.f57005b = modifier;
                this.f57006c = str;
                this.f57007d = function1;
            }

            public final void a(Modifier trackableModifier, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(trackableModifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(trackableModifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(592042825, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous>.<anonymous> (AdBadge.kt:136)");
                }
                f.d(this.f57005b.then(trackableModifier), this.f57006c, this.f57007d, composer, 0, 0);
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

        public b(Modifier modifier, String str, Function1 function1) {
            this.f57002b = modifier;
            this.f57003c = str;
            this.f57004d = function1;
        }

        public final void a(BoxScope boxScope, Function1 onButtonRendered, Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i10 & 48) == 0) {
                i10 |= composer.changed(onButtonRendered) ? 32 : 16;
            }
            if ((i10 & 145) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652534615, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous> (AdBadge.kt:132)");
            }
            p0.e(null, a.AbstractC0780a.c.EnumC0782a.f58918j, onButtonRendered, ComposableLambdaKt.composableLambda(composer, 592042825, true, new a(this.f57002b, this.f57003c, this.f57004d)), composer, ((i10 << 3) & 896) | 3120, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((BoxScope) obj, (Function1) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.f93236a;
        }
    }

    public static final Unit a(Modifier modifier, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(modifier, str, function1, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }

    public static final Unit c(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f93236a;
    }

    public static final void d(Modifier modifier, final String clickUrl, final Function1 onClick, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1037954372);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(clickUrl) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(onClick) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037954372, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadge (AdBadge.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(-363689698);
            final String str = "Ad Badge";
            boolean zChanged = composerStartRestartGroup.changed("Ad Badge");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.b(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM453requiredSize3ABfNKs = SizeKt.m453requiredSize3ABfNKs(SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null), Dp.m3951constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(-363682862);
            boolean zChanged2 = composerStartRestartGroup.changed(onClick) | composerStartRestartGroup.changed(clickUrl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.c(onClick, clickUrl);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            IconKt.m1042Iconww6aTOc(PainterResources_androidKt.painterResource(R$drawable.f53878e, composerStartRestartGroup, 0), "Ad Badge", ClickableKt.m194clickableXHw0xAI$default(modifierM453requiredSize3ABfNKs, false, null, null, (Function0) objRememberedValue2, 7, null), Color.INSTANCE.m1640getUnspecified0d7_KjU(), composerStartRestartGroup, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.a(modifier3, clickUrl, onClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit e(t0 t0Var, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        t0Var.a(str);
        return Unit.f93236a;
    }

    public static final Function5 f(Modifier modifier, final String str, final t0 t0Var, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1665380566);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            str = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";
        }
        if ((i11 & 4) != 0) {
            t0Var = b.h.f55827a.f();
        }
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-819746537);
            boolean zChanged = composer.changed(t0Var) | composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.e(t0Var, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665380566, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge (AdBadge.kt:80)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 781429248, true, new a(modifier, str, function1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Unit g(t0 t0Var, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        t0Var.a(str);
        return Unit.f93236a;
    }

    public static final Function4 h(Modifier modifier, final String str, final t0 t0Var, Function1 function1, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1806921710);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            str = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";
        }
        if ((i11 & 4) != 0) {
            t0Var = b.h.f55827a.f();
        }
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-763782202);
            boolean zChanged = composer.changed(t0Var) | composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.g(t0Var, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806921710, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge (AdBadge.kt:131)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -652534615, true, new b(modifier, str, function1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
