package rb;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lb.k;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class h implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f99411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f99412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f99413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f99414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f99415f;

    public h(c cVar, Map map, Map map2, Map map3) {
        this.f99411b = cVar;
        this.f99414e = map2;
        this.f99415f = map3;
        this.f99413d = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f99412c = cVar.j();
    }

    @Override // lb.k
    public List getCues(long j10) {
        return this.f99411b.h(j10, this.f99413d, this.f99414e, this.f99415f);
    }

    @Override // lb.k
    public long getEventTime(int i10) {
        return this.f99412c[i10];
    }

    @Override // lb.k
    public int getEventTimeCount() {
        return this.f99412c.length;
    }

    @Override // lb.k
    public int getNextEventTimeIndex(long j10) {
        int iD = o0.d(this.f99412c, j10, false, false);
        if (iD < this.f99412c.length) {
            return iD;
        }
        return -1;
    }
}
