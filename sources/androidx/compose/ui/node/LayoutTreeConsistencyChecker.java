package androidx.compose.ui.node;

import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\f\u0010\u0012\u001a\u00020\r*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "postponedMeasureRequests", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutTreeConsistencyChecker {

    @NotNull
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSet relayoutNodes;

    @NotNull
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode root, @NotNull DepthSortedSet relayoutNodes, @NotNull List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = postponedMeasureRequests;
    }

    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        if (layoutNode.getIsPlaced() || (layoutNode.getPlaceOrder() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.getIsPlaced())) {
            if (layoutNode.getMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list = this.postponedMeasureRequests;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i10);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                    if (Intrinsics.areEqual(postponedRequest3.getNode(), layoutNode) && !postponedRequest3.getIsLookahead()) {
                        break;
                    }
                    i10++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode) || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.Measuring;
            }
            if (layoutNode.getLayoutPending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode) || parent$ui_release == null || parent$ui_release.getMeasurePending$ui_release() || parent$ui_release.getLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut;
            }
        }
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list2.get(i11);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (Intrinsics.areEqual(postponedRequest5.getNode(), layoutNode) && postponedRequest5.getIsLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                    i11++;
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring)) {
                    if (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) {
                        LookaheadScope mLookaheadScope = layoutNode.getMLookaheadScope();
                        Intrinsics.checkNotNull(mLookaheadScope);
                        if (Intrinsics.areEqual(mLookaheadScope.getRoot(), layoutNode)) {
                        }
                    }
                    return false;
                }
                return true;
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release() && !this.relayoutNodes.contains(layoutNode) && parent$ui_release != null && !parent$ui_release.getLookaheadMeasurePending$ui_release() && !parent$ui_release.getLookaheadLayoutPending$ui_release() && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != LayoutNode.LayoutState.LookaheadLayingOut) {
                if (parent$ui_release.getLayoutPending$ui_release()) {
                    LookaheadScope mLookaheadScope2 = layoutNode.getMLookaheadScope();
                    Intrinsics.checkNotNull(mLookaheadScope2);
                    if (Intrinsics.areEqual(mLookaheadScope2.getRoot(), layoutNode)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final boolean isTreeConsistent(LayoutNode node) {
        if (!consistentLayoutState(node)) {
            return false;
        }
        List<LayoutNode> children$ui_release = node.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!isTreeConsistent(children$ui_release.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        logTree$printSubTree(this, sb2, this.root, 0);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb2, LayoutNode layoutNode, int i10) {
        String strNodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (strNodeToString.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strNodeToString);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
            i10++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb2, children$ui_release.get(i12), i10);
        }
    }

    private final String nodeToString(LayoutNode node) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(node);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(node.getLayoutState$ui_release());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!node.getIsPlaced()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + node.getMeasuredByParent() + ']');
        if (!consistentLayoutState(node)) {
            sb2.append("[INCONSISTENT]");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(StringBuilder()) {\n…     toString()\n        }");
        return string;
    }

    public final void assertConsistent() {
        if (isTreeConsistent(this.root)) {
            return;
        }
        System.out.println((Object) logTree());
        throw new IllegalStateException("Inconsistency found!");
    }
}
