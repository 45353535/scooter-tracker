package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.ud.qdl.ud.qdl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public class jtx implements exu, mzz, rq, to, qdl.InterfaceC0205qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> jpc;
    private final com.bytedance.adsdk.ud.tvp lnr;
    private final com.bytedance.adsdk.ud.lnr.lnr.qdl mml;
    private final boolean mo;
    private final String mzz;
    private mml to;
    private final com.bytedance.adsdk.ud.qdl.ud.jtx tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> f16087wd;
    private final Matrix qdl = new Matrix();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Path f16086ud = new Path();

    public jtx(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.fs fsVar) {
        this.lnr = tvpVar;
        this.mml = qdlVar;
        this.mzz = fsVar.qdl();
        this.mo = fsVar.mzz();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = fsVar.ud().qdl();
        this.f16087wd = qdlVarQdl;
        qdlVar.qdl(qdlVarQdl);
        qdlVarQdl.qdl(this);
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl2 = fsVar.lnr().qdl();
        this.jpc = qdlVarQdl2;
        qdlVar.qdl(qdlVarQdl2);
        qdlVarQdl2.qdl(this);
        com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = fsVar.mml().to();
        this.tvp = jtxVar;
        jtxVar.qdl(qdlVar);
        jtxVar.qdl(this);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        Path pathMml = this.to.mml();
        this.f16086ud.reset();
        float fFloatValue = this.f16087wd.wd().floatValue();
        float fFloatValue2 = this.jpc.wd().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.qdl.set(this.tvp.ud(i10 + fFloatValue2));
            this.f16086ud.addPath(pathMml, this.qdl);
        }
        return this.f16086ud;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.to
    public void qdl(ListIterator<lnr> listIterator) {
        if (this.to != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.to = new mml(this.lnr, this.mml, "Repeater", this.mo, arrayList, null);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        this.to.qdl(list, list2);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f16087wd.wd().floatValue();
        float fFloatValue2 = this.jpc.wd().floatValue();
        float fFloatValue3 = this.tvp.ud().wd().floatValue() / 100.0f;
        float fFloatValue4 = this.tvp.lnr().wd().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.qdl.set(matrix);
            float f10 = i11;
            this.qdl.preConcat(this.tvp.ud(f10 + fFloatValue2));
            this.to.qdl(canvas, this.qdl, (int) (i10 * com.bytedance.adsdk.ud.mo.mzz.qdl(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z10) {
        this.to.qdl(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0205qdl
    public void qdl() {
        this.lnr.invalidateSelf();
    }
}
