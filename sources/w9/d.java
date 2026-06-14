package w9;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f107666d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107669c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f107670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f107671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f107672c;

        public d d() {
            if (this.f107670a || !(this.f107671b || this.f107672c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f107670a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f107671b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f107672c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f107667a == dVar.f107667a && this.f107668b == dVar.f107668b && this.f107669c == dVar.f107669c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f107667a ? 1 : 0) << 2) + ((this.f107668b ? 1 : 0) << 1) + (this.f107669c ? 1 : 0);
    }

    private d(b bVar) {
        this.f107667a = bVar.f107670a;
        this.f107668b = bVar.f107671b;
        this.f107669c = bVar.f107672c;
    }
}
