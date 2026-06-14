package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.l1;
import com.startapp.sdk.internal.o1;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements BannerCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f63681b;

    public b(c cVar) {
        this.f63681b = cVar;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        BannerStandard mrec;
        if (this.f63680a) {
            throw new IllegalStateException();
        }
        int i10 = o1.f64986a[this.f63681b.f63754b.ordinal()];
        if (i10 == 1) {
            c cVar = this.f63681b;
            mrec = new Mrec(context, false, cVar.f63755c, cVar.f63756d);
        } else if (i10 != 2) {
            c cVar2 = this.f63681b;
            mrec = new Banner(context, false, cVar2.f63755c, cVar2.f63756d);
        } else {
            c cVar3 = this.f63681b;
            mrec = new Cover(context, false, cVar3.f63755c, cVar3.f63756d);
        }
        mrec.setBannerListener(bannerListener);
        mrec.addOnAttachStateChangeListener(new l1(this, mrec));
        this.f63680a = true;
        return mrec;
    }
}
