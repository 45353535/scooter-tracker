package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class aaj extends exc {
    private TextView qdl;

    public aaj(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.exc
    protected void qdl(Context context, View view) {
        addView(view);
        this.qdl = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.exc
    public void setShakeText(String str) {
        if (this.qdl == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.qdl.setText(str);
            return;
        }
        try {
            this.qdl.setText(com.bytedance.sdk.component.utils.ljh.ud(this.qdl.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
