package org.bidon.sdk.stats.usecases;

import androidx.collection.a;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.stats.models.ImpressionRequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/stats/usecases/WinLossRequestData;", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "bodyKey", "", "getBodyKey", "()Ljava/lang/String;", "body", "Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "getBody", "()Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "Loss", "Win", "Lorg/bidon/sdk/stats/usecases/WinLossRequestData$Loss;", "Lorg/bidon/sdk/stats/usecases/WinLossRequestData$Win;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WinLossRequestData {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lorg/bidon/sdk/stats/usecases/WinLossRequestData$Loss;", "Lorg/bidon/sdk/stats/usecases/WinLossRequestData;", "winnerDemandId", "", "winnerPrice", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "body", "Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "<init>", "(Ljava/lang/String;DLorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/stats/models/ImpressionRequestBody;)V", "getWinnerDemandId", "()Ljava/lang/String;", "getWinnerPrice", "()D", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "getBody", "()Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "bodyKey", "getBodyKey", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loss implements WinLossRequestData {

        @NotNull
        private final ImpressionRequestBody body;

        @NotNull
        private final String bodyKey;

        @NotNull
        private final DemandAd demandAd;

        @NotNull
        private final String winnerDemandId;
        private final double winnerPrice;

        public Loss(@NotNull String winnerDemandId, double d10, @NotNull DemandAd demandAd, @NotNull ImpressionRequestBody body) {
            Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
            Intrinsics.checkNotNullParameter(demandAd, "demandAd");
            Intrinsics.checkNotNullParameter(body, "body");
            this.winnerDemandId = winnerDemandId;
            this.winnerPrice = d10;
            this.demandAd = demandAd;
            this.body = body;
            this.bodyKey = "bid";
        }

        public static /* synthetic */ Loss copy$default(Loss loss, String str, double d10, DemandAd demandAd, ImpressionRequestBody impressionRequestBody, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = loss.winnerDemandId;
            }
            if ((i10 & 2) != 0) {
                d10 = loss.winnerPrice;
            }
            if ((i10 & 4) != 0) {
                demandAd = loss.demandAd;
            }
            if ((i10 & 8) != 0) {
                impressionRequestBody = loss.body;
            }
            return loss.copy(str, d10, demandAd, impressionRequestBody);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getWinnerDemandId() {
            return this.winnerDemandId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getWinnerPrice() {
            return this.winnerPrice;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DemandAd getDemandAd() {
            return this.demandAd;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ImpressionRequestBody getBody() {
            return this.body;
        }

        @NotNull
        public final Loss copy(@NotNull String winnerDemandId, double winnerPrice, @NotNull DemandAd demandAd, @NotNull ImpressionRequestBody body) {
            Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
            Intrinsics.checkNotNullParameter(demandAd, "demandAd");
            Intrinsics.checkNotNullParameter(body, "body");
            return new Loss(winnerDemandId, winnerPrice, demandAd, body);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loss)) {
                return false;
            }
            Loss loss = (Loss) other;
            return Intrinsics.areEqual(this.winnerDemandId, loss.winnerDemandId) && Double.compare(this.winnerPrice, loss.winnerPrice) == 0 && Intrinsics.areEqual(this.demandAd, loss.demandAd) && Intrinsics.areEqual(this.body, loss.body);
        }

        @Override // org.bidon.sdk.stats.usecases.WinLossRequestData
        @NotNull
        public ImpressionRequestBody getBody() {
            return this.body;
        }

        @Override // org.bidon.sdk.stats.usecases.WinLossRequestData
        @NotNull
        public String getBodyKey() {
            return this.bodyKey;
        }

        @Override // org.bidon.sdk.stats.usecases.WinLossRequestData
        @NotNull
        public DemandAd getDemandAd() {
            return this.demandAd;
        }

        @NotNull
        public final String getWinnerDemandId() {
            return this.winnerDemandId;
        }

        public final double getWinnerPrice() {
            return this.winnerPrice;
        }

        public int hashCode() {
            return (((((this.winnerDemandId.hashCode() * 31) + a.a(this.winnerPrice)) * 31) + this.demandAd.hashCode()) * 31) + this.body.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loss(winnerDemandId=" + this.winnerDemandId + ", winnerPrice=" + this.winnerPrice + ", demandAd=" + this.demandAd + ", body=" + this.body + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/bidon/sdk/stats/usecases/WinLossRequestData$Win;", "Lorg/bidon/sdk/stats/usecases/WinLossRequestData;", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "body", "Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "<init>", "(Lorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/stats/models/ImpressionRequestBody;)V", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "getBody", "()Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "bodyKey", "", "getBodyKey", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Win implements WinLossRequestData {

        @NotNull
        private final ImpressionRequestBody body;

        @NotNull
        private final String bodyKey;

        @NotNull
        private final DemandAd demandAd;

        public Win(@NotNull DemandAd demandAd, @NotNull ImpressionRequestBody body) {
            Intrinsics.checkNotNullParameter(demandAd, "demandAd");
            Intrinsics.checkNotNullParameter(body, "body");
            this.demandAd = demandAd;
            this.body = body;
            this.bodyKey = "bid";
        }

        public static /* synthetic */ Win copy$default(Win win, DemandAd demandAd, ImpressionRequestBody impressionRequestBody, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                demandAd = win.demandAd;
            }
            if ((i10 & 2) != 0) {
                impressionRequestBody = win.body;
            }
            return win.copy(demandAd, impressionRequestBody);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DemandAd getDemandAd() {
            return this.demandAd;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ImpressionRequestBody getBody() {
            return this.body;
        }

        @NotNull
        public final Win copy(@NotNull DemandAd demandAd, @NotNull ImpressionRequestBody body) {
            Intrinsics.checkNotNullParameter(demandAd, "demandAd");
            Intrinsics.checkNotNullParameter(body, "body");
            return new Win(demandAd, body);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Win)) {
                return false;
            }
            Win win = (Win) other;
            return Intrinsics.areEqual(this.demandAd, win.demandAd) && Intrinsics.areEqual(this.body, win.body);
        }

        @Override // org.bidon.sdk.stats.usecases.WinLossRequestData
        @NotNull
        public ImpressionRequestBody getBody() {
            return this.body;
        }

        @Override // org.bidon.sdk.stats.usecases.WinLossRequestData
        @NotNull
        public String getBodyKey() {
            return this.bodyKey;
        }

        @Override // org.bidon.sdk.stats.usecases.WinLossRequestData
        @NotNull
        public DemandAd getDemandAd() {
            return this.demandAd;
        }

        public int hashCode() {
            return (this.demandAd.hashCode() * 31) + this.body.hashCode();
        }

        @NotNull
        public String toString() {
            return "Win(demandAd=" + this.demandAd + ", body=" + this.body + ")";
        }
    }

    @NotNull
    ImpressionRequestBody getBody();

    @NotNull
    String getBodyKey();

    @NotNull
    DemandAd getDemandAd();
}
