package sg.bigo.ads.common.utils;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f102836a;

    public static void a(String str) {
        if (f102836a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b() {
        return f102836a;
    }

    public static void c() {
    }

    public static void a(boolean z10) {
        f102836a = z10;
    }

    public static boolean a() {
        return false;
    }
}
