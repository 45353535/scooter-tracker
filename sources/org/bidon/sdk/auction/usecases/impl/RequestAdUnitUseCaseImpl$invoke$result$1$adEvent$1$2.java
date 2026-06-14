package org.bidon.sdk.auction.usecases.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import org.bidon.sdk.adapter.AdEvent;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lorg/bidon/sdk/adapter/AdEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2", f = "RequestAdUnitUseCaseImpl.kt", l = {}, m = "invokeSuspend")
final class RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2 extends k implements Function2<AdEvent, Continuation, Object> {
    /* synthetic */ Object L$0;
    int label;

    RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2 requestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2 = new RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2(continuation);
        requestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2.L$0 = obj;
        return requestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        AdEvent adEvent = (AdEvent) this.L$0;
        return kotlin.coroutines.jvm.internal.b.a((adEvent instanceof AdEvent.Fill) || (adEvent instanceof AdEvent.LoadFailed) || (adEvent instanceof AdEvent.Expired));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdEvent adEvent, Continuation continuation) {
        return ((RequestAdUnitUseCaseImpl$invoke$result$1$adEvent$1$2) create(adEvent, continuation)).invokeSuspend(Unit.f93236a);
    }
}
