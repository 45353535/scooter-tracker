package com.taurusx.tax.o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.taurusx.tax.ui.TaxVideoActivity;

/* JADX INFO: loaded from: classes11.dex */
public class i0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66467z = "vnd.android.cursor.item/event";

    public static boolean c(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && context.checkCallingOrSelfPermission(com.taurusx.tax.g.d.f66106w) == 0;
    }

    public static boolean o(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return k0.z(context, intent);
    }

    public static boolean w(Context context) {
        return k0.z(context, new Intent(context, (Class<?>) TaxVideoActivity.class));
    }

    public static boolean y(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return k0.z(context, intent);
    }

    public static boolean z(Context context) {
        return l0.currentApiLevel().isAtLeast(l0.ICE_CREAM_SANDWICH) && k0.z(context, new Intent("android.intent.action.INSERT").setType(f66467z));
    }
}
