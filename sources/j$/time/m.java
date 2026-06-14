package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84678a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f84678a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84678a[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
