package lb;

/* JADX INFO: loaded from: classes12.dex */
public interface t {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f94119a = new C1078a();

        /* JADX INFO: renamed from: lb.t$a$a, reason: collision with other inner class name */
        class C1078a implements a {
            C1078a() {
            }

            @Override // lb.t.a
            public boolean a(io.bidmachine.media3.common.a aVar) {
                return false;
            }

            @Override // lb.t.a
            public int b(io.bidmachine.media3.common.a aVar) {
                return 1;
            }

            @Override // lb.t.a
            public t c(io.bidmachine.media3.common.a aVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(io.bidmachine.media3.common.a aVar);

        int b(io.bidmachine.media3.common.a aVar);

        t c(io.bidmachine.media3.common.a aVar);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f94120c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f94121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f94122b;

        private b(long j10, boolean z10) {
            this.f94121a = j10;
            this.f94122b = z10;
        }

        public static b b() {
            return f94120c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, q9.l lVar);

    int getCueReplacementBehavior();

    k parseToLegacySubtitle(byte[] bArr, int i10, int i11);

    void reset();
}
