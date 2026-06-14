package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends com.bytedance.sdk.openadsdk.core.mo.mml {
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17564ud;

    public mo(Context context) {
        super(context);
        this.qdl = 2.25f;
        this.f17564ud = 12;
        qdl();
    }

    private void qdl() {
        setBackground(mml.qdl());
        setImageResource(ljh.mml(getContext(), "tt_close_btn"));
        int iUd = ax.ud(getContext(), this.qdl);
        setPadding(iUd, iUd, iUd, iUd);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static com.bytedance.sdk.openadsdk.core.mo.mml ud(Context context) {
        return new mo(context, 28, 5.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.mml, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iUd = ax.ud(getContext(), this.f17564ud);
            layoutParams.width = iUd;
            layoutParams.height = iUd;
        }
        super.setLayoutParams(layoutParams);
    }

    public mo(Context context, int i10, float f10) {
        super(context);
        this.qdl = f10;
        this.f17564ud = i10;
        qdl();
    }

    public static com.bytedance.sdk.openadsdk.core.mo.mml qdl(Context context) {
        return new mo(context);
    }
}
