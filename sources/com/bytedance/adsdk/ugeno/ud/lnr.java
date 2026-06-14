package com.bytedance.adsdk.ugeno.ud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.activity.s;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.jl;
import com.bytedance.adsdk.ugeno.core.jpc;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.core.rdp;
import com.bytedance.adsdk.ugeno.core.rq;
import com.bytedance.adsdk.ugeno.core.to;
import com.bytedance.adsdk.ugeno.core.ud.mml;
import com.bytedance.adsdk.ugeno.core.ud.mzz;
import com.bytedance.adsdk.ugeno.core.wd;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.mml.tvp;
import com.bytedance.adsdk.ugeno.qdl;
import com.bytedance.adsdk.ugeno.qdl.mo;
import com.bytedance.adsdk.ugeno.ud.qdl;
import com.bytedance.adsdk.ugeno.wd.qdl;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.impl.H2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnr<T extends View> implements View.OnTouchListener, bjy.qdl, bjy.ud, mml {
    protected float aaj;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    protected float f16254ag;
    private boolean auu;
    protected ImageView.ScaleType ax;
    private boolean az;
    protected boolean bch;
    protected float bjy;
    protected jpc blf;
    private boolean bo;
    protected float bqt;
    protected jtx bx;

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    private boolean f16255ca;
    protected String car;
    protected float cx;
    protected boolean dk;
    private boolean dps;
    protected boolean ekw;
    protected mo en;
    private boolean eta;
    protected float ew;
    protected float exc;
    protected float exu;
    protected boolean fco;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.lnr fge;
    private com.bytedance.adsdk.ugeno.mml.qdl.qdl fhs;
    protected String fs;
    protected float fzn;

    /* JADX INFO: renamed from: gg, reason: collision with root package name */
    protected float f16256gg;
    private boolean gsp;
    private boolean gsv;
    protected float gt;
    protected String gy;

    @Deprecated
    private mzz hcs;

    /* JADX INFO: renamed from: hd, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.qdl f16257hd;
    protected boolean hkc;
    private String hr;
    private boolean hvi;
    protected boolean hzv;
    protected ViewGroup.LayoutParams ijp;
    private long ir;
    protected float irn;
    private boolean iw;
    protected float ji;
    protected boolean jjk;
    protected float jl;
    protected qdl.C0216qdl jle;
    protected Map<Integer, exu> jnw;
    protected wd.qdl jpc;
    protected float jtx;
    protected com.bytedance.adsdk.ugeno.core.mo jut;
    protected float jyq;
    protected float kab;
    protected boolean kdv;

    @Deprecated
    private mml.qdl kj;
    protected float koa;
    private boolean kr;
    protected boolean ljh;
    private boolean lme;
    protected JSONObject lnr;
    protected float lq;
    protected float lte;
    protected int mlb;
    protected JSONObject mml;
    protected qdl<ViewGroup> mo;
    protected int mrf;
    protected T mzz;
    private boolean nts;
    protected float nz;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private to f16258od;
    protected boolean om;
    protected boolean oth;
    private boolean oz;
    private boolean qdl;
    protected float qk;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    protected float f16259ra;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    protected float f16260rc;
    protected float rdp;
    protected String rq;
    protected float rzg;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.mo f16261se;
    private boolean skm;
    protected int sy;
    private boolean syy;
    protected boolean taz;
    private boolean tdy;
    protected float tid;
    protected boolean to;
    protected float tqd;
    protected rq tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected Context f16262ud;
    private boolean uvi;
    protected boolean uw;

    /* JADX INFO: renamed from: vc, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.ud f16263vc;
    private String vm;
    private jl vr;
    protected float vu;
    private float vxg;
    protected float wak;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    protected boolean f16264wc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected qdl<ViewGroup> f16265wd;
    protected tvp xdk;
    protected boolean xi;
    protected float xmv;
    private boolean xx;
    private GradientDrawable ygv;

    /* JADX INFO: renamed from: yh, reason: collision with root package name */
    protected float f16266yh;
    private JSONObject yre;
    protected float yt;
    protected boolean zlt;
    protected boolean zpu;
    protected bjy zvv;
    protected com.bytedance.adsdk.ugeno.qdl.qdl zy;

    public lnr(Context context) {
        this(context, null);
    }

    @Deprecated
    private void mml() {
        com.bytedance.adsdk.ugeno.core.ud.mml mmlVarMml;
        this.mzz.setVisibility(this.mlb);
        float f10 = this.ji;
        if (f10 != 0.0f) {
            this.mzz.setRotation(f10);
        }
        wd.qdl qdlVar = this.jpc;
        if (qdlVar != null && TextUtils.isEmpty(qdlVar.ud())) {
            this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lnr lnrVar = lnr.this;
                    if (lnrVar.blf != null) {
                        boolean unused = lnrVar.oz;
                    }
                }
            });
        } else if (ud(1) && !this.nts) {
            this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    lnr lnrVar = lnr.this;
                    if (lnrVar.zvv == null || !lnrVar.oz) {
                        return;
                    }
                    lnr lnrVar2 = lnr.this;
                    bjy bjyVar = lnrVar2.zvv;
                    exu exuVar = lnrVar2.jnw.get(1);
                    lnr lnrVar3 = lnr.this;
                    bjyVar.qdl(exuVar, lnrVar3, lnrVar3);
                }
            });
        }
        if (this.zvv != null && ud(4)) {
            if (ud(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + hkc());
                this.eta = true;
                this.hcs = new mzz(this.f16262ud, this.jnw.get(4), this.jnw.get(1), this.eta, jjk());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + hkc());
                this.hcs = new mzz(this.f16262ud, this.jnw.get(4), this.eta, jjk());
            }
        }
        if (this.zvv != null && ud(1) && this.nts) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.nts + ", view.id: " + hkc());
            this.fge = new com.bytedance.adsdk.ugeno.core.ud.lnr(this.f16262ud, this.jnw.get(1));
        }
        tvp();
        if (this.zvv != null && ud(3) && (mmlVarMml = com.bytedance.adsdk.ugeno.mzz.qdl().mml()) != null) {
            this.kj = mmlVarMml.qdl(this.f16262ud, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.3
            };
        }
        if (this.zvv != null && ud(9)) {
            com.bytedance.adsdk.ugeno.core.ud.mo moVar = new com.bytedance.adsdk.ugeno.core.ud.mo(this.f16262ud, this.jnw.get(9), this);
            this.f16261se = moVar;
            moVar.qdl(this.zvv);
        }
        if (ud(10)) {
            com.bytedance.adsdk.ugeno.core.ud.ud udVar = new com.bytedance.adsdk.ugeno.core.ud.ud(this.f16262ud, this.jnw.get(10), this);
            this.f16263vc = udVar;
            udVar.qdl(this.zvv);
        }
    }

    private void taz() {
        float f10 = this.xi ? this.f16266yh : this.cx;
        float f11 = this.jjk ? this.gt : this.cx;
        float f12 = this.zlt ? this.wak : this.cx;
        float f13 = this.taz ? this.irn : this.cx;
        this.ygv.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    private void to() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.rq);
        this.mzz.setContentDescription(sb2);
    }

    private void tvp() {
        exu exuVar;
        if (this.zvv == null || !ud(18) || (exuVar = this.jnw.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectLnr = exuVar.lnr();
        if (jSONObjectLnr != null) {
            try {
                jSONObjectLnr.put("rotateZ", com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectLnr.optString("rotateZ"), this.mml));
            } catch (JSONException unused) {
            }
        }
        this.zvv.qdl(exuVar, this, this);
    }

    private void zlt() {
        if (TextUtils.equals("dashed", this.car)) {
            GradientDrawable gradientDrawable = this.ygv;
            float f10 = this.tid;
            gradientDrawable.setStroke((int) f10, this.sy, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.car)) {
                this.ygv.setStroke((int) this.tid, this.sy);
                return;
            }
            GradientDrawable gradientDrawable2 = this.ygv;
            float f11 = this.tid;
            gradientDrawable2.setStroke((int) f11, this.sy, f11 / 2.0f, f11);
        }
    }

    public float aaj() {
        return this.rzg;
    }

    public com.bytedance.adsdk.ugeno.mml.qdl.qdl ag() {
        return this.fhs;
    }

    public int ax() {
        return this.mrf;
    }

    public bjy bch() {
        return this.zvv;
    }

    public float bjy() {
        return this.kab;
    }

    protected void bqt() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapQdl;
        if (TextUtils.isEmpty(this.gy)) {
            if (this.zpu) {
                qdl(this.jle);
                return;
            } else {
                this.ygv.setColor(this.mrf);
                mml(this.mrf);
                return;
            }
        }
        if (!this.gy.startsWith("local://")) {
            koa();
            return;
        }
        String strReplace = this.gy.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.f16264wc ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f16262ud.getResources().openRawResource(com.bytedance.adsdk.ugeno.wd.mml.ud(this.f16262ud, strReplace)), null, options);
            if (this.f16264wc && (bitmapQdl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, bitmapDecodeStream, (int) this.f16254ag)) != null) {
                bitmapDrawable = new BitmapDrawable(this.f16262ud.getResources(), bitmapQdl);
                qdl(bitmapDrawable);
            } else {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.f16262ud.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
                qdl(bitmapDrawable);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean cx() {
        return this.lte > 0.0f;
    }

    public qdl ekw() {
        return this.mo;
    }

    public float exc() {
        return this.f16256gg;
    }

    public void exu() {
        this.bo = this.mml.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.bo);
    }

    public int fco() {
        return (int) this.exu;
    }

    public JSONObject fs() {
        return this.mml;
    }

    public float gt() {
        T t10 = this.mzz;
        if (t10 instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t10).getStretch();
        }
        return 0.0f;
    }

    public boolean gy() {
        return this.dk;
    }

    public String hkc() {
        return this.rq;
    }

    public String hzv() {
        return this.fs;
    }

    public float irn() {
        T t10 = this.mzz;
        if (t10 instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t10).getRubIn();
        }
        return 0.0f;
    }

    public boolean jjk() {
        return this.bo;
    }

    public float jl() {
        return this.fzn;
    }

    public void jpc() {
        to toVar = this.f16258od;
        if (toVar != null) {
            toVar.ud();
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.lnr();
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.lnr();
        }
    }

    public float jtx() {
        return this.f16259ra;
    }

    public float jyq() {
        return this.ji;
    }

    public boolean kdv() {
        return this.to;
    }

    protected void koa() {
        com.bytedance.adsdk.ugeno.mzz.qdl().ud().qdl(this.tvp, this.gy, new qdl.InterfaceC0211qdl() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.4
            @Override // com.bytedance.adsdk.ugeno.qdl.InterfaceC0211qdl
            public void qdl(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                lnr lnrVar = lnr.this;
                if (!lnrVar.f16264wc) {
                    com.bytedance.adsdk.ugeno.wd.jpc.qdl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            lnr.this.qdl(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapQdl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(lnrVar.f16262ud, bitmap, (int) lnrVar.f16254ag);
                if (bitmapQdl != null) {
                    com.bytedance.adsdk.ugeno.wd.jpc.qdl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            lnr.this.qdl(new BitmapDrawable(bitmapQdl));
                        }
                    });
                }
            }
        });
    }

    public float ljh() {
        return this.cx;
    }

    public lnr<T> mo(String str) {
        return ud(str);
    }

    public int mrf() {
        return (int) this.rdp;
    }

    public lnr<T> mzz(String str) {
        return qdl(str);
    }

    protected void om() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        mzz mzzVar;
        bjy bjyVar;
        com.bytedance.adsdk.ugeno.core.ud.lnr lnrVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            wc();
        } else if (action == 1 || action == 3) {
            om();
        }
        jtx jtxVar = this.bx;
        if (jtxVar != null) {
            jtxVar.qdl(this, motionEvent);
        }
        if (ud(17) && motionEvent.getAction() == 0) {
            this.zvv.qdl(this.jnw.get(17), this, this);
        }
        if (ud(1) && this.nts && (bjyVar = this.zvv) != null && (lnrVar = this.fge) != null) {
            return lnrVar.qdl(bjyVar, this, motionEvent);
        }
        bjy bjyVar2 = this.zvv;
        if (bjyVar2 != null && (mzzVar = this.hcs) != null) {
            return mzzVar.qdl(bjyVar2, this, motionEvent, jjk());
        }
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            return tvpVar.qdl(motionEvent);
        }
        return false;
    }

    public float oth() {
        return this.ew;
    }

    public T qdl() {
        return null;
    }

    public wd.qdl rc() {
        return this.jpc;
    }

    protected void rdp() {
        this.mzz.setPadding((int) (this.ekw ? this.bqt : this.xmv), (int) (this.hzv ? this.vu : this.xmv), (int) (this.hkc ? this.koa : this.xmv), (int) (this.fco ? this.f16260rc : this.xmv));
    }

    public T rq() {
        return this.mzz;
    }

    public void ud(JSONObject jSONObject) {
        this.mml = jSONObject;
        exu();
    }

    public long uw() {
        return this.ir;
    }

    public ViewGroup.LayoutParams vu() {
        return this.ijp;
    }

    public float wak() {
        T t10 = this.mzz;
        if (t10 instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t10).getShine();
        }
        return 0.0f;
    }

    protected void wc() {
    }

    public void wd() {
        com.bytedance.adsdk.ugeno.core.qdl qdlVar = this.f16257hd;
        if (qdlVar != null) {
            to toVar = new to(this.mzz, qdlVar);
            this.f16258od = toVar;
            toVar.qdl();
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar2 = this.zy;
        if (qdlVar2 != null) {
            qdlVar2.qdl();
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.ud();
        }
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.mzz();
        }
        if (this.f16263vc != null && ud(10)) {
            this.f16263vc.qdl();
        }
        if (this.f16261se != null && ud(9)) {
            this.f16261se.qdl();
        }
        mzz mzzVar = this.hcs;
        if (mzzVar != null) {
            mzzVar.qdl();
        }
        this.ir = System.currentTimeMillis();
    }

    public boolean xi() {
        return this.gsp;
    }

    public JSONObject xmv() {
        return this.lnr;
    }

    public float yh() {
        T t10 = this.mzz;
        if (t10 instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t10).getRipple();
        }
        return 0.0f;
    }

    public float yt() {
        return this.tqd;
    }

    public lnr(Context context, qdl<ViewGroup> qdlVar) {
        this.exu = -2.0f;
        this.rdp = -2.0f;
        this.car = "solid";
        this.mlb = 0;
        this.dk = true;
        this.nz = 0.0f;
        this.kab = 0.0f;
        this.f16259ra = 0.0f;
        this.qk = 1.0f;
        this.tqd = 1.0f;
        this.fzn = 1.0f;
        this.lq = 0.0f;
        this.f16256gg = 0.0f;
        this.rzg = 0.0f;
        this.ji = 0.0f;
        this.ew = 1.0f;
        this.f16255ca = true;
        this.oz = true;
        this.skm = false;
        this.az = false;
        this.bo = false;
        this.vxg = 12.0f;
        this.f16262ud = context;
        this.mo = qdlVar;
        this.jnw = new HashMap();
        this.ygv = new GradientDrawable();
        this.mzz = (T) qdl();
    }

    private boolean bjy(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    private void lnr() {
        if (this.qdl) {
            this.mzz.setTranslationX(this.kab);
        }
        if (this.dps) {
            this.mzz.setTranslationY(this.f16259ra);
        }
        if (this.iw) {
            this.mzz.setScaleX(this.tqd);
        }
        if (this.lme) {
            this.mzz.setScaleY(this.fzn);
        }
        if (this.kr) {
            this.mzz.setRotation(this.lq);
        }
        if (this.xx) {
            this.mzz.setRotationX(this.f16256gg);
        }
        if (this.syy) {
            this.mzz.setRotationY(-this.rzg);
        }
        if (this.tdy) {
            this.mzz.setAlpha(this.ew);
        }
        float f10 = this.ji;
        if (f10 != 0.0f) {
            this.mzz.setRotation(f10);
        }
        if (this.kr || this.xx || this.syy) {
            this.mzz.setCameraDistance(10000.0f);
        }
    }

    public com.bytedance.adsdk.ugeno.mml.mml.lnr fs(String str) {
        tvp tvpVar;
        if (TextUtils.isEmpty(str) || (tvpVar = this.xdk) == null) {
            return null;
        }
        return tvpVar.ud(str);
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void mo() {
        if (this.vr == null || this.hvi) {
            return;
        }
        this.hvi = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void mzz() {
        if (this.vr == null || this.auu) {
            return;
        }
        this.auu = true;
    }

    public void qdl(JSONObject jSONObject) {
        this.mml = jSONObject;
        exu();
        JSONObject jSONObject2 = this.lnr;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        qdl.C0215qdl c0215qdl = s.a(this.mo) ? this.mo.to() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(this.lnr.optString(next), jSONObject);
            qdl(next, strQdl);
            if (c0215qdl != null) {
                c0215qdl.qdl(this.f16262ud, next, strQdl);
            }
        }
        if (c0215qdl != null) {
            qdl(c0215qdl.qdl());
        }
        if (this.yre == null || this.mml == null) {
            return;
        }
        try {
            if (!kdv()) {
                this.mml.put("i18n", this.yre);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.yre);
            this.mml.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    public List<com.bytedance.adsdk.ugeno.mml.mml.lnr> rq(String str) {
        tvp tvpVar;
        if (TextUtils.isEmpty(str) || (tvpVar = this.xdk) == null) {
            return null;
        }
        return tvpVar.qdl(str);
    }

    public com.bytedance.adsdk.ugeno.qdl.qdl exu(String str) {
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null && TextUtils.equals(str, qdlVar.mzz())) {
            return this.zy;
        }
        mo moVar = this.en;
        if (moVar != null) {
            return moVar.qdl(str);
        }
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ud() {
        bqt();
        rdp();
        lnr(this.mlb);
        lnr();
        mml();
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.qdl();
            this.xdk.ud();
            this.xdk.lnr();
        }
        this.mzz.setOnTouchListener(this);
        to();
        ViewGroup viewGroup = (ViewGroup) this.mzz.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f16255ca);
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.mml();
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.qdl();
        }
        tvp tvpVar2 = this.xdk;
        if (tvpVar2 != null) {
            tvpVar2.mml();
        }
        if (this.zvv == null || !ud(22)) {
            return;
        }
        this.zvv.qdl(this.jnw.get(22), this, this);
    }

    public void to(String str) {
        this.fs = str;
    }

    public void mo(int i10) {
        if (kdv()) {
            T t10 = this.mzz;
            if (t10 instanceof ud) {
                ((ud) t10).ud(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof ud) {
                ((ud) viewParent).ud(this.mzz, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mzz.getLayoutParams();
        layoutParams.height = i10;
        this.mzz.setLayoutParams(layoutParams);
    }

    public void mzz(int i10) {
        if (kdv()) {
            T t10 = this.mzz;
            if (t10 instanceof ud) {
                ((ud) t10).qdl(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof ud) {
                ((ud) viewParent).qdl(this.mzz, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mzz.getLayoutParams();
        layoutParams.width = i10;
        this.mzz.setLayoutParams(layoutParams);
    }

    private ImageView.ScaleType rdp(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.ax = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.ax = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.ax = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.ax = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.ax;
    }

    public lnr<T> jpc(String str) {
        return mml(str);
    }

    public void tvp(String str) {
        this.rq = str;
    }

    public lnr<T> wd(String str) {
        return lnr(str);
    }

    public void qdl(jl jlVar) {
        this.vr = jlVar;
    }

    public void qdl(jtx jtxVar) {
        this.bx = jtxVar;
    }

    public void lnr(int i10) {
        ViewParent viewParent = (ViewGroup) this.mzz.getParent();
        if (viewParent instanceof ud) {
            ((ud) viewParent).lnr(this.mzz, i10);
        } else {
            this.mzz.setVisibility(i10);
        }
    }

    public void qdl(bjy bjyVar) {
        this.zvv = bjyVar;
    }

    protected void qdl(qdl.C0216qdl c0216qdl) {
        if (c0216qdl == null) {
            return;
        }
        this.ygv.setShape(0);
        this.ygv.setOrientation(c0216qdl.qdl);
        if (Build.VERSION.SDK_INT >= 29) {
            this.ygv.setColors(c0216qdl.f16274ud, c0216qdl.lnr);
        } else {
            this.ygv.setColors(c0216qdl.f16274ud);
        }
        taz();
        zlt();
        this.mzz.setBackground(this.ygv);
    }

    public boolean ud(int i10) {
        Map<Integer, exu> map = this.jnw;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public void lnr(JSONObject jSONObject) {
        this.lnr = jSONObject;
    }

    protected lnr<T> ud(String str) {
        if (TextUtils.isEmpty(this.fs) || !TextUtils.equals(this.fs, str)) {
            return null;
        }
        return this;
    }

    protected lnr<T> lnr(String str) {
        if (!TextUtils.isEmpty(this.fs) && TextUtils.equals(this.fs, str) && this.mlb == 0) {
            return this;
        }
        return null;
    }

    protected void ud(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.jnw == null) {
            return;
        }
        try {
            int iQdl = rdp.qdl(str).qdl();
            exu exuVar = new exu();
            exuVar.qdl(iQdl);
            exuVar.qdl(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iQdl == 3) {
                try {
                    this.vxg = Float.parseFloat(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("shakeAmplitude"), this.mml));
                } catch (NumberFormatException unused) {
                    this.vxg = 12.0f;
                }
            }
            if (!(this.zvv instanceof com.bytedance.adsdk.ugeno.core.qdl.ud)) {
                qdl(iQdl, jSONObject, exuVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    protected void mml(int i10) {
        this.ygv.setShape(0);
        this.ygv.setColor(i10);
        taz();
        zlt();
        this.mzz.setBackground(this.ygv);
    }

    protected void qdl(Drawable drawable) {
        this.mzz.setBackground(drawable);
    }

    public void qdl(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.mzz;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.ijp = layoutParams;
    }

    protected lnr<T> mml(String str) {
        if (exu(str) != null) {
            return this;
        }
        return null;
    }

    public void qdl(boolean z10, boolean z11) {
        if (this.mzz != null) {
            qdl(this.ijp);
            if (z10) {
                mzz((int) this.exu);
            }
            if (z11) {
                mo((int) this.rdp);
            }
        }
    }

    public void qdl(wd.qdl qdlVar) {
        this.jpc = qdlVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void ud(Canvas canvas) {
        if (this instanceof qdl) {
            com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
            if (qdlVar != null) {
                qdlVar.ud(canvas);
            }
            mo moVar = this.en;
            if (moVar != null) {
                moVar.ud(canvas);
            }
        }
    }

    protected lnr<T> qdl(String str) {
        if (TextUtils.isEmpty(this.rq) || !TextUtils.equals(this.rq, str)) {
            return null;
        }
        return this;
    }

    public void qdl(boolean z10) {
        this.to = z10;
    }

    public void qdl(qdl qdlVar) {
        this.mo = qdlVar;
    }

    public void qdl(rq rqVar) {
        this.tvp = rqVar;
    }

    public void qdl(jpc jpcVar) {
        this.blf = jpcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void ud(int i10, int i11, int i12, int i13) {
        to toVar = this.f16258od;
        if (toVar != null) {
            toVar.qdl(i10, i11);
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.qdl(i10, i11);
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.qdl(i10, i11);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    b10 = 0;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    b10 = 1;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    b10 = 2;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b10 = 3;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    b10 = 4;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    b10 = 5;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    b10 = 6;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    b10 = 7;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    b10 = 8;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    b10 = 9;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    b10 = 10;
                }
                break;
            case -1332194002:
                if (str.equals(H2.f75840g)) {
                    b10 = Ascii.VT;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    b10 = Ascii.FF;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 13;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b10 = Ascii.SO;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b10 = Ascii.SI;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b10 = Ascii.DLE;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b10 = 17;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    b10 = Ascii.DC2;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    b10 = 19;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b10 = Ascii.DC4;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = Ascii.NAK;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = Ascii.SYN;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    b10 = Ascii.ETB;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    b10 = Ascii.CAN;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    b10 = Ascii.EM;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    b10 = Ascii.SUB;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b10 = Ascii.ESC;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    b10 = Ascii.FS;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b10 = Ascii.GS;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    b10 = Ascii.RS;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    b10 = Ascii.US;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b10 = 32;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    b10 = 33;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    b10 = 34;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b10 = 35;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b10 = 36;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    b10 = 37;
                }
                break;
            case 314070383:
                if (str.equals("animations")) {
                    b10 = 38;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b10 = 39;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b10 = 40;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b10 = 41;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b10 = 42;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b10 = 43;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b10 = 44;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b10 = 45;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b10 = 46;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b10 = 47;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b10 = 48;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b10 = 49;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 50;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b10 = 51;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    b10 = 52;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b10 = 53;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b10 = 54;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b10 = 55;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b10 = 56;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b10 = 57;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 58;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b10 = 59;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b10 = 60;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b10 = 61;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b10 = 62;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b10 = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b10 = SignedBytes.MAX_POWER_OF_TWO;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b10 = 65;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b10 = 66;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b10 = 67;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.oz = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 33:
            case 39:
            case 48:
            case 51:
            case 54:
            case 62:
            case 64:
                ud(str, str2);
                break;
            case 2:
                this.qdl = true;
                this.kab = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 3:
                this.dps = true;
                this.f16259ra = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 4:
                this.bqt = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.ekw = true;
                break;
            case 5:
                this.aaj = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 11:
            case 55:
                if (com.bytedance.adsdk.ugeno.wd.qdl.lnr(str2)) {
                    this.zpu = true;
                    this.jle = com.bytedance.adsdk.ugeno.wd.qdl.ud(str2);
                } else {
                    this.mrf = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, 0);
                    this.zpu = false;
                }
                break;
            case 12:
                this.xdk = tvp.qdl(this, str2);
                break;
            case 13:
                this.tdy = true;
                this.ew = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case 14:
                this.f16266yh = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.xi = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.rdp = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.rdp = -2.0f;
                } else {
                    this.rdp = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                }
                this.az = true;
                break;
            case 16:
                this.bjy = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                break;
            case 17:
                this.jl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.bch = true;
                break;
            case 19:
            case 56:
                this.gy = str2;
                break;
            case 20:
                this.kr = true;
                this.lq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 21:
                this.iw = true;
                this.tqd = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 22:
                this.lme = true;
                this.fzn = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 23:
                this.xmv = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.kdv = true;
                break;
            case 24:
                this.vm = str2;
                break;
            case 25:
                this.exc = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.uw = true;
                break;
            case 26:
                this.jyq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 27:
                this.rq = str2;
                break;
            case 28:
                this.yre = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONObject) null);
                break;
            case 29:
                this.fs = str2;
                break;
            case 30:
                float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                this.f16254ag = fQdl;
                if (fQdl > 0.0f) {
                    this.f16264wc = true;
                }
                break;
            case 31:
                this.vu = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.hzv = true;
                break;
            case 32:
                this.hr = str2;
                break;
            case 34:
                this.lte = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 35:
                this.iw = true;
                this.lme = true;
                float[] fArrLnr = com.bytedance.adsdk.ugeno.qdl.mml.lnr(str2);
                this.tqd = fArrLnr[0];
                this.fzn = fArrLnr[1];
                break;
            case 36:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.exu = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.exu = -2.0f;
                } else {
                    this.exu = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                }
                this.skm = true;
                break;
            case 37:
                this.f16260rc = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.fco = true;
                break;
            case 38:
                List<com.bytedance.adsdk.ugeno.qdl.lnr> listQdl = com.bytedance.adsdk.ugeno.qdl.mml.qdl(str2, this.mml);
                if (listQdl != null && !listQdl.isEmpty()) {
                    this.en = new mo(this.f16262ud, this, listQdl);
                    break;
                }
                break;
            case 40:
                this.gt = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.jjk = true;
                break;
            case 41:
                this.f16255ca = bjy(str2);
                break;
            case 42:
                this.wak = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.zlt = true;
                break;
            case 43:
                this.irn = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.taz = true;
                break;
            case 44:
                this.koa = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.hkc = true;
                break;
            case 45:
                this.sy = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case 46:
                this.car = str2;
                break;
            case 47:
                this.tid = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                break;
            case 49:
                this.yt = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.ljh = true;
                break;
            case 50:
                this.qdl = true;
                this.dps = true;
                float[] fArrLnr2 = com.bytedance.adsdk.ugeno.qdl.mml.lnr(str2);
                this.kab = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, fArrLnr2[0]);
                this.f16259ra = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, fArrLnr2[1]);
                break;
            case 52:
                try {
                    this.zy = new com.bytedance.adsdk.ugeno.qdl.qdl(this.f16262ud, this, com.bytedance.adsdk.ugeno.qdl.mml.qdl(new JSONObject(str2), this.mml));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 53:
                this.f16257hd = com.bytedance.adsdk.ugeno.core.qdl.qdl(str2, this);
                break;
            case 57:
                this.om = true;
                this.ax = rdp(str2);
                break;
            case 58:
                this.cx = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                break;
            case 59:
                this.xx = true;
                this.f16256gg = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 60:
                this.syy = true;
                this.rzg = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 61:
                this.ji = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 63:
                this.gsp = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case 65:
                if (TextUtils.equals("visible", str2)) {
                    this.mlb = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.mlb = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.mlb = 8;
                }
                this.mzz.setVisibility(this.mlb);
                break;
            case 66:
                this.jtx = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.f16262ud, str2);
                this.oth = true;
                break;
            case 67:
                this.dk = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public lnr ud(lnr lnrVar) {
        return (lnrVar.ekw() == null && (lnrVar instanceof qdl)) ? lnrVar : ud(lnrVar.ekw());
    }

    public void ud(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVarFs = fs(str);
        if (lnrVarFs == null) {
            return;
        }
        lnrVarFs.qdl(this.xdk);
        lnrVarFs.qdl(objArr);
    }

    @Deprecated
    protected void qdl(int i10, JSONObject jSONObject, exu exuVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            exu exuVar2 = new exu();
            exuVar2.qdl(jSONObjectOptJSONObject);
            exuVar2.qdl(this);
            exuVar.qdl(exuVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C4240b4.g.f42582e);
        if (jSONObjectOptJSONObject2 != null) {
            exu exuVar3 = new exu();
            exuVar3.qdl(jSONObjectOptJSONObject2);
            exuVar3.qdl(this);
            exuVar.ud(exuVar3);
        }
        exuVar.qdl(jSONObject);
        this.jnw.put(Integer.valueOf(i10), exuVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public int[] qdl(int i10, int i11) {
        if (this.lte > 0.0f) {
            if (this.skm) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.lte;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.az) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.lte;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.vr != null && !this.gsv) {
            this.gsv = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void qdl(int i10, int i11, int i12, int i13) {
        if (this.vr == null || this.uvi) {
            return;
        }
        this.uvi = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void qdl(Canvas canvas, IAnimation iAnimation) {
        to toVar = this.f16258od;
        if (toVar != null) {
            toVar.qdl(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void qdl(Canvas canvas) {
        if (this instanceof qdl) {
            return;
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.qdl(canvas);
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.qdl(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy.ud
    public void qdl(exu exuVar) {
        qdl<ViewGroup> qdlVar;
        lnr<T> lnrVarMzz;
        if (exuVar == null || exuVar.lnr() == null || !TextUtils.equals(exuVar.lnr().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = exuVar.lnr().optString("nodeId");
        lnr(8);
        this.f16265wd = (qdl) ud(this);
        if (TextUtils.isEmpty(strOptString) || (qdlVar = this.f16265wd) == null || (lnrVarMzz = qdlVar.mzz(strOptString)) == null) {
            return;
        }
        lnrVarMzz.lnr(8);
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.qdl.qdl qdlVar) {
        this.fhs = qdlVar;
    }

    public void qdl(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listRq = rq(str);
        if (listRq == null || listRq.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listRq) {
            lnrVar.qdl(this.xdk);
            lnrVar.qdl(objArr);
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.core.mzz mzzVar) {
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.qdl(mzzVar);
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.core.mo moVar) {
        this.jut = moVar;
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.exu exuVar) {
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.qdl(exuVar);
        }
    }
}
