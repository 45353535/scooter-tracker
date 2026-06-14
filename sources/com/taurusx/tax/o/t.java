package com.taurusx.tax.o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.device.ads.DtbConstants;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.ui.TaxWebViewActivity;

/* JADX INFO: loaded from: classes11.dex */
public class t extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66518y = "MraidBrowserController";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f66519w;

    public t(g0 g0Var) {
        super(g0Var);
        this.f66519w = g0Var.getContext();
    }

    private boolean w(String str) {
        return str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS);
    }

    private boolean y(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        return z(z().getContext(), intent, "Unable to open intent.");
    }

    private boolean z(String str) {
        if (k0.z(this.f66519w, new Intent("android.intent.action.VIEW", Uri.parse(str)))) {
            return true;
        }
        LogUtil.w(f66518y, "Could not handle application specific action: " + str + ". You may be running in the emulator or another device which does not have the required application.");
        return false;
    }

    public void c(String str) {
        Intent intent;
        LogUtil.d(f66518y, "Opening url: " + str);
        g0 g0VarZ = z();
        if (g0VarZ.getOnOpenListener() != null) {
            g0VarZ.getOnOpenListener().z(g0VarZ);
        }
        if (!w(str) && z(str)) {
            y(str);
            return;
        }
        try {
            if (com.taurusx.tax.g.l.z()) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addCategory("android.intent.category.BROWSABLE");
            } else {
                intent = new Intent(this.f66519w, (Class<?>) TaxWebViewActivity.class);
                intent.putExtra("url", str);
            }
            intent.setFlags(268435456);
            this.f66519w.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private boolean z(Context context, Intent intent, String str) {
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            if (str == null) {
                str = "Unable to start intent.";
            }
            LogUtil.d(f66518y, str);
            return false;
        }
    }
}
