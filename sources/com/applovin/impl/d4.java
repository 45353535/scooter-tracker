package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class d4 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f8622c = new AtomicReference();

    public d4(com.applovin.impl.sdk.k kVar) {
        this.f8620a = kVar;
        this.f8621b = kVar.O();
    }

    private OkHttpClient a() {
        Object objBuild = this.f8622c.get();
        if (objBuild == null) {
            synchronized (this.f8622c) {
                try {
                    objBuild = this.f8622c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f8620a.a(x4.T2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f8620a.a(x4.U2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f8622c;
                        }
                        this.f8622c.set(objBuild);
                    }
                } finally {
                }
            }
        }
        if (objBuild == this.f8622c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f8620a.D().a("loadResource", str, iCode, responseExecute.message());
        if (r0.a(iCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8621b.a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f8620a.g().d(d2.Q, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
