package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/mobile/ads/common/Creative;", "", "", "creativeId", "campaignId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCreativeId", "b", "getCampaignId", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Creative {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String creativeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String campaignId;

    public Creative(@Nullable String str, @Nullable String str2) {
        this.creativeId = str;
        this.campaignId = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Creative)) {
            return false;
        }
        Creative creative = (Creative) other;
        return Intrinsics.areEqual(this.creativeId, creative.creativeId) && Intrinsics.areEqual(this.campaignId, creative.campaignId);
    }

    public int hashCode() {
        String str = this.creativeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Creative(creativeId=" + this.creativeId + ", campaignId=" + this.campaignId + ")";
    }
}
