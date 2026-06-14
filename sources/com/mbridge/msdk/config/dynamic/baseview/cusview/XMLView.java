package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class XMLView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, View> f47449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f47450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.config.dynamic.baseview.touch.a f47452d;

    public XMLView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47449a = new HashMap();
        this.f47451c = "";
        this.f47452d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f47452d.c();
                this.f47452d.d(motionEvent);
            } else if (action == 1) {
                this.f47452d.f(motionEvent);
            } else if (action == 2) {
                this.f47452d.e(motionEvent);
            } else if (action == 3) {
                this.f47452d.c(motionEvent);
            }
        } catch (Exception e10) {
            q0.b("RenderView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.f47449a;
    }

    public String getSelfTag() {
        return this.f47451c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.f47452d;
    }

    public com.mbridge.msdk.config.component.style.inter.a getXmlViewActionListener() {
        return this.f47450b;
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f47451c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(com.mbridge.msdk.config.component.style.inter.a aVar) {
        this.f47450b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.f47452d;
        if (aVar != null) {
            aVar.c(view);
        }
    }
}
