package com.vungle.ads.internal.signals;

import androidx.collection.b;
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
import yg.e2;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006BQ\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0005\u0010\u0011J!\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J&\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010\u001d\u001a\u0004\b-\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b1\u0010\u001d\u001a\u0004\b0\u0010!R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00102\u0012\u0004\b6\u0010\u001d\u001a\u0004\b3\u0010%\"\u0004\b4\u00105R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b8\u0010\u001d\u001a\u0004\b7\u0010!R*\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u00102\u0012\u0004\b;\u0010\u001d\u001a\u0004\b9\u0010%\"\u0004\b:\u00105R(\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010/\u0012\u0004\b?\u0010\u001d\u001a\u0004\b<\u0010!\"\u0004\b=\u0010>R(\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010@\u0012\u0004\bD\u0010\u001d\u001a\u0004\bA\u0010'\"\u0004\bB\u0010CR(\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u0010/\u0012\u0004\bH\u0010\u001d\u001a\u0004\bF\u0010!\"\u0004\bG\u0010>R(\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010/\u0012\u0004\bL\u0010\u001d\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010>¨\u0006O"}, d2 = {"Lcom/vungle/ads/internal/signals/SignaledAd;", "", "", "lastAdLoadTime", "loadAdTime", "<init>", "(Ljava/lang/Long;J)V", "", "seen1", "", "templateSignals", "timeSinceLastAdLoad", "eventId", "timeBetweenAdAvailabilityAndPlayAd", "screenOrientation", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;JILyg/t2;)V", "getTimeDifference", "(Ljava/lang/Long;J)J", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/signals/SignaledAd;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "calculateTimeBetweenAdAvailabilityAndPlayAd", "()V", "component1", "()Ljava/lang/Long;", "component2", "()J", MenuActionType.COPY, "(Ljava/lang/Long;J)Lcom/vungle/ads/internal/signals/SignaledAd;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getLastAdLoadTime", "getLastAdLoadTime$annotations", "J", "getLoadAdTime", "getLoadAdTime$annotations", "Ljava/lang/String;", "getTemplateSignals", "setTemplateSignals", "(Ljava/lang/String;)V", "getTemplateSignals$annotations", "getTimeSinceLastAdLoad", "getTimeSinceLastAdLoad$annotations", "getEventId", "setEventId", "getEventId$annotations", "getTimeBetweenAdAvailabilityAndPlayAd", "setTimeBetweenAdAvailabilityAndPlayAd", "(J)V", "getTimeBetweenAdAvailabilityAndPlayAd$annotations", "I", "getScreenOrientation", "setScreenOrientation", "(I)V", "getScreenOrientation$annotations", "adAvailabilityCallbackTime", "getAdAvailabilityCallbackTime", "setAdAvailabilityCallbackTime", "getAdAvailabilityCallbackTime$annotations", "playAdTime", "getPlayAdTime", "setPlayAdTime", "getPlayAdTime$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SignaledAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private long adAvailabilityCallbackTime;

    @Nullable
    private String eventId;

    @Nullable
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;

    @Nullable
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/signals/SignaledAd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SignaledAd$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SignaledAd() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ SignaledAd copy$default(SignaledAd signaledAd, Long l10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = signaledAd.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j10 = signaledAd.loadAdTime;
        }
        return signaledAd.copy(l10, j10);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    private final long getTimeDifference(Long lastAdLoadTime, long loadAdTime) {
        if (lastAdLoadTime == null) {
            return -1L;
        }
        long jLongValue = loadAdTime - lastAdLoadTime.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }

    public static final void write$Self(@NotNull SignaledAd self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || self.templateSignals != null) {
            output.h(serialDesc, 0, y2.f119104a, self.templateSignals);
        }
        output.v(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.r(serialDesc, 2) || self.eventId != null) {
            output.h(serialDesc, 2, y2.f119104a, self.eventId);
        }
        if (output.r(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.v(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!output.r(serialDesc, 4) && self.screenOrientation == 0) {
            return;
        }
        output.o(serialDesc, 4, self.screenOrientation);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    @NotNull
    public final SignaledAd copy(@Nullable Long lastAdLoadTime, long loadAdTime) {
        return new SignaledAd(lastAdLoadTime, loadAdTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignaledAd)) {
            return false;
        }
        SignaledAd signaledAd = (SignaledAd) other;
        return Intrinsics.areEqual(this.lastAdLoadTime, signaledAd.lastAdLoadTime) && this.loadAdTime == signaledAd.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    @Nullable
    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l10 = this.lastAdLoadTime;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + b.a(this.loadAdTime);
    }

    public final void setAdAvailabilityCallbackTime(long j10) {
        this.adAvailabilityCallbackTime = j10;
    }

    public final void setEventId(@Nullable String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j10) {
        this.playAdTime = j10;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(@Nullable String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j10) {
        this.timeBetweenAdAvailabilityAndPlayAd = j10;
    }

    @NotNull
    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    public /* synthetic */ SignaledAd(int i10, String str, long j10, String str2, long j11, int i11, t2 t2Var) {
        if (2 != (i10 & 2)) {
            e2.a(i10, 2, SignaledAd$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j10;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j11;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public SignaledAd(@Nullable Long l10, long j10) {
        this.lastAdLoadTime = l10;
        this.loadAdTime = j10;
        this.timeSinceLastAdLoad = getTimeDifference(l10, j10);
    }

    public /* synthetic */ SignaledAd(Long l10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? 0L : j10);
    }
}
