package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23945c;

    public d1(WebResourceRequest webResourceRequest) {
        this.f23943a = webResourceRequest.getUrl().toString();
        this.f23944b = webResourceRequest.getMethod();
        this.f23945c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f23943a.equals(d1Var.f23943a) && this.f23944b.equals(d1Var.f23944b)) {
            return this.f23945c.equals(d1Var.f23945c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23945c.hashCode() + ((this.f23944b.hashCode() + (this.f23943a.hashCode() * 31)) * 31);
    }
}
