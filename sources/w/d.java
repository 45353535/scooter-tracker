package w;

import coil.memory.MemoryCache;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements MemoryCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f106914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f106915b;

    public d(g gVar, h hVar) {
        this.f106914a = gVar;
        this.f106915b = hVar;
    }

    @Override // coil.memory.MemoryCache
    public void a(int i10) {
        this.f106914a.a(i10);
        this.f106915b.a(i10);
    }

    @Override // coil.memory.MemoryCache
    public MemoryCache.b b(MemoryCache.Key key) {
        MemoryCache.b bVarB = this.f106914a.b(key);
        return bVarB == null ? this.f106915b.b(key) : bVarB;
    }

    @Override // coil.memory.MemoryCache
    public void c(MemoryCache.Key key, MemoryCache.b bVar) {
        this.f106914a.c(MemoryCache.Key.b(key, null, c0.c.b(key.getExtras()), 1, null), bVar.a(), c0.c.b(bVar.b()));
    }
}
