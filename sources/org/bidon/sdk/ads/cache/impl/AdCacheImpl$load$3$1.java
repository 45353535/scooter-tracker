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
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.ads.cache.impl.AdCacheImpl$load$3$1", f = "AdCacheImpl.kt", l = {}, m = "invokeSuspend")
final class AdCacheImpl$load$3$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AuctionInfo $auctionInfo;
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ Function2<AuctionInfo, Throwable, Unit> $onFailure;
    int label;
    final /* synthetic */ AdCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdCacheImpl$load$3$1(AdCacheImpl adCacheImpl, Function2<? super AuctionInfo, ? super Throwable, Unit> function2, AuctionInfo auctionInfo, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = adCacheImpl;
        this.$onFailure = function2;
        this.$auctionInfo = auctionInfo;
        this.$cause = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdCacheImpl$load$3$1(this.this$0, this.$onFailure, this.$auctionInfo, this.$cause, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        String str = this.this$0.tag;
        AdCacheImpl adCacheImpl = this.this$0;
        LogExtKt.logInfo(str, "Auction failed: " + adCacheImpl.asString((List) adCacheImpl.results.getValue()));
        this.this$0.isLoading.setValue(kotlin.coroutines.jvm.internal.b.a(false));
        this.$onFailure.invoke(this.$auctionInfo, this.$cause);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AdCacheImpl$load$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
