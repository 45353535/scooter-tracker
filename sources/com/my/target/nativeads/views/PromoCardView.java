package com.my.target.nativeads.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface PromoCardView {

    public static abstract class Card {
        @Nullable
        public String getCtaButtonText() {
            return null;
        }

        @Nullable
        public String getCurrency() {
            return null;
        }

        @Nullable
        public String getDescription() {
            return null;
        }

        @Nullable
        public String getDiscountText() {
            return null;
        }

        @Nullable
        public String getOldPriceText() {
            return null;
        }

        @Nullable
        public String getPriceText() {
            return null;
        }

        @Nullable
        public String getTitle() {
            return null;
        }
    }

    @NonNull
    MediaAdView getMediaAdView();

    @NonNull
    View getView();

    void setCard(@NonNull Card card);

    void setCtaOnClickListener(@Nullable View.OnClickListener onClickListener);
}
