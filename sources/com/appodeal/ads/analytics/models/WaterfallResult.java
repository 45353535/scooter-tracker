package com.appodeal.ads.analytics.models;

import androidx.collection.a;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallResult;", "", LogConstants.EVENT_LOADED, "NoFill", "Lcom/appodeal/ads/analytics/models/WaterfallResult$Loaded;", "Lcom/appodeal/ads/analytics/models/WaterfallResult$NoFill;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WaterfallResult {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallResult$Loaded;", "Lcom/appodeal/ads/analytics/models/WaterfallResult;", "ecpm", "", "<init>", "(D)V", "getEcpm", "()D", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loaded implements WaterfallResult {
        private final double ecpm;

        public Loaded(double d10) {
            this.ecpm = d10;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = loaded.ecpm;
            }
            return loaded.copy(d10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getEcpm() {
            return this.ecpm;
        }

        public final Loaded copy(double ecpm) {
            return new Loaded(ecpm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Double.compare(this.ecpm, ((Loaded) other).ecpm) == 0;
        }

        public final double getEcpm() {
            return this.ecpm;
        }

        public int hashCode() {
            return a.a(this.ecpm);
        }

        public String toString() {
            return "Loaded(ecpm=" + this.ecpm + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/analytics/models/WaterfallResult$NoFill;", "Lcom/appodeal/ads/analytics/models/WaterfallResult;", "<init>", "()V", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoFill implements WaterfallResult {
        public static final NoFill INSTANCE = new NoFill();

        private NoFill() {
        }
    }
}
