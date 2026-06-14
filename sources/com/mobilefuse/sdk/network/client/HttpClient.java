package com.mobilefuse.sdk.network.client;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.exception.Either;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J6\u0010\u0011\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpClient;", "", "get", "", "request", "Lcom/mobilefuse/sdk/network/client/HttpGetRequest;", "completeBlock", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "getSync", "headSync", IronSourceConstants.REQUEST_URL, "", "timeoutMillis", "", "post", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface HttpClient {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        public static /* synthetic */ Either headSync$default(HttpClient httpClient, String str, long j10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: headSync");
            }
            if ((i10 & 2) != 0) {
                j10 = 10000;
            }
            return httpClient.headSync(str, j10);
        }
    }

    void get(@NotNull HttpGetRequest request, @NotNull Function1<? super Either<? extends HttpError, HttpResponse>, Unit> completeBlock);

    @NotNull
    Either<HttpError, HttpResponse> getSync(@NotNull HttpGetRequest request);

    @NotNull
    Either<HttpError, HttpResponse> headSync(@NotNull String requestUrl, long timeoutMillis);

    void post(@NotNull HttpPostRequest<? extends HttpPostBody> request, @NotNull Function1<? super Either<? extends HttpError, HttpResponse>, Unit> completeBlock);
}
