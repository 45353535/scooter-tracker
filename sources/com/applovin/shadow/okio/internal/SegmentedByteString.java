package com.applovin.shadow.okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C1700SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import com.ironsource.A1;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000f\u001a\u00020\r*\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0013\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\"\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010)\u001a4\u0010,\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010/\u001a\u00020&*\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010.H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lcom/applovin/shadow/okio/SegmentedByteString;", POBCTAOverlayData.KEY_CTA_POS, A1.f40174i, "(Lcom/applovin/shadow/okio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "", "action", "forEachSegment", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lkotlin/jvm/functions/Function3;)V", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/SegmentedByteString;IILkotlin/jvm/functions/Function3;)V", "Lcom/applovin/shadow/okio/ByteString;", "commonSubstring", "(Lcom/applovin/shadow/okio/SegmentedByteString;II)Lcom/applovin/shadow/okio/ByteString;", "", "commonInternalGet", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)B", "commonGetSize", "(Lcom/applovin/shadow/okio/SegmentedByteString;)I", "commonToByteArray", "(Lcom/applovin/shadow/okio/SegmentedByteString;)[B", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "offset", "byteCount", "commonWrite", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;ILcom/applovin/shadow/okio/ByteString;II)Z", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)Z", TypedValues.AttributesType.S_TARGET, "targetOffset", "commonCopyInto", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(@NotNull C1700SegmentedByteString c1700SegmentedByteString, int i10, @NotNull byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j10 = i12;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c1700SegmentedByteString.size(), i10, j10);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c1700SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c1700SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c1700SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            ArraysKt.copyInto(c1700SegmentedByteString.getSegments()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C1700SegmentedByteString c1700SegmentedByteString, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        if (obj == c1700SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c1700SegmentedByteString.size() && c1700SegmentedByteString.rangeEquals(0, byteString, 0, c1700SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C1700SegmentedByteString c1700SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        return c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C1700SegmentedByteString c1700SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        int hashCode = c1700SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c1700SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c1700SegmentedByteString.getDirectory()[length + i10];
            int i14 = c1700SegmentedByteString.getDirectory()[i10];
            byte[] bArr = c1700SegmentedByteString.getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c1700SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(@NotNull C1700SegmentedByteString c1700SegmentedByteString, int i10) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length - 1], i10, 1L);
        int iSegment = segment(c1700SegmentedByteString, i10);
        return c1700SegmentedByteString.getSegments()[iSegment][(i10 - (iSegment == 0 ? 0 : c1700SegmentedByteString.getDirectory()[iSegment - 1])) + c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull C1700SegmentedByteString c1700SegmentedByteString, int i10, @NotNull ByteString other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c1700SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c1700SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c1700SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c1700SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c1700SegmentedByteString.getSegments()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C1700SegmentedByteString c1700SegmentedByteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c1700SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c1700SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c1700SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c1700SegmentedByteString.size()) {
            return c1700SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c1700SegmentedByteString, i10);
        int iSegment2 = segment(c1700SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c1700SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c1700SegmentedByteString.getDirectory()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c1700SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C1700SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C1700SegmentedByteString c1700SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        byte[] bArr = new byte[c1700SegmentedByteString.size()];
        int length = c1700SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c1700SegmentedByteString.getDirectory()[length + i10];
            int i14 = c1700SegmentedByteString.getDirectory()[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(c1700SegmentedByteString.getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C1700SegmentedByteString c1700SegmentedByteString, @NotNull Buffer buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c1700SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c1700SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c1700SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c1700SegmentedByteString.getSegments()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i11));
    }

    public static final void forEachSegment(@NotNull C1700SegmentedByteString c1700SegmentedByteString, @NotNull Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c1700SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c1700SegmentedByteString.getDirectory()[length + i10];
            int i13 = c1700SegmentedByteString.getDirectory()[i10];
            action.invoke(c1700SegmentedByteString.getSegments()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(@NotNull C1700SegmentedByteString c1700SegmentedByteString, int i10) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c1700SegmentedByteString.getDirectory(), i10 + 1, 0, c1700SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C1700SegmentedByteString c1700SegmentedByteString, int i10, int i11, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c1700SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c1700SegmentedByteString.getDirectory()[iSegment - 1];
            int i13 = c1700SegmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            function3.invoke(c1700SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C1700SegmentedByteString c1700SegmentedByteString, int i10, @NotNull byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c1700SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c1700SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c1700SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c1700SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c1700SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c1700SegmentedByteString.getDirectory()[c1700SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c1700SegmentedByteString.getSegments()[iSegment], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
