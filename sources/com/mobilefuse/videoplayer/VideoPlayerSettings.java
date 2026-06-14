package com.mobilefuse.videoplayer;

import com.mobilefuse.sdk.rtb.ApiFramework;
import com.mobilefuse.videoplayer.model.DataRegulation;
import com.mobilefuse.videoplayer.model.VastClickType;
import com.mobilefuse.videoplayer.model.VastVersion;
import com.taurusx.tax.f.y;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayerSettings;", "", "()V", y.f66058y, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VideoPlayerSettings {

    @Nullable
    private static String advertisingId = null;

    @Nullable
    private static String deviceIp = null;
    private static boolean isLimitTrackingEnabled = false;

    @NotNull
    public static final String playerName = "MobileFuseVASTPlayer";

    @NotNull
    public static final String playerVersion = "Android_1.9.3";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> supportedVideoContainers = SetsKt.setOf((Object[]) new String[]{"video/mp4", "video/3gpp"});

    @NotNull
    private static final Set<VastVersion> supportedVastVersions = SetsKt.setOf((Object[]) new VastVersion[]{VastVersion.VAST2, VastVersion.VAST2_WRAPPER, VastVersion.VAST3, VastVersion.VAST3_WRAPPER, VastVersion.VAST4, VastVersion.VAST4_WRAPPER, VastVersion.VAST4_1, VastVersion.VAST4_1_WRAPPER, VastVersion.VAST4_2, VastVersion.VAST4_2_WRAPPER});

    @NotNull
    private static final Set<ApiFramework> supportedApiFrameworks = SetsKt.setOf(ApiFramework.OMID1);
    private static final Set<DataRegulation> applicableDataRegulations = new LinkedHashSet();

    @NotNull
    private static String sdkName = "n/a";

    @NotNull
    private static String sdkVersion = "n/a";

    @NotNull
    private static final VastClickType supportedClickType = VastClickType.BUTTON_OR_LINK;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\fH\u0007J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0007J\u0010\u00103\u001a\u0002002\u0006\u00101\u001a\u00020\fH\u0007R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR$\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR$\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\"¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%¨\u00064"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayerSettings$Companion;", "", "()V", "advertisingId", "", "getAdvertisingId$annotations", "getAdvertisingId", "()Ljava/lang/String;", "setAdvertisingId", "(Ljava/lang/String;)V", "applicableDataRegulations", "", "Lcom/mobilefuse/videoplayer/model/DataRegulation;", "deviceIp", "getDeviceIp$annotations", "getDeviceIp", "setDeviceIp", "isLimitTrackingEnabled", "", "isLimitTrackingEnabled$annotations", "()Z", "setLimitTrackingEnabled", "(Z)V", "playerName", "playerVersion", "sdkName", "getSdkName$annotations", "getSdkName", "setSdkName", "sdkVersion", "getSdkVersion$annotations", "getSdkVersion", "setSdkVersion", "supportedApiFrameworks", "", "Lcom/mobilefuse/sdk/rtb/ApiFramework;", "getSupportedApiFrameworks", "()Ljava/util/Set;", "supportedClickType", "Lcom/mobilefuse/videoplayer/model/VastClickType;", "getSupportedClickType", "()Lcom/mobilefuse/videoplayer/model/VastClickType;", "supportedVastVersions", "Lcom/mobilefuse/videoplayer/model/VastVersion;", "getSupportedVastVersions", "supportedVideoContainers", "getSupportedVideoContainers", "addApplicableDataRegulations", "", "regulation", "getApplicableDataRegulations", "removeApplicableDataRegulations", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getDeviceIp$annotations() {
        }

        public static /* synthetic */ void getSdkName$annotations() {
        }

        public static /* synthetic */ void getSdkVersion$annotations() {
        }

        public static /* synthetic */ void isLimitTrackingEnabled$annotations() {
        }

        public final void addApplicableDataRegulations(@NotNull DataRegulation regulation) {
            Intrinsics.checkNotNullParameter(regulation, "regulation");
            VideoPlayerSettings.applicableDataRegulations.add(regulation);
        }

        @Nullable
        public final String getAdvertisingId() {
            return VideoPlayerSettings.advertisingId;
        }

        @NotNull
        public final Set<DataRegulation> getApplicableDataRegulations() {
            return VideoPlayerSettings.applicableDataRegulations;
        }

        @Nullable
        public final String getDeviceIp() {
            return VideoPlayerSettings.deviceIp;
        }

        @NotNull
        public final String getSdkName() {
            return VideoPlayerSettings.sdkName;
        }

        @NotNull
        public final String getSdkVersion() {
            return VideoPlayerSettings.sdkVersion;
        }

        @NotNull
        public final Set<ApiFramework> getSupportedApiFrameworks() {
            return VideoPlayerSettings.supportedApiFrameworks;
        }

        @NotNull
        public final VastClickType getSupportedClickType() {
            return VideoPlayerSettings.supportedClickType;
        }

        @NotNull
        public final Set<VastVersion> getSupportedVastVersions() {
            return VideoPlayerSettings.supportedVastVersions;
        }

        @NotNull
        public final Set<String> getSupportedVideoContainers() {
            return VideoPlayerSettings.supportedVideoContainers;
        }

        public final boolean isLimitTrackingEnabled() {
            return VideoPlayerSettings.isLimitTrackingEnabled;
        }

        public final void removeApplicableDataRegulations(@NotNull DataRegulation regulation) {
            Intrinsics.checkNotNullParameter(regulation, "regulation");
            VideoPlayerSettings.applicableDataRegulations.remove(regulation);
        }

        public final void setAdvertisingId(@Nullable String str) {
            VideoPlayerSettings.advertisingId = str;
        }

        public final void setDeviceIp(@Nullable String str) {
            VideoPlayerSettings.deviceIp = str;
        }

        public final void setLimitTrackingEnabled(boolean z10) {
            VideoPlayerSettings.isLimitTrackingEnabled = z10;
        }

        public final void setSdkName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            VideoPlayerSettings.sdkName = str;
        }

        public final void setSdkVersion(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            VideoPlayerSettings.sdkVersion = str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void addApplicableDataRegulations(@NotNull DataRegulation dataRegulation) {
        INSTANCE.addApplicableDataRegulations(dataRegulation);
    }

    @Nullable
    public static final String getAdvertisingId() {
        return advertisingId;
    }

    @NotNull
    public static final Set<DataRegulation> getApplicableDataRegulations() {
        return INSTANCE.getApplicableDataRegulations();
    }

    @Nullable
    public static final String getDeviceIp() {
        return deviceIp;
    }

    @NotNull
    public static final String getSdkName() {
        return sdkName;
    }

    @NotNull
    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static final boolean isLimitTrackingEnabled() {
        return isLimitTrackingEnabled;
    }

    public static final void removeApplicableDataRegulations(@NotNull DataRegulation dataRegulation) {
        INSTANCE.removeApplicableDataRegulations(dataRegulation);
    }

    public static final void setAdvertisingId(@Nullable String str) {
        advertisingId = str;
    }

    public static final void setDeviceIp(@Nullable String str) {
        deviceIp = str;
    }

    public static final void setLimitTrackingEnabled(boolean z10) {
        isLimitTrackingEnabled = z10;
    }

    public static final void setSdkName(@NotNull String str) {
        sdkName = str;
    }

    public static final void setSdkVersion(@NotNull String str) {
        sdkVersion = str;
    }
}
