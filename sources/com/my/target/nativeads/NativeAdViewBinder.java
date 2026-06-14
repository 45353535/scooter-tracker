package com.my.target.nativeads;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.PromoCardRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public interface NativeAdViewBinder {
    @Nullable
    View getAdChoicesView();

    @NonNull
    View getAdvertisingView();

    @NonNull
    View getAgeRestrictionView();

    @Nullable
    View getCtaView();

    @Nullable
    View getDescriptionView();

    @NonNull
    View getDisclaimerView();

    @NonNull
    View getDomainOrCategoryView();

    @NonNull
    IconAdView getIconView();

    @Nullable
    MediaAdView getMediaAdView();

    @Nullable
    PromoCardRecyclerView getPromoCardRecyclerView();

    @NonNull
    ViewGroup getRootAdView();

    @Nullable
    View getStarsRatingView();

    @Nullable
    View getTitleView();

    @Nullable
    View getVotesView();
}
