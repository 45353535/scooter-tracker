package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0002\b\u00132\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/OneLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconVerticalPadding", "MinHeight", "MinHeightWithIcon", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OneLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float TrailingRightPadding;

    @NotNull
    public static final OneLine INSTANCE = new OneLine();
    private static final float MinHeight = Dp.m3951constructorimpl(48);
    private static final float MinHeightWithIcon = Dp.m3951constructorimpl(56);
    private static final float IconMinPaddedWidth = Dp.m3951constructorimpl(40);
    private static final float IconVerticalPadding = Dp.m3951constructorimpl(8);

    static {
        float f10 = 16;
        IconLeftPadding = Dp.m3951constructorimpl(f10);
        ContentLeftPadding = Dp.m3951constructorimpl(f10);
        ContentRightPadding = Dp.m3951constructorimpl(f10);
        TrailingRightPadding = Dp.m3951constructorimpl(f10);
    }

    private OneLine() {
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void ListItem(@Nullable Modifier modifier, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> text, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884451315);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(text) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884451315, i12, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:135)");
            }
            Modifier modifierM449heightInVpY3zN4$default = SizeKt.m449heightInVpY3zN4$default(modifier2, function2 == null ? MinHeight : MinHeightWithIcon, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM449heightInVpY3zN4$default);
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
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1825884304);
            if (function2 != null) {
                Modifier modifierAlign = rowScopeInstance.align(Modifier.INSTANCE, companion.getCenterVertically());
                float f10 = IconLeftPadding;
                Modifier modifierM468widthInVpY3zN4$default = SizeKt.m468widthInVpY3zN4$default(modifierAlign, Dp.m3951constructorimpl(f10 + IconMinPaddedWidth), 0.0f, 2, null);
                float f11 = IconVerticalPadding;
                Modifier modifierM422paddingqDBjuR0$default = PaddingKt.m422paddingqDBjuR0$default(modifierM468widthInVpY3zN4$default, f10, f11, 0.0f, f11, 4, null);
                Alignment centerStart = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM422paddingqDBjuR0$default);
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
                Updater.m1255setimpl(composerM1248constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM422paddingqDBjuR0$default2 = PaddingKt.m422paddingqDBjuR0$default(rowScopeInstance.align(e.a(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.getCenterVertically()), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
            Alignment centerStart2 = companion.getCenterStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM422paddingqDBjuR0$default2);
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
            Updater.m1255setimpl(composerM1248constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl3, density3, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            text.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-2068381427);
            if (function22 != null) {
                Modifier modifierM422paddingqDBjuR0$default3 = PaddingKt.m422paddingqDBjuR0$default(rowScopeInstance.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, TrailingRightPadding, 0.0f, 11, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM422paddingqDBjuR0$default3);
                if (!s.a(composerStartRestartGroup.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1248constructorimpl4 = Updater.m1248constructorimpl(composerStartRestartGroup);
                Updater.m1255setimpl(composerM1248constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m1255setimpl(composerM1248constructorimpl4, density4, companion2.getSetDensity());
                Updater.m1255setimpl(composerM1248constructorimpl4, layoutDirection4, companion2.getSetLayoutDirection());
                Updater.m1255setimpl(composerM1248constructorimpl4, viewConfiguration4, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
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
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OneLine.ListItem.2
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

            public final void invoke(@Nullable Composer composer2, int i14) {
                OneLine.this.ListItem(modifier3, function2, text, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }
}
