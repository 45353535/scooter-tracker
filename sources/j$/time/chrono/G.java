package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84551a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f84551a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84551a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f84551a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
