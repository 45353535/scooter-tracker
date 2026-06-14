package ga;

import ga.f0;
import lb.t;
import n9.r;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends ga.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f72463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n9.r f72464i;

    @Override // ga.f0
    public void c(c0 c0Var) {
        ((u) c0Var).h();
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        n9.r mediaItem = getMediaItem();
        q9.a.e(mediaItem.f95455b);
        q9.a.f(mediaItem.f95455b.f95548b, "Externally loaded mediaItems require a MIME type.");
        r.h hVar = mediaItem.f95455b;
        return new u(hVar.f95547a, hVar.f95548b, null);
    }

    @Override // ga.f0
    public synchronized n9.r getMediaItem() {
        return this.f72464i;
    }

    @Override // ga.a, ga.f0
    public synchronized void h(n9.r rVar) {
        this.f72464i = rVar;
    }

    @Override // ga.a
    protected void v(s9.y yVar) {
        w(new f1(this.f72463h, true, false, false, null, getMediaItem()));
    }

    private v(n9.r rVar, long j10, t tVar) {
        this.f72464i = rVar;
        this.f72463h = j10;
    }

    @Override // ga.f0
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // ga.a
    protected void x() {
    }

    public static final class b implements f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f72465a;

        public b(long j10, t tVar) {
            this.f72465a = j10;
        }

        @Override // ga.f0.a
        public /* synthetic */ f0.a a(t.a aVar) {
            return e0.c(this, aVar);
        }

        @Override // ga.f0.a
        public /* synthetic */ f0.a b(int i10) {
            return e0.b(this, i10);
        }

        @Override // ga.f0.a
        public /* synthetic */ f0.a experimentalParseSubtitlesDuringExtraction(boolean z10) {
            return e0.a(this, z10);
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public v e(n9.r rVar) {
            return new v(rVar, this.f72465a, null);
        }

        @Override // ga.f0.a
        public f0.a c(ka.m mVar) {
            return this;
        }

        @Override // ga.f0.a
        public f0.a d(z9.z zVar) {
            return this;
        }
    }
}
