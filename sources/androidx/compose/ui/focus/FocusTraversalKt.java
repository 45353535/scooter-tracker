package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0001\u001a=\u0010\u0016\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"activeChild", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getActiveChild$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "isEligibleForFocusSearch", "", "isEligibleForFocusSearch$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "findNonDeactivatedParent", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusSearch", "onFound", "Lkotlin/Function1;", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusTraversalKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m1323customFocusSearchOMvw8(@NotNull FocusTargetModifierNode customFocusSearch, int i10, @NotNull LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = customFocusSearch.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1308getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1310getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                start = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                if (i11 != 2) {
                    throw new m();
                }
                start = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            }
            focusRequester = Intrinsics.areEqual(start, FocusRequester.INSTANCE.getDefault()) ? null : start;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui_release.getLeft() : focusRequester;
        }
        if (!FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s())) {
            if (FocusDirection.m1295equalsimpl0(i10, companion.m1304getEnterdhqQ8s())) {
                return focusPropertiesFetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m1292boximpl(i10));
            }
            if (FocusDirection.m1295equalsimpl0(i10, companion.m1305getExitdhqQ8s())) {
                return focusPropertiesFetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m1292boximpl(i10));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i12 == 1) {
            end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
        } else {
            if (i12 != 2) {
                throw new m();
            }
            end = focusPropertiesFetchFocusProperties$ui_release.getStart();
        }
        focusRequester = Intrinsics.areEqual(end, FocusRequester.INSTANCE.getDefault()) ? null : end;
        return focusRequester == null ? focusPropertiesFetchFocusProperties$ui_release.getRight() : focusRequester;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetModifierNode findActiveFocusNode(@org.jetbrains.annotations.NotNull androidx.compose.ui.focus.FocusTargetModifierNode r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r6.getFocusStateImpl()
            int[] r1 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L94
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L94
            r6 = 4
            if (r0 != r6) goto L1f
            return r3
        L1f:
            lf.m r6 = new lf.m
            r6.<init>()
            throw r6
        L25:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m3199constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto L8c
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r4 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r4]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r6.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            if (r4 != 0) goto L51
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L54
        L51:
            r2.add(r4)
        L54:
            boolean r6 = r2.isNotEmpty()
            if (r6 == 0) goto L8b
            int r6 = r2.getSize()
            int r6 = r6 - r1
            java.lang.Object r6 = r2.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r4 = r6.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L70
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L54
        L70:
            if (r6 == 0) goto L54
            int r4 = r6.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L86
            boolean r4 = r6 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L54
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.ui.focus.FocusTargetModifierNode) r6
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = findActiveFocusNode(r6)
            if (r6 == 0) goto L54
            return r6
        L86:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L70
        L8b:
            return r3
        L8c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    private static final FocusTargetModifierNode findNonDeactivatedParent(FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes;
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node parent = focusTargetModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3199constructorimpl) != 0 && (parent instanceof FocusTargetModifierNode)) {
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) parent;
                        if (focusTargetModifierNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                            return focusTargetModifierNode2;
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Rect focusRect(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        Rect rectLocalBoundingBoxOf;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        return (coordinator == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator).localBoundingBoxOf(coordinator, false)) == null) ? Rect.INSTANCE.getZero() : rectLocalBoundingBoxOf;
    }

    /* JADX INFO: renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m1324focusSearchsMXa3k8(@NotNull FocusTargetModifierNode focusSearch, int i10, @NotNull LayoutDirection layoutDirection, @NotNull Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        int iM1311getRightdhqQ8s;
        Boolean boolM1336twoDimensionalFocusSearchOMvw8;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1308getNextdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1310getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m1327oneDimensionalFocusSearchOMvw8(focusSearch, i10, onFound);
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1307getLeftdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1311getRightdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1312getUpdhqQ8s()) ? true : FocusDirection.m1295equalsimpl0(i10, companion.m1303getDowndhqQ8s())) {
            Boolean boolM1336twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m1336twoDimensionalFocusSearchOMvw8(focusSearch, i10, onFound);
            if (boolM1336twoDimensionalFocusSearchOMvw82 != null) {
                return boolM1336twoDimensionalFocusSearchOMvw82.booleanValue();
            }
            return false;
        }
        if (FocusDirection.m1295equalsimpl0(i10, companion.m1304getEnterdhqQ8s())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                iM1311getRightdhqQ8s = companion.m1311getRightdhqQ8s();
            } else {
                if (i11 != 2) {
                    throw new m();
                }
                iM1311getRightdhqQ8s = companion.m1307getLeftdhqQ8s();
            }
            FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = findActiveFocusNode(focusSearch);
            if (focusTargetModifierNodeFindActiveFocusNode == null || (boolM1336twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m1336twoDimensionalFocusSearchOMvw8(focusTargetModifierNodeFindActiveFocusNode, iM1311getRightdhqQ8s, onFound)) == null) {
                return false;
            }
            return boolM1336twoDimensionalFocusSearchOMvw8.booleanValue();
        }
        if (!FocusDirection.m1295equalsimpl0(i10, companion.m1305getExitdhqQ8s())) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m1297toStringimpl(i10))).toString());
        }
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode2 = findActiveFocusNode(focusSearch);
        FocusTargetModifierNode focusTargetModifierNodeFindNonDeactivatedParent = focusTargetModifierNodeFindActiveFocusNode2 != null ? findNonDeactivatedParent(focusTargetModifierNodeFindActiveFocusNode2) : null;
        if (focusTargetModifierNodeFindNonDeactivatedParent == null || Intrinsics.areEqual(focusTargetModifierNodeFindNonDeactivatedParent, focusSearch)) {
            return false;
        }
        return onFound.invoke(focusTargetModifierNodeFindNonDeactivatedParent).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetModifierNode getActiveChild(@org.jetbrains.annotations.NotNull androidx.compose.ui.focus.FocusTargetModifierNode r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.Modifier$Node r0 = r6.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m3199constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto L88
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r3]
            r4 = 0
            r2.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r6.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L40
        L3d:
            r2.add(r3)
        L40:
            boolean r6 = r2.isNotEmpty()
            if (r6 == 0) goto L87
            int r6 = r2.getSize()
            r3 = 1
            int r6 = r6 - r3
            java.lang.Object r6 = r2.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r4 = r6.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L5d
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L40
        L5d:
            if (r6 == 0) goto L40
            int r4 = r6.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L82
            boolean r4 = r6 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L40
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.ui.focus.FocusTargetModifierNode) r6
            androidx.compose.ui.focus.FocusStateImpl r4 = r6.getFocusStateImpl()
            int[] r5 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r3) goto L81
            r3 = 2
            if (r4 == r3) goto L81
            r3 = 3
            if (r4 == r3) goto L81
            goto L40
        L81:
            return r6
        L82:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L5d
        L87:
            return r1
        L88:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getActiveChild$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }

    public static final boolean isEligibleForFocusSearch(@NotNull FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator2 = focusTargetModifierNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.getIsPlaced() || (coordinator = focusTargetModifierNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isEligibleForFocusSearch$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }
}
