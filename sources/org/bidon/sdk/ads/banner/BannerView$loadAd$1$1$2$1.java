package org.bidon.sdk.ads.banner;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$loadAd$1$1$2$1", f = "BannerView.kt", l = {}, m = "invokeSuspend")
final class BannerView$loadAd$1$1$2$1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Ad $it;
    int label;
    final /* synthetic */ BannerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerView$loadAd$1$1$2$1(BannerView bannerView, Ad ad2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bannerView;
        this.$it = ad2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannerView$loadAd$1$1$2$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        BannerListener bannerListener = this.this$0.userListener;
        if (bannerListener != null) {
            Ad ad2 = this.$it;
            AuctionInfo auctionInfo = this.this$0.auctionInfo;
            if (auctionInfo == null) {
                throw new IllegalArgumentException("[AuctionInfo] should exist when action succeeds");
            }
            bannerListener.onAdLoaded(ad2, auctionInfo);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BannerView$loadAd$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
