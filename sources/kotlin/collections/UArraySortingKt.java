package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.s;
import lf.u;
import lf.w;
import lf.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\n\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Llf/s;", "array", "", "left", "right", "partition-4UcCI2c", "([BII)I", "partition", "", "quickSort-4UcCI2c", "([BII)V", "quickSort", "Llf/z;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Llf/u;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Llf/w;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m7930partitionnroSd4(long[] jArr, int i10, int i11) {
        long jL = w.l(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Long.compare(w.l(jArr, i10) ^ Long.MIN_VALUE, jL ^ Long.MIN_VALUE) < 0) {
                i10++;
            }
            while (Long.compare(w.l(jArr, i11) ^ Long.MIN_VALUE, jL ^ Long.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long jL2 = w.l(jArr, i10);
                w.r(jArr, i10, w.l(jArr, i11));
                w.r(jArr, i11, jL2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m7931partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte bL = s.l(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                i12 = bL & 255;
                if (Intrinsics.compare(s.l(bArr, i10) & 255, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(s.l(bArr, i11) & 255, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte bL2 = s.l(bArr, i10);
                s.r(bArr, i10, s.l(bArr, i11));
                s.r(bArr, i11, bL2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m7932partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short sL = z.l(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                i12 = sL & 65535;
                if (Intrinsics.compare(z.l(sArr, i10) & 65535, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(z.l(sArr, i11) & 65535, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short sL2 = z.l(sArr, i10);
                z.r(sArr, i10, z.l(sArr, i11));
                z.r(sArr, i11, sL2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m7933partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int iL = u.l(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Integer.compare(u.l(iArr, i10) ^ Integer.MIN_VALUE, iL ^ Integer.MIN_VALUE) < 0) {
                i10++;
            }
            while (Integer.compare(u.l(iArr, i11) ^ Integer.MIN_VALUE, iL ^ Integer.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int iL2 = u.l(iArr, i10);
                u.r(iArr, i10, u.l(iArr, i11));
                u.r(iArr, i11, iL2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m7934quickSortnroSd4(long[] jArr, int i10, int i11) {
        int iM7930partitionnroSd4 = m7930partitionnroSd4(jArr, i10, i11);
        int i12 = iM7930partitionnroSd4 - 1;
        if (i10 < i12) {
            m7934quickSortnroSd4(jArr, i10, i12);
        }
        if (iM7930partitionnroSd4 < i11) {
            m7934quickSortnroSd4(jArr, iM7930partitionnroSd4, i11);
        }
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m7935quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int iM7931partition4UcCI2c = m7931partition4UcCI2c(bArr, i10, i11);
        int i12 = iM7931partition4UcCI2c - 1;
        if (i10 < i12) {
            m7935quickSort4UcCI2c(bArr, i10, i12);
        }
        if (iM7931partition4UcCI2c < i11) {
            m7935quickSort4UcCI2c(bArr, iM7931partition4UcCI2c, i11);
        }
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m7936quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int iM7932partitionAa5vz7o = m7932partitionAa5vz7o(sArr, i10, i11);
        int i12 = iM7932partitionAa5vz7o - 1;
        if (i10 < i12) {
            m7936quickSortAa5vz7o(sArr, i10, i12);
        }
        if (iM7932partitionAa5vz7o < i11) {
            m7936quickSortAa5vz7o(sArr, iM7932partitionAa5vz7o, i11);
        }
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m7937quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int iM7933partitionoBK06Vg = m7933partitionoBK06Vg(iArr, i10, i11);
        int i12 = iM7933partitionoBK06Vg - 1;
        if (i10 < i12) {
            m7937quickSortoBK06Vg(iArr, i10, i12);
        }
        if (iM7933partitionoBK06Vg < i11) {
            m7937quickSortoBK06Vg(iArr, iM7933partitionoBK06Vg, i11);
        }
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m7938sortArraynroSd4(@NotNull long[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7934quickSortnroSd4(array, i10, i11 - 1);
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m7939sortArray4UcCI2c(@NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7935quickSort4UcCI2c(array, i10, i11 - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m7940sortArrayAa5vz7o(@NotNull short[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7936quickSortAa5vz7o(array, i10, i11 - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m7941sortArrayoBK06Vg(@NotNull int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7937quickSortoBK06Vg(array, i10, i11 - 1);
    }
}
