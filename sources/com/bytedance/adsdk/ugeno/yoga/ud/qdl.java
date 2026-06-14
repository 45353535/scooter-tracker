package com.bytedance.adsdk.ugeno.yoga.ud;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.qdl;
import com.bytedance.adsdk.ugeno.ud.qdl;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.bytedance.adsdk.ugeno.yoga.exu;
import com.bytedance.adsdk.ugeno.yoga.mml;
import com.bytedance.adsdk.ugeno.yoga.mo;
import com.bytedance.adsdk.ugeno.yoga.mzz;
import com.bytedance.adsdk.ugeno.yoga.rdp;
import com.bytedance.adsdk.ugeno.yoga.to;
import com.bytedance.adsdk.ugeno.yoga.ud.lnr;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends com.bytedance.adsdk.ugeno.ud.qdl<lnr> {
    private mzz dps;
    private rdp iw;
    private com.bytedance.adsdk.ugeno.yoga.qdl kr;
    private mo lme;
    private to syy;
    private com.bytedance.adsdk.ugeno.yoga.qdl xx;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0218qdl extends qdl.C0215qdl {

        /* JADX INFO: renamed from: ag, reason: collision with root package name */
        private boolean f16295ag;
        private boolean ax;
        public float bqt;
        private boolean cx;
        public int ekw;
        public int fco;
        private boolean gy;
        public int hkc;
        public int hzv;
        public int kdv;
        public float koa;
        public float mrf;
        private boolean om;

        /* JADX INFO: renamed from: rc, reason: collision with root package name */
        public float f16296rc;
        public int vu;

        /* JADX INFO: renamed from: wc, reason: collision with root package name */
        private boolean f16297wc;
        public int xmv;

        public C0218qdl(com.bytedance.adsdk.ugeno.ud.qdl qdlVar) {
            super(qdlVar);
            this.xmv = 1;
            this.bqt = 0.0f;
            this.koa = 1.0f;
            this.vu = com.bytedance.adsdk.ugeno.yoga.qdl.AUTO.qdl();
            this.f16296rc = -1.0f;
            this.kdv = exu.RELATIVE.qdl();
        }

        private void mml() {
            com.bytedance.adsdk.ugeno.ud.qdl qdlVar = this.uw;
            if (qdlVar instanceof qdl) {
                if (((qdl) qdlVar).zlt() == mzz.ROW && this.uw.fco() == -2 && this.qdl == -1.0f && !this.uw.cx()) {
                    this.qdl = -2.0f;
                    this.koa = 1.0f;
                    this.bqt = 1.0f;
                    this.gy = true;
                    this.f16296rc = -1.0f;
                }
                if (((qdl) this.uw).zlt() == mzz.COLUMN && this.uw.mrf() == -2 && this.f16269ud == -1.0f && !this.uw.cx()) {
                    this.f16269ud = -2.0f;
                    this.koa = 1.0f;
                    this.bqt = 1.0f;
                    this.gy = true;
                    this.f16296rc = -1.0f;
                }
            }
        }

        public boolean lnr() {
            float f10 = this.qdl;
            if (f10 == -1.0f && this.f16269ud == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.f16269ud == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0215qdl
        public String toString() {
            return "LayoutParams{mOrder=" + this.xmv + ", mFlexGrow=" + this.bqt + ", mFlexShrink=" + this.koa + ", mAlignSelf=" + this.vu + ", mFlexBasis=" + this.f16296rc + ", mPosition=" + this.kdv + ", mTop=" + this.ekw + ", mBottom=" + this.hkc + ", mLeft=" + this.hzv + ", mRight=" + this.fco + '}';
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0215qdl
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public lnr.qdl qdl() {
            mml();
            lnr.qdl qdlVar = new lnr.qdl((int) this.qdl, (int) this.f16269ud);
            qdlVar.fs((int) (this.aaj ? this.mo : this.mzz));
            qdlVar.rdp((int) (this.jyq ? this.f16270wd : this.mzz));
            qdlVar.rq((int) (this.oth ? this.jpc : this.mzz));
            qdlVar.exu((int) (this.ljh ? this.tvp : this.mzz));
            qdlVar.qdl(this.xmv);
            qdlVar.mzz(this.vu);
            qdlVar.ud(this.bqt);
            qdlVar.lnr(this.koa);
            qdlVar.jtx(this.lnr);
            qdlVar.yt(this.mml);
            if (this.gy) {
                qdlVar.mml(this.f16296rc);
            }
            qdlVar.mo(this.kdv);
            if (this.ax) {
                qdlVar.wd(this.ekw);
            }
            if (this.f16295ag) {
                qdlVar.tvp(this.hkc);
            }
            if (this.f16297wc) {
                qdlVar.jpc(this.hzv);
            }
            if (this.om) {
                qdlVar.to(this.fco);
            }
            if (this.cx && lnr()) {
                float f10 = this.mrf;
                if (f10 > 0.0f) {
                    qdlVar.bjy(f10);
                    qdlVar.lnr(0.0f);
                    qdlVar.ud(0.0f);
                }
            }
            return qdlVar;
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0215qdl
        public void qdl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.qdl(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.gy = true;
                    float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, -1.0f);
                    this.f16296rc = fQdl;
                    this.f16296rc = jpc.qdl(context, fQdl);
                    break;
                case "bottom":
                    this.f16295ag = true;
                    this.hkc = (int) jpc.qdl(context, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0));
                    break;
                case "top":
                    this.ax = true;
                    this.ekw = (int) jpc.qdl(context, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0));
                    break;
                case "left":
                    this.f16297wc = true;
                    this.hzv = (int) jpc.qdl(context, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0));
                    break;
                case "order":
                    this.xmv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1);
                    break;
                case "ratio":
                    this.cx = true;
                    this.mrf = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                    break;
                case "right":
                    this.om = true;
                    this.fco = (int) jpc.qdl(context, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0));
                    break;
                case "position":
                    this.kdv = exu.qdl(str2).qdl();
                    break;
                case "flexShrink":
                    this.koa = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.bqt = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.vu = com.bytedance.adsdk.ugeno.yoga.qdl.qdl(str2).qdl();
                    break;
            }
        }
    }

    public qdl(Context context) {
        super(context);
        this.dps = mzz.ROW;
        this.iw = rdp.NO_WRAP;
        this.lme = mo.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.qdl qdlVar = com.bytedance.adsdk.ugeno.yoga.qdl.STRETCH;
        this.kr = qdlVar;
        this.xx = qdlVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    protected void koa() {
        ImageView.ScaleType scaleType;
        if (this.f16264wc) {
            com.bytedance.adsdk.ugeno.mzz.qdl().ud().qdl(this.tvp, this.gy, new qdl.InterfaceC0211qdl() { // from class: com.bytedance.adsdk.ugeno.yoga.ud.qdl.1
                @Override // com.bytedance.adsdk.ugeno.qdl.InterfaceC0211qdl
                public void qdl(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut != null) {
                            com.bytedance.adsdk.ugeno.core.mo unused = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut;
                            String unused2 = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).gy;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut != null) {
                        com.bytedance.adsdk.ugeno.core.mo unused3 = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut;
                        String unused4 = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).gy;
                    }
                    final Bitmap bitmapQdl = jpc.qdl(((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).f16262ud, bitmap, (int) ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).f16254ag);
                    if (bitmapQdl != null) {
                        jpc.qdl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.ud.qdl.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                qdl.this.qdl(new BitmapDrawable(bitmapQdl));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.tvp.mml.qdl qdlVar = new com.bytedance.adsdk.ugeno.tvp.mml.qdl(this.f16262ud);
        com.bytedance.adsdk.ugeno.mzz.qdl().ud().qdl(this.tvp, this.gy, qdlVar, this.mzz.getWidth(), this.mzz.getHeight(), new qdl.InterfaceC0211qdl() { // from class: com.bytedance.adsdk.ugeno.yoga.ud.qdl.2
            @Override // com.bytedance.adsdk.ugeno.qdl.InterfaceC0211qdl
            public void qdl(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut != null) {
                        com.bytedance.adsdk.ugeno.core.mo unused = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut;
                        String unused2 = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).gy;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut != null) {
                    com.bytedance.adsdk.ugeno.core.mo unused3 = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).jut;
                    String unused4 = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).gy;
                }
            }
        });
        if (!this.om || (scaleType = this.ax) == ImageView.ScaleType.FIT_XY) {
            qdlVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            qdlVar.setScaleType(scaleType);
        }
        qdlVar.setCornerRadius(this.cx);
        lnr.qdl qdlVar2 = new lnr.qdl(-1, -1);
        qdlVar2.mo(exu.ABSOLUTE.qdl());
        qdlVar2.wd(0.0f);
        qdlVar2.jpc(0.0f);
        T t10 = this.mzz;
        if (t10 instanceof lnr) {
            ((lnr) t10).addView(qdlVar, 0, qdlVar2);
            qdl(qdlVar);
        }
    }

    public mzz zlt() {
        return this.dps;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public lnr qdl() {
        lnr lnrVar = new lnr(this.f16262ud);
        lnrVar.qdl(this);
        this.syy = lnrVar.getYogaNode();
        return lnrVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public C0218qdl to() {
        return new C0218qdl(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    protected void rdp() {
        if (this.kdv) {
            this.syy.ud(mml.ALL, this.xmv);
        }
        if (this.ekw) {
            this.syy.ud(mml.LEFT, this.bqt);
        }
        if (this.hkc) {
            this.syy.ud(mml.RIGHT, this.koa);
        }
        if (this.hzv) {
            this.syy.ud(mml.TOP, this.vu);
        }
        if (this.fco) {
            this.syy.ud(mml.BOTTOM, this.f16260rc);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        this.syy.qdl(this.dps);
        this.syy.qdl(this.iw);
        this.syy.qdl(this.lme);
        this.syy.qdl(this.kr);
        this.syy.lnr(this.xx);
        this.syy.qdl(true);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    protected void qdl(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.tvp.mml.qdl qdlVar = new com.bytedance.adsdk.ugeno.tvp.mml.qdl(this.f16262ud);
        qdlVar.setImageDrawable(drawable);
        if (this.om && (scaleType = this.ax) != ImageView.ScaleType.FIT_XY) {
            qdlVar.setScaleType(scaleType);
        } else {
            qdlVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        qdlVar.setCornerRadius(this.cx);
        lnr.qdl qdlVar2 = new lnr.qdl(-1, -1);
        qdlVar2.mo(exu.ABSOLUTE.qdl());
        qdlVar2.wd(0.0f);
        qdlVar2.jpc(0.0f);
        T t10 = this.mzz;
        if (t10 instanceof lnr) {
            ((lnr) t10).addView(qdlVar, 0, qdlVar2);
            qdl(qdlVar);
        }
    }

    private void qdl(final com.bytedance.adsdk.ugeno.tvp.mml.qdl qdlVar) {
        this.mzz.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.ud.qdl.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                to toVarQdl;
                if (((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).mzz == null || (toVarQdl = ((lnr) ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).mzz).qdl(qdlVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).mzz.getWidth();
                toVarQdl.mml(width);
                int height = ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).mzz.getHeight();
                toVarQdl.mo(height);
                qdlVar.setCornerRadius(((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).cx);
                ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).mzz.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.ud.lnr) qdl.this).mzz.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        super.qdl(lnrVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, ViewGroup.LayoutParams layoutParams) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
        View viewRq = lnrVar.rq();
        if (viewRq != null) {
            ((lnr) this.mzz).addView(viewRq, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.kr = com.bytedance.adsdk.ugeno.yoga.qdl.qdl(str2);
                break;
            case "flexDirection":
                this.dps = mzz.qdl(str2);
                break;
            case "alignContent":
                this.xx = com.bytedance.adsdk.ugeno.yoga.qdl.qdl(str2);
                break;
            case "flexWrap":
                this.iw = rdp.qdl(str2);
                break;
            case "justifyContent":
                this.lme = mo.qdl(str2);
                break;
        }
    }
}
