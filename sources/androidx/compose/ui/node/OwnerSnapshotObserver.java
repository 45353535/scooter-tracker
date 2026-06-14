package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u000eJC\u0010\u001a\u001a\u00020\u0004\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)¨\u0006/"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "Landroidx/compose/ui/node/OwnerScope;", "T", TypedValues.AttributesType.S_TARGET, "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", "clear", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingLookaheadMeasure", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingMeasure", "onCommitAffectingLayout", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "onCommitAffectingLookaheadLayout", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OwnerSnapshotObserver {

    @NotNull
    private final SnapshotStateObserver observer;

    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLayout;

    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier;

    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifierInLookahead;

    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLookaheadLayout;

    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingLookaheadMeasure;

    @NotNull
    private final Function1<LayoutNode, Unit> onCommitAffectingMeasure;

    public OwnerSnapshotObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(onChangedExecutor);
        this.onCommitAffectingLookaheadMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayoutModifier = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayoutModifierInLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLookaheadLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z10, function0);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z10, function0);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z10, function0);
    }

    public final void clear$ui_release(@NotNull Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.observer.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new Function1<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!((OwnerScope) it).isValidOwnerScope());
            }
        });
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@NotNull LayoutNode node, boolean affectsLookahead, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(@NotNull LayoutNode node, boolean affectsLookahead, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            observeReads$ui_release(node, this.onCommitAffectingLayout, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLookaheadLayout, block);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(@NotNull LayoutNode node, boolean affectsLookahead, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            observeReads$ui_release(node, this.onCommitAffectingMeasure, block);
        } else {
            observeReads$ui_release(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@NotNull T target, @NotNull Function1<? super T, Unit> onChanged, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.observer.observeReads(target, onChanged, block);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
