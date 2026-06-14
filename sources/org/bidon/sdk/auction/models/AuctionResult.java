package org.bidon.sdk.auction.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionResult;", "", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "getAdSource", "()Lorg/bidon/sdk/adapter/AdSource;", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "getRoundStatus", "()Lorg/bidon/sdk/stats/models/RoundStatus;", "Network", "Bidding", "AuctionFailed", "Lorg/bidon/sdk/auction/models/AuctionResult$AuctionFailed;", "Lorg/bidon/sdk/auction/models/AuctionResult$Bidding;", "Lorg/bidon/sdk/auction/models/AuctionResult$Network;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AuctionResult {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionResult$AuctionFailed;", "Lorg/bidon/sdk/auction/models/AuctionResult;", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "tokenInfo", "Lorg/bidon/sdk/auction/models/TokenInfo;", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "(Lorg/bidon/sdk/auction/models/AdUnit;Lorg/bidon/sdk/auction/models/TokenInfo;Lorg/bidon/sdk/stats/models/RoundStatus;)V", "getAdUnit", "()Lorg/bidon/sdk/auction/models/AdUnit;", "getTokenInfo", "()Lorg/bidon/sdk/auction/models/TokenInfo;", "getRoundStatus", "()Lorg/bidon/sdk/stats/models/RoundStatus;", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "getAdSource", "()Lorg/bidon/sdk/adapter/AdSource;", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuctionFailed implements AuctionResult {

        @NotNull
        private final AdUnit adUnit;

        @NotNull
        private final RoundStatus roundStatus;

        @Nullable
        private final TokenInfo tokenInfo;

        public AuctionFailed(@NotNull AdUnit adUnit, @Nullable TokenInfo tokenInfo, @NotNull RoundStatus roundStatus) {
            Intrinsics.checkNotNullParameter(adUnit, "adUnit");
            Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
            this.adUnit = adUnit;
            this.tokenInfo = tokenInfo;
            this.roundStatus = roundStatus;
        }

        @Override // org.bidon.sdk.auction.models.AuctionResult
        @NotNull
        public AdSource<?> getAdSource() {
            throw new IllegalStateException("unexpected");
        }

        @NotNull
        public final AdUnit getAdUnit() {
            return this.adUnit;
        }

        @Override // org.bidon.sdk.auction.models.AuctionResult
        @NotNull
        public RoundStatus getRoundStatus() {
            return this.roundStatus;
        }

        @Nullable
        public final TokenInfo getTokenInfo() {
            return this.tokenInfo;
        }

        @NotNull
        public String toString() {
            return "AuctionResult." + AuctionResultKt.getType(this.adUnit) + "(price=" + this.adUnit.getPricefloor() + ", roundStatus=" + getRoundStatus() + ", " + this.adUnit.getDemandId() + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionResult$Bidding;", "Lorg/bidon/sdk/auction/models/AuctionResult;", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "(Lorg/bidon/sdk/adapter/AdSource;Lorg/bidon/sdk/stats/models/RoundStatus;)V", "getAdSource", "()Lorg/bidon/sdk/adapter/AdSource;", "getRoundStatus", "()Lorg/bidon/sdk/stats/models/RoundStatus;", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bidding implements AuctionResult {

        @NotNull
        private final AdSource<?> adSource;

        @NotNull
        private final RoundStatus roundStatus;

        public Bidding(@NotNull AdSource<?> adSource, @NotNull RoundStatus roundStatus) {
            Intrinsics.checkNotNullParameter(adSource, "adSource");
            Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
            this.adSource = adSource;
            this.roundStatus = roundStatus;
        }

        @Override // org.bidon.sdk.auction.models.AuctionResult
        @NotNull
        public AdSource<?> getAdSource() {
            return this.adSource;
        }

        @Override // org.bidon.sdk.auction.models.AuctionResult
        @NotNull
        public RoundStatus getRoundStatus() {
            return this.roundStatus;
        }

        @NotNull
        public String toString() {
            return "AuctionResult.Bidding(price=" + getAdSource().getStats().getPrice() + ", roundStatus=" + getRoundStatus() + ", " + getAdSource().getDemandId() + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/auction/models/AuctionResult$Network;", "Lorg/bidon/sdk/auction/models/AuctionResult;", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "(Lorg/bidon/sdk/adapter/AdSource;Lorg/bidon/sdk/stats/models/RoundStatus;)V", "getAdSource", "()Lorg/bidon/sdk/adapter/AdSource;", "getRoundStatus", "()Lorg/bidon/sdk/stats/models/RoundStatus;", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Network implements AuctionResult {

        @NotNull
        private final AdSource<?> adSource;

        @NotNull
        private final RoundStatus roundStatus;

        public Network(@NotNull AdSource<?> adSource, @NotNull RoundStatus roundStatus) {
            Intrinsics.checkNotNullParameter(adSource, "adSource");
            Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
            this.adSource = adSource;
            this.roundStatus = roundStatus;
        }

        @Override // org.bidon.sdk.auction.models.AuctionResult
        @NotNull
        public AdSource<?> getAdSource() {
            return this.adSource;
        }

        @Override // org.bidon.sdk.auction.models.AuctionResult
        @NotNull
        public RoundStatus getRoundStatus() {
            return this.roundStatus;
        }

        @NotNull
        public String toString() {
            return "AuctionResult.Network(price=" + getAdSource().getStats().getPrice() + ", roundStatus=" + getRoundStatus() + ", " + getAdSource().getDemandId() + ")";
        }
    }

    @NotNull
    AdSource<?> getAdSource();

    @NotNull
    RoundStatus getRoundStatus();
}
