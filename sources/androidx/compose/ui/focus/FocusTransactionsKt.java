package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\r"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
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
    public static final boolean captureFocus(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new m();
    }

    @ExperimentalComposeUiApi
    private static final boolean clearChildFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z10, boolean z11) {
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return clearChildFocus(focusTargetModifierNode, z10, z11);
    }

    @ExperimentalComposeUiApi
    public static final boolean clearFocus(@NotNull FocusTargetModifierNode focusTargetModifierNode, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
            if (z11) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
            return true;
        }
        if (i10 == 2) {
            if (z10) {
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
                if (z11) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                }
            }
            return z10;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new m();
        }
        if (!clearChildFocus(focusTargetModifierNode, z10, z11)) {
            return false;
        }
        focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
        if (z11) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return clearFocus(focusTargetModifierNode, z10, z11);
    }

    @ExperimentalComposeUiApi
    public static final boolean freeFocus(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    return false;
                }
                throw new m();
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
        }
        return true;
    }

    private static final boolean grantFocus(final FocusTargetModifierNode focusTargetModifierNode) {
        ObserverNodeKt.observeReads(focusTargetModifierNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                focusTargetModifierNode.fetchFocusProperties$ui_release();
            }
        });
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        return true;
    }

    @ExperimentalComposeUiApi
    public static final boolean requestFocus(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        boolean z10;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        if (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
            return TwoDimensionalFocusSearchKt.m1332findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, FocusDirection.INSTANCE.m1304getEnterdhqQ8s(), new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull FocusTargetModifierNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
                }
            });
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 == 1 || i10 == 2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i10 == 3) {
            z10 = clearChildFocus$default(focusTargetModifierNode, false, false, 3, null) && grantFocus(focusTargetModifierNode);
            if (z10) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
            return z10;
        }
        if (i10 != 4) {
            throw new m();
        }
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m3199constructorimpl(1024));
        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) (nodeNearestAncestor instanceof FocusTargetModifierNode ? nodeNearestAncestor : null);
        if (focusTargetModifierNode2 != null) {
            return requestFocusForChild(focusTargetModifierNode2, focusTargetModifierNode);
        }
        z10 = requestFocusForOwner(focusTargetModifierNode) && grantFocus(focusTargetModifierNode);
        if (z10) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
        }
        return z10;
    }

    private static final boolean requestFocusForChild(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode2, NodeKind.m3199constructorimpl(1024));
        if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
            nodeNearestAncestor = null;
        }
        if (!Intrinsics.areEqual((FocusTargetModifierNode) nodeNearestAncestor, focusTargetModifierNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i10 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetModifierNode2);
            if (zGrantFocus) {
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.ActiveParent);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
            return zGrantFocus;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            if (FocusTraversalKt.getActiveChild(focusTargetModifierNode) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            boolean z10 = clearChildFocus$default(focusTargetModifierNode, false, false, 3, null) && grantFocus(focusTargetModifierNode2);
            if (z10) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
            }
            return z10;
        }
        if (i10 != 4) {
            throw new m();
        }
        Modifier.Node nodeNearestAncestor2 = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m3199constructorimpl(1024));
        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) (nodeNearestAncestor2 instanceof FocusTargetModifierNode ? nodeNearestAncestor2 : null);
        if (focusTargetModifierNode3 == null && requestFocusForOwner(focusTargetModifierNode)) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
        }
        if (focusTargetModifierNode3 == null || !requestFocusForChild(focusTargetModifierNode3, focusTargetModifierNode)) {
            return false;
        }
        boolean zRequestFocusForChild = requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
        if (focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent) {
            return zRequestFocusForChild;
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final boolean requestFocusForOwner(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        Owner owner;
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.");
        }
        return owner.requestFocus();
    }
}
