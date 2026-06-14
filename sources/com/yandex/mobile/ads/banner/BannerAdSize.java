package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.lx2;
import yads.mx2;
import yads.rg2;
import yads.zt0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdSize;", "Lyads/rg2;", "Lyads/mx2;", "sizeInfo", "<init>", "(Lyads/mx2;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHeight", "height", "getWidth", "width", "a", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class BannerAdSize extends rg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mx2 f68172b;

    /* JADX INFO: renamed from: com.yandex.mobile.ads.banner.BannerAdSize$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdSize$a;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "width", "height", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "fixedSize", "(Landroid/content/Context;II)Lcom/yandex/mobile/ads/banner/BannerAdSize;", "maxHeight", "inlineSize", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerAdSize fixedSize(@NotNull Context context, int width, int height) {
            return new BannerAdSize(new zt0(width, height, lx2.f113263c));
        }

        @NotNull
        public final BannerAdSize inlineSize(@NotNull Context context, int width, int maxHeight) {
            return new BannerAdSize(new zt0(width, maxHeight, lx2.f113264d));
        }

        private Companion() {
        }
    }

    public BannerAdSize(@NotNull mx2 mx2Var) {
        this.f68172b = mx2Var;
    }

    @NotNull
    public static final BannerAdSize fixedSize(@NotNull Context context, int i10, int i11) {
        return INSTANCE.fixedSize(context, i10, i11);
    }

    @NotNull
    public static final BannerAdSize inlineSize(@NotNull Context context, int i10, int i11) {
        return INSTANCE.inlineSize(context, i10, i11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    protected final mx2 getF68172b() {
        return this.f68172b;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(BannerAdSize.class, other.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f68172b, ((BannerAdSize) other).f68172b);
    }

    public final int getHeight() {
        return this.f68172b.getHeight();
    }

    public final int getWidth() {
        return this.f68172b.getWidth();
    }

    public int hashCode() {
        return this.f68172b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f68172b.toString();
    }
}
