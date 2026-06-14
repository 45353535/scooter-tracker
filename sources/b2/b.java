package b2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5801c = new b(1, "No internet connection");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5803b;

    public b(int i10, String str) {
        this.f5802a = i10;
        this.f5803b = str;
    }

    public static b a(String str) {
        return new b(3, str);
    }

    public static b b(String str) {
        return new b(6, str);
    }

    public static b e(String str) {
        return new b(4, str);
    }

    public static b f(String str) {
        return new b(0, str);
    }

    public static b g(String str) {
        return new b(7, str);
    }

    public static b h(String str) {
        return new b(2, str);
    }

    public static b i(String str) {
        return new b(5, str);
    }

    public static b j(String str, Throwable th2) {
        if (th2 != null) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(" - ");
                sb2.append(th2.getClass().getName());
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                return f(sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return f(str);
    }

    public int c() {
        return this.f5802a;
    }

    public String d() {
        return this.f5803b;
    }

    public String toString() {
        return String.format("(%s) %s", Integer.valueOf(this.f5802a), this.f5803b);
    }
}
