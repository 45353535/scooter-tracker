package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.c0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {
    public static final float a(int i10, int i11) {
        return Integer.compare(i11 ^ Integer.MIN_VALUE, 1 ^ Integer.MIN_VALUE) <= 0 ? i10 == 0 ? 0.0f : 1.0f : (((float) c0.c(i10)) - 1.0f) / (((float) c0.c(i11)) - 1.0f);
    }

    public static final Unit b() {
        return Unit.f93236a;
    }

    public static final Unit c(com.moloco.sdk.internal.ortb.model.k kVar, int i10, int i11, int i12, Composer composer, int i13) {
        e(kVar, i10, i11, composer, i12 | 1);
        return Unit.f93236a;
    }

    public static final Unit d(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }

    public static final void e(final com.moloco.sdk.internal.ortb.model.k countDownTimer, int i10, int i11, Composer composer, final int i12) {
        int i13;
        final int i14 = i10;
        final int i15 = i11;
        Intrinsics.checkNotNullParameter(countDownTimer, "countDownTimer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1297279343);
        if ((i12 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(countDownTimer) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(i14) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(i15) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1297279343, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.AggregateRewardedCountDownTimer (AggregateRewardedCountDownTimer.kt:17)");
            }
            float fM3951constructorimpl = Dp.m3951constructorimpl(countDownTimer.getCircleSize());
            long jM3973DpSizeYgX7TsA = DpKt.m3973DpSizeYgX7TsA(fM3951constructorimpl, fM3951constructorimpl);
            Alignment alignmentA = com.moloco.sdk.internal.i.a(countDownTimer.getHorizontalAlignment(), countDownTimer.getVerticalAlignment());
            long backgroundColor = countDownTimer.getBackgroundColor();
            long foregroundColor = countDownTimer.getForegroundColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            int i16 = i13;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignmentA, false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
            if (!androidx.activity.s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (countDownTimer.getIsDefaultTimer()) {
                composerStartRestartGroup.startReplaceableGroup(2067595199);
                composerStartRestartGroup.startReplaceableGroup(-210387540);
                final String str = "rewarded_countdown_timer";
                boolean zChanged = composerStartRestartGroup.changed("rewarded_countdown_timer");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.d(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
                float fM4049getWidthD9Ej5fM = DpSize.m4049getWidthD9Ej5fM(jM3973DpSizeYgX7TsA);
                composerStartRestartGroup.startReplaceableGroup(-210389350);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f.f();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                int i17 = i16 << 18;
                w.f(backgroundColor, foregroundColor, modifierSemantics$default, 0.0f, fM4049getWidthD9Ej5fM, function0, null, i14, i15, composerStartRestartGroup, (i17 & 234881024) | 196608 | (29360128 & i17), 72);
                composerStartRestartGroup.endReplaceableGroup();
                i14 = i10;
                composerStartRestartGroup = composerStartRestartGroup;
                i15 = i11;
            } else {
                String customTimerDesc = countDownTimer.getCustomTimerDesc();
                if (customTimerDesc == null || customTimerDesc.length() <= 0) {
                    i14 = i10;
                    composerStartRestartGroup = composerStartRestartGroup;
                    i15 = i11;
                    composerStartRestartGroup.startReplaceableGroup(2069129451);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2068371222);
                    composerStartRestartGroup.startReplaceableGroup(-210362420);
                    final String str2 = "rewarded_countdown_timer_custom";
                    boolean zChanged2 = composerStartRestartGroup.changed("rewarded_countdown_timer_custom");
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f.g(str2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue3, 1, null);
                    float fM4049getWidthD9Ej5fM2 = DpSize.m4049getWidthD9Ej5fM(jM3973DpSizeYgX7TsA);
                    String customTimerDesc2 = countDownTimer.getCustomTimerDesc();
                    composerStartRestartGroup.startReplaceableGroup(-210364230);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return f.b();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function02 = (Function0) objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    int i18 = i16 << 21;
                    i14 = i10;
                    composerStartRestartGroup = composerStartRestartGroup;
                    i15 = i11;
                    o.h(backgroundColor, foregroundColor, modifierSemantics$default2, 0.0f, fM4049getWidthD9Ej5fM2, function02, customTimerDesc2, null, i14, i15, composerStartRestartGroup, (234881024 & i18) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i18 & 1879048192), 136);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(countDownTimer, i14, i15, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit f() {
        return Unit.f93236a;
    }

    public static final Unit g(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }
}
