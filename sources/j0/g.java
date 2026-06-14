package j0;

import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f85449b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LruCache f85450a = new LruCache(20);

    g() {
    }

    public static g b() {
        return f85449b;
    }

    public d0.i a(String str) {
        if (str == null) {
            return null;
        }
        return (d0.i) this.f85450a.get(str);
    }

    public void c(String str, d0.i iVar) {
        if (str == null) {
            return;
        }
        this.f85450a.put(str, iVar);
    }
}
