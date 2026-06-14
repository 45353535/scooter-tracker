package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import com.ironsource.D5;
import com.ironsource.N6;
import com.taurusx.tax.f.y;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.EmptyResponseConverter;
import com.vungle.ads.internal.network.converters.JsonConverter;
import hh.a0;
import hh.e;
import hh.t;
import hh.u;
import hh.z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.v;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J/\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0017JM\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010$J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiImpl;", "Lcom/vungle/ads/internal/network/VungleApi;", "Lhh/e$a;", "okHttpClient", "<init>", "(Lhh/e$a;)V", "", N6.f41375d0, "path", "placementReferenceId", "", "headers", "Lhh/z$a;", "defaultBuilder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lhh/z$a;", "Lhh/u;", "defaultProtoBufBuilder", "(Ljava/lang/String;Lhh/u;)Lhh/z$a;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "body", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "(Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/model/CommonRequestBody;)Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "Ljava/lang/Void;", "ri", "url", "Lcom/vungle/ads/internal/network/HttpMethod;", "requestType", "Lhh/a0;", "requestBody", "pingTPAT", "(Ljava/lang/String;Ljava/lang/String;Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Lhh/a0;)Lcom/vungle/ads/internal/network/Call;", "sendMetrics", "(Ljava/lang/String;Ljava/lang/String;Lhh/a0;)Lcom/vungle/ads/internal/network/Call;", "sendErrors", "sendAdMarkup", "(Ljava/lang/String;Lhh/a0;)Lcom/vungle/ads/internal/network/Call;", "Lhh/e$a;", "getOkHttpClient$vungle_ads_release", "()Lhh/e$a;", "Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", "emptyResponseConverter", "Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleApiImpl implements VungleApi {

    @NotNull
    private static final String VUNGLE_VERSION = "7.1.0";

    @NotNull
    private final EmptyResponseConverter emptyResponseConverter;

    @NotNull
    private final e.a okHttpClient;

    @NotNull
    private static final kotlinx.serialization.json.b json = v.b(null, new Function1<kotlinx.serialization.json.e, Unit>() { // from class: com.vungle.ads.internal.network.VungleApiImpl$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kotlinx.serialization.json.e eVar) {
            invoke2(eVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull kotlinx.serialization.json.e Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }, 1, null);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            iArr[HttpMethod.GET.ordinal()] = 1;
            iArr[HttpMethod.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VungleApiImpl(@NotNull e.a okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new EmptyResponseConverter();
    }

    private final z.a defaultBuilder(String ua2, String path, String placementReferenceId, Map<String, String> headers) {
        z.a aVarA = new z.a().n(path).a("User-Agent", ua2).a("Vungle-Version", VUNGLE_VERSION).a("Content-Type", D5.L);
        if (headers != null) {
            aVarA.g(t.f73746c.g(headers));
        }
        if (placementReferenceId != null) {
            aVarA.a("X-Vungle-Placement-Ref-Id", placementReferenceId);
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            aVarA.a("X-VUNGLE-APP-VERSION", appVersion);
        }
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            aVarA.a("X-Vungle-App-Id", appId);
        }
        return aVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ z.a defaultBuilder$default(VungleApiImpl vungleApiImpl, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return vungleApiImpl.defaultBuilder(str, str2, str3, map);
    }

    private final z.a defaultProtoBufBuilder(String ua2, u path) {
        z.a aVarA = new z.a().m(path).a("User-Agent", ua2).a("Vungle-Version", VUNGLE_VERSION).a("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String appId = vungleHeader.getAppId();
        if (appId != null) {
            aVarA.a("X-Vungle-App-Id", appId);
        }
        String appVersion = vungleHeader.getAppVersion();
        if (appVersion != null) {
            aVarA.a("X-VUNGLE-APP-VERSION", appVersion);
        }
        return aVarA;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public Call<AdPayload> ads(@NotNull String ua2, @NotNull String path, @NotNull CommonRequestBody body) {
        List<String> placements;
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            kotlinx.serialization.json.b bVar = json;
            KSerializer kSerializerB = ug.v.b(bVar.a(), v0.o(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String strB = bVar.b(kSerializerB, body);
            CommonRequestBody.RequestParam request = body.getRequest();
            try {
                return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) CollectionsKt.firstOrNull((List) placements), null, 8, null).i(a0.Companion.h(strB, null)).b()), new JsonConverter(v0.o(AdPayload.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public Call<ConfigPayload> config(@NotNull String ua2, @NotNull String path, @NotNull CommonRequestBody body) {
        kotlinx.serialization.json.b bVar;
        KSerializer kSerializerB;
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            bVar = json;
            kSerializerB = ug.v.b(bVar.a(), v0.o(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        } catch (Exception unused) {
        }
        try {
            return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, null, null, 12, null).i(a0.Companion.h(bVar.b(kSerializerB, body), null)).b()), new JsonConverter(v0.o(ConfigPayload.class)));
        } catch (Exception unused2) {
            return null;
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: getOkHttpClient$vungle_ads_release, reason: from getter */
    public final e.a getOkHttpClient() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> pingTPAT(@NotNull String ua2, @NotNull String url, @NotNull HttpMethod requestType, @Nullable Map<String, String> headers, @Nullable a0 requestBody) {
        z zVarB;
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        z.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, url, null, headers, 4, null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1) {
            zVarB = aVarDefaultBuilder$default.d().b();
        } else {
            if (i10 != 2) {
                throw new m();
            }
            if (requestBody == null) {
                requestBody = a0.a.o(a0.Companion, new byte[0], null, 0, 0, 6, null);
            }
            zVarB = aVarDefaultBuilder$default.i(requestBody).b();
        }
        return new OkHttpCall(this.okHttpClient.a(zVarB), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public Call<Void> ri(@NotNull String ua2, @NotNull String path, @NotNull CommonRequestBody body) {
        kotlinx.serialization.json.b bVar;
        KSerializer kSerializerB;
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            bVar = json;
            kSerializerB = ug.v.b(bVar.a(), v0.o(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        } catch (Exception unused) {
        }
        try {
            return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, ua2, path, null, null, 12, null).i(a0.Companion.h(bVar.b(kSerializerB, body), null)).b()), this.emptyResponseConverter);
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> sendAdMarkup(@NotNull String path, @NotNull a0 requestBody) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.a(defaultBuilder$default(this, "debug", u.f73749k.d(path).j().a().toString(), null, null, 12, null).i(requestBody).b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> sendErrors(@NotNull String ua2, @NotNull String path, @NotNull a0 requestBody) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.a(defaultProtoBufBuilder(ua2, u.f73749k.d(path).j().a()).i(requestBody).b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public Call<Void> sendMetrics(@NotNull String ua2, @NotNull String path, @NotNull a0 requestBody) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.a(defaultProtoBufBuilder(ua2, u.f73749k.d(path).j().a()).i(requestBody).b()), this.emptyResponseConverter);
    }
}
