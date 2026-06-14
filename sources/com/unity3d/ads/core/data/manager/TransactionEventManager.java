package com.unity3d.ads.core.data.manager;

import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.vungle.ads.internal.protos.Sdk;
import eg.i;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import hg.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "billingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "getTransactionData", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getTransactionRequest", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "isBillingClientAvailable", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "productDetailsFetcher", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Lcom/unity3d/ads/core/domain/events/GetTransactionData;Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "onPurchasesReceived", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", PurchaseDatabaseHelper.TABLE_NAME, "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "transactionOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionEventManager {

    @NotNull
    public static final String BILLING_SERVICE_UNAVAILABLE = "Billing client is not available";

    @NotNull
    private static final String INAPP = "inapp";

    @NotNull
    private static final String SUBS = "subs";

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final GetTransactionData getTransactionData;

    @NotNull
    private final GetTransactionRequest getTransactionRequest;

    @NotNull
    private final ByteStringDataSource iapTransactionStore;

    @NotNull
    private final IsBillingClientAvailable isBillingClientAvailable;

    @NotNull
    private final Logger logger;

    @NotNull
    private final ProductDetailsFetcher productDetailsFetcher;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {163}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return TransactionEventManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            try {
            } catch (Exception e10) {
                TransactionEventManager.this.logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e10);
            }
            if (i10 == 0) {
                d.b(obj);
                if (!TransactionEventManager.this.billingClientAdapter.isInitialized()) {
                    final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
                    eVar.I();
                    transactionEventManager.billingClientAdapter.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1

                        @NotNull
                        private final MutableStateFlow hasBeenResumed = l0.a(Boolean.FALSE);

                        private final void tryResume() {
                            Object value;
                            Boolean bool;
                            if (eVar.isActive()) {
                                MutableStateFlow mutableStateFlow = this.hasBeenResumed;
                                do {
                                    value = mutableStateFlow.getValue();
                                    bool = (Boolean) value;
                                    bool.getClass();
                                } while (!mutableStateFlow.b(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                CancellableContinuation cancellableContinuation = eVar;
                                Result.Companion companion = Result.f93230c;
                                cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
                            }
                        }

                        private final void tryResumeWithException(Exception exception) {
                            Object value;
                            Boolean bool;
                            if (eVar.isActive()) {
                                MutableStateFlow mutableStateFlow = this.hasBeenResumed;
                                do {
                                    value = mutableStateFlow.getValue();
                                    bool = (Boolean) value;
                                    bool.getClass();
                                } while (!mutableStateFlow.b(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                CancellableContinuation cancellableContinuation = eVar;
                                Result.Companion companion = Result.f93230c;
                                cancellableContinuation.resumeWith(Result.b(d.a(exception)));
                            }
                        }

                        @NotNull
                        public final MutableStateFlow getHasBeenResumed() {
                            return this.hasBeenResumed;
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            tryResumeWithException(new TransactionException("Billing service disconnected"));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingSetupFinished(@NotNull BillingResultBridge billingResult) {
                            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                            if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                                tryResumeWithException(new TransactionException("Billing setup failed"));
                            } else {
                                tryResume();
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                        public void onIsAlreadyInitialized() {
                            tryResume();
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                        public void onPurchaseUpdated(@NotNull BillingResultBridge billingResult, @Nullable List<? extends PurchaseBridge> purchases) {
                            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                            transactionEventManager.onPurchasesReceived(billingResult, purchases, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                        }
                    });
                    Object objC = eVar.C();
                    if (objC == pf.b.g()) {
                        g.c(this);
                    }
                    if (objC == objG) {
                        return objG;
                    }
                }
                return Unit.f93236a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            if (TransactionEventManager.this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                BillingClientAdapter billingClientAdapter = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                billingClientAdapter.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager2, billingResultBridge, list);
                    }
                });
                BillingClientAdapter billingClientAdapter2 = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager3 = TransactionEventManager.this;
                billingClientAdapter2.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.b
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                    }
                });
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135, 148, 151}, m = "invokeSuspend")
    static final class C47771 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C47771(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, Continuation continuation) {
            super(2, continuation);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C47771(this.$purchases, this.this$0, this.$transactionOrigin, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(21:28|(1:30)|31|103|32|33|107|34|35|(1:38)|(2:109|40)(1:43)|44|(1:46)(1:47)|(2:53|(4:56|111|57|(5:59|60|99|61|(10:64|101|65|(0)|71|72|80|81|26|(2:82|(5:85|86|(0)|92|93))(0)))(7:70|71|72|80|81|26|(0)(0))))|75|105|76|77|81|26|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:59|60|99|61|(10:64|101|65|(0)|71|72|80|81|26|(2:82|(5:85|86|(0)|92|93))(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
        
            r12 = r5;
            r11 = r13;
            r13 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
        
            r14 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01c5, code lost:
        
            r6 = r3;
            r3 = r5;
            r9 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01d7, code lost:
        
            r14 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0238, code lost:
        
            if (r1 == r2) goto L90;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0170 A[Catch: Exception -> 0x01b1, TRY_LEAVE, TryCatch #7 {Exception -> 0x01b1, blocks: (B:57:0x0156, B:59:0x0170), top: B:111:0x0156 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x019b A[Catch: Exception -> 0x01d9, TryCatch #2 {Exception -> 0x01d9, blocks: (B:65:0x0195, B:67:0x019b, B:71:0x01b7), top: B:101:0x0195 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0191 -> B:101:0x0195). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01b3 -> B:71:0x01b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01d5 -> B:81:0x01e6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01d9 -> B:72:0x01c2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 585
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C47771.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47771) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public TransactionEventManager(@NotNull CoroutineScope scope, @Nullable BillingClientAdapter billingClientAdapter, @NotNull GetTransactionData getTransactionData, @NotNull GetTransactionRequest getTransactionRequest, @NotNull TransactionEventRepository transactionEventRepository, @NotNull ByteStringDataSource iapTransactionStore, @NotNull IsBillingClientAvailable isBillingClientAvailable, @NotNull SessionRepository sessionRepository, @NotNull ProductDetailsFetcher productDetailsFetcher, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(getTransactionData, "getTransactionData");
        Intrinsics.checkNotNullParameter(getTransactionRequest, "getTransactionRequest");
        Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        Intrinsics.checkNotNullParameter(isBillingClientAvailable, "isBillingClientAvailable");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(productDetailsFetcher, "productDetailsFetcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.scope = scope;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        List<? extends PurchaseBridge> list;
        if (billingResult.getResponseCode() != BillingResultResponseCode.OK || (list = purchases) == null || list.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        i.d(this.scope, null, null, new C47771(purchases, this, transactionOrigin, null), 3, null);
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            Logger.DefaultImpls.trace$default(this.logger, BILLING_SERVICE_UNAVAILABLE, null, 2, null);
        } else {
            i.d(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
    }
}
