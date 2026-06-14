package org.bidon.sdk.auction.impl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.TokenInfo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$2", f = "GetAuctionRequestUseCaseImpl.kt", l = {64, 71}, m = "invokeSuspend")
final class GetAuctionRequestUseCaseImpl$request$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AdTypeParam $adTypeParam;
    final /* synthetic */ String $auctionId;
    final /* synthetic */ DemandAd $demandAd;
    final /* synthetic */ Map<String, TokenInfo> $tokens;
    int label;
    final /* synthetic */ GetAuctionRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAuctionRequestUseCaseImpl$request$2(AdTypeParam adTypeParam, GetAuctionRequestUseCaseImpl getAuctionRequestUseCaseImpl, String str, Map<String, TokenInfo> map, DemandAd demandAd, Continuation continuation) {
        super(2, continuation);
        this.$adTypeParam = adTypeParam;
        this.this$0 = getAuctionRequestUseCaseImpl;
        this.$auctionId = str;
        this.$tokens = map;
        this.$demandAd = demandAd;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetAuctionRequestUseCaseImpl$request$2(this.$adTypeParam, this.this$0, this.$auctionId, this.$tokens, this.$demandAd, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011a, code lost:
    
        if (r0 == r9) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GetAuctionRequestUseCaseImpl$request$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
