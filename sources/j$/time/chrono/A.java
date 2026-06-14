package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84544a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f84544a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84544a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f84544a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
