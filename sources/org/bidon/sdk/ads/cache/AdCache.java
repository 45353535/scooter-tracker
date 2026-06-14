package org.bidon.sdk.ads.cache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.AuctionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JF\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000b2\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000bH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\fH&J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH&J\u000e\u0010\u0012\u001a\u00020\fH¦@¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/ads/cache/AdCache;", "Lorg/bidon/sdk/ads/cache/Cacheable;", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", Reporting.EventType.CACHE, "", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "onSuccess", "Lkotlin/Function2;", "Lorg/bidon/sdk/auction/models/AuctionResult;", "Lorg/bidon/sdk/ads/AuctionInfo;", "onFailure", "", "peek", "pop", "poll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdCache extends Cacheable {
    void cache(@NotNull AdTypeParam adTypeParam, @NotNull Function2<? super AuctionResult, ? super AuctionInfo, Unit> onSuccess, @NotNull Function2<? super AuctionInfo, ? super Throwable, Unit> onFailure);

    void clear();

    @NotNull
    DemandAd getDemandAd();

    @Nullable
    AuctionResult peek();

    @Nullable
    Object poll(@NotNull Continuation continuation);

    @Nullable
    AuctionResult pop();
}
