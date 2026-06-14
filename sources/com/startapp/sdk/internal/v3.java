package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class v3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f65369a;

    public v3(com.startapp.sdk.components.a aVar) {
        this.f65369a = aVar;
    }

    public static /* synthetic */ HttpClientConfig c() {
        MetaData metaDataE = MetaData.E();
        HttpClientConfig httpClientConfigX = metaDataE.x();
        if (httpClientConfigX == null) {
            httpClientConfigX = new HttpClientConfig();
        }
        httpClientConfigX.a(metaDataE.h0());
        httpClientConfigX.b(metaDataE.s());
        return httpClientConfigX;
    }

    @Override // com.startapp.sdk.internal.k7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q8 a() {
        com.startapp.sdk.components.a aVar = this.f65369a;
        return new q8(aVar.f64181h, new u3(this), aVar.f64177d, aVar.K, aVar.f64199z, new lb(new k7() { // from class: com.startapp.sdk.internal.en
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return v3.c();
            }
        }));
    }
}
