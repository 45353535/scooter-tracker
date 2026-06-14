package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import hg.i;
import hg.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0013H\u0086\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionEventObserver {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final ByteStringDataSource iapTransactionStore;

    @NotNull
    private final MutableStateFlow isRunning;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {35, 36, 44}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<TransactionEventRequestOuterClass.TransactionEventRequest, Continuation, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = TransactionEventObserver.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(transactionEventRequest, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:34)|(1:(1:(1:(4:7|8|30|31)(2:9|10))(6:11|12|25|(1:27)|30|31))(1:13))(4:15|16|(1:18)|29)|19|20|35|21|(2:23|29)(5:24|25|(0)|30|31)) */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r13.set(r1, r12) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: UnityAdsNetworkException -> 0x00af, TRY_LEAVE, TryCatch #1 {UnityAdsNetworkException -> 0x00af, blocks: (B:25:0x0080, B:27:0x0088, B:21:0x0078), top: B:35:0x0078 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.d.b(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
            L14:
                r9 = r12
                goto Laf
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.L$0
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                kotlin.d.b(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                r9 = r12
                goto L80
            L28:
                kotlin.d.b(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                goto L5b
            L2c:
                kotlin.d.b(r13)
                java.lang.Object r13 = r12.L$0
                gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                java.lang.String r6 = "newBuilder()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                r1.setTransactionEventRequest(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                r12.label = r4     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                java.lang.Object r13 = r1.invoke(r13, r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                if (r13 != r0) goto L5b
                r9 = r12
                goto Lae
            L5b:
                r6 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                r12.L$0 = r6     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                r12.label = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L14
                r5 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                if (r13 != r0) goto L7f
                goto Lae
            L7f:
                r1 = r6
            L80:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                if (r13 == 0) goto Laf
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                com.google.protobuf.Timestamp r1 = r1.getTimestamp()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                com.google.protobuf.ByteString r1 = r1.toByteString()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                r3 = 0
                r9.L$0 = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                r9.label = r2     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                java.lang.Object r13 = r13.set(r1, r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Laf
                if (r13 != r0) goto Laf
            Lae:
                return r0
            Laf:
                kotlin.Unit r13 = kotlin.Unit.f93236a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull CoroutineScope scope, @NotNull TransactionEventRepository transactionEventRepository, @NotNull GatewayClient gatewayClient, @NotNull GetRequestPolicy getRequestPolicy, @NotNull ByteStringDataSource iapTransactionStore) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = l0.a(Boolean.FALSE);
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this.isRunning;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!mutableStateFlow.b(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        i.F(i.K(this.transactionEventRepository.getTransactionEvents(), new AnonymousClass2(null)), this.scope);
    }
}
