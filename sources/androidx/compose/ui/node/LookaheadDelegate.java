package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4240b4;
import com.ironsource.C4257c4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001d\u0010\u0011J/\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010)J \u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0000H\u0000ø\u0001\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u00107R+\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0012\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR(\u0010F\u001a\u0004\u0018\u00010!2\b\u0010E\u001a\u0004\u0018\u00010!8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u0010IR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010LR\u0016\u0010O\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020!8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0016\u0010a\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010NR\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/LookaheadScope;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getCachedAlignmentLine$ui_release", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "getCachedAlignmentLine", "", "replace$ui_release", "()V", "replace", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "placeChildren", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "ancestor", "positionIn-Bjo55l4$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;)J", "positionIn", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/LookaheadScope;", "getLookaheadScope", "()Landroidx/compose/ui/layout/LookaheadScope;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "", "oldAlignmentLines", "Ljava/util/Map;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "result", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "set_measureResult", "(Landroidx/compose/ui/layout/MeasureResult;)V", "cachedAlignmentLinesMap", "getCachedAlignmentLinesMap", "()Ljava/util/Map;", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "", "getHasMeasureResult", "()Z", "hasMeasureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "parent", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", C4257c4.f42802f, "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "getParentData", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {

    @Nullable
    private MeasureResult _measureResult;

    @NotNull
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap;

    @NotNull
    private final NodeCoordinator coordinator;

    @NotNull
    private final LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates;

    @NotNull
    private final LookaheadScope lookaheadScope;

    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;

    public LookaheadDelegate(@NotNull NodeCoordinator coordinator, @NotNull LookaheadScope lookaheadScope) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(lookaheadScope, "lookaheadScope");
        this.coordinator = coordinator;
        this.lookaheadScope = lookaheadScope;
        this.position = IntOffset.INSTANCE.m4079getZeronOccac();
        this.lookaheadLayoutCoordinates = new LookaheadLayoutCoordinatesImpl(this);
        this.cachedAlignmentLinesMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        Unit unit;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m3044setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m3044setMeasuredSizeozmzZPI(IntSize.INSTANCE.m4116getZeroYbymL2g());
        }
        if (!Intrinsics.areEqual(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    protected final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @NotNull
    public final LookaheadLayoutCoordinatesImpl getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @NotNull
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    @Nullable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public int maxIntrinsicHeight(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(width);
    }

    public int maxIntrinsicWidth(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(height);
    }

    public int minIntrinsicHeight(int width) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(width);
    }

    public int minIntrinsicWidth(int height) {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(height);
    }

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m3150performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends MeasureResult> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m3045setMeasurementConstraintsBRTryo0(constraints);
        set_measureResult(block.invoke());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo3012placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        if (!IntOffset.m4068equalsimpl0(getPosition(), position)) {
            m3152setPositiongyyYBs(position);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (getIsShallowPlacing()) {
            return;
        }
        placeChildren();
    }

    protected void placeChildren() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int width = getMeasureResult$ui_release().getWidth();
        LayoutDirection layoutDirection = this.coordinator.getLayoutDirection();
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = width;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
        Placeable.PlacementScope._coordinates = layoutCoordinates;
        Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: renamed from: positionIn-Bjo55l4$ui_release, reason: not valid java name */
    public final long m3151positionInBjo55l4$ui_release(@NotNull LookaheadDelegate ancestor) {
        Intrinsics.checkNotNullParameter(ancestor, "ancestor");
        long jM4079getZeronOccac = IntOffset.INSTANCE.m4079getZeronOccac();
        LookaheadDelegate lookaheadDelegate = this;
        while (!Intrinsics.areEqual(lookaheadDelegate, ancestor)) {
            long position = lookaheadDelegate.getPosition();
            jM4079getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jM4079getZeronOccac) + IntOffset.m4069getXimpl(position), IntOffset.m4070getYimpl(jM4079getZeronOccac) + IntOffset.m4070getYimpl(position));
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
        }
        return jM4079getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3012placeAtf8xVGno(getPosition(), 0.0f, null);
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m3152setPositiongyyYBs(long j10) {
        this.position = j10;
    }
}
