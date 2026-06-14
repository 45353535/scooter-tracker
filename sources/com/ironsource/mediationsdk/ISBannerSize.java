package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.V7;
import com.unity3d.mediation.LevelPlayAdSize;

/* JADX INFO: loaded from: classes10.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    V7 f43747e;
    public static final ISBannerSize BANNER = l.a("BANNER", 320, 50);
    public static final ISBannerSize LARGE = l.a(l.f44062b, 320, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f44063c, 300, 250);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final ISBannerSize f43742f = l.a();
    public static final ISBannerSize SMART = l.a(l.f44065e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return l.b(i10);
    }

    void a(V7 v72) {
        if (l.a(v72, this.f43743a, this.f43744b)) {
            this.f43747e = v72;
        }
    }

    public String getDescription() {
        return this.f43745c;
    }

    public int getHeight() {
        return this.f43744b;
    }

    public int getWidth() {
        return this.f43743a;
    }

    public boolean isAdaptive() {
        return this.f43746d;
    }

    public boolean isSmart() {
        return this.f43745c.equals(l.f44065e);
    }

    public void setAdaptive(boolean z10) {
        this.f43746d = z10;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f43747e.d()));
        }
        String description = getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f43743a, this.f43744b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f43745c = str;
        this.f43743a = i10;
        this.f43744b = i11;
        this.f43747e = new V7(i10, i11);
    }
}
