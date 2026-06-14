package w;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f106916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f106917b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f106918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f106919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f106920c;

        public a(Bitmap bitmap, Map map, int i10) {
            this.f106918a = bitmap;
            this.f106919b = map;
            this.f106920c = i10;
        }

        public final Bitmap a() {
            return this.f106918a;
        }

        public final Map b() {
            return this.f106919b;
        }

        public final int c() {
            return this.f106920c;
        }
    }

    public static final class b extends LruCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f106921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, e eVar) {
            super(i10);
            this.f106921a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, MemoryCache.Key key, a aVar, a aVar2) {
            this.f106921a.f106916a.c(key, aVar.a(), aVar.b(), aVar.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int sizeOf(MemoryCache.Key key, a aVar) {
            return aVar.c();
        }
    }

    public e(int i10, h hVar) {
        this.f106916a = hVar;
        this.f106917b = new b(i10, this);
    }

    @Override // w.g
    public void a(int i10) {
        if (i10 >= 40) {
            e();
        } else {
            if (10 > i10 || i10 >= 20) {
                return;
            }
            this.f106917b.trimToSize(g() / 2);
        }
    }

    @Override // w.g
    public MemoryCache.b b(MemoryCache.Key key) {
        a aVar = (a) this.f106917b.get(key);
        if (aVar != null) {
            return new MemoryCache.b(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // w.g
    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int iA = c0.a.a(bitmap);
        if (iA <= f()) {
            this.f106917b.put(key, new a(bitmap, map, iA));
        } else {
            this.f106917b.remove(key);
            this.f106916a.c(key, bitmap, map, iA);
        }
    }

    public void e() {
        this.f106917b.evictAll();
    }

    public int f() {
        return this.f106917b.maxSize();
    }

    public int g() {
        return this.f106917b.size();
    }
}
