package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.ts.TsExtractor;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.core.rq;
import com.bytedance.adsdk.ugeno.mml.mo;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.jtx;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.google.common.base.Ascii;
import com.ironsource.C4424m2;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends mml {
    private com.bytedance.adsdk.ugeno.ud.lnr bqt;
    private boolean ekw;
    private float hkc;
    private float kdv;
    private com.bytedance.sdk.openadsdk.core.widget.mzz koa;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private boolean f17441rc;
    private com.bytedance.adsdk.ugeno.ud.lnr uw;
    private float vu;
    private com.bytedance.adsdk.ugeno.ud.lnr xmv;

    public wd(Context context, ljh ljhVar, boolean z10, qdl qdlVar, ViewGroup viewGroup) {
        super(context, ljhVar, z10, qdlVar, viewGroup);
        this.f17441rc = false;
        this.ekw = true;
        if (TextUtils.equals(this.oth, "fullscreen_interstitial_ad")) {
            this.vu = this.mzz.ws();
        } else if (TextUtils.equals(this.oth, Constants.REWARDED_VIDEO)) {
            this.vu = this.mzz.qg();
        }
    }

    private boolean bjy() {
        ljh ljhVar = this.mzz;
        return ljhVar != null && ljhVar.iw() == 1;
    }

    private void exu() {
        rq rqVar = new rq();
        HashMap map = new HashMap();
        map.put("image_info", this.mo.rq());
        map.put("cache_dir", this.mo.rdp());
        rqVar.qdl(map);
        rqVar.qdl(this.f17431ud);
        rqVar.qdl(this.mml);
        rqVar.ud(this.bch);
        this.qdl.qdl("ad", rqVar);
    }

    private void fs() {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.uw;
        if (lnrVar != null) {
            lnrVar.lnr(8);
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar2 = this.xmv;
        if (lnrVar2 != null) {
            lnrVar2.lnr(8);
        }
    }

    private void lnr(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.xmv;
        if (lnrVar != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.core.rq.ud.mo)) {
            int i11 = 0;
            if (!z10 && !z11) {
                i11 = 8;
            }
            lnrVar.lnr(i11);
        }
    }

    private int rdp() {
        exu();
        try {
            this.qdl.qdl(this.bch, this.lnr);
            if (this.lnr != null) {
                if (TextUtils.equals(this.oth, Constants.REWARDED_VIDEO)) {
                    this.uw = this.lnr.mo("RVCountdown");
                    this.xmv = this.lnr.mo("RVSkipView");
                } else {
                    this.uw = this.lnr.mo("FVCountdown");
                    this.xmv = this.lnr.mo("FVSkipView");
                }
                fs();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
                return 0;
            }
            this.mo.ekw().ud();
            this.mo.ekw().lnr();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    protected com.bytedance.adsdk.ugeno.ud.lnr jpc() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.mo("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    protected int mml() {
        if (!this.mo.hkc()) {
            return tvp();
        }
        aaj.qdl("UGenRender", "renderWidget: only update data");
        return rdp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    protected JSONObject qdl() {
        JSONObject jSONObjectLnr = this.mo.lnr();
        if (jSONObjectLnr != null) {
            return jSONObjectLnr.optJSONObject("xTemplate");
        }
        return null;
    }

    public void rq() {
        fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.qdl(this.lnr, C4424m2.f43623v, new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setSoundMute(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.lnr == null) {
            return;
        }
        boolean z11 = i10 == 1;
        ud(charSequence, z11, i11, z10);
        qdl(charSequence, z11, i11, z10);
        lnr(charSequence, z11, i11, z10);
    }

    public void to() {
        fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.qdl(this.lnr, "videoFail", new Object[0]);
        }
    }

    protected int tvp() {
        exu();
        this.qdl.qdl((bjy) this);
        this.qdl.qdl((jtx) this);
        if (bjy()) {
            this.qdl.qdl(new lnr());
        }
        ekw ekwVarKr = this.mzz.kr();
        if (ekwVarKr == null) {
            try {
                if (com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml.qdl(this.oth)) {
                    this.lnr = this.qdl.qdl(this.mml, this.bch, qdl(ekwVarKr));
                } else {
                    this.lnr = this.qdl.qdl(this.mml, this.bch, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
            } catch (Throwable unused3) {
                return 141;
            }
        } else {
            this.lnr = this.qdl.qdl(this.mml, this.bch, qdl(ekwVarKr));
        }
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar != null) {
            com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMo = lnrVar.mo("RVCountdown");
            this.uw = lnrVarMo;
            if (lnrVarMo == 0) {
                this.uw = this.lnr.mo("FVCountdown");
            }
            com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMo2 = this.lnr.mo("RVSkipView");
            this.xmv = lnrVarMo2;
            if (lnrVarMo2 == 0) {
                this.xmv = this.lnr.mo("FVSkipView");
            }
            this.bqt = this.lnr.mo("ProgressBar");
            fs();
        }
        if (this instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
            return 0;
        }
        this.mo.ekw().ud();
        this.mo.ekw().lnr();
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    protected JSONObject ud() {
        return this.mo.lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public com.bytedance.adsdk.ugeno.ud.lnr wd() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.mo("Playable");
    }

    private void ud(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.bqt;
        if (lnrVar != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr)) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                aaj.lnr("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (z11 || i11 <= 0 || z10) {
                ((com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr) this.bqt).lnr(8);
                return;
            }
            if (this.ekw) {
                this.kdv = i10;
                this.ekw = false;
            }
            float f10 = (float) (((double) this.hkc) + ((0.5d / ((double) this.kdv)) * 100.0d));
            this.hkc = f10;
            this.qdl.ud(this.lnr, "ProgressBar://progress", Float.valueOf(f10), Float.valueOf(this.vu));
            ((com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr) this.bqt).wd(500);
            ((com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr) this.bqt).qdl((int) this.hkc);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public void qdl(com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        this.koa = mzzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        byte b10;
        int i10 = 7;
        int i11 = 4;
        int i12 = -1;
        if (this.jpc == null || qdlVar == null) {
            return;
        }
        String strUd = qdlVar.ud();
        strUd.getClass();
        switch (strUd.hashCode()) {
            case -1882810668:
                b10 = !strUd.equals("sendLogExtra") ? (byte) -1 : (byte) 0;
                break;
            case -1439599355:
                b10 = !strUd.equals("sendAdExtra") ? (byte) -1 : (byte) 1;
                break;
            case -511324706:
                b10 = !strUd.equals("openPrivacy") ? (byte) -1 : (byte) 2;
                break;
            case -55818203:
                b10 = !strUd.equals("pauseVideo") ? (byte) -1 : (byte) 3;
                break;
            case 3532159:
                b10 = !strUd.equals("skip") ? (byte) -1 : (byte) 4;
                break;
            case 72484600:
                b10 = !strUd.equals("openPlayable") ? (byte) -1 : (byte) 5;
                break;
            case 804386914:
                b10 = !strUd.equals("videoControl") ? (byte) -1 : (byte) 6;
                break;
            case 951590323:
                b10 = !strUd.equals("convert") ? (byte) -1 : (byte) 7;
                break;
            case 1151744482:
                b10 = !strUd.equals("muteVideo") ? (byte) -1 : (byte) 8;
                break;
            case 1528469391:
                b10 = !strUd.equals("openLinks") ? (byte) -1 : (byte) 9;
                break;
            case 1603466254:
                b10 = !strUd.equals("speedVideoOrTimer") ? (byte) -1 : (byte) 10;
                break;
            case 1671642405:
                b10 = !strUd.equals("dislike") ? (byte) -1 : Ascii.VT;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                new jpc().qdl("sendLogExtra", this.mzz, this.oth, qdlVar.lnr());
                break;
            case 1:
                new jpc().qdl("sendAdExtra", this.mzz, this.oth, qdlVar.lnr());
                break;
            case 2:
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case 3:
            case 6:
                i10 = i11;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case 4:
                i10 = 6;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case 5:
                com.bytedance.sdk.openadsdk.core.tvp.bjy bjyVar = this.tvp;
                if (bjyVar != null) {
                    bjyVar.ud((JSONObject) null);
                }
                break;
            case 7:
                i10 = 2;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case 8:
                i10 = 5;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case 9:
                new mo().qdl(qdl(lnrVar.rq()), this.f17431ud instanceof Activity, this.mzz, this.oth, qdlVar.lnr(), this.koa);
                break;
            case 10:
                aaj.ud("UGenRender", "onUGenEvent: " + qdlVar.lnr());
                i11 = 13;
                if (qdlVar.lnr() != null && !qdlVar.lnr().isEmpty()) {
                    try {
                        i12 = Integer.parseInt(qdlVar.lnr().get("switch"));
                    } catch (Throwable th2) {
                        aaj.lnr("UGenRender", th2);
                    }
                }
                i10 = i11;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case 11:
                i10 = 3;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            default:
                i10 = 0;
                this.jpc.qdl(lnrVar.rq(), i10, new jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i12).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
        }
    }

    private void qdl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.uw;
        if (lnrVar != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.core.rq.ud.ud)) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                aaj.lnr("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.f17441rc) {
                this.uw.lnr(0);
                if (!z10 && this.mo.qdl() && com.bytedance.sdk.component.adexpress.mml.mo.ud(this.mo.mml())) {
                    ((com.bytedance.sdk.openadsdk.core.rq.ud.ud) this.uw).rdp(String.valueOf(i10));
                    return;
                } else if (!"open_ad".equals(this.mo.mml()) && this.mo.qdl()) {
                    this.f17441rc = true;
                    this.uw.lnr(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.rq.ud.ud) this.uw).rdp(String.valueOf(charSequence));
                    return;
                }
            }
            this.uw.lnr(8);
        }
    }

    private Context qdl(View view) {
        Activity activityQdl = view != null ? com.bytedance.sdk.component.utils.ud.qdl(view) : null;
        return activityQdl == null ? this.f17431ud : activityQdl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public void qdl(long j10, long j11) {
        super.qdl(j10, j11);
        fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.qdl(this.lnr, "videoProgress", Long.valueOf(j10), Long.valueOf(j11));
        }
    }

    public JSONObject qdl(ekw ekwVar) {
        if (ekwVar != null) {
            return ekwVar.mzz();
        }
        return null;
    }
}
