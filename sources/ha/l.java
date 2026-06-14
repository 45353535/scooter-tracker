package ha;

import ha.f;
import s9.x;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f73053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f.b f73054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private oa.h f73055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f73056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f73057n;

    public l(s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, f fVar) {
        super(gVar, kVar, 2, aVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f73053j = fVar;
    }

    @Override // ka.o.e
    public void cancelLoad() {
        this.f73057n = true;
    }

    public void e(f.b bVar) {
        this.f73054k = bVar;
    }

    @Override // ka.o.e
    public void load() {
        if (this.f73056m == 0) {
            this.f73053j.b(this.f73054k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            s9.k kVarE = this.f73005b.e(this.f73056m);
            x xVar = this.f73012i;
            oa.j jVar = new oa.j(xVar, kVarE.f99825g, xVar.b(kVarE));
            while (!this.f73057n && this.f73053j.a(jVar)) {
                try {
                } finally {
                    this.f73056m = jVar.getPosition() - this.f73005b.f99825g;
                    this.f73055l = this.f73053j.getChunkIndex();
                }
            }
        } finally {
            s9.j.a(this.f73012i);
        }
    }
}
