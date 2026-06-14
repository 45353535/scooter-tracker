package org.bidon.sdk.utils.visibilitytracker;

import androidx.compose.foundation.c;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/bidon/sdk/utils/visibilitytracker/VisibilityParams;", "", "timeThresholdMs", "", "pixelThreshold", "", "maxCountOverlappedViews", "", "isIgnoreWindowFocus", "", "isIgnoreOverlap", "<init>", "(JFIZZ)V", "getTimeThresholdMs", "()J", "getPixelThreshold", "()F", "getMaxCountOverlappedViews", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "other", "hashCode", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VisibilityParams {
    private final boolean isIgnoreOverlap;
    private final boolean isIgnoreWindowFocus;
    private final int maxCountOverlappedViews;
    private final float pixelThreshold;
    private final long timeThresholdMs;

    public VisibilityParams() {
        this(0L, 0.0f, 0, false, false, 31, null);
    }

    public static /* synthetic */ VisibilityParams copy$default(VisibilityParams visibilityParams, long j10, float f10, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = visibilityParams.timeThresholdMs;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            f10 = visibilityParams.pixelThreshold;
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            i10 = visibilityParams.maxCountOverlappedViews;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = visibilityParams.isIgnoreWindowFocus;
        }
        boolean z12 = z10;
        if ((i11 & 16) != 0) {
            z11 = visibilityParams.isIgnoreOverlap;
        }
        return visibilityParams.copy(j11, f11, i12, z12, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeThresholdMs() {
        return this.timeThresholdMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPixelThreshold() {
        return this.pixelThreshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxCountOverlappedViews() {
        return this.maxCountOverlappedViews;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsIgnoreWindowFocus() {
        return this.isIgnoreWindowFocus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsIgnoreOverlap() {
        return this.isIgnoreOverlap;
    }

    @NotNull
    public final VisibilityParams copy(long timeThresholdMs, float pixelThreshold, int maxCountOverlappedViews, boolean isIgnoreWindowFocus, boolean isIgnoreOverlap) {
        return new VisibilityParams(timeThresholdMs, pixelThreshold, maxCountOverlappedViews, isIgnoreWindowFocus, isIgnoreOverlap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisibilityParams)) {
            return false;
        }
        VisibilityParams visibilityParams = (VisibilityParams) other;
        return this.timeThresholdMs == visibilityParams.timeThresholdMs && Float.compare(this.pixelThreshold, visibilityParams.pixelThreshold) == 0 && this.maxCountOverlappedViews == visibilityParams.maxCountOverlappedViews && this.isIgnoreWindowFocus == visibilityParams.isIgnoreWindowFocus && this.isIgnoreOverlap == visibilityParams.isIgnoreOverlap;
    }

    public final int getMaxCountOverlappedViews() {
        return this.maxCountOverlappedViews;
    }

    public final float getPixelThreshold() {
        return this.pixelThreshold;
    }

    public final long getTimeThresholdMs() {
        return this.timeThresholdMs;
    }

    public int hashCode() {
        return (((((((androidx.collection.b.a(this.timeThresholdMs) * 31) + Float.floatToIntBits(this.pixelThreshold)) * 31) + this.maxCountOverlappedViews) * 31) + c.a(this.isIgnoreWindowFocus)) * 31) + c.a(this.isIgnoreOverlap);
    }

    public final boolean isIgnoreOverlap() {
        return this.isIgnoreOverlap;
    }

    public final boolean isIgnoreWindowFocus() {
        return this.isIgnoreWindowFocus;
    }

    @NotNull
    public String toString() {
        return "VisibilityParams(timeThresholdMs=" + this.timeThresholdMs + ", pixelThreshold=" + this.pixelThreshold + ", maxCountOverlappedViews=" + this.maxCountOverlappedViews + ", isIgnoreWindowFocus=" + this.isIgnoreWindowFocus + ", isIgnoreOverlap=" + this.isIgnoreOverlap + ")";
    }

    public VisibilityParams(long j10, float f10, int i10, boolean z10, boolean z11) {
        this.timeThresholdMs = j10;
        this.pixelThreshold = f10;
        this.maxCountOverlappedViews = i10;
        this.isIgnoreWindowFocus = z10;
        this.isIgnoreOverlap = z11;
    }

    public /* synthetic */ VisibilityParams(long j10, float f10, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 250L : j10, (i11 & 2) != 0 ? 0.85f : f10, (i11 & 4) != 0 ? 3 : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }
}
