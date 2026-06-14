package u8;

import io.bidmachine.BannerAdSize;

/* JADX INFO: loaded from: classes12.dex */
public enum e {
    Size_320x50(320, 50),
    Size_300x250(300, 250),
    Size_728x90(728, 90);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105273c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f105274a;

        static {
            int[] iArr = new int[e.values().length];
            f105274a = iArr;
            try {
                iArr[e.Size_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105274a[e.Size_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    e(int i10, int i11) {
        this.f105272b = i10;
        this.f105273c = i11;
    }

    public static e g(BannerAdSize bannerAdSize) {
        return bannerAdSize.equals(BannerAdSize.Leaderboard) ? Size_728x90 : bannerAdSize.equals(BannerAdSize.MediumRectangle) ? Size_300x250 : Size_320x50;
    }

    public static BannerAdSize h(e eVar) {
        int i10 = a.f105274a[eVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? BannerAdSize.Banner : BannerAdSize.Leaderboard : BannerAdSize.MediumRectangle;
    }
}
