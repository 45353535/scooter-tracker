package com.appodeal.ads.network;

import com.appodeal.ads.network.HttpClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001Jl\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\b0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/network/Networking;", "", "host", "", "getHost", "()Ljava/lang/String;", "enqueue", "Lkotlin/Result;", "Response", "Lcom/appodeal/ads/network/NetworkResponse;", "method", "Lcom/appodeal/ads/network/HttpClient$Method;", "path", "body", "", "connectTimeout", "", "readTimeout", "responseHandler", "Lcom/appodeal/ads/network/NetworkResponseHandler;", "useUniqueRequestId", "", "overrideUrl", "enqueue-tZkwj4A", "(Lcom/appodeal/ads/network/HttpClient$Method;Ljava/lang/String;[BJJLcom/appodeal/ads/network/NetworkResponseHandler;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Networking {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: enqueue-tZkwj4A$default, reason: not valid java name */
        public static /* synthetic */ Object m4434enqueuetZkwj4A$default(Networking networking, HttpClient.Method method, String str, byte[] bArr, long j10, long j11, NetworkResponseHandler networkResponseHandler, boolean z10, String str2, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                return networking.mo4433enqueuetZkwj4A(method, str, bArr, j10, j11, networkResponseHandler, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? null : str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue-tZkwj4A");
        }
    }

    /* JADX INFO: renamed from: enqueue-tZkwj4A */
    <Response extends NetworkResponse> Object mo4433enqueuetZkwj4A(HttpClient.Method method, String str, byte[] bArr, long j10, long j11, NetworkResponseHandler<Response> networkResponseHandler, boolean z10, String str2, Continuation continuation);

    String getHost();
}
