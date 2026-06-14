package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51692a;

    w(String str) {
        this.f51692a = str;
    }

    public static w a(String str) throws IOException {
        w wVar = HTTP_1_0;
        if (str.equals(wVar.f51692a)) {
            return wVar;
        }
        w wVar2 = HTTP_1_1;
        if (str.equals(wVar2.f51692a)) {
            return wVar2;
        }
        w wVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(wVar3.f51692a)) {
            return wVar3;
        }
        w wVar4 = HTTP_2;
        if (str.equals(wVar4.f51692a)) {
            return wVar4;
        }
        w wVar5 = SPDY_3;
        if (str.equals(wVar5.f51692a)) {
            return wVar5;
        }
        w wVar6 = QUIC;
        if (str.equals(wVar6.f51692a)) {
            return wVar6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f51692a;
    }
}
