package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5648k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84568a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f84568a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84568a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
