package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lf.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001b\u0010\u000b\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010'\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010(J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J\u001e\u0010'\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0002\u0010)J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0004H\u0082\bJ\u0016\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010(J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J\u001e\u0010,\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0002\u0010)J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0013\u0010-\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001b\u0010.\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0010\u0010/\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0004H\u0001J \u00100\u001a\u00020\u00142\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b02H\u0086\bø\u0001\u0000J\u0011\u00103\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0004H\u0082\bJ\u0015\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0004H\u0000¢\u0006\u0002\b6J \u00107\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b02H\u0086\bø\u0001\u0000J\u0014\u00107\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u00107\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u00107\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u000008J\b\u00109\u001a\u00020\u0004H\u0007J\u000e\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006<"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/OrderedScatterSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "adjustStorage", "", "adjustStorage$collection", "asMutableSet", "", "clear", "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "findFirstAvailableSlot", "hash1", "fixupNodes", "mapping", "", "", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "moveNodeToHead", FirebaseAnalytics.Param.INDEX, "plusAssign", "remove", "removeAll", "removeElementAt", "removeIf", "predicate", "Lkotlin/Function1;", "removeNode", "resizeStorage", "newCapacity", "resizeStorage$collection", "retainAll", "", "trim", "trimToSize", "maxSize", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iFindFirstAvailableSlot >> 3;
                long j14 = jArr2[i20];
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this._capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iFindFirstAvailableSlot - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iFindFirstAvailableSlot;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i10 = this._capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (SieveCacheKt.NodeLinkMask & j10);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i12] & 4294967295L)))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & mapping[i13]);
            }
            jArr[i10] = ((long) i11) | j11;
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i14] & 4294967295L);
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i15] & 4294967295L);
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i10 = capacity >> 3;
        long j10 = 255 << ((capacity & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            emptyNodes = jArr;
        }
        this.nodes = emptyNodes;
    }

    private final void moveNodeToHead(int index) {
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[index] = (((long) i10) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((SieveCacheKt.NodeLinkMask & ((long) index)) << 31) | (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = index;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = index;
        }
    }

    private final void removeNode(int index) {
        long[] jArr = this.nodes;
        long j10 = jArr[index];
        int i10 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
        int i11 = (int) (j10 & SieveCacheKt.NodeLinkMask);
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i11) & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((((long) i10) & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i10;
        }
        jArr[index] = 4611686018427387903L;
    }

    public final boolean add(E element) {
        int i10 = get_size();
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i11 = this.head;
        jArr[iFindAbsoluteInsertIndex] = (((long) i11) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((SieveCacheKt.NodeLinkMask & ((long) iFindAbsoluteInsertIndex)) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
        return get_size() != i10;
    }

    public final boolean addAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        plusAssign((Object[]) elements);
        return i10 != get_size();
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(v.c(v.c(this._size) * 32) ^ Long.MIN_VALUE, v.c(v.c(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    @NotNull
    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        ArraysKt.fill(this.elements, (Object) null, 0, this._capacity);
        ArraysKt.fill$default(this.nodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        int i10;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i11 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i11];
        long j10 = SieveCacheKt.InvalidMapping;
        int i12 = 0;
        ArraysKt.fill(jArr3, SieveCacheKt.InvalidMapping, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i15 = lastIndex - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * ScatterMapKt.MurmurHashC1;
                int i19 = iHashCode ^ (iHashCode << 16);
                int i20 = i19 >>> 7;
                long j13 = j10;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i20);
                int i21 = i20 & i11;
                if (((iFindFirstAvailableSlot - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = (((long) (i19 & 127)) << i18) | (jArr[i17] & (~(255 << i18)));
                    if (jArr3[i16] == j13) {
                        long j14 = i16;
                        jArr3[i16] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i12];
                    i16++;
                    j10 = j13;
                } else {
                    int i22 = iFindFirstAvailableSlot >> 3;
                    long j15 = jArr[i22];
                    int i23 = (iFindFirstAvailableSlot & 7) << 3;
                    int i24 = i12;
                    if (((j15 >> i23) & 255) == 128) {
                        int i25 = i16;
                        jArr[i22] = (j15 & (~(255 << i23))) | (((long) (i19 & 127)) << i23);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iFindFirstAvailableSlot] = objArr[i25];
                        objArr[i25] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i25];
                        jArr2[i25] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i25] >> 32) & 4294967295L);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | ((long) iFindFirstAvailableSlot);
                            jArr3[i25] = (jArr3[i25] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iFindFirstAvailableSlot);
                        }
                        i10 = i25;
                        jArr3[iFindFirstAvailableSlot] = ((long) Integer.MAX_VALUE) | (((long) i10) << 32);
                    } else {
                        jArr[i22] = (((long) (i19 & 127)) << i23) | (j15 & (~(255 << i23)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
                        long j16 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iFindFirstAvailableSlot;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iFindFirstAvailableSlot;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iFindFirstAvailableSlot] = (((long) i27) << 32) | ((long) i16);
                        i10 = i16 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i24];
                    i16 = i10 + 1;
                    j10 = j13;
                    i12 = i24;
                }
            } else {
                i16++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E element) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[iFindAbsoluteInsertIndex] = (((long) i10) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((SieveCacheKt.NodeLinkMask & ((long) iFindAbsoluteInsertIndex)) << 31) | (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        minusAssign((Object[]) elements);
        return i10 != get_size();
    }

    public final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j11 = jArr2[index];
        int i13 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
        int i14 = (int) (j11 & SieveCacheKt.NodeLinkMask);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i14) & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((((long) i13) & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i14] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i13;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void removeIf(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(objArr[i13]).booleanValue()) {
                            removeElementAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i10 = this._capacity;
        int[] iArr = new int[i10];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i11 = this._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i13 >>> 7);
                long j10 = i13 & 127;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j11 = (jArr4[i14] & (~(255 << i15))) | (j10 << i15);
                jArr4[i14] = j11;
                jArr4[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j11;
                objArr3[iFindFirstAvailableSlot] = obj;
                jArr5[iFindFirstAvailableSlot] = jArr3[i12];
                iArr[i12] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i12++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.collections.CollectionsKt.contains(r14, r15)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0._size
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(java.util.Collection):boolean");
    }

    @IntRange(from = 0)
    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public final void trimToSize(int maxSize) {
        int i10;
        long[] jArr = this.nodes;
        int i11 = this.head;
        while (i11 != Integer.MAX_VALUE && (i10 = this._size) > maxSize && i10 != 0) {
            int i12 = (int) (jArr[i11] & SieveCacheKt.NodeLinkMask);
            removeElementAt(i11);
            i11 = i12;
        }
    }

    public /* synthetic */ MutableOrderedScatterSet(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public MutableOrderedScatterSet(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final boolean addAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        plusAssign((Iterable) elements);
        return i10 != get_size();
    }

    public final boolean removeAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        minusAssign((Sequence) elements);
        return i10 != get_size();
    }

    public final boolean addAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        plusAssign((Sequence) elements);
        return i10 != get_size();
    }

    public final boolean removeAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        minusAssign((Iterable) elements);
        return i10 != get_size();
    }

    public final void minusAssign(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            minusAssign(e10);
        }
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (SieveCacheKt.NodeLinkMask & j10);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i12]))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = mapping[i13];
            }
            jArr[i10] = j11 | ((long) i11);
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = mapping[i14];
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = mapping[i15];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.OrderedScatterSet<E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0._size
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(androidx.collection.OrderedScatterSet):boolean");
    }

    public final boolean addAll(@NotNull OrderedScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        plusAssign((OrderedScatterSet) elements);
        return i10 != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final void plusAssign(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            plusAssign(e10);
        }
    }

    public final boolean removeAll(@NotNull OrderedScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        minusAssign((OrderedScatterSet) elements);
        return i10 != get_size();
    }

    public final void minusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final void plusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final boolean addAll(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        plusAssign((ScatterSet) elements);
        return i10 != get_size();
    }

    public final boolean removeAll(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        minusAssign((ScatterSet) elements);
        return i10 != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull OrderedScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i10 = elements.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            minusAssign(objArr[i10]);
            i10 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final boolean addAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        plusAssign((ObjectList) elements);
        return i10 != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull OrderedScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i10 = elements.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            plusAssign(objArr[i10]);
            i10 = i11;
        }
    }

    public final boolean removeAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = get_size();
        minusAssign((ObjectList) elements);
        return i10 != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<E> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._size
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0._size
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(androidx.collection.ScatterSet):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        minusAssign(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        plusAssign(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.elements
            int r3 = r0.get_size()
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5c
            r7 = r6
        L18:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L57
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L32:
            if (r12 >= r10) goto L55
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L51
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L51
            r0.removeElementAt(r13)
        L51:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L55:
            if (r10 != r11) goto L5c
        L57:
            if (r7 == r5) goto L5c
            int r7 = r7 + 1
            goto L18
        L5c:
            int r1 = r0.get_size()
            if (r3 == r1) goto L64
            r1 = 1
            return r1
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.retainAll(kotlin.jvm.functions.Function1):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            minusAssign(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            plusAssign(objArr[i11]);
        }
    }
}
