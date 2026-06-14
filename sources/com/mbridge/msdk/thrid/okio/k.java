package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements s, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f51748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f51749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51751d;

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f51748a = eVar;
        this.f51749b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f51750c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f51749b.getRemaining();
        this.f51750c -= remaining;
        this.f51748a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f51751d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f51749b.inflate(oVarB.f51765a, oVarB.f51767c, (int) Math.min(j10, 8192 - oVarB.f51767c));
                if (iInflate > 0) {
                    oVarB.f51767c += iInflate;
                    long j11 = iInflate;
                    cVar.f51733b += j11;
                    return j11;
                }
                if (!this.f51749b.finished() && !this.f51749b.needsDictionary()) {
                }
                h();
                if (oVarB.f51766b != oVarB.f51767c) {
                    return -1L;
                }
                cVar.f51732a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f51751d) {
            return;
        }
        this.f51749b.end();
        this.f51751d = true;
        this.f51748a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f51749b.needsInput()) {
            return false;
        }
        h();
        if (this.f51749b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f51748a.f()) {
            return true;
        }
        o oVar = this.f51748a.a().f51732a;
        int i10 = oVar.f51767c;
        int i11 = oVar.f51766b;
        int i12 = i10 - i11;
        this.f51750c = i12;
        this.f51749b.setInput(oVar.f51765a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f51748a.b();
    }
}
