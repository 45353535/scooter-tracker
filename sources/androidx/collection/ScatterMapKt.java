package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u001e\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u001b\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00060\u0001j\u0002`\u001f2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u0011\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0080\b\u001a\u0011\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0080\b\u001a\u0013\u0010\"\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0080\b\u001a\u0019\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0080\b\u001a\u0019\u0010(\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0080\b\u001a\u0011\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0001H\u0081\b\u001a\u0019\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\bH\u0080\b\u001a\u0010\u0010+\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a\u001e\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u000f\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d\u001aO\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u000f\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d2*\u0010-\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0/0.\"\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0/¢\u0006\u0002\u00100\u001a\u0010\u00101\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a\u0010\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0000\u001a\u0019\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\r2\u0006\u0010 \u001a\u00020\bH\u0081\b\u001a\u0010\u00106\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a)\u00107\u001a\u00020\u00172\u0006\u00105\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0001H\u0080\b\u001a!\u00108\u001a\u00020\u00172\u0006\u00105\u001a\u00020\r2\u0006\u0010 \u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0001H\u0080\b\u001a\u0011\u00109\u001a\u00020\b*\u00060\u0001j\u0002`:H\u0080\b\u001a\u0011\u0010;\u001a\u00020&*\u00060\u0001j\u0002`:H\u0080\b\u001a\u0011\u0010<\u001a\u00020\b*\u00060\u0001j\u0002`=H\u0081\b\u001a\u0015\u0010>\u001a\u00060\u0001j\u0002`:*\u00060\u0001j\u0002`\u001fH\u0080\b\u001a\u0015\u0010?\u001a\u00060\u0001j\u0002`:*\u00060\u0001j\u0002`\u001fH\u0081\b\u001a\u001d\u0010@\u001a\u00060\u0001j\u0002`:*\u00060\u0001j\u0002`\u001f2\u0006\u0010A\u001a\u00020\bH\u0081\b\u001a\u0011\u0010B\u001a\u00020\u0001*\u00060\u0001j\u0002`:H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0004*\f\b\u0000\u0010C\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010D\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010E\"\u00020\u00012\u00020\u0001¨\u0006F"}, d2 = {"AllEmpty", "", "BitmaskLsb", "getBitmaskLsb$annotations", "()V", "BitmaskMsb", "getBitmaskMsb$annotations", "ClonedMetadataCount", "", "DefaultScatterCapacity", "Deleted", "Empty", "EmptyGroup", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "", "", "GroupWidth", "MurmurHashC1", "Sentinel", "getSentinel$annotations", "convertMetadataForCleanup", "", "metadata", "capacity", "emptyScatterMap", "Landroidx/collection/ScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "group", "Landroidx/collection/Group;", "offset", "h1", "hash", "h2", CampaignEx.JSON_KEY_AD_K, "isDeleted", "", FirebaseAnalytics.Param.INDEX, "isEmpty", "isFull", "value", "loadedCapacity", "mutableScatterMapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "nextCapacity", "normalizeCapacity", "n", "readRawMetadata", "data", "unloadedCapacity", "writeMetadata", "writeRawMetadata", "get", "Landroidx/collection/Bitmask;", "hasNext", "lowestBitSet", "Landroidx/collection/StaticBitmask;", "maskEmpty", "maskEmptyOrDeleted", "match", "m", "next", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;

    @NotNull
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};

    @NotNull
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static final void convertMetadataForCleanup(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(metadata);
        int i13 = lastIndex - 1;
        metadata[i13] = (metadata[i13] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex] = metadata[0];
    }

    @NotNull
    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        Intrinsics.checkNotNull(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final long group(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        return (((-i12) >> 63) & (metadata[i11 + 1] << (64 - i12))) | (metadata[i11] >>> i12);
    }

    public static final int h1(int i10) {
        return i10 >>> 7;
    }

    public static final int h2(int i10) {
        return i10 & 127;
    }

    public static final boolean hasNext(long j10) {
        return j10 != 0;
    }

    public static final int hash(@Nullable Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isDeleted(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128;
    }

    public static final boolean isFull(long j10) {
        return j10 < 128;
    }

    public static final int loadedCapacity(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final int lowestBitSet(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long maskEmpty(long j10) {
        return j10 & ((~j10) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j10) {
        return j10 & ((~j10) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j10, int i10) {
        long j11 = j10 ^ (((long) i10) * BitmaskLsb);
        return (~j11) & (j11 - BitmaskLsb) & (-9187201950435737472L);
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j10) {
        return j10 & (j10 - 1);
    }

    public static final int nextCapacity(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int normalizeCapacity(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final long readRawMetadata(@NotNull long[] data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }

    public static final void writeMetadata(@NotNull long[] data, int i10, int i11, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        long j11 = (j10 << i13) | (data[i12] & (~(255 << i13)));
        data[i12] = j11;
        data[(((i11 - 7) & i10) + (i10 & 7)) >> 3] = j11;
    }

    public static final void writeRawMetadata(@NotNull long[] data, int i10, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        data[i11] = (j10 << i12) | (data[i11] & (~(255 << i12)));
    }

    public static final boolean isFull(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128;
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }
}
