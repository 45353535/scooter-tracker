package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f21299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21300c;

    public e(String str, JSONArray jSONArray, long j10) {
        this.f21298a = str;
        this.f21299b = jSONArray;
        this.f21300c = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("Event Request: Hitting URL finished: %s, body: %s", this.f21298a, this.f21299b);
        if (exc == null) {
            IAlog.a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f21300c));
    }
}
