package com.mbridge.msdk.thrid.okhttp.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f51315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f51316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.e f51317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.d f51318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f51319e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f51320f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    private abstract class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final i f51321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f51322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected long f51323c;

        private b() {
            this.f51321a = new i(a.this.f51317c.b());
            this.f51323c = 0L;
        }

        protected final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f51319e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f51319e);
            }
            aVar.a(this.f51321a);
            a aVar2 = a.this;
            aVar2.f51319e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f51316b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f51323c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f51321a;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f51317c.b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f51323c += jB;
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }
    }

    private final class c implements r, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f51325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f51326b;

        c() {
            this.f51325a = new i(a.this.f51318d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f51326b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f51318d.a(j10);
            a.this.f51318d.a(IOUtils.LINE_SEPARATOR_WINDOWS);
            a.this.f51318d.a(cVar, j10);
            a.this.f51318d.a(IOUtils.LINE_SEPARATOR_WINDOWS);
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f51325a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f51326b) {
                return;
            }
            this.f51326b = true;
            a.this.f51318d.a("0\r\n\r\n");
            a.this.a(this.f51325a);
            a.this.f51319e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f51326b) {
                return;
            }
            a.this.f51318d.flush();
        }
    }

    private class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okhttp.s f51328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f51329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f51330g;

        d(com.mbridge.msdk.thrid.okhttp.s sVar) {
            super();
            this.f51329f = -1L;
            this.f51330g = true;
            this.f51328e = sVar;
        }

        private void d() throws IOException {
            if (this.f51329f != -1) {
                a.this.f51317c.c();
            }
            try {
                this.f51329f = a.this.f51317c.i();
                String strTrim = a.this.f51317c.c().trim();
                if (this.f51329f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f51329f + strTrim + "\"");
                }
                if (this.f51329f == 0) {
                    this.f51330g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f51315a.i(), this.f51328e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f51322b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f51330g) {
                return -1L;
            }
            long j11 = this.f51329f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f51330g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f51329f));
            if (jB != -1) {
                this.f51329f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51322b) {
                return;
            }
            if (this.f51330g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f51322b = true;
        }
    }

    private final class e implements r, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f51332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f51333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f51334c;

        e(long j10) {
            this.f51332a = new i(a.this.f51318d.b());
            this.f51334c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f51333b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f51334c) {
                a.this.f51318d.a(cVar, j10);
                this.f51334c -= j10;
                return;
            }
            throw new ProtocolException("expected " + this.f51334c + " bytes but received " + j10);
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f51332a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51333b) {
                return;
            }
            this.f51333b = true;
            if (this.f51334c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f51332a);
            a.this.f51319e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f51333b) {
                return;
            }
            a.this.f51318d.flush();
        }
    }

    private class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f51336e;

        f(long j10) throws IOException {
            super();
            this.f51336e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f51322b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f51336e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f51336e - jB;
            this.f51336e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51322b) {
                return;
            }
            if (this.f51336e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f51322b = true;
        }
    }

    private class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f51338e;

        g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f51322b) {
                throw new IllegalStateException("closed");
            }
            if (this.f51338e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f51338e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51322b) {
                return;
            }
            if (!this.f51338e) {
                a(false, null);
            }
            this.f51322b = true;
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f51315a = vVar;
        this.f51316b = gVar;
        this.f51317c = eVar;
        this.f51318d = dVar;
    }

    private String e() throws IOException {
        String strD = this.f51317c.d(this.f51320f);
        this.f51320f -= (long) strD.length();
        return strD;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.a(HttpHeaders.TRANSFER_ENCODING))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f51318d.flush();
    }

    public r c() {
        if (this.f51319e == 1) {
            this.f51319e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f51319e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f51316b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() throws IOException {
        if (this.f51319e != 4) {
            throw new IllegalStateException("state: " + this.f51319e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f51316b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f51319e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f51199a.a(aVar, strE);
        }
    }

    public s b(long j10) throws IOException {
        if (this.f51319e == 4) {
            this.f51319e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f51319e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.f51316b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f51316b;
        gVar.f51274f.responseBodyStart(gVar.f51273e);
        String strB = a0Var.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b(HttpHeaders.TRANSFER_ENCODING))) {
            return new h(strB, -1L, l.a(a(a0Var.s().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        if (jA != -1) {
            return new h(strB, jA, l.a(b(jA)));
        }
        return new h(strB, -1L, l.a(d()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f51318d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) throws IOException {
        if (this.f51319e == 0) {
            this.f51318d.a(str).a(IOUtils.LINE_SEPARATOR_WINDOWS);
            int iB = rVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                this.f51318d.a(rVar.a(i10)).a(": ").a(rVar.b(i10)).a(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f51318d.a(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f51319e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f51319e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        int i10 = this.f51319e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f51319e);
        }
        try {
            k kVarA = k.a(e());
            a0.a aVarA = new a0.a().a(kVarA.f51312a).a(kVarA.f51313b).a(kVarA.f51314c).a(f());
            if (z10 && kVarA.f51313b == 100) {
                return null;
            }
            if (kVarA.f51313b == 100) {
                this.f51319e = 3;
                return aVarA;
            }
            this.f51319e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f51316b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public com.mbridge.msdk.thrid.okio.r a(long j10) {
        if (this.f51319e == 1) {
            this.f51319e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f51319e);
    }

    public s a(com.mbridge.msdk.thrid.okhttp.s sVar) throws IOException {
        if (this.f51319e == 4) {
            this.f51319e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f51319e);
    }

    void a(i iVar) {
        t tVarG = iVar.g();
        iVar.a(t.f51776d);
        tVarG.a();
        tVarG.b();
    }
}
