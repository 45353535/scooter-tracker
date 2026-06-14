package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mx {
    public static int a(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iA = az0.a(obj == null ? 0 : obj.hashCode());
        int i13 = iA & i10;
        int iA2 = a(i13, obj3);
        if (iA2 == 0) {
            return -1;
        }
        int i14 = ~i10;
        int i15 = iA & i14;
        int i16 = -1;
        while (true) {
            i11 = iA2 - 1;
            i12 = iArr[i11];
            if ((i12 & i14) == i15 && y72.a(obj, objArr[i11]) && (objArr2 == null || y72.a(obj2, objArr2[i11]))) {
                break;
            }
            int i17 = i12 & i10;
            if (i17 == 0) {
                return -1;
            }
            i16 = i11;
            iA2 = i17;
        }
        int i18 = i12 & i10;
        if (i16 == -1) {
            a(i13, i18, obj3);
            return i11;
        }
        iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
        return i11;
    }

    public static int a(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    public static void a(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
