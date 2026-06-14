package com.taurusx.tax.g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.taurusx.tax.g.i0;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public class h0 {

    public class z implements i0.y {
        @Override // com.taurusx.tax.g.i0.y
        public void w(String str, g0 g0Var) {
        }

        @Override // com.taurusx.tax.g.i0.y
        public void z(String str, g0 g0Var) {
        }
    }

    public static void z(Context context, String str, String str2) {
        new i0.w().z(i0.f66131c).z(new z()).z().z(context, str);
    }

    public static boolean z(Context context, String str) {
        boolean z10;
        try {
            new URL(str);
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        }
        if (z10) {
            return z10;
        }
        try {
            return com.taurusx.tax.g.r0.z.z(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused2) {
            return z10;
        }
    }
}
