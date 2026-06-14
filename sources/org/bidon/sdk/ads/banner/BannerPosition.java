package org.bidon.sdk.ads.banner;

import androidx.webkit.Profile;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerPosition;", "", "<init>", "(Ljava/lang/String;I)V", "HorizontalTop", "HorizontalBottom", "VerticalLeft", "VerticalRight", y.f66058y, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BannerPosition[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final BannerPosition HorizontalTop = new BannerPosition("HorizontalTop", 0);
    public static final BannerPosition HorizontalBottom = new BannerPosition("HorizontalBottom", 1);
    public static final BannerPosition VerticalLeft = new BannerPosition("VerticalLeft", 2);
    public static final BannerPosition VerticalRight = new BannerPosition("VerticalRight", 3);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerPosition$Companion;", "", "<init>", "()V", Profile.DEFAULT_PROFILE_NAME, "Lorg/bidon/sdk/ads/banner/BannerPosition;", "getDefault", "()Lorg/bidon/sdk/ads/banner/BannerPosition;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerPosition getDefault() {
            return BannerPosition.HorizontalBottom;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BannerPosition[] $values() {
        return new BannerPosition[]{HorizontalTop, HorizontalBottom, VerticalLeft, VerticalRight};
    }

    static {
        BannerPosition[] bannerPositionArr$values = $values();
        $VALUES = bannerPositionArr$values;
        $ENTRIES = qf.a.a(bannerPositionArr$values);
        INSTANCE = new Companion(null);
    }

    private BannerPosition(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BannerPosition valueOf(String str) {
        return (BannerPosition) Enum.valueOf(BannerPosition.class, str);
    }

    public static BannerPosition[] values() {
        return (BannerPosition[]) $VALUES.clone();
    }
}
