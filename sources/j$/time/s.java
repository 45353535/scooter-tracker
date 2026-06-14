package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f84693b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f84693b = iArr;
        try {
            iArr[j$.time.temporal.b.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84693b[j$.time.temporal.b.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f84693b[j$.time.temporal.b.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f84693b[j$.time.temporal.b.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f84693b[j$.time.temporal.b.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f84692a = iArr2;
        try {
            iArr2[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f84692a[j$.time.temporal.a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f84692a[j$.time.temporal.a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
