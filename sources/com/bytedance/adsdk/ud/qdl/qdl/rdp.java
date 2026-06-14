package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ud.lnr.ud.exc;
import com.bytedance.adsdk.ud.lnr.ud.to;
import com.bytedance.adsdk.ud.qdl.ud.qdl;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class rdp implements exu, rq, qdl.InterfaceC0205qdl {
    private boolean bjy;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> exu;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> fs;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> jpc;
    private final com.bytedance.adsdk.ud.tvp lnr;
    private final to.qdl mml;
    private final boolean mo;
    private final boolean mzz;
    private final Path qdl = new Path();
    private final ud rdp = new ud();
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> rq;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> to;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f16097ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> f16098wd;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.qdl.qdl.rdp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[to.qdl.values().length];
            qdl = iArr;
            try {
                iArr[to.qdl.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[to.qdl.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public rdp(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.to toVar) {
        this.lnr = tvpVar;
        this.f16097ud = toVar.qdl();
        to.qdl qdlVarUd = toVar.ud();
        this.mml = qdlVarUd;
        this.mzz = toVar.to();
        this.mo = toVar.rq();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = toVar.lnr().qdl();
        this.f16098wd = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = toVar.mml().qdl();
        this.jpc = qdlVarQdl2;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = toVar.mzz().qdl();
        this.tvp = qdlVarQdl3;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl4 = toVar.wd().qdl();
        this.rq = qdlVarQdl4;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl5 = toVar.tvp().qdl();
        this.exu = qdlVarQdl5;
        to.qdl qdlVar2 = to.qdl.STAR;
        if (qdlVarUd == qdlVar2) {
            this.to = toVar.mo().qdl();
            this.fs = toVar.jpc().qdl();
        } else {
            this.to = null;
            this.fs = null;
        }
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVar.qdl(qdlVarQdl3);
        qdlVar.qdl(qdlVarQdl4);
        qdlVar.qdl(qdlVarQdl5);
        if (qdlVarUd == qdlVar2) {
            qdlVar.qdl(this.to);
            qdlVar.qdl(this.fs);
        }
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
        qdlVarQdl3.qdl(this);
        qdlVarQdl4.qdl(this);
        qdlVarQdl5.qdl(this);
        if (qdlVarUd == qdlVar2) {
            this.to.qdl(this);
            this.fs.qdl(this);
        }
    }

    private void lnr() {
        float f10;
        float f11;
        int i10;
        float fCos;
        float fSin;
        float f12;
        float f13;
        double d10;
        float f14;
        int i11;
        float f15;
        double d11;
        float f16;
        float f17;
        double d12;
        float f18;
        float f19;
        float fFloatValue = this.f16098wd.wd().floatValue();
        double radians = Math.toRadians((this.tvp == null ? 0.0d : r2.wd().floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.mo) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = fFloatValue - ((int) fFloatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (double) ((1.0f - f22) * f21);
        }
        float fFloatValue2 = this.rq.wd().floatValue();
        float fFloatValue3 = this.to.wd().floatValue();
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar = this.fs;
        float fFloatValue4 = qdlVar != null ? qdlVar.wd().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar2 = this.exu;
        float fFloatValue5 = qdlVar2 != null ? qdlVar2.wd().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((fFloatValue2 - fFloatValue3) * f22) + fFloatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float fCos2 = (float) (d14 * Math.cos(radians));
            fSin = (float) (d14 * Math.sin(radians));
            this.qdl.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f20 * f22) / 2.0f));
            f12 = f22;
            fCos = fCos2;
            f13 = f21;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d15);
            fSin = (float) (d15 * Math.sin(radians));
            this.qdl.moveTo(fCos, fSin);
            f12 = f22;
            f13 = f21;
            d10 = radians + ((double) f13);
            f14 = 0.0f;
        }
        double dCeil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f23 = fSin;
        float f24 = fCos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= dCeil) {
                PointF pointFWd = this.jpc.wd();
                this.qdl.offset(pointFWd.x, pointFWd.y);
                this.qdl.close();
                return;
            }
            float f25 = z10 ? fFloatValue2 : fFloatValue3;
            if (f14 == f11 || d18 != dCeil - 2.0d) {
                i11 = i13;
                f15 = f13;
            } else {
                i11 = i13;
                f15 = (f20 * f12) / f10;
            }
            if (f14 == f11 || d18 != dCeil - 1.0d) {
                d11 = d18;
                f16 = f25;
            } else {
                d11 = d18;
                f16 = f14;
            }
            double d19 = f16;
            float fCos3 = (float) (d19 * Math.cos(d17));
            float f26 = f20;
            float fSin2 = (float) (d19 * Math.sin(d17));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.qdl.lineTo(fCos3, fSin2);
                f19 = fCos3;
                f18 = fSin2;
                f17 = f13;
                d12 = d17;
            } else {
                f17 = f13;
                d12 = d17;
                double dAtan2 = (float) (Math.atan2(f23, f24) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f27 = f24;
                float f28 = f23;
                f18 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f29 = z10 ? fFloatValue4 : fFloatValue5;
                float f30 = z10 ? fFloatValue5 : fFloatValue4;
                float f31 = (z10 ? fFloatValue3 : fFloatValue2) * f29 * 0.47829f;
                float f32 = fCos4 * f31;
                float f33 = f31 * fSin3;
                float f34 = (z10 ? fFloatValue2 : fFloatValue3) * f30 * 0.47829f;
                float f35 = fCos5 * f34;
                float f36 = f34 * fSin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f32 *= f12;
                        f33 *= f12;
                    } else if (d11 == dCeil - 1.0d) {
                        f35 *= f12;
                        f36 *= f12;
                    }
                }
                f19 = fCos3;
                this.qdl.cubicTo(f27 - f32, f28 - f33, fCos3 + f35, f18 + f36, f19, f18);
            }
            d17 = d12 + ((double) f15);
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f17;
            f24 = f19;
            f23 = f18;
            f20 = f26;
        }
    }

    private void mzz() {
        double d10;
        int iFloor = (int) Math.floor(this.f16098wd.wd().floatValue());
        double radians = Math.toRadians((this.tvp == null ? 0.0d : r2.wd().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.exu.wd().floatValue() / 100.0f;
        float fFloatValue2 = this.rq.wd().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.qdl.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double d14 = radians + d13;
        double dCeil = Math.ceil(d11);
        int i10 = 0;
        while (i10 < dCeil) {
            float fCos2 = (float) (Math.cos(d14) * d12);
            int i11 = i10;
            double d15 = d14;
            float fSin2 = (float) (d12 * Math.sin(d14));
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f10 = fFloatValue2 * fFloatValue * 0.25f;
                this.qdl.cubicTo(fCos - (f10 * fCos3), fSin - (f10 * fSin3), fCos2 + (((float) Math.cos(dAtan22)) * f10), fSin2 + (f10 * ((float) Math.sin(dAtan22))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                d10 = dCeil;
                fCos = fCos2;
                this.qdl.lineTo(fCos, fSin);
            }
            d14 = d15 + d13;
            i10 = i11 + 1;
            dCeil = d10;
        }
        PointF pointFWd = this.jpc.wd();
        this.qdl.offset(pointFWd.x, pointFWd.y);
        this.qdl.close();
    }

    private void ud() {
        this.bjy = false;
        this.lnr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        if (this.bjy) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.mzz) {
            this.bjy = true;
            return this.qdl;
        }
        int i10 = AnonymousClass1.qdl[this.mml.ordinal()];
        if (i10 == 1) {
            lnr();
        } else if (i10 == 2) {
            mzz();
        }
        this.qdl.close();
        this.rdp.qdl(this.qdl);
        this.bjy = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0205qdl
    public void qdl() {
        ud();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            lnr lnrVar = list.get(i10);
            if (lnrVar instanceof jyq) {
                jyq jyqVar = (jyq) lnrVar;
                if (jyqVar.ud() == exc.qdl.SIMULTANEOUSLY) {
                    this.rdp.qdl(jyqVar);
                    jyqVar.qdl(this);
                }
            }
        }
    }
}
