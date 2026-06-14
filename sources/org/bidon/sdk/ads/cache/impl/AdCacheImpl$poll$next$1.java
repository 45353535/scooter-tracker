package org.bidon.sdk.ads.cache.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import org.bidon.sdk.auction.models.AuctionResult;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lorg/bidon/sdk/auction/models/AuctionResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.ads.cache.impl.AdCacheImpl$poll$next$1", f = "AdCacheImpl.kt", l = {}, m = "invokeSuspend")
final class AdCacheImpl$poll$next$1 extends k implements Function2<List<? extends AuctionResult>, Continuation, Object> {
    /* synthetic */ Object L$0;
    int label;

    AdCacheImpl$poll$next$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        AdCacheImpl$poll$next$1 adCacheImpl$poll$next$1 = new AdCacheImpl$poll$next$1(continuation);
        adCacheImpl$poll$next$1.L$0 = obj;
        return adCacheImpl$poll$next$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(!((List) this.L$0).isEmpty());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AuctionResult> list, Continuation continuation) {
        return ((AdCacheImpl$poll$next$1) create(list, continuation)).invokeSuspend(Unit.f93236a);
    }
}
