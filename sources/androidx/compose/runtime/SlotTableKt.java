package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u001c\n\u0002\b\n\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0001H\u0002\u001a;\u0010!\u001a\u00020\"*\u0012\u0012\u0004\u0012\u00020\"0#j\b\u0012\u0004\u0012\u00020\"`$2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0(H\u0082\b\u001a\u0014\u0010)\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010*\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0001H\u0002\u001a\u0014\u0010,\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010.\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001aD\u0010/\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002\u001a\u0014\u00101\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u00100\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0001H\u0002\u001a,\u00106\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\"0#j\b\u0012\u0004\u0012\u00020\"`$2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0001H\u0002\u001a\u0014\u00107\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0001H\u0002\u001a\u0014\u00109\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010:\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u00104\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u0001H\u0002\u001a,\u0010<\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\"0#j\b\u0012\u0004\u0012\u00020\"`$2\u0006\u0010=\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0001H\u0002\u001a \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020\u00172\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010@H\u0002\u001a\u0014\u0010A\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u001c\u0010B\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u001bH\u0002\u001a\u001c\u0010C\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u0001H\u0002\u001a\u001c\u0010E\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0002\u001a\u001c\u0010F\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a\u001c\u0010G\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u001bH\u0002\u001a\u001c\u0010H\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a\u001c\u0010I\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Aux_Mask", "", "Aux_Shift", "ContainsMark_Mask", "DataAnchor_Offset", "GroupInfo_Offset", "Group_Fields_Size", "Key_Offset", "Mark_Mask", "MinGroupGrowthSize", "MinSlotsGrowthSize", "NodeBit_Mask", "NodeCount_Mask", "ObjectKey_Mask", "ObjectKey_Shift", "ParentAnchor_Offset", "Size_Offset", "Slots_Shift", "parentAnchorPivot", "countOneBits", "value", "addAux", "", "", "address", "auxIndex", "containsAnyMark", "", "containsMark", "dataAnchor", "dataAnchors", "", POBCoreNativeConstants.NATIVE_LENGTH, "getOrAdd", "Landroidx/compose/runtime/Anchor;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.INDEX, "effectiveSize", "block", "Lkotlin/Function0;", "groupInfo", "groupSize", "groupSizes", "hasAux", "hasMark", "hasObjectKey", "initGroup", C4240b4.i.W, "isNode", "hasDataKey", "hasData", "parentAnchor", UserMetadata.KEYDATA_FILENAME, "locationOf", "nodeCount", "nodeCounts", "nodeIndex", "objectKeyIndex", "parentAnchors", "search", "location", "slice", "indices", "", "slotAnchor", "updateContainsMark", "updateDataAnchor", "anchor", "updateGroupKey", "updateGroupSize", "updateMark", "updateNodeCount", "updateParentAnchor", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + countOneBits(iArr[i11 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsAnyMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countOneBits(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dataAnchor(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i10) {
        return slice(iArr, g.t(g.v(4, i10), 5));
    }

    static /* synthetic */ List dataAnchors$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return dataAnchors(iArr, i10);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i10, int i11, Function0<Anchor> function0) {
        int iSearch = search(arrayList, i10, i11);
        if (iSearch < 0) {
            Anchor anchorInvoke = function0.invoke();
            arrayList.add(-(iSearch + 1), anchorInvoke);
            return anchorInvoke;
        }
        Anchor anchor = arrayList.get(iSearch);
        Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
        return anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupInfo(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i10) {
        return slice(iArr, g.t(g.v(3, i10), 5));
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return groupSizes(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasAux(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasObjectKey(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = z10 ? 1073741824 : 0;
        int i15 = z11 ? 536870912 : 0;
        int i16 = z12 ? 268435456 : 0;
        int i17 = i10 * 5;
        iArr[i17] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNode(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int key(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i10) {
        return slice(iArr, g.t(g.v(0, i10), 5));
    }

    static /* synthetic */ List keys$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return keys(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i10, int i11) {
        int iSearch = search(arrayList, i10, i11);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeCount(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & NodeCount_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i10) {
        List<Integer> listSlice = slice(iArr, g.t(g.v(1, i10), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(listSlice.get(i11).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return nodeCounts(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nodeIndex(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + countOneBits(iArr[i11 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int parentAnchor(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i10) {
        return slice(iArr, g.t(g.v(2, i10), 5));
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return parentAnchors(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int location = arrayList.get(i13).getLocation();
            if (location < 0) {
                location += i11;
            }
            int iCompare = Intrinsics.compare(location, i10);
            if (iCompare < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + countOneBits(iArr[i11 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 67108864;
        } else {
            iArr[i11] = iArr[i11] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDataAnchor(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    private static final void updateGroupKey(int[] iArr, int i10, int i11) {
        iArr[i10 * 5] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i10, int i11) {
        ComposerKt.runtimeCheck(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 134217728;
        } else {
            iArr[i11] = iArr[i11] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i10, int i11) {
        ComposerKt.runtimeCheck(i11 >= 0 && i11 < NodeCount_Mask);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateParentAnchor(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }
}
