package org.bidon.sdk.auction.usecases.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.AdUnit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lorg/bidon/sdk/auction/models/AuctionResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$result$1", f = "RequestAdUnitUseCaseImpl.kt", l = {57}, m = "invokeSuspend")
final class RequestAdUnitUseCaseImpl$invoke$result$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AdSource<AdAuctionParams> $adSource;
    final /* synthetic */ AdTypeParam $adTypeParam;
    final /* synthetic */ AdUnit $adUnit;
    final /* synthetic */ double $priceFloor;
    int label;
    final /* synthetic */ RequestAdUnitUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestAdUnitUseCaseImpl$invoke$result$1(AdSource<AdAuctionParams> adSource, AdUnit adUnit, AdTypeParam adTypeParam, double d10, RequestAdUnitUseCaseImpl requestAdUnitUseCaseImpl, Continuation continuation) {
        super(2, continuation);
        this.$adSource = adSource;
        this.$adUnit = adUnit;
        this.$adTypeParam = adTypeParam;
        this.$priceFloor = d10;
        this.this$0 = requestAdUnitUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestAdUnitUseCaseImpl$invoke$result$1(this.$adSource, this.$adUnit, this.$adTypeParam, this.$priceFloor, this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RequestAdUnitUseCaseImpl$invoke$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
