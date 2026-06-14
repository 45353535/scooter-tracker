package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import androidx.compose.foundation.c;
import com.adjust.sdk.Constants;
import com.inmobi.media.A8;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/inmobi/media/ads/network/common/model/InlineParams;", "", "url", "", Constants.REFERRER, "listing", "overlay", "", "callerBundleId", "targetBundleId", "pingInWebView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getReferrer", "getListing", "getOverlay", "()Z", "getCallerBundleId", "setCallerBundleId", "(Ljava/lang/String;)V", "getTargetBundleId", "setTargetBundleId", "getPingInWebView", "setPingInWebView", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InlineParams {

    @A8
    @Nullable
    private String callerBundleId;

    @Nullable
    private final String listing;
    private final boolean overlay;

    @A8
    private boolean pingInWebView;

    @Nullable
    private final String referrer;

    @A8
    @Nullable
    private String targetBundleId;

    @NotNull
    private final String url;

    public InlineParams() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ InlineParams copy$default(InlineParams inlineParams, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i10 & 2) != 0) {
            str2 = inlineParams.referrer;
        }
        if ((i10 & 4) != 0) {
            str3 = inlineParams.listing;
        }
        if ((i10 & 8) != 0) {
            z10 = inlineParams.overlay;
        }
        if ((i10 & 16) != 0) {
            str4 = inlineParams.callerBundleId;
        }
        if ((i10 & 32) != 0) {
            str5 = inlineParams.targetBundleId;
        }
        if ((i10 & 64) != 0) {
            z11 = inlineParams.pingInWebView;
        }
        String str6 = str5;
        boolean z12 = z11;
        String str7 = str4;
        String str8 = str3;
        return inlineParams.copy(str, str2, str8, z10, str7, str6, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getListing() {
        return this.listing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOverlay() {
        return this.overlay;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    @NotNull
    public final InlineParams copy(@NotNull String url, @Nullable String referrer, @Nullable String listing, boolean overlay, @Nullable String callerBundleId, @Nullable String targetBundleId, boolean pingInWebView) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new InlineParams(url, referrer, listing, overlay, callerBundleId, targetBundleId, pingInWebView);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineParams)) {
            return false;
        }
        InlineParams inlineParams = (InlineParams) other;
        return Intrinsics.areEqual(this.url, inlineParams.url) && Intrinsics.areEqual(this.referrer, inlineParams.referrer) && Intrinsics.areEqual(this.listing, inlineParams.listing) && this.overlay == inlineParams.overlay && Intrinsics.areEqual(this.callerBundleId, inlineParams.callerBundleId) && Intrinsics.areEqual(this.targetBundleId, inlineParams.targetBundleId) && this.pingInWebView == inlineParams.pingInWebView;
    }

    @Nullable
    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    @Nullable
    public final String getListing() {
        return this.listing;
    }

    public final boolean getOverlay() {
        return this.overlay;
    }

    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    @Nullable
    public final String getReferrer() {
        return this.referrer;
    }

    @Nullable
    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.referrer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.listing;
        int iA = (c.a(this.overlay) + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.callerBundleId;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetBundleId;
        return c.a(this.pingInWebView) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setCallerBundleId(@Nullable String str) {
        this.callerBundleId = str;
    }

    public final void setPingInWebView(boolean z10) {
        this.pingInWebView = z10;
    }

    public final void setTargetBundleId(@Nullable String str) {
        this.targetBundleId = str;
    }

    @NotNull
    public String toString() {
        return "InlineParams(url=" + this.url + ", referrer=" + this.referrer + ", listing=" + this.listing + ", overlay=" + this.overlay + ", callerBundleId=" + this.callerBundleId + ", targetBundleId=" + this.targetBundleId + ", pingInWebView=" + this.pingInWebView + ")";
    }

    public InlineParams(@NotNull String url, @Nullable String str, @Nullable String str2, boolean z10, @Nullable String str3, @Nullable String str4, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.referrer = str;
        this.listing = str2;
        this.overlay = z10;
        this.callerBundleId = str3;
        this.targetBundleId = str4;
        this.pingInWebView = z11;
    }

    public /* synthetic */ InlineParams(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "https://play.google.com/d?" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? false : z11);
    }
}
