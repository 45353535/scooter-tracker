package id;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f74564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f74565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f74566c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f74567a = 0.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f74568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f74569c;

        public final j1 a() {
            return new j1(this.f74567a, this.f74568b, this.f74569c);
        }

        public final a b(boolean z10) {
            this.f74569c = z10;
            return this;
        }

        public final a c(boolean z10) {
            this.f74568b = z10;
            return this;
        }

        public final a d(float f10) {
            this.f74567a = f10;
            return this;
        }
    }

    public j1(float f10, boolean z10, boolean z11) {
        this.f74564a = f10;
        this.f74565b = z10;
        this.f74566c = z11;
    }

    public final float a() {
        return this.f74564a;
    }

    public final boolean b() {
        return this.f74566c;
    }

    public final boolean c() {
        return this.f74565b;
    }
}
