package com.unity3d.services.core.network.core;

import com.taurusx.tax.f.y;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import eg.g;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/core/network/core/LegacyHttpClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyHttpClient implements HttpClient {

    @NotNull
    private static final String NETWORK_CLIENT_LEGACY = "legacy";

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$execute$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ HttpRequest $request;
        final /* synthetic */ boolean $withInputStream;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HttpRequest httpRequest, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.$request = httpRequest;
            this.$withInputStream = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$request, this.$withInputStream, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            Object byteArrayInputStream;
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String strMakeRequest = webRequest.makeRequest();
            if (strMakeRequest == null) {
                strMakeRequest = "";
            }
            if (this.$withInputStream) {
                byte[] bytes = strMakeRequest.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                byteArrayInputStream = new ByteArrayInputStream(bytes);
            } else {
                byteArrayInputStream = strMakeRequest;
            }
            int responseCode = webRequest.getResponseCode();
            Map<String, List<String>> headers = webRequest.getHeaders();
            String string = webRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(headers, "headers");
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return new HttpResponse(byteArrayInputStream, responseCode, headers, string, null, LegacyHttpClient.NETWORK_CLIENT_LEGACY, 0L, 80, null);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1", f = "LegacyHttpClient.kt", l = {26}, m = "invokeSuspend")
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
            return LegacyHttpClient.this.new AnonymousClass1(this.$request, continuation);
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
            LegacyHttpClient legacyHttpClient = LegacyHttpClient.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default(legacyHttpClient, httpRequest, false, this, 2, null);
            return objExecute$default == objG ? objG : objExecute$default;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public LegacyHttpClient(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, boolean z10, @NotNull Continuation continuation) {
        return g.g(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, z10, null), continuation);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) g.e(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }
}
