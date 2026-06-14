package com.mobilefuse.sdk.network.client;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"defaultHttpClient", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "getDefaultHttpClient", "()Lcom/mobilefuse/sdk/network/client/HttpClient;", "defaultHttpClient$delegate", "Lkotlin/Lazy;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class HttpClientKt {

    @NotNull
    private static final Lazy defaultHttpClient$delegate = i.a(new Function0<AndroidHttpClient>() { // from class: com.mobilefuse.sdk.network.client.HttpClientKt$defaultHttpClient$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AndroidHttpClient invoke() {
            return new AndroidHttpClient();
        }
    });

    @NotNull
    public static final HttpClient getDefaultHttpClient() {
        return (HttpClient) defaultHttpClient$delegate.getValue();
    }
}
