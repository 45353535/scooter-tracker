package com.appodeal.ads.analytics.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallType;", "", "code", "", "getCode", "()Ljava/lang/String;", "Precache", "Main", "PostBid", "Lcom/appodeal/ads/analytics/models/WaterfallType$Main;", "Lcom/appodeal/ads/analytics/models/WaterfallType$PostBid;", "Lcom/appodeal/ads/analytics/models/WaterfallType$Precache;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WaterfallType {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallType$Main;", "Lcom/appodeal/ads/analytics/models/WaterfallType;", "<init>", "()V", "code", "", "getCode", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Main implements WaterfallType {
        public static final Main INSTANCE = new Main();
        private static final String code = "MAIN";

        private Main() {
        }

        @Override // com.appodeal.ads.analytics.models.WaterfallType
        public String getCode() {
            return code;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallType$PostBid;", "Lcom/appodeal/ads/analytics/models/WaterfallType;", "roundIndex", "", "<init>", "(I)V", "getRoundIndex", "()I", "code", "", "getCode", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PostBid implements WaterfallType {
        private final String code;
        private final int roundIndex;

        public PostBid(int i10) {
            this.roundIndex = i10;
            this.code = "POSTBID_" + i10;
        }

        public static /* synthetic */ PostBid copy$default(PostBid postBid, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = postBid.roundIndex;
            }
            return postBid.copy(i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRoundIndex() {
            return this.roundIndex;
        }

        public final PostBid copy(int roundIndex) {
            return new PostBid(roundIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostBid) && this.roundIndex == ((PostBid) other).roundIndex;
        }

        @Override // com.appodeal.ads.analytics.models.WaterfallType
        public String getCode() {
            return this.code;
        }

        public final int getRoundIndex() {
            return this.roundIndex;
        }

        public int hashCode() {
            return this.roundIndex;
        }

        public String toString() {
            return "PostBid(roundIndex=" + this.roundIndex + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallType$Precache;", "Lcom/appodeal/ads/analytics/models/WaterfallType;", "<init>", "()V", "code", "", "getCode", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Precache implements WaterfallType {
        public static final Precache INSTANCE = new Precache();
        private static final String code = "PRECACHE";

        private Precache() {
        }

        @Override // com.appodeal.ads.analytics.models.WaterfallType
        public String getCode() {
            return code;
        }
    }

    String getCode();
}
