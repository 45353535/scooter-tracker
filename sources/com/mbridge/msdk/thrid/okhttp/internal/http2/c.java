package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f51353d = com.mbridge.msdk.thrid.okio.f.c(StringUtils.PROCESS_POSTFIX_DELIMITER);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f51354e = com.mbridge.msdk.thrid.okio.f.c(Header.RESPONSE_STATUS_UTF8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f51355f = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_METHOD_UTF8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f51356g = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_PATH_UTF8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f51357h = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_SCHEME_UTF8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f51358i = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f51359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f51360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f51361c;

    interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f51359a.equals(cVar.f51359a) && this.f51360b.equals(cVar.f51360b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f51359a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f51360b.hashCode();
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f51359a.m(), this.f51360b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f51359a = fVar;
        this.f51360b = fVar2;
        this.f51361c = fVar.j() + 32 + fVar2.j();
    }
}
