package org.bidon.sdk.adapter;

import android.app.Activity;
import com.ironsource.C4424m2;
import kotlin.Metadata;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.stats.StatisticsCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0013\u0014\u0015J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\tH&J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lorg/bidon/sdk/adapter/AdSource;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/stats/StatisticsCollector;", "Lorg/bidon/sdk/adapter/impl/AdEventFlow;", "isAdReadyToShow", "", "()Z", "load", "", "adParams", "(Lorg/bidon/sdk/adapter/AdAuctionParams;)V", "destroy", "getAuctionParam", "Lkotlin/Result;", "auctionParamsScope", "Lorg/bidon/sdk/adapter/AdAuctionParamSource;", "getAuctionParam-IoAF18A", "(Lorg/bidon/sdk/adapter/AdAuctionParamSource;)Ljava/lang/Object;", "Interstitial", "Rewarded", "Banner", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdSource<T extends AdAuctionParams> extends StatisticsCollector, AdEventFlow {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/adapter/AdSource$Banner;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/adapter/AdSource;", "getAdView", "Lorg/bidon/sdk/adapter/AdViewHolder;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Banner<T extends AdAuctionParams> extends AdSource<T> {
        @Nullable
        AdViewHolder getAdView();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/adapter/AdSource;", C4424m2.f43623v, "", "activity", "Landroid/app/Activity;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Interstitial<T extends AdAuctionParams> extends AdSource<T> {
        void show(@NotNull Activity activity);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/adapter/AdSource;", C4424m2.f43623v, "", "activity", "Landroid/app/Activity;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Rewarded<T extends AdAuctionParams> extends AdSource<T> {
        void show(@NotNull Activity activity);
    }

    void destroy();

    @NotNull
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    Object mo4425getAuctionParamIoAF18A(@NotNull AdAuctionParamSource auctionParamsScope);

    boolean isAdReadyToShow();

    void load(@NotNull T adParams);
}
