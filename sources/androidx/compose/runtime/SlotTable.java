package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.z;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b!\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u0006*\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J-\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b/\u00100J\u0017\u00105\u001a\u0002022\u0006\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b3\u00104JW\u00105\u001a\u0002022\u0006\u00106\u001a\u00020!2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00062\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010=\u001a\u00020\u00062\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020'0>j\b\u0012\u0004\u0012\u00020'`?H\u0000¢\u0006\u0004\b3\u0010AJO\u0010D\u001a\u0002022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00062\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010=\u001a\u00020\u00062\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020'0>j\b\u0012\u0004\u0012\u00020'`?H\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00142\u0006\u0010E\u001a\u00020\u0006H\u0000¢\u0006\u0004\bF\u0010GJ\r\u0010I\u001a\u00020\u000b¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u000202¢\u0006\u0004\bK\u0010\u0005J\r\u0010M\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bO\u0010GJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030QH\u0096\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010U\u001a\u0004\u0018\u00010\u00032\u0006\u0010T\u001a\u00020;H\u0016¢\u0006\u0004\bU\u0010VR$\u00108\u001a\u0002072\u0006\u0010W\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010X\u001a\u0004\bY\u0010ZR$\u00109\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u0010[\u001a\u0004\b\\\u0010]R4\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010^\u001a\u0004\b_\u0010`R$\u0010=\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010[\u001a\u0004\ba\u0010]R\u0016\u0010b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010[R$\u00106\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010c\u001a\u0004\bd\u0010JR\"\u0010e\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010[\u001a\u0004\bf\u0010]\"\u0004\bg\u0010hR2\u0010@\u001a\u0012\u0012\u0004\u0012\u00020'0>j\b\u0012\u0004\u0012\u00020'`?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010JR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006r"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", "", "group", "Landroidx/compose/runtime/RecomposeScopeImpl;", "findEffectiveRecomposeScope", "(I)Landroidx/compose/runtime/RecomposeScopeImpl;", "", "invalidateGroup", "(I)Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", FirebaseAnalytics.Param.INDEX, "level", "emitGroup", "(Ljava/lang/StringBuilder;II)I", "", UserMetadata.KEYDATA_FILENAME, "()Ljava/util/List;", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "block", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "reader", "", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "close", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo", TypedValues.AttributesType.S_TARGET, "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "()Z", "verifyWellFormed", "", "asString", "()Ljava/lang/String;", "slotsOf$runtime_release", "slotsOf", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "<set-?>", "[I", "getGroups", "()[I", "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "Z", "getWriter$runtime_release", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, yf.a {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;

    @NotNull
    private int[] groups = new int[0];

    @NotNull
    private Object[] slots = new Object[0];

    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(") key=");
        sb2.append(SlotTableKt.key(this.groups, i10));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i10);
        sb2.append(", nodes=");
        sb2.append(SlotTableKt.nodeCount(this.groups, i10));
        sb2.append(", size=");
        sb2.append(iGroupSize);
        if (SlotTableKt.hasMark(this.groups, i10)) {
            sb2.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i10)) {
            sb2.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i10);
        int iEmitGroup = i10 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb2.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if (SlotTableKt.hasObjectKey(this.groups, i10)) {
                sb2.append(" objectKey=" + this.slots[SlotTableKt.objectKeyIndex(this.groups, i10)]);
            }
            if (SlotTableKt.isNode(this.groups, i10)) {
                sb2.append(" node=" + this.slots[SlotTableKt.nodeIndex(this.groups, i10)]);
            }
            if (SlotTableKt.hasAux(this.groups, i10)) {
                sb2.append(" aux=" + this.slots[SlotTableKt.auxIndex(this.groups, i10)]);
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb2.append(", slots=[");
                sb2.append(iSlotAnchor);
                sb2.append(": ");
                for (int i13 = iSlotAnchor; i13 < iEmitGroup$dataIndex2; i13++) {
                    if (i13 != iSlotAnchor) {
                        sb2.append(", ");
                    }
                    sb2.append(String.valueOf(this.slots[i13]));
                }
                sb2.append(C4240b4.j.f42674e);
            }
        }
        sb2.append('\n');
        int i14 = i10 + iGroupSize;
        while (iEmitGroup < i14) {
            iEmitGroup += emitGroup(sb2, iEmitGroup, i11 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i10) {
        return i10 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i10);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        while (group > 0) {
            for (Object obj : new DataIterator(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) obj;
                }
            }
            group = SlotTableKt.parentAnchor(this.groups, group);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private final boolean invalidateGroup(int group) {
        while (group >= 0) {
            for (Object obj : new DataIterator(this, group)) {
                if (obj instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    recomposeScopeImpl.setRequiresRecompose(true);
                    return recomposeScopeImpl.invalidateForResult(null) != InvalidationResult.IGNORED;
                }
            }
            group = SlotTableKt.parentAnchor(this.groups, group);
        }
        return false;
    }

    private static final void invalidateGroupsWithKey$lambda$14$scanGroup(SlotReader slotReader, int i10, List<Anchor> list, Ref$BooleanRef ref$BooleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        if (slotReader.getGroupKey() != i10) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$14$scanGroup(slotReader, i10, list, ref$BooleanRef, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        if (ref$BooleanRef.f93279b) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrent());
            if (recomposeScopeImplFindEffectiveRecomposeScope != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
            } else {
                ref$BooleanRef.f93279b = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private static final int verifyWellFormed$validateGroup(t0 t0Var, SlotTable slotTable, int i10, int i11) {
        int i12 = t0Var.f93331b;
        int i13 = i12 + 1;
        t0Var.f93331b = i13;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i12);
        if (iParentAnchor != i10) {
            throw new IllegalStateException(("Invalid parent index detected at " + i12 + ", expected parent index to be " + i10 + " found " + iParentAnchor).toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i12) + i12;
        if (iGroupSize > slotTable.groupsSize) {
            throw new IllegalStateException(("A group extends past the end of the table at " + i12).toString());
        }
        if (iGroupSize > i11) {
            throw new IllegalStateException(("A group extends past its parent group at " + i12).toString());
        }
        int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i12);
        int iDataAnchor2 = i12 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i13);
        if (iDataAnchor2 > slotTable.slots.length) {
            throw new IllegalStateException(("Slots for " + i12 + " extend past the end of the slot table").toString());
        }
        if (iDataAnchor > iDataAnchor2) {
            throw new IllegalStateException(("Invalid data anchor at " + i12).toString());
        }
        if (SlotTableKt.slotAnchor(slotTable.groups, i12) > iDataAnchor2) {
            throw new IllegalStateException(("Slots start out of range at " + i12).toString());
        }
        if (iDataAnchor2 - iDataAnchor < (SlotTableKt.isNode(slotTable.groups, i12) ? 1 : 0) + (SlotTableKt.hasObjectKey(slotTable.groups, i12) ? 1 : 0) + (SlotTableKt.hasAux(slotTable.groups, i12) ? 1 : 0)) {
            throw new IllegalStateException(("Not enough slots added for group " + i12).toString());
        }
        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i12);
        if (zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i12)] == null) {
            throw new IllegalStateException(("No node recorded for a node group at " + i12).toString());
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (t0Var.f93331b < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(t0Var, slotTable, i12, iGroupSize);
        }
        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i12);
        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i12);
        if (iNodeCount != iVerifyWellFormed$validateGroup) {
            throw new IllegalStateException(("Incorrect node count detected at " + i12 + ", expected " + iNodeCount + ", received " + iVerifyWellFormed$validateGroup).toString());
        }
        int i14 = t0Var.f93331b - i12;
        if (iGroupSize2 != i14) {
            throw new IllegalStateException(("Incorrect slot count detected at " + i12 + ", expected " + iGroupSize2 + ", received " + i14).toString());
        }
        if (!SlotTableKt.containsAnyMark(slotTable.groups, i12) || i12 <= 0 || SlotTableKt.containsMark(slotTable.groups, i10)) {
            if (zIsNode) {
                return 1;
            }
            return iVerifyWellFormed$validateGroup;
        }
        throw new IllegalStateException(("Expected group " + i10 + " to record it contains a mark because " + i12 + " does").toString());
    }

    @NotNull
    public final Anchor anchor(int index) {
        int i10;
        if (this.writer) {
            ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead ");
            throw new g();
        }
        if (index < 0 || index >= (i10 = this.groupsSize)) {
            throw new IllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, i10);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(iSearch);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (this.writer) {
            ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead");
            throw new g();
        }
        if (anchor.getValid()) {
            return anchor.getLocation();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed");
    }

    @NotNull
    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i10 = this.groupsSize;
        if (i10 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i10) {
                iEmitGroup += emitGroup(sb2, iEmitGroup, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void close$runtime_release(@NotNull SlotReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.getTable() == this && this.readers > 0) {
            this.readers--;
        } else {
            ComposerKt.composeRuntimeError("Unexpected reader close()");
            throw new g();
        }
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.containsMark(this.groups, 0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        Intrinsics.checkNotNullParameter(identityToFind, "identityToFind");
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int groupIndex, @NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (this.writer) {
            ComposerKt.composeRuntimeError("Writer is active");
            throw new g();
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.composeRuntimeError("Invalid group index");
            throw new g();
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndex) + groupIndex;
            int location = anchor.getLocation();
            if (groupIndex <= location && location < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f93279b = true;
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$14$scanGroup(slotReaderOpenReader, target, arrayList, ref$BooleanRef, this, arrayList2);
            Unit unit = Unit.f93236a;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = (Anchor) arrayList.get(i10);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashGroup$runtime_release();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close();
                if (ref$BooleanRef.f93279b) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                slotWriterOpenWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            slotReaderOpenReader.close();
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending");
            throw new g();
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending");
            throw new g();
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        int iSearch;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iSearch), anchor);
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            z.b(1);
            slotReaderOpenReader.close();
            z.a(1);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
    }

    public final void setVersion$runtime_release(int i10) {
        this.version = i10;
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int group) {
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, group);
        int i10 = group + 1;
        return ArraysKt.toList(this.slots).subList(iDataAnchor, i10 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i10) : this.slots.length);
    }

    public final void verifyWellFormed() {
        int i10;
        int i11;
        t0 t0Var = new t0();
        int i12 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i10 = t0Var.f93331b;
                i11 = this.groupsSize;
                if (i10 >= i11) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(t0Var, this, -1, i10 + SlotTableKt.groupSize(this.groups, i10));
                }
            }
            if (i10 != i11) {
                throw new IllegalStateException(("Incomplete group at root " + t0Var.f93331b + " expected to be " + this.groupsSize).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int indexFor = arrayList.get(i13).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (i12 >= indexFor) {
                throw new IllegalArgumentException("Anchor is out of order");
            }
            i13++;
            i12 = indexFor;
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            return block.invoke(slotWriterOpenWriter);
        } finally {
            z.b(1);
            slotWriterOpenWriter.close();
            z.a(1);
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (writer.getTable() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()");
    }
}
