package sg.bigo.ads.ad.interstitial.multi_img;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public enum d {
    NONE(0, 3, 20, 0, 1.0f, 1.0f),
    LTR(1, 1, 20, 12, 1.0f, 1.0f),
    CENTER(2, 2, 30, 12, 0.8f, 0.9f),
    FULL(3, 3, 20, 0, 1.0f, 1.0f),
    TILE(Integer.MIN_VALUE, Integer.MIN_VALUE, 20, 12, 1.0f, 1.0f);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f101478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f101479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f101480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f101481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f101482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f101483k;

    d(int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f101483k = i10;
        this.f101482j = i11;
        this.f101481i = i12;
        this.f101478f = i13;
        this.f101479g = f10;
        this.f101480h = f11;
    }

    @NonNull
    public static d a(int i10) {
        return i10 != Integer.MIN_VALUE ? i10 != 1 ? i10 != 2 ? i10 != 3 ? NONE : FULL : CENTER : LTR : TILE;
    }
}
