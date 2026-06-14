package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;

/* JADX INFO: loaded from: classes10.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f49494g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f49495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f49496i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49497f;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    protected boolean a() {
        return this.f49497f;
    }

    public int getOrientation() {
        return f49494g;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f49494g, f49496i, f49495h);
    }

    private void a(int i10, int i11) {
        int iN = m0.n(c.n().d());
        int iM = m0.m(c.n().d());
        int i12 = f49494g;
        if (i12 == 1) {
            if (iM > i11 * 4) {
                setHeight(iM - i11);
                setWidth(iN);
                return;
            } else {
                setHeight(0);
                setWidth(0);
                return;
            }
        }
        if (i12 == 2) {
            if (iN > i10 * 4) {
                setWidth(iN - i10);
                setHeight(iM);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
    }

    public SplashBidRequestParams(String str, String str2, boolean z10, int i10, int i11, int i12) {
        this(str, str2, "", z10, i10, i12, i11);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z10, int i10, int i11, int i12) {
        super(str, str2, str3, 0, 0);
        this.f49497f = false;
        f49494g = i10;
        a(i11, i12);
        this.f49497f = z10;
    }
}
