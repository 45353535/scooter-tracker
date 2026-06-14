package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0006\u0010\t\u001a\u00020\u0007J\r\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0086\bø\u0001\u0000J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\nJ\u0016\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0011J\u001e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0011J&\u0010%\u001a\u00020\u00072\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0'H\u0086\bø\u0001\u0000J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001J\u0015\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0003H\u0000¢\u0006\u0002\b,J\u0019\u0010-\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0011H\u0086\u0002J\u0006\u0010.\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/collection/MutableIntFloatMap;", "Landroidx/collection/IntFloatMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", C4240b4.i.W, "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", UserMetadata.KEYDATA_FILENAME, "Landroidx/collection/IntList;", "Landroidx/collection/IntSet;", "", "plusAssign", TypedValues.TransitionType.S_FROM, "put", "value", "default", "putAll", "remove", "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", FirebaseAnalytics.Param.INDEX, "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableIntFloatMap extends IntFloatMap {
    private int growthLimit;

    public MutableIntFloatMap() {
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

    private final int findInsertIndex(int key) {
        int i10 = ScatterMapKt.MurmurHashC1 * key;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i19 = i16;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i20 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i21 = iFindFirstAvailableSlot >> 3;
                long j14 = jArr2[i21];
                int i22 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this._capacity;
                long j15 = ((~(255 << i22)) & j14) | (j11 << i22);
                jArr2[i21] = j15;
                jArr2[(((iFindFirstAvailableSlot - 7) & i23) + (i23 & 7)) >> 3] = j15;
                return ~iFindFirstAvailableSlot;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
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
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new int[iMax];
        this.values = new float[iMax];
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compare(v.c(v.c(this._size) * 32) ^ Long.MIN_VALUE, v.c(v.c(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int[] iArr = this.keys;
        float[] fArr = this.values;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                int i18 = iArr[i15] * ScatterMapKt.MurmurHashC1;
                int i19 = i18 ^ (i18 << 16);
                int i20 = i19 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i20);
                int i21 = i20 & i10;
                int i22 = i12;
                if (((iFindFirstAvailableSlot - i21) & i10) / 8 == ((i15 - i21) & i10) / 8) {
                    jArr[i16] = (((long) (i19 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i22] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i22;
                } else {
                    int i23 = iFindFirstAvailableSlot >> 3;
                    long j14 = jArr[i23];
                    int i24 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j14 >> i24) & 255) == 128) {
                        j10 = j12;
                        jArr[i23] = (((long) (i19 & 127)) << i24) | (j14 & (~(255 << i24)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iFindFirstAvailableSlot] = iArr[i15];
                        iArr[i15] = i22;
                        fArr[iFindFirstAvailableSlot] = fArr[i15];
                        fArr[i15] = 0.0f;
                    } else {
                        j10 = j12;
                        jArr[i23] = (((long) (i19 & 127)) << i24) | (j14 & (~(255 << i24)));
                        int i25 = iArr[iFindFirstAvailableSlot];
                        iArr[iFindFirstAvailableSlot] = iArr[i15];
                        iArr[i15] = i25;
                        float f10 = fArr[iFindFirstAvailableSlot];
                        fArr[iFindFirstAvailableSlot] = fArr[i15];
                        fArr[i15] = f10;
                        i15--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i22] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i22;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        initializeGrowth();
    }

    public final float getOrPut(int key, @NotNull Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        put(key, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(int key) {
        remove(key);
    }

    public final void plusAssign(@NotNull IntFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(int key, float value) {
        set(key, value);
    }

    public final void putAll(@NotNull IntFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        float[] fArr = from.values;
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
                        set(iArr[i13], fArr[i13]);
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

    public final void remove(int key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(@NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
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
                        if (predicate.invoke(Integer.valueOf(this.keys[i13]), Float.valueOf(this.values[i13])).booleanValue()) {
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

    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = this._capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableIntFloatMap mutableIntFloatMap = this;
        long[] jArr2 = mutableIntFloatMap.metadata;
        int[] iArr = mutableIntFloatMap.keys;
        float[] fArr = mutableIntFloatMap.values;
        int i10 = mutableIntFloatMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableIntFloatMap.metadata;
        int[] iArr2 = mutableIntFloatMap.keys;
        float[] fArr2 = mutableIntFloatMap.values;
        int i11 = mutableIntFloatMap._capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int i14 = ScatterMapKt.MurmurHashC1 * i13;
                int i15 = i14 ^ (i14 << 16);
                int iFindFirstAvailableSlot = mutableIntFloatMap.findFirstAvailableSlot(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iFindFirstAvailableSlot >> 3;
                int i17 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j11;
                iArr2[iFindFirstAvailableSlot] = i13;
                fArr2[iFindFirstAvailableSlot] = fArr[i12];
            } else {
                jArr = jArr2;
            }
            i12++;
            mutableIntFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(int key, float value) {
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

    public MutableIntFloatMap(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i10));
    }

    public final void minusAssign(@NotNull int[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (int i10 : keys) {
            remove(i10);
        }
    }

    public final float put(int key, float value, float f10) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f10 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
        return f10;
    }

    public final boolean remove(int key, float value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(@NotNull IntSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.elements;
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
                        remove(iArr[(i10 << 3) + i12]);
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

    public /* synthetic */ MutableIntFloatMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(@NotNull IntList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(iArr[i11]);
        }
    }
}
