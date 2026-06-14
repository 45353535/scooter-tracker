package com.facebook.ads.redexgen.core;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C17140h extends C18676g {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C17140h(C2820dL c2820dL) {
        super(c2820dL);
        setCarouselLayoutManager(c2820dL);
    }

    public FG getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C18676g
    public C3000gI getLayoutManager() {
        return (C3000gI) super.getLayoutManager();
    }

    public QT getOnScrollListener() {
        return new OC(this);
    }

    private void setCarouselLayoutManager(C2820dL c2820dL) {
        C3000gI c3000gI = new C3000gI(c2820dL, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c3000gI.A1T(true);
        }
        super.setLayoutManager(c3000gI);
    }

    @Override // com.facebook.ads.redexgen.core.C18676g
    public void setLayoutManager(QO qo) {
    }
}
