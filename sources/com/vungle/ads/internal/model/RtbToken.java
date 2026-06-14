package com.vungle.ads.internal.model;

import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.model.CommonRequestBody;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010#J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010!R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#¨\u0006<"}, d2 = {"Lcom/vungle/ads/internal/model/RtbToken;", "", "Lcom/vungle/ads/internal/model/DeviceNode;", C4240b4.i.G, "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "user", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "ext", "Lcom/vungle/ads/internal/model/RtbRequest;", "request", "", "ordinalView", "<init>", "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/RtbRequest;I)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/RtbRequest;ILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/RtbToken;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/model/DeviceNode;", "component2", "()Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "component3", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "component4", "()Lcom/vungle/ads/internal/model/RtbRequest;", "component5", "()I", MenuActionType.COPY, "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/RtbRequest;I)Lcom/vungle/ads/internal/model/RtbToken;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/DeviceNode;", "getDevice", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "getUser", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getExt", "Lcom/vungle/ads/internal/model/RtbRequest;", "getRequest", "I", "getOrdinalView", "getOrdinalView$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RtbToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DeviceNode device;

    @Nullable
    private final CommonRequestBody.RequestExt ext;
    private final int ordinalView;

    @Nullable
    private final RtbRequest request;

    @Nullable
    private final CommonRequestBody.User user;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/RtbToken$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/RtbToken;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RtbToken$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RtbToken(int i10, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i11, t2 t2Var) {
        if (17 != (i10 & 17)) {
            e2.a(i10, 17, RtbToken$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = rtbRequest;
        }
        this.ordinalView = i11;
    }

    public static /* synthetic */ RtbToken copy$default(RtbToken rtbToken, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deviceNode = rtbToken.device;
        }
        if ((i11 & 2) != 0) {
            user = rtbToken.user;
        }
        if ((i11 & 4) != 0) {
            requestExt = rtbToken.ext;
        }
        if ((i11 & 8) != 0) {
            rtbRequest = rtbToken.request;
        }
        if ((i11 & 16) != 0) {
            i10 = rtbToken.ordinalView;
        }
        int i12 = i10;
        CommonRequestBody.RequestExt requestExt2 = requestExt;
        return rtbToken.copy(deviceNode, user, requestExt2, rtbRequest, i12);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }

    public static final void write$Self(@NotNull RtbToken self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.F(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.r(serialDesc, 1) || self.user != null) {
            output.h(serialDesc, 1, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.r(serialDesc, 2) || self.ext != null) {
            output.h(serialDesc, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (output.r(serialDesc, 3) || self.request != null) {
            output.h(serialDesc, 3, RtbRequest$$serializer.INSTANCE, self.request);
        }
        output.o(serialDesc, 4, self.ordinalView);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RtbRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @NotNull
    public final RtbToken copy(@NotNull DeviceNode device, @Nullable CommonRequestBody.User user, @Nullable CommonRequestBody.RequestExt ext, @Nullable RtbRequest request, int ordinalView) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new RtbToken(device, user, ext, request, ordinalView);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtbToken)) {
            return false;
        }
        RtbToken rtbToken = (RtbToken) other;
        return Intrinsics.areEqual(this.device, rtbToken.device) && Intrinsics.areEqual(this.user, rtbToken.user) && Intrinsics.areEqual(this.ext, rtbToken.ext) && Intrinsics.areEqual(this.request, rtbToken.request) && this.ordinalView == rtbToken.ordinalView;
    }

    @NotNull
    public final DeviceNode getDevice() {
        return this.device;
    }

    @Nullable
    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @Nullable
    public final RtbRequest getRequest() {
        return this.request;
    }

    @Nullable
    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        CommonRequestBody.User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        CommonRequestBody.RequestExt requestExt = this.ext;
        int iHashCode3 = (iHashCode2 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RtbRequest rtbRequest = this.request;
        return ((iHashCode3 + (rtbRequest != null ? rtbRequest.hashCode() : 0)) * 31) + this.ordinalView;
    }

    @NotNull
    public String toString() {
        return "RtbToken(device=" + this.device + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ", ordinalView=" + this.ordinalView + ')';
    }

    public RtbToken(@NotNull DeviceNode device, @Nullable CommonRequestBody.User user, @Nullable CommonRequestBody.RequestExt requestExt, @Nullable RtbRequest rtbRequest, int i10) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.user = user;
        this.ext = requestExt;
        this.request = rtbRequest;
        this.ordinalView = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RtbToken(DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        int i12;
        RtbRequest rtbRequest2;
        user = (i11 & 2) != 0 ? null : user;
        requestExt = (i11 & 4) != 0 ? null : requestExt;
        if ((i11 & 8) != 0) {
            i12 = i10;
            rtbRequest2 = null;
        } else {
            i12 = i10;
            rtbRequest2 = rtbRequest;
        }
        this(deviceNode, user, requestExt, rtbRequest2, i12);
    }
}
