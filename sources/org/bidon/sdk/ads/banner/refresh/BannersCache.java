package org.bidon.sdk.ads.banner.refresh;

import android.app.Activity;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.BannerView;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.databinders.extras.Extras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001Jn\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000f2\u001a\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, d2 = {"Lorg/bidon/sdk/ads/banner/refresh/BannersCache;", "", "get", "", "activity", "Landroid/app/Activity;", "format", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "pricefloor", "", "auctionKey", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lorg/bidon/sdk/databinders/extras/Extras;", "onLoaded", "Lkotlin/Function3;", "Lorg/bidon/sdk/ads/Ad;", "Lorg/bidon/sdk/ads/AuctionInfo;", "Lorg/bidon/sdk/ads/banner/BannerView;", "onFailed", "Lkotlin/Function2;", "Lorg/bidon/sdk/config/BidonError;", "clear", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BannersCache {
    void clear();

    void get(@NotNull Activity activity, @NotNull BannerFormat format, double pricefloor, @Nullable String auctionKey, @NotNull Extras extras, @NotNull Function3<? super Ad, ? super AuctionInfo, ? super BannerView, Unit> onLoaded, @NotNull Function2<? super AuctionInfo, ? super BidonError, Unit> onFailed);
}
