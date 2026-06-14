package com.taurusx.tax.o;

import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.o.i;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66415c = "Content-Type";

    public b(Map<String, String> map, g0 g0Var) {
        super(map, g0Var);
    }

    @Override // com.taurusx.tax.o.g
    public boolean z(g0.f fVar) {
        return true;
    }

    @Override // com.taurusx.tax.o.g
    public void z() {
        String strC = c(g.f66428y);
        if (strC != null && !strC.equals("")) {
            this.f66429w.getDisplayController().c(strC);
        } else {
            this.f66429w.z(i.w.STORE_PICTURE, "Image can't be stored with null or empty URL");
            LogUtil.d("MraidCommand", "Invalid URI for Mraid Store Picture.");
        }
    }
}
