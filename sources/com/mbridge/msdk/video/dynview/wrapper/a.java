package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.shape.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f52449m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.b f52450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Bitmap> f52451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f52452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f52453d = "#FFFFFFFF";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f52454e = "#60000000";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f52455f = "#FF5F5F5F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f52456g = "#90ECECEC";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f52457h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f52458i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52459j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f52460k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f52461l = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$a, reason: collision with other inner class name */
    class C0593a implements com.mbridge.msdk.video.dynview.util.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f52462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f52464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f52465d;

        C0593a(TextView textView, String str, CampaignEx campaignEx, Map map) {
            this.f52462a = textView;
            this.f52463b = str;
            this.f52464c = campaignEx;
            this.f52465d = map;
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onFinish() {
            this.f52464c.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f48835c);
            a.this.b(this.f52465d);
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onTick(long j10) {
            a.this.f52460k = (int) (j10 / 1000);
            this.f52462a.setText(com.mbridge.msdk.video.dynview.util.a.a(a.this.f52460k, this.f52462a.getContext()));
            a.this.f52457h++;
            if (TextUtils.isEmpty(this.f52463b) || !this.f52463b.equals("1")) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", "choseFromTwoHeartbeat");
            eVar.a("xtSecond", "countTimeForReport");
            eVar.a("autoPlayCountDownTime", "mLeftOverCountTime");
            com.mbridge.msdk.video.module.report.a.a("2000103", this.f52464c, eVar);
        }
    }

    class c implements com.mbridge.msdk.video.dynview.inter.a {
        c() {
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void a() {
            if (!a.this.f52459j || a.this.f52450a == null) {
                return;
            }
            a.this.f52450a.a(a.this.f52460k * 1000, a.this.f52458i);
            a.this.f52459j = false;
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void b() {
            if (a.this.f52450a != null) {
                a.this.f52450a.a();
                a.this.f52459j = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void c() {
            if (a.this.f52450a != null) {
                a.this.f52450a.a();
                a.this.f52459j = true;
            }
        }
    }

    class d extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f52469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f52470c;

        d(Map map, List list) {
            this.f52469b = map;
            this.f52470c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (a.this.f52452c) {
                return;
            }
            a.this.f52452c = true;
            a.this.a(this.f52469b, (List<CampaignEx>) this.f52470c, 0);
        }
    }

    class e extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f52472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f52473c;

        e(Map map, List list) {
            this.f52472b = map;
            this.f52473c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (a.this.f52452c) {
                return;
            }
            a.this.f52452c = true;
            a.this.a(this.f52472b, (List<CampaignEx>) this.f52473c, 1);
        }
    }

    class f implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f52475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f52476b;

        f(Map map, List list) {
            this.f52475a = map;
            this.f52476b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f52475a, (List<CampaignEx>) this.f52476b, i10);
        }
    }

    class g implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f52478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f52479b;

        g(Map map, List list) {
            this.f52478a = map;
            this.f52479b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f52478a, (List<CampaignEx>) this.f52479b, i10);
        }
    }

    class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f52481a;

        h(Map map) {
            this.f52481a = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(this.f52481a);
        }
    }

    class i implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f52484b;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a, reason: collision with other inner class name */
        class RunnableC0594a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f52486a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a$a, reason: collision with other inner class name */
            class RunnableC0595a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Bitmap f52488a;

                RunnableC0595a(Bitmap bitmap) {
                    this.f52488a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    i.this.f52484b.setImageBitmap(this.f52488a);
                }
            }

            RunnableC0594a(Bitmap bitmap) {
                this.f52486a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.f52484b.post(new RunnableC0595a(a0.a(this.f52486a, 10)));
                } catch (Exception e10) {
                    q0.b("DataEnergizeWrapper", e10.getMessage());
                }
            }
        }

        i(int i10, ImageView imageView) {
            this.f52483a = i10;
            this.f52484b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            try {
                int iA = i0.a(this.f52484b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f52484b.setBackgroundColor(Color.parseColor(a.this.f52455f));
                this.f52484b.setImageResource(iA);
                this.f52484b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e10) {
                q0.a("DataEnergizeWrapper", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iA = i0.a(this.f52484b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f52484b.setBackgroundColor(Color.parseColor(a.this.f52455f));
                this.f52484b.setImageResource(iA);
                this.f52484b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i10 = this.f52483a;
            if (i10 != 501 && i10 != 802) {
                this.f52484b.setImageBitmap(bitmap);
            } else {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0594a(bitmap));
            }
        }
    }

    class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f52490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.dynview.c f52492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f52493d;

        j(ImageView imageView, String str, com.mbridge.msdk.video.dynview.c cVar, View view) {
            this.f52490a = imageView;
            this.f52491b = str;
            this.f52492c = cVar;
            this.f52493d = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f52490a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (a.this.f52451b != null) {
                a.this.f52451b.put(SameMD5.getMD5(this.f52491b), bitmap);
                a.this.a(this.f52492c, this.f52493d);
            }
        }
    }

    class k extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f52495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f52496c;

        k(CampaignEx campaignEx, Map map) {
            this.f52495b = campaignEx;
            this.f52496c = map;
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (a.this.f52452c) {
                return;
            }
            a.this.f52452c = true;
            this.f52495b.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f48836d);
            a.this.b(this.f52496c);
        }
    }

    public void c(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        try {
            if (this.f52451b == null) {
                this.f52451b = new HashMap();
            }
            List<CampaignEx> listB = cVar.b();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f52449m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listB) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f52449m);
                }
            }
            ListView listView = (ListView) view.findViewById(a(f52449m, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(f52449m, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(f52449m, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.adapter.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.adapter.a(listB);
            if (cVar.h() == 1) {
                if (listView != null) {
                    a(listView, cVar);
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new f(map, listB));
                }
            } else if (gridView != null) {
                int iM = (int) cVar.m();
                int size = iM / listB.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM - (i10 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listB.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new g(map, listB));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new h(map));
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    class b implements com.mbridge.msdk.foundation.feedback.a {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            if (a.this.f52450a != null) {
                a.this.f52450a.a();
                a.this.f52459j = true;
            }
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            if (!a.this.f52459j || a.this.f52450a == null) {
                return;
            }
            a.this.f52450a.a(a.this.f52460k * 1000, a.this.f52458i);
            a.this.f52459j = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            if (!a.this.f52459j || a.this.f52450a == null) {
                return;
            }
            a.this.f52450a.a(a.this.f52460k * 1000, a.this.f52458i);
            a.this.f52459j = false;
        }
    }

    public void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f52449m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z10 = f52449m;
        LinearLayout linearLayout = z10 ? (LinearLayout) view.findViewById(a(z10, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(f52449m, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(f52449m, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(f52449m, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(f52449m, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(f52449m, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(f52449m, "mbridge_reward_desc_tv"));
        View view2 = (RelativeLayout) view.findViewById(a(f52449m, "mbridge_reward_bottom_layout"));
        List<View> arrayList = new ArrayList<>();
        List<CampaignEx> listB = cVar.b();
        if (listB != null && listB.size() > 0) {
            CampaignEx campaignEx = listB.get(0);
            if (campaignEx != null) {
                if (imageView != null) {
                    if (f52449m) {
                        if (imageView instanceof MBCusRoundImageView) {
                            ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
                        }
                    } else {
                        ((RoundImageView) imageView).setBorderRadius(10);
                    }
                    a(campaignEx.getIconUrl(), imageView);
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    if (f52449m) {
                        if (linearLayout2 instanceof MBStarLevelLayoutView) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout instanceof MBHeatLevelLayoutView) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAdCall());
                }
                int iL = cVar.l();
                if (iL == 102 || iL == 202 || iL == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (iL == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, campaignEx.getImageUrl(), iL);
                } else if (iL != 902) {
                    if (iL != 904) {
                        if (iL == 5002010) {
                            if (cVar.p() && view2 != null && view2.getVisibility() == 0) {
                                arrayList.add(view2);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.p()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.n()) || !cVar.n().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.video.dynview.c r35, android.view.View r36, java.util.Map r37, com.mbridge.msdk.video.dynview.listener.e r38) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.wrapper.a.a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.listener.e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
                    ((com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback")).a();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.video.dynview.c cVar, View view) {
        a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
        bVarA.orientation(cVar.h()).a(true);
        if (cVar.h() != 2 || cVar.m() > cVar.k()) {
            bVarA.b(cVar.m()).a(cVar.k());
        } else {
            bVarA.b(cVar.k()).a(cVar.m());
        }
        if (view.getBackground() == null) {
            view.setBackground(bVarA.build());
        }
    }

    private void b() {
        com.mbridge.msdk.video.dynview.util.draw.a.a().b();
        com.mbridge.msdk.video.dynview.util.time.b bVar = this.f52450a;
        if (bVar != null) {
            bVar.a();
            this.f52450a = null;
        }
        com.mbridge.msdk.video.dynview.energize.a.a().f52311a = null;
        if (this.f52461l != null) {
            this.f52461l = null;
        }
        Map<String, Bitmap> map = this.f52451b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f52451b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f52451b.clear();
        }
    }

    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f52456g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f52456g));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e10) {
            q0.a("DataEnergizeWrapper", e10.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i10) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new i(i10, imageView));
    }

    private void a(String str, ImageView imageView, com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new j(imageView, str, cVar, view));
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    private void a(String str, Context context, View view, int i10, Map map, CampaignEx campaignEx) {
        CampaignEx campaignEx2;
        String strA = c1.a(str, "cltp");
        String strA2 = c1.a(str, "xt");
        long j10 = !TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L;
        if (j10 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f52449m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            TextView textView = (TextView) view.findViewById(a(f52449m, "mbridge_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f52453d));
                String str2 = this.f52454e;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView, 1, 12, str2, str2);
                textView.setVisibility(0);
                textView.setOnClickListener(new k(campaignEx, map));
                campaignEx2 = campaignEx;
                this.f52458i = new C0593a(textView, strA2, campaignEx2, map);
                com.mbridge.msdk.video.dynview.util.time.b bVarA = new com.mbridge.msdk.video.dynview.util.time.b().b(j10 * 1000).a(1000L).a(this.f52458i);
                this.f52450a = bVarA;
                bVarA.c();
            } else {
                campaignEx2 = campaignEx;
            }
            ImageView imageView = (ImageView) view.findViewById(a(f52449m, "mbridge_iv_link"));
            if (campaignEx2 == null) {
                return;
            }
            if (campaignEx2.getAdchoice() != null) {
                campaignEx2.getAdchoice().g("");
            }
            v0.a(4, imageView, campaignEx2, com.mbridge.msdk.foundation.controller.c.n().d(), false, new b());
        }
    }

    private void a(ListView listView, com.mbridge.msdk.video.dynview.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fK = (cVar.k() - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 720.0f)) / 2.0f;
            int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
            int i10 = (int) fK;
            layoutParams.setMargins(iA, i10, iA, i10);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, List<CampaignEx> list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
            com.mbridge.msdk.video.dynview.listener.d dVar = (com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback");
            if (dVar != null) {
                dVar.a(list.get(i10));
                try {
                    CampaignEx campaignEx = list.get(i10);
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("click", "0");
                    eVar.a("time", Long.valueOf(this.f52457h));
                    eVar.a("choose_cid", campaignEx.getId());
                    eVar.a(C4240b4.i.L, Integer.valueOf(i10));
                    eVar.a("type", "choseFromTwoSelect");
                    com.mbridge.msdk.video.module.report.a.a("2000103", campaignEx, eVar);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
            b();
            return;
        }
        if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
            com.mbridge.msdk.video.dynview.listener.c cVar = (com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback");
            if (cVar != null) {
                cVar.a(list.get(i10), i10);
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
                    ((com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback")).close();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f52451b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(this.f52451b, cVar, view);
    }

    private int a(boolean z10, String str) {
        try {
            if (z10) {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                return str.hashCode();
            }
            return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f52456g));
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return bitmapCreateBitmap;
        }
    }
}
