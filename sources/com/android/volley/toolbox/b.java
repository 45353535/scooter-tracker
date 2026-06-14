package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.android.volley.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final g f7545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f7546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f7547c;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    @Override // com.android.volley.h
    public com.android.volley.k a(com.android.volley.n nVar) throws u {
        IOException iOException;
        f fVar;
        byte[] bArr;
        com.android.volley.n nVar2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                f fVarA = this.f7546b.a(nVar, e.c(nVar.getCacheEntry()));
                try {
                    int iD = fVarA.d();
                    List listC = fVarA.c();
                    if (iD == 304) {
                        return l.b(nVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = fVarA.a();
                    byte[] bArrC = inputStreamA != null ? l.c(inputStreamA, fVarA.b(), this.f7547c) : new byte[0];
                    try {
                        l.d(SystemClock.elapsedRealtime() - jElapsedRealtime, nVar, bArrC, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        return new com.android.volley.k(iD, bArrC, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e10) {
                        e = e10;
                        nVar2 = nVar;
                        fVar = fVarA;
                        bArr = bArrC;
                        iOException = e;
                        l.a(nVar2, l.e(nVar2, iOException, jElapsedRealtime, fVar, bArr));
                        nVar = nVar2;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                    fVar = fVarA;
                    nVar2 = nVar;
                }
            } catch (IOException e12) {
                iOException = e12;
                fVar = null;
                bArr = null;
                nVar2 = nVar;
            }
            l.a(nVar2, l.e(nVar2, iOException, jElapsedRealtime, fVar, bArr));
            nVar = nVar2;
        }
    }

    public b(a aVar, c cVar) {
        this.f7546b = aVar;
        this.f7545a = aVar;
        this.f7547c = cVar;
    }
}
