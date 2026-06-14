package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0001FB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\bJ%\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b*J%\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b,J\u000e\u0010-\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0003J\u0018\u0010.\u001a\u00020\b2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020$\u0018\u000100J#\u0010.\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u001bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020$J\u000e\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020\u0003J\u0017\u00106\u001a\u00020$2\f\u00107\u001a\b\u0012\u0004\u0012\u00020$00H\u0082\bJ\u0010\u00108\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0003H\u0002J\u000e\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\u0013J\u0010\u0010;\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0003H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0003H\u0002J\u0018\u0010=\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\bJ\u0018\u0010?\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\bJ\u000e\u0010@\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0003J\u0018\u0010A\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\bJ\u0018\u0010B\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\bJ\u001b\u0010C\u001a\u00020$2\u0006\u0010)\u001a\u00020\u001bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0018\u0010!\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringMeasureLayout", "", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParent", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "canAffectParentInLookahead", "getCanAffectParentInLookahead", "measureAffectsParent", "getMeasureAffectsParent", "callOnLayoutCompletedListeners", "", "dispatchOnPositionedCallbacks", "forceDispatch", "doLookaheadRemeasure", "layoutNode", "constraints", "doLookaheadRemeasure-sdFAvZA", "doRemeasure", "doRemeasure-sdFAvZA", "forceMeasureTheSubtree", "measureAndLayout", "onLayout", "Lkotlin/Function0;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "measureOnly", "onNodeDetached", "node", "performMeasureAndLayout", "block", "recurseRemeasure", "registerOnLayoutCompletedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "remeasureAndRelayoutIfNeeded", "remeasureOnly", "requestLookaheadRelayout", "forced", "requestLookaheadRemeasure", "requestOnPositionedCallback", "requestRelayout", "requestRemeasure", "updateRootConstraints", "updateRootConstraints-BRTryo0", "(J)V", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MeasureAndLayoutDelegate {

    @Nullable
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;

    @NotNull
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;

    @NotNull
    private final OnPositionedDispatcher onPositionedDispatcher;

    @NotNull
    private final MutableVector<PostponedRequest> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSet relayoutNodes;

    @NotNull
    private final LayoutNode root;

    @Nullable
    private Constraints rootConstraints;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "isLookahead", "", "isForced", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "()Z", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;

        @NotNull
        private final LayoutNode node;

        public PostponedRequest(@NotNull LayoutNode node, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.isLookahead = z10;
            this.isForced = z11;
        }

        @NotNull
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: isForced, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: isLookahead, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        Owner.Companion companion = Owner.INSTANCE;
        DepthSortedSet depthSortedSet = new DepthSortedSet(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSet;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(root, depthSortedSet, mutableVector.asMutableList()) : null;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].onLayoutComplete();
                i10++;
            } while (i10 < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z10);
    }

    /* JADX INFO: renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m3153doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getMLookaheadScope() == null) {
            return false;
        }
        boolean zM3128lookaheadRemeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m3128lookaheadRemeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m3124lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM3128lookaheadRemeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (parent$ui_release.getMLookaheadScope() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
                return zM3128lookaheadRemeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
                return zM3128lookaheadRemeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM3128lookaheadRemeasure_Sx5XlM$ui_release;
    }

    /* JADX INFO: renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m3154doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean zM3129remeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m3129remeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m3125remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM3129remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
                return zM3129remeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM3129remeasure_Sx5XlM$ui_release;
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        if (layoutNode.getLookaheadLayoutPending$ui_release()) {
            return layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InMeasureBlock || !((lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
        }
        return false;
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    private final void performMeasureAndLayout(Function0<Unit> block) {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                block.invoke();
                z.b(1);
                this.duringMeasureLayout = false;
                z.a(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th2) {
                z.b(1);
                this.duringMeasureLayout = false;
                z.a(1);
                throw th2;
            }
        }
    }

    private final void recurseRemeasure(LayoutNode layoutNode) {
        remeasureOnly(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode2 = content[i10];
                if (getMeasureAffectsParent(layoutNode2)) {
                    recurseRemeasure(layoutNode2);
                }
                i10++;
            } while (i10 < size);
        }
        remeasureOnly(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode) {
        Constraints constraints;
        boolean zM3153doLookaheadRemeasuresdFAvZA;
        boolean zM3154doRemeasuresdFAvZA;
        int i10 = 0;
        if (!layoutNode.getIsPlaced() && !getCanAffectParent(layoutNode) && !Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            zM3153doLookaheadRemeasuresdFAvZA = layoutNode.getLookaheadMeasurePending$ui_release() ? m3153doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
            zM3154doRemeasuresdFAvZA = m3154doRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            zM3154doRemeasuresdFAvZA = false;
            zM3153doLookaheadRemeasuresdFAvZA = false;
        }
        if ((zM3153doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            layoutNode.lookaheadReplace$ui_release();
        }
        if (layoutNode.getLayoutPending$ui_release() && layoutNode.getIsPlaced()) {
            if (layoutNode == this.root) {
                layoutNode.place$ui_release(0, 0);
            } else {
                layoutNode.replace$ui_release();
            }
            this.onPositionedDispatcher.onNodePositioned(layoutNode);
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        if (this.postponedMeasureRequests.isNotEmpty()) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                PostponedRequest[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = content[i10];
                    if (postponedRequest.getNode().isAttached()) {
                        if (postponedRequest.getIsLookahead()) {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        } else {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        }
                    }
                    i10++;
                } while (i10 < size);
            }
            this.postponedMeasureRequests.clear();
        }
        return zM3154doRemeasuresdFAvZA;
    }

    private final void remeasureOnly(LayoutNode layoutNode) {
        Constraints constraints;
        if (layoutNode.getMeasurePending$ui_release() || layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                m3153doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            }
            m3154doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z10);
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.relayoutNodes.isEmpty()) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("Check failed.");
        }
        if (layoutNode.getMeasurePending$ui_release()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode2 = content[i10];
                if (layoutNode2.getMeasurePending$ui_release() && this.relayoutNodes.remove(layoutNode2)) {
                    remeasureAndRelayoutIfNeeded(layoutNode2);
                }
                if (!layoutNode2.getMeasurePending$ui_release()) {
                    forceMeasureTheSubtree(layoutNode2);
                }
                i10++;
            } while (i10 < size);
        }
        if (layoutNode.getMeasurePending$ui_release() && this.relayoutNodes.remove(layoutNode)) {
            remeasureAndRelayoutIfNeeded(layoutNode);
        }
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.relayoutNodes.isEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    public final boolean measureAndLayout(@Nullable Function0<Unit> onLayout) {
        boolean z10;
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z11 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                if (this.relayoutNodes.isEmpty()) {
                    z10 = false;
                } else {
                    DepthSortedSet depthSortedSet = this.relayoutNodes;
                    z10 = false;
                    while (!depthSortedSet.isEmpty()) {
                        LayoutNode layoutNodePop = depthSortedSet.pop();
                        boolean zRemeasureAndRelayoutIfNeeded = remeasureAndRelayoutIfNeeded(layoutNodePop);
                        if (layoutNodePop == this.root && zRemeasureAndRelayoutIfNeeded) {
                            z10 = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                throw th2;
            }
        }
        callOnLayoutCompletedListeners();
        return z11;
    }

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m3155measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (Intrinsics.areEqual(layoutNode, this.root)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                this.relayoutNodes.remove(layoutNode);
                boolean zM3153doLookaheadRemeasuresdFAvZA = m3153doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m3907boximpl(constraints));
                m3154doRemeasuresdFAvZA(layoutNode, Constraints.m3907boximpl(constraints));
                if (zM3153doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) {
                    if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                        layoutNode.lookaheadReplace$ui_release();
                    }
                }
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.getIsPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                throw th2;
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final void measureOnly() {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                recurseRemeasure(this.root);
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                throw th2;
            }
        }
    }

    public final void onNodeDetached(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.relayoutNodes.remove(node);
    }

    public final void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onLayoutCompletedListeners.add(listener);
    }

    public final boolean requestLookaheadRelayout(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new m();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !forced) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode);
            }
            return !this.duringMeasureLayout;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
        }
        return false;
    }

    public final boolean requestLookaheadRemeasure(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.getMLookaheadScope() == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new m();
                }
                if (layoutNode.getLookaheadMeasurePending$ui_release() && !forced) {
                    return false;
                }
                layoutNode.markLookaheadMeasurePending$ui_release();
                layoutNode.markMeasurePending$ui_release();
                if ((Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode);
                }
                return !this.duringMeasureLayout;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, forced));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
            return false;
        }
        if (i10 != 5) {
            throw new m();
        }
        if (!forced && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
            return false;
        }
        layoutNode.markLayoutPending$ui_release();
        if (layoutNode.getIsPlaced() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
            this.relayoutNodes.add(layoutNode);
        }
        return !this.duringMeasureLayout;
    }

    public final boolean requestRemeasure(@NotNull LayoutNode layoutNode, boolean forced) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new m();
                }
                if (layoutNode.getMeasurePending$ui_release() && !forced) {
                    return false;
                }
                layoutNode.markMeasurePending$ui_release();
                if ((layoutNode.getIsPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode);
                }
                return !this.duringMeasureLayout;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, forced));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m3156updateRootConstraintsBRTryo0(long constraints) {
        Constraints constraints2 = this.rootConstraints;
        if (constraints2 == null ? false : Constraints.m3912equalsimpl0(constraints2.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.rootConstraints = Constraints.m3907boximpl(constraints);
        this.root.markMeasurePending$ui_release();
        this.relayoutNodes.add(this.root);
    }
}
