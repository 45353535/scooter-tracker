package ba;

import java.util.List;
import ka.r;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6002b;

    public e(j jVar, List list) {
        this.f6001a = jVar;
        this.f6002b = list;
    }

    @Override // ba.j
    public r.a a(g gVar, f fVar) {
        return new fa.b(this.f6001a.a(gVar, fVar), this.f6002b);
    }

    @Override // ba.j
    public r.a createPlaylistParser() {
        return new fa.b(this.f6001a.createPlaylistParser(), this.f6002b);
    }
}
