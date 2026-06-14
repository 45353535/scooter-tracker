package com.vungle.ads.internal.model;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001bR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd;", "", "", "eventId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/UnclosedAd;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/UnclosedAd;", "toString", "Ljava/lang/String;", "getEventId", "getEventId$annotations", "()V", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "getSessionId$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class UnclosedAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String eventId;

    @NotNull
    private String sessionId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UnclosedAd$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UnclosedAd(int i10, String str, String str2, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, UnclosedAd$$serializer.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ UnclosedAd copy$default(UnclosedAd unclosedAd, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static final void write$Self(@NotNull UnclosedAd self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.q(serialDesc, 0, self.eventId);
        if (!output.r(serialDesc, 1) && Intrinsics.areEqual(self.sessionId, "")) {
            return;
        }
        output.q(serialDesc, 1, self.sessionId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final UnclosedAd copy(@NotNull String eventId, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new UnclosedAd(eventId, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && Intrinsics.areEqual(UnclosedAd.class, other.getClass())) {
            UnclosedAd unclosedAd = (UnclosedAd) other;
            if (Intrinsics.areEqual(this.eventId, unclosedAd.eventId) && Intrinsics.areEqual(this.sessionId, unclosedAd.sessionId)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.eventId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }

    public UnclosedAd(@NotNull String eventId, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ UnclosedAd(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
