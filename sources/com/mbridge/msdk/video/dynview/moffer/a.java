package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.listener.g;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f52334c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f52335a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52336b = 500;

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f52340a;

        b(MOfferModel mOfferModel) {
            this.f52340a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f52340a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f52342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f52343b;

        c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f52342a = mOfferModel;
            this.f52343b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                a.this.a(this.f52342a, this.f52343b, viewGroup, campaignUnit);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean b(String str) {
        if (this.f52335a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f52335a.containsKey(str);
    }

    public static a a() {
        a aVar;
        if (f52334c != null) {
            return f52334c;
        }
        synchronized (a.class) {
            try {
                if (f52334c == null) {
                    f52334c = new a();
                }
                aVar = f52334c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$a, reason: collision with other inner class name */
    class C0585a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f52337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MOfferModel f52338b;

        C0585a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f52337a = viewGroup;
            this.f52338b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f52337a) == null) {
                return;
            }
            try {
                a.this.a(this.f52338b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
            q0.b("MOfferEnergize", str);
        }
    }

    public void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f52335a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f52335a.clear();
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.listener.a aVar) {
        if (viewGroup == null || aVar == null || this.f52335a == null || TextUtils.isEmpty(str) || !this.f52335a.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f52335a.get(str);
        MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        a(mOfferModel, viewGroup, aVar);
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new C0585a(viewGroup, mOfferModel), aVar);
        mOfferModel.showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(iA, iA, iA, iA);
        a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            a(mOfferModel, viewGroup, viewGroup2);
        } else {
            a(viewGroup, viewGroup2);
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(viewGroup2, 0, v0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.f52336b + 500);
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        RelativeLayout relativeLayout;
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                } else {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.f52336b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 != null) {
                if (viewGroup.isShown()) {
                    relativeLayout2.setVisibility(0);
                    relativeLayout2.addView(viewGroup2);
                    return;
                }
                return;
            }
            viewGroup.addView(viewGroup2);
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.mbridge.msdk.video.dynview.moffer.MOfferModel r8, android.view.ViewGroup r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.a.a(com.mbridge.msdk.video.dynview.moffer.MOfferModel, android.view.ViewGroup, android.view.ViewGroup):void");
    }

    private void a(ViewGroup viewGroup) {
        View viewFindViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getDrawable(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable != null && (viewFindViewById = viewGroup.findViewById(a("mbridge_moreoffer_hls"))) != null) {
                    viewFindViewById.setBackground(drawable);
                }
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f52335a == null) {
            this.f52335a = new ConcurrentHashMap();
        }
        if (this.f52335a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f52335a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(CampaignEx campaignEx, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f52335a == null) {
            this.f52335a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f52335a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    private int a(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }
}
