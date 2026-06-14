package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u0086\bJ\u0006\u0010\u0018\u001a\u00020\u0007J\"\u0010\u0019\u001a\u00020\u00132\u0014\b\u0004\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u001bH\u0086\bø\u0001\u0000J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "extraAssertions", "", "(Z)V", "DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "mapOfOriginalDepth", "", "", "getMapOfOriginalDepth", "()Ljava/util/Map;", "mapOfOriginalDepth$delegate", "Lkotlin/Lazy;", "set", "Landroidx/compose/ui/node/TreeSet;", "add", "", "node", "contains", "isEmpty", "isNotEmpty", "pop", "popEach", "block", "Lkotlin/Function1;", "remove", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DepthSortedSet {

    @NotNull
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: mapOfOriginalDepth$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapOfOriginalDepth;

    @NotNull
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet() {
        this(false, 1, null);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final void add(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.extraAssertions) {
            Integer num = getMapOfOriginalDepth().get(node);
            if (num == null) {
                getMapOfOriginalDepth().put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (num.intValue() != node.getDepth()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean zContains = this.set.contains(node);
        if (!this.extraAssertions || zContains == getMapOfOriginalDepth().containsKey(node)) {
            return zContains;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        LayoutNode node = this.set.first();
        Intrinsics.checkNotNullExpressionValue(node, "node");
        remove(node);
        return node;
    }

    public final void popEach(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }

    public final boolean remove(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zRemove = this.set.remove(node);
        if (!this.extraAssertions) {
            return zRemove;
        }
        Integer numRemove = getMapOfOriginalDepth().remove(node);
        if (!zRemove) {
            if (numRemove == null) {
                return zRemove;
            }
            throw new IllegalStateException("Check failed.");
        }
        int depth = node.getDepth();
        if (numRemove == null || numRemove.intValue() != depth) {
            throw new IllegalStateException("Check failed.");
        }
        return zRemove;
    }

    @NotNull
    public String toString() {
        String string = this.set.toString();
        Intrinsics.checkNotNullExpressionValue(string, "set.toString()");
        return string;
    }

    public DepthSortedSet(boolean z10) {
        this.extraAssertions = z10;
        this.mapOfOriginalDepth = i.b(l.f94211d, new Function0<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<LayoutNode, Integer> invoke() {
                return new LinkedHashMap();
            }
        });
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(@NotNull LayoutNode l12, @NotNull LayoutNode l22) {
                Intrinsics.checkNotNullParameter(l12, "l1");
                Intrinsics.checkNotNullParameter(l22, "l2");
                int iCompare = Intrinsics.compare(l12.getDepth(), l22.getDepth());
                return iCompare != 0 ? iCompare : Intrinsics.compare(l12.hashCode(), l22.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet<>(comparator);
    }

    public /* synthetic */ DepthSortedSet(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
