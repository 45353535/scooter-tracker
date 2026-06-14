package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.u;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class StarLevelLayoutView extends ComponentLinearLayout {
    public StarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i10) {
        try {
            removeAllViews();
            if (i10 == 0) {
                i10 = 5;
            }
            int iA = i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_demo_star_sel", "drawable");
            int iA2 = i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_demo_star_nor", "drawable");
            for (int i11 = 0; i11 < 5; i11++) {
                ImageView imageView = new ImageView(getContext());
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i11 < i10) {
                    imageView.setImageResource(iA);
                } else {
                    imageView.setImageResource(iA2);
                }
                addView(imageView, layoutParams);
            }
        } catch (Exception e10) {
            q0.b("StarLevelLayoutView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        super.setXmlData(map);
        try {
            String strValueOf = String.valueOf(map.get("data"));
            if (strValueOf.equals("null")) {
                return;
            }
            setRating(u.a(Math.round(Double.parseDouble(strValueOf))));
        } catch (Throwable th2) {
            q0.b("StarLevelLayoutView", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equals("null")) {
                return;
            }
            setRating(u.a(Math.round(Double.parseDouble(strValueOf))));
        } catch (Throwable th2) {
            q0.b("StarLevelLayoutView", th2.getMessage(), th2);
        }
    }
}
