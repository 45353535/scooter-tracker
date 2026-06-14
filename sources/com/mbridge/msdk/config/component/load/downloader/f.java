package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f47078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f47079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f47081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47084g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f47086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f47087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f47088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f47090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47091g;

        public b() {
            this(null);
        }

        public b(f fVar) {
            this.f47085a = 20000L;
            this.f47086b = 10L;
            this.f47087c = 20000L;
            this.f47088d = 20000L;
            this.f47089e = 64;
            this.f47090f = 20;
            this.f47091g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(fVar)) {
                this.f47087c = fVar.c();
                this.f47085a = fVar.a();
                this.f47089e = fVar.f();
                this.f47088d = fVar.d();
                this.f47090f = fVar.g();
                this.f47086b = fVar.b();
                this.f47091g = fVar.e();
            }
        }

        public f a() {
            return new f(this);
        }

        public b a(int i10) {
            this.f47091g = i10;
            return this;
        }
    }

    public long a() {
        return this.f47078a;
    }

    public long b() {
        return this.f47079b;
    }

    public long c() {
        return this.f47080c;
    }

    public long d() {
        return this.f47081d;
    }

    public int e() {
        return this.f47084g;
    }

    public int f() {
        return this.f47082e;
    }

    public int g() {
        return this.f47083f;
    }

    private f(b bVar) {
        this.f47078a = bVar.f47085a;
        this.f47080c = bVar.f47087c;
        this.f47081d = bVar.f47088d;
        this.f47082e = bVar.f47089e;
        this.f47083f = bVar.f47090f;
        this.f47079b = bVar.f47086b;
        this.f47084g = bVar.f47091g;
    }
}
