package com.mbridge.msdk.video.dynview.ordercamp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52345a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f52346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f52347c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$a, reason: collision with other inner class name */
    class C0586a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f52348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f52349b;

        C0586a(ImageView imageView, boolean z10) {
            this.f52348a = imageView;
            this.f52349b = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (this.f52349b) {
                this.f52348a.setVisibility(8);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f52348a.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("OrderCampAdapter", th2.getMessage());
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f52351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MBRotationView f52352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        MBridgeImageView f52353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RoundImageView f52354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        TextView f52355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        TextView f52356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        TextView f52357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        TextView f52358h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f52359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ImageView f52360j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        ImageView f52361k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f52362l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f52363m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f52364n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f52365o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        MBFrameLayout f52366p;

        b() {
        }
    }

    public a(List<CampaignEx> list) {
        this.f52347c = list;
    }

    private void a(int i10, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f52347c;
        if (list == null || this.f52346b == null || list.size() == 0) {
            return;
        }
        MBridgeImageView mBridgeImageView = this.f52346b.f52353c;
        if (mBridgeImageView != null) {
            a(mBridgeImageView, this.f52347c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f52346b.f52361k;
        if (imageView != null) {
            a(imageView, this.f52347c.get(i10).getImageUrl(), false);
        }
        RoundImageView roundImageView = this.f52346b.f52354d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f52346b.f52354d, this.f52347c.get(i10).getIconUrl(), true);
        }
        double rating = this.f52347c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f52346b.f52359i;
        if (mBridgeLevelLayoutView != null) {
            mBridgeLevelLayoutView.setRatingAndUser(rating, this.f52347c.get(i10).getNumberRating());
            this.f52346b.f52359i.setOrientation(0);
        }
        MBRotationView mBRotationView = this.f52346b.f52352b;
        if (mBRotationView != null) {
            mBRotationView.setWidthRatio(1.0f);
            this.f52346b.f52352b.setHeightRatio(1.0f);
            this.f52346b.f52352b.setAutoscroll(false);
        }
        MBridgeImageView mBridgeImageView2 = this.f52346b.f52353c;
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private View b(int i10) throws Throwable {
        View viewA;
        String cMPTEntryUrl;
        String str;
        try {
            List<CampaignEx> list = this.f52347c;
            cMPTEntryUrl = "";
            if (list == null || list.get(i10) == null) {
                str = "501";
            } else {
                str = this.f52347c.get(i10).getMof_tplid() + "";
                cMPTEntryUrl = this.f52347c.get(i10).getCMPTEntryUrl();
            }
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
            viewA = null;
        }
        if (TextUtils.isEmpty(cMPTEntryUrl)) {
            return a();
        }
        int iF = m0.F(com.mbridge.msdk.foundation.controller.c.n().d());
        String strA = z.a(0, str, cMPTEntryUrl);
        if (TextUtils.isEmpty(strA)) {
            return a();
        }
        File file = new File(strA + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> listA = o0.a(strA, "template_" + str + "_" + iF + "_item");
            if (listA == null) {
                return a();
            }
            viewA = a(i10, listA);
            return this.f52345a ? viewA : a();
        }
        return a();
    }

    private int c(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, "id");
    }

    public int d(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, "layout");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<CampaignEx> list = this.f52347c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f52347c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        List<CampaignEx> list = this.f52347c;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) throws Throwable {
        try {
            if (view == null) {
                view = b(i10);
            } else {
                this.f52346b = (b) view.getTag();
            }
            a(view);
            if (this.f52345a) {
                b(i10, viewGroup);
            } else {
                a(i10, viewGroup);
            }
            a(i10);
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
        }
        List<CampaignEx> list = this.f52347c;
        if (list != null && list.size() > i10) {
            b1.a(view, this.f52347c.get(i10).getLocalRequestId(), this.f52347c.get(i10).getLocalAllowTrackClick());
        }
        return view;
    }

    private void b(int i10, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f52347c;
        if (list == null || this.f52346b == null || list.size() == 0) {
            return;
        }
        MBCusRoundImageView mBCusRoundImageView = this.f52346b.f52362l;
        if (mBCusRoundImageView != null) {
            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
            a(this.f52346b.f52362l, this.f52347c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f52346b.f52361k;
        if (imageView != null) {
            a(imageView, this.f52347c.get(i10).getImageUrl(), false);
        }
        MBCusRoundImageView mBCusRoundImageView2 = this.f52346b.f52363m;
        if (mBCusRoundImageView2 != null) {
            mBCusRoundImageView2.setBorder(50, 20, -1);
            a(this.f52346b.f52363m, this.f52347c.get(i10).getIconUrl(), true);
        }
        double rating = this.f52347c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBStarLevelLayoutView mBStarLevelLayoutView = this.f52346b.f52364n;
        if (mBStarLevelLayoutView != null) {
            mBStarLevelLayoutView.setRating((int) rating);
            this.f52346b.f52364n.setOrientation(0);
        }
        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f52346b.f52365o;
        if (mBHeatLevelLayoutView != null) {
            mBHeatLevelLayoutView.setHeatCount(this.f52347c.get(i10).getNumberRating());
        }
    }

    private View a(int i10, List<String> list) {
        int iF = m0.F(com.mbridge.msdk.foundation.controller.c.n().d());
        h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        View viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f52347c.get(i10)).fileDirs(list).dyAdType(DyAdType.REWARD).orientation(iF).adChoiceLink(v0.a(this.f52347c.get(i10))).build());
        if (viewCreateDynamicView != null) {
            this.f52345a = true;
            b bVar = new b();
            this.f52346b = bVar;
            bVar.f52362l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv"));
            this.f52346b.f52361k = (ImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv_burl"));
            this.f52346b.f52363m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_icon_iv"));
            this.f52346b.f52364n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(b("mbridge_lv_sv_starlevel"));
            this.f52346b.f52366p = (MBFrameLayout) viewCreateDynamicView.findViewById(b("mbridge_lv_ration"));
            viewCreateDynamicView.setTag(this.f52346b);
        }
        return viewCreateDynamicView;
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private View a() {
        View viewInflate = LayoutInflater.from(com.mbridge.msdk.foundation.controller.c.n().d()).inflate(d("mbridge_order_layout_item"), (ViewGroup) null);
        b bVar = new b();
        this.f52346b = bVar;
        bVar.f52353c = (MBridgeImageView) viewInflate.findViewById(c("mbridge_lv_iv"));
        this.f52346b.f52361k = (ImageView) viewInflate.findViewById(c("mbridge_lv_iv_burl"));
        this.f52346b.f52354d = (RoundImageView) viewInflate.findViewById(c("mbridge_lv_icon_iv"));
        this.f52346b.f52359i = (MBridgeLevelLayoutView) viewInflate.findViewById(c("mbridge_lv_sv_starlevel"));
        this.f52346b.f52352b = (MBRotationView) viewInflate.findViewById(c("mbridge_lv_ration"));
        viewInflate.setTag(this.f52346b);
        return viewInflate;
    }

    private void a(View view) {
        this.f52346b.f52351a = (RelativeLayout) view.findViewById(a("mbridge_lv_item_rl"));
        this.f52346b.f52355e = (TextView) view.findViewById(a("mbridge_lv_title_tv"));
        this.f52346b.f52357g = (TextView) view.findViewById(a("mbridge_lv_tv_install"));
        this.f52346b.f52365o = (MBHeatLevelLayoutView) view.findViewById(a("mbridge_lv_sv_heat_level"));
        this.f52346b.f52356f = (TextView) view.findViewById(a("mbridge_lv_desc_tv"));
        this.f52346b.f52360j = (ImageView) view.findViewById(a("mbridge_iv_flag"));
        this.f52346b.f52358h = (TextView) view.findViewById(a("mbridge_order_viewed_tv"));
    }

    private void a(ImageView imageView, String str, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new C0586a(imageView, z10));
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private void a(int i10) {
        b bVar = this.f52346b;
        if (bVar != null) {
            if (bVar.f52355e != null) {
                this.f52346b.f52355e.setText(this.f52347c.get(i10).getAppName());
            }
            if (this.f52346b.f52356f != null) {
                this.f52346b.f52356f.setText(this.f52347c.get(i10).getAppDesc());
            }
            if (this.f52346b.f52357g != null) {
                String adCall = this.f52347c.get(i10).getAdCall();
                if (this.f52346b.f52357g instanceof MBridgeTextView) {
                    ((MBridgeTextView) this.f52346b.f52357g).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(this.f52346b.f52357g));
                }
                this.f52346b.f52357g.setText(adCall);
            }
            if (this.f52346b.f52360j != null) {
                try {
                    String language = Locale.getDefault().getLanguage();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                            this.f52346b.f52360j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        } else {
                            this.f52346b.f52360j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        }
                    }
                } catch (Exception e10) {
                    q0.b("OrderCampAdapter", e10.getMessage());
                }
                v0.a(2, this.f52346b.f52360j, this.f52347c.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), false, null);
            }
            if (this.f52346b.f52358h != null) {
                try {
                    this.f52346b.f52358h.setText(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getString(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getIdentifier("mbridge_reward_viewed_text_str", TypedValues.Custom.S_STRING, com.mbridge.msdk.foundation.controller.c.n().i())));
                    this.f52346b.f52358h.setVisibility(0);
                } catch (Exception e11) {
                    q0.b("OrderCampAdapter", e11.getMessage());
                }
            }
        }
    }

    private int a(String str) {
        if (this.f52345a) {
            return b(str);
        }
        return c(str);
    }
}
