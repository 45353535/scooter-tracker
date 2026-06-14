package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f52444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f52446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f52448e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f52446c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f52445b && (dVar = this.f52444a) != null) {
            this.f52445b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f52446c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        b bVar;
        super.onVisibilityChanged(view, i10);
        if (!(view instanceof MBridgeRelativeLayout) || i10 != 0 || (bVar = this.f52448e) == null || this.f52447d) {
            return;
        }
        this.f52447d = true;
        bVar.a();
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f52446c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f52448e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f52444a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
