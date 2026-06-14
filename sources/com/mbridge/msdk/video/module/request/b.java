package com.mbridge.msdk.video.module.request;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.setting.h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.request.a, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        if (h.b().d(c.n().b()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String strB = k0.b(jSONObject.toString());
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                eVar.a("dvi", strB);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
