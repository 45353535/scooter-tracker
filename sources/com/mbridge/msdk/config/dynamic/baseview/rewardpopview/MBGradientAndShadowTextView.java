package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;

/* JADX INFO: loaded from: classes10.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f47491e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47495d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f47496e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f47497f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f47498g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f47487a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f47488b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f47489c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f47490d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f47490d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f47491e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f47487a, this.f47488b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f47489c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f47491e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f47487a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f47488b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f47489c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f47490d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f47487a = aVar.f47492a;
            this.f47488b = aVar.f47493b;
            this.f47489c = aVar.f47494c;
            this.f47490d = aVar.f47495d;
            this.mShadowRadius = aVar.f47496e;
            this.mShadowDx = aVar.f47497f;
            this.mShadowDy = aVar.f47498g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47487a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f47488b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f47489c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f47490d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47487a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f47488b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f47489c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f47490d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f47487a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f47488b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f47489c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f47490d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
