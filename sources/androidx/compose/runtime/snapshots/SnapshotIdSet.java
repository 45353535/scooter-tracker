package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bø\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0002J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "and", "bits", "andNot", "clear", "bit", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", y.f66058y, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnapshotIdSet implements Iterable<Integer>, yf.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);

    @Nullable
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/j;", "", "", "<anonymous>", "(Lkotlin/sequences/j;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    static final class AnonymousClass1 extends j implements Function2<kotlin.sequences.j, Continuation, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.b(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            if (r13.b(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:42:0x00f1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlin.sequences.j jVar, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    private SnapshotIdSet(long j10, long j11, int i10, int[] iArr) {
        this.upperSet = j10;
        this.lowerSet = j11;
        this.lowerBound = i10;
        this.belowBound = iArr;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (!Intrinsics.areEqual(bits, snapshotIdSet) && !Intrinsics.areEqual(this, snapshotIdSet)) {
            int i10 = bits.lowerBound;
            int i11 = this.lowerBound;
            if (i10 == i11) {
                int[] iArr = bits.belowBound;
                int[] iArr2 = this.belowBound;
                if (iArr == iArr2) {
                    long j10 = this.upperSet;
                    long j11 = bits.upperSet;
                    long j12 = j10 & j11;
                    long j13 = this.lowerSet;
                    long j14 = bits.lowerSet;
                    long j15 = j13 & j14;
                    if (j12 != 0 || j15 != 0 || iArr2 != null) {
                        return new SnapshotIdSet(j11 & j10, j13 & j14, i11, iArr2);
                    }
                }
            }
            if (this.belowBound == null) {
                Iterator<Integer> it = iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (bits.get(iIntValue)) {
                        snapshotIdSet = snapshotIdSet.set(iIntValue);
                    }
                }
                return snapshotIdSet;
            }
            Iterator<Integer> it2 = bits.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = it2.next().intValue();
                if (get(iIntValue2)) {
                    snapshotIdSet = snapshotIdSet.set(iIntValue2);
                }
            }
            return snapshotIdSet;
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i11, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSetClear = this;
        while (it.hasNext()) {
            snapshotIdSetClear = snapshotIdSetClear.clear(it.next().intValue());
        }
        return snapshotIdSetClear;
    }

    @NotNull
    public final SnapshotIdSet clear(int bit) {
        int[] iArr;
        int iBinarySearch;
        int i10 = this.lowerBound;
        int i11 = bit - i10;
        if (i11 >= 0 && i11 < 64) {
            long j10 = 1 << i11;
            long j11 = this.lowerSet;
            if ((j11 & j10) != 0) {
                return new SnapshotIdSet(this.upperSet, (~j10) & j11, i10, this.belowBound);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j12 = 1 << (i11 - 64);
            long j13 = this.upperSet;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet((~j12) & j13, this.lowerSet, i10, this.belowBound);
            }
        } else if (i11 < 0 && (iArr = this.belowBound) != null && (iBinarySearch = SnapshotIdSetKt.binarySearch(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i12 = length - 1;
            if (i12 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i12];
            if (iBinarySearch > 0) {
                ArraysKt.copyInto(iArr, iArr2, 0, 0, iBinarySearch);
            }
            if (iBinarySearch < i12) {
                ArraysKt.copyInto(iArr, iArr2, iBinarySearch, iBinarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void fastForEach(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i10 : iArr) {
                block.invoke(Integer.valueOf(i10));
            }
        }
        if (this.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.lowerSet & (1 << i11)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i11));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.upperSet & (1 << i12)) != 0) {
                    block.invoke(Integer.valueOf(i12 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final boolean get(int bit) {
        int[] iArr;
        int i10 = bit - this.lowerBound;
        return (i10 < 0 || i10 >= 64) ? (i10 < 64 || i10 >= 128) ? i10 <= 0 && (iArr = this.belowBound) != null && SnapshotIdSetKt.binarySearch(iArr, bit) >= 0 : ((1 << (i10 - 64)) & this.upperSet) != 0 : ((1 << i10) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        return k.b(new AnonymousClass1(null)).iterator();
    }

    public final int lowest(int i10) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.lowerSet;
        if (j10 != 0) {
            return this.lowerBound + SnapshotIdSetKt.lowestBitOf(j10);
        }
        long j11 = this.upperSet;
        return j11 != 0 ? this.lowerBound + 64 + SnapshotIdSetKt.lowestBitOf(j11) : i10;
    }

    @NotNull
    public final SnapshotIdSet or(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i11, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.set(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it2.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.set(it2.next().intValue());
        }
        return snapshotIdSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[PHI: r9
  0x0084: PHI (r9v5 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v7 java.util.ArrayList) binds: [B:24:0x0063, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotIdSet set(int r22) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.set(int):androidx.compose.runtime.snapshots.SnapshotIdSet");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
