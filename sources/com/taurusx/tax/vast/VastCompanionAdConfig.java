package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.n;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001$BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cJ\u0014\u0010\u001d\u001a\u00020\u001b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\bH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006%"}, d2 = {"Lcom/taurusx/tax/vast/VastCompanionAdConfig;", "Ljava/io/Serializable;", "width", "", "height", "vastResource", "Lcom/taurusx/tax/vast/VastResource;", "clickThroughUrl", "", "clickTrackers", "", "Lcom/taurusx/tax/vast/VastTracker;", "creativeViewTrackers", "customCtaText", "(IILcom/taurusx/tax/vast/VastResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getClickThroughUrl", "()Ljava/lang/String;", "getClickTrackers", "()Ljava/util/List;", "getCreativeViewTrackers", "getCustomCtaText", "getHeight", "()I", "getVastResource", "()Lcom/taurusx/tax/vast/VastResource;", "getWidth", "addClickTrackers", "", "", "addCreativeViewTrackers", "equals", "", "other", "", "hashCode", "toString", y.f66058y, "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class VastCompanionAdConfig implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f66944n = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @SerializedName(n.f66174r)
    @Expose
    @Nullable
    public final String customCtaText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @SerializedName(n.f66180x)
    @Expose
    @Nullable
    public final String clickThroughUrl;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from toString */
    @SerializedName(n.f66153a)
    @Expose
    @NotNull
    public final List<VastTracker> clickTrackers;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from toString */
    @SerializedName(n.f66175s)
    @Expose
    @NotNull
    public final List<VastTracker> creativeViewTrackers;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from toString */
    @SerializedName("height")
    @Expose
    public final int height;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from toString */
    @SerializedName(n.f66163g)
    @Expose
    @NotNull
    public final VastResource vastResource;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from toString */
    @SerializedName("width")
    @Expose
    public final int width;

    public VastCompanionAdConfig(int i10, int i11, @NotNull VastResource vastResource, @Nullable String str, @NotNull List<VastTracker> clickTrackers, @NotNull List<VastTracker> creativeViewTrackers, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(vastResource, "vastResource");
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        Intrinsics.checkNotNullParameter(creativeViewTrackers, "creativeViewTrackers");
        this.width = i10;
        this.height = i11;
        this.vastResource = vastResource;
        this.clickThroughUrl = str;
        this.clickTrackers = clickTrackers;
        this.creativeViewTrackers = creativeViewTrackers;
        this.customCtaText = str2;
    }

    public final void addClickTrackers(@NotNull Collection<? extends VastTracker> clickTrackers) {
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        this.clickTrackers.addAll(clickTrackers);
    }

    public final void addCreativeViewTrackers(@NotNull Collection<? extends VastTracker> creativeViewTrackers) {
        Intrinsics.checkNotNullParameter(creativeViewTrackers, "creativeViewTrackers");
        this.creativeViewTrackers.addAll(creativeViewTrackers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastCompanionAdConfig)) {
            return false;
        }
        VastCompanionAdConfig vastCompanionAdConfig = (VastCompanionAdConfig) other;
        return this.width == vastCompanionAdConfig.width && this.height == vastCompanionAdConfig.height && Intrinsics.areEqual(this.vastResource, vastCompanionAdConfig.vastResource) && Intrinsics.areEqual(this.clickThroughUrl, vastCompanionAdConfig.clickThroughUrl) && Intrinsics.areEqual(this.clickTrackers, vastCompanionAdConfig.clickTrackers) && Intrinsics.areEqual(this.creativeViewTrackers, vastCompanionAdConfig.creativeViewTrackers) && Intrinsics.areEqual(this.customCtaText, vastCompanionAdConfig.customCtaText);
    }

    @Nullable
    public final String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    @NotNull
    public final List<VastTracker> getClickTrackers() {
        return this.clickTrackers;
    }

    @NotNull
    public final List<VastTracker> getCreativeViewTrackers() {
        return this.creativeViewTrackers;
    }

    @Nullable
    public final String getCustomCtaText() {
        return this.customCtaText;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final VastResource getVastResource() {
        return this.vastResource;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((this.width * 31) + this.height) * 31) + this.vastResource.hashCode()) * 31;
        String str = this.clickThroughUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clickTrackers.hashCode()) * 31) + this.creativeViewTrackers.hashCode()) * 31;
        String str2 = this.customCtaText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastCompanionAdConfig(width=" + this.width + ", height=" + this.height + ", vastResource=" + this.vastResource + ", clickThroughUrl=" + ((Object) this.clickThroughUrl) + ", clickTrackers=" + this.clickTrackers + ", creativeViewTrackers=" + this.creativeViewTrackers + ", customCtaText=" + ((Object) this.customCtaText) + ')';
    }
}
