package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84682a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f84682a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84682a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
