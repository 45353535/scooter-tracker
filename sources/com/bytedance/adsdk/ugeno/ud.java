package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.mml.mo;
import com.bytedance.adsdk.ugeno.mml.tvp;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.google.common.base.Ascii;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.mo.ud> implements com.bytedance.adsdk.ugeno.mo.lnr {
    private boolean auu;

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    private float f16249ca;
    private int dps;
    private int eta;
    private String fge;
    private float gsp;
    private boolean gsv;
    private float hcs;

    /* JADX INFO: renamed from: hd, reason: collision with root package name */
    private boolean f16250hd;
    private float hr;
    private boolean hvi;
    private boolean iw;
    private JSONArray kj;
    private float kr;
    private boolean lme;
    private float nts;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private float f16251od;
    private int oz;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private int f16252se;
    private String syy;
    private String tdy;
    private boolean uvi;

    /* JADX INFO: renamed from: vc, reason: collision with root package name */
    private int f16253vc;
    private float vm;
    private int vr;
    private float xx;
    private float ygv;

    public ud(Context context) {
        super(context);
        this.dps = 0;
        this.iw = true;
        this.lme = true;
        this.kr = 500.0f;
        this.xx = 2000.0f;
        this.syy = "slide";
        this.tdy = "dot";
        this.f16249ca = 8.0f;
        this.gsp = 8.0f;
        this.ygv = 50.0f;
        this.hr = 90.0f;
        this.f16250hd = false;
        this.f16252se = Color.parseColor("#666666");
        this.f16253vc = Color.parseColor("#ffffff");
        this.fge = "row";
        this.hcs = 1.0f;
        this.f16251od = 0.0f;
        this.vm = 0.0f;
        this.nts = 0.0f;
        this.eta = 0;
        this.vr = 0;
        this.auu = true;
        this.gsv = false;
        this.hvi = true;
        float fQdl = jpc.qdl(this.f16262ud, 8.0f);
        this.f16249ca = fQdl;
        this.gsp = fQdl;
    }

    private void jpc(int i10) {
        tvp tvpVar = this.xdk;
        if (tvpVar == null) {
            return;
        }
        tvpVar.qdl("SwiperView://slide", Integer.valueOf(this.oz), Integer.valueOf(i10), Integer.valueOf(!this.uvi ? 1 : 0));
    }

    private void taz() {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.size(); i10++) {
            com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.get(i10);
            if (lnrVar != null) {
                fs fsVar = new fs(this.f16262ud);
                qdl(fsVar);
                fsVar.qdl(this.zvv);
                ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).qdl(fsVar.qdl(lnrVar.rc(), this.mml, (JSONObject) null));
            }
        }
    }

    private int tid() {
        if (this.eta == 1) {
            List<com.bytedance.adsdk.ugeno.ud.lnr<View>> list = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.kj;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void wd(int i10) {
        if (this.xdk == null) {
            return;
        }
        if (this.oz == 0 && i10 == tid() - 1) {
            this.xdk.qdl("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.oz == tid() - 1 && i10 == 0) {
            this.xdk.qdl("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private void zlt() {
        List<com.bytedance.adsdk.ugeno.ud.lnr<View>> list = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.get(0);
        if (this.kj == null) {
            return;
        }
        for (int i10 = 0; i10 < this.kj.length(); i10++) {
            fs fsVar = new fs(this.f16262ud);
            qdl(fsVar);
            fsVar.qdl(this.zvv);
            try {
                JSONObject jSONObjectOptJSONObject = this.kj.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.mml.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.mml.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).qdl(fsVar.qdl(lnrVar.rc(), this.mml, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lnr() {
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).exu(((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).getCurrentItem() + 1);
    }

    public void mml() {
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).exu(((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).getCurrentItem() - 1);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public View qdl() {
        com.bytedance.adsdk.ugeno.mo.ud udVar = new com.bytedance.adsdk.ugeno.mo.ud(this.f16262ud);
        this.mzz = udVar;
        udVar.qdl((mml) this);
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).lnr((int) this.kr).mzz(this.gsv).qdl(this.tdy).qdl(this.f16249ca).ud(this.gsp).lnr(this.ygv).mml(this.hr).ud(this.fge).qdl(this.dps).ud().mml(this.iw).qdl(this.lme).ud((int) this.kr).mml((int) this.xx).ud(this.auu).lnr(this.f16250hd).mo(this.f16252se).mzz(this.f16253vc).jpc((int) this.vm).tvp((int) this.nts).wd((int) this.f16251od).mzz(this.hcs).lnr(this.syy).exu(this.vr);
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).setOnPageChangeListener(this);
        if (this.eta == 1) {
            taz();
        } else {
            zlt();
        }
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).lnr();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, ViewGroup.LayoutParams layoutParams) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1593646704:
                if (str.equals("startIndex")) {
                    b10 = 0;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    b10 = 1;
                }
                break;
            case -1560813342:
                if (str.equals("indicatorStyle")) {
                    b10 = 2;
                }
                break;
            case -1557466889:
                if (str.equals("indicatorWidth")) {
                    b10 = 3;
                }
                break;
            case -1469828074:
                if (str.equals("indicatorHeight")) {
                    b10 = 4;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    b10 = 5;
                }
                break;
            case -1367379379:
                if (str.equals("driveMode")) {
                    b10 = 6;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    b10 = 7;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b10 = 8;
                }
                break;
            case -855614293:
                if (str.equals("disableOnInteraction")) {
                    b10 = 9;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    b10 = 10;
                }
                break;
            case -597162967:
                if (str.equals("indicatorX")) {
                    b10 = Ascii.VT;
                }
                break;
            case -597162966:
                if (str.equals("indicatorY")) {
                    b10 = Ascii.FF;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    b10 = 13;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b10 = Ascii.SO;
                }
                break;
            case 95467907:
                if (str.equals(POBCTAOverlayData.KEY_CTA_DELAY)) {
                    b10 = Ascii.SI;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b10 = Ascii.DLE;
                }
                break;
            case 195414576:
                if (str.equals("indicatorDirection")) {
                    b10 = 17;
                }
                break;
            case 497874535:
                if (str.equals("allowTouchMove")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    b10 = 19;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    b10 = Ascii.DC4;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    b10 = Ascii.NAK;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    b10 = Ascii.SYN;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    b10 = Ascii.ETB;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.vr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case 1:
                this.f16252se = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, this.f16252se);
                break;
            case 2:
                this.tdy = str2;
                break;
            case 3:
                this.f16249ca = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 8.0f));
                break;
            case 4:
                this.gsp = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 8.0f));
                break;
            case 5:
                this.nts = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 6:
                this.eta = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case 7:
                this.syy = str2;
                break;
            case 8:
                if (TextUtils.equals(str2, "vertical")) {
                    this.dps = 1;
                } else {
                    this.dps = 0;
                }
                break;
            case 9:
                this.gsv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case 10:
                this.f16250hd = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case 11:
                this.ygv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 50.0f);
                break;
            case 12:
                this.hr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 90.0f);
                break;
            case 13:
                this.vm = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 14:
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 15:
                this.xx = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 2000.0f);
                break;
            case 16:
                this.kr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 500.0f);
                break;
            case 17:
                this.fge = str2;
                break;
            case 18:
                this.auu = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 19:
                this.hcs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case 20:
                this.f16251od = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 21:
                this.f16253vc = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, this.f16253vc);
                break;
            case 22:
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 23:
                this.kj = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONArray) null);
                break;
        }
    }

    public void qdl(int i10) {
        if (((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).getCurrentItem() != i10) {
            ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).exu(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mo.lnr
    public void qdl(boolean z10, int i10, float f10, int i11) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z10 + "; position=" + i10 + "; positionOffset=" + f10 + "; positionOffsetPixels=" + i11);
        qdl(z10, i10, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.mo.lnr
    public void qdl(boolean z10, int i10, int i11, boolean z11, boolean z12) {
        if (this.oz != i10) {
            wd(i10);
            jpc(i10);
            this.oz = i10;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z10 + "; position=" + i10 + "; loopPosition=" + i11 + "; isFirst=" + z11 + "; isLast=" + z12);
    }

    @Override // com.bytedance.adsdk.ugeno.mo.lnr
    public void qdl(boolean z10, int i10) {
        if (i10 == 0) {
            if (!z10) {
                this.hvi = true;
            }
            this.uvi = false;
        } else if (i10 == 1) {
            this.uvi = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z10 + "; state=" + i10);
    }

    private void qdl(boolean z10, int i10, float f10) {
        if (this.xdk != null && !z10 && i10 == tid() - 1 && f10 == 0.0f && this.hvi) {
            this.xdk.qdl("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.hvi = false;
        }
    }

    private void qdl(fs fsVar) {
        if (this.gsv) {
            fsVar.qdl(new com.bytedance.adsdk.ugeno.core.mzz() { // from class: com.bytedance.adsdk.ugeno.ud.1
                @Override // com.bytedance.adsdk.ugeno.core.mzz
                public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, List<mo.qdl> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.ud.lnr) ud.this).mzz != null) {
                        ((com.bytedance.adsdk.ugeno.mo.ud) ((com.bytedance.adsdk.ugeno.ud.lnr) ud.this).mzz).mo();
                    }
                }
            });
        }
    }
}
