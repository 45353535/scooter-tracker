package com.vungle.ads.internal.signals;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.model.UnclosedAd;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import yg.e2;
import yg.t2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B¥\u0001\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0004\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010$R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010(R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00105\u0012\u0004\b:\u00101\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010;\u0012\u0004\b@\u00101\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u00105\u0012\u0004\bC\u00101\u001a\u0004\bA\u00107\"\u0004\bB\u00109R(\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010.\u0012\u0004\bF\u00101\u001a\u0004\bD\u0010$\"\u0004\bE\u0010\u0005R.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010;\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010.\u0012\u0004\bK\u00101\u001a\u0004\b\u0013\u0010$\"\u0004\bJ\u0010\u0005R(\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010.\u0012\u0004\bM\u00101\u001a\u0004\b\u0014\u0010$\"\u0004\bL\u0010\u0005R(\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010.\u0012\u0004\bP\u00101\u001a\u0004\bN\u0010$\"\u0004\bO\u0010\u0005R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010.\u0012\u0004\bS\u00101\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010\u0005R(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010.\u0012\u0004\bV\u00101\u001a\u0004\bT\u0010$\"\u0004\bU\u0010\u0005¨\u0006Y"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData;", "", "", "sessionCount", "<init>", "(I)V", "seen1", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "sessionCreationTime", "", "Lcom/vungle/ads/internal/signals/SignaledAd;", "signaledAd", "sessionDuration", "sessionDepthCounter", "", "Lcom/vungle/ads/internal/model/UnclosedAd;", "unclosedAd", "isDevice", "isVPNConnected", "overlayGranted", "sensorCount", "httpProxyEnabled", "Lyg/t2;", "serializationConstructorMarker", "(IILjava/lang/String;JLjava/util/List;JILjava/util/List;IIIIILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/signals/SessionData;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()I", MenuActionType.COPY, "(I)Lcom/vungle/ads/internal/signals/SessionData;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSessionCount", "getSessionCount$annotations", "()V", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "J", "getSessionCreationTime", "()J", "setSessionCreationTime", "(J)V", "getSessionCreationTime$annotations", "Ljava/util/List;", "getSignaledAd", "()Ljava/util/List;", "setSignaledAd", "(Ljava/util/List;)V", "getSignaledAd$annotations", "getSessionDuration", "setSessionDuration", "getSessionDuration$annotations", "getSessionDepthCounter", "setSessionDepthCounter", "getSessionDepthCounter$annotations", "getUnclosedAd", "setUnclosedAd", "getUnclosedAd$annotations", "setDevice", "isDevice$annotations", "setVPNConnected", "isVPNConnected$annotations", "getOverlayGranted", "setOverlayGranted", "getOverlayGranted$annotations", "getSensorCount", "setSensorCount", "getSensorCount$annotations", "getHttpProxyEnabled", "setHttpProxyEnabled", "getHttpProxyEnabled$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;

    @NotNull
    private final String sessionId;

    @NotNull
    private List<SignaledAd> signaledAd;

    @NotNull
    private List<UnclosedAd> unclosedAd;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/signals/SessionData;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SessionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionData(int i10) {
        this.sessionCount = i10;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sessionData.sessionCount;
        }
        return sessionData.copy(i10);
    }

    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    public static /* synthetic */ void getSensorCount$annotations() {
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    public static /* synthetic */ void isDevice$annotations() {
    }

    public static /* synthetic */ void isVPNConnected$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(@org.jetbrains.annotations.NotNull com.vungle.ads.internal.signals.SessionData r7, @org.jetbrains.annotations.NotNull xg.f r8, @org.jetbrains.annotations.NotNull kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.SessionData.write$Self(com.vungle.ads.internal.signals.SessionData, xg.f, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionCount() {
        return this.sessionCount;
    }

    @NotNull
    public final SessionData copy(int sessionCount) {
        return new SessionData(sessionCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionData) && this.sessionCount == ((SessionData) other).sessionCount;
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    @NotNull
    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return this.sessionCount;
    }

    /* JADX INFO: renamed from: isDevice, reason: from getter */
    public final int getIsDevice() {
        return this.isDevice;
    }

    /* JADX INFO: renamed from: isVPNConnected, reason: from getter */
    public final int getIsVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i10) {
        this.isDevice = i10;
    }

    public final void setHttpProxyEnabled(int i10) {
        this.httpProxyEnabled = i10;
    }

    public final void setOverlayGranted(int i10) {
        this.overlayGranted = i10;
    }

    public final void setSensorCount(int i10) {
        this.sensorCount = i10;
    }

    public final void setSessionCreationTime(long j10) {
        this.sessionCreationTime = j10;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSignaledAd(@NotNull List<SignaledAd> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(@NotNull List<UnclosedAd> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i10) {
        this.isVPNConnected = i10;
    }

    @NotNull
    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    public /* synthetic */ SessionData(int i10, int i11, String str, long j10, List list, long j11, int i12, List list2, int i13, int i14, int i15, int i16, int i17, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            this.sessionId = string;
        } else {
            this.sessionId = str;
        }
        if ((i10 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j10;
        }
        if ((i10 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i10 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j11;
        }
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        if ((i10 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
        if ((i10 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i13;
        }
        if ((i10 & 256) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i14;
        }
        if ((i10 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i15;
        }
        if ((i10 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i16;
        }
        if ((i10 & 2048) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i17;
        }
    }
}
