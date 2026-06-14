package com.unity3d.services.core.network.core;

import com.taurusx.tax.f.y;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import eg.g;
import hh.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lhh/x;", "client", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lhh/x;)V", "Lcom/unity3d/services/core/network/model/HttpRequest;", "request", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "", "withInputStream", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lhh/x;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHttp3Client implements HttpClient {

    @NotNull
    public static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";

    @NotNull
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";

    @NotNull
    private final x client;

    @NotNull
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", l = {134}, m = "execute")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttp3Client.this.execute(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    static final class C48561 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C48561(HttpRequest httpRequest, Continuation continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return OkHttp3Client.this.new C48561(this.$request, continuation);
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
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            OkHttp3Client okHttp3Client = OkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default(okHttp3Client, httpRequest, false, this, 2, null);
            return objExecute$default == objG ? objG : objExecute$default;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C48561) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public OkHttp3Client(@NotNull ISDKDispatchers dispatchers, @NotNull x client) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull com.unity3d.services.core.network.model.HttpRequest r11, final boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) g.e(this.dispatchers.getIo(), new C48561(request, null));
    }
}
