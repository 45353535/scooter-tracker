package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f51603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f51604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f51605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f51606d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f51603a = d0Var;
        this.f51604b = gVar;
        this.f51605c = list;
        this.f51606d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.f51605c;
    }

    public d0 c() {
        return this.f51603a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f51603a.equals(qVar.f51603a) && this.f51604b.equals(qVar.f51604b) && this.f51605c.equals(qVar.f51605c) && this.f51606d.equals(qVar.f51606d);
    }

    public int hashCode() {
        return ((((((this.f51603a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f51604b.hashCode()) * 31) + this.f51605c.hashCode()) * 31) + this.f51606d.hashCode();
    }

    public g a() {
        return this.f51604b;
    }
}
