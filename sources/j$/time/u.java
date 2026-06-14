package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f84728b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f84728b = iArr;
        try {
            iArr[j$.time.temporal.b.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84728b[j$.time.temporal.b.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f84728b[j$.time.temporal.b.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f84728b[j$.time.temporal.b.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f84728b[j$.time.temporal.b.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f84728b[j$.time.temporal.b.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f84727a = iArr2;
        try {
            iArr2[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f84727a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f84727a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f84727a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f84727a[j$.time.temporal.a.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
