package androidx.compose.ui.layout;

import androidx.activity.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\t\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\t\u0010\u000b\u001a@\u0010\t\u001a\u00020\u00012\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\t\u0010\u000f\u001a=\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Layout", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "", "contents", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "combineAsVirtualLayouts", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "materializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutKt {
    @Composable
    @UiComposable
    public static final void Layout(@NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(-1323940314);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = materializerOf(modifier);
        int i12 = ((i10 << 9) & 7168) | 6;
        if (!s.a(composer.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i12 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void MultiMeasureLayout(@Nullable Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @NotNull final MeasurePolicy measurePolicy, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1949933075);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:203)");
            }
            Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifier);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i14 = ((i12 << 3) & 896) | 6;
            composerStartRestartGroup.startReplaceableGroup(-692256719);
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m1255setimpl(composerM1248constructorimpl, modifierMaterialize, companion.getSetModifier());
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m1252initimpl(composerM1248constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode init) {
                    Intrinsics.checkNotNullParameter(init, "$this$init");
                    init.setCanMultiMeasure$ui_release(true);
                }
            });
            content.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
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
                LayoutKt.MultiMeasureLayout(modifier2, content, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    @NotNull
    public static final Function2<Composer, Integer, Unit> combineAsVirtualLayouts(@NotNull final List<? extends Function2<? super Composer, ? super Integer, Unit>> contents) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.f93236a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
                }
                List<Function2<Composer, Integer, Unit>> list = contents;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Function2<Composer, Integer, Unit> function2 = list.get(i11);
                    Function0<ComposeUiNode> virtualConstructor = ComposeUiNode.INSTANCE.getVirtualConstructor();
                    composer.startReplaceableGroup(-692256719);
                    if (!s.a(composer.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(virtualConstructor);
                    } else {
                        composer.useNode();
                    }
                    Updater.m1248constructorimpl(composer);
                    function2.invoke(composer, 0);
                    composer.endNode();
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(@NotNull final Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m3022invokeDeg8D_g(skippableUpdater.getComposer(), composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m3022invokeDeg8D_g(@NotNull Composer composer, @Nullable Composer composer2, int i10) {
                Intrinsics.checkNotNullParameter(composer, "$this$null");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)");
                }
                Modifier modifierMaterialize = ComposedModifierKt.materialize(composer2, modifier);
                composer.startReplaceableGroup(509942095);
                Updater.m1255setimpl(Updater.m1248constructorimpl(composer), modifierMaterialize, ComposeUiNode.INSTANCE.getSetModifier());
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @Composable
    @UiComposable
    public static final void Layout(@Nullable Modifier modifier, @NotNull MeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(544976794);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier modifierMaterialize = ComposedModifierKt.materialize(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final Function0<ComposeUiNode> constructor = companion.getConstructor();
        composer.startReplaceableGroup(1405779621);
        if (!s.a(composer.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ComposeUiNode invoke() {
                    return constructor.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1255setimpl(composerM1248constructorimpl, modifierMaterialize, companion.getSetModifier());
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @UiComposable
    public static final void Layout(@NotNull List<? extends Function2<? super Composer, ? super Integer, Unit>> contents, @Nullable Modifier modifier, @NotNull MultiContentMeasurePolicy measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(1399185516);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = combineAsVirtualLayouts(contents);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(measurePolicy);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(measurePolicy);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue;
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = materializerOf(modifier);
        if (!s.a(composer.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy2, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        function2CombineAsVirtualLayouts.invoke(composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
