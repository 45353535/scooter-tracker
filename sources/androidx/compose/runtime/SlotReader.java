package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.D5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b&\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u0011J\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u0013J\u0017\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0013J\u001f\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010#J\u000f\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020&¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020&¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010(J\r\u0010,\u001a\u00020&¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020&¢\u0006\u0004\b/\u0010(J\u0015\u00100\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00101J\r\u00103\u001a\u00020&¢\u0006\u0004\b3\u0010(J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00020504¢\u0006\u0004\b6\u00107J3\u0010<\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00072\u001a\u00109\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020&08H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR$\u0010M\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010Q\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010.R$\u0010S\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010.R$\u0010\r\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bU\u0010.R\u0016\u0010V\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010GR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010GR\u0016\u0010X\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010GR\u0011\u0010Z\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bY\u0010.R\u0011\u0010\\\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b[\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010PR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b]\u0010.R\u0011\u0010^\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b^\u0010PR\u0011\u0010`\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010PR\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010.R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bb\u0010.R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bc\u0010.R\u0011\u0010e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bd\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bf\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bg\u0010%R\u0013\u0010i\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bh\u0010%R\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bj\u0010.R\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010.¨\u0006n"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", D5.Q, "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "", FirebaseAnalytics.Param.INDEX, "node", "([II)Ljava/lang/Object;", "aux", "objectKey", "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "(I)Ljava/lang/Object;", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)I", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "(II)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "Lkotlin/Function2;", "block", "forEachData$runtime_release", "(ILkotlin/jvm/functions/Function2;)V", "forEachData", "", "toString", "()Ljava/lang/String;", "(I)Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "<set-?>", "closed", "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentEnd", "getCurrentEnd", "getParent", "emptyCount", "currentSlot", "currentSlotEnd", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getGroupObjectKey", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getGroupSlotCount", "groupSlotCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SlotReader {
    private boolean closed;

    /* JADX INFO: renamed from: currentEnd, reason: from kotlin metadata and from toString */
    private int end;

    /* JADX INFO: renamed from: currentGroup, reason: from kotlin metadata and from toString */
    private int current;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;

    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private int parent;

    @NotNull
    private final Object[] slots;
    private final int slotsSize;

    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = table.getSlots();
        this.slotsSize = table.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotReader.current;
        }
        return slotReader.anchor(i10);
    }

    private final Object aux(int[] iArr, int i10) {
        return SlotTableKt.hasAux(iArr, i10) ? this.slots[SlotTableKt.auxIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i10) {
        if (SlotTableKt.hasObjectKey(iArr, i10)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i10)];
        }
        return null;
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, index, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            anchors$runtime_release.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(iSearch);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this);
    }

    public final boolean containsMark(int index) {
        return SlotTableKt.containsMark(this.groups, index);
    }

    public final void endEmpty() {
        int i10 = this.emptyCount;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount = i10 - 1;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                ComposerKt.composeRuntimeError("endGroup() not called at the end of a group");
                throw new g();
            }
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = iParentAnchor;
            this.end = iParentAnchor < 0 ? this.groupsSize : iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i10 = 0;
            int iGroupSize = this.current;
            while (true) {
                int i11 = i10;
                if (iGroupSize >= this.end) {
                    break;
                }
                i10 = i11 + 1;
                arrayList.add(new KeyInfo(SlotTableKt.key(this.groups, iGroupSize), objectKey(this.groups, iGroupSize), iGroupSize, SlotTableKt.isNode(this.groups, iGroupSize) ? 1 : SlotTableKt.nodeCount(this.groups, iGroupSize), i11));
                iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            }
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int group, @NotNull Function2<? super Integer, Object, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i10 = group + 1;
        int iDataAnchor = i10 < this.table.getGroupsSize() ? SlotTableKt.dataAnchor(this.table.getGroups(), i10) : this.table.getSlotsSize();
        for (int i11 = iSlotAnchor; i11 < iDataAnchor; i11++) {
            block.invoke(Integer.valueOf(i11 - iSlotAnchor), this.slots[i11]);
        }
    }

    @Nullable
    public final Object get(int index) {
        int i10 = this.currentSlot + index;
        return i10 < this.currentSlotEnd ? this.slots[i10] : Composer.INSTANCE.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: getCurrentEnd, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: getCurrentGroup, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    @Nullable
    public final Object getGroupAux() {
        int i10 = this.current;
        if (i10 < this.end) {
            return aux(this.groups, i10);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.end;
    }

    public final int getGroupKey() {
        int i10 = this.current;
        if (i10 < this.end) {
            return SlotTableKt.key(this.groups, i10);
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i10 = this.current;
        if (i10 < this.end) {
            return node(this.groups, i10);
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i10 = this.current;
        if (i10 < this.end) {
            return objectKey(this.groups, i10);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.current);
    }

    public final int getGroupSlotCount() {
        int i10 = this.current;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
        int i11 = i10 + 1;
        return (i11 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i11) : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.current);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return SlotTableKt.nodeCount(this.groups, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final int groupEnd(int index) {
        return index + SlotTableKt.groupSize(this.groups, index);
    }

    @Nullable
    public final Object groupGet(int index) {
        return groupGet(this.current, index);
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, index);
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, index);
    }

    public final boolean hasMark(int index) {
        return SlotTableKt.hasMark(this.groups, index);
    }

    public final boolean hasObjectKey(int index) {
        return SlotTableKt.hasObjectKey(this.groups, index);
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.current == this.end;
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.current);
    }

    @Nullable
    public final Object next() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.INSTANCE.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    @Nullable
    public final Object node(int index) {
        if (SlotTableKt.isNode(this.groups, index)) {
            return node(this.groups, index);
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, index);
    }

    public final int parent(int index) {
        return SlotTableKt.parentAnchor(this.groups, index);
    }

    public final int parentOf(int index) {
        if (index >= 0 && index < this.groupsSize) {
            return SlotTableKt.parentAnchor(this.groups, index);
        }
        throw new IllegalArgumentException(("Invalid group index " + index).toString());
    }

    public final void reposition(int index) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot reposition while in an empty region");
            throw new g();
        }
        this.current = index;
        int iParentAnchor = index < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, index) : -1;
        this.parent = iParentAnchor;
        if (iParentAnchor < 0) {
            this.end = this.groupsSize;
        } else {
            this.end = iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int index) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, index) + index;
        int i10 = this.current;
        if (i10 >= index && i10 <= iGroupSize) {
            this.parent = index;
            this.end = iGroupSize;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + index + " is not a parent of " + i10).toString());
        throw new g();
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot skip while in an empty region");
            throw new g();
        }
        int iNodeCount = SlotTableKt.isNode(this.groups, this.current) ? 1 : SlotTableKt.nodeCount(this.groups, this.current);
        int i10 = this.current;
        this.current = i10 + SlotTableKt.groupSize(this.groups, i10);
        return iNodeCount;
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount == 0) {
            this.current = this.end;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region");
            throw new g();
        }
    }

    public final void startGroup() {
        if (this.emptyCount <= 0) {
            if (SlotTableKt.parentAnchor(this.groups, this.current) != this.parent) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            int i10 = this.current;
            this.parent = i10;
            this.end = i10 + SlotTableKt.groupSize(this.groups, i10);
            int i11 = this.current;
            int i12 = i11 + 1;
            this.current = i12;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize + (-1) ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, i12);
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!SlotTableKt.isNode(this.groups, this.current)) {
                throw new IllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    @NotNull
    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    private final Object node(int[] iArr, int i10) {
        return SlotTableKt.isNode(iArr, i10) ? this.slots[SlotTableKt.nodeIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    @Nullable
    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i10 = group + 1;
        int i11 = iSlotAnchor + index;
        return i11 < (i10 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i10) : this.slotsSize) ? this.slots[i11] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, index);
    }
}
