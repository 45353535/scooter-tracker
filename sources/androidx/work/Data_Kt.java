package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\b\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0001\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0004\u0010\u000e\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0004\u0010\u0011\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0004\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "value", "", "", "convertPrimitiveArray", "([Z)[Ljava/lang/Boolean;", "", "", "([B)[Ljava/lang/Byte;", "", "", "([I)[Ljava/lang/Integer;", "", "", "([J)[Ljava/lang/Long;", "", "", "([F)[Ljava/lang/Float;", "", "", "([D)[Ljava/lang/Double;", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Data_Kt {

    @NotNull
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("Data");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean[] convertPrimitiveArray(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Byte[] convertPrimitiveArray(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer[] convertPrimitiveArray(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long[] convertPrimitiveArray(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float[] convertPrimitiveArray(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double[] convertPrimitiveArray(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }
}
