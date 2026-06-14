package com.google.firebase.sessions;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.c1;
import yg.e2;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes9.dex */
@ug.l
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001dR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001f¨\u00065"}, d2 = {"Lcom/google/firebase/sessions/SessionData;", "", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "Lcom/google/firebase/sessions/Time;", "backgroundTime", "", "", "Lcom/google/firebase/sessions/ProcessData;", "processDataMap", "<init>", "(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/google/firebase/sessions/SessionDetails;", "component2", "()Lcom/google/firebase/sessions/Time;", "component3", "()Ljava/util/Map;", MenuActionType.COPY, "(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)Lcom/google/firebase/sessions/SessionData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/firebase/sessions/SessionDetails;", "getSessionDetails", "b", "Lcom/google/firebase/sessions/Time;", "getBackgroundTime", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/util/Map;", "getProcessDataMap", y.f66058y, "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final KSerializer[] f33318d = {null, null, new c1(y2.f119104a, ProcessData$$serializer.INSTANCE)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SessionDetails sessionDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Time backgroundTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map processDataMap;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/SessionData;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SessionData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionData(int i10, SessionDetails sessionDetails, Time time, Map map, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionDetails = sessionDetails;
        if ((i10 & 2) == 0) {
            this.backgroundTime = null;
        } else {
            this.backgroundTime = time;
        }
        if ((i10 & 4) == 0) {
            this.processDataMap = null;
        } else {
            this.processDataMap = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionData copy$default(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sessionDetails = sessionData.sessionDetails;
        }
        if ((i10 & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i10 & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.copy(sessionDetails, time, map);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionData self, xg.f output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f33318d;
        output.F(serialDesc, 0, SessionDetails$$serializer.INSTANCE, self.sessionDetails);
        if (output.r(serialDesc, 1) || self.backgroundTime != null) {
            output.h(serialDesc, 1, Time$$serializer.INSTANCE, self.backgroundTime);
        }
        if (!output.r(serialDesc, 2) && self.processDataMap == null) {
            return;
        }
        output.h(serialDesc, 2, kSerializerArr[2], self.processDataMap);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    @Nullable
    public final Map<String, ProcessData> component3() {
        return this.processDataMap;
    }

    @NotNull
    public final SessionData copy(@NotNull SessionDetails sessionDetails, @Nullable Time backgroundTime, @Nullable Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, backgroundTime, processDataMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) other;
        return Intrinsics.areEqual(this.sessionDetails, sessionData.sessionDetails) && Intrinsics.areEqual(this.backgroundTime, sessionData.backgroundTime) && Intrinsics.areEqual(this.processDataMap, sessionData.processDataMap);
    }

    @Nullable
    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    @Nullable
    public final Map<String, ProcessData> getProcessDataMap() {
        return this.processDataMap;
    }

    @NotNull
    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    public int hashCode() {
        int iHashCode = this.sessionDetails.hashCode() * 31;
        Time time = this.backgroundTime;
        int iHashCode2 = (iHashCode + (time == null ? 0 : time.hashCode())) * 31;
        Map map = this.processDataMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionData(sessionDetails=" + this.sessionDetails + ", backgroundTime=" + this.backgroundTime + ", processDataMap=" + this.processDataMap + ')';
    }

    public SessionData(@NotNull SessionDetails sessionDetails, @Nullable Time time, @Nullable Map<String, ProcessData> map) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        this.sessionDetails = sessionDetails;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionDetails, (i10 & 2) != 0 ? null : time, (i10 & 4) != 0 ? null : map);
    }
}
