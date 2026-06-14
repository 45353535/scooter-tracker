package com.bytedance.sdk.component.adexpress.mo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends oth {
    private ImageView lnr;
    private ImageView mml;
    private AnimatorSet mo;
    private int mzz;
    private TextView qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ImageView f16421ud;

    public jpc(Context context) {
        super(context);
        this.mo = new AnimatorSet();
        ud(context);
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void ud(Context context) {
        addView(com.bytedance.sdk.component.adexpress.lnr.qdl.ud(context));
        this.f16421ud = (ImageView) findViewById(2097610751);
        this.lnr = (ImageView) findViewById(2097610750);
        this.mml = (ImageView) findViewById(2097610749);
        this.qdl = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    protected void qdl(Context context) {
    }

    public void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        ImageView imageView = this.mml;
        int iRgb = Color.rgb(i11, i11, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i12 = ((i10 + 20) % 60) + 195;
        this.lnr.setColorFilter(Color.rgb(i12, i12, i12), mode);
        int i13 = ((i10 + 40) % 60) + 195;
        this.f16421ud.setColorFilter(Color.rgb(i13, i13, i13), mode);
    }

    public void setButtonText(String str) {
        if (this.qdl == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.qdl.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    public void qdl() {
        mml();
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    public void ud() {
        this.mo.cancel();
    }
}
