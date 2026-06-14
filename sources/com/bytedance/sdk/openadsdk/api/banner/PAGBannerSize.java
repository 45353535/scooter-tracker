package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.lnr;

/* JADX INFO: loaded from: classes6.dex */
public final class PAGBannerSize {
    private int lnr = 1;
    private int mml;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16911ud;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.qdl = i10;
        this.f16911ud = i11;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        int iQdl = lnr.qdl(context, i10, 0);
        if (iQdl == lnr.qdl) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, iQdl);
        pAGBannerSize.lnr = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iQdl = lnr.qdl(context, 0);
        if (iQdl == lnr.qdl) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.mml = iQdl;
        pAGBannerSize.lnr = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.mml = i11;
        pAGBannerSize.lnr = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.f16911ud;
    }

    public int getMaxHeight() {
        return this.mml;
    }

    public int getType() {
        return this.lnr;
    }

    public int getWidth() {
        return this.qdl;
    }
}
