package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lf.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00010\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u001f¢\u0006\u0004\b\"\u0010#J'\u0010\"\u001a\u00020\b2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0$¢\u0006\u0004\b\"\u0010%J'\u0010\"\u001a\u00020\b2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0&¢\u0006\u0004\b\"\u0010'J!\u0010\"\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b\"\u0010*J!\u0010\"\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\"\u0010+J$\u0010-\u001a\u00020\b2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0086\n¢\u0006\u0004\b-\u0010.J,\u0010-\u001a\u00020\b2\u001a\u0010!\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u001fH\u0086\n¢\u0006\u0004\b-\u0010#J*\u0010-\u001a\u00020\b2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0$H\u0086\n¢\u0006\u0004\b-\u0010%J*\u0010-\u001a\u00020\b2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0&H\u0086\n¢\u0006\u0004\b-\u0010'J$\u0010-\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(H\u0086\n¢\u0006\u0004\b-\u0010*J$\u0010-\u001a\u00020\b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\n¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J\u001d\u0010/\u001a\u0002012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b/\u00102J-\u00104\u001a\u00020\b2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002010\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b6\u00107J \u00106\u001a\u00020\b2\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001fH\u0086\n¢\u0006\u0004\b6\u00109J\u001e\u00106\u001a\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0086\n¢\u0006\u0004\b6\u0010%J\u001e\u00106\u001a\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0086\n¢\u0006\u0004\b6\u0010'J\u001e\u00106\u001a\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0086\n¢\u0006\u0004\b6\u0010;J\u001e\u00106\u001a\u00020\b2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0086\n¢\u0006\u0004\b6\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00018\u00012\u0006\u0010>\u001a\u00020\u0004H\u0001¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\b¢\u0006\u0004\bA\u0010\rJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0001¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020\bH\u0000¢\u0006\u0004\bF\u0010\rJ\u000f\u0010I\u001a\u00020\bH\u0000¢\u0006\u0004\bH\u0010\rJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bK\u0010\u0007J\u0019\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M¢\u0006\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "hash1", "findFirstAvailableSlot", "(I)I", C4240b4.i.W, "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function2;", "computeBlock", "compute", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "value", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "", TypedValues.TransitionType.S_FROM, "(Ljava/util/Map;)V", "(Landroidx/collection/ScatterMap;)V", "pair", "plusAssign", "(Lkotlin/Pair;)V", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "(Ljava/lang/Object;)V", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", FirebaseAnalytics.Param.INDEX, "removeValueAt", "(I)Ljava/lang/Object;", "clear", "findInsertIndex", "(Ljava/lang/Object;)I", "trim", "()I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "", "asMutableMap", "()Ljava/util/Map;", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public MutableScatterMap() {
        this(0, 1, null);
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
            int i10 = capacity >> 3;
            long j10 = 255 << ((capacity & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(v.c(v.c(this._size) * 32) ^ Long.MIN_VALUE, v.c(v.c(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    @NotNull
    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper(this);
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
        ArraysKt.fill(this.values, (Object) null, 0, this._capacity);
        ArraysKt.fill(this.keys, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K key, @NotNull Function2<? super K, ? super V, ? extends V> computeBlock) {
        Intrinsics.checkNotNullParameter(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(key);
        boolean z10 = iFindInsertIndex < 0;
        V vInvoke = computeBlock.invoke(key, z10 ? null : this.values[iFindInsertIndex]);
        if (!z10) {
            this.values[iFindInsertIndex] = vInvoke;
            return vInvoke;
        }
        int i10 = ~iFindInsertIndex;
        this.keys[i10] = key;
        this.values[i10] = vInvoke;
        return vInvoke;
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * ScatterMapKt.MurmurHashC1;
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iFindFirstAvailableSlot - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = jArr[i21];
                } else {
                    int i22 = iFindFirstAvailableSlot >> 3;
                    long j12 = jArr[i22];
                    int i23 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j12 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iFindFirstAvailableSlot] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iFindFirstAvailableSlot];
                        objArr2[iFindFirstAvailableSlot] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = jArr[i21];
                }
                i15++;
                i12 = i21;
            } else {
                i15++;
            }
        }
        initializeGrowth();
    }

    public final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
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
                return ~iFindFirstAvailableSlot;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final V getOrPut(K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v10 = get(key);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = defaultValue.invoke();
        set(key, vInvoke);
        return vInvoke;
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    @Nullable
    public final V put(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v10 = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = key;
        objArr[iFindInsertIndex] = value;
        return v10;
    }

    public final void putAll(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(K r14) {
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
            java.lang.Object[] r11 = r13.keys
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    public final void removeIf(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
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
                        if (predicate.invoke(this.keys[i13], this.values[i13]).booleanValue()) {
                            removeValueAt(i13);
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

    @Nullable
    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v10 = (V) objArr[index];
        objArr[index] = null;
        return v10;
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i10;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i12 = this._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i14 >>> 7);
                i10 = i13;
                long j10 = i14 & 127;
                int i15 = iFindFirstAvailableSlot >> 3;
                int i16 = (iFindFirstAvailableSlot & 7) << 3;
                long j11 = (j10 << i16) | (jArr2[i15] & (~(255 << i16)));
                jArr2[i15] = j11;
                jArr2[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i10];
            } else {
                i10 = i13;
            }
            i13 = i10 + 1;
        }
    }

    public final void set(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            remove(k10);
        }
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(objArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(K r18, V r19) {
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
            java.lang.Object[] r15 = r0.keys
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
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r1 == 0) goto L83
            r0.removeValueAt(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        set(objArr[i13], objArr2[i13]);
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
    public final void minusAssign(@NotNull ObjectList<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }
}
