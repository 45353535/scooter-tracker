package com.bytedance.sdk.openadsdk.core.rq.ud.mzz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends com.bytedance.adsdk.ugeno.tvp.ud.qdl {
    private final com.bytedance.adsdk.ugeno.tvp.ud.qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.tvp.ud.qdl f17463ud;

    public qdl(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.tvp.ud.qdl qdlVar = new com.bytedance.adsdk.ugeno.tvp.ud.qdl(context);
        this.qdl = qdlVar;
        addView(qdlVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.tvp.ud.qdl qdlVar2 = new com.bytedance.adsdk.ugeno.tvp.ud.qdl(context);
        this.f17463ud = qdlVar2;
        qdlVar2.setBackgroundColor(0);
        addView(qdlVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.tvp.ud.qdl getMarkView() {
        return this.f17463ud;
    }

    public com.bytedance.adsdk.ugeno.tvp.ud.qdl getVideoView() {
        return this.qdl;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f17463ud.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f17463ud.setOnTouchListener(onTouchListener);
    }
}
