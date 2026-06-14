package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;
import com.taurusx.tax.g.n;

/* JADX INFO: loaded from: classes10.dex */
public class c implements a {
    @Override // com.mbridge.msdk.mbsignalcommon.base.a
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals(n.f66171o)) {
            return false;
        }
        return com.mbridge.msdk.click.c.d(com.mbridge.msdk.foundation.controller.c.n().d(), str);
    }
}
