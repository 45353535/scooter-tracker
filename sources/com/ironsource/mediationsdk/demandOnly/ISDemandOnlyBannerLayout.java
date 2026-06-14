package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4527s2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes10.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f43858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISBannerSize f43859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f43861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4527s2 f43863f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f43864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f43865b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f43864a = view;
            this.f43865b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f43864a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f43864a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f43864a;
            iSDemandOnlyBannerLayout.f43858a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f43865b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f43862e = false;
        this.f43861d = activity;
        this.f43859b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f43863f = new C4527s2();
    }

    public Activity getActivity() {
        return this.f43861d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f43863f.a();
    }

    public View getBannerView() {
        return this.f43858a;
    }

    public C4527s2 getListener() {
        return this.f43863f;
    }

    public String getPlacementName() {
        return this.f43860c;
    }

    public ISBannerSize getSize() {
        return this.f43859b;
    }

    public boolean isDestroyed() {
        return this.f43862e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f43863f.b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f43863f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f43860c = str;
    }

    protected void a() {
        this.f43862e = true;
        this.f43861d = null;
        this.f43859b = null;
        this.f43860c = null;
        this.f43858a = null;
        removeBannerListener();
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f43862e = false;
    }

    void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}
