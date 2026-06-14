package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mzz extends FrameLayout implements IAnimation, hkc, hzv {
    private float aaj;
    protected View bjy;
    private float exc;
    protected com.bytedance.sdk.component.adexpress.dynamic.mml.jpc exu;
    protected com.bytedance.sdk.component.adexpress.dynamic.mml.wd fs;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.lnr jl;
    protected int jpc;
    protected boolean jtx;
    private com.bytedance.sdk.component.utils.uw jyq;
    protected float lnr;
    protected float mml;
    protected float mo;
    protected float mzz;
    private float qdl;
    protected DynamicRootView rdp;
    protected Context rq;
    protected int to;
    protected int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16327ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected int f16328wd;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud yt;
    private static final View.OnTouchListener oth = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener ljh = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public mzz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context);
        this.rq = context;
        this.rdp = dynamicRootView;
        this.exu = jpcVar;
        this.lnr = jpcVar.mo();
        this.mml = jpcVar.wd();
        this.mzz = jpcVar.jpc();
        this.mo = jpcVar.tvp();
        this.tvp = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.lnr);
        this.to = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.mml);
        this.f16328wd = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.mzz);
        this.jpc = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.mo);
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.wd(jpcVar.to());
        this.fs = wdVar;
        if (wdVar.jl() > 0) {
            this.f16328wd += this.fs.jl() * 2;
            this.jpc += this.fs.jl() * 2;
            this.tvp -= this.fs.jl();
            this.to -= this.fs.jl();
            List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq = jpcVar.rq();
            if (listRq != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 : listRq) {
                    jpcVar2.lnr(jpcVar2.mo() + com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                    jpcVar2.mml(jpcVar2.wd() + com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                    jpcVar2.qdl(com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                    jpcVar2.ud(com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                }
            }
        }
        this.jtx = this.fs.rdp() > 0.0d;
        this.jl = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.lnr();
    }

    protected Drawable getBackgroundDrawable() {
        return qdl(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.jtx;
    }

    public int getClickArea() {
        return this.fs.bqt();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mo.qdl getDynamicClickListener() {
        return this.rdp.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.jpc;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml.mo getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.mzz mzzVar;
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar == null || (mzzVar = jpcVar.to()) == null) {
            return null;
        }
        return mzzVar.mzz();
    }

    public int getDynamicWidth() {
        return this.f16328wd;
    }

    public String getImageObjectFit() {
        return this.fs.zlt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.exc;
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(qdl(ud(this.fs.fco().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f16327ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.aaj;
    }

    protected boolean jpc() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        return jpcVar == null || jpcVar.to() == null || this.exu.to().mzz() == null || this.exu.to().mzz().kr() == null;
    }

    public boolean lnr() {
        tvp();
        mo();
        mml();
        return true;
    }

    protected boolean mml() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.bjy;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (mzz()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = oth;
            onClickListener = ljh;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iQdl = com.bytedance.sdk.component.adexpress.dynamic.ud.qdl.qdl(this.fs);
            if (iQdl == 2 || iQdl == 3) {
                view2.setOnClickListener(ljh);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        qdl(view2);
        ud(view2);
        return true;
    }

    public void mo() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f16328wd, this.jpc);
        layoutParams.topMargin = this.to;
        int i10 = this.tvp;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean mzz() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = this.fs;
        return (wdVar == null || wdVar.bqt() == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        wd();
        qdl();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ud();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.jl.qdl(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.lnr lnrVar = this.jl;
        View view = this.bjy;
        if (view == null) {
            view = this;
        }
        lnrVar.qdl(view, i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void qdl(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = this.fs;
        if (wdVar != null && wdVar.qdl(i10)) {
            tvp();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof mzz)) {
                    ((mzz) childAt).qdl(i10);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.exc = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.qdl = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f16327ud = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.jtx = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.aaj = f10;
        this.jl.qdl(this, f10);
    }

    protected void ud(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz;
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar == null || (moVarMzz = jpcVar.to().mzz()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(moVarMzz.fge()));
    }

    public void wd() {
        if (jpc()) {
            return;
        }
        View view = this.bjy;
        if (view == null) {
            view = this;
        }
        this.yt = new com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud(view, this.exu.to().mzz().kr());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud udVar = mzz.this.yt;
                if (udVar != null) {
                    udVar.qdl();
                }
            }
        });
    }

    private List<String> ud(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && i10 - 1 == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    protected void qdl(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.exu.jpc());
            jSONObject.put("height", this.exu.tvp());
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.aaj, this.fs.mrf());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.jyq, this.exu.to().ud());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.oth, this.exu.lnr());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.ljh, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.fs.mrf());
            view.setTag(2097610715, this.exu.to().ud());
            view.setTag(2097610714, this.exu.lnr());
            view.setTag(2097610713, jSONObject.toString());
            int iQdl = com.bytedance.sdk.component.adexpress.dynamic.ud.qdl.qdl(this.fs);
            if (iQdl == 1) {
                view.setTag(2097610707, new Pair(this.fs.uw(), Long.valueOf(this.fs.xmv())));
                view.setTag(2097610708, Integer.valueOf(iQdl));
            }
        } catch (JSONException unused) {
        }
    }

    public void ud() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud udVar = this.yt;
        if (udVar != null) {
            udVar.ud();
        }
    }

    protected Drawable qdl(boolean z10, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iKoa;
        if (!TextUtils.isEmpty(this.fs.fco())) {
            try {
                String strFco = this.fs.fco();
                String strSubstring = strFco.substring(strFco.indexOf("(") + 1, strFco.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(StringUtils.COMMA)).trim(), strSubstring.substring(strSubstring.indexOf(StringUtils.COMMA) + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableQdl = qdl(qdl(strArrSplit[0]), iArr);
                gradientDrawableQdl.setShape(0);
                gradientDrawableQdl.setCornerRadius(com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy()));
                return gradientDrawableQdl;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fQdl = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy());
        drawable.setCornerRadius(fQdl);
        if (fQdl < 1.0f) {
            float fQdl2 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.rc());
            float fQdl3 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.kdv());
            float fQdl4 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.ekw());
            float fQdl5 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.hkc());
            float[] fArr = new float[8];
            if (fQdl2 > 0.0f) {
                fArr[0] = fQdl2;
                fArr[1] = fQdl2;
            }
            if (fQdl3 > 0.0f) {
                fArr[2] = fQdl3;
                fArr[3] = fQdl3;
            }
            if (fQdl4 > 0.0f) {
                fArr[4] = fQdl4;
                fArr[5] = fQdl4;
            }
            if (fQdl5 > 0.0f) {
                fArr[6] = fQdl5;
                fArr[7] = fQdl5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            iKoa = Color.parseColor(str);
        } else {
            iKoa = this.fs.koa();
        }
        drawable.setColor(iKoa);
        if (this.fs.yt() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.yt()), this.fs.jtx());
        } else if (this.fs.jl() > 0) {
            drawable.setStroke(this.fs.jl(), this.fs.jtx());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.exu.to().ud(), "video-vd")) {
                setLayerType(1, null);
                return new exc((int) fQdl, this.fs.jl());
            }
        }
        return drawable;
    }

    protected ud qdl(Bitmap bitmap) {
        return new qdl(bitmap, null);
    }

    private Drawable[] qdl(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableQdl = qdl(qdl(strArrSplit[0]), iArr);
                gradientDrawableQdl.setShape(0);
                gradientDrawableQdl.setCornerRadius(com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy()));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableQdl;
            }
        }
        return drawableArr;
    }

    protected GradientDrawable qdl(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    protected GradientDrawable.Orientation qdl(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void qdl() {
        if (isShown()) {
            int iQdl = com.bytedance.sdk.component.adexpress.dynamic.ud.qdl.qdl(this.fs);
            if (iQdl == 2) {
                if (this.jyq == null) {
                    this.jyq = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.4
                };
                com.bytedance.sdk.component.adexpress.ud.exu renderRequest = this.rdp.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.bjy();
                    renderRequest.jyq();
                    renderRequest.exc();
                    return;
                }
                return;
            }
            if (iQdl == 3) {
                if (this.jyq == null) {
                    this.jyq = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.5
                };
                com.bytedance.sdk.component.adexpress.ud.exu renderRequest2 = this.rdp.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.yt();
                    renderRequest2.oth();
                    renderRequest2.jl();
                    renderRequest2.aaj();
                }
            }
        }
    }
}
