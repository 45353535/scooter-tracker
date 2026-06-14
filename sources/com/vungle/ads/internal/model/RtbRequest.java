package com.vungle.ads.internal.model;

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
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/RtbRequest;", "", "", "sdkUserAgent", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/RtbRequest;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/RtbRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSdkUserAgent", "getSdkUserAgent$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RtbRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String sdkUserAgent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/RtbRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/RtbRequest;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RtbRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RtbRequest() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RtbRequest copy$default(RtbRequest rtbRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rtbRequest.sdkUserAgent;
        }
        return rtbRequest.copy(str);
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }

    public static final void write$Self(@NotNull RtbRequest self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.r(serialDesc, 0) && self.sdkUserAgent == null) {
            return;
        }
        output.h(serialDesc, 0, y2.f119104a, self.sdkUserAgent);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    @NotNull
    public final RtbRequest copy(@Nullable String sdkUserAgent) {
        return new RtbRequest(sdkUserAgent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RtbRequest) && Intrinsics.areEqual(this.sdkUserAgent, ((RtbRequest) other).sdkUserAgent);
    }

    @Nullable
    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "RtbRequest(sdkUserAgent=" + this.sdkUserAgent + ')';
    }

    public /* synthetic */ RtbRequest(int i10, String str, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public RtbRequest(@Nullable String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ RtbRequest(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
