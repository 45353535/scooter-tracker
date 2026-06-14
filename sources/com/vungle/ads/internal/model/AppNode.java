package com.vungle.ads.internal.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
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

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/AppNode;", "", "", "bundle", POBCoreNativeConstants.NATIVE_VERSION, RemoteConfigConstants.RequestFieldKey.APP_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AppNode;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/AppNode;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBundle", "getVer", "getAppId", "getAppId$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AppNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appId;

    @NotNull
    private final String bundle;

    @NotNull
    private final String ver;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AppNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AppNode;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AppNode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppNode(int i10, String str, String str2, String str3, t2 t2Var) {
        if (7 != (i10 & 7)) {
            e2.a(i10, 7, AppNode$$serializer.INSTANCE.getDescriptor());
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ AppNode copy$default(AppNode appNode, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appNode.bundle;
        }
        if ((i10 & 2) != 0) {
            str2 = appNode.ver;
        }
        if ((i10 & 4) != 0) {
            str3 = appNode.appId;
        }
        return appNode.copy(str, str2, str3);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static final void write$Self(@NotNull AppNode self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.q(serialDesc, 0, self.bundle);
        output.q(serialDesc, 1, self.ver);
        output.q(serialDesc, 2, self.appId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVer() {
        return this.ver;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final AppNode copy(@NotNull String bundle, @NotNull String ver, @NotNull String appId) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new AppNode(bundle, ver, appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppNode)) {
            return false;
        }
        AppNode appNode = (AppNode) other;
        return Intrinsics.areEqual(this.bundle, appNode.bundle) && Intrinsics.areEqual(this.ver, appNode.ver) && Intrinsics.areEqual(this.appId, appNode.appId);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getBundle() {
        return this.bundle;
    }

    @NotNull
    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return (((this.bundle.hashCode() * 31) + this.ver.hashCode()) * 31) + this.appId.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppNode(bundle=" + this.bundle + ", ver=" + this.ver + ", appId=" + this.appId + ')';
    }

    public AppNode(@NotNull String bundle, @NotNull String ver, @NotNull String appId) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }
}
