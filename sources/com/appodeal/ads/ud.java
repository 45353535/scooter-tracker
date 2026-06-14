package com.appodeal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class ud extends ac {
    public ud() {
        super(t7.f14869h);
    }

    @Override // com.appodeal.ads.ac
    public final boolean A(View view) {
        return view instanceof MrecView;
    }

    @Override // com.appodeal.ads.ac
    public final void D(Activity activity) {
        ve.a().g(activity, new re());
    }
}
