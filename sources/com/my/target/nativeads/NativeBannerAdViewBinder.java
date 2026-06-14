package com.my.target.nativeads;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.IconAdView;

/* JADX INFO: loaded from: classes11.dex */
public interface NativeBannerAdViewBinder {
    @Nullable
    View getAdChoicesView();

    @NonNull
    View getAdvertisingView();

    @NonNull
    View getAgeRestrictionView();

    @Nullable
    View getCtaView();

    @NonNull
    View getDisclaimerView();

    @NonNull
    View getDomainView();

    @NonNull
    IconAdView getIconView();

    @NonNull
    ViewGroup getRootAdBannerView();

    @Nullable
    View getStarsRatingView();

    @Nullable
    View getTitleView();

    @Nullable
    View getVotesView();
}
