package com.mobilefuse.sdk.video;

import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/video/AdmClickInfo;", "", "clickThroughUrl", "", "clickTracking", "", "(Ljava/lang/String;Ljava/util/List;)V", "getClickThroughUrl", "()Ljava/lang/String;", "getClickTracking", "()Ljava/util/List;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class AdmClickInfo {

    @NotNull
    private final String clickThroughUrl;

    @NotNull
    private final List<String> clickTracking;

    public AdmClickInfo(@NotNull String clickThroughUrl, @NotNull List<String> clickTracking) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        this.clickThroughUrl = clickThroughUrl;
        this.clickTracking = clickTracking;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdmClickInfo copy$default(AdmClickInfo admClickInfo, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = admClickInfo.clickThroughUrl;
        }
        if ((i10 & 2) != 0) {
            list = admClickInfo.clickTracking;
        }
        return admClickInfo.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    @NotNull
    public final List<String> component2() {
        return this.clickTracking;
    }

    @NotNull
    public final AdmClickInfo copy(@NotNull String clickThroughUrl, @NotNull List<String> clickTracking) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        return new AdmClickInfo(clickThroughUrl, clickTracking);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdmClickInfo)) {
            return false;
        }
        AdmClickInfo admClickInfo = (AdmClickInfo) other;
        return Intrinsics.areEqual(this.clickThroughUrl, admClickInfo.clickThroughUrl) && Intrinsics.areEqual(this.clickTracking, admClickInfo.clickTracking);
    }

    @NotNull
    public final String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    @NotNull
    public final List<String> getClickTracking() {
        return this.clickTracking;
    }

    public int hashCode() {
        String str = this.clickThroughUrl;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.clickTracking;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdmClickInfo(clickThroughUrl=" + this.clickThroughUrl + ", clickTracking=" + this.clickTracking + ")";
    }
}
