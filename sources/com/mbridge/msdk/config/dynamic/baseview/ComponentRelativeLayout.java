package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ComponentRelativeLayout extends RelativeLayout implements com.mbridge.msdk.config.dynamic.baseview.inter.a {
    public XMLView xmlView;

    public ComponentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = com.mbridge.msdk.config.dynamic.utils.d.a((View) this);
        } catch (Exception e10) {
            q0.b("MBRelativeLayout", "onAttachedToWindow异常: " + e10.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47463b.a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (TextUtils.isEmpty(strValueOf) || !strValueOf.equals("true")) {
                return;
            }
            setViewClickListener();
        } catch (Exception e10) {
            q0.b("MBRelativeLayout", "setXmlData异常: " + e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        com.mbridge.msdk.config.dynamic.utils.f.a(this.xmlView, view.getTag(), null);
    }
}
