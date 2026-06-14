package org.bidon.sdk.ads.cache.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.auction.models.AuctionResult;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lorg/bidon/sdk/adapter/AdEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.ads.cache.impl.AdCacheImpl$updateCache$4$1", f = "AdCacheImpl.kt", l = {}, m = "invokeSuspend")
final class AdCacheImpl$updateCache$4$1 extends k implements Function2<AdEvent, Continuation, Object> {
    final /* synthetic */ AuctionResult $auctionResult;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdCacheImpl$updateCache$4$1(AdCacheImpl adCacheImpl, AuctionResult auctionResult, Continuation continuation) {
        super(2, continuation);
        this.this$0 = adCacheImpl;
        this.$auctionResult = auctionResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        AdCacheImpl$updateCache$4$1 adCacheImpl$updateCache$4$1 = new AdCacheImpl$updateCache$4$1(this.this$0, this.$auctionResult, continuation);
        adCacheImpl$updateCache$4$1.L$0 = obj;
        return adCacheImpl$updateCache$4$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        if (((AdEvent) this.L$0) instanceof AdEvent.Expired) {
            MutableStateFlow mutableStateFlow = this.this$0.results;
            AuctionResult auctionResult = this.$auctionResult;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, CollectionsKt.minus((List) value, auctionResult)));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdEvent adEvent, Continuation continuation) {
        return ((AdCacheImpl$updateCache$4$1) create(adEvent, continuation)).invokeSuspend(Unit.f93236a);
    }
}
