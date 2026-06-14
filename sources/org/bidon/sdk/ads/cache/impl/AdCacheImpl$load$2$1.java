package org.bidon.sdk.ads.cache.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.ads.cache.impl.AdCacheImpl$load$2$1", f = "AdCacheImpl.kt", l = {100}, m = "invokeSuspend")
final class AdCacheImpl$load$2$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AuctionInfo $auctionInfo;
    final /* synthetic */ Function2<AuctionResult, AuctionInfo, Unit> $onSuccess;
    final /* synthetic */ List<AuctionResult> $winners;
    int label;
    final /* synthetic */ AdCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdCacheImpl$load$2$1(AdCacheImpl adCacheImpl, List<? extends AuctionResult> list, Function2<? super AuctionResult, ? super AuctionInfo, Unit> function2, AuctionInfo auctionInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = adCacheImpl;
        this.$winners = list;
        this.$onSuccess = function2;
        this.$auctionInfo = auctionInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdCacheImpl$load$2$1(this.this$0, this.$winners, this.$onSuccess, this.$auctionInfo, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            AdCacheImpl adCacheImpl = this.this$0;
            List<AuctionResult> list = this.$winners;
            this.label = 1;
            obj = adCacheImpl.updateCache(list, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        AuctionResult auctionResult = (AuctionResult) obj;
        String str = this.this$0.tag;
        AdCacheImpl adCacheImpl2 = this.this$0;
        LogExtKt.logInfo(str, "Auction completed: " + adCacheImpl2.asString((List) adCacheImpl2.results.getValue()));
        this.this$0.isLoading.setValue(kotlin.coroutines.jvm.internal.b.a(false));
        if (auctionResult != null) {
            this.$onSuccess.invoke(auctionResult, this.$auctionInfo);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AdCacheImpl$load$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
