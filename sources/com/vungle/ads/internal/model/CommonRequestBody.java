package com.vungle.ads.internal.model;

import androidx.collection.b;
import com.ironsource.C4240b4;
import com.ironsource.C4418ld;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.pubnative.lite.sdk.models.RemoteConfigFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.e2;
import yg.i;
import yg.i1;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 >2\u00020\u0001:\n?@AB>CDEFGB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\"\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$\"\u0004\b<\u0010=¨\u0006H"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody;", "", "Lcom/vungle/ads/internal/model/DeviceNode;", C4240b4.i.G, "Lcom/vungle/ads/internal/model/AppNode;", "app", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "user", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "ext", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "request", "<init>", "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/model/DeviceNode;", "component2", "()Lcom/vungle/ads/internal/model/AppNode;", "component3", "()Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "component4", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "component5", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", MenuActionType.COPY, "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/AppNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)Lcom/vungle/ads/internal/model/CommonRequestBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/DeviceNode;", "getDevice", "Lcom/vungle/ads/internal/model/AppNode;", "getApp", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "getUser", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getExt", "setExt", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "getRequest", "setRequest", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)V", y.f66058y, "$serializer", "AdSizeParam", "CCPA", "COPPA", "GDPR", "IAB", "RequestExt", "RequestParam", "User", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CommonRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AppNode app;

    @NotNull
    private final DeviceNode device;

    @Nullable
    private RequestExt ext;

    @Nullable
    private RequestParam request;

    @Nullable
    private final User user;

    @l
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "", "", "status", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CCPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String status;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$CCPA$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CCPA(int i10, String str, t2 t2Var) {
            if (1 != (i10 & 1)) {
                e2.a(i10, 1, CommonRequestBody$CCPA$$serializer.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        public static final void write$Self(@NotNull CCPA self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.q(serialDesc, 0, self.status);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final CCPA copy(@NotNull String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new CCPA(status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CCPA) && Intrinsics.areEqual(this.status, ((CCPA) other).status);
        }

        @NotNull
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        public CCPA(@NotNull String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }
    }

    @l
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\u0014¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "", "", "isCoppa", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Boolean;", MenuActionType.COPY, "(Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isCoppa$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class COPPA {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Boolean isCoppa;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$COPPA$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ COPPA(int i10, Boolean bool, t2 t2Var) {
            if (1 != (i10 & 1)) {
                e2.a(i10, 1, CommonRequestBody$COPPA$$serializer.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }

        public static final void write$Self(@NotNull COPPA self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.h(serialDesc, 0, i.f118983a, self.isCoppa);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCoppa() {
            return this.isCoppa;
        }

        @NotNull
        public final COPPA copy(@Nullable Boolean isCoppa) {
            return new COPPA(isCoppa);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof COPPA) && Intrinsics.areEqual(this.isCoppa, ((COPPA) other).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @Nullable
        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        @NotNull
        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public COPPA(@Nullable Boolean bool) {
            this.isCoppa = bool;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CommonRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @l
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u0018¨\u00063"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "", "", "consentStatus", "consentSource", "", "consentTimestamp", "consentMessageVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConsentStatus", "getConsentStatus$annotations", "()V", "getConsentSource", "getConsentSource$annotations", "J", "getConsentTimestamp", "getConsentTimestamp$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class GDPR {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String consentMessageVersion;

        @NotNull
        private final String consentSource;

        @NotNull
        private final String consentStatus;
        private final long consentTimestamp;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$GDPR$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ GDPR(int i10, String str, String str2, long j10, String str3, t2 t2Var) {
            if (15 != (i10 & 15)) {
                e2.a(i10, 15, CommonRequestBody$GDPR$$serializer.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            if ((i10 & 4) != 0) {
                j10 = gdpr.consentTimestamp;
            }
            if ((i10 & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            String str4 = str3;
            return gdpr.copy(str, str2, j10, str4);
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }

        public static final void write$Self(@NotNull GDPR self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.q(serialDesc, 0, self.consentStatus);
            output.q(serialDesc, 1, self.consentSource);
            output.v(serialDesc, 2, self.consentTimestamp);
            output.q(serialDesc, 3, self.consentMessageVersion);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentSource() {
            return this.consentSource;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @NotNull
        public final GDPR copy(@NotNull String consentStatus, @NotNull String consentSource, long consentTimestamp, @NotNull String consentMessageVersion) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            Intrinsics.checkNotNullParameter(consentSource, "consentSource");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, consentTimestamp, consentMessageVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) other;
            return Intrinsics.areEqual(this.consentStatus, gdpr.consentStatus) && Intrinsics.areEqual(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && Intrinsics.areEqual(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        @NotNull
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @NotNull
        public final String getConsentSource() {
            return this.consentSource;
        }

        @NotNull
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + b.a(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        @NotNull
        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        public GDPR(@NotNull String consentStatus, @NotNull String consentSource, long j10, @NotNull String consentMessageVersion) {
            Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
            Intrinsics.checkNotNullParameter(consentSource, "consentSource");
            Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j10;
            this.consentMessageVersion = consentMessageVersion;
        }
    }

    @l
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "", "", "tcf", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTcf", "getTcf$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class IAB {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String tcf;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$IAB$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$IAB$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ IAB(int i10, String str, t2 t2Var) {
            if (1 != (i10 & 1)) {
                e2.a(i10, 1, CommonRequestBody$IAB$$serializer.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ IAB copy$default(IAB iab, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = iab.tcf;
            }
            return iab.copy(str);
        }

        public static /* synthetic */ void getTcf$annotations() {
        }

        public static final void write$Self(@NotNull IAB self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.q(serialDesc, 0, self.tcf);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTcf() {
            return this.tcf;
        }

        @NotNull
        public final IAB copy(@NotNull String tcf) {
            Intrinsics.checkNotNullParameter(tcf, "tcf");
            return new IAB(tcf);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IAB) && Intrinsics.areEqual(this.tcf, ((IAB) other).tcf);
        }

        @NotNull
        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        @NotNull
        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        public IAB(@NotNull String tcf) {
            Intrinsics.checkNotNullParameter(tcf, "tcf");
            this.tcf = tcf;
        }
    }

    @l
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001a¨\u00061"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "", "", "configExtension", "signals", "", "configLastValidatedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConfigExtension", "getConfigExtension$annotations", "()V", "getSignals", "setSignals", "(Ljava/lang/String;)V", "getSignals$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "getConfigLastValidatedTimestamp$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class RequestExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String configExtension;

        @Nullable
        private final Long configLastValidatedTimestamp;

        @Nullable
        private String signals;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$RequestExt$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RequestExt() {
            this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i10 & 2) != 0) {
                str2 = requestExt.signals;
            }
            if ((i10 & 4) != 0) {
                l10 = requestExt.configLastValidatedTimestamp;
            }
            return requestExt.copy(str, str2, l10);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        public static /* synthetic */ void getSignals$annotations() {
        }

        public static final void write$Self(@NotNull RequestExt self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.configExtension != null) {
                output.h(serialDesc, 0, y2.f119104a, self.configExtension);
            }
            if (output.r(serialDesc, 1) || self.signals != null) {
                output.h(serialDesc, 1, y2.f119104a, self.signals);
            }
            if (!output.r(serialDesc, 2) && self.configLastValidatedTimestamp == null) {
                return;
            }
            output.h(serialDesc, 2, i1.f118988a, self.configLastValidatedTimestamp);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConfigExtension() {
            return this.configExtension;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignals() {
            return this.signals;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        @NotNull
        public final RequestExt copy(@Nullable String configExtension, @Nullable String signals, @Nullable Long configLastValidatedTimestamp) {
            return new RequestExt(configExtension, signals, configLastValidatedTimestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) other;
            return Intrinsics.areEqual(this.configExtension, requestExt.configExtension) && Intrinsics.areEqual(this.signals, requestExt.signals) && Intrinsics.areEqual(this.configLastValidatedTimestamp, requestExt.configLastValidatedTimestamp);
        }

        @Nullable
        public final String getConfigExtension() {
            return this.configExtension;
        }

        @Nullable
        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        @Nullable
        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l10 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public final void setSignals(@Nullable String str) {
            this.signals = str;
        }

        @NotNull
        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        public /* synthetic */ RequestExt(int i10, String str, String str2, Long l10, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i10 & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i10 & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l10;
            }
        }

        public RequestExt(@Nullable String str, @Nullable String str2, @Nullable Long l10) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l10;
        }

        public /* synthetic */ RequestExt(String str, String str2, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10);
        }
    }

    @l
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rBe\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\"J^\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001cR*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00100\u0012\u0004\b4\u00105\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u00103R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b>\u0010\"¨\u0006A"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "", "", "", C4418ld.f43559c, "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", C4240b4.i.O, "", "adStartTime", "advAppId", "placementReferenceId", "user", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/String;", "component5", "component6", MenuActionType.COPY, "(Ljava/util/List;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlacements", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "getAdSize", "setAdSize", "(Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;)V", "getAdSize$annotations", "()V", "Ljava/lang/Long;", "getAdStartTime", "getAdStartTime$annotations", "Ljava/lang/String;", "getAdvAppId", "getAdvAppId$annotations", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "getUser", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class RequestParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private AdSizeParam adSize;

        @Nullable
        private final Long adStartTime;

        @Nullable
        private final String advAppId;

        @Nullable
        private final String placementReferenceId;

        @Nullable
        private final List<String> placements;

        @Nullable
        private final String user;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$RequestParam$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RequestParam() {
            this((List) null, (AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i10 & 2) != 0) {
                adSizeParam = requestParam.adSize;
            }
            if ((i10 & 4) != 0) {
                l10 = requestParam.adStartTime;
            }
            if ((i10 & 8) != 0) {
                str = requestParam.advAppId;
            }
            if ((i10 & 16) != 0) {
                str2 = requestParam.placementReferenceId;
            }
            if ((i10 & 32) != 0) {
                str3 = requestParam.user;
            }
            String str4 = str2;
            String str5 = str3;
            return requestParam.copy(list, adSizeParam, l10, str, str4, str5);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        public static final void write$Self(@NotNull RequestParam self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.placements != null) {
                output.h(serialDesc, 0, new yg.f(y2.f119104a), self.placements);
            }
            if (output.r(serialDesc, 1) || self.adSize != null) {
                output.h(serialDesc, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, self.adSize);
            }
            if (output.r(serialDesc, 2) || self.adStartTime != null) {
                output.h(serialDesc, 2, i1.f118988a, self.adStartTime);
            }
            if (output.r(serialDesc, 3) || self.advAppId != null) {
                output.h(serialDesc, 3, y2.f119104a, self.advAppId);
            }
            if (output.r(serialDesc, 4) || self.placementReferenceId != null) {
                output.h(serialDesc, 4, y2.f119104a, self.placementReferenceId);
            }
            if (!output.r(serialDesc, 5) && self.user == null) {
                return;
            }
            output.h(serialDesc, 5, y2.f119104a, self.user);
        }

        @Nullable
        public final List<String> component1() {
            return this.placements;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        @NotNull
        public final RequestParam copy(@Nullable List<String> placements, @Nullable AdSizeParam adSize, @Nullable Long adStartTime, @Nullable String advAppId, @Nullable String placementReferenceId, @Nullable String user) {
            return new RequestParam(placements, adSize, adStartTime, advAppId, placementReferenceId, user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) other;
            return Intrinsics.areEqual(this.placements, requestParam.placements) && Intrinsics.areEqual(this.adSize, requestParam.adSize) && Intrinsics.areEqual(this.adStartTime, requestParam.adStartTime) && Intrinsics.areEqual(this.advAppId, requestParam.advAppId) && Intrinsics.areEqual(this.placementReferenceId, requestParam.placementReferenceId) && Intrinsics.areEqual(this.user, requestParam.user);
        }

        @Nullable
        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        @Nullable
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        @Nullable
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @Nullable
        public final List<String> getPlacements() {
            return this.placements;
        }

        @Nullable
        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            AdSizeParam adSizeParam = this.adSize;
            int iHashCode2 = (iHashCode + (adSizeParam == null ? 0 : adSizeParam.hashCode())) * 31;
            Long l10 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAdSize(@Nullable AdSizeParam adSizeParam) {
            this.adSize = adSizeParam;
        }

        @NotNull
        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ')';
        }

        public /* synthetic */ RequestParam(int i10, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i10 & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = adSizeParam;
            }
            if ((i10 & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l10;
            }
            if ((i10 & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i10 & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i10 & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
        }

        public RequestParam(@Nullable List<String> list, @Nullable AdSizeParam adSizeParam, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.placements = list;
            this.adSize = adSizeParam;
            this.adStartTime = l10;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
        }

        public /* synthetic */ RequestParam(List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : adSizeParam, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3);
        }
    }

    @l
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00107R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010 \"\u0004\b:\u0010;R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010?R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010$\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "gdpr", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", RemoteConfigFeature.UserConsent.CCPA, "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "coppa", "Lcom/vungle/ads/fpd/FirstPartyData;", "fpd", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "iab", "<init>", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lcom/vungle/ads/fpd/FirstPartyData;Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lcom/vungle/ads/fpd/FirstPartyData;Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "component2", "()Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "component3", "()Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "component4", "()Lcom/vungle/ads/fpd/FirstPartyData;", "component5", "()Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", MenuActionType.COPY, "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;Lcom/vungle/ads/fpd/FirstPartyData;Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;)Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "getGdpr", "setGdpr", "(Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;", "getCcpa", "setCcpa", "(Lcom/vungle/ads/internal/model/CommonRequestBody$CCPA;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;", "getCoppa", "setCoppa", "(Lcom/vungle/ads/internal/model/CommonRequestBody$COPPA;)V", "Lcom/vungle/ads/fpd/FirstPartyData;", "getFpd", "setFpd", "(Lcom/vungle/ads/fpd/FirstPartyData;)V", "Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;", "getIab", "setIab", "(Lcom/vungle/ads/internal/model/CommonRequestBody$IAB;)V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class User {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private CCPA ccpa;

        @Nullable
        private COPPA coppa;

        @Nullable
        private FirstPartyData fpd;

        @Nullable
        private GDPR gdpr;

        @Nullable
        private IAB iab;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$User$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$User$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, (FirstPartyData) null, (IAB) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i10 & 2) != 0) {
                ccpa = user.ccpa;
            }
            if ((i10 & 4) != 0) {
                coppa = user.coppa;
            }
            if ((i10 & 8) != 0) {
                firstPartyData = user.fpd;
            }
            if ((i10 & 16) != 0) {
                iab = user.iab;
            }
            IAB iab2 = iab;
            COPPA coppa2 = coppa;
            return user.copy(gdpr, ccpa, coppa2, firstPartyData, iab2);
        }

        public static final void write$Self(@NotNull User self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.gdpr != null) {
                output.h(serialDesc, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, self.gdpr);
            }
            if (output.r(serialDesc, 1) || self.ccpa != null) {
                output.h(serialDesc, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, self.ccpa);
            }
            if (output.r(serialDesc, 2) || self.coppa != null) {
                output.h(serialDesc, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, self.coppa);
            }
            if (output.r(serialDesc, 3) || self.fpd != null) {
                output.h(serialDesc, 3, FirstPartyData$$serializer.INSTANCE, self.fpd);
            }
            if (!output.r(serialDesc, 4) && self.iab == null) {
                return;
            }
            output.h(serialDesc, 4, CommonRequestBody$IAB$$serializer.INSTANCE, self.iab);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPR getGdpr() {
            return this.gdpr;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CCPA getCcpa() {
            return this.ccpa;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final COPPA getCoppa() {
            return this.coppa;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final IAB getIab() {
            return this.iab;
        }

        @NotNull
        public final User copy(@Nullable GDPR gdpr, @Nullable CCPA ccpa, @Nullable COPPA coppa, @Nullable FirstPartyData fpd, @Nullable IAB iab) {
            return new User(gdpr, ccpa, coppa, fpd, iab);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.gdpr, user.gdpr) && Intrinsics.areEqual(this.ccpa, user.ccpa) && Intrinsics.areEqual(this.coppa, user.coppa) && Intrinsics.areEqual(this.fpd, user.fpd) && Intrinsics.areEqual(this.iab, user.iab);
        }

        @Nullable
        public final CCPA getCcpa() {
            return this.ccpa;
        }

        @Nullable
        public final COPPA getCoppa() {
            return this.coppa;
        }

        @Nullable
        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        @Nullable
        public final GDPR getGdpr() {
            return this.gdpr;
        }

        @Nullable
        public final IAB getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            int iHashCode3 = (iHashCode2 + (coppa == null ? 0 : coppa.hashCode())) * 31;
            FirstPartyData firstPartyData = this.fpd;
            int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
            IAB iab = this.iab;
            return iHashCode4 + (iab != null ? iab.hashCode() : 0);
        }

        public final void setCcpa(@Nullable CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(@Nullable COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setFpd(@Nullable FirstPartyData firstPartyData) {
            this.fpd = firstPartyData;
        }

        public final void setGdpr(@Nullable GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public final void setIab(@Nullable IAB iab) {
            this.iab = iab;
        }

        @NotNull
        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ User(int i10, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i10 & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i10 & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
            if ((i10 & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = firstPartyData;
            }
            if ((i10 & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = iab;
            }
        }

        public User(@Nullable GDPR gdpr, @Nullable CCPA ccpa, @Nullable COPPA coppa, @Nullable FirstPartyData firstPartyData, @Nullable IAB iab) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
            this.fpd = firstPartyData;
            this.iab = iab;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : gdpr, (i10 & 2) != 0 ? null : ccpa, (i10 & 4) != 0 ? null : coppa, (i10 & 8) != 0 ? null : firstPartyData, (i10 & 16) != 0 ? null : iab);
        }
    }

    public /* synthetic */ CommonRequestBody(int i10, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, CommonRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i10 & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        if ((i10 & 4) != 0) {
            user = commonRequestBody.user;
        }
        if ((i10 & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        if ((i10 & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        RequestParam requestParam2 = requestParam;
        User user2 = user;
        return commonRequestBody.copy(deviceNode, appNode, user2, requestExt, requestParam2);
    }

    public static final void write$Self(@NotNull CommonRequestBody self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.F(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.r(serialDesc, 1) || self.app != null) {
            output.h(serialDesc, 1, AppNode$$serializer.INSTANCE, self.app);
        }
        if (output.r(serialDesc, 2) || self.user != null) {
            output.h(serialDesc, 2, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.r(serialDesc, 3) || self.ext != null) {
            output.h(serialDesc, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (!output.r(serialDesc, 4) && self.request == null) {
            return;
        }
        output.h(serialDesc, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, self.request);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppNode getApp() {
        return this.app;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RequestExt getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RequestParam getRequest() {
        return this.request;
    }

    @NotNull
    public final CommonRequestBody copy(@NotNull DeviceNode device, @Nullable AppNode app, @Nullable User user, @Nullable RequestExt ext, @Nullable RequestParam request) {
        Intrinsics.checkNotNullParameter(device, "device");
        return new CommonRequestBody(device, app, user, ext, request);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) other;
        return Intrinsics.areEqual(this.device, commonRequestBody.device) && Intrinsics.areEqual(this.app, commonRequestBody.app) && Intrinsics.areEqual(this.user, commonRequestBody.user) && Intrinsics.areEqual(this.ext, commonRequestBody.ext) && Intrinsics.areEqual(this.request, commonRequestBody.request);
    }

    @Nullable
    public final AppNode getApp() {
        return this.app;
    }

    @NotNull
    public final DeviceNode getDevice() {
        return this.device;
    }

    @Nullable
    public final RequestExt getExt() {
        return this.ext;
    }

    @Nullable
    public final RequestParam getRequest() {
        return this.request;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public final void setExt(@Nullable RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(@Nullable RequestParam requestParam) {
        this.request = requestParam;
    }

    @NotNull
    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    @l
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "", "", "width", "height", "<init>", "(II)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(IIILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()I", "component2", MenuActionType.COPY, "(II)Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AdSizeParam {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return CommonRequestBody$AdSizeParam$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdSizeParam(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ AdSizeParam copy$default(AdSizeParam adSizeParam, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = adSizeParam.width;
            }
            if ((i12 & 2) != 0) {
                i11 = adSizeParam.height;
            }
            return adSizeParam.copy(i10, i11);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }

        public static final void write$Self(@NotNull AdSizeParam self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            output.o(serialDesc, 0, self.width);
            output.o(serialDesc, 1, self.height);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final AdSizeParam copy(int width, int height) {
            return new AdSizeParam(width, height);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeParam)) {
                return false;
            }
            AdSizeParam adSizeParam = (AdSizeParam) other;
            return this.width == adSizeParam.width && this.height == adSizeParam.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (this.width * 31) + this.height;
        }

        @NotNull
        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        public /* synthetic */ AdSizeParam(int i10, int i11, int i12, t2 t2Var) {
            if (3 != (i10 & 3)) {
                e2.a(i10, 3, CommonRequestBody$AdSizeParam$$serializer.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.height = i12;
        }
    }

    public CommonRequestBody(@NotNull DeviceNode device, @Nullable AppNode appNode, @Nullable User user, @Nullable RequestExt requestExt, @Nullable RequestParam requestParam) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.device = device;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceNode, (i10 & 2) != 0 ? null : appNode, (i10 & 4) != 0 ? null : user, (i10 & 8) != 0 ? null : requestExt, (i10 & 16) != 0 ? null : requestParam);
    }
}
