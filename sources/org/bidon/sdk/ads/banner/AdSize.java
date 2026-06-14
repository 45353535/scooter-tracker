package org.bidon.sdk.ads.banner;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/bidon/sdk/ads/banner/AdSize;", "", "widthDp", "", "heightDp", "<init>", "(II)V", "getWidthDp", "()I", "getHeightDp", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdSize {
    private final int heightDp;
    private final int widthDp;

    public AdSize(int i10, int i11) {
        this.widthDp = i10;
        this.heightDp = i11;
    }

    public static /* synthetic */ AdSize copy$default(AdSize adSize, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = adSize.widthDp;
        }
        if ((i12 & 2) != 0) {
            i11 = adSize.heightDp;
        }
        return adSize.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidthDp() {
        return this.widthDp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeightDp() {
        return this.heightDp;
    }

    @NotNull
    public final AdSize copy(int widthDp, int heightDp) {
        return new AdSize(widthDp, heightDp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) other;
        return this.widthDp == adSize.widthDp && this.heightDp == adSize.heightDp;
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    public final int getWidthDp() {
        return this.widthDp;
    }

    public int hashCode() {
        return (this.widthDp * 31) + this.heightDp;
    }

    @NotNull
    public String toString() {
        return "AdSize(widthDp=" + this.widthDp + ", heightDp=" + this.heightDp + ")";
    }
}
