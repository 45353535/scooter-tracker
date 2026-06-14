package com.pubmatic.sdk.webrendering.mraid;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;

/* JADX INFO: loaded from: classes11.dex */
class q extends RelativeLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f63396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f63397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBAdViewContainer f63398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBWebView f63399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f63400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f63401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f63402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f63404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f63405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final POBWebView.WebViewBackPress f63406k;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int deviceOrientation = POBUtils.getDeviceOrientation(q.this.f63397b);
            POBLog.debug("POBResizeView", "currentOrientation :" + q.this.f63403h + ", changedOrientation:" + deviceOrientation, new Object[0]);
            if (deviceOrientation == q.this.f63403h || !q.this.f63404i) {
                return;
            }
            q.this.b();
        }
    }

    class b implements POBWebView.WebViewBackPress {
        b() {
        }

        @Override // com.pubmatic.sdk.common.view.POBWebView.WebViewBackPress
        public void onBackPress() {
            q.this.b();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.this.b();
        }
    }

    interface d {
        void a(POBAdViewContainer pOBAdViewContainer);
    }

    q(Context context) {
        super(context);
        this.f63404i = true;
        this.f63405j = new a();
        this.f63406k = new b();
        this.f63397b = context;
    }

    public RelativeLayout d() {
        return this.f63402g;
    }

    void e() {
        ViewGroup viewGroup = this.f63396a;
        if (viewGroup != null) {
            viewGroup.bringChildToFront(this);
            this.f63396a.requestFocus();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f63405j);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return !(view instanceof POBWebView);
    }

    void a(ViewGroup viewGroup, POBAdViewContainer pOBAdViewContainer, int i10, int i11, int i12, int i13, d dVar) {
        this.f63398c = pOBAdViewContainer;
        this.f63399d = pOBAdViewContainer.getAdView();
        this.f63397b = pOBAdViewContainer.getContext();
        this.f63396a = viewGroup;
        this.f63400e = dVar;
        a(pOBAdViewContainer, i10, i11, i12, i13);
        this.f63403h = POBUtils.getDeviceOrientation(this.f63397b);
    }

    public void b() {
        POBAdViewContainer pOBAdViewContainer;
        RelativeLayout relativeLayout = this.f63402g;
        if (relativeLayout != null && this.f63398c != null && this.f63399d != null) {
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f63405j);
            this.f63402g.removeView(this.f63401f);
            this.f63402g.removeView(this.f63398c);
            this.f63399d.setWebViewBackPress(null);
        }
        setOnTouchListener(null);
        removeAllViews();
        ViewGroup viewGroup = this.f63396a;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        d dVar = this.f63400e;
        if (dVar == null || (pOBAdViewContainer = this.f63398c) == null) {
            return;
        }
        dVar.a(pOBAdViewContainer);
    }

    ImageView c() {
        return this.f63401f;
    }

    private void a(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        this.f63401f = POBUIUtil.createSkipButton(getContext(), R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        this.f63401f.setOnClickListener(new c());
        this.f63402g = new RelativeLayout(this.f63397b);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i11);
        layoutParams2.setMargins(i12, i13, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f63402g.addView(viewGroup, new RelativeLayout.LayoutParams(-1, -1));
        this.f63402g.addView(this.f63401f, layoutParams);
        addView(this.f63402g, layoutParams2);
        a(true);
        setOnTouchListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup2 = this.f63396a;
        if (viewGroup2 != null) {
            viewGroup2.addView(this, 0, layoutParams3);
        }
    }

    void a(boolean z10) {
        POBWebView pOBWebView = this.f63399d;
        if (pOBWebView != null) {
            if (z10) {
                pOBWebView.setWebViewBackPress(this.f63406k);
            } else {
                pOBWebView.setWebViewBackPress(null);
            }
        }
    }

    void a(int i10, int i11, int i12, int i13) {
        if (this.f63402g != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.setMargins(i12, i13, Integer.MIN_VALUE, Integer.MIN_VALUE);
            updateViewLayout(this.f63402g, layoutParams);
        }
    }

    void a() {
        this.f63404i = false;
    }
}
