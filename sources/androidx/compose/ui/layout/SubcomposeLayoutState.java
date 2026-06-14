package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.adapters.bigo.BigoAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tJ*\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fRA\u0010&\u001a&\u0012\u0004\u0012\u00020\u001b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u001a\u0012\u0004\u0012\u00020\f0\u001a8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0014\u0010*\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "()V", "", "maxSlotsToRetainForReuse", "(I)V", BigoAdapter.SLOT_ID, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren$ui_release", "forceRecomposeChildren", "disposeCurrentNodes$ui_release", "disposeCurrentNodes", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "_state", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "setRoot", "Lkotlin/jvm/functions/Function2;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "getSetCompositionContext$ui_release", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "setMeasurePolicy", "getSetMeasurePolicy$ui_release", "getState", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "state", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubcomposeLayoutState {
    public static final int $stable = 8;

    @Nullable
    private LayoutNodeSubcompositionsState _state;

    @NotNull
    private final Function2<LayoutNode, CompositionContext, Unit> setCompositionContext;

    @NotNull
    private final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> setMeasurePolicy;

    @NotNull
    private final Function2<LayoutNode, SubcomposeLayoutState, Unit> setRoot;

    @NotNull
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J%\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "placeablesCount", "", "getPlaceablesCount", "()I", "dispose", "", "premeasure", FirebaseAnalytics.Param.INDEX, "constraints", "Landroidx/compose/ui/unit/Constraints;", "premeasure-0kLqBqw", "(IJ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount();

        /* JADX INFO: renamed from: premeasure-0kLqBqw */
        void mo3023premeasure0kLqBqw(int index, long constraints);
    }

    public SubcomposeLayoutState(@NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.slotReusePolicy = slotReusePolicy;
        this.setRoot = new Function2<LayoutNode, SubcomposeLayoutState, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                invoke2(layoutNode, subcomposeLayoutState);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull SubcomposeLayoutState it) {
                Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                SubcomposeLayoutState subcomposeLayoutState = this.this$0;
                LayoutNodeSubcompositionsState subcompositionsState = layoutNode.getSubcompositionsState();
                if (subcompositionsState == null) {
                    subcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
                    layoutNode.setSubcompositionsState$ui_release(subcompositionsState);
                }
                subcomposeLayoutState._state = subcompositionsState;
                this.this$0.getState().makeSureStateIsConsistent();
                this.this$0.getState().setSlotReusePolicy(this.this$0.slotReusePolicy);
            }
        };
        this.setCompositionContext = new Function2<LayoutNode, CompositionContext, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
                invoke2(layoutNode, compositionContext);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull CompositionContext it) {
                Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getState().setCompositionContext(it);
            }
        };
        this.setMeasurePolicy = new Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
                invoke2(layoutNode, function2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> it) {
                Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                layoutNode.setMeasurePolicy(this.this$0.getState().createMeasurePolicy(it));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void disposeCurrentNodes$ui_release() {
        getState().disposeCurrentNodes();
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    @NotNull
    public final Function2<LayoutNode, CompositionContext, Unit> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    @NotNull
    public final Function2<LayoutNode, SubcomposeLayoutState, Unit> getSetRoot$ui_release() {
        return this.setRoot;
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return getState().precompose(slotId, content);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    public SubcomposeLayoutState(int i10) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i10));
    }
}
