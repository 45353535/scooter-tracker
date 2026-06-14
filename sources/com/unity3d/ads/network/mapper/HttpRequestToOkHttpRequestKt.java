package com.unity3d.ads.network.mapper;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import hh.a0;
import hh.t;
import hh.w;
import hh.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody;", "body", "Lhh/a0;", "generateOkHttpBody", "(Lcom/unity3d/ads/network/model/HttpBody;)Lhh/a0;", "Lcom/unity3d/ads/network/model/HttpRequest;", "Lhh/t;", "generateOkHttpHeaders", "(Lcom/unity3d/ads/network/model/HttpRequest;)Lhh/t;", "Lhh/z;", "toOkHttpRequest", "(Lcom/unity3d/ads/network/model/HttpRequest;)Lhh/z;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestToOkHttpRequestKt {
    private static final a0 generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            return a0.create(w.f("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            return a0.create(w.f("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new m();
    }

    private static final t generateOkHttpHeaders(HttpRequest httpRequest) {
        t.a aVar = new t.a();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            aVar.a(entry.getKey(), CollectionsKt.joinToString$default(entry.getValue(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        t tVarE = aVar.e();
        Intrinsics.checkNotNullExpressionValue(tVarE, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return tVarE;
    }

    @NotNull
    public static final z toOkHttpRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        z zVarB = new z.a().n(StringsKt.Q0(StringsKt.w1(httpRequest.getBaseURL(), IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + StringsKt.w1(httpRequest.getPath(), IOUtils.DIR_SEPARATOR_UNIX), "/")).h(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).g(generateOkHttpHeaders(httpRequest)).b();
        Intrinsics.checkNotNullExpressionValue(zVarB, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return zVarB;
    }
}
