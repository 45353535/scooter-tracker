package com.google.firebase.sessions.settings;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.c0;
import yg.e2;
import yg.i;
import yg.i1;
import yg.t2;
import yg.x0;

/* JADX INFO: loaded from: classes9.dex */
@l
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\"¨\u0006="}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", MenuActionType.COPY, "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getSessionsEnabled", "b", "Ljava/lang/Double;", "getSessionSamplingRate", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/lang/Integer;", "getSessionTimeoutSeconds", "d", "getCacheDurationSeconds", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Long;", "getCacheUpdatedTimeSeconds", y.f66058y, "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean sessionsEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double sessionSamplingRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sessionTimeoutSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cacheDurationSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long cacheUpdatedTimeSeconds;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SessionConfigs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, t2 t2Var) {
        if (31 != (i10 & 31)) {
            e2.a(i10, 31, SessionConfigs$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d10, Integer num, Integer num2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sessionConfigs.sessionsEnabled;
        }
        if ((i10 & 2) != 0) {
            d10 = sessionConfigs.sessionSamplingRate;
        }
        if ((i10 & 4) != 0) {
            num = sessionConfigs.sessionTimeoutSeconds;
        }
        if ((i10 & 8) != 0) {
            num2 = sessionConfigs.cacheDurationSeconds;
        }
        if ((i10 & 16) != 0) {
            l10 = sessionConfigs.cacheUpdatedTimeSeconds;
        }
        Long l11 = l10;
        Integer num3 = num;
        return sessionConfigs.copy(bool, d10, num3, num2, l11);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionConfigs self, f output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, i.f118983a, self.sessionsEnabled);
        output.h(serialDesc, 1, c0.f118941a, self.sessionSamplingRate);
        x0 x0Var = x0.f119093a;
        output.h(serialDesc, 2, x0Var, self.sessionTimeoutSeconds);
        output.h(serialDesc, 3, x0Var, self.cacheDurationSeconds);
        output.h(serialDesc, 4, i1.f118988a, self.cacheUpdatedTimeSeconds);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean sessionsEnabled, @Nullable Double sessionSamplingRate, @Nullable Integer sessionTimeoutSeconds, @Nullable Integer cacheDurationSeconds, @Nullable Long cacheUpdatedTimeSeconds) {
        return new SessionConfigs(sessionsEnabled, sessionSamplingRate, sessionTimeoutSeconds, cacheDurationSeconds, cacheUpdatedTimeSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return Intrinsics.areEqual(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && Intrinsics.areEqual((Object) this.sessionSamplingRate, (Object) sessionConfigs.sessionSamplingRate) && Intrinsics.areEqual(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && Intrinsics.areEqual(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && Intrinsics.areEqual(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    @Nullable
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    @Nullable
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @Nullable
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    @Nullable
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d10, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }
}
