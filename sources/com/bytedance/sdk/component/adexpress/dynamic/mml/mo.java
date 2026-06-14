package com.bytedance.sdk.component.adexpress.dynamic.mml;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private String aaj;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private int f16367ag;
    private String auu;
    private int ax;
    private String bch;
    private String bjy;
    private int blf;
    private int bqt;
    private boolean bx;

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    private int f16368ca;
    private JSONObject car;
    private int cx;
    private int dk;
    private JSONObject dps;
    private String ekw;
    private int en;
    private String eta;
    private int ew;
    private String exc;
    private String exu;
    private boolean fco;
    private String fge;
    private double fs;
    private int fzn;

    /* JADX INFO: renamed from: gg, reason: collision with root package name */
    private int f16369gg;
    private int gsp;
    private String gsv;
    private boolean gt;
    private int gy;
    private boolean hcs;

    /* JADX INFO: renamed from: hd, reason: collision with root package name */
    private String f16370hd;
    private String hkc;
    private int hr;
    private String hzv;
    private int ijp;
    private int irn;
    private JSONObject iw;
    private int ji;
    private boolean jjk;
    private String jl;
    private boolean jle;
    private boolean jnw;
    private float jpc;
    private String jtx;
    private boolean jut;
    private String jyq;
    private int kab;
    private String kdv;
    private int kj;
    private double koa;
    private String kr;
    private String ljh;
    private int lme;
    private float lnr;
    private int lq;
    private boolean lte;
    private int mlb;
    private float mml;
    private float mo;
    private int mrf;
    private boolean mzz;
    private String nts;
    private int nz;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f16371od;
    private double om;
    private String oth;
    private float qdl;
    private String qk;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f16372ra;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private String f16373rc;
    private String rdp;
    private double rq;
    private List<qdl> rzg;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private int f16374se;
    private String sy;
    private JSONObject syy;
    private boolean taz;
    private int tdy;
    private boolean tid;
    private float to;
    private boolean tqd;
    private float tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16375ud;
    private boolean uw;

    /* JADX INFO: renamed from: vc, reason: collision with root package name */
    private boolean f16376vc;
    private int vm;
    private long vr = -1;
    private double vu;
    private int wak;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private int f16377wc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16378wd;
    private double xdk;
    private String xi;
    private int xmv;
    private boolean xx;
    private int ygv;

    /* JADX INFO: renamed from: yh, reason: collision with root package name */
    private boolean f16379yh;
    private String yt;
    private boolean zlt;
    private int zpu;
    private int zvv;
    private int zy;

    private void bqt(String str) {
        this.auu = str;
    }

    public static mo qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mo moVar = new mo();
        moVar.ud(jSONObject.optString("adType", "embeded"));
        moVar.bjy(jSONObject.optString("clickArea", Reporting.Key.CREATIVE));
        moVar.jtx(jSONObject.optString("clickTigger", "click"));
        moVar.lnr(jSONObject.optString("fontFamily", "PingFangSC"));
        moVar.mml(jSONObject.optString("textAlign", "left"));
        moVar.mzz(jSONObject.optString("color", "#999999"));
        moVar.mo(jSONObject.optString("bgColor", C4240b4.i.T));
        moVar.wd(jSONObject.optString("bgImgUrl", ""));
        moVar.bqt(jSONObject.optString("bgImgData", ""));
        moVar.jpc(jSONObject.optString("borderColor", POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        moVar.tvp(jSONObject.optString("borderStyle", "solid"));
        moVar.to(jSONObject.optString("heightMode", "auto"));
        moVar.rq(jSONObject.optString("widthMode", "fixed"));
        moVar.fs(jSONObject.optString("interactText", ""));
        moVar.lnr(jSONObject.optBoolean("isShowBgControl", false));
        moVar.exu(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            moVar.wd(jSONObjectOptJSONObject.optInt("translateY", 0));
            moVar.jpc(jSONObjectOptJSONObject.optInt("translateX", 0));
            moVar.mml(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            moVar.mzz(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        moVar.rdp(jSONObject.optString("interactType", ""));
        moVar.mzz(jSONObject.optInt("interactSlideDirection", -1));
        moVar.yt(jSONObject.optString("justifyHorizontal", "space-around"));
        moVar.jl(jSONObject.optString("justifyVertical", "flex-start"));
        moVar.ud(jSONObject.optDouble("timingStart"));
        moVar.lnr(jSONObject.optDouble("timingEnd"));
        moVar.mml((float) jSONObject.optDouble("width", 0.0d));
        moVar.lnr((float) jSONObject.optDouble("height", 0.0d));
        moVar.qdl((float) jSONObject.optDouble("borderRadius", 0.0d));
        moVar.ud((float) jSONObject.optDouble("borderSize", 0.0d));
        moVar.ud(jSONObject.optBoolean("interactValidate", false));
        moVar.tvp((float) jSONObject.optDouble("fontSize", 0.0d));
        moVar.mzz((float) jSONObject.optDouble("paddingBottom", 0.0d));
        moVar.mo((float) jSONObject.optDouble("paddingLeft", 0.0d));
        moVar.wd((float) jSONObject.optDouble("paddingRight", 0.0d));
        moVar.jpc((float) jSONObject.optDouble("paddingTop", 0.0d));
        moVar.mml(jSONObject.optBoolean("lineFeed", false));
        moVar.tvp(jSONObject.optInt("lineCount", 0));
        moVar.mo(jSONObject.optDouble("lineHeight", 1.2d));
        moVar.rdp(jSONObject.optInt("letterSpacing", 0));
        moVar.mzz(jSONObject.optBoolean("isDataFixed", false));
        moVar.bjy(jSONObject.optInt("fontWeight"));
        moVar.mo(jSONObject.optBoolean("lineLimit"));
        moVar.jtx(jSONObject.optInt(C4240b4.i.L));
        moVar.exc(jSONObject.optString("align"));
        moVar.wd(jSONObject.optBoolean("useLeft"));
        moVar.jpc(jSONObject.optBoolean("useRight"));
        moVar.tvp(jSONObject.optBoolean("useTop"));
        moVar.to(jSONObject.optBoolean("useBottom"));
        moVar.aaj(jSONObject.optString("data"));
        moVar.ud(jSONObject.optJSONObject("i18n"));
        moVar.fs(jSONObject.optInt("marginLeft"));
        moVar.exu(jSONObject.optInt("marginRight"));
        moVar.to(jSONObject.optInt("marginTop"));
        moVar.rq(jSONObject.optInt("marginBottom"));
        moVar.yt(jSONObject.optInt("tagMaxCount"));
        moVar.rq(jSONObject.optBoolean("allowTextFlow"));
        moVar.jl(jSONObject.optInt("textFlowType"));
        moVar.exc(jSONObject.optInt("textFlowDuration"));
        moVar.aaj(jSONObject.optInt("left"));
        moVar.jyq(jSONObject.optInt("right"));
        moVar.oth(jSONObject.optInt("top"));
        moVar.ljh(jSONObject.optInt("bottom"));
        moVar.jyq(jSONObject.optString("alignItems", "flex-start"));
        moVar.oth(jSONObject.optString("direction", ""));
        moVar.qdl(jSONObject.optBoolean("loop", false));
        moVar.bch(jSONObject.optInt("zIndex"));
        moVar.vu(jSONObject.optInt("interactVisibleTime"));
        moVar.uw(jSONObject.optInt("interactHiddenTime"));
        moVar.exu(jSONObject.optBoolean("interactEnableMask"));
        moVar.rdp(jSONObject.optBoolean("interactWontHide"));
        moVar.qdl(jSONObject.optString("bgGradient"));
        moVar.kdv(jSONObject.optInt("areaType"));
        moVar.ekw(jSONObject.optInt("interactSlideThreshold", 0));
        moVar.fco(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.mml.ud() ? 0 : 120));
        moVar.jl(jSONObject.optBoolean("openPlayableLandingPage", false));
        moVar.lnr(jSONObject.optJSONObject("video"));
        moVar.mml(jSONObject.optJSONObject("image"));
        moVar.hkc(jSONObject.optInt("borderShadowExtent"));
        moVar.bjy(jSONObject.optBoolean("bgGauseBlur"));
        moVar.hzv(jSONObject.optInt("bgGauseBlurRadius"));
        moVar.jtx(jSONObject.optBoolean("showTimeProgress", false));
        moVar.yt(jSONObject.optBoolean("showPlayButton", false));
        moVar.qdl(jSONObject.optDouble("bgColorCg", 0.0d));
        moVar.mo(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        moVar.ud(jSONObject.optInt("borderTopLeftRadius", 0));
        moVar.qdl(jSONObject.optInt("borderTopRightRadius", 0));
        moVar.mml(jSONObject.optInt("borderBottomLeftRadius", 0));
        moVar.lnr(jSONObject.optInt("borderBottomRightRadius", 0));
        moVar.mzz(jSONObject.optJSONObject("interactI18n"));
        moVar.bch(jSONObject.optString("imageObjectFit"));
        moVar.uw(jSONObject.optString("interactTitle"));
        moVar.rc(jSONObject.optInt("interactTextPositionTop"));
        moVar.ljh(jSONObject.optString("imageLottieTosPath"));
        moVar.fs(jSONObject.optBoolean("animationsLoop"));
        moVar.xmv(jSONObject.optInt("lottieAppNameMaxLength"));
        moVar.koa(jSONObject.optInt("lottieAdDescMaxLength"));
        moVar.bqt(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    qdl qdlVar = new qdl();
                    qdlVar.lnr(jSONObject2.optString("animationType"));
                    qdlVar.qdl(jSONObject2.optDouble("animationDuration"));
                    qdlVar.ud(jSONObject2.optDouble("animationScaleX"));
                    qdlVar.lnr(jSONObject2.optDouble("animationScaleY"));
                    qdlVar.mml(jSONObject2.optString("animationTimeFunction"));
                    qdlVar.mml(jSONObject2.optDouble("animationDelay"));
                    qdlVar.mo(jSONObject2.optInt("animationIterationCount"));
                    qdlVar.mzz(jSONObject2.optString("animationDirection"));
                    qdlVar.mzz(jSONObject2.optDouble("animationInterval"));
                    qdlVar.qdl(jSONObject2.optInt("animationBorderWidth"));
                    qdlVar.qdl(jSONObject2.optLong(C4240b4.i.W));
                    qdlVar.ud(jSONObject2.optInt("animationEffectWidth"));
                    qdlVar.lnr(jSONObject2.optInt("animationSwing", 1));
                    qdlVar.mml(jSONObject2.optInt("animationTranslateX"));
                    qdlVar.mzz(jSONObject2.optInt("animationTranslateY"));
                    qdlVar.ud(jSONObject2.optString("animationRippleBackgroundColor"));
                    qdlVar.qdl(jSONObject2.optString("animationScaleDirection"));
                    qdlVar.wd(jSONObject2.optInt("animationFadeStart"));
                    qdlVar.jpc(jSONObject2.optInt("animationFadeEnd"));
                    qdlVar.mo(jSONObject2.optString("animationFillMode"));
                    qdlVar.tvp(jSONObject2.optInt("animationBounceHeight"));
                    if (moVar.exc() > 0.0d) {
                        qdlVar.mml(qdlVar.rdp() + moVar.exc());
                    }
                    arrayList.add(qdlVar);
                }
                moVar.qdl(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                moVar.xmv(jSONObject.optString("triggerSlideDirection", "0"));
                moVar.qdl(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return moVar;
    }

    public double aaj() {
        return this.fs;
    }

    public String ag() {
        return this.hkc;
    }

    public String ax() {
        return this.ekw;
    }

    public String bch() {
        return this.jl;
    }

    public float bjy() {
        return this.f16378wd;
    }

    public int blf() {
        return this.lq;
    }

    public boolean bx() {
        return this.hcs;
    }

    public int ca() {
        return this.blf;
    }

    public String car() {
        return this.xi;
    }

    public int cx() {
        return this.mrf;
    }

    public boolean dk() {
        return this.taz;
    }

    public boolean dps() {
        return this.xx;
    }

    public int ekw() {
        return this.xmv;
    }

    public JSONObject en() {
        return this.car;
    }

    public long eta() {
        return this.vr;
    }

    public int ew() {
        return this.fzn;
    }

    public double exc() {
        return this.rq;
    }

    public boolean exu() {
        return this.mzz;
    }

    public double fco() {
        return this.vu;
    }

    public boolean fge() {
        return this.jle;
    }

    public float fs() {
        return this.f16375ud;
    }

    public int fzn() {
        return this.en;
    }

    public int gg() {
        return this.kab;
    }

    public boolean gsp() {
        return this.bx;
    }

    public int gt() {
        return this.f16367ag;
    }

    public String gy() {
        return this.kdv;
    }

    public JSONObject hcs() {
        return this.iw;
    }

    public boolean hd() {
        return this.jnw;
    }

    public int hkc() {
        return this.bqt;
    }

    public boolean hr() {
        return this.jut;
    }

    public double hzv() {
        return this.koa;
    }

    public boolean ijp() {
        return this.tid;
    }

    public int irn() {
        return this.f16377wc;
    }

    public String iw() {
        return this.f16370hd;
    }

    public String ji() {
        return this.qk;
    }

    public int jjk() {
        return this.cx;
    }

    public float jl() {
        return this.to;
    }

    public boolean jle() {
        return this.f16376vc;
    }

    public int jnw() {
        return this.f16371od;
    }

    public double jpc() {
        return this.xdk;
    }

    public float jtx() {
        return this.jpc;
    }

    public int jut() {
        return this.kj;
    }

    public String jyq() {
        return this.bjy;
    }

    public boolean kab() {
        return this.lte;
    }

    public boolean kdv() {
        return this.uw;
    }

    public String kj() {
        return this.nts;
    }

    public String koa() {
        return this.oth;
    }

    public List<qdl> kr() {
        return this.rzg;
    }

    public String ljh() {
        return this.yt;
    }

    public int lme() {
        return this.f16374se;
    }

    public int lnr() {
        return this.gsp;
    }

    public int lq() {
        return this.nz;
    }

    public boolean lte() {
        return this.zlt;
    }

    public boolean mlb() {
        return this.jjk;
    }

    public int mml() {
        return this.ygv;
    }

    public JSONObject mo() {
        return this.syy;
    }

    public String mrf() {
        return this.f16373rc;
    }

    public int mzz() {
        return this.hr;
    }

    public String nts() {
        return this.eta;
    }

    public int nz() {
        return this.mlb;
    }

    public void od() {
        qdl(this, this.dps);
    }

    public boolean om() {
        return this.fco;
    }

    public String oth() {
        return this.jtx;
    }

    public int qk() {
        return this.ijp;
    }

    public int ra() {
        return this.dk;
    }

    public String rc() {
        return this.bch;
    }

    public float rdp() {
        return this.mo;
    }

    public float rq() {
        return this.qdl;
    }

    public String rzg() {
        return this.f16372ra;
    }

    public int se() {
        return this.zpu;
    }

    public int sy() {
        return this.irn;
    }

    public int syy() {
        return this.ji;
    }

    public int taz() {
        return this.wak;
    }

    public int tdy() {
        return this.ew;
    }

    public boolean tid() {
        return this.gt;
    }

    public String to() {
        return this.gsv;
    }

    public int tqd() {
        return this.zy;
    }

    public int tvp() {
        return this.tdy;
    }

    public int ud() {
        return this.f16368ca;
    }

    public String uw() {
        return this.auu;
    }

    public String vc() {
        return this.kr;
    }

    public void vm() {
        qdl(this, this.iw);
    }

    public String vu() {
        return this.ljh;
    }

    public int wak() {
        return this.ax;
    }

    public String wc() {
        return this.hzv;
    }

    public int wd() {
        return this.lme;
    }

    public int xdk() {
        return this.f16369gg;
    }

    public double xi() {
        return this.om;
    }

    public String xmv() {
        return this.exc;
    }

    public int xx() {
        List<qdl> list = this.rzg;
        if (list == null) {
            return 0;
        }
        for (qdl qdlVar : list) {
            if ("translate".equals(qdlVar.tvp()) && qdlVar.wd() < 0) {
                return -qdlVar.wd();
            }
        }
        return 0;
    }

    public int ygv() {
        return this.zvv;
    }

    public int yh() {
        return this.gy;
    }

    public float yt() {
        return this.tvp;
    }

    public boolean zlt() {
        return this.f16379yh;
    }

    public int zpu() {
        return this.vm;
    }

    public String zvv() {
        return this.fge;
    }

    public String zy() {
        return this.sy;
    }

    public void aaj(String str) {
        this.sy = str;
    }

    public void bch(int i10) {
        this.fzn = i10;
    }

    public void bjy(String str) {
        this.kdv = str;
    }

    public String bqt() {
        return this.jyq;
    }

    public void ekw(int i10) {
        this.ew = i10;
    }

    public void exc(String str) {
        this.xi = str;
    }

    public void exu(String str) {
        this.bch = str;
    }

    public void fco(int i10) {
        this.zpu = i10;
    }

    public void fs(String str) {
        this.ljh = str;
    }

    public void hkc(int i10) {
        this.blf = i10;
    }

    public void hzv(int i10) {
        this.zvv = i10;
    }

    public void jl(String str) {
        this.hzv = str;
    }

    public void jpc(float f10) {
        this.tvp = f10;
    }

    public void jtx(String str) {
        this.ekw = str;
    }

    public void jyq(int i10) {
        this.en = i10;
    }

    public void kdv(int i10) {
        this.ji = i10;
    }

    public void koa(int i10) {
        this.vm = i10;
    }

    public void ljh(int i10) {
        this.kab = i10;
    }

    public void lnr(int i10) {
        this.ygv = i10;
    }

    public void mml(int i10) {
        this.hr = i10;
    }

    public void mo(int i10) {
        this.tdy = i10;
    }

    public void mzz(int i10) {
        this.lme = i10;
    }

    public void oth(int i10) {
        this.nz = i10;
    }

    public void rc(int i10) {
        this.f16374se = i10;
    }

    public void rdp(String str) {
        this.f16373rc = str;
    }

    public void rq(String str) {
        this.oth = str;
    }

    public void to(String str) {
        this.jyq = str;
    }

    public void tvp(float f10) {
        this.to = f10;
    }

    public void ud(int i10) {
        this.gsp = i10;
    }

    public void uw(int i10) {
        this.lq = i10;
    }

    public void vu(int i10) {
        this.f16369gg = i10;
    }

    public void wd(float f10) {
        this.jpc = f10;
    }

    public void xmv(int i10) {
        this.kj = i10;
    }

    public void yt(String str) {
        this.hkc = str;
    }

    public void aaj(int i10) {
        this.zy = i10;
    }

    public void bch(String str) {
        this.f16370hd = str;
    }

    public void bjy(int i10) {
        this.wak = i10;
    }

    public void bqt(int i10) {
        this.f16371od = i10;
    }

    public void exc(int i10) {
        this.ijp = i10;
    }

    public void exu(int i10) {
        this.f16377wc = i10;
    }

    public void fs(int i10) {
        this.f16367ag = i10;
    }

    public void jl(int i10) {
        this.dk = i10;
    }

    public void jpc(String str) {
        this.exc = str;
    }

    public void jtx(int i10) {
        this.irn = i10;
    }

    public void jyq(String str) {
        this.f16372ra = str;
    }

    public void ljh(String str) {
        this.fge = str;
    }

    public void lnr(float f10) {
        this.lnr = f10;
    }

    public void mml(float f10) {
        this.mml = f10;
    }

    public void mo(float f10) {
        this.f16378wd = f10;
    }

    public void mzz(float f10) {
        this.mo = f10;
    }

    public void oth(String str) {
        this.qk = str;
    }

    public void rdp(int i10) {
        this.cx = i10;
    }

    public void rq(int i10) {
        this.ax = i10;
    }

    public void to(int i10) {
        this.gy = i10;
    }

    public void tvp(String str) {
        this.aaj = str;
    }

    public void ud(float f10) {
        this.f16375ud = f10;
    }

    public void uw(String str) {
        this.nts = str;
    }

    public void wd(String str) {
        this.jl = str;
    }

    public void xmv(String str) {
        this.eta = str;
    }

    public void yt(int i10) {
        this.mlb = i10;
    }

    public void bjy(boolean z10) {
        this.bx = z10;
    }

    public void exu(boolean z10) {
        this.f16376vc = z10;
    }

    public void fs(boolean z10) {
        this.hcs = z10;
    }

    public void jl(boolean z10) {
        this.jle = z10;
    }

    public void jpc(int i10) {
        this.bqt = i10;
    }

    public void jtx(boolean z10) {
        this.jut = z10;
    }

    public void lnr(double d10) {
        this.fs = d10;
    }

    public void mml(String str) {
        this.bjy = str;
    }

    public void mo(String str) {
        this.yt = str;
    }

    public void mzz(String str) {
        this.jtx = str;
    }

    public void rdp(boolean z10) {
        this.xx = z10;
    }

    public void rq(boolean z10) {
        this.lte = z10;
    }

    public void to(boolean z10) {
        this.tid = z10;
    }

    public void tvp(int i10) {
        this.mrf = i10;
    }

    public void ud(boolean z10) {
        this.mzz = z10;
    }

    public void wd(int i10) {
        this.xmv = i10;
    }

    public void yt(boolean z10) {
        this.jnw = z10;
    }

    public void jpc(boolean z10) {
        this.zlt = z10;
    }

    public void lnr(String str) {
        this.rdp = str;
    }

    public void mml(double d10) {
        this.koa = d10;
    }

    public void mo(double d10) {
        this.om = d10;
    }

    public void mzz(double d10) {
        this.vu = d10;
    }

    public void tvp(boolean z10) {
        this.taz = z10;
    }

    public void ud(double d10) {
        this.rq = d10;
    }

    public void wd(boolean z10) {
        this.jjk = z10;
    }

    public void lnr(boolean z10) {
        this.uw = z10;
    }

    public void mml(boolean z10) {
        this.fco = z10;
    }

    public void mo(boolean z10) {
        this.gt = z10;
    }

    public void mzz(boolean z10) {
        this.f16379yh = z10;
    }

    public void ud(String str) {
        this.exu = str;
    }

    public void lnr(JSONObject jSONObject) {
        this.dps = jSONObject;
    }

    public void mml(JSONObject jSONObject) {
        this.iw = jSONObject;
    }

    public void mzz(JSONObject jSONObject) {
        this.syy = jSONObject;
    }

    public void ud(JSONObject jSONObject) {
        this.car = jSONObject;
    }

    public boolean qdl() {
        return this.tqd;
    }

    public void qdl(boolean z10) {
        this.tqd = z10;
    }

    public void qdl(int i10) {
        this.f16368ca = i10;
    }

    public void qdl(double d10) {
        this.xdk = d10;
    }

    public void qdl(String str) {
        this.gsv = str;
    }

    public void qdl(float f10) {
        this.qdl = f10;
    }

    public void qdl(List<qdl> list) {
        this.rzg = list;
    }

    public void qdl(long j10) {
        this.vr = j10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void qdl(mo moVar, JSONObject jSONObject) {
        if (moVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            byte b10 = -1;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        b10 = 0;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        b10 = 1;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        b10 = 2;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        b10 = 3;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        b10 = 4;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        b10 = 5;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        b10 = 6;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        b10 = 7;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        b10 = 8;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        b10 = 9;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        b10 = 10;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        b10 = Ascii.VT;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        b10 = Ascii.FF;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        b10 = 13;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b10 = Ascii.SO;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b10 = Ascii.SI;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b10 = Ascii.DLE;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b10 = 17;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        b10 = Ascii.DC2;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        b10 = 19;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        b10 = Ascii.DC4;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        b10 = Ascii.NAK;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        b10 = Ascii.SYN;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        b10 = Ascii.ETB;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        b10 = Ascii.CAN;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        b10 = Ascii.EM;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        b10 = Ascii.SUB;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        b10 = Ascii.ESC;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        b10 = Ascii.FS;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        b10 = Ascii.GS;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        b10 = Ascii.RS;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        b10 = Ascii.US;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        b10 = 32;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        b10 = 33;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        b10 = 34;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        b10 = 35;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        b10 = 36;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        b10 = 37;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        b10 = 38;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        b10 = 39;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        b10 = 40;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        b10 = 41;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        b10 = 42;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        b10 = 43;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        b10 = 44;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        b10 = 45;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        b10 = 46;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        b10 = 47;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        b10 = 48;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        b10 = 49;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        b10 = 50;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        b10 = 51;
                    }
                    break;
                case 747804969:
                    if (next.equals(C4240b4.i.L)) {
                        b10 = 52;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        b10 = 53;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        b10 = 54;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        b10 = 55;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        b10 = 56;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        b10 = 57;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        b10 = 58;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        b10 = 59;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        b10 = 60;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        b10 = 61;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        b10 = 62;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        b10 = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b10 = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        b10 = 65;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        b10 = 66;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    moVar.lnr(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    moVar.bjy(jSONObject.optString(next));
                    break;
                case 2:
                    moVar.xmv(jSONObject.optString(next));
                    break;
                case 3:
                    moVar.wd(jSONObject.optString(next));
                    break;
                case 4:
                    moVar.tvp(jSONObject.optInt(next));
                    break;
                case 5:
                    moVar.jl(jSONObject.optBoolean(next));
                    break;
                case 6:
                    moVar.mo(jSONObject.optBoolean(next));
                    break;
                case 7:
                    moVar.exu(jSONObject.optString(next));
                    break;
                case 8:
                    moVar.mo((float) jSONObject.optDouble(next));
                    break;
                case 9:
                    moVar.ud(jSONObject.optString(next));
                    break;
                case 10:
                    moVar.ljh(jSONObject.optInt(next));
                    break;
                case 11:
                    moVar.lnr(jSONObject.optString(next));
                    break;
                case 12:
                    moVar.lnr((float) jSONObject.optDouble(next));
                    break;
                case 13:
                    moVar.mml(jSONObject.optString(next));
                    break;
                case 14:
                    moVar.jyq(jSONObject.optString(next));
                    break;
                case 15:
                    moVar.ud(jSONObject.optBoolean(next));
                    break;
                case 16:
                    moVar.to(jSONObject.optInt(next));
                    break;
                case 17:
                    moVar.to(jSONObject.optBoolean(next));
                    break;
                case 18:
                    moVar.qdl(jSONObject.optLong(next));
                    break;
                case 19:
                    moVar.oth(jSONObject.optString(next));
                    break;
                case 20:
                    moVar.yt(jSONObject.optInt(next));
                    break;
                case 21:
                    moVar.uw(jSONObject.optInt(next));
                    break;
                case 22:
                    moVar.tvp(jSONObject.optBoolean(next));
                    break;
                case 23:
                    moVar.bjy(jSONObject.optInt(next));
                    break;
                case 24:
                    moVar.bch(jSONObject.optInt(next));
                    break;
                case 25:
                    moVar.ud(jSONObject.optDouble(next));
                    break;
                case 26:
                    moVar.mo(jSONObject.optDouble(next));
                    break;
                case 27:
                    moVar.exc(jSONObject.optInt(next));
                    break;
                case 28:
                    moVar.jpc(jSONObject.optBoolean(next));
                    break;
                case 29:
                    moVar.rq(jSONObject.optInt(next));
                    break;
                case 30:
                    moVar.mo(jSONObject.optString(next));
                    break;
                case 31:
                    moVar.wd(jSONObject.optBoolean(next));
                    break;
                case 32:
                    moVar.rq(jSONObject.optString(next));
                    break;
                case 33:
                    moVar.oth(jSONObject.optInt(next));
                    break;
                case 34:
                    moVar.aaj(jSONObject.optString(next));
                    break;
                case 35:
                    moVar.aaj(jSONObject.optInt(next));
                    break;
                case 36:
                    moVar.qdl(jSONObject.optBoolean(next));
                    break;
                case 37:
                    moVar.jpc((float) jSONObject.optDouble(next));
                    break;
                case 38:
                    moVar.exc(jSONObject.optString(next));
                    break;
                case 39:
                    moVar.mzz(jSONObject.optString(next));
                    break;
                case 40:
                    moVar.jyq(jSONObject.optInt(next));
                    break;
                case 41:
                    moVar.mml((float) jSONObject.optDouble(next));
                    break;
                case 42:
                    moVar.lnr(jSONObject.optDouble(next));
                    break;
                case 43:
                    moVar.mzz((float) jSONObject.optDouble(next));
                    break;
                case 44:
                    moVar.rq(jSONObject.optBoolean(next));
                    break;
                case 45:
                    moVar.rdp(jSONObject.optBoolean(next));
                    break;
                case 46:
                    moVar.tvp((float) jSONObject.optDouble(next));
                    break;
                case 47:
                    moVar.jl(jSONObject.optString(next));
                    break;
                case 48:
                    moVar.vu(jSONObject.optInt(next));
                    break;
                case 49:
                    moVar.wd((float) jSONObject.optDouble(next));
                    break;
                case 50:
                    moVar.jpc(jSONObject.optString(next));
                    break;
                case 51:
                    moVar.tvp(jSONObject.optString(next));
                    break;
                case 52:
                    moVar.jtx(jSONObject.optInt(next));
                    break;
                case 53:
                    moVar.mzz(jSONObject.optBoolean(next));
                    break;
                case 54:
                    moVar.exu(jSONObject.optInt(next));
                    break;
                case 55:
                    moVar.yt(jSONObject.optString(next));
                    break;
                case 56:
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        moVar.wd(jSONObjectOptJSONObject.optInt("translateY", 0));
                        moVar.jpc(jSONObjectOptJSONObject.optInt("translateX", 0));
                        moVar.mml(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        moVar.mzz(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                    }
                    break;
                case 57:
                    moVar.mml(jSONObject.optBoolean(next));
                    break;
                case 58:
                    moVar.fs(jSONObject.optString(next));
                    break;
                case 59:
                    moVar.rdp(jSONObject.optString(next));
                    break;
                case 60:
                    moVar.qdl((float) jSONObject.optDouble(next));
                    break;
                case 61:
                    moVar.jtx(jSONObject.optString(next));
                    break;
                case 62:
                    moVar.to(jSONObject.optString(next));
                    break;
                case 63:
                    moVar.jl(jSONObject.optInt(next));
                    break;
                case 64:
                    moVar.ud((float) jSONObject.optDouble(next));
                    break;
                case 65:
                    moVar.fs(jSONObject.optInt(next));
                    break;
                case 66:
                    moVar.rdp(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
