package com.unity3d.services.core.network.core;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import eg.w0;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J!\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "engine", "Lorg/chromium/net/CronetEngine;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lorg/chromium/net/CronetEngine;Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "buildUrl", "", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "getContentSize", "", "info", "Lorg/chromium/net/UrlResponseInfo;", "getPriority", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "shutdown", "", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CronetClient implements HttpClient {

    @NotNull
    private static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";

    @NotNull
    private static final String NETWORK_CLIENT_CRONET = "cronet";

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final CronetEngine engine;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {37}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HttpRequest httpRequest, Continuation continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return CronetClient.this.new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            CronetClient cronetClient = CronetClient.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default(cronetClient, httpRequest, false, this, 2, null);
            return objExecute$default == objG ? objG : objExecute$default;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public CronetClient(@NotNull CronetEngine engine, @NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest request) {
        return StringsKt.Q0(StringsKt.w1(request.getBaseURL(), IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + StringsKt.w1(request.getPath(), IOUtils.DIR_SEPARATOR_UNIX), "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo info) {
        String str;
        Long lX;
        List<String> list = info.getAllHeaders().get("Content-Length");
        if (list == null || (str = list.get(0)) == null || (lX = StringsKt.x(str)) == null) {
            return -1L;
        }
        return lX.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int priority) {
        if (priority == 0) {
            return 4;
        }
        if (priority != 1) {
            return priority != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, final boolean z10, @NotNull Continuation continuation) {
        byte[] bytes;
        final PipedOutputStream pipedOutputStream = z10 ? new PipedOutputStream() : null;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(b.d(continuation), 1);
        eVar.I();
        UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(@Nullable UrlRequest request, @Nullable UrlResponseInfo info) throws IOException {
                super.onCanceled(request, info);
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                CancellableContinuation cancellableContinuation = eVar;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(d.a(networkTimeoutException)));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(@Nullable UrlRequest request, @Nullable UrlResponseInfo info, @Nullable CronetException error) throws IOException {
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkException networkException = error instanceof NetworkException ? (NetworkException) error : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, info != null ? Integer.valueOf(info.getHttpStatusCode()) : null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                CancellableContinuation cancellableContinuation = eVar;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(d.a(unityAdsNetworkException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull ByteBuffer byteBuffer) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                if (pipedOutputStream == null) {
                    super.onReadCompleted(request, info, byteBuffer);
                    return;
                }
                if (!atomicBoolean.getAndSet(true)) {
                    CancellableContinuation cancellableContinuation = eVar;
                    int httpStatusCode = info.getHttpStatusCode();
                    Map<String, List<String>> allHeaders = info.getAllHeaders();
                    String url = info.getUrl();
                    PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
                    String negotiatedProtocol = info.getNegotiatedProtocol();
                    long contentSize = this.getContentSize(info);
                    Intrinsics.checkNotNullExpressionValue(allHeaders, "allHeaders");
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "negotiatedProtocol");
                    cancellableContinuation.resumeWith(Result.b(new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
                }
                byteBuffer.flip();
                try {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    pipedOutputStream.write(bArr);
                } catch (IOException e10) {
                    DeviceLog.info("IOException during ByteBuffer read. Details: ", e10);
                }
                byteBuffer.clear();
                request.read(byteBuffer);
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull byte[] bodyBytes) throws IOException {
                PipedOutputStream pipedOutputStream2;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
                if (z10 && (pipedOutputStream2 = pipedOutputStream) != null) {
                    pipedOutputStream2.close();
                }
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                CancellableContinuation cancellableContinuation = eVar;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                String url = info.getUrl();
                String negotiatedProtocol = info.getNegotiatedProtocol();
                long contentSize = this.getContentSize(info);
                Intrinsics.checkNotNullExpressionValue(allHeaders, "allHeaders");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "negotiatedProtocol");
                cancellableContinuation.resumeWith(Result.b(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
            }
        }, w0.a(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bytes = ((String) httpRequest.getBody()).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes), w0.a(this.dispatchers.getIo()));
        }
        final UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        eVar.v(new Function1<Throwable, Unit>() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                urlRequestBuild.cancel();
            }
        });
        urlRequestBuild.start();
        Object objC = eVar.C();
        if (objC == b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) eg.g.e(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
