package androidx.compose.ui.layout;

import androidx.activity.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadLayoutScope;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "LookaheadLayout", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LookaheadLayoutKt {
    @Composable
    @ExperimentalComposeUiApi
    @UiComposable
    public static final void LookaheadLayout(@NotNull final Function3<? super LookaheadLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Modifier modifier, @NotNull final MeasurePolicy measurePolicy, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(1697006219);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
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
            i12 |= composerStartRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1697006219, i12, -1, "androidx.compose.ui.layout.LookaheadLayout (LookaheadLayout.kt:67)");
            }
            Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifier);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LookaheadLayoutScopeImpl();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = (LookaheadLayoutScopeImpl) objRememberedValue;
            Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
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
            Updater.m1255setimpl(composerM1248constructorimpl, lookaheadLayoutScopeImpl, new Function2<LayoutNode, LookaheadLayoutScopeImpl, Unit>() { // from class: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl2) {
                    invoke2(layoutNode, lookaheadLayoutScopeImpl2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode set, @NotNull LookaheadLayoutScopeImpl scope) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    scope.setRoot(set.getInnerCoordinator$ui_release());
                }
            });
            Updater.m1252initimpl(composerM1248constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutNode init) {
                    Intrinsics.checkNotNullParameter(init, "$this$init");
                    init.setLookaheadRoot(true);
                }
            });
            content.invoke(lookaheadLayoutScopeImpl, composerStartRestartGroup, Integer.valueOf(((i12 << 3) & 112) | 8));
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.3
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
                LookaheadLayoutKt.LookaheadLayout(content, modifier2, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }
}
