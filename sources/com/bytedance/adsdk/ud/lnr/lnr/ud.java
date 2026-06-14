package com.bytedance.adsdk.ud.lnr.lnr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.ud.lnr.lnr.mzz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl {
    private boolean fs;
    private final List<qdl> jpc;
    private final Paint rq;
    private final RectF to;
    private final RectF tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> f16009wd;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.lnr.lnr.ud$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[mzz.ud.values().length];
            qdl = iArr;
            try {
                iArr[mzz.ud.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[mzz.ud.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ud(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar, List<mzz> list, com.bytedance.adsdk.ud.wd wdVar, Context context) {
        int i10;
        qdl qdlVar;
        mzz.ud udVarFs;
        int i11;
        super(tvpVar, mzzVar);
        this.jpc = new ArrayList();
        this.tvp = new RectF();
        this.to = new RectF();
        this.rq = new Paint();
        this.fs = true;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarJyq = mzzVar.jyq();
        if (udVarJyq != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = udVarJyq.qdl();
            this.f16009wd = qdlVarQdl;
            qdl(qdlVarQdl);
            this.f16009wd.qdl(this);
        } else {
            this.f16009wd = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(wdVar.exu().size());
        int size = list.size() - 1;
        qdl qdlVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            mzz mzzVar2 = list.get(size);
            qdl qdlVarQdl2 = qdl.qdl(this, mzzVar2, tvpVar, wdVar, context);
            if (qdlVarQdl2 != null) {
                longSparseArray.put(qdlVarQdl2.ud().mzz(), qdlVarQdl2);
                if (qdlVar2 != null) {
                    qdlVar2.qdl(qdlVarQdl2);
                    qdlVar2 = null;
                } else {
                    this.jpc.add(0, qdlVarQdl2);
                    if (mzzVar2 != null && (udVarFs = mzzVar2.fs()) != null && ((i11 = AnonymousClass1.qdl[udVarFs.ordinal()]) == 1 || i11 == 2)) {
                        qdlVar2 = qdlVarQdl2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            qdl qdlVar3 = (qdl) longSparseArray.get(longSparseArray.keyAt(i10));
            if (qdlVar3 != null && (qdlVar = (qdl) longSparseArray.get(qdlVar3.ud().exu())) != null) {
                qdlVar3.ud(qdlVar);
            }
        }
    }

    public List<qdl> fs() {
        return this.jpc;
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void qdl(boolean z10) {
        super.qdl(z10);
        Iterator<qdl> it = this.jpc.iterator();
        while (it.hasNext()) {
            it.next().qdl(z10);
        }
    }

    public void ud(boolean z10) {
        this.fs = z10;
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i10) {
        super.ud(canvas, matrix, i10);
        com.bytedance.adsdk.ud.mzz.qdl("CompositionLayer#draw");
        this.to.set(0.0f, 0.0f, this.lnr.jpc(), this.lnr.tvp());
        matrix.mapRect(this.to);
        boolean z10 = this.f16004ud.tvp() && this.jpc.size() > 1 && i10 != 255;
        if (z10) {
            this.rq.setAlpha(i10);
            com.bytedance.adsdk.ud.mo.mo.qdl(canvas, this.to, this.rq);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            if (((this.fs || !"__container".equals(this.lnr.mo())) && !this.to.isEmpty()) ? canvas.clipRect(this.to) : true) {
                this.jpc.get(size).qdl(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.ud.mzz.ud("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z10) {
        super.qdl(rectF, matrix, z10);
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            this.tvp.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.jpc.get(size).qdl(this.tvp, this.qdl, true);
            rectF.union(this.tvp);
        }
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void qdl(float f10) {
        super.qdl(f10);
        if (this.f16009wd != null) {
            f10 = ((this.f16009wd.wd().floatValue() * this.lnr.qdl().fs()) - this.lnr.qdl().mo()) / (this.f16004ud.xmv().yt() + 0.01f);
        }
        if (this.f16009wd == null) {
            f10 -= this.lnr.lnr();
        }
        if (this.lnr.ud() != 0.0f && !"__container".equals(this.lnr.mo())) {
            f10 /= this.lnr.ud();
        }
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            this.jpc.get(size).qdl(f10);
        }
    }
}
