package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aõ\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001ah\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t¢\u0006\u0002\b)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0#2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b\t¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0002\u0010/\u001a3\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00103\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020.092\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010;\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "Landroidx/compose/ui/UiComposable;", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m3951constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950970976);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(backdropValue) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i12, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:414)");
            }
            State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 48, 12);
            float fMo308toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo308toPx0680j_4(AnimationSlideOffset);
            float f10 = 1;
            float fM = g.m(BackLayerTransition$lambda$7(stateAnimateFloatAsState) - f10, 0.0f, 1.0f);
            float fM2 = g.m(f10 - BackLayerTransition$lambda$7(stateAnimateFloatAsState), 0.0f, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            if (!s.a(composerStartRestartGroup.getApplier())) {
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
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion3.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1750graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m1750graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, fM), 0.0f, 0.0f, fM, 0.0f, (f10 - fM) * fMo308toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM1750graphicsLayerAp8cVGQ$default);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl2 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion3.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1750graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m1750graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, fM2), 0.0f, 0.0f, fM2, 0.0f, (f10 - fM2) * (-fMo308toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM1750graphicsLayerAp8cVGQ$default2);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl3 = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl3, density3, companion3.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
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
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackLayerTransition.2
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

            public final void invoke(@Nullable Composer composer2, int i13) {
                BackdropScaffoldKt.BackLayerTransition(backdropValue, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    private static final float BackLayerTransition$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m900BackdropScaffoldBZszfkY(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r39, @org.jetbrains.annotations.Nullable androidx.compose.material.BackdropScaffoldState r40, boolean r41, float r42, float r43, boolean r44, boolean r45, long r46, long r48, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r50, float r51, long r52, long r54, long r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r59, final int r60, final int r61, final int r62) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m900BackdropScaffoldBZszfkY(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i10) {
        final int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i11, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:451)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(function4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m906invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m906invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, final long j10) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final Placeable placeableMo3011measureBRTryo0 = ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(BackdropLayers.Back, function2))).mo3011measureBRTryo0(function1.invoke(Constraints.m3907boximpl(j10)).getValue());
                        final float height = placeableMo3011measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function42 = function4;
                        final int i12 = i11;
                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i13) {
                                if ((i13 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1222642649, i13, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:465)");
                                }
                                function42.invoke(Constraints.m3907boximpl(j10), Float.valueOf(height), composer2, Integer.valueOf((i12 >> 3) & 896));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            arrayList.add(listSubcompose.get(i13).mo3011measureBRTryo0(j10));
                        }
                        int iMax = Math.max(Constraints.m3921getMinWidthimpl(j10), placeableMo3011measureBRTryo0.getWidth());
                        int iMax2 = Math.max(Constraints.m3920getMinHeightimpl(j10), placeableMo3011measureBRTryo0.getHeight());
                        int size2 = arrayList.size();
                        int iMax3 = iMax;
                        int iMax4 = iMax2;
                        for (int i14 = 0; i14 < size2; i14++) {
                            Placeable placeable = (Placeable) arrayList.get(i14);
                            iMax3 = Math.max(iMax3, placeable.getWidth());
                            iMax4 = Math.max(iMax4, placeable.getHeight());
                        }
                        return MeasureScope.CC.p(SubcomposeLayout, iMax3, iMax4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList;
                                int size3 = list.size();
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Placeable.PlacementScope.placeRelative$default(layout, list.get(i15), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i11 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropStack.2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                BackdropScaffoldKt.BackdropStack(modifier, function2, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m901Scrim3JVO9M(final long j10, final Function0<Unit> function0, final boolean z10, Composer composer, final int i10) {
        int i11;
        Modifier modifierPointerInput;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92141505);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i11, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:382)");
            }
            if (j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
                final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.startReplaceableGroup(1010547004);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.f93236a;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue);
                } else {
                    modifierPointerInput = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierPointerInput);
                Color colorM1594boximpl = Color.m1594boximpl(j10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(colorM1594boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            b.K(Canvas, j10, 0L, 0L, BackdropScaffoldKt.Scrim_3J_VO9M$lambda$4(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                BackdropScaffoldKt.m901Scrim3JVO9M(j10, function0, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@NotNull final BackdropValue initialValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super BackdropValue, Boolean> function1, @Nullable final SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BackdropValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i10, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:167)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m1261rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BackdropScaffoldState invoke() {
                return new BackdropScaffoldState(initialValue, animationSpec, function1, snackbarHostState);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}
