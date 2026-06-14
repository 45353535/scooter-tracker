package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.listener.impl.i;
import com.mbridge.msdk.video.module.listener.impl.k;
import com.mbridge.msdk.video.module.listener.impl.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private com.mbridge.msdk.video.signal.factory.b Q;
    private boolean R;
    private boolean S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgePlayableView f52554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeClickCTAView f52555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeClickMiniCardView f52556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MBridgeNativeEndCardView f52557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MBridgeH5EndCardView f52558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MBridgeVastEndCardView f52559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MBridgeLandingPageView f52560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MBridgeVideoEndCoverView f52561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MBridgeAlertWebview f52562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeOrderCampView f52563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f52564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f52565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f52566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f52567z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f52568a;

        a(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f52568a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f52568a, Integer.valueOf(mBridgeContainerView.f52527b.getVideo_end_type()));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f52570a;

        b(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f52570a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f52570a, Integer.valueOf(mBridgeContainerView.f52527b.getVideo_end_type()));
        }
    }

    class c implements com.mbridge.msdk.video.dynview.listener.b {
        c() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void a() {
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeContainerView.this.notifyListener;
            if (aVar != null) {
                aVar.a(117, "");
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void b() {
            if (MBridgeContainerView.this.f52527b.getAdSpaceT() == 2) {
                MBridgeContainerView.this.showVideoEndCover();
            } else {
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f52527b.getVideo_end_type());
            }
        }
    }

    class d extends i {
        d(com.mbridge.msdk.video.module.listener.a aVar) {
            super(aVar);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.i, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            super.a(i10, obj);
            if (i10 == 100) {
                MBridgeContainerView.this.webviewshow();
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                n nVar = new n();
                nVar.n(MBridgeContainerView.this.f52527b.getRequestId());
                nVar.o(MBridgeContainerView.this.f52527b.getRequestIdNotice());
                nVar.b(MBridgeContainerView.this.f52527b.getId());
                nVar.b(MBridgeContainerView.this.f52527b.isMraid() ? n.N : n.O);
                MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                g.d(nVar, mBridgeContainerView2.f52526a, mBridgeContainerView2.f52564w);
            }
        }
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.f52566y = 1;
        this.f52567z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void addCTAView() {
        if (this.f52555n == null) {
            b(-1);
        }
        if (this.f52555n != null) {
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f52555n, 0, layoutParams);
            }
        }
    }

    private void b(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        if (this.f52561t == null) {
            MBridgeVideoEndCoverView mBridgeVideoEndCoverView = new MBridgeVideoEndCoverView(this.f52526a);
            this.f52561t = mBridgeVideoEndCoverView;
            mBridgeVideoEndCoverView.setCampaign(this.f52527b);
            this.f52561t.setNotifyListener(new i(this.notifyListener));
            this.f52561t.preLoadData(bVar);
        }
    }

    private void e() {
        if (this.f52562u == null) {
            q();
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f52562u;
        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
            removeView(this.f52562u);
        }
        addView(this.f52562u);
    }

    private void f() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            boolean zIsDynamicView = campaignEx.isDynamicView();
            boolean zL = v0.l(this.f52527b.getendcard_url());
            if (zIsDynamicView && !zL && !this.f52527b.isMraid()) {
                j();
                return;
            }
        }
        if (this.f52566y != 2 || this.I) {
            j();
        } else {
            g();
        }
    }

    private void g() {
        if (this.f52558q == null) {
            a(this.Q, (Integer) 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            j();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f52558q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f52558q.setError(true);
            }
        } else {
            this.I = true;
            addView(this.f52558q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f52558q.excuteTask();
            this.f52558q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            n nVar = new n();
            nVar.n(this.f52527b.getRequestId());
            nVar.o(this.f52527b.getRequestIdNotice());
            nVar.b(this.f52527b.getId());
            nVar.b(this.f52527b.isMraid() ? n.N : n.O);
            g.d(nVar, this.f52526a, this.f52564w);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f52558q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f52564w);
        }
    }

    private void h() {
        if (this.f52560s == null) {
            a(this.Q, (Integer) 4);
        }
        this.f52560s.setUnitId(this.f52564w);
        this.f52560s.preLoadData(this.Q);
        addView(this.f52560s);
    }

    private void i() {
        if (this.f52556o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.E) {
            this.E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f52556o, layoutParams);
    }

    private void j() {
        this.f52566y = 1;
        if (this.f52557p == null) {
            a(this.Q, (Integer) 2);
        }
        addView(this.f52557p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f52557p.notifyShowListener();
        this.S = true;
        bringToFront();
    }

    private void k() {
        if (this.f52554m == null) {
            preLoadData(this.Q);
        }
        addView(this.f52554m);
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.f52564w);
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null && campaignEx.isMraid() && this.f52527b.getPlayable_ads_without_video() == 2) {
                this.f52554m.setCloseVisible(0);
            }
            this.f52554m.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
    }

    private void l() {
        if (this.f52559r == null) {
            a(this.Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f52559r, layoutParams);
        this.f52559r.notifyShowListener();
    }

    private void m() {
        if (this.f52561t == null) {
            b(this.Q);
        }
        addView(this.f52561t);
        onConfigurationChanged(getResources().getConfiguration());
        this.S = true;
        bringToFront();
    }

    private boolean n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    private void o() {
        this.C = false;
        this.S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof MBridgeContainerView) {
                    i10++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void p() {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i10 = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(c1.a(str, "ecid"));
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage());
            }
        }
        this.f52557p = new MBridgeNativeEndCardView(this.f52526a, null, true, i10, this.f52527b.getAdSpaceT() == 2, this.f52536k, this.f52527b.getMof_tplid());
        if (this.f52527b.getDynamicTempCode() != 5) {
            this.f52557p.setCampaign(this.f52527b);
            return;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f52527b);
        }
        this.f52557p.setCampaign(this.f52527b);
    }

    private void q() {
        if (this.f52562u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f52526a);
            this.f52562u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f52564w);
            this.f52562u.setCampaign(this.f52527b);
        }
        this.f52562u.preLoadData(this.Q);
    }

    private void r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.T = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == null) {
            q0.b(MBridgeBaseView.TAG, "view is null");
        } else {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.f52557p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f52560s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f52556o.resizeMiniCard(i10, i11);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        return mBridgeH5EndCardView == null ? this.f52554m : mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f52527b.isDynamicView() || !TextUtils.isEmpty(this.f52527b.getendcard_url())) {
            return null;
        }
        int size = this.T.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (this.T.get(i11) != null && this.T.get(i11).getId() == this.f52527b.getId()) {
                    i10 = i11 - 1;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 < 0 || i10 >= size || this.T.get(i10) == null) {
            return null;
        }
        return this.T.get(i10);
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.f52564w;
    }

    public int getVideoInteractiveType() {
        return this.f52565x;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView == null) {
            f();
            return;
        }
        mBridgeH5EndCardView.handlerPlayableException(str);
        if (this.I) {
            f();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.R && !this.S) {
            o();
            this.R = false;
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f52562u;
        if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f52562u);
        MBridgeClickCTAView mBridgeClickCTAView = this.f52555n;
        if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
            return;
        }
        r();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration, this.f52554m, this.f52555n, this.f52556o, this.f52557p, this.f52558q, this.f52559r, this.f52560s, this.f52561t);
    }

    public void onEndcardBackPress() {
        if (this.f52557p != null || this.f52559r != null) {
            this.notifyListener.a(104, "");
            try {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                return;
            }
        }
        if (this.f52560s != null) {
            this.notifyListener.a(103, "");
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            this.notifyListener.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        a(this.f52554m, this.f52556o, this.f52558q, this.f52562u);
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                a(bVar);
            } else {
                b(this.f52565x);
                if (this.f52527b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f52527b.getVideo_end_type()));
                    } catch (Throwable th2) {
                        q0.b(MBridgeBaseView.TAG, th2.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(bVar));
                    }
                    if (!v0.l(this.f52527b.getendcard_url())) {
                        try {
                            String strA = c1.a(this.f52527b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f52527b, 2);
                            }
                        } catch (Exception e10) {
                            q0.b(MBridgeBaseView.TAG, e10.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(bVar), getVideoSkipTime());
                }
            }
            q();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i10);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f52558q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f52560s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f52557p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f52557p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i10, i11);
            this.f52556o.setRadius(i12);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
        }
    }

    public void setCloseDelayTime(int i10) {
        this.f52567z = i10;
    }

    public void setEndscreenType(int i10) {
        this.f52566y = i10;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f52556o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        q0.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i10)));
        this.O = i10;
        this.K = i11;
        this.L = i12;
        this.M = i13;
        this.N = i14;
        this.P = d0.a(i10, i11, i12, i13, i14);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f52557p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f52577p != null) {
            mBridgeH5EndCardView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f52558q.f52577p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null && mBridgePlayableView.f52577p != null) {
            mBridgePlayableView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f52554m.f52577p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f52563v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i11, i12, i13, i14);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        super.setNotifyListener(aVar);
        a(aVar, this.f52554m, this.f52555n, this.f52556o, this.f52557p, this.f52558q, this.f52559r, this.f52560s, this.f52561t);
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f52557p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f52557p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.A = i10;
    }

    public void setRewardStatus(boolean z10) {
        this.J = z10;
    }

    public void setShowingTransparent(boolean z10) {
        this.D = z10;
    }

    public void setUnitID(String str) {
        this.f52564w = str;
    }

    public void setVideoInteractiveType(int i10) {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            this.f52565x = i10;
            return;
        }
        int iB = com.mbridge.msdk.video.dynview.util.a.b(this.f52527b);
        if (iB == 100) {
            this.f52565x = i10;
        } else {
            this.f52565x = iB;
        }
    }

    public void setVideoSkipTime(int i10) {
        this.H = i10;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f52562u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!n() && !this.S) {
            removeAllViews();
            bringToFront();
            this.R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        e();
        setBackgroundColor(0);
        this.f52562u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            if (i10 == 1) {
                this.notifyListener.a(104, "");
            } else if (i10 == 100) {
                if (campaignEx.getPlayable_ads_without_video() == 2) {
                    this.G = true;
                }
                a(this.f52554m);
                setMatchParent();
                j();
            } else if (i10 == 3) {
                removeAllViews();
                setMatchParent();
                l();
                this.S = true;
                bringToFront();
            } else if (i10 == 4) {
                this.notifyListener.a(113, "");
                removeAllViews();
                setMatchParent();
                h();
                this.S = true;
                bringToFront();
            } else if (i10 != 5) {
                removeAllViews();
                setMatchParent();
                this.S = true;
                bringToFront();
                f();
                this.notifyListener.a(117, "");
            } else {
                this.notifyListener.a(106, "");
            }
        }
        this.B = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i10, i11, i12, i13);
            this.f52556o.setRadius(i14);
            this.f52556o.setCloseVisible(8);
            this.f52556o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
            if (this.F) {
                return;
            }
            this.F = true;
            this.notifyListener.a(109, "");
            this.notifyListener.a(117, "");
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f52526a);
        this.f52563v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.T);
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.T);
        }
        this.f52563v.setNotifyListener(new i(this.notifyListener));
        this.f52563v.setRewarded(this.J);
        this.f52563v.setNotchPadding(this.K, this.L, this.M, this.N);
        this.f52563v.setCampOrderViewBuildCallback(new c());
        this.f52563v.createView(this);
    }

    public void showPlayableView() {
        if (this.f52527b == null || this.G) {
            return;
        }
        removeAllViews();
        setMatchParent();
        k();
        this.S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        if (this.f52527b != null) {
            if (i10 == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                o();
                return;
            }
            if (i10 == 1) {
                if (this.B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.f52558q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.f52556o);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.f52555n;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        CampaignEx campaignEx = this.f52527b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 1) {
                            this.S = true;
                            addCTAView();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.f52555n;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.f52555n);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f52562u;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f52556o;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx2 = this.f52527b;
                        if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            i();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    o();
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f52558q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f52558q);
                }
                this.notifyListener.a(112, "");
                CampaignEx campaignEx3 = this.f52527b;
                if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                    this.f52527b.setHasReportAdTrackPause(true);
                    com.mbridge.msdk.video.module.report.b.c(this.f52526a, this.f52527b);
                }
                if (this.D) {
                    this.notifyListener.a(115, "");
                } else {
                    this.S = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.C = true;
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f52554m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f52558q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i10);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f52527b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
        if (this.f52527b != null) {
            this.notifyListener.a(122, "");
            this.notifyListener.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            e eVar = new e();
            eVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f52527b, eVar);
        } catch (Exception unused) {
        }
        b(this.f52554m, this.f52556o, this.f52558q, this.f52562u);
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            q0.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a(com.mbridge.msdk.video.signal.factory.b bVar) {
        if (this.f52554m == null) {
            this.f52554m = new MBridgePlayableView(this.f52526a);
        }
        this.f52554m.setCloseDelayShowTime(this.f52567z);
        this.f52554m.setPlayCloseBtnTm(this.A);
        this.f52554m.setCampaign(this.f52527b);
        this.f52554m.setNotifyListener(new d(this.notifyListener));
        this.f52554m.preLoadData(bVar);
    }

    private void b(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (this.f52555n == null) {
                    this.f52555n = new MBridgeClickCTAView(this.f52526a);
                }
                this.f52555n.setCampaign(this.f52527b);
                this.f52555n.setUnitId(this.f52564w);
                this.f52555n.setNotifyListener(new i(this.notifyListener));
                this.f52555n.preLoadData(this.Q);
                return;
            }
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f52556o == null) {
                this.f52556o = new MBridgeClickMiniCardView(this.f52526a);
            }
            this.f52556o.setCampaign(this.f52527b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f52556o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(mBridgeClickMiniCardView, this.notifyListener));
            this.f52556o.preLoadData(this.Q);
            setMatchParent();
            i();
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.signal.factory.b bVar, Integer num) {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.module.listener.a aVar;
        CampaignEx campaignEx2;
        this.Q = bVar;
        CampaignEx campaignEx3 = this.f52527b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.f52559r == null) {
                        this.f52559r = new MBridgeVastEndCardView(this.f52526a);
                    }
                    this.f52559r.setCampaign(this.f52527b);
                    this.f52559r.setNotifyListener(new l(this.notifyListener));
                    this.f52559r.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.f52560s == null) {
                        this.f52560s = new MBridgeLandingPageView(this.f52526a);
                    }
                    this.f52560s.setCampaign(this.f52527b);
                    this.f52560s.setNotifyListener(new i(this.notifyListener));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.f52566y == 2) {
                        boolean zIsDynamicView = this.f52527b.isDynamicView();
                        boolean zL = v0.l(this.f52527b.getendcard_url());
                        if ((zIsDynamicView && !zL && (campaignEx2 = this.f52527b) != null && !campaignEx2.isMraid()) || (campaignEx = this.f52527b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.f52558q == null) {
                            this.f52558q = new MBridgeH5EndCardView(this.f52526a);
                            try {
                                e eVar = new e();
                                eVar.a("type", 3);
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", this.f52527b, eVar);
                            } catch (Throwable th2) {
                                q0.b(MBridgeBaseView.TAG, th2.getMessage());
                            }
                        }
                        if (this.f52527b.getDynamicTempCode() == 5 && (aVar = this.notifyListener) != null && (aVar instanceof k)) {
                            ((k) aVar).a(this.f52527b);
                        }
                        this.f52558q.setCampaign(this.f52527b);
                        this.f52558q.setCloseDelayShowTime(this.f52567z);
                        this.f52558q.setNotifyListener(new i(this.notifyListener));
                        this.f52558q.setUnitId(this.f52564w);
                        this.f52558q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                        this.f52558q.preLoadData(bVar);
                        if (this.D) {
                            return;
                        }
                        addView(this.f52558q);
                        return;
                    }
                    CampaignEx campaignEx4 = this.f52527b;
                    int iG = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : this.f52527b.getRewardTemplateMode().g();
                    if (this.f52557p == null) {
                        CampaignEx campaignEx5 = this.f52527b;
                        if (campaignEx5 != null && campaignEx5.isDynamicView()) {
                            p();
                        } else {
                            Context context = this.f52526a;
                            CampaignEx campaignEx6 = this.f52527b;
                            boolean z10 = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = this.f52527b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, null, false, -1, z10, iG, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.f52557p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f52527b);
                        }
                    }
                    this.f52557p.setLayout();
                    if (this.f52527b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().b(this.f52527b.getRequestId() + "_" + this.f52527b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f52557p, this.f52527b.getRequestId() + "_" + this.f52527b.getId(), new i(this.notifyListener));
                            } catch (Exception e10) {
                                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                            }
                        } else {
                            try {
                                String strA = c1.a(this.f52527b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f52527b, this.f52557p, new i(this.notifyListener), 2);
                                }
                            } catch (Exception e11) {
                                q0.b(MBridgeBaseView.TAG, e11.getMessage());
                            }
                        }
                    }
                    this.f52557p.setUnitId(this.f52564w);
                    this.f52557p.setCloseBtnDelay(this.f52567z);
                    this.f52557p.setNotifyListener(new i(this.notifyListener));
                    this.f52557p.preLoadData(bVar);
                    this.f52557p.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52566y = 1;
        this.f52567z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void b(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(com.mbridge.msdk.video.module.listener.a aVar, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(this.f52556o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }
}
