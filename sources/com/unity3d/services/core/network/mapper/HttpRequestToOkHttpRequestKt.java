package com.unity3d.services.core.network.mapper;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\u0006¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"", "body", "Lhh/a0;", "generateOkHttpBody", "(Ljava/lang/Object;)Lhh/a0;", "generateOkHttpProtobufBody", "Lcom/unity3d/services/core/network/model/HttpRequest;", "Lhh/t;", "generateOkHttpHeaders", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lhh/t;", "Lhh/z;", "toOkHttpRequest", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lhh/z;", "toOkHttpProtoRequest", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestToOkHttpRequestKt {
    private static final a0 generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            a0 a0VarCreate = a0.create(w.f("text/plain;charset=utf-8"), (byte[]) obj);
            Intrinsics.checkNotNullExpressionValue(a0VarCreate, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return a0VarCreate;
        }
        if (obj instanceof String) {
            a0 a0VarCreate2 = a0.create(w.f("text/plain;charset=utf-8"), (String) obj);
            Intrinsics.checkNotNullExpressionValue(a0VarCreate2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return a0VarCreate2;
        }
        a0 a0VarCreate3 = a0.create(w.f("text/plain;charset=utf-8"), "");
        Intrinsics.checkNotNullExpressionValue(a0VarCreate3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return a0VarCreate3;
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

    private static final a0 generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            a0 a0VarCreate = a0.create(w.f(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            Intrinsics.checkNotNullExpressionValue(a0VarCreate, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return a0VarCreate;
        }
        if (obj instanceof String) {
            a0 a0VarCreate2 = a0.create(w.f(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            Intrinsics.checkNotNullExpressionValue(a0VarCreate2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return a0VarCreate2;
        }
        a0 a0VarCreate3 = a0.create(w.f(CommonGatewayClient.HEADER_PROTOBUF), "");
        Intrinsics.checkNotNullExpressionValue(a0VarCreate3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return a0VarCreate3;
    }

    @NotNull
    public static final z toOkHttpProtoRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        z.a aVarN = new z.a().n(StringsKt.Q0(StringsKt.w1(httpRequest.getBaseURL(), IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + StringsKt.w1(httpRequest.getPath(), IOUtils.DIR_SEPARATOR_UNIX), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        z zVarB = aVarN.h(string, body != null ? generateOkHttpProtobufBody(body) : null).g(generateOkHttpHeaders(httpRequest)).b();
        Intrinsics.checkNotNullExpressionValue(zVarB, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return zVarB;
    }

    @NotNull
    public static final z toOkHttpRequest(@NotNull HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        z.a aVarN = new z.a().n(StringsKt.Q0(StringsKt.w1(httpRequest.getBaseURL(), IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + StringsKt.w1(httpRequest.getPath(), IOUtils.DIR_SEPARATOR_UNIX), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        z zVarB = aVarN.h(string, body != null ? generateOkHttpBody(body) : null).g(generateOkHttpHeaders(httpRequest)).b();
        Intrinsics.checkNotNullExpressionValue(zVarB, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return zVarB;
    }
}
