package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class h2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8979b;

    public h2(com.applovin.impl.sdk.k kVar) {
        this.f8978a = kVar;
        this.f8979b = kVar.O();
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f8978a.a(x4.T2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f8978a.a(x4.U2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f8978a.D().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (r0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8979b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f8978a.g().d(d2.Q, mapHashMap);
        return inputStream;
    }
}
