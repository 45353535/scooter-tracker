package io.bidmachine.analytics.internal.w;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes12.dex */
public enum c {
    Get("GET"),
    Post("POST");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79984a;

    c(String str) {
        this.f79984a = str;
    }

    public final void a(URLConnection uRLConnection) throws ProtocolException {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f79984a);
        }
    }
}
