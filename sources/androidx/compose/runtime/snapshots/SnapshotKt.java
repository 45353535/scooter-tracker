package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a1\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010!\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010&\u001a-\u0010'\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+\u001a'\u0010-\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.\u001a'\u0010-\u001a\u00020\u00112\u0006\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u00101\u001a3\u00103\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020/2\u0006\u00102\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00103\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b3\u00107\u001a+\u00103\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020\n¢\u0006\u0004\b3\u00108\u001a\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u0004\u0018\u00010/2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b>\u0010?\u001a-\u0010@\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020\nH\u0001¢\u0006\u0004\b@\u00108\u001a5\u0010B\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020\n2\u0006\u0010A\u001a\u00028\u0000H\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010D\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020\nH\u0000¢\u0006\u0004\bD\u00108\u001a-\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u00108\u001a%\u0010F\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/*\u00028\u00002\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\bF\u00107\u001a\u001f\u0010G\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\bG\u0010H\u001aK\u0010J\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u00020/\"\u0004\b\u0001\u0010I*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001aC\u0010J\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u00020/\"\u0004\b\u0001\u0010I*\u00028\u00002\u0006\u00106\u001a\u0002052\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\bJ\u0010L\u001aK\u0010M\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u00020/\"\u0004\b\u0001\u0010I*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010A\u001a\u00028\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a5\u0010S\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0018\u00010R2\u0006\u0010\u000b\u001a\u00020O2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u0002H\u0002¢\u0006\u0004\bS\u0010T\u001a\u000f\u0010U\u001a\u000209H\u0002¢\u0006\u0004\bU\u0010;\u001a)\u0010V\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/2\u0006\u00102\u001a\u00028\u00002\u0006\u0010)\u001a\u00020\nH\u0001¢\u0006\u0004\bV\u0010W\u001a!\u0010V\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020/2\u0006\u00102\u001a\u00028\u0000H\u0001¢\u0006\u0004\bV\u0010X\u001a;\u0010Y\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u00020/\"\u0004\b\u0001\u0010I*\u00028\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a#\u0010]\u001a\u00020\u0002*\u00020\u00022\u0006\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\u0000H\u0000¢\u0006\u0004\b]\u0010^\" \u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`\"\u0014\u0010a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010b\"\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\n0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\" \u0010f\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010&\u001a\u0004\bh\u0010i\"\u0016\u0010k\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l\"\u0016\u0010m\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010b\"\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p\"2\u0010t\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0s\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u\"&\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010u\"4\u0010{\u001a\"\u0012\f\u0012\n y*\u0004\u0018\u00010x0x0wj\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010x0x`z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|\"!\u0010}\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0013\n\u0004\b}\u0010~\u0012\u0005\b\u0080\u0001\u0010&\u001a\u0004\b\u007f\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "releasePinningLocked", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/Snapshot;", "parentObserver", "mergeReadObserver", "mergedReadObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "mergedWriteObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "Lkotlin/Function0;", "block", "sync", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "previousGlobalSnapshot", "takeNewGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "()V", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "candidateSnapshot", "valid", "(IILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "()Ljava/lang/Void;", "usedLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "overwriteUnusedRecordsLocked", "(Landroidx/compose/runtime/snapshots/StateObject;)Z", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newWritableRecordLocked", "newOverwritableRecordLocked", "notifyWrite", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "R", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "reportReadonlySnapshotWrite", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "until", "addRange", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;II)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "emptyLambda", "Lkotlin/jvm/functions/Function1;", "INVALID_SNAPSHOT", "I", "Landroidx/compose/runtime/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;

    @NotNull
    private static final List<Function2<Set<? extends Object>, Snapshot, Unit>> applyObservers;

    @NotNull
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;

    @NotNull
    private static final List<Function1<Object, Unit>> globalWriteObservers;
    private static int nextSnapshotId;

    @NotNull
    private static SnapshotIdSet openSnapshots;

    @NotNull
    private static final SnapshotDoubleIndexHeap pinningTable;

    @NotNull
    private static final Snapshot snapshotInitializer;

    @NotNull
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SnapshotIdSet it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.f93236a;
        }
    };

    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        applyObservers = new ArrayList();
        globalWriteObservers = new ArrayList();
        int i10 = nextSnapshotId;
        nextSnapshotId = i10 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i10, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(globalSnapshot2, "currentGlobalSnapshot.get()");
        snapshotInitializer = globalSnapshot2;
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i10, int i11) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<this>");
        while (i10 < i11) {
            snapshotIdSet = snapshotIdSet.set(i10);
            i10++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        GlobalSnapshot globalSnapshot;
        T t10;
        List mutableList;
        Snapshot snapshot = snapshotInitializer;
        Intrinsics.checkNotNull(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            globalSnapshot = currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(globalSnapshot, "currentGlobalSnapshot.get()");
            t10 = (T) takeNewGlobalSnapshot(globalSnapshot, function1);
        }
        Set<StateObject> modified$runtime_release = globalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                mutableList = CollectionsKt.toMutableList((Collection) applyObservers);
            }
            int size = mutableList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Function2) mutableList.get(i10)).invoke(modified$runtime_release, globalSnapshot);
            }
        }
        synchronized (getLock()) {
            if (modified$runtime_release != null) {
                try {
                    Iterator<T> it = modified$runtime_release.iterator();
                    while (it.hasNext()) {
                        overwriteUnusedRecordsLocked((StateObject) it.next());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, Unit> function1, boolean z10) {
        boolean z11 = snapshot instanceof MutableSnapshot;
        if (z11 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z11 ? (MutableSnapshot) snapshot : null, function1, null, false, z10);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z10);
    }

    static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z10);
    }

    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T r10, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(r10, "r");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t10 = (T) readable(r10, snapshot.getId(), snapshot.getInvalid());
        if (t10 != null) {
            return t10;
        }
        readError();
        throw new g();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot != null) {
            return snapshot;
        }
        GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
        Intrinsics.checkNotNullExpressionValue(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> mergedReadObserver(final Function1<Object, Unit> function1, final Function1<Object, Unit> function12, boolean z10) {
        if (!z10) {
            function12 = null;
        }
        return (function1 == null || function12 == null || Intrinsics.areEqual(function1, function12)) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object state) {
                Intrinsics.checkNotNullParameter(state, "state");
                function1.invoke(state);
                function12.invoke(state);
            }
        };
    }

    static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return mergedReadObserver(function1, function12, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> mergedWriteObserver(final Function1<Object, Unit> function1, final Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null || Intrinsics.areEqual(function1, function12)) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object state) {
                Intrinsics.checkNotNullParameter(state, "state");
                function1.invoke(state);
                function12.invoke(state);
            }
        };
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull T t10, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        T t11 = (T) usedLocked(state);
        if (t11 != null) {
            t11.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.create();
        t12.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t12.setNext$runtime_release(state.getFirstStateRecord());
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$13");
        state.prependStateRecord(t12);
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t10, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        T t11;
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        synchronized (getLock()) {
            t11 = (T) newWritableRecordLocked(t10, state, snapshot);
        }
        return t11;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11 = (T) newOverwritableRecordLocked(t10, stateObject);
        t11.assign(t10);
        t11.setSnapshotId$runtime_release(snapshot.getId());
        return t11;
    }

    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id2 = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot2.getInvalid().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap map = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = readable(firstStateRecord, id2, snapshotIdSet);
            if (stateRecord2 != null && (stateRecord = readable(firstStateRecord, id2, snapshotIdSetOr)) != null && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid());
                if (stateRecord3 == null) {
                    readError();
                    throw new g();
                }
                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                if (stateRecordMergeRecords == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(stateRecord2, stateRecordMergeRecords);
                map = map;
            }
        }
        return map;
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t10, @NotNull StateObject state, @NotNull T candidate, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(overwritableRecord(t10, state, current, candidate));
                z.b(1);
            } catch (Throwable th2) {
                z.b(1);
                z.a(1);
                throw th2;
            }
        }
        z.a(1);
        notifyWrite(current, state);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t10, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull T candidate) {
        T t11;
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.mo1264recordModified$runtime_release(state);
        }
        int id2 = snapshot.getId();
        if (candidate.getSnapshotId() == id2) {
            return candidate;
        }
        synchronized (getLock()) {
            t11 = (T) newOverwritableRecordLocked(t10, state);
        }
        t11.setSnapshotId$runtime_release(id2);
        snapshot.mo1264recordModified$runtime_release(state);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        StateRecord stateRecord2 = null;
        int i10 = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release > iLowestOrDefault) {
                    i10++;
                } else if (stateRecord2 == null) {
                    stateRecord2 = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId() < stateRecord2.getSnapshotId()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    stateRecord2.setSnapshotId$runtime_release(0);
                    stateRecord2.assign(stateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i10 < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t10, int i10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            if (valid(t10, i10, snapshotIdSet) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final void releasePinningLocked(int i10) {
        pinningTable.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final <T> T sync(@NotNull Function0<? extends T> block) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                tInvoke = block.invoke();
                z.b(1);
            } catch (Throwable th2) {
                z.b(1);
                z.a(1);
                throw th2;
            }
        }
        z.a(1);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T tInvoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i10 = nextSnapshotId;
            nextSnapshotId = i10 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i10, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i10);
            Unit unit = Unit.f93236a;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new Function1<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Snapshot invoke(@NotNull SnapshotIdSet invalid) {
                Intrinsics.checkNotNullParameter(invalid, "invalid");
                Snapshot snapshot = (Snapshot) function1.invoke(invalid);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                    Unit unit = Unit.f93236a;
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(int i10, @NotNull SnapshotIdSet invalid) {
        int iAdd;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        int iLowest = invalid.lowest(i10);
        synchronized (getLock()) {
            iAdd = pinningTable.add(iLowest);
        }
        return iAdd;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() != 0) {
                if (valid(firstStateRecord, iLowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (firstStateRecord.getSnapshotId() >= stateRecord.getSnapshotId()) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(int i10, int i11, SnapshotIdSet snapshotIdSet) {
        return (i11 == 0 || i11 > i10 || snapshotIdSet.get(i11)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        if (!openSnapshots.get(snapshot.getId())) {
            throw new IllegalStateException("Snapshot is not open");
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t10, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(current(t10));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t10, @NotNull StateObject state, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(writableRecord(t10, state, current));
                z.b(1);
            } catch (Throwable th2) {
                z.b(1);
                z.a(1);
                throw th2;
            }
        }
        z.a(1);
        notifyWrite(current, state);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t10, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.mo1264recordModified$runtime_release(state);
        }
        T t11 = (T) readable(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 == null) {
            readError();
            throw new g();
        }
        if (t11.getSnapshotId() == snapshot.getId()) {
            return t11;
        }
        T t12 = (T) newWritableRecord(t11, state, snapshot);
        snapshot.mo1264recordModified$runtime_release(state);
        return t12;
    }

    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T r10) {
        T t10;
        Intrinsics.checkNotNullParameter(r10, "r");
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t11 = (T) readable(r10, current.getId(), current.getInvalid());
        if (t11 != null) {
            return t11;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t10 = (T) readable(r10, current2.getId(), current2.getInvalid());
        }
        if (t10 != null) {
            return t10;
        }
        readError();
        throw new g();
    }

    private static final boolean valid(StateRecord stateRecord, int i10, SnapshotIdSet snapshotIdSet) {
        return valid(i10, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t10, @NotNull StateObject state) {
        T t11;
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        Function1<Object, Unit> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(state);
        }
        T t12 = (T) readable(t10, current.getId(), current.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = state.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
            t11 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid());
            if (t11 == null) {
                readError();
                throw new g();
            }
        }
        return t11;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t10, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                rInvoke = block.invoke(writableRecord(t10, state, snapshot));
                z.b(1);
            } catch (Throwable th2) {
                z.b(1);
                z.a(1);
                throw th2;
            }
        }
        z.a(1);
        notifyWrite(snapshot, state);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t10, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(state);
        }
        T t11 = (T) readable(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SnapshotIdSet it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
                invoke2(snapshotIdSet);
                return Unit.f93236a;
            }
        });
    }
}
