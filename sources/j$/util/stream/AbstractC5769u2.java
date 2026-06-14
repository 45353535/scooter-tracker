package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5769u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f85371a;

    static {
        int[] iArr = new int[EnumC5676b3.values().length];
        f85371a = iArr;
        try {
            iArr[EnumC5676b3.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f85371a[EnumC5676b3.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f85371a[EnumC5676b3.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f85371a[EnumC5676b3.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
