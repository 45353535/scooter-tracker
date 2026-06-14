package com.mobilefuse.sdk.network.client;

import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpError;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import lf.m;
import org.jetbrains.annotations.NotNull;
import uf.c;
import uf.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J6\u0010\u0012\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\u00040\bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/mobilefuse/sdk/network/client/AndroidHttpClient;", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "()V", "get", "", "request", "Lcom/mobilefuse/sdk/network/client/HttpGetRequest;", "completeBlock", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "getSync", "headSync", IronSourceConstants.REQUEST_URL, "", "timeoutMillis", "", "post", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
final class AndroidHttpClient implements HttpClient {

    /* JADX INFO: renamed from: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final class C46861 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $completeBlock;
        final /* synthetic */ HttpPostRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46861(HttpPostRequest httpPostRequest, Function1 function1) {
            super(0);
            this.$request = httpPostRequest;
            this.$completeBlock = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String strI;
            final Either errorResult;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                URLConnection uRLConnectionOpenConnection = new URL(this.$request.getUrl()).openConnection();
                if (uRLConnectionOpenConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout((int) this.$request.getTimeoutMillis());
                httpURLConnection.setReadTimeout((int) this.$request.getTimeoutMillis());
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                if (this.$request.getEmptyUserAgent()) {
                    httpURLConnection.setRequestProperty("User-Agent", "");
                }
                if (this.$request.getGzipEncoding()) {
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                }
                httpURLConnection.setRequestProperty("Content-Type", this.$request.getBody().getContentType());
                for (Map.Entry entry : MapsKt.plus(this.$request.getHeaders(), this.$request.getBody().getHeaders()).entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                byte[] content = this.$request.getBody().getContent();
                if (content == null) {
                    SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient$post$1$$special$$inlined$let$lambda$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.$completeBlock.invoke(new ErrorResult(new HttpError.UnknownError("Error with request body: content was null")));
                        }
                    });
                    return;
                }
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                if (this.$request.getGzipEncoding()) {
                    content = Gzip.gzip(content);
                }
                dataOutputStream.write(content);
                dataOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (responseCode == 200) {
                    InputStream inputStream = this.$request.getGzipEncoding() ? new GZIPInputStream(httpURLConnection.getInputStream()) : httpURLConnection.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                    try {
                        String strI2 = r.i(bufferedReader);
                        c.a(bufferedReader, null);
                        inputStream.close();
                        errorResult = new SuccessResult(new HttpResponse(strI2, responseCode, jCurrentTimeMillis, jCurrentTimeMillis2));
                    } finally {
                    }
                } else {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    BufferedReader bufferedReader2 = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192) : null;
                    if (bufferedReader2 != null) {
                        try {
                            strI = r.i(bufferedReader2);
                        } finally {
                        }
                    } else {
                        strI = null;
                    }
                    c.a(bufferedReader2, null);
                    errorResult = new ErrorResult(new HttpError.ConnectionError(responseCode, strI));
                }
                SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient.post.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C46861.this.$completeBlock.invoke(errorResult);
                    }
                });
            } catch (Throwable th2) {
                final HttpError connectionError = th2 instanceof FileNotFoundException ? new HttpError.ConnectionError(404, null, 2, null) : new HttpError.UnknownError(th2.getMessage());
                th2.printStackTrace();
                SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient.post.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C46861.this.$completeBlock.invoke(new ErrorResult(connectionError));
                    }
                });
            }
        }
    }

    @Override // com.mobilefuse.sdk.network.client.HttpClient
    public void get(@NotNull final HttpGetRequest request, @NotNull final Function1<? super Either<? extends HttpError, HttpResponse>, Unit> completeBlock) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(completeBlock, "completeBlock");
        SchedulersKt.runOnScheduler(Schedulers.IO, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient.get.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final Either<HttpError, HttpResponse> sync = AndroidHttpClient.this.getSync(request);
                SchedulersKt.runOnScheduler(Schedulers.MAIN, new Function0<Unit>() { // from class: com.mobilefuse.sdk.network.client.AndroidHttpClient.get.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        completeBlock.invoke(sync);
                    }
                });
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    @Override // com.mobilefuse.sdk.network.client.HttpClient
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mobilefuse.sdk.exception.Either<com.mobilefuse.sdk.network.client.HttpError, com.mobilefuse.sdk.network.client.HttpResponse> getSync(@org.jetbrains.annotations.NotNull com.mobilefuse.sdk.network.client.HttpGetRequest r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.network.client.AndroidHttpClient.getSync(com.mobilefuse.sdk.network.client.HttpGetRequest):com.mobilefuse.sdk.exception.Either");
    }

    @Override // com.mobilefuse.sdk.network.client.HttpClient
    @NotNull
    public Either<HttpError, HttpResponse> headSync(@NotNull String requestUrl, long timeoutMillis) {
        Either errorResult;
        Object value;
        long jCurrentTimeMillis;
        URLConnection uRLConnectionOpenConnection;
        String strI;
        Object errorResult2;
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            jCurrentTimeMillis = System.currentTimeMillis();
            uRLConnectionOpenConnection = new URL(requestUrl).openConnection();
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("HEAD");
        int i10 = (int) timeoutMillis;
        httpURLConnection.setConnectTimeout(i10);
        httpURLConnection.setReadTimeout(i10);
        int responseCode = httpURLConnection.getResponseCode();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (responseCode == 200) {
            errorResult2 = new SuccessResult(new HttpResponse("", responseCode, jCurrentTimeMillis, jCurrentTimeMillis2));
        } else {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192) : null;
            if (bufferedReader != null) {
                try {
                    strI = r.i(bufferedReader);
                } finally {
                }
            } else {
                strI = null;
            }
            c.a(bufferedReader, null);
            errorResult2 = new ErrorResult(new HttpError.ConnectionError(responseCode, strI));
        }
        errorResult = new SuccessResult(errorResult2);
        if (errorResult instanceof ErrorResult) {
            Throwable th3 = (Throwable) ((ErrorResult) errorResult).getValue();
            String message = th3.getMessage();
            Object connectionError = th3 instanceof FileNotFoundException ? new HttpError.ConnectionError(404, message) : th3 instanceof UnknownHostException ? new HttpError.ConnectionError(-1, message) : new HttpError.UnknownError(message);
            th3.printStackTrace();
            value = new ErrorResult(connectionError);
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Either) value;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpClient
    public void post(@NotNull HttpPostRequest<? extends HttpPostBody> request, @NotNull Function1<? super Either<? extends HttpError, HttpResponse>, Unit> completeBlock) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(completeBlock, "completeBlock");
        SchedulersKt.runOnScheduler(Schedulers.IO, new C46861(request, completeBlock));
    }
}
