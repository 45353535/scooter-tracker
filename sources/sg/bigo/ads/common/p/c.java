package sg.bigo.ads.common.p;

import android.content.Context;
import android.util.LruCache;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AtomicInteger f102668a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final LruCache<String, sg.bigo.ads.common.c> f102669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final LruCache<String, sg.bigo.ads.common.c> f102670c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f102673a = new c(0);
    }

    private c() {
        AtomicInteger atomicInteger = f102668a;
        this.f102669b = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.1
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(@NonNull String str, @NonNull sg.bigo.ads.common.c cVar) {
                return cVar.f102292a.getByteCount();
            }
        };
        this.f102670c = new LruCache<String, sg.bigo.ads.common.c>(atomicInteger.get()) { // from class: sg.bigo.ads.common.p.c.2
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(@NonNull String str, @NonNull sg.bigo.ads.common.c cVar) {
                return cVar.f102292a.getByteCount();
            }
        };
    }

    static c a(Context context) {
        AtomicInteger atomicInteger = f102668a;
        if (atomicInteger.get() == 0) {
            atomicInteger.set(p.c(context));
            sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "Total cache size: " + atomicInteger.get());
        }
        return a.f102673a;
    }

    /* synthetic */ c(byte b10) {
        this();
    }
}
