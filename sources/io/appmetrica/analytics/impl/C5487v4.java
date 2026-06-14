package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5487v4 implements ArgumentsMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f78409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f78410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Location f78411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Boolean f78412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f78413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f78414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Integer f78415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Boolean f78416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Boolean f78417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f78418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Integer f78419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Boolean f78420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Boolean f78421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Boolean f78422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Set<String> f78423o;

    public C5487v4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f78409a = str;
        this.f78410b = bool;
        this.f78411c = location;
        this.f78412d = bool2;
        this.f78413e = num;
        this.f78414f = num2;
        this.f78415g = num3;
        this.f78416h = bool3;
        this.f78417i = bool4;
        this.f78418j = map;
        this.f78419k = num4;
        this.f78420l = bool5;
        this.f78421m = bool6;
        this.f78422n = bool7;
        this.f78423o = set;
    }

    public final boolean a(@NonNull C5487v4 c5487v4) {
        return equals(c5487v4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5487v4 mergeFrom(@NonNull C5487v4 c5487v4) {
        return new C5487v4((String) WrapUtils.getOrDefaultNullable(this.f78409a, c5487v4.f78409a), (Boolean) WrapUtils.getOrDefaultNullable(this.f78410b, c5487v4.f78410b), (Location) WrapUtils.getOrDefaultNullable(this.f78411c, c5487v4.f78411c), (Boolean) WrapUtils.getOrDefaultNullable(this.f78412d, c5487v4.f78412d), (Integer) WrapUtils.getOrDefaultNullable(this.f78413e, c5487v4.f78413e), (Integer) WrapUtils.getOrDefaultNullable(this.f78414f, c5487v4.f78414f), (Integer) WrapUtils.getOrDefaultNullable(this.f78415g, c5487v4.f78415g), (Boolean) WrapUtils.getOrDefaultNullable(this.f78416h, c5487v4.f78416h), (Boolean) WrapUtils.getOrDefaultNullable(this.f78417i, c5487v4.f78417i), (Map) WrapUtils.getOrDefaultNullable(this.f78418j, c5487v4.f78418j), (Integer) WrapUtils.getOrDefaultNullable(this.f78419k, c5487v4.f78419k), (Boolean) WrapUtils.getOrDefaultNullable(this.f78420l, c5487v4.f78420l), (Boolean) WrapUtils.getOrDefaultNullable(this.f78421m, c5487v4.f78421m), (Boolean) WrapUtils.getOrDefaultNullable(this.f78422n, c5487v4.f78422n), CollectionUtils.merge(this.f78423o, c5487v4.f78423o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C5487v4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C5487v4.class == obj.getClass()) {
            C5487v4 c5487v4 = (C5487v4) obj;
            if (Objects.equals(this.f78409a, c5487v4.f78409a) && Objects.equals(this.f78410b, c5487v4.f78410b) && Objects.equals(this.f78411c, c5487v4.f78411c) && Objects.equals(this.f78412d, c5487v4.f78412d) && Objects.equals(this.f78413e, c5487v4.f78413e) && Objects.equals(this.f78414f, c5487v4.f78414f) && Objects.equals(this.f78415g, c5487v4.f78415g) && Objects.equals(this.f78416h, c5487v4.f78416h) && Objects.equals(this.f78417i, c5487v4.f78417i) && Objects.equals(this.f78418j, c5487v4.f78418j) && Objects.equals(this.f78419k, c5487v4.f78419k) && Objects.equals(this.f78420l, c5487v4.f78420l) && Objects.equals(this.f78421m, c5487v4.f78421m) && Objects.equals(this.f78422n, c5487v4.f78422n) && Objects.equals(this.f78423o, c5487v4.f78423o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f78409a, this.f78410b, this.f78411c, this.f78412d, this.f78413e, this.f78414f, this.f78415g, this.f78416h, this.f78417i, this.f78418j, this.f78419k, this.f78420l, this.f78421m, this.f78422n, this.f78423o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f78409a + "', locationTracking=" + this.f78410b + ", manualLocation=" + this.f78411c + ", firstActivationAsUpdate=" + this.f78412d + ", sessionTimeout=" + this.f78413e + ", maxReportsCount=" + this.f78414f + ", dispatchPeriod=" + this.f78415g + ", logEnabled=" + this.f78416h + ", dataSendingEnabled=" + this.f78417i + ", clidsFromClient=" + this.f78418j + ", maxReportsInDbCount=" + this.f78419k + ", nativeCrashesEnabled=" + this.f78420l + ", revenueAutoTrackingEnabled=" + this.f78421m + ", advIdentifiersTrackingEnabled=" + this.f78422n + ", autoCollectedDataSubscribers=" + this.f78423o + '}';
    }

    public C5487v4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C5487v4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
