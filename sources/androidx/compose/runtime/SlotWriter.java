package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u009d\u00012\u00020\u0001:\u0002\u009d\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\nJ\u000e\u00105\u001a\u0002022\u0006\u00104\u001a\u00020\nJ\u0010\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0007J\r\u00109\u001a\u000202H\u0000¢\u0006\u0002\b:J\u0006\u0010;\u001a\u000202J\u0010\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0006\u0010>\u001a\u000202J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0010\u0010@\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J \u0010A\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010C\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nH\u0002J(\u0010E\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010G\u001a\u00020\nJ\u0006\u0010H\u001a\u000202J\u000e\u0010I\u001a\u0002022\u0006\u00106\u001a\u00020\u0007J\u000e\u0010I\u001a\u0002022\u0006\u00107\u001a\u00020\nJ \u0010J\u001a\u0002022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010G\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0002J\u0010\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u0010\u0010M\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u000e\u0010N\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u0010\u0010O\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u000e\u0010P\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u000e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010RJ\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u0016\u0010V\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010W\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u0010\u0010X\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Z\u001a\u0002022\u0006\u0010&\u001a\u00020\nH\u0002J\u000e\u0010[\u001a\u0002022\u0006\u0010\\\u001a\u00020\nJ\u0018\u0010]\u001a\u0002022\u0006\u0010&\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020\n0_H\u0002J\u0010\u0010`\u001a\u0002022\b\b\u0002\u0010=\u001a\u00020\nJ \u0010a\u001a\u0002022\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070_2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\nJ\u000e\u0010e\u001a\u0002022\u0006\u0010f\u001a\u00020\nJ\u0010\u0010g\u001a\u0002022\u0006\u00107\u001a\u00020\nH\u0002J$\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00070_2\u0006\u0010f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\nJ\u0018\u0010i\u001a\u0002022\u0006\u00107\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J$\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070_2\u0006\u00106\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\n2\u0006\u0010k\u001a\u00020\u0000J\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u0007J\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u0010\u0010m\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u0018\u0010n\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002J\b\u0010o\u001a\u000202H\u0002J\u0018\u0010p\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\u0006\u0010q\u001a\u00020\u000eJ\u0018\u0010r\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\nH\u0002J \u0010u\u001a\u0002022\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\u0006\u0010v\u001a\u000202J\b\u0010w\u001a\u00020\nH\u0002J\b\u0010x\u001a\u000202H\u0002J\u000e\u0010y\u001a\u0002022\u0006\u00106\u001a\u00020\u0007J\u0010\u0010z\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u001a\u0010z\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\n2\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\b\u0010{\u001a\u0004\u0018\u00010\u0001J\u0006\u0010|\u001a\u00020\nJ\u0006\u0010}\u001a\u000202J\u0018\u0010~\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\nJ\u0018\u0010~\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u007f\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u001a\u0010\u0080\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001J%\u0010\u0080\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u0083\u0001\u001a\u000202J\u000f\u0010\u0083\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\nJ\u001a\u0010\u0083\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001J/\u0010\u0083\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u000e2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0085\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001J$\u0010\u0085\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010l\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0086\u0001\u001a\u00020TH\u0016J\u0013\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0088\u0001\u001a\u0002022\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020\nH\u0002J\u0011\u0010\u008b\u0001\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u008c\u0001\u001a\u0002022\u0006\u0010=\u001a\u00020\nH\u0002J\u0019\u0010\u008d\u0001\u001a\u0002022\u0006\u0010=\u001a\u00020\n2\u0006\u0010z\u001a\u00020%H\u0002J\u0019\u0010\u008e\u0001\u001a\u0002022\u0006\u00106\u001a\u00020\u00072\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u008e\u0001\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u008f\u0001\u001a\u0002022\u0006\u00107\u001a\u00020\n2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010\u0090\u0001\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u000f\u0010\u0091\u0001\u001a\u000202H\u0000¢\u0006\u0003\b\u0092\u0001J\u000f\u0010\u0093\u0001\u001a\u000202H\u0000¢\u0006\u0003\b\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0014\u0010C\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0013\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\n0_*\u00020\u001cH\u0002J\u001b\u0010\u0097\u0001\u001a\u000202*\b0\u0098\u0001j\u0003`\u0099\u00012\u0006\u00107\u001a\u00020\nH\u0002J\u0015\u0010\u009a\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0014\u0010\"\u001a\u00020\n*\u00020\u001c2\u0006\u00107\u001a\u00020\nH\u0002J\u0015\u0010\u009b\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u001d\u0010\u009c\u0001\u001a\u000202*\u00020\u001c2\u0006\u00103\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\fR\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006\u009e\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", D5.Q, "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "addToGroupSizeAlongSpine", "", "address", "amount", "advanceBy", "anchor", FirebaseAnalytics.Param.INDEX, "anchorIndex", "bashGroup", "bashGroup$runtime_release", "beginInsert", "childContainsAnyMarks", "group", "close", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupsAsString", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "value", "insertGroups", "insertParentGroup", C4240b4.i.W, "insertSlots", UserMetadata.KEYDATA_FILENAME, "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "moveGroup", "offset", "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "recalculateMarks", "removeAnchors", "removeGroup", "removeGroups", "start", POBCoreNativeConstants.NATIVE_LENGTH, "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "groupIndex", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", y.f66058y, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SlotWriter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;

    @NotNull
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;

    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;

    @NotNull
    private final IntStack nodeCountStack;
    private int parent;

    @Nullable
    private PrioritySet pendingRecalculateMarks;

    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;

    @NotNull
    private final IntStack startStack;

    @NotNull
    private final SlotTable table;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor) {
            List<Anchor> listEmptyList;
            boolean zRemoveGroup;
            int i10;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i11 = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i11);
            int i12 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i12, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i11) {
                fromWriter.moveGroupGapTo(i11);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i11);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            ArraysKt.copyInto(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i11 * 5);
            Object[] objArr = toWriter.slots;
            int i13 = toWriter.currentSlot;
            ArraysKt.copyInto(fromWriter.slots, objArr, i13, iDataIndex, iDataIndex2);
            int parent = toWriter.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i14 = currentGroup - fromIndex;
            int i15 = currentGroup + iGroupSize;
            int iDataIndex3 = i13 - toWriter.dataIndex(iArr, currentGroup);
            int i16 = toWriter.slotsGapOwner;
            int i17 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    i10 = iDataIndex3;
                    SlotTableKt.updateParentAnchor(iArr, i19, SlotTableKt.parentAnchor(iArr, i19) + i14);
                } else {
                    i10 = iDataIndex3;
                }
                int i20 = parent;
                SlotTableKt.updateDataAnchor(iArr, i19, toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i19) + i10, i18 >= i19 ? toWriter.slotsGapStart : 0, i17, length));
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                parent = i20;
                iDataIndex3 = i10;
            }
            int i21 = parent;
            toWriter.slotsGapOwner = i18;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i11, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i22 = iLocationOf; i22 < iLocationOf2; i22++) {
                    Object obj = arrayList.get(i22);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation() + i14);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            int iParent = fromWriter.parent(fromIndex);
            if (updateFromCursor) {
                int i23 = iParent >= 0 ? 1 : 0;
                if (i23 != 0) {
                    fromWriter.startGroup();
                    fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                    fromWriter.startGroup();
                }
                fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                zRemoveGroup = fromWriter.removeGroup();
                if (i23 != 0) {
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                }
            } else {
                boolean zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                fromWriter.removeSlots(iDataIndex, i12, fromIndex - 1);
                zRemoveGroup = zRemoveGroups;
            }
            if (zRemoveGroup) {
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors");
                throw new g();
            }
            toWriter.nodeCount += SlotTableKt.isNode(iArr, currentGroup) ? 1 : SlotTableKt.nodeCount(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i15;
                toWriter.currentSlot = i13 + i12;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(i21);
            }
            return listEmptyList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Object>, yf.a {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        AnonymousClass1(int i10, int i11, SlotWriter slotWriter) {
            this.$end = i11;
            this.this$0 = slotWriter;
            this.current = i10;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        @Nullable
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i10 = this.current;
            this.current = i10 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    public SlotWriter(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i10);
    }

    private final int auxIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i10) >> 29);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = group + groupSize(group);
        while (iGroupSize < iGroupSize2) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(iGroupSize))) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && SlotTableKt.containsMark(this.groups, groupIndexToAddress(group));
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.slice(listDataAnchors$default, kotlin.ranges.g.v(0, this.groupGapStart)), (Iterable) CollectionsKt.slice(listDataAnchors$default, kotlin.ranges.g.v(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listPlus.get(i10)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int iParentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(firstChild), iParentIndexToAnchor);
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, iGroupSize, firstChild + 1);
            firstChild = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb2, int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        sb2.append("Group(");
        if (i10 < 10) {
            sb2.append(' ');
        }
        if (i10 < 100) {
            sb2.append(' ');
        }
        if (i10 < 1000) {
            sb2.append(' ');
        }
        sb2.append(i10);
        if (iGroupIndexToAddress != i10) {
            sb2.append("(");
            sb2.append(iGroupIndexToAddress);
            sb2.append(")");
        }
        sb2.append('#');
        sb2.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        boolean zGroupAsString$isStarted = groupAsString$isStarted(this, i10);
        if (zGroupAsString$isStarted) {
            sb2.append('?');
        }
        sb2.append('^');
        sb2.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress)));
        sb2.append(": key=");
        sb2.append(SlotTableKt.key(this.groups, iGroupIndexToAddress));
        sb2.append(", nodes=");
        sb2.append(SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress));
        if (zGroupAsString$isStarted) {
            sb2.append('?');
        }
        sb2.append(", dataAnchor=");
        sb2.append(SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress));
        sb2.append(", parentAnchor=");
        sb2.append(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            sb2.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]);
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress + 1);
        if (iDataIndex > iSlotIndex) {
            sb2.append(", [");
            for (int i11 = iSlotIndex; i11 < iDataIndex; i11++) {
                if (i11 != iSlotIndex) {
                    sb2.append(", ");
                }
                sb2.append(String.valueOf(this.slots[dataIndexToDataAddress(i11)]));
            }
            sb2.append(']');
        }
        sb2.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i10) {
        if (i10 < slotWriter.currentGroup) {
            return i10 == slotWriter.parent || slotWriter.startStack.indexOf(i10) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i10));
        }
        return false;
    }

    private final int groupIndexToAddress(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i10 = this.currentGroup;
            moveGroupGapTo(i10);
            int i11 = this.groupGapStart;
            int i12 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < size) {
                int iMax = Math.max(Math.max(length * 2, i13 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i11 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i11 + i14) * 5, (i12 + i11) * 5, length * 5);
                this.groups = iArr2;
                i12 = i14;
            }
            int i15 = this.currentGroupEnd;
            if (i15 >= i11) {
                this.currentGroupEnd = i15 + size;
            }
            int i16 = i11 + size;
            this.groupGapStart = i16;
            this.groupGapLen = i12 - size;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i13 > 0 ? dataIndex(i10 + size) : 0, this.slotsGapOwner >= i11 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i17 = i11; i17 < i16; i17++) {
                SlotTableKt.updateDataAnchor(this.groups, i17, iDataIndexToDataAnchor);
            }
            int i18 = this.slotsGapOwner;
            if (i18 >= i11) {
                this.slotsGapOwner = i18 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i10 = this.slotsGapStart;
            int i11 = this.slotsGapLen;
            if (i11 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i12 = length - i11;
                int iMax = Math.max(Math.max(length * 2, i12 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i13 = 0; i13 < iMax; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = iMax - i12;
                ArraysKt.copyInto(objArr, objArr2, 0, 0, i10);
                ArraysKt.copyInto(objArr, objArr2, i10 + i14, i11 + i10, length);
                this.slots = objArr2;
                i11 = i14;
            }
            int i15 = this.currentSlotEnd;
            if (i15 >= i10) {
                this.currentSlotEnd = i15 + size;
            }
            this.slotsGapStart = i10 + size;
            this.slotsGapLen = i11 - size;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listKeys$default.get(i10);
            ((Number) obj).intValue();
            int i11 = this.groupGapStart;
            if (i10 < i11 || i10 >= i11 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.markGroup(i10);
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        int i10 = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(iLocationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int iAnchorIndex = anchorIndex(anchor2);
                if (iAnchorIndex < originalLocation || iAnchorIndex >= i10) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(iLocationOf);
            }
        }
        int i11 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Anchor anchor3 = (Anchor) arrayList.get(i12);
            int iAnchorIndex2 = anchorIndex(anchor3) + i11;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i10 = this.groupGapLen;
        int i11 = this.groupGapStart;
        if (i11 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i11, index);
            }
            if (i10 > 0) {
                int[] iArr = this.groups;
                int i12 = index * 5;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                if (index < i11) {
                    ArraysKt.copyInto(iArr, iArr, i13 + i12, i12, i14);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i14, i14 + i13, i12 + i13);
                }
            }
            if (index < i11) {
                i11 = index + i10;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i11 < capacity);
            while (i11 < capacity) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i11);
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(iParentAnchor), index);
                if (iParentIndexToAnchor != iParentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i11, iParentIndexToAnchor);
                }
                i11++;
                if (i11 == index) {
                    i11 += i10;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i10 = this.slotsGapLen;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapOwner;
        if (i11 != index) {
            Object[] objArr = this.slots;
            if (index < i11) {
                ArraysKt.copyInto(objArr, objArr, index + i10, index, i11);
            } else {
                ArraysKt.copyInto(objArr, objArr, i11, i11 + i10, index + i10);
            }
            ArraysKt.fill(objArr, (Object) null, index, index + i10);
        }
        int iMin = Math.min(group + 1, getSize$runtime_release());
        if (i12 != iMin) {
            int length = this.slots.length - i10;
            if (iMin < i12) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i12);
                int i13 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
                    if (!(iDataAnchor >= 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor");
                        throw new g();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress, -((length - iDataAnchor) + 1));
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i13) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i12);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int iDataAnchor2 = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress3);
                    if (!(iDataAnchor2 < 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor");
                        throw new g();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress3, iDataAnchor2 + length + 1);
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int nodeIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : (getSize$runtime_release() + index) - (-2);
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size) {
        int i10 = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i10, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i11 = iLocationOf + 1;
        int i12 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int iAnchorIndex = anchorIndex(anchor2);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i10) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i12 == 0) {
                    i12 = iLocationOf + 1;
                }
                i11 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z10 = i11 < i12;
        if (z10) {
            this.anchors.subList(i11, i12).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(start, len);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i10 = this.slotsGapOwner;
            if (i10 > start) {
                this.slotsGapOwner = Math.max(start, i10 - len);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - len;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i10 = this.slotsGapLen;
            int i11 = start + len;
            moveSlotGapTo(i11, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i10 + len;
            ArraysKt.fill(this.slots, (Object) null, start, i11);
            int i12 = this.currentSlotEnd;
            if (i12 >= start) {
                this.currentSlotEnd = i12 - len;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        int i10;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); iLocationOf < this.anchors.size(); iLocationOf++) {
                Anchor anchor = this.anchors.get(iLocationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location = anchor2.getLocation();
                if (location < 0) {
                    return;
                }
                anchor2.setLocation$runtime_release(-(capacity - location));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); iLocationOf2 < this.anchors.size(); iLocationOf2++) {
            Anchor anchor3 = this.anchors.get(iLocationOf2);
            Intrinsics.checkNotNullExpressionValue(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location2 = anchor4.getLocation();
            if (location2 >= 0 || (i10 = location2 + capacity) >= newGapStart) {
                return;
            }
            anchor4.setLocation$runtime_release(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(group);
        }
    }

    private final void updateContainsMarkNow(int group, PrioritySet set) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(group);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(group);
            if (iParent >= 0) {
                set.add(iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i10, int i11) {
        SlotTableKt.updateDataAnchor(iArr, i10, dataIndexToDataAnchor(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final void updateNodeOfGroup(int index, Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if (iGroupIndexToAddress < iArr.length && SlotTableKt.isNode(iArr, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = value;
            return;
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + index + " that was not created with as a node group").toString());
        throw new g();
    }

    public final void addToGroupSizeAlongSpine(int address, int amount) {
        while (address > 0) {
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, address, SlotTableKt.groupSize(iArr, address) + amount);
            address = groupIndexToAddress(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, address)));
        }
    }

    public final void advanceBy(int amount) {
        boolean z10 = false;
        if (!(amount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot seek backwards");
            throw new g();
        }
        if (this.insertCount > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i10 = this.currentGroup + amount;
        if (i10 >= this.parent && i10 <= this.currentGroupEnd) {
            z10 = true;
        }
        if (z10) {
            this.currentGroup = i10;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10));
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
        throw new g();
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (iSearch >= 0) {
            Anchor anchor = arrayList.get(iSearch);
            Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
            return anchor;
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor2 = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor2);
        return anchor2;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location = anchor.getLocation();
        return location < 0 ? getSize$runtime_release() + location : location;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean z10 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        boolean zIsNode = SlotTableKt.isNode(this.groups, iGroupIndexToAddress);
        if (z10) {
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i14);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
            this.nodeCount = this.nodeCountStack.pop() + (zIsNode ? 1 : i13);
            this.parent = parent(this.groups, i12);
            return i13;
        }
        if ((i10 != i11 ? 0 : 1) == 0) {
            ComposerKt.composeRuntimeError("Expected to be at the end of a group");
            throw new g();
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        int iNodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i14);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
        int iPop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = iPop;
        int iParent = parent(this.groups, i12);
        int iPop2 = this.nodeCountStack.pop();
        this.nodeCount = iPop2;
        if (iParent == iPop) {
            this.nodeCount = iPop2 + (zIsNode ? 0 : i13 - iNodeCount);
            return i13;
        }
        int i15 = i14 - iGroupSize;
        int i16 = zIsNode ? 0 : i13 - iNodeCount;
        if (i15 != 0 || i16 != 0) {
            while (iParent != 0 && iParent != iPop && (i16 != 0 || i15 != 0)) {
                int iGroupIndexToAddress2 = groupIndexToAddress(iParent);
                if (i15 != 0) {
                    SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i15);
                }
                if (i16 != 0) {
                    int[] iArr = this.groups;
                    SlotTableKt.updateNodeCount(iArr, iGroupIndexToAddress2, SlotTableKt.nodeCount(iArr, iGroupIndexToAddress2) + i16);
                }
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress2)) {
                    i16 = 0;
                }
                iParent = parent(this.groups, iParent);
            }
        }
        this.nodeCount += i16;
        return i13;
    }

    public final void endInsert() {
        int i10 = this.insertCount;
        if (i10 <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        int i11 = i10 - 1;
        this.insertCount = i11;
        if (i11 == 0) {
            if (this.nodeCountStack.getTos() == this.startStack.getTos()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting");
                throw new g();
            }
        }
    }

    public final void ensureStarted(int index) {
        boolean z10 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting");
            throw new g();
        }
        int i10 = this.parent;
        if (i10 != index) {
            if (index >= i10 && index < this.currentGroupEnd) {
                z10 = true;
            }
            if (!z10) {
                ComposerKt.composeRuntimeError(("Started group at " + index + " must be a subgroup of the group at " + i10).toString());
                throw new g();
            }
            int i11 = this.currentGroup;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i11;
            this.currentSlot = i12;
            this.currentSlotEnd = i13;
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        return SlotTableKt.hasAux(this.groups, iGroupIndexToAddress) ? this.slots[auxIndex(this.groups, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(index));
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.hasObjectKey(this.groups, iGroupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i10 = this.currentGroup;
        return new AnonymousClass1(iDataIndex, dataIndex(iArr, groupIndexToAddress(i10 + groupSize(i10))), this);
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb2 = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i10 = 0; i10 < size$runtime_release; i10++) {
            groupAsString(sb2, i10);
            sb2.append('\n');
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i10 = this.parent;
        if (index <= i10 || index >= this.currentGroupEnd) {
            return i10 == 0 && index == 0;
        }
        return true;
    }

    public final void insertAux(@Nullable Object value) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting");
            throw new g();
        }
        int i10 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        if (SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            ComposerKt.composeRuntimeError("Group already has auxiliary data");
            throw new g();
        }
        insertSlots(1, i10);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i11 = this.currentSlot;
        if (i11 > iAuxIndex) {
            int i12 = i11 - iAuxIndex;
            if (i12 >= 3) {
                throw new IllegalStateException("Moving more than two slot not supported");
            }
            if (i12 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = value;
        this.currentSlot++;
    }

    public final void insertParentGroup(int key) {
        int iNodeCount = 0;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Writer cannot be inserting");
            throw new g();
        }
        if (isGroupEnd()) {
            beginInsert();
            startGroup(key);
            endGroup();
            endInsert();
            return;
        }
        int i10 = this.currentGroup;
        int iParent = parent(this.groups, i10);
        int iGroupSize = groupSize(iParent) + iParent;
        int i11 = iGroupSize - i10;
        int iGroupSize2 = i10;
        while (iGroupSize2 < iGroupSize) {
            int iGroupIndexToAddress = groupIndexToAddress(iGroupSize2);
            iNodeCount += SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            iGroupSize2 += SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        }
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i10));
        beginInsert();
        insertGroups(1);
        endInsert();
        int iGroupIndexToAddress2 = groupIndexToAddress(i10);
        SlotTableKt.initGroup(this.groups, iGroupIndexToAddress2, key, false, false, false, iParent, iDataAnchor);
        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, i11 + 1);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress2, iNodeCount);
        addToGroupSizeAlongSpine(groupIndexToAddress(iParent), 1);
        fixParentAnchorsFor(iParent, iGroupSize, i10);
        this.currentGroup = iGroupSize;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i10));
    }

    public final void markGroup(int group) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        if (SlotTableKt.hasMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        SlotTableKt.updateMark(this.groups, iGroupIndexToAddress, true);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(group));
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int index) {
        Intrinsics.checkNotNullParameter(table, "table");
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                return INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true);
            } finally {
                slotWriterOpenWriter.close();
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
        return this.anchors;
    }

    public final void moveGroup(int offset) {
        boolean z10 = true;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot move a group while inserting");
            throw new g();
        }
        if (!(offset >= 0)) {
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds");
            throw new g();
        }
        if (offset == 0) {
            return;
        }
        int i10 = this.currentGroup;
        int i11 = this.parent;
        int i12 = this.currentGroupEnd;
        int iGroupSize = i10;
        for (int i13 = offset; i13 > 0; i13--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i12)) {
                ComposerKt.composeRuntimeError("Parameter offset is out of bounds");
                throw new g();
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int i14 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i15 = iGroupSize + iGroupSize2;
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i15));
        int i16 = iDataIndex2 - iDataIndex;
        insertSlots(i16, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i15) * 5;
        ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i10) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i16 > 0) {
            Object[] objArr = this.slots;
            ArraysKt.copyInto(objArr, objArr, i14, dataIndexToDataAddress(iDataIndex + i16), dataIndexToDataAddress(iDataIndex2 + i16));
        }
        int i17 = iDataIndex + i16;
        int i18 = i17 - i14;
        int i19 = this.slotsGapStart;
        int i20 = this.slotsGapLen;
        int length = this.slots.length;
        int i21 = this.slotsGapOwner;
        int i22 = i10 + iGroupSize2;
        int i23 = i10;
        while (i23 < i22) {
            boolean z11 = z10;
            int iGroupIndexToAddress2 = groupIndexToAddress(i23);
            int i24 = i23;
            int i25 = i18;
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i18, i21 < iGroupIndexToAddress2 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z10 = z11;
            i18 = i25;
        }
        moveAnchors(i15, i10, iGroupSize2);
        if (removeGroups(i15, iGroupSize2)) {
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors");
            throw new g();
        }
        fixParentAnchorsFor(i11, this.currentGroupEnd, i10);
        if (i16 > 0) {
            removeSlots(i17, i16, i15 - 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r10, @org.jetbrains.annotations.NotNull androidx.compose.runtime.SlotTable r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r9.insertCount
            if (r0 > 0) goto L14
            int r0 = r9.currentGroup
            int r0 = r0 + r10
            int r0 = r9.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r9.currentGroup
            int r1 = r9.currentSlot
            int r2 = r9.currentSlotEnd
            r9.advanceBy(r10)
            r9.startGroup()
            r9.beginInsert()
            androidx.compose.runtime.SlotWriter r4 = r11.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.INSTANCE     // Catch: java.lang.Throwable -> L48
            r7 = 0
            r8 = 1
            r6 = r9
            r5 = r12
            java.util.List r10 = androidx.compose.runtime.SlotWriter.Companion.access$moveGroup(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L45
            r4.close()
            r9.endInsert()
            r9.endGroup()
            r6.currentGroup = r0
            r6.currentSlot = r1
            r6.currentSlotEnd = r2
            return r10
        L45:
            r0 = move-exception
        L46:
            r10 = r0
            goto L4b
        L48:
            r0 = move-exception
            r6 = r9
            goto L46
        L4b:
            r4.close()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int offset, @NotNull SlotWriter writer) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        ComposerKt.runtimeCheck(writer.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i10 = this.currentGroup;
        ComposerKt.runtimeCheck(i10 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd);
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup = INSTANCE.moveGroup(this, iAnchorIndex, writer, false, false);
        updateContainsMark(iParent);
        boolean z10 = iNodeCount > 0;
        while (iParent >= i10) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z10) {
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
                    z10 = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, SlotTableKt.nodeCount(iArr2, iGroupIndexToAddress) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z10) {
            ComposerKt.runtimeCheck(this.nodeCount >= iNodeCount);
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup;
    }

    @Nullable
    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(index));
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final boolean removeGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot remove group while inserting");
            throw new g();
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iSkipGroup = skipGroup();
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i10) {
                prioritySet.takeMax();
            }
        }
        boolean zRemoveGroups = removeGroups(i10, this.currentGroup - i10);
        removeSlots(i11, this.currentSlot - i11, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot reset when inserting");
            throw new g();
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(@Nullable Object value) {
        int i10 = this.currentSlot;
        if (i10 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i10 - 1)] = value;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot");
            throw new g();
        }
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[dataIndexToDataAddress(i10)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
    }

    public final void skipToGroupEnd() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i10));
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int index) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return slot(anchorIndex(anchor), index);
    }

    public final void startData(int key, @Nullable Object objectKey, @Nullable Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Key must be supplied when inserting");
            throw new g();
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int key, @Nullable Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    @Nullable
    public final Object update(@Nullable Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    public final void updateAux(@Nullable Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = value;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot");
            throw new g();
        }
    }

    public final void updateNode(@Nullable Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateParentNode(@Nullable Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void verifyDataAnchors$runtime_release() {
        int i10 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i11);
            int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
            int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress);
            if (iDataIndex < i12) {
                throw new IllegalStateException(("Data index out of order at " + i11 + ", previous = " + i12 + ", current = " + iDataIndex).toString());
            }
            if (iDataIndex > length) {
                throw new IllegalStateException(("Data index, " + iDataIndex + ", out of bound at " + i11).toString());
            }
            if (iDataAnchor < 0 && !z10) {
                if (i10 != i11) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i10 + " found gap at " + i11).toString());
                }
                z10 = true;
            }
            i11++;
            i12 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i10 = this.groupGapStart;
        int i11 = this.groupGapLen;
        int capacity = getCapacity();
        for (int i12 = 0; i12 < i10; i12++) {
            if (SlotTableKt.parentAnchor(this.groups, i12) <= -2) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i12).toString());
            }
        }
        for (int i13 = i11 + i10; i13 < capacity; i13++) {
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i13);
            if (parentAnchorToIndex(iParentAnchor) < i10) {
                if (iParentAnchor <= -2) {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i13).toString());
                }
            } else if (iParentAnchor > -2) {
                throw new IllegalStateException(("Expected an end relative anchor at " + i13).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(index));
    }

    public final int parent(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    @Nullable
    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i10 = index + iSlotIndex;
        if (iSlotIndex > i10 || i10 >= iDataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i10)];
    }

    public final void startData(int key, @Nullable Object aux) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    public final void startNode(int key, @Nullable Object objectKey, @Nullable Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    private final int parent(int[] iArr, int i10) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i10)));
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    @Nullable
    public final Object set(int index, @Nullable Object value) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int i10 = iSlotIndex + index;
        if (i10 >= iSlotIndex && i10 < dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) {
            int iDataIndexToDataAddress = dataIndexToDataAddress(i10);
            Object[] objArr = this.slots;
            Object obj = objArr[iDataIndexToDataAddress];
            objArr[iDataIndexToDataAddress] = value;
            return obj;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + index + " for group " + this.currentGroup).toString());
        throw new g();
    }

    public final void startGroup(int key) {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(key, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int key, @Nullable Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int iGroupSize;
        byte b10 = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b10 != false) {
            insertGroups(1);
            int i10 = this.currentGroup;
            int iGroupIndexToAddress = groupIndexToAddress(i10);
            Composer.Companion companion = Composer.INSTANCE;
            ?? r72 = objectKey != companion.getEmpty() ? 1 : 0;
            ?? r82 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, key, isNode, r72, r82, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i11 = (isNode ? 1 : 0) + r72 + r82;
            if (i11 > 0) {
                insertSlots(i11, i10);
                Object[] objArr = this.slots;
                int i12 = this.currentSlot;
                if (isNode) {
                    objArr[i12] = aux;
                    i12++;
                }
                if (r72 != 0) {
                    objArr[i12] = objectKey;
                    i12++;
                }
                if (r82 != 0) {
                    objArr[i12] = aux;
                    i12++;
                }
                this.currentSlot = i12;
            }
            this.nodeCount = 0;
            iGroupSize = i10 + 1;
            this.parent = i10;
            this.currentGroup = iGroupSize;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i13 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i13);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress2);
            this.parent = i13;
            this.currentGroup = i13 + 1;
            iGroupSize = i13 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }
}
