package org.bidon.sdk.auction.usecases.models;

import androidx.collection.b;
import com.ironsource.X0;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "", "Idle", "ServerBiddingStarted", "NoBid", "FilledAd", "TimeoutReached", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult$FilledAd;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult$Idle;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult$NoBid;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult$ServerBiddingStarted;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult$TimeoutReached;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BiddingResult {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/BiddingResult$FilledAd;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "serverBiddingStartTs", "", "serverBiddingFinishTs", X0.f42007c, "", "Lorg/bidon/sdk/auction/models/AdUnit;", "results", "Lorg/bidon/sdk/auction/models/AuctionResult;", "<init>", "(JJLjava/util/List;Ljava/util/List;)V", "getServerBiddingStartTs", "()J", "getServerBiddingFinishTs", "getAdUnits", "()Ljava/util/List;", "getResults", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilledAd implements BiddingResult {

        @NotNull
        private final List<AdUnit> adUnits;

        @NotNull
        private final List<AuctionResult> results;
        private final long serverBiddingFinishTs;
        private final long serverBiddingStartTs;

        /* JADX WARN: Multi-variable type inference failed */
        public FilledAd(long j10, long j11, @NotNull List<AdUnit> adUnits, @NotNull List<? extends AuctionResult> results) {
            Intrinsics.checkNotNullParameter(adUnits, "adUnits");
            Intrinsics.checkNotNullParameter(results, "results");
            this.serverBiddingStartTs = j10;
            this.serverBiddingFinishTs = j11;
            this.adUnits = adUnits;
            this.results = results;
        }

        @NotNull
        public final List<AdUnit> getAdUnits() {
            return this.adUnits;
        }

        @NotNull
        public final List<AuctionResult> getResults() {
            return this.results;
        }

        public final long getServerBiddingFinishTs() {
            return this.serverBiddingFinishTs;
        }

        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/BiddingResult$Idle;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle implements BiddingResult {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/BiddingResult$NoBid;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "serverBiddingStartTs", "", "serverBiddingFinishTs", "<init>", "(JJ)V", "getServerBiddingStartTs", "()J", "getServerBiddingFinishTs", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoBid implements BiddingResult {
        private final long serverBiddingFinishTs;
        private final long serverBiddingStartTs;

        public NoBid(long j10, long j11) {
            this.serverBiddingStartTs = j10;
            this.serverBiddingFinishTs = j11;
        }

        public static /* synthetic */ NoBid copy$default(NoBid noBid, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = noBid.serverBiddingStartTs;
            }
            if ((i10 & 2) != 0) {
                j11 = noBid.serverBiddingFinishTs;
            }
            return noBid.copy(j10, j11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getServerBiddingFinishTs() {
            return this.serverBiddingFinishTs;
        }

        @NotNull
        public final NoBid copy(long serverBiddingStartTs, long serverBiddingFinishTs) {
            return new NoBid(serverBiddingStartTs, serverBiddingFinishTs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoBid)) {
                return false;
            }
            NoBid noBid = (NoBid) other;
            return this.serverBiddingStartTs == noBid.serverBiddingStartTs && this.serverBiddingFinishTs == noBid.serverBiddingFinishTs;
        }

        public final long getServerBiddingFinishTs() {
            return this.serverBiddingFinishTs;
        }

        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }

        public int hashCode() {
            return (b.a(this.serverBiddingStartTs) * 31) + b.a(this.serverBiddingFinishTs);
        }

        @NotNull
        public String toString() {
            return "NoBid(serverBiddingStartTs=" + this.serverBiddingStartTs + ", serverBiddingFinishTs=" + this.serverBiddingFinishTs + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/BiddingResult$ServerBiddingStarted;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "serverBiddingStartTs", "", "<init>", "(J)V", "getServerBiddingStartTs", "()J", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerBiddingStarted implements BiddingResult {
        private final long serverBiddingStartTs;

        public ServerBiddingStarted(long j10) {
            this.serverBiddingStartTs = j10;
        }

        public static /* synthetic */ ServerBiddingStarted copy$default(ServerBiddingStarted serverBiddingStarted, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = serverBiddingStarted.serverBiddingStartTs;
            }
            return serverBiddingStarted.copy(j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }

        @NotNull
        public final ServerBiddingStarted copy(long serverBiddingStartTs) {
            return new ServerBiddingStarted(serverBiddingStartTs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ServerBiddingStarted) && this.serverBiddingStartTs == ((ServerBiddingStarted) other).serverBiddingStartTs;
        }

        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }

        public int hashCode() {
            return b.a(this.serverBiddingStartTs);
        }

        @NotNull
        public String toString() {
            return "ServerBiddingStarted(serverBiddingStartTs=" + this.serverBiddingStartTs + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lorg/bidon/sdk/auction/usecases/models/BiddingResult$TimeoutReached;", "Lorg/bidon/sdk/auction/usecases/models/BiddingResult;", "serverBiddingStartTs", "", "serverBiddingFinishTs", "<init>", "(JLjava/lang/Long;)V", "getServerBiddingStartTs", "()J", "getServerBiddingFinishTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", MenuActionType.COPY, "(JLjava/lang/Long;)Lorg/bidon/sdk/auction/usecases/models/BiddingResult$TimeoutReached;", "equals", "", "other", "", "hashCode", "", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TimeoutReached implements BiddingResult {

        @Nullable
        private final Long serverBiddingFinishTs;
        private final long serverBiddingStartTs;

        public TimeoutReached(long j10, @Nullable Long l10) {
            this.serverBiddingStartTs = j10;
            this.serverBiddingFinishTs = l10;
        }

        public static /* synthetic */ TimeoutReached copy$default(TimeoutReached timeoutReached, long j10, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = timeoutReached.serverBiddingStartTs;
            }
            if ((i10 & 2) != 0) {
                l10 = timeoutReached.serverBiddingFinishTs;
            }
            return timeoutReached.copy(j10, l10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getServerBiddingFinishTs() {
            return this.serverBiddingFinishTs;
        }

        @NotNull
        public final TimeoutReached copy(long serverBiddingStartTs, @Nullable Long serverBiddingFinishTs) {
            return new TimeoutReached(serverBiddingStartTs, serverBiddingFinishTs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeoutReached)) {
                return false;
            }
            TimeoutReached timeoutReached = (TimeoutReached) other;
            return this.serverBiddingStartTs == timeoutReached.serverBiddingStartTs && Intrinsics.areEqual(this.serverBiddingFinishTs, timeoutReached.serverBiddingFinishTs);
        }

        @Nullable
        public final Long getServerBiddingFinishTs() {
            return this.serverBiddingFinishTs;
        }

        public final long getServerBiddingStartTs() {
            return this.serverBiddingStartTs;
        }

        public int hashCode() {
            int iA = b.a(this.serverBiddingStartTs) * 31;
            Long l10 = this.serverBiddingFinishTs;
            return iA + (l10 == null ? 0 : l10.hashCode());
        }

        @NotNull
        public String toString() {
            return "TimeoutReached(serverBiddingStartTs=" + this.serverBiddingStartTs + ", serverBiddingFinishTs=" + this.serverBiddingFinishTs + ")";
        }
    }
}
