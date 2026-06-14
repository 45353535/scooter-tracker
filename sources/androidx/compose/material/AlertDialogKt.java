package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\t*\u00020\u001f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"TextBaselineDistanceFromTitle", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTop", "TextPadding", "Landroidx/compose/ui/Modifier;", "TitleBaselineDistanceFromTop", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle;
    private static final long TextBaselineDistanceFromTop;

    @NotNull
    private static final Modifier TextPadding;
    private static final long TitleBaselineDistanceFromTop;

    @NotNull
    private static final Modifier TitlePadding;

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 24;
        TitlePadding = PaddingKt.m422paddingqDBjuR0$default(companion, Dp.m3951constructorimpl(f10), 0.0f, Dp.m3951constructorimpl(f10), 0.0f, 10, null);
        TextPadding = PaddingKt.m422paddingqDBjuR0$default(companion, Dp.m3951constructorimpl(f10), 0.0f, Dp.m3951constructorimpl(f10), Dp.m3951constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogBaselineLayout(@NotNull final ColumnScope columnScope, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-555573207);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555573207, i10, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:92)");
            }
            Modifier modifierWeight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            AnonymousClass2 anonymousClass2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt.AlertDialogBaselineLayout.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.a(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.b(this, intrinsicMeasureScope, list, i12);
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @org.jetbrains.annotations.NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final androidx.compose.ui.layout.MeasureResult mo30measure3p2s80s(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.MeasureScope r12, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.compose.ui.layout.Measurable> r13, long r14) {
                    /*
                        Method dump skipped, instruction units count: 321
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.AnonymousClass2.mo30measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.c(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.d(this, intrinsicMeasureScope, list, i12);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierWeight);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, anonymousClass2, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1160646206);
            if (function2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(TitlePadding, "title");
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierAlign = columnScope.align(modifierLayoutId, companion2.getStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
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
                Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1735756597);
            if (function22 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(TextPadding, "text");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier modifierAlign2 = columnScope.align(modifierLayoutId2, companion3.getStart());
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlign2);
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
                Updater.m1255setimpl(composerM1248constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl3, density3, companion.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function22.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt.AlertDialogBaselineLayout.3
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
                AlertDialogKt.AlertDialogBaselineLayout(columnScope, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m885AlertDialogContentWMdw5o4(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r27, long r28, long r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m885AlertDialogContentWMdw5o4(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m886AlertDialogFlowRowixp7dh8(final float f10, final float f11, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(73434452);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(f11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73434452, i11, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:187)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1
                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, t0 t0Var, MeasureScope measureScope, float f12, long j10, Placeable placeable) {
                    return list.isEmpty() || (t0Var.f93331b + measureScope.mo302roundToPx0680j_4(f12)) + placeable.getWidth() <= Constraints.m3919getMaxWidthimpl(j10);
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, t0 t0Var, MeasureScope measureScope, float f12, List<Placeable> list2, List<Integer> list3, t0 t0Var2, List<Integer> list4, t0 t0Var3, t0 t0Var4) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        t0Var.f93331b += measureScope.mo302roundToPx0680j_4(f12);
                    }
                    list5.add(CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(t0Var2.f93331b));
                    list4.add(Integer.valueOf(t0Var.f93331b));
                    t0Var.f93331b += t0Var2.f93331b;
                    t0Var3.f93331b = Math.max(t0Var3.f93331b, t0Var4.f93331b);
                    list2.clear();
                    t0Var4.f93331b = 0;
                    t0Var2.f93331b = 0;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.a(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.b(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long j10) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    t0 t0Var;
                    Placeable placeable;
                    t0 t0Var2;
                    t0 t0Var3;
                    MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = arrayList3;
                    final ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = arrayList4;
                    t0 t0Var4 = new t0();
                    t0 t0Var5 = new t0();
                    ArrayList arrayList8 = new ArrayList();
                    t0 t0Var6 = new t0();
                    t0 t0Var7 = new t0();
                    long jConstraints$default = ConstraintsKt.Constraints$default(0, Constraints.m3919getMaxWidthimpl(j10), 0, 0, 13, null);
                    Iterator<? extends Measurable> it = measurables.iterator();
                    while (it.hasNext()) {
                        Placeable placeableMo3011measureBRTryo0 = it.next().mo3011measureBRTryo0(jConstraints$default);
                        ArrayList arrayList9 = arrayList8;
                        arrayList8 = arrayList9;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList9, t0Var6, Layout, f10, j10, placeableMo3011measureBRTryo0)) {
                            Layout = measureScope;
                            arrayList = arrayList5;
                            arrayList2 = arrayList7;
                            t0Var = t0Var6;
                            placeable = placeableMo3011measureBRTryo0;
                            t0Var2 = t0Var5;
                            t0Var3 = t0Var7;
                        } else {
                            Layout = measureScope;
                            arrayList = arrayList5;
                            arrayList2 = arrayList7;
                            t0Var = t0Var6;
                            placeable = placeableMo3011measureBRTryo0;
                            t0Var2 = t0Var5;
                            t0Var3 = t0Var7;
                            measure_3p2s80s$startNewSequence(arrayList, t0Var2, Layout, f11, arrayList8, arrayList2, t0Var3, arrayList6, t0Var4, t0Var);
                        }
                        if (!arrayList8.isEmpty()) {
                            t0Var.f93331b += Layout.mo302roundToPx0680j_4(f10);
                        }
                        arrayList8.add(placeable);
                        t0Var.f93331b += placeable.getWidth();
                        t0Var3.f93331b = Math.max(t0Var3.f93331b, placeable.getHeight());
                        t0Var5 = t0Var2;
                        arrayList7 = arrayList2;
                        t0Var7 = t0Var3;
                        t0Var6 = t0Var;
                        arrayList5 = arrayList;
                    }
                    final ArrayList arrayList10 = arrayList5;
                    ArrayList arrayList11 = arrayList7;
                    t0 t0Var8 = t0Var7;
                    t0 t0Var9 = t0Var6;
                    t0 t0Var10 = t0Var5;
                    if (!arrayList8.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList10, t0Var10, Layout, f11, arrayList8, arrayList11, t0Var8, arrayList6, t0Var4, t0Var9);
                    }
                    final int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10) != Integer.MAX_VALUE ? Constraints.m3919getMaxWidthimpl(j10) : Math.max(t0Var4.f93331b, Constraints.m3921getMinWidthimpl(j10));
                    int iMax = Math.max(t0Var10.f93331b, Constraints.m3920getMinHeightimpl(j10));
                    final float f12 = f10;
                    return MeasureScope.CC.p(measureScope, iM3919getMaxWidthimpl, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope layout = placementScope;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<List<Placeable>> list = arrayList10;
                            MeasureScope measureScope2 = measureScope;
                            float f13 = f12;
                            int i12 = iM3919getMaxWidthimpl;
                            List<Integer> list2 = arrayList6;
                            int size = list.size();
                            int i13 = 0;
                            while (i13 < size) {
                                List<Placeable> list3 = list.get(i13);
                                int size2 = list3.size();
                                int[] iArr = new int[size2];
                                int i14 = 0;
                                while (i14 < size2) {
                                    iArr[i14] = list3.get(i14).getWidth() + (i14 < CollectionsKt.getLastIndex(list3) ? measureScope2.mo302roundToPx0680j_4(f13) : 0);
                                    i14++;
                                }
                                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                int[] iArr2 = new int[size2];
                                for (int i15 = 0; i15 < size2; i15++) {
                                    iArr2[i15] = 0;
                                }
                                bottom.arrange(measureScope2, i12, iArr, iArr2);
                                int size3 = list3.size();
                                int i16 = 0;
                                while (i16 < size3) {
                                    Placeable.PlacementScope.place$default(layout, list3.get(i16), iArr2[i16], list2.get(i13).intValue(), 0.0f, 4, null);
                                    i16++;
                                    layout = placementScope;
                                    iArr2 = iArr2;
                                    size3 = size3;
                                    list3 = list3;
                                }
                                i13++;
                                layout = placementScope;
                            }
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.c(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return e.d(this, intrinsicMeasureScope, list, i12);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            int i12 = ((((i11 >> 6) & 14) << 9) & 7168) | 6;
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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
                AlertDialogKt.m886AlertDialogFlowRowixp7dh8(f10, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }
}
