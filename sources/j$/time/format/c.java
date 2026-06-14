package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84617a;

    static {
        int[] iArr = new int[u.values().length];
        f84617a = iArr;
        try {
            iArr[u.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84617a[u.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f84617a[u.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f84617a[u.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
