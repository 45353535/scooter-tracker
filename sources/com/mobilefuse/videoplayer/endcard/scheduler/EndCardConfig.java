package com.mobilefuse.videoplayer.endcard.scheduler;

import androidx.collection.b;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006,"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "", "companion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "isClosable", "", "closeButtonDelaySeconds", "", "isThumbnailSize", "autoCloseAllowed", "Lkotlin/Function0;", "autoCloseDelayMillis", "", "allowClickthroughWithoutTap", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "(Lcom/mobilefuse/videoplayer/model/VastCompanion;ZFZLkotlin/jvm/functions/Function0;JZLcom/mobilefuse/sdk/CloseConfigResponse;)V", "getAllowClickthroughWithoutTap", "()Z", "getAutoCloseAllowed", "()Lkotlin/jvm/functions/Function0;", "getAutoCloseDelayMillis", "()J", "getCloseButtonDelaySeconds", "()F", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCompanion", "()Lcom/mobilefuse/videoplayer/model/VastCompanion;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class EndCardConfig {
    private final boolean allowClickthroughWithoutTap;

    @NotNull
    private final Function0<Boolean> autoCloseAllowed;
    private final long autoCloseDelayMillis;
    private final float closeButtonDelaySeconds;

    @Nullable
    private final CloseConfigResponse closeConfigResponse;

    @NotNull
    private final VastCompanion companion;
    private final boolean isClosable;
    private final boolean isThumbnailSize;

    public EndCardConfig(@NotNull VastCompanion companion, boolean z10, float f10, boolean z11, @NotNull Function0<Boolean> autoCloseAllowed, long j10, boolean z12, @Nullable CloseConfigResponse closeConfigResponse) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(autoCloseAllowed, "autoCloseAllowed");
        this.companion = companion;
        this.isClosable = z10;
        this.closeButtonDelaySeconds = f10;
        this.isThumbnailSize = z11;
        this.autoCloseAllowed = autoCloseAllowed;
        this.autoCloseDelayMillis = j10;
        this.allowClickthroughWithoutTap = z12;
        this.closeConfigResponse = closeConfigResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EndCardConfig copy$default(EndCardConfig endCardConfig, VastCompanion vastCompanion, boolean z10, float f10, boolean z11, Function0 function0, long j10, boolean z12, CloseConfigResponse closeConfigResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vastCompanion = endCardConfig.companion;
        }
        if ((i10 & 2) != 0) {
            z10 = endCardConfig.isClosable;
        }
        if ((i10 & 4) != 0) {
            f10 = endCardConfig.closeButtonDelaySeconds;
        }
        if ((i10 & 8) != 0) {
            z11 = endCardConfig.isThumbnailSize;
        }
        if ((i10 & 16) != 0) {
            function0 = endCardConfig.autoCloseAllowed;
        }
        if ((i10 & 32) != 0) {
            j10 = endCardConfig.autoCloseDelayMillis;
        }
        if ((i10 & 64) != 0) {
            z12 = endCardConfig.allowClickthroughWithoutTap;
        }
        if ((i10 & 128) != 0) {
            closeConfigResponse = endCardConfig.closeConfigResponse;
        }
        long j11 = j10;
        boolean z13 = z11;
        Function0 function02 = function0;
        float f11 = f10;
        return endCardConfig.copy(vastCompanion, z10, f11, z13, function02, j11, z12, closeConfigResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VastCompanion getCompanion() {
        return this.companion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsClosable() {
        return this.isClosable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsThumbnailSize() {
        return this.isThumbnailSize;
    }

    @NotNull
    public final Function0<Boolean> component5() {
        return this.autoCloseAllowed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @NotNull
    public final EndCardConfig copy(@NotNull VastCompanion companion, boolean isClosable, float closeButtonDelaySeconds, boolean isThumbnailSize, @NotNull Function0<Boolean> autoCloseAllowed, long autoCloseDelayMillis, boolean allowClickthroughWithoutTap, @Nullable CloseConfigResponse closeConfigResponse) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(autoCloseAllowed, "autoCloseAllowed");
        return new EndCardConfig(companion, isClosable, closeButtonDelaySeconds, isThumbnailSize, autoCloseAllowed, autoCloseDelayMillis, allowClickthroughWithoutTap, closeConfigResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndCardConfig)) {
            return false;
        }
        EndCardConfig endCardConfig = (EndCardConfig) other;
        return Intrinsics.areEqual(this.companion, endCardConfig.companion) && this.isClosable == endCardConfig.isClosable && Float.compare(this.closeButtonDelaySeconds, endCardConfig.closeButtonDelaySeconds) == 0 && this.isThumbnailSize == endCardConfig.isThumbnailSize && Intrinsics.areEqual(this.autoCloseAllowed, endCardConfig.autoCloseAllowed) && this.autoCloseDelayMillis == endCardConfig.autoCloseDelayMillis && this.allowClickthroughWithoutTap == endCardConfig.allowClickthroughWithoutTap && Intrinsics.areEqual(this.closeConfigResponse, endCardConfig.closeConfigResponse);
    }

    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @NotNull
    public final Function0<Boolean> getAutoCloseAllowed() {
        return this.autoCloseAllowed;
    }

    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    public final float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @NotNull
    public final VastCompanion getCompanion() {
        return this.companion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        VastCompanion vastCompanion = this.companion;
        int iHashCode = (vastCompanion != null ? vastCompanion.hashCode() : 0) * 31;
        boolean z10 = this.isClosable;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int iFloatToIntBits = (((iHashCode + r22) * 31) + Float.floatToIntBits(this.closeButtonDelaySeconds)) * 31;
        boolean z11 = this.isThumbnailSize;
        ?? r23 = z11;
        if (z11) {
            r23 = 1;
        }
        int i10 = (iFloatToIntBits + r23) * 31;
        Function0<Boolean> function0 = this.autoCloseAllowed;
        int iHashCode2 = (((i10 + (function0 != null ? function0.hashCode() : 0)) * 31) + b.a(this.autoCloseDelayMillis)) * 31;
        boolean z12 = this.allowClickthroughWithoutTap;
        int i11 = (iHashCode2 + (z12 ? 1 : z12)) * 31;
        CloseConfigResponse closeConfigResponse = this.closeConfigResponse;
        return i11 + (closeConfigResponse != null ? closeConfigResponse.hashCode() : 0);
    }

    public final boolean isClosable() {
        return this.isClosable;
    }

    public final boolean isThumbnailSize() {
        return this.isThumbnailSize;
    }

    @NotNull
    public String toString() {
        return "EndCardConfig(companion=" + this.companion + ", isClosable=" + this.isClosable + ", closeButtonDelaySeconds=" + this.closeButtonDelaySeconds + ", isThumbnailSize=" + this.isThumbnailSize + ", autoCloseAllowed=" + this.autoCloseAllowed + ", autoCloseDelayMillis=" + this.autoCloseDelayMillis + ", allowClickthroughWithoutTap=" + this.allowClickthroughWithoutTap + ", closeConfigResponse=" + this.closeConfigResponse + ")";
    }

    public /* synthetic */ EndCardConfig(VastCompanion vastCompanion, boolean z10, float f10, boolean z11, Function0 function0, long j10, boolean z12, CloseConfigResponse closeConfigResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vastCompanion, z10, f10, z11, function0, j10, (i10 & 64) != 0 ? false : z12, closeConfigResponse);
    }
}
