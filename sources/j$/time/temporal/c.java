package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84701a;

    static {
        int[] iArr = new int[i.values().length];
        f84701a = iArr;
        try {
            iArr[i.WEEK_BASED_YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84701a[i.QUARTER_YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
