package io.bidmachine;

import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.bigo.ads.api.AdSize;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/bidmachine/BannerAdSize;", "", "width", "", "height", "isAdaptive", "", "(IIZ)V", "getHeight", "()I", "()Z", "getWidth", "equals", "other", "hashCode", "isSuitable", "otherWidth", "otherHeight", "toSize", "Landroid/util/Size;", "toString", "", com.taurusx.tax.f.y.f66058y, "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BannerAdSize {
    private final int height;
    private final boolean isAdaptive;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final BannerAdSize Banner = new BannerAdSize(320, 50, false, 4, null);

    @NotNull
    public static final BannerAdSize Leaderboard = new BannerAdSize(728, 90, false, 4, null);

    @NotNull
    public static final BannerAdSize MediumRectangle = new BannerAdSize(300, 250, false, 4, null);

    @NotNull
    public static final BannerAdSize Undefined = new BannerAdSize(-1, -1, false, 4, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/bidmachine/BannerAdSize$Companion;", "", "()V", "Banner", "Lio/bidmachine/BannerAdSize;", "Leaderboard", "MediumRectangle", "Undefined", AdSize.ADAPTIVE, "width", "", "maxHeight", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerAdSize adaptive(int width, int maxHeight) {
            return new BannerAdSize(width, maxHeight, true, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BannerAdSize(int i10, int i11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, z10);
    }

    @NotNull
    public static final BannerAdSize adaptive(int i10, int i11) {
        return INSTANCE.adaptive(i10, i11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BannerAdSize.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.bidmachine.BannerAdSize");
        BannerAdSize bannerAdSize = (BannerAdSize) other;
        return this.width == bannerAdSize.width && this.height == bannerAdSize.height && this.isAdaptive == bannerAdSize.isAdaptive;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + androidx.compose.foundation.c.a(this.isAdaptive);
    }

    /* JADX INFO: renamed from: isAdaptive, reason: from getter */
    public final boolean getIsAdaptive() {
        return this.isAdaptive;
    }

    public final boolean isSuitable(@NotNull BannerAdSize other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return isSuitable(other.width, other.height);
    }

    @NotNull
    public final Size toSize() {
        return new Size(this.width, this.height);
    }

    @NotNull
    public String toString() {
        return "BannerAdSize(width=" + this.width + ", height=" + this.height + ", isAdaptive=" + this.isAdaptive + ')';
    }

    private BannerAdSize(int i10, int i11, boolean z10) {
        this.width = i10;
        this.height = i11;
        this.isAdaptive = z10;
    }

    public final boolean isSuitable(int otherWidth, int otherHeight) {
        int i10;
        return this.isAdaptive ? this.width >= otherWidth && ((i10 = this.height) == 0 || i10 >= otherHeight) : this.width == otherWidth && this.height == otherHeight;
    }

    /* synthetic */ BannerAdSize(int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? false : z10);
    }
}
