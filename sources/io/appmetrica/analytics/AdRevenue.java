package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.no;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class AdRevenue {

    @Nullable
    public final String adNetwork;

    @Nullable
    public final String adPlacementId;

    @Nullable
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;

    @Nullable
    public final AdType adType;

    @Nullable
    public final String adUnitId;

    @Nullable
    public final String adUnitName;

    @NonNull
    public final Currency currency;

    @Nullable
    public final Map<String, String> payload;

    @Nullable
    public final String precision;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BigDecimal f74845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Currency f74846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AdType f74847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f74848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f74849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f74850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f74851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f74852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f74853i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map f74854j;

        /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i10) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f74845a, this.f74846b, this.f74847c, this.f74848d, this.f74849e, this.f74850f, this.f74851g, this.f74852h, this.f74853i, this.f74854j, 0);
        }

        public Builder withAdNetwork(@Nullable String str) {
            this.f74848d = str;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String str) {
            this.f74851g = str;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String str) {
            this.f74852h = str;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.f74847c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String str) {
            this.f74849e = str;
            return this;
        }

        public Builder withAdUnitName(@Nullable String str) {
            this.f74850f = str;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> map) {
            this.f74854j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(@Nullable String str) {
            this.f74853i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f74845a = bigDecimal;
            this.f74846b = currency;
        }
    }

    /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i10) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(no.a(j10), currency, 0);
    }

    public static Builder newBuilder(double d10, @NonNull Currency currency) {
        return new Builder(new BigDecimal(no.a(d10)), currency, 0);
    }
}
