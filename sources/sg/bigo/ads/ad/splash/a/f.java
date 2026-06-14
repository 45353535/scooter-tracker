package sg.bigo.ads.ad.splash.a;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f101971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f101972m;

    public f(int i10, @NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(fVar, mVar, mVar2, bVar);
        this.f101971l = i10;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    protected final void a(ViewGroup viewGroup, int i10) {
        this.f101972m = i10;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    protected final int e() {
        return 5 == this.f101971l ? R.layout.bigo_ad_splash_style_5_card_widget : R.layout.bigo_ad_splash_style_4_cta_widget;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r18, @androidx.annotation.NonNull final android.view.ViewGroup r19, int r20) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.splash.a.f.a(boolean, android.view.ViewGroup, int):void");
    }
}
