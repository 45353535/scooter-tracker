package w;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f106910a;

    public a(h hVar) {
        this.f106910a = hVar;
    }

    @Override // w.g
    public MemoryCache.b b(MemoryCache.Key key) {
        return null;
    }

    @Override // w.g
    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.f106910a.c(key, bitmap, map, c0.a.a(bitmap));
    }

    @Override // w.g
    public void a(int i10) {
    }
}
