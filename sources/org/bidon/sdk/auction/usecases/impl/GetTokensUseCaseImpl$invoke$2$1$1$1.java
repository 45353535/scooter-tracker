package org.bidon.sdk.auction.usecases.impl;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.auction.AdTypeParam;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.auction.usecases.impl.GetTokensUseCaseImpl$invoke$2$1$1$1", f = "GetTokensUseCaseImpl.kt", l = {34}, m = "invokeSuspend")
final class GetTokensUseCaseImpl$invoke$2$1$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AdTypeParam $adTypeParam;
    final /* synthetic */ Adapter.Bidding $adapter;
    final /* synthetic */ long $tokenTimeout;
    Object L$0;
    int label;
    final /* synthetic */ GetTokensUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetTokensUseCaseImpl$invoke$2$1$1$1(Adapter.Bidding bidding, GetTokensUseCaseImpl getTokensUseCaseImpl, AdTypeParam adTypeParam, long j10, Continuation continuation) {
        super(2, continuation);
        this.$adapter = bidding;
        this.this$0 = getTokensUseCaseImpl;
        this.$adTypeParam = adTypeParam;
        this.$tokenTimeout = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetTokensUseCaseImpl$invoke$2$1$1$1(this.$adapter, this.this$0, this.$adTypeParam, this.$tokenTimeout, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            String demandId = this.$adapter.getDemandId().getDemandId();
            GetTokensUseCaseImpl getTokensUseCaseImpl = this.this$0;
            Adapter.Bidding bidding = this.$adapter;
            AdTypeParam adTypeParam = this.$adTypeParam;
            long j10 = this.$tokenTimeout;
            this.L$0 = demandId;
            this.label = 1;
            Object tokenInfo = getTokensUseCaseImpl.getTokenInfo(bidding, adTypeParam, j10, this);
            if (tokenInfo == objG) {
                return objG;
            }
            str = demandId;
            obj = tokenInfo;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            d.b(obj);
        }
        return TuplesKt.to(str, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GetTokensUseCaseImpl$invoke$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
