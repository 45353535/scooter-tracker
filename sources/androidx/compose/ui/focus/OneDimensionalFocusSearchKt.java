package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001aE\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u000e\u001aE\u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u000e\u001a \u0010\u0010\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a=\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a5\u0010\u0018\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a \u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a=\u0010\u001d\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "backwardFocusSearch", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "onFound", "Lkotlin/Function1;", "forEachItemAfter", "", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "action", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "generateAndSearchChildren", "focusedItem", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "isRoot", "oneDimensionalFocusSearch", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "pickChildForBackwardSearch", "pickChildForForwardSearch", "searchChildren", "searchChildren-4C6V_qg", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OneDimensionalFocusSearchKt {

    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";

    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean backwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusStateImpl focusStateImpl = focusTargetModifierNode.getFocusStateImpl();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[focusStateImpl.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return pickChildForBackwardSearch(focusTargetModifierNode, function1);
            }
            if (i10 != 4) {
                throw new m();
            }
            if (!pickChildForBackwardSearch(focusTargetModifierNode, function1)) {
                if (!(focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? function1.invoke(focusTargetModifierNode).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i11 = iArr[activeChild.getFocusStateImpl().ordinal()];
        if (i11 == 1) {
            return backwardFocusSearch(activeChild, function1) || m1326generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m1310getPreviousdhqQ8s(), function1) || (activeChild.fetchFocusProperties$ui_release().getCanFocus() && function1.invoke(activeChild).booleanValue());
        }
        if (i11 == 2 || i11 == 3) {
            return m1326generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m1310getPreviousdhqQ8s(), function1);
        }
        if (i11 != 4) {
            throw new m();
        }
        throw new IllegalStateException(NoActiveChild);
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t10, Function1<? super T, Unit> function1) {
        boolean z10 = false;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int iE = intRange.e();
        int iF = intRange.f();
        if (iE > iF) {
            return;
        }
        while (true) {
            if (z10) {
                function1.invoke(mutableVector.getContent()[iE]);
            }
            if (Intrinsics.areEqual(mutableVector.getContent()[iE], t10)) {
                z10 = true;
            }
            if (iE == iF) {
                return;
            } else {
                iE++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t10, Function1<? super T, Unit> function1) {
        boolean z10 = false;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int iE = intRange.e();
        int iF = intRange.f();
        if (iE > iF) {
            return;
        }
        while (true) {
            if (z10) {
                function1.invoke(mutableVector.getContent()[iF]);
            }
            if (Intrinsics.areEqual(mutableVector.getContent()[iF], t10)) {
                z10 = true;
            }
            if (iF == iE) {
                return;
            } else {
                iF--;
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean forwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, function1) || m1326generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m1308getNextdhqQ8s(), function1);
            }
            throw new IllegalStateException(NoActiveChild);
        }
        if (i10 == 2 || i10 == 3) {
            return pickChildForForwardSearch(focusTargetModifierNode, function1);
        }
        if (i10 == 4) {
            return focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? function1.invoke(focusTargetModifierNode).booleanValue() : pickChildForForwardSearch(focusTargetModifierNode, function1);
        }
        throw new m();
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1326generateAndSearchChildren4C6V_qg(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i10, final Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m1328searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m1291searchBeyondBoundsOMvw8(focusTargetModifierNode, i10, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Boolean invoke(@NotNull BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds) {
                Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
                boolean zM1328searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m1328searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i10, function1);
                Boolean boolValueOf = Boolean.valueOf(zM1328searchChildren4C6V_qg);
                if (zM1328searchChildren4C6V_qg || !searchBeyondBounds.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetModifierNode focusTargetModifierNode) {
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m3199constructorimpl(1024));
        if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
            nodeNearestAncestor = null;
        }
        return ((FocusTargetModifierNode) nodeNearestAncestor) == null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m1327oneDimensionalFocusSearchOMvw8(@NotNull FocusTargetModifierNode oneDimensionalFocusSearch, int i10, @NotNull Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1308getNextdhqQ8s())) {
            return forwardFocusSearch(oneDimensionalFocusSearch, onFound);
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1310getPreviousdhqQ8s())) {
            return backwardFocusSearch(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForBackwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM3199constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i10];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && backwardFocusSearch(focusTargetModifierNode2, function1)) {
                    return true;
                }
                i10--;
            } while (i10 >= 0);
        }
        return false;
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForForwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM3199constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i10];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && forwardFocusSearch(focusTargetModifierNode2, function1)) {
                    return true;
                }
                i10++;
            } while (i10 < size);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1328searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i10, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (focusTargetModifierNode.getFocusStateImpl() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM3199constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1308getNextdhqQ8s())) {
            IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
            int iE = intRange.e();
            int iF = intRange.f();
            if (iE <= iF) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) mutableVector.getContent()[iE];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode3) && forwardFocusSearch(focusTargetModifierNode3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(mutableVector.getContent()[iE], focusTargetModifierNode2)) {
                        z10 = true;
                    }
                    if (iE == iF) {
                        break;
                    }
                    iE++;
                }
            }
        } else {
            if (!FocusDirection.m1295equalsimpl0(i10, companion.m1310getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            IntRange intRange2 = new IntRange(0, mutableVector.getSize() - 1);
            int iE2 = intRange2.e();
            int iF2 = intRange2.f();
            if (iE2 <= iF2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) mutableVector.getContent()[iF2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode4) && backwardFocusSearch(focusTargetModifierNode4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(mutableVector.getContent()[iF2], focusTargetModifierNode2)) {
                        z11 = true;
                    }
                    if (iF2 == iE2) {
                        break;
                    }
                    iF2--;
                }
            }
        }
        if (FocusDirection.m1295equalsimpl0(i10, FocusDirection.INSTANCE.m1308getNextdhqQ8s()) || !focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetModifierNode)) {
            return false;
        }
        return function1.invoke(focusTargetModifierNode).booleanValue();
    }
}
