package com.bytedance.adsdk.ugeno.yoga.ud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.qdl.jpc;
import com.bytedance.adsdk.ugeno.qdl.wd;
import com.bytedance.adsdk.ugeno.yoga.exu;
import com.bytedance.adsdk.ugeno.yoga.mo;
import com.bytedance.adsdk.ugeno.yoga.mzz;
import com.bytedance.adsdk.ugeno.yoga.rdp;
import com.bytedance.adsdk.ugeno.yoga.rq;
import com.bytedance.adsdk.ugeno.yoga.to;
import com.bytedance.adsdk.ugeno.yoga.tvp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends ViewGroup implements wd, com.bytedance.adsdk.ugeno.ud.ud {
    private mml lnr;
    private jpc mml;
    private final Map<View, to> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final to f16290ud;

    public lnr(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        to toVarQdl;
        this.f16290ud.qdl((com.bytedance.adsdk.ugeno.yoga.wd) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.ud.ud) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.qdl.containsKey(view)) {
            return;
        }
        if (view instanceof lnr) {
            toVarQdl = ((lnr) view).getYogaNode();
        } else {
            toVarQdl = this.qdl.containsKey(view) ? this.qdl.get(view) : rq.qdl();
            toVarQdl.qdl(view);
            toVarQdl.qdl((com.bytedance.adsdk.ugeno.yoga.wd) new ud());
        }
        qdl((qdl) view.getLayoutParams(), toVarQdl, view);
        this.qdl.put(view, toVarQdl);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f16290ud.qdl()));
        } else {
            to toVar = this.f16290ud;
            toVar.qdl(toVarQdl, toVar.qdl());
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qdl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.ud(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qdl(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qdl(layoutParams);
    }

    public float getBorderRadius() {
        return this.mml.qdl();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.mml.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.mml.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.mml.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.mml.getStretch();
    }

    public to getYogaNode() {
        return this.f16290ud;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void lnr(View view, int i10) {
        mml(view, i10);
    }

    public void mml(View view, int i10) {
        int iQdl;
        view.setVisibility(i10);
        try {
            to toVar = this.qdl.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iQdl = this.f16290ud.qdl(toVar)) == -1) {
                    return;
                }
                this.f16290ud.ud(iQdl);
                view.setTag(151060224, Integer.valueOf(iQdl));
                qdl(this.f16290ud);
                return;
            }
            if (tag == null || this.f16290ud.qdl(toVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.f16290ud.qdl()) {
                this.f16290ud.qdl(this.qdl.get(view), iIntValue);
            } else {
                this.f16290ud.qdl(this.qdl.get(view), this.f16290ud.qdl());
            }
            qdl(this.f16290ud);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.qdl(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        if (!(getParent() instanceof lnr)) {
            qdl(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        qdl(this.f16290ud, 0.0f, 0.0f);
        mml mmlVar2 = this.lnr;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof lnr)) {
            qdl(i10, i11);
        }
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            setMeasuredDimension(iArrQdl[0], iArrQdl[1]);
        } else {
            setMeasuredDimension(Math.round(this.f16290ud.jpc()), Math.round(this.f16290ud.tvp()));
        }
        mml mmlVar2 = this.lnr;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public to qdl(View view) {
        return this.qdl.get(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qdl(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qdl(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        qdl(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        qdl(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        qdl(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            qdl(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            qdl(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.mml.qdl(i10);
    }

    public void setBorderRadius(float f10) {
        this.mml.qdl(f10);
    }

    public void setRipple(float f10) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.ud(f10);
        }
    }

    public void setRubIn(float f10) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.mzz(f10);
        }
    }

    public void setShine(float f10) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.lnr(f10);
        }
    }

    public void setStretch(float f10) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.mml(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void ud(int i10) {
        to toVar = this.f16290ud;
        if (toVar != null) {
            ud(toVar, i10);
            requestLayout();
        }
    }

    public lnr(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mml = new jpc(this);
        to toVarQdl = rq.qdl();
        this.f16290ud = toVarQdl;
        this.qdl = new HashMap();
        toVarQdl.qdl(this);
        toVarQdl.qdl((com.bytedance.adsdk.ugeno.yoga.wd) new ud());
        qdl((qdl) generateDefaultLayoutParams(), toVarQdl, this);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void qdl(int i10) {
        to toVar = this.f16290ud;
        if (toVar != null) {
            qdl(toVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void ud(View view, int i10) {
        to toVarQdl;
        if (view == null || (toVarQdl = qdl(view)) == null) {
            return;
        }
        ud(toVarQdl, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void qdl(View view, int i10) {
        to toVarQdl;
        if (view == null || (toVarQdl = qdl(view)) == null) {
            return;
        }
        qdl(toVarQdl, i10);
        view.requestLayout();
    }

    private void ud(to toVar, int i10) {
        if (i10 == -1) {
            toVar.wd(100.0f);
        } else if (i10 == -2) {
            toVar.mzz();
        } else {
            toVar.mo(i10);
        }
    }

    private void qdl(to toVar, int i10) {
        if (i10 == -1) {
            toVar.mzz(100.0f);
        } else if (i10 == -2) {
            toVar.mml();
        } else {
            toVar.mml(i10);
        }
    }

    public static class ud implements com.bytedance.adsdk.ugeno.yoga.wd {
        @Override // com.bytedance.adsdk.ugeno.yoga.wd
        public long qdl(to toVar, float f10, com.bytedance.adsdk.ugeno.yoga.jpc jpcVar, float f11, com.bytedance.adsdk.ugeno.yoga.jpc jpcVar2) {
            View view = (View) toVar.to();
            if (view == null || (view instanceof lnr)) {
                return tvp.qdl(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, qdl(jpcVar)), View.MeasureSpec.makeMeasureSpec((int) f11, qdl(jpcVar2)));
            return tvp.qdl(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int qdl(com.bytedance.adsdk.ugeno.yoga.jpc jpcVar) {
            if (jpcVar == com.bytedance.adsdk.ugeno.yoga.jpc.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return jpcVar == com.bytedance.adsdk.ugeno.yoga.jpc.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class qdl extends ViewGroup.LayoutParams {
        private float bjy;
        private float exc;
        private float exu;
        private float fs;
        private float jl;
        private float jpc;
        private float jtx;
        private float lnr;
        private float mml;
        private float mo;
        private float mzz;
        SparseArray<Float> qdl;
        private float rdp;
        private float rq;
        private float to;
        private float tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        SparseArray<String> f16291ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private float f16292wd;
        private float yt;

        public qdl(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof qdl) {
                qdl qdlVar = (qdl) layoutParams;
                this.qdl = qdlVar.qdl.clone();
                this.f16291ud = qdlVar.f16291ud.clone();
                return;
            }
            this.qdl = new SparseArray<>();
            this.f16291ud = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.qdl.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.qdl.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void bjy(float f10) {
            this.yt = f10;
            this.qdl.put(25, Float.valueOf(f10));
        }

        public void exu(float f10) {
            this.mzz = f10;
            this.qdl.put(19, Float.valueOf(f10));
        }

        public void fs(float f10) {
            this.mml = f10;
            this.qdl.put(18, Float.valueOf(f10));
        }

        public void jpc(float f10) {
            this.rdp = f10;
            this.qdl.put(11, Float.valueOf(f10));
        }

        public void jtx(float f10) {
            this.jl = f10;
            this.qdl.put(27, Float.valueOf(f10));
        }

        public void lnr(float f10) {
            this.tvp = f10;
            this.qdl.put(7, Float.valueOf(f10));
        }

        public void mml(float f10) {
            this.to = f10;
            this.qdl.put(8, Float.valueOf(f10));
        }

        public void mo(float f10) {
            this.fs = f10;
            this.qdl.put(14, Float.valueOf(f10));
        }

        public void mzz(float f10) {
            this.rq = f10;
            this.qdl.put(9, Float.valueOf(f10));
        }

        public void qdl(float f10) {
            this.f16292wd = f10;
            this.qdl.put(5, Float.valueOf(f10));
        }

        public void rdp(float f10) {
            this.mo = f10;
            this.qdl.put(20, Float.valueOf(f10));
        }

        public void rq(float f10) {
            this.lnr = f10;
            this.qdl.put(17, Float.valueOf(f10));
        }

        public void to(float f10) {
            this.jtx = f10;
            this.qdl.put(13, Float.valueOf(f10));
        }

        public void tvp(float f10) {
            this.bjy = f10;
            this.qdl.put(12, Float.valueOf(f10));
        }

        public void ud(float f10) {
            this.jpc = f10;
            this.qdl.put(6, Float.valueOf(f10));
        }

        public void wd(float f10) {
            this.exu = f10;
            this.qdl.put(10, Float.valueOf(f10));
        }

        public void yt(float f10) {
            this.exc = f10;
            this.qdl.put(28, Float.valueOf(f10));
        }

        public qdl(int i10, int i11) {
            super(i10, i11);
            this.qdl = new SparseArray<>();
            this.f16291ud = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.qdl.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.qdl.put(16, Float.valueOf(i11));
            }
        }
    }

    private void qdl(to toVar) {
        if (toVar.ud() != null) {
            qdl(toVar.ud());
        } else {
            toVar.qdl(Float.NaN, Float.NaN);
        }
    }

    private void qdl(View view, boolean z10) {
        try {
            to toVar = this.qdl.get(view);
            if (toVar == null) {
                return;
            }
            to toVarUd = toVar.ud();
            int i10 = 0;
            while (true) {
                if (i10 >= toVarUd.qdl()) {
                    break;
                }
                if (toVarUd.qdl(i10).equals(toVar)) {
                    toVarUd.ud(i10);
                    break;
                }
                i10++;
            }
            toVar.qdl((Object) null);
            this.qdl.remove(view);
            if (z10) {
                this.f16290ud.qdl(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void qdl(to toVar, float f10, float f11) {
        View view = (View) toVar.to();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(toVar.mo() + f10);
            int iRound2 = Math.round(toVar.wd() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(toVar.jpc()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(toVar.tvp()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iQdl = toVar.qdl();
        for (int i10 = 0; i10 < iQdl; i10++) {
            if (equals(view)) {
                qdl(toVar.qdl(i10), f10, f11);
            } else if (!(view instanceof lnr)) {
                qdl(toVar.qdl(i10), toVar.mo() + f10, toVar.wd() + f11);
            }
        }
    }

    private void qdl(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.f16290ud.mo(size2);
        }
        if (mode == 1073741824) {
            this.f16290ud.mml(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f16290ud.rq(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f16290ud.to(size);
        }
        this.f16290ud.qdl(Float.NaN, Float.NaN);
    }

    protected static void qdl(qdl qdlVar, to toVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            toVar.qdl(com.bytedance.adsdk.ugeno.yoga.lnr.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, r0.left);
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.TOP, r0.top);
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, r0.right);
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, r0.bottom);
            }
        }
        for (int i10 = 0; i10 < qdlVar.qdl.size(); i10++) {
            int iKeyAt = qdlVar.qdl.keyAt(i10);
            float fFloatValue = qdlVar.qdl.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.qdl.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.qdl.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.qdl.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                toVar.fs(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    toVar.lnr();
                } else {
                    toVar.lnr(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                toVar.qdl(mzz.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                toVar.qdl(fFloatValue);
            } else if (iKeyAt == 7) {
                toVar.ud(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    toVar.wd(100.0f);
                } else if (fFloatValue == -2.0f) {
                    toVar.mzz();
                } else {
                    toVar.mo(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                toVar.qdl(mo.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                toVar.tvp(fFloatValue);
            } else if (iKeyAt == 27) {
                toVar.jpc(fFloatValue);
            } else if (iKeyAt == 22) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                toVar.qdl(exu.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    toVar.mzz(100.0f);
                } else if (fFloatValue == -2.0f) {
                    toVar.mml();
                } else {
                    toVar.mml(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                toVar.qdl(rdp.qdl(Math.round(fFloatValue)));
            }
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.lnr = lnrVar;
    }
}
