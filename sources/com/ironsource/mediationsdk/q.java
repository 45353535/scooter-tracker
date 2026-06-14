package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C4544t2;
import com.ironsource.Da;

/* JADX INFO: loaded from: classes10.dex */
public class q extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISBannerSize f44147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f44150d;

    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public q(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f44149c = false;
        this.f44147a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    protected void a() {
        this.f44149c = true;
        this.f44147a = null;
        this.f44148b = null;
        this.f44150d = null;
        C4544t2.a().a((Da) null);
    }

    public boolean b() {
        return this.f44149c;
    }

    protected q c() {
        q qVar = new q(getContext(), this.f44147a);
        qVar.f44148b = this.f44148b;
        return qVar;
    }

    public ISBannerSize getSize() {
        return this.f44147a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f44150d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f44147a = iSBannerSize;
    }

    public q(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f44149c = false;
        this.f44147a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public q(Context context) {
        super(context);
        this.f44149c = false;
    }
}
