package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0011\u001a\u00020\u0004*\u00020\u00042$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutScopeImpl;", "Landroidx/compose/ui/layout/LookaheadLayoutScope;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "", "onPlaced", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "intermediateLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/NodeCoordinator;", "root", "Landroidx/compose/ui/node/NodeCoordinator;", "getRoot", "()Landroidx/compose/ui/node/NodeCoordinator;", "setRoot", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LookaheadLayoutScopeImpl implements LookaheadLayoutScope {

    @Nullable
    private NodeCoordinator root;

    @Nullable
    public final NodeCoordinator getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.layout.LookaheadLayoutScope
    @NotNull
    public Modifier intermediateLayout(@NotNull Modifier modifier, @NotNull final Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(measure, "measure");
        return modifier.then(new LookaheadIntermediateLayoutModifierImpl(measure, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$intermediateLayout$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("intermediateLayout");
                inspectorInfo.getProperties().set("measure", measure);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.ui.layout.LookaheadLayoutScope
    @NotNull
    public Modifier onPlaced(@NotNull Modifier modifier, @NotNull final Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> onPlaced) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("onPlaced");
                inspectorInfo.getProperties().set("onPlaced", onPlaced);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-814093691);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-814093691, i10, -1, "androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.<anonymous> (LookaheadLayout.kt:176)");
                }
                Function2<LookaheadLayoutCoordinates, LookaheadLayoutCoordinates, Unit> function2 = onPlaced;
                final LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = this;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LookaheadOnPlacedModifier(function2, new Function0<LookaheadLayoutCoordinates>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LookaheadLayoutCoordinates invoke() {
                            NodeCoordinator root = lookaheadLayoutScopeImpl.getRoot();
                            if (root != null) {
                                LookaheadDelegate lookaheadDelegate = root.getLookaheadDelegate();
                                Intrinsics.checkNotNull(lookaheadDelegate);
                                LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates();
                                if (lookaheadLayoutCoordinates != null) {
                                    return lookaheadLayoutCoordinates;
                                }
                            }
                            throw new IllegalStateException("Lookahead root has not been set up yet");
                        }
                    });
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = composed.then((Modifier) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    public final void setRoot(@Nullable NodeCoordinator nodeCoordinator) {
        this.root = nodeCoordinator;
    }
}
