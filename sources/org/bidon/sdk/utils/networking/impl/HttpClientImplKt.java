package org.bidon.sdk.utils.networking.impl;

import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.bidon.sdk.utils.networking.NetworkSettings;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u001b\u0010\u0000\u001a\u00020\u00018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"jsonZipHttpClient", "Lorg/bidon/sdk/utils/networking/impl/HttpClientImpl;", "getJsonZipHttpClient", "()Lorg/bidon/sdk/utils/networking/impl/HttpClientImpl;", "jsonZipHttpClient$delegate", "Lkotlin/Lazy;", "RetryAfter", "", "TAG", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HttpClientImplKt {

    @NotNull
    private static final String RetryAfter = "Retry-After";

    @NotNull
    private static final String TAG = "HttpClient";

    @NotNull
    private static final Lazy jsonZipHttpClient$delegate = i.a(new Function0() { // from class: org.bidon.sdk.utils.networking.impl.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HttpClientImplKt.jsonZipHttpClient_delegate$lambda$2();
        }
    });

    @NotNull
    public static final HttpClientImpl getJsonZipHttpClient() {
        return (HttpClientImpl) jsonZipHttpClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpClientImpl jsonZipHttpClient_delegate$lambda$2() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("Content-Type", CollectionsKt.listOf("application/json; charset=UTF-8"));
        mapCreateMapBuilder.put("X-Bidon-Version", CollectionsKt.listOf("0.13.0"));
        String basicAuthHeader = NetworkSettings.INSTANCE.getBasicAuthHeader();
        if (basicAuthHeader != null) {
            mapCreateMapBuilder.put("Authorization", CollectionsKt.listOf("Basic " + basicAuthHeader));
        }
        return new HttpClientImpl(MapsKt.build(mapCreateMapBuilder), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
