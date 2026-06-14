package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.io.Closeable;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y f51050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w f51051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f51052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f51053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q f51054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final r f51055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b0 f51056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a0 f51057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a0 f51058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a0 f51059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f51060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f51061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile c f51062m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        y f51063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w f51064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f51065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f51066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        q f51067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        r.a f51068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        b0 f51069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        a0 f51070h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        a0 f51071i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        a0 f51072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f51073k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f51074l;

        public a() {
            this.f51065c = -1;
            this.f51068f = new r.a();
        }

        public a a(y yVar) {
            this.f51063a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f51068f.c(str, str2);
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f51070h = a0Var;
            return this;
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f51072j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f51056g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f51064b = wVar;
            return this;
        }

        public a a(int i10) {
            this.f51065c = i10;
            return this;
        }

        a(a0 a0Var) {
            this.f51065c = -1;
            this.f51063a = a0Var.f51050a;
            this.f51064b = a0Var.f51051b;
            this.f51065c = a0Var.f51052c;
            this.f51066d = a0Var.f51053d;
            this.f51067e = a0Var.f51054e;
            this.f51068f = a0Var.f51055f.a();
            this.f51069g = a0Var.f51056g;
            this.f51070h = a0Var.f51057h;
            this.f51071i = a0Var.f51058i;
            this.f51072j = a0Var.f51059j;
            this.f51073k = a0Var.f51060k;
            this.f51074l = a0Var.f51061l;
        }

        public a a(String str) {
            this.f51066d = str;
            return this;
        }

        public a b(long j10) {
            this.f51073k = j10;
            return this;
        }

        public a a(q qVar) {
            this.f51067e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f51068f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f51068f = rVar.a();
            return this;
        }

        public a a(b0 b0Var) {
            this.f51069g = b0Var;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f51071i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f51056g == null) {
                if (a0Var.f51057h == null) {
                    if (a0Var.f51058i == null) {
                        if (a0Var.f51059j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(long j10) {
            this.f51074l = j10;
            return this;
        }

        public a0 a() {
            if (this.f51063a != null) {
                if (this.f51064b != null) {
                    if (this.f51065c >= 0) {
                        if (this.f51066d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f51065c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    a0(a aVar) {
        this.f51050a = aVar.f51063a;
        this.f51051b = aVar.f51064b;
        this.f51052c = aVar.f51065c;
        this.f51053d = aVar.f51066d;
        this.f51054e = aVar.f51067e;
        this.f51055f = aVar.f51068f.a();
        this.f51056g = aVar.f51069g;
        this.f51057h = aVar.f51070h;
        this.f51058i = aVar.f51071i;
        this.f51059j = aVar.f51072j;
        this.f51060k = aVar.f51073k;
        this.f51061l = aVar.f51074l;
    }

    public String a(String str, String str2) {
        String strB = this.f51055f.b(str);
        return strB != null ? strB : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f51056g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public b0 d() {
        return this.f51056g;
    }

    public c h() {
        c cVar = this.f51062m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f51055f);
        this.f51062m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f51052c;
    }

    public q l() {
        return this.f51054e;
    }

    public r m() {
        return this.f51055f;
    }

    public boolean n() {
        int i10 = this.f51052c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f51053d;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.f51059j;
    }

    public long r() {
        return this.f51061l;
    }

    public y s() {
        return this.f51050a;
    }

    public long t() {
        return this.f51060k;
    }

    public String toString() {
        return "Response{protocol=" + this.f51051b + ", code=" + this.f51052c + ", message=" + this.f51053d + ", url=" + this.f51050a.g() + '}';
    }
}
