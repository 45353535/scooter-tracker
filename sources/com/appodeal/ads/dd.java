package com.appodeal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class dd extends ac {
    public dd() {
        super(t7.f14865d);
    }

    @Override // com.appodeal.ads.ac
    public final boolean A(View view) {
        return view instanceof BannerView;
    }

    @Override // com.appodeal.ads.ac
    public final void D(Activity activity) {
        ee.a().g(activity, new ae());
    }
}
