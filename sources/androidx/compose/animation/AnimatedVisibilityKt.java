package androidx.compose.animation;

import androidx.activity.s;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\\\u0010\u000f\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0012\u001a\\\u0010\u000f\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0014\u001a^\u0010\u000f\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0017\u001ab\u0010\u000f\u001a\u00020\f*\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0018\u001ab\u0010\u000f\u001a\u00020\f*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0019\u001aj\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u001c\u001aL\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00002\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u001e¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u001f\u001ah\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0003¢\u0006\u0004\b!\u0010\"\u001aO\u0010!\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020#0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0083\b¢\u0006\u0004\b!\u0010$\u001a;\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010%\u001a\u00028\u0000H\u0003¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "", "label", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "content", "AnimatedVisibility", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "transition", "AnimatedEnterExitImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "targetState", "targetEnterExit", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimatedVisibilityKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void AnimatedEnterExitImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i10) {
        int i11;
        EnterExitState enterExitState;
        int i12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(808253933);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(function3) ? 131072 : 65536;
        }
        int i13 = i11;
        if ((374491 & i13) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(808253933, i13, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i14 = i13 & 14;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(transition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            if (function1.invoke(transition.getTargetState()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue() || transition.isSeeking()) {
                composerStartRestartGroup.startReplaceableGroup(1215497572);
                int i15 = (i14 | 48) & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(transition);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = transition.getCurrentState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    objRememberedValue2 = transition.getCurrentState();
                }
                composerStartRestartGroup.startReplaceableGroup(-1220581778);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i16 = i13 & 126;
                EnterExitState enterExitStateTargetEnterExit = targetEnterExit(transition, function1, objRememberedValue2, composerStartRestartGroup, i16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1220581778);
                if (ComposerKt.isTraceInProgress()) {
                    enterExitState = enterExitStateTargetEnterExit;
                    i12 = 0;
                    ComposerKt.traceEventStart(-1220581778, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                } else {
                    enterExitState = enterExitStateTargetEnterExit;
                    i12 = 0;
                }
                EnterExitState enterExitStateTargetEnterExit2 = targetEnterExit(transition, function1, targetState, composerStartRestartGroup, i16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Transition transitionCreateChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitState, enterExitStateTargetEnterExit2, "EnterExitTransition", composer2, i15 | 3072);
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(511388516);
                boolean zChanged3 = composer2.changed(transitionCreateChildTransitionInternal) | composer2.changed(mutableState);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(transitionCreateChildTransitionInternal, mutableState, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(transitionCreateChildTransitionInternal, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue3, composer2, 64);
                int i17 = (i13 >> 3) & 65520;
                composer2.startReplaceableGroup(-1967270694);
                Object currentState = transitionCreateChildTransitionInternal.getCurrentState();
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (currentState == enterExitState2 || transitionCreateChildTransitionInternal.getTargetState() == enterExitState2) {
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged4 = composer2.changed(transitionCreateChildTransitionInternal);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new AnimatedVisibilityScopeImpl(transitionCreateChildTransitionInternal);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue4;
                    int i18 = i17 >> 3;
                    Modifier modifierThen = modifier.then(EnterExitTransitionKt.createModifier(transitionCreateChildTransitionInternal, enterTransition, exitTransition, "Built-in", composer2, (i18 & 112) | 3072 | (i18 & 896)));
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
                    if (!s.a(composer2.getApplier())) {
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
                    Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
                    Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer2)), composer2, Integer.valueOf(i12));
                    composer2.startReplaceableGroup(2058660585);
                    function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i17 >> 9) & 112) | 8));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer3, int i19) {
                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer3, i10 | 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(boolean r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r26, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r27, @org.jetbrains.annotations.Nullable java.lang.String r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t10, Composer composer, int i10) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        composer.startMovableGroup(-721837504, transition);
        if (transition.isSeeking()) {
            enterExitState = function1.invoke(t10).booleanValue() ? EnterExitState.Visible : function1.invoke(transition.getCurrentState()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            enterExitState = function1.invoke(t10).booleanValue() ? EnterExitState.Visible : ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0179  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.RowScope r24, boolean r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r27, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0179  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.ColumnScope r24, boolean r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r27, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r26, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r27, @org.jetbrains.annotations.Nullable java.lang.String r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.RowScope r24, @org.jetbrains.annotations.NotNull final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r27, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedVisibility(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.ColumnScope r24, @org.jetbrains.annotations.NotNull final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r27, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void AnimatedVisibility(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.Transition<T> r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, @org.jetbrains.annotations.Nullable androidx.compose.animation.EnterTransition r24, @org.jetbrains.annotations.Nullable androidx.compose.animation.ExitTransition r25, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void AnimatedVisibility(final boolean z10, @Nullable Modifier modifier, @NotNull final EnterTransition enter, @NotNull final ExitTransition exit, boolean z11, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10, final int i11) {
        final int i12;
        boolean z12;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1121582420);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(enter) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(exit) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
            z12 = z11;
        } else {
            z12 = z11;
            if ((57344 & i10) == 0) {
                i12 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(content) ? 131072 : 65536;
        }
        if ((374491 & i12) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.valueOf(z12));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z10));
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1996320812, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.f93236a;
                }

                @Composable
                public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i14) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if ((i14 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1996320812, i14, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
                    }
                    content.invoke(composer2, Integer.valueOf((i12 >> 15) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i14 = MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            Modifier modifier3 = modifier;
            AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState, modifier3, enter, exit, (String) null, composableLambda, composerStartRestartGroup, i14, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z13 = z12;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.17
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i15) {
                AnimatedVisibilityKt.AnimatedVisibility(z10, modifier2, enter, exit, z13, content, composer2, i10 | 1, i11);
            }
        });
    }

    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        Composer composer2;
        composer.startReplaceableGroup(-1967270694);
        EnterExitState currentState = transition.getCurrentState();
        EnterExitState enterExitState = EnterExitState.Visible;
        if (currentState == enterExitState || transition.getTargetState() == enterExitState) {
            int i11 = i10 & 14;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(transition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue;
            int i12 = i10 >> 3;
            composer2 = composer;
            Modifier modifierThen = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, "Built-in", composer2, i11 | 3072 | (i12 & 112) | (i12 & 896)));
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
            if (!s.a(composer2.getApplier())) {
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
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i10 >> 9) & 112) | 8));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
        } else {
            composer2 = composer;
        }
        composer2.endReplaceableGroup();
    }
}
