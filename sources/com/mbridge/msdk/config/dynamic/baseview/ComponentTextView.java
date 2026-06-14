package com.mbridge.msdk.config.dynamic.baseview;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ComponentTextView extends TextView implements com.mbridge.msdk.config.dynamic.baseview.inter.a, com.mbridge.msdk.config.dynamic.baseview.inter.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f47363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47364b;
    public XMLView xmlView;

    public ComponentTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
    }

    private void b() {
        Animator animator = this.f47363a;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e10) {
                q0.b("MBTextView", "停止动画失败: " + e10.getMessage());
            }
        }
    }

    private Map<String, Object> getDataMap() {
        HashMap map = new HashMap();
        map.put("text", getText().toString());
        return map;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f47364b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), getDataMap());
        return map;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = com.mbridge.msdk.config.dynamic.utils.d.a(this);
            a();
        } catch (Exception e10) {
            q0.b("MBTextView", "onAttachedToWindow异常: " + e10.getMessage());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            b();
        } catch (Exception e10) {
            q0.b("MBTextView", "onDetachedFromWindow异常: " + e10.getMessage());
        }
    }

    public void setOutDataScope(String str) {
        this.f47364b = str;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47465b.a(view);
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
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e10) {
            q0.b("MBTextView", "setXmlData异常: " + e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e10) {
            q0.b("MBTextView", "updateBindData异常: " + e10.getMessage());
        }
    }

    private void a() {
        Animator animator = this.f47363a;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e10) {
                q0.b("MBTextView", "启动动画失败: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        com.mbridge.msdk.config.dynamic.utils.f.a(this.xmlView, view.getTag(), dataMap);
    }
}
