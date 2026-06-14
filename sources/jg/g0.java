package jg;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f85873a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f85873a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
