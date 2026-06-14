package com.bytedance.adsdk.ugeno.mo.qdl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.adsdk.ugeno.mo.mml;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qdl extends LinearLayout {
    private String fs;
    private boolean jpc;
    protected int lnr;
    private List<View> mml;
    private int mo;
    private int mzz;
    protected Context qdl;
    private float rq;
    private float to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected int f16199ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16200wd;

    public qdl(Context context) {
        super(context);
        this.mzz = SupportMenu.CATEGORY_MASK;
        this.mo = -16776961;
        this.f16200wd = 5;
        this.f16199ud = 40;
        this.lnr = 20;
        this.fs = "row";
        this.qdl = context;
        this.mml = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.rq) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.to) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.mml.size();
    }

    public void lnr() {
        this.mml.clear();
        removeAllViews();
    }

    public void setIndicatorDirection(String str) {
        this.fs = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i10) {
        this.lnr = i10;
    }

    public void setIndicatorWidth(int i10) {
        this.f16199ud = i10;
    }

    public void setIndicatorX(float f10) {
        this.to = f10;
    }

    public void setIndicatorY(float f10) {
        this.rq = f10;
    }

    public void setLoop(boolean z10) {
        this.jpc = z10;
    }

    public void setSelectedColor(int i10) {
        this.mzz = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.mo = i10;
    }

    public abstract Drawable ud(int i10);

    public void ud() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof ud) {
            this.lnr = this.f16199ud;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f16199ud, this.lnr);
        if (getOrientation() == 1) {
            int i10 = this.f16200wd;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.f16200wd;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        addView(view, layoutParams);
        view.setBackground(ud(this.mo));
        this.mml.add(view);
    }

    public void qdl(int i10, int i11) {
        Iterator<View> it = this.mml.iterator();
        while (it.hasNext()) {
            it.next().setBackground(ud(this.mo));
        }
        if (i10 < 0 || i10 >= this.mml.size()) {
            i10 = 0;
        }
        if (this.mml.size() > 0) {
            this.mml.get(i10).setBackground(ud(this.mzz));
            this.tvp = i11;
        }
    }

    public void qdl() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.mo.qdl.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                qdl.this.mml();
            }
        });
    }

    public void qdl(int i10) {
        if (this instanceof ud) {
            this.lnr = this.f16199ud;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f16199ud, this.lnr);
        if (getOrientation() == 1) {
            int i11 = this.f16200wd;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
        } else {
            int i12 = this.f16200wd;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f16199ud, this.lnr);
        if (getOrientation() == 1) {
            int i13 = this.f16200wd;
            layoutParams2.topMargin = i13;
            layoutParams2.bottomMargin = i13;
        } else {
            int i14 = this.f16200wd;
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i14;
        }
        int iQdl = mml.qdl(this.jpc, this.tvp, this.mml.size());
        int iQdl2 = mml.qdl(this.jpc, i10, this.mml.size());
        if (this.mml.size() == 0) {
            iQdl2 = 0;
        }
        if (!this.mml.isEmpty() && mml.qdl(iQdl, this.mml) && mml.qdl(iQdl2, this.mml)) {
            this.mml.get(iQdl).setBackground(ud(this.mo));
            this.mml.get(iQdl).setLayoutParams(layoutParams2);
            this.mml.get(iQdl2).setBackground(ud(this.mzz));
            this.mml.get(iQdl2).setLayoutParams(layoutParams);
            this.tvp = i10;
        }
    }
}
