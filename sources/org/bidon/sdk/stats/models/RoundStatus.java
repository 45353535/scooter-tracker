package org.bidon.sdk.stats.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0010\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus;", "", "code", "", "<init>", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Win", "Lose", "NoBid", "NoFill", "UnknownAdapter", "AdapterNotInitialized", "BidTimeoutReached", "FillTimeoutReached", "NetworkError", "IncorrectAdUnit", "NoAppropriateAdUnitId", "AuctionCancelled", "AdFormatNotSupported", "UnspecifiedException", "BelowPricefloor", "Successful", "Lorg/bidon/sdk/stats/models/RoundStatus$AdFormatNotSupported;", "Lorg/bidon/sdk/stats/models/RoundStatus$AdapterNotInitialized;", "Lorg/bidon/sdk/stats/models/RoundStatus$AuctionCancelled;", "Lorg/bidon/sdk/stats/models/RoundStatus$BelowPricefloor;", "Lorg/bidon/sdk/stats/models/RoundStatus$BidTimeoutReached;", "Lorg/bidon/sdk/stats/models/RoundStatus$FillTimeoutReached;", "Lorg/bidon/sdk/stats/models/RoundStatus$IncorrectAdUnit;", "Lorg/bidon/sdk/stats/models/RoundStatus$Lose;", "Lorg/bidon/sdk/stats/models/RoundStatus$NetworkError;", "Lorg/bidon/sdk/stats/models/RoundStatus$NoAppropriateAdUnitId;", "Lorg/bidon/sdk/stats/models/RoundStatus$NoBid;", "Lorg/bidon/sdk/stats/models/RoundStatus$NoFill;", "Lorg/bidon/sdk/stats/models/RoundStatus$Successful;", "Lorg/bidon/sdk/stats/models/RoundStatus$UnknownAdapter;", "Lorg/bidon/sdk/stats/models/RoundStatus$UnspecifiedException;", "Lorg/bidon/sdk/stats/models/RoundStatus$Win;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RoundStatus {

    @NotNull
    private final String code;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$AdFormatNotSupported;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdFormatNotSupported extends RoundStatus {

        @NotNull
        public static final AdFormatNotSupported INSTANCE = new AdFormatNotSupported();

        private AdFormatNotSupported() {
            super("AD_FORMAT_NOT_SUPPORTED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$AdapterNotInitialized;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdapterNotInitialized extends RoundStatus {

        @NotNull
        public static final AdapterNotInitialized INSTANCE = new AdapterNotInitialized();

        private AdapterNotInitialized() {
            super("ADAPTER_NOT_INITIALIZED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$AuctionCancelled;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuctionCancelled extends RoundStatus {

        @NotNull
        public static final AuctionCancelled INSTANCE = new AuctionCancelled();

        private AuctionCancelled() {
            super("AUCTION_CANCELLED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$BelowPricefloor;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BelowPricefloor extends RoundStatus {

        @NotNull
        public static final BelowPricefloor INSTANCE = new BelowPricefloor();

        private BelowPricefloor() {
            super("BELOW_PRICEFLOOR", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$BidTimeoutReached;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BidTimeoutReached extends RoundStatus {

        @NotNull
        public static final BidTimeoutReached INSTANCE = new BidTimeoutReached();

        private BidTimeoutReached() {
            super("BID_TIMEOUT_REACHED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$FillTimeoutReached;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FillTimeoutReached extends RoundStatus {

        @NotNull
        public static final FillTimeoutReached INSTANCE = new FillTimeoutReached();

        private FillTimeoutReached() {
            super("FILL_TIMEOUT_REACHED", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$IncorrectAdUnit;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IncorrectAdUnit extends RoundStatus {

        @Nullable
        private final String errorMessage;

        public IncorrectAdUnit(@Nullable String str) {
            super("INCORRECT_AD_UNIT", null);
            this.errorMessage = str;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$Lose;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Lose extends RoundStatus {

        @NotNull
        public static final Lose INSTANCE = new Lose();

        private Lose() {
            super("LOSE", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$NetworkError;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends RoundStatus {

        @NotNull
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super("NETWORK_ERROR", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$NoAppropriateAdUnitId;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAppropriateAdUnitId extends RoundStatus {

        @NotNull
        public static final NoAppropriateAdUnitId INSTANCE = new NoAppropriateAdUnitId();

        private NoAppropriateAdUnitId() {
            super("NO_APPROPRIATE_AD_UNIT_ID", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$NoBid;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoBid extends RoundStatus {

        @NotNull
        public static final NoBid INSTANCE = new NoBid();

        private NoBid() {
            super("NO_BID", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$NoFill;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoFill extends RoundStatus {

        @NotNull
        public static final NoFill INSTANCE = new NoFill();

        private NoFill() {
            super("NO_FILL", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$Successful;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Successful extends RoundStatus {

        @NotNull
        public static final Successful INSTANCE = new Successful();

        private Successful() {
            super("INTERNAL_STATUS", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$UnknownAdapter;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownAdapter extends RoundStatus {

        @NotNull
        public static final UnknownAdapter INSTANCE = new UnknownAdapter();

        private UnknownAdapter() {
            super("UNKNOWN_ADAPTER", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$UnspecifiedException;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnspecifiedException extends RoundStatus {

        @Nullable
        private final String errorMessage;

        public UnspecifiedException(@Nullable String str) {
            super("UNSPECIFIED_EXCEPTION", null);
            this.errorMessage = str;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/stats/models/RoundStatus$Win;", "Lorg/bidon/sdk/stats/models/RoundStatus;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Win extends RoundStatus {

        @NotNull
        public static final Win INSTANCE = new Win();

        private Win() {
            super("WIN", null);
        }
    }

    public /* synthetic */ RoundStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    private RoundStatus(String str) {
        this.code = str;
    }
}
