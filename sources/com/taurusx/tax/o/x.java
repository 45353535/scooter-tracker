package com.taurusx.tax.o;

import android.content.Intent;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.o.i;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class x extends g {
    public x(Map<String, String> map, g0 g0Var) {
        super(map, g0Var);
    }

    @Override // com.taurusx.tax.o.g
    public boolean z(g0.f fVar) {
        return true;
    }

    @Override // com.taurusx.tax.o.g
    public void z() {
        String strC = c("url");
        if (strC == null) {
            this.f66429w.z(i.w.OPEN, "Url can not be null.");
            return;
        }
        if (!strC.contains(Constants.DEEPLINK)) {
            this.f66429w.getBrowserController().c(strC);
            return;
        }
        Uri uri = Uri.parse(strC);
        try {
            if (!com.taurusx.tax.g.n.f66171o.equalsIgnoreCase(uri.getScheme())) {
                com.taurusx.tax.g.r0.z.z(this.f66429w.getContext(), uri);
            } else {
                com.taurusx.tax.g.r0.z.w(this.f66429w.getContext(), Intent.parseUri(uri.toString(), 1));
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
