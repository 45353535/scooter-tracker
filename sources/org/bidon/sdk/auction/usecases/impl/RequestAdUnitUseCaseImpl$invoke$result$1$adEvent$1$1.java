package org.bidon.sdk.auction.usecases.impl;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lorg/bidon/sdk/adapter/AdEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1", f = "RequestAdUnitUseCaseImpl.kt", l = {}, m = "invokeSuspend")
final class RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1 extends k implements Function2<FlowCollector, Continuation, Object> {
    final /* synthetic */ AdSource<AdAuctionParams> $adSource;
    final /* synthetic */ AdAuctionParams $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1(AdSource<AdAuctionParams> adSource, AdAuctionParams adAuctionParams, Continuation continuation) {
        super(2, continuation);
        this.$adSource = adSource;
        this.$it = adAuctionParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1 requestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1 = new RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1(this.$adSource, this.$it, continuation);
        requestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1.L$0 = obj;
        return requestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        AdSource<AdAuctionParams> adSource = this.$adSource;
        AdAuctionParams adAuctionParams = this.$it;
        try {
            Result.Companion companion = Result.f93230c;
            adSource.markFillStarted(adAuctionParams.getAdUnit(), kotlin.coroutines.jvm.internal.b.b(adAuctionParams.getPrice()));
            adSource.load(adAuctionParams);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        AdAuctionParams adAuctionParams2 = this.$it;
        AdSource<AdAuctionParams> adSource2 = this.$adSource;
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logError("RequestAdUnitUseCase", "Loading failed(" + adAuctionParams2 + "): " + thG, thG);
            adSource2.emitEvent(new AdEvent.LoadFailed(new BidonError.NoFill(adSource2.getDemandId())));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
        return ((RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
    }
}
