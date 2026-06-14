package bd;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6263a;

        public a(int i10) {
            this.f6263a = i10;
        }

        public int a() {
            return this.f6263a;
        }

        @Override // bd.d
        public int a(int i10, int i11, int i12) {
            return kotlin.ranges.g.n((int) (i12 * (Math.min(i10, i11) / a())), 1, Math.max(1, i12));
        }
    }

    int a(int i10, int i11, int i12);
}
