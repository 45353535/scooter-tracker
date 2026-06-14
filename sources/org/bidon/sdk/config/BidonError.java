package org.bidon.sdk.config;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lorg/bidon/sdk/config/BidonError;", "", "<init>", "()V", "SdkNotInitialized", "AppKeyIsInvalid", "InternalServerSdkError", "NetworkError", "AuctionInProgress", "AuctionCancelled", "NoAuctionResults", "NoRoundResults", "NoContextFound", "NoBid", "AdNotReady", "NoAppropriateAdUnitId", "NoFill", "BidTimedOut", "FillTimedOut", "IncorrectAdUnit", "AdFormatIsNotSupported", LogConstants.EVENT_EXPIRED, "Unspecified", "Lorg/bidon/sdk/config/BidonError$AdFormatIsNotSupported;", "Lorg/bidon/sdk/config/BidonError$AdNotReady;", "Lorg/bidon/sdk/config/BidonError$AppKeyIsInvalid;", "Lorg/bidon/sdk/config/BidonError$AuctionCancelled;", "Lorg/bidon/sdk/config/BidonError$AuctionInProgress;", "Lorg/bidon/sdk/config/BidonError$BidTimedOut;", "Lorg/bidon/sdk/config/BidonError$Expired;", "Lorg/bidon/sdk/config/BidonError$FillTimedOut;", "Lorg/bidon/sdk/config/BidonError$IncorrectAdUnit;", "Lorg/bidon/sdk/config/BidonError$InternalServerSdkError;", "Lorg/bidon/sdk/config/BidonError$NetworkError;", "Lorg/bidon/sdk/config/BidonError$NoAppropriateAdUnitId;", "Lorg/bidon/sdk/config/BidonError$NoAuctionResults;", "Lorg/bidon/sdk/config/BidonError$NoBid;", "Lorg/bidon/sdk/config/BidonError$NoContextFound;", "Lorg/bidon/sdk/config/BidonError$NoFill;", "Lorg/bidon/sdk/config/BidonError$NoRoundResults;", "Lorg/bidon/sdk/config/BidonError$SdkNotInitialized;", "Lorg/bidon/sdk/config/BidonError$Unspecified;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BidonError extends Throwable {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/config/BidonError$AdFormatIsNotSupported;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "", "bannerFormat", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "<init>", "(Ljava/lang/String;Lorg/bidon/sdk/ads/banner/BannerFormat;)V", "getDemandId", "()Ljava/lang/String;", "getBannerFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdFormatIsNotSupported extends BidonError {

        @NotNull
        private final BannerFormat bannerFormat;

        @NotNull
        private final String demandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdFormatIsNotSupported(@NotNull String demandId, @NotNull BannerFormat bannerFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(demandId, "demandId");
            Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
            this.demandId = demandId;
            this.bannerFormat = bannerFormat;
        }

        @NotNull
        public final BannerFormat getBannerFormat() {
            return this.bannerFormat;
        }

        @NotNull
        public final String getDemandId() {
            return this.demandId;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$AdNotReady;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdNotReady extends BidonError {

        @NotNull
        public static final AdNotReady INSTANCE = new AdNotReady();

        private AdNotReady() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/BidonError$AppKeyIsInvalid;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", PglCryptUtils.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppKeyIsInvalid extends BidonError {

        @NotNull
        public static final AppKeyIsInvalid INSTANCE = new AppKeyIsInvalid();

        @NotNull
        private static final String message = "App key is invalid";

        private AppKeyIsInvalid() {
            super(null);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return message;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$AuctionCancelled;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuctionCancelled extends BidonError {

        @NotNull
        public static final AuctionCancelled INSTANCE = new AuctionCancelled();

        private AuctionCancelled() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$AuctionInProgress;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuctionInProgress extends BidonError {

        @NotNull
        public static final AuctionInProgress INSTANCE = new AuctionInProgress();

        private AuctionInProgress() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/BidonError$BidTimedOut;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BidTimedOut extends BidonError {

        @NotNull
        private final DemandId demandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BidTimedOut(@NotNull DemandId demandId) {
            super(null);
            Intrinsics.checkNotNullParameter(demandId, "demandId");
            this.demandId = demandId;
        }

        @NotNull
        public final DemandId getDemandId() {
            return this.demandId;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/BidonError$Expired;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Expired extends BidonError {

        @Nullable
        private final DemandId demandId;

        public Expired(@Nullable DemandId demandId) {
            super(null);
            this.demandId = demandId;
        }

        @Nullable
        public final DemandId getDemandId() {
            return this.demandId;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/BidonError$FillTimedOut;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FillTimedOut extends BidonError {

        @NotNull
        private final DemandId demandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FillTimedOut(@NotNull DemandId demandId) {
            super(null);
            Intrinsics.checkNotNullParameter(demandId, "demandId");
            this.demandId = demandId;
        }

        @NotNull
        public final DemandId getDemandId() {
            return this.demandId;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/config/BidonError$IncorrectAdUnit;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;Ljava/lang/String;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "getMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IncorrectAdUnit extends BidonError {

        @NotNull
        private final DemandId demandId;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectAdUnit(@NotNull DemandId demandId, @NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(demandId, "demandId");
            Intrinsics.checkNotNullParameter(message, "message");
            this.demandId = demandId;
            this.message = message;
        }

        @NotNull
        public final DemandId getDemandId() {
            return this.demandId;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/BidonError$InternalServerSdkError;", "Lorg/bidon/sdk/config/BidonError;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalServerSdkError extends BidonError {

        @Nullable
        private final String message;

        public InternalServerSdkError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NetworkError;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;Ljava/lang/String;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "getMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends BidonError {

        @Nullable
        private final DemandId demandId;

        @Nullable
        private final String message;

        public NetworkError(@Nullable DemandId demandId, @Nullable String str) {
            super(null);
            this.demandId = demandId;
            this.message = str;
        }

        @Nullable
        public final DemandId getDemandId() {
            return this.demandId;
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public /* synthetic */ NetworkError(DemandId demandId, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(demandId, (i10 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NoAppropriateAdUnitId;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAppropriateAdUnitId extends BidonError {

        @NotNull
        public static final NoAppropriateAdUnitId INSTANCE = new NoAppropriateAdUnitId();

        private NoAppropriateAdUnitId() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NoAuctionResults;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAuctionResults extends BidonError {

        @NotNull
        public static final NoAuctionResults INSTANCE = new NoAuctionResults();

        private NoAuctionResults() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NoBid;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoBid extends BidonError {

        @NotNull
        public static final NoBid INSTANCE = new NoBid();

        private NoBid() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NoContextFound;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoContextFound extends BidonError {

        @NotNull
        public static final NoContextFound INSTANCE = new NoContextFound();

        private NoContextFound() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NoFill;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoFill extends BidonError {

        @NotNull
        private final DemandId demandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoFill(@NotNull DemandId demandId) {
            super(null);
            Intrinsics.checkNotNullParameter(demandId, "demandId");
            this.demandId = demandId;
        }

        @NotNull
        public final DemandId getDemandId() {
            return this.demandId;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$NoRoundResults;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoRoundResults extends BidonError {

        @NotNull
        public static final NoRoundResults INSTANCE = new NoRoundResults();

        private NoRoundResults() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/config/BidonError$SdkNotInitialized;", "Lorg/bidon/sdk/config/BidonError;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SdkNotInitialized extends BidonError {

        @NotNull
        public static final SdkNotInitialized INSTANCE = new SdkNotInitialized();

        private SdkNotInitialized() {
            super(null);
        }
    }

    public /* synthetic */ BidonError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/config/BidonError$Unspecified;", "Lorg/bidon/sdk/config/BidonError;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "cause", "", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Lorg/bidon/sdk/adapter/DemandId;Ljava/lang/Throwable;Ljava/lang/String;)V", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unspecified extends BidonError {

        @Nullable
        private final Throwable cause;

        @Nullable
        private final DemandId demandId;

        @NotNull
        private final String message;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Unspecified(DemandId demandId, Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            th2 = (i10 & 2) != 0 ? null : th2;
            if ((i10 & 4) != 0 && (th2 == null || (str = th2.getMessage()) == null)) {
                str = "NO_EXPLANATION_AVAILABLE";
            }
            this(demandId, th2, str);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Nullable
        public final DemandId getDemandId() {
            return this.demandId;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unspecified(@Nullable DemandId demandId, @Nullable Throwable th2, @NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.demandId = demandId;
            this.cause = th2;
            this.message = message;
        }
    }

    private BidonError() {
    }
}
