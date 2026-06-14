package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 A2\u00020\u0001:\u0003ABCB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J;\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R*\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010@\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006D"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "Landroidx/compose/ui/layout/LookaheadScope;", "scope", "Landroidx/compose/ui/node/LookaheadDelegate;", "createLookaheadDelegate", "(Landroidx/compose/ui/layout/LookaheadScope;)Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "onLayoutModifierNodeChanged", "()V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;)V", "<set-?>", "layoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "Landroidx/compose/ui/node/IntermediateLayoutModifierNode;", "lookAheadTransientMeasureNode", "Landroidx/compose/ui/node/IntermediateLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", y.f66058y, "LookaheadDelegateForIntermediateLayoutModifier", "LookaheadDelegateForLayoutModifierNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Paint modifierBoundsPaint;

    @NotNull
    private LayoutModifierNode layoutModifierNode;

    @Nullable
    private IntermediateLayoutModifierNode lookAheadTransientMeasureNode;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n0\nR\u00060\u0000R\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier;", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "intermediateMeasureNode", "Landroidx/compose/ui/node/IntermediateLayoutModifierNode;", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/node/IntermediateLayoutModifierNode;)V", "getIntermediateMeasureNode", "()Landroidx/compose/ui/node/IntermediateLayoutModifierNode;", "passThroughMeasureResult", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier$PassThroughMeasureResult;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "PassThroughMeasureResult", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LookaheadDelegateForIntermediateLayoutModifier extends LookaheadDelegate {

        @NotNull
        private final IntermediateLayoutModifierNode intermediateMeasureNode;

        @NotNull
        private final PassThroughMeasureResult passThroughMeasureResult;
        final /* synthetic */ LayoutModifierNodeCoordinator this$0;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier$PassThroughMeasureResult;", "Landroidx/compose/ui/layout/MeasureResult;", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForIntermediateLayoutModifier;)V", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getAlignmentLines", "()Ljava/util/Map;", "height", "getHeight", "()I", "width", "getWidth", "placeChildren", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private final class PassThroughMeasureResult implements MeasureResult {

            @NotNull
            private final Map<AlignmentLine, Integer> alignmentLines = MapsKt.emptyMap();

            public PassThroughMeasureResult() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                LookaheadDelegate lookaheadDelegate = LookaheadDelegateForIntermediateLayoutModifier.this.this$0.getWrappedNonNull().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                return lookaheadDelegate.getMeasureResult$ui_release().getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                LookaheadDelegate lookaheadDelegate = LookaheadDelegateForIntermediateLayoutModifier.this.this$0.getWrappedNonNull().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                return lookaheadDelegate.getMeasureResult$ui_release().getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                LookaheadDelegate lookaheadDelegate = LookaheadDelegateForIntermediateLayoutModifier.this.this$0.getWrappedNonNull().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                Placeable.PlacementScope.place$default(companion, lookaheadDelegate, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateForIntermediateLayoutModifier(@NotNull LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, @NotNull LookaheadScope scope, IntermediateLayoutModifierNode intermediateMeasureNode) {
            super(layoutModifierNodeCoordinator, scope);
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(intermediateMeasureNode, "intermediateMeasureNode");
            this.this$0 = layoutModifierNodeCoordinator;
            this.intermediateMeasureNode = intermediateMeasureNode;
            this.passThroughMeasureResult = new PassThroughMeasureResult();
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            int iCalculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iCalculateAlignmentAndPlaceChildAsNeeded));
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }

        @NotNull
        public final IntermediateLayoutModifierNode getIntermediateMeasureNode() {
            return this.intermediateMeasureNode;
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo3011measureBRTryo0(long constraints) {
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.intermediateMeasureNode;
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = this.this$0;
            m3045setMeasurementConstraintsBRTryo0(constraints);
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            lookaheadDelegate.mo3011measureBRTryo0(constraints);
            intermediateLayoutModifierNode.mo3086setTargetSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getMeasureResult$ui_release().getWidth(), lookaheadDelegate.getMeasureResult$ui_release().getHeight()));
            set_measureResult(this.passThroughMeasureResult);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/LookaheadScope;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        final /* synthetic */ LayoutModifierNodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateForLayoutModifierNode(@NotNull LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, LookaheadScope scope) {
            super(layoutModifierNodeCoordinator, scope);
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.this$0 = layoutModifierNodeCoordinator;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            int iCalculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iCalculateAlignmentAndPlaceChildAsNeeded));
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo3011measureBRTryo0(long constraints) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = this.this$0;
            m3045setMeasurementConstraintsBRTryo0(constraints);
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            set_measureResult(layoutModifierNode.mo1286measure3p2s80s(this, lookaheadDelegate, constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            LayoutModifierNode layoutModifierNode = this.this$0.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = this.this$0.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, height);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1492setColor8_81llA(Color.INSTANCE.m1631getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1496setStylek9PVt8s(PaintingStyle.INSTANCE.m1846getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutModifierNodeCoordinator(@NotNull LayoutNode layoutNode, @NotNull LayoutModifierNode measureNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(measureNode, "measureNode");
        this.layoutModifierNode = measureNode;
        this.lookAheadTransientMeasureNode = ((measureNode.getNode().getKindSet() & NodeKind.m3199constructorimpl(512)) == 0 || !(measureNode instanceof IntermediateLayoutModifierNode)) ? null : (IntermediateLayoutModifierNode) measureNode;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine) : LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public LookaheadDelegate createLookaheadDelegate(@NotNull LookaheadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = this.lookAheadTransientMeasureNode;
        return intermediateLayoutModifierNode != null ? new LookaheadDelegateForIntermediateLayoutModifier(this, scope, intermediateLayoutModifierNode) : new LookaheadDelegateForLayoutModifierNode(this, scope);
    }

    @NotNull
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @NotNull
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    @NotNull
    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped = getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo3011measureBRTryo0(long constraints) {
        m3045setMeasurementConstraintsBRTryo0(constraints);
        setMeasureResult$ui_release(this.layoutModifierNode.mo1286measure3p2s80s(this, getWrappedNonNull(), constraints));
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo3244resizeozmzZPI(getMeasuredSize());
        }
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void onLayoutModifierNodeChanged() {
        super.onLayoutModifierNodeChanged();
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        Modifier.Node node = layoutModifierNode.getNode();
        if ((node.getKindSet() & NodeKind.m3199constructorimpl(512)) == 0 || !(layoutModifierNode instanceof IntermediateLayoutModifierNode)) {
            this.lookAheadTransientMeasureNode = null;
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                updateLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode(this, lookaheadDelegate.getLookaheadScope()));
                return;
            }
            return;
        }
        IntermediateLayoutModifierNode intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        this.lookAheadTransientMeasureNode = intermediateLayoutModifierNode;
        LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            updateLookaheadDelegate(new LookaheadDelegateForIntermediateLayoutModifier(this, lookaheadDelegate2.getLookaheadScope(), intermediateLayoutModifierNode));
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getWrappedNonNull().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
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
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int iM4111getWidthimpl = IntSize.m4111getWidthimpl(getMeasuredSize());
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = iM4111getWidthimpl;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
        Placeable.PlacementScope._coordinates = layoutCoordinates;
        Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
    }

    public final void setLayoutModifierNode$ui_release(@NotNull LayoutModifierNode layoutModifierNode) {
        Intrinsics.checkNotNullParameter(layoutModifierNode, "<set-?>");
        this.layoutModifierNode = layoutModifierNode;
    }
}
