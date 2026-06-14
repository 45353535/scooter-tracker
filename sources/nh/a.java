package nh;

import com.applovin.shadow.okhttp3.internal.Util;
import com.google.common.net.HttpHeaders;
import com.ironsource.D5;
import hh.a0;
import hh.b0;
import hh.c0;
import hh.m;
import hh.n;
import hh.v;
import hh.w;
import hh.z;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vh.r;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f96149a;

    public a(n cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f96149a = cookieJar;
    }

    private final String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.e());
            sb2.append(D5.T);
            sb2.append(mVar.g());
            i10 = i11;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // hh.v
    public b0 intercept(v.a chain) throws IOException {
        c0 c0VarM;
        Intrinsics.checkNotNullParameter(chain, "chain");
        z zVarRequest = chain.request();
        z.a aVarI = zVarRequest.i();
        a0 a0VarA = zVarRequest.a();
        if (a0VarA != null) {
            w wVarContentType = a0VarA.contentType();
            if (wVarContentType != null) {
                aVarI.f("Content-Type", wVarContentType.toString());
            }
            long jContentLength = a0VarA.contentLength();
            if (jContentLength != -1) {
                aVarI.f("Content-Length", String.valueOf(jContentLength));
                aVarI.j(HttpHeaders.TRANSFER_ENCODING);
            } else {
                aVarI.f(HttpHeaders.TRANSFER_ENCODING, "chunked");
                aVarI.j("Content-Length");
            }
        }
        boolean z10 = false;
        if (zVarRequest.d(HttpHeaders.HOST) == null) {
            aVarI.f(HttpHeaders.HOST, ih.d.S(zVarRequest.l(), false, 1, null));
        }
        if (zVarRequest.d("Connection") == null) {
            aVarI.f("Connection", HttpHeaders.KEEP_ALIVE);
        }
        if (zVarRequest.d(HttpHeaders.ACCEPT_ENCODING) == null && zVarRequest.d("Range") == null) {
            aVarI.f(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z10 = true;
        }
        List listA = this.f96149a.a(zVarRequest.l());
        if (!listA.isEmpty()) {
            aVarI.f(HttpHeaders.COOKIE, a(listA));
        }
        if (zVarRequest.d("User-Agent") == null) {
            aVarI.f("User-Agent", Util.userAgent);
        }
        b0 b0VarA = chain.a(aVarI.b());
        e.f(this.f96149a, zVarRequest.l(), b0VarA.R());
        b0.a aVarR = b0VarA.b0().r(zVarRequest);
        if (z10 && StringsKt.N("gzip", b0.M(b0VarA, "Content-Encoding", null, 2, null), true) && e.b(b0VarA) && (c0VarM = b0VarA.m()) != null) {
            r rVar = new r(c0VarM.getDelegateSource());
            aVarR.k(b0VarA.R().f().h("Content-Encoding").h("Content-Length").e());
            aVarR.b(new h(b0.M(b0VarA, "Content-Type", null, 2, null), -1L, x.d(rVar)));
        }
        return aVarR.c();
    }
}
