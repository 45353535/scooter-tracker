package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o {
    public static final o NONE = new a();

    static class a extends o {
        a() {
        }
    }

    static class b implements c {
        b() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.o.c
        public o a(d dVar) {
            return o.this;
        }
    }

    public interface c {
        o a(d dVar);
    }

    static c factory(o oVar) {
        return oVar.new b();
    }

    public void callEnd(d dVar) {
    }

    public void callFailed(d dVar, IOException iOException) {
    }

    public void callStart(d dVar) {
    }

    public void connectEnd(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, w wVar) {
    }

    public void connectFailed(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, w wVar, IOException iOException) {
    }

    public void connectStart(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(d dVar, h hVar) {
    }

    public void connectionReleased(d dVar, h hVar) {
    }

    public void dnsEnd(d dVar, String str, List<InetAddress> list) {
    }

    public void dnsStart(d dVar, String str) {
    }

    public void requestBodyEnd(d dVar, long j10) {
    }

    public void requestBodyStart(d dVar) {
    }

    public void requestHeadersEnd(d dVar, y yVar) {
    }

    public void requestHeadersStart(d dVar) {
    }

    public void responseBodyEnd(d dVar, long j10) {
    }

    public void responseBodyStart(d dVar) {
    }

    public void responseHeadersEnd(d dVar, a0 a0Var) {
    }

    public void responseHeadersStart(d dVar) {
    }

    public void secureConnectEnd(d dVar, q qVar) {
    }

    public void secureConnectStart(d dVar) {
    }
}
