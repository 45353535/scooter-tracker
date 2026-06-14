package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 A2\u00020\u0001:\u0002ABB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J;\u0010#\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+JS\u00109\u001a\u00020\u001f\"\b\b\u0000\u0010-*\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108R \u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/layout/LookaheadScope;", "scope", "Landroidx/compose/ui/node/LookaheadDelegate;", "createLookaheadDelegate", "(Landroidx/compose/ui/layout/LookaheadScope;)Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "Landroidx/compose/ui/Modifier$Node;", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "getTail$annotations", "()V", y.f66058y, "LookaheadDelegateImpl", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InnerNodeCoordinator extends NodeCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Paint innerBoundsPaint;

    @NotNull
    private final Modifier.Node tail;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "(Landroidx/compose/ui/node/InnerNodeCoordinator;Landroidx/compose/ui/layout/LookaheadScope;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeChildren", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        final /* synthetic */ InnerNodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateImpl(@NotNull InnerNodeCoordinator innerNodeCoordinator, LookaheadScope scope) {
            super(innerNodeCoordinator, scope);
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.this$0 = innerNodeCoordinator;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return getLayoutNode().getIntrinsicsPolicy().maxLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo3011measureBRTryo0(long constraints) {
            m3045setMeasurementConstraintsBRTryo0(constraints);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    content[i10].setMeasuredByParentInLookahead$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i10++;
                } while (i10 < size);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo30measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return getLayoutNode().getIntrinsicsPolicy().minLookaheadIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.checkNotNull(lookaheadPassDelegate);
            lookaheadPassDelegate.onPlaced();
            getAlignmentLinesOwner().layoutChildren();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1492setColor8_81llA(Color.INSTANCE.m1638getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1496setStylek9PVt8s(PaintingStyle.INSTANCE.m1846getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerNodeCoordinator(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.tail = new Modifier.Node() { // from class: androidx.compose.ui.node.InnerNodeCoordinator$tail$1
            @NotNull
            public String toString() {
                return "<tail>";
            }
        };
        getTail().updateCoordinator$ui_release(this);
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public LookaheadDelegate createLookaheadDelegate(@NotNull LookaheadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new LookaheadDelegateImpl(this, scope);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public Modifier.Node getTail() {
        return this.tail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends androidx.compose.ui.node.DelegatableNode> void mo3121hitTestChildYqVAtuI(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.NodeCoordinator.HitTestSource<T> r11, long r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.node.HitTestResult<T> r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            java.lang.String r0 = "hitTestSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "hitTestResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            boolean r0 = r11.shouldHitTestChildren(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L38
            boolean r0 = r10.m3193withinLayerBoundsk4lQ0M(r12)
            if (r0 == 0) goto L20
            r9 = r16
        L1e:
            r2 = r1
            goto L3a
        L20:
            if (r15 == 0) goto L38
            long r3 = r10.m3183getMinimumTouchTargetSizeNHjbRc()
            float r0 = r10.m3180distanceInMinimumTouchTargettz77jQw(r12, r3)
            boolean r3 = java.lang.Float.isInfinite(r0)
            if (r3 != 0) goto L38
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L38
            r9 = r2
            goto L1e
        L38:
            r9 = r16
        L3a:
            if (r2 == 0) goto L81
            int r0 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r14)
            androidx.compose.ui.node.LayoutNode r2 = r10.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r2 = r2.getZSortedChildren()
            int r3 = r2.getSize()
            if (r3 <= 0) goto L7e
            int r3 = r3 - r1
            java.lang.Object[] r1 = r2.getContent()
            r2 = r3
        L54:
            r3 = r1[r2]
            r4 = r3
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.ui.node.LayoutNode) r4
            boolean r3 = r4.getIsPlaced()
            if (r3 == 0) goto L7a
            r3 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            r3.mo3194childHitTestYqVAtuI(r4, r5, r7, r8, r9)
            boolean r3 = r14.hasHit()
            if (r3 != 0) goto L6d
            goto L7a
        L6d:
            androidx.compose.ui.node.NodeCoordinator r3 = r4.getOuterCoordinator$ui_release()
            boolean r3 = r3.shouldSharePointerInputWithSiblings()
            if (r3 == 0) goto L7e
            r14.acceptHits()
        L7a:
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L54
        L7e:
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r14, r0)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.mo3121hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo3011measureBRTryo0(long constraints) {
        m3045setMeasurementConstraintsBRTryo0(constraints);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i10++;
            } while (i10 < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo30measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), constraints));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.getIsPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i10++;
            } while (i10 < size);
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo3012placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        super.mo3012placeAtf8xVGno(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        getLayoutNode().onNodePlaced$ui_release();
    }
}
