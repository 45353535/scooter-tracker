package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HttpURLConnection f21323g;

    public j(HttpURLConnection httpURLConnection, int i10, FilterInputStream filterInputStream, Map map, String str) {
        this.f21323g = httpURLConnection;
        this.f21328a = i10;
        this.f21330c = filterInputStream;
        this.f21331d = map;
        this.f21332e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.f21323g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
        super.a();
    }
}
