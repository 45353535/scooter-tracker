package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.android.volley.u;
import com.android.volley.v;
import com.ironsource.Fb;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class l {

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f7584b;

        private b(String str, u uVar) {
            this.f7583a = str;
            this.f7584b = uVar;
        }
    }

    static void a(com.android.volley.n nVar, b bVar) throws u {
        r retryPolicy = nVar.getRetryPolicy();
        int timeoutMs = nVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f7584b);
            nVar.addMarker(String.format("%s-retry [timeout=%s]", bVar.f7583a, Integer.valueOf(timeoutMs)));
        } catch (u e10) {
            nVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.f7583a, Integer.valueOf(timeoutMs)));
            throw e10;
        }
    }

    static com.android.volley.k b(com.android.volley.n nVar, long j10, List list) {
        b.a cacheEntry = nVar.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.k(304, (byte[]) null, true, j10, list);
        }
        return new com.android.volley.k(304, cacheEntry.f7491a, true, j10, e.a(list, cacheEntry));
    }

    static byte[] c(InputStream inputStream, int i10, c cVar) throws Throwable {
        byte[] bArrA;
        m mVar = new m(cVar, i10);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    mVar.write(bArrA, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            v.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.b(bArrA);
                    mVar.close();
                    throw th;
                }
            }
            byte[] byteArray = mVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                v.e("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.b(bArrA);
            mVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    static void d(long j10, com.android.volley.n nVar, byte[] bArr, int i10) {
        if (v.f7589b || j10 > 3000) {
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", nVar, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i10), Integer.valueOf(nVar.getRetryPolicy().a()));
        }
    }

    static b e(com.android.volley.n nVar, IOException iOException, long j10, f fVar, byte[] bArr) throws s, com.android.volley.l {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new t());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + nVar.getUrl(), iOException);
        }
        if (fVar == null) {
            if (nVar.shouldRetryConnectionErrors()) {
                return new b("connection", new com.android.volley.l());
            }
            throw new com.android.volley.l(iOException);
        }
        int iD = fVar.d();
        v.c("Unexpected response code %d for %s", Integer.valueOf(iD), nVar.getUrl());
        if (bArr == null) {
            return new b("network", new com.android.volley.j());
        }
        com.android.volley.k kVar = new com.android.volley.k(iD, bArr, false, SystemClock.elapsedRealtime() - j10, fVar.c());
        if (iD == 401 || iD == 403) {
            return new b("auth", new com.android.volley.a(kVar));
        }
        if (iD >= 400 && iD <= 499) {
            throw new com.android.volley.d(kVar);
        }
        if (iD < 500 || iD > 599 || !nVar.shouldRetryServerErrors()) {
            throw new s(kVar);
        }
        return new b(Fb.f40907a, new s(kVar));
    }
}
