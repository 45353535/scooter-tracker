package com.mbridge.msdk.config.component.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.taurusx.tax.g.n;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class InnerCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46910h = "InnerStoreComponent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f46911i = "700001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    com.mbridge.msdk.config.component.inner.model.a f46912j;

    private void a(Context context, String str, String str2, Map<String, Object> map) {
        String message;
        Intent intent;
        boolean z10 = false;
        try {
            message = "";
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals(n.f66171o)) {
                    intent = Intent.parseUri(str, 1);
                } else if (TextUtils.isEmpty(scheme) || !scheme.equals("android-app")) {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f46912j.b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        context.startActivity(intent);
                    } else {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    }
                    z10 = true;
                }
            }
        } catch (Throwable th2) {
            q0.b("InnerStoreComponent", th2.getMessage(), th2);
            message = th2.getMessage();
        }
        a(z10, message);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "901001";
        this.f46912j = new com.mbridge.msdk.config.component.inner.model.a(map);
        if (e() != null) {
            this.f46912j.a(e().getContext());
        } else {
            this.f46912j.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f46912j.f().equals("StoreKit")) {
            String strC = this.f46912j.c();
            if (TextUtils.isEmpty(strC) || !strC.equals("display")) {
                return;
            }
            g();
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.f46912j;
        if (aVar != null) {
            a(aVar.a(), this.f46912j.d(), this.f46912j.e(), this.f46912j.b());
        }
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put("result", String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put("code", str);
            map.put("reason", "700001");
        }
        a(a("901005", map));
    }
}
