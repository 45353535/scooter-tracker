package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private com.bytedance.sdk.openadsdk.core.mo.lnr lnr;
    private float mml;
    private com.bytedance.sdk.openadsdk.activity.jpc mo;
    private float mzz;
    private final boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final boolean f17130ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f17131wd;

    public ud(@NonNull Context context, boolean z10, boolean z11, final int i10) {
        super(context);
        this.qdl = z10;
        this.f17130ud = z11;
        if (z10) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ud.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.lnr = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.lnr, layoutParams);
        this.lnr.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ud.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
            }
        });
        this.lnr.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        super.onAttachedToWindow();
        if (this.f17131wd || (jpcVar = this.mo) == null || (qdlVarXmv = jpcVar.xmv()) == null) {
            return;
        }
        qdlVarXmv.vu.ud(true);
        this.f17131wd = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        super.onDetachedFromWindow();
        if (!this.f17131wd || (jpcVar = this.mo) == null || (qdlVarXmv = jpcVar.xmv()) == null) {
            return;
        }
        qdlVarXmv.vu.ud(false);
        this.f17131wd = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.lnr, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f17130ud) {
            float f10 = this.mml;
            if (f10 > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f10))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f11 = this.mzz;
                if (f11 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f11))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.qdl) {
            float f12 = this.mml;
            if (f12 > 0.0f) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824);
            } else {
                float f13 = this.mzz;
                if (f13 > 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f13), 1073741824);
                }
            }
        } else {
            float f14 = this.mml;
            if (f14 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.mzz;
                if (f15 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        super.onWindowFocusChanged(z10);
        if (this.f17131wd == z10 || (jpcVar = this.mo) == null || (qdlVarXmv = jpcVar.xmv()) == null) {
            return;
        }
        qdlVarXmv.vu.ud(z10);
    }

    public void qdl(tvp tvpVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.addView(tvpVar, layoutParams);
        } else {
            addView(tvpVar, layoutParams);
        }
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.jpc jpcVar) {
        this.mo = jpcVar;
    }

    public void setWidthAndHeightRatio(float f10) {
        this.mml = f10;
    }

    public void setWidthOrHeightInParentRatio(float f10) {
        this.mzz = f10;
    }

    public void qdl() {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
