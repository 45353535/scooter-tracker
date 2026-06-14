package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface POBBidEvent {

    public enum BidEventError {
        CLIENT_SIDE_AUCTION_LOSS("BidEventErrorClientSideAuctionLoss"),
        BID_EXPIRED("BidEventErrorBidExpired"),
        OTHER("BidEventErrorOther");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f62768a;

        BidEventError(String str) {
            this.f62768a = str;
        }

        @NonNull
        public String getErrorMessage() {
            return this.f62768a;
        }
    }

    @Nullable
    POBBid getBid();

    void proceedOnError(@NonNull BidEventError bidEventError, @NonNull String str);

    boolean proceedToLoadAd();

    void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener);
}
