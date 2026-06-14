package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import com.ironsource.C4257c4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%H\u0082\bJ7\u0010&\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u001a\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0006\u0010*\u001a\u00020\u001fJ\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "pointerInputNode", "Landroidx/compose/ui/node/PointerInputModifierNode;", "(Landroidx/compose/ui/node/PointerInputModifierNode;)V", C4257c4.f42802f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/PointerId;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "getPointerInputNode", "()Landroidx/compose/ui/node/PointerInputModifierNode;", "relevantChanges", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "wasIn", "buildCache", "changes", "", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Node extends NodeParent {

    @Nullable
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;

    @Nullable
    private PointerEvent pointerEvent;

    @NotNull
    private final MutableVector<PointerId> pointerIds;

    /* JADX INFO: renamed from: pointerInputNode, reason: from kotlin metadata and from toString */
    @NotNull
    private final PointerInputModifierNode pointerInputFilter;

    @NotNull
    private final Map<PointerId, PointerInputChange> relevantChanges;
    private boolean wasIn;

    public Node(@NotNull PointerInputModifierNode pointerInputNode) {
        Intrinsics.checkNotNullParameter(pointerInputNode, "pointerInputNode");
        this.pointerInputFilter = pointerInputNode;
        this.pointerIds = new MutableVector<>(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> block) {
        if (this.relevantChanges.isEmpty() || !PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            return false;
        }
        block.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!Offset.m1368equalsimpl0(oldEvent.getChanges().get(i10).getPosition(), newEvent.getChanges().get(i10).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean buildCache(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r34, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r35, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = changes.get(i10);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m2838issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) || !this.isIn)) {
                this.pointerIds.remove(PointerId.m2888boximpl(pointerInputChange.getId()));
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m2858equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m2863getExit7fucELk());
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i10 = 0;
            do {
                content[i10].dispatchCancel();
                i10++;
            } while (i10 < size);
        }
        this.pointerInputFilter.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        if (!this.relevantChanges.isEmpty() && PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            this.pointerInputFilter.mo3085onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, layoutCoordinates.mo3015getSizeYbymL2g());
            if (PointerInputModifierNodeKt.isAttached(this.pointerInputFilter) && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i10].dispatchFinalEventPass(internalPointerEvent);
                    i10++;
                } while (i10 < size);
            }
            z10 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z10;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@NotNull Map<PointerId, PointerInputChange> changes, @NotNull LayoutCoordinates parentCoordinates, @NotNull InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> children;
        int size;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int i10 = 0;
        if (this.relevantChanges.isEmpty() || !PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates);
        long jMo3015getSizeYbymL2g = layoutCoordinates.mo3015getSizeYbymL2g();
        this.pointerInputFilter.mo3085onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo3015getSizeYbymL2g);
        if (PointerInputModifierNodeKt.isAttached(this.pointerInputFilter) && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            do {
                Node node = content[i10];
                Map<PointerId, PointerInputChange> map = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(map, layoutCoordinates2, internalPointerEvent, isInBounds);
                i10++;
            } while (i10 < size);
        }
        if (PointerInputModifierNodeKt.isAttached(this.pointerInputFilter)) {
            this.pointerInputFilter.mo3085onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo3015getSizeYbymL2g);
        }
        return true;
    }

    @NotNull
    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointerInputNode, reason: from getter */
    public final PointerInputModifierNode getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
