package org.bidon.sdk.adapter;

import kotlin.Metadata;
import org.bidon.sdk.adapter.AdSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdProvider;", "", "Interstitial", "Banner", "Rewarded", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdProvider {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/adapter/AdProvider$Banner;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/adapter/AdProvider;", "banner", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Banner<T extends AdAuctionParams> extends AdProvider {
        @NotNull
        AdSource.Banner<T> banner();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/adapter/AdProvider;", "interstitial", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Interstitial<T extends AdAuctionParams> extends AdProvider {
        @NotNull
        AdSource.Interstitial<T> interstitial();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "T", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "Lorg/bidon/sdk/adapter/AdProvider;", "rewarded", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Rewarded<T extends AdAuctionParams> extends AdProvider {
        @NotNull
        AdSource.Rewarded<T> rewarded();
    }
}
