package com.taurusx.tax.g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.ui.TaxWebViewActivity;
import com.taurusx.tax.w.c.y;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class o {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66242z = "ClickUtils";

    public class z implements f0.z {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ View f66243w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f66244z;

        /* JADX INFO: renamed from: com.taurusx.tax.g.o$z$z, reason: collision with other inner class name */
        public class RunnableC0797z implements Runnable {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f66245w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f66247z;

            public RunnableC0797z(Context context, Intent intent) {
                this.f66247z = context;
                this.f66245w = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f66247z.startActivity(this.f66245w);
            }
        }

        public z(boolean z10, View view) {
            this.f66244z = z10;
            this.f66243w = view;
        }

        @Override // com.taurusx.tax.g.f0.z
        public void z(Context context, Intent intent) {
            if (this.f66244z) {
                LogUtil.d("taurusx", "activityStartDelegate startActivity..." + intent.resolveActivity(context.getPackageManager()));
                context.startActivity(intent);
                return;
            }
            LogUtil.d("taurusx", "activityStartDelegate startActivity with postWhenViewShown..." + intent.resolveActivity(context.getPackageManager()));
            k0.z(this.f66243w, new RunnableC0797z(context, intent));
        }
    }

    public static boolean z(y.z zVar, com.taurusx.tax.w.c.y yVar, String str, Context context, View view, String str2, boolean z10) {
        String strA = zVar.a();
        String strM = zVar.m();
        if (!TextUtils.isEmpty(strA)) {
            if (h0.z(context, strA)) {
                h0.z(context, strA, Constants.DEEPLINK);
                return true;
            }
            if (!TextUtils.isEmpty(strM)) {
                h0.z(context, strM, POBCoreNativeConstants.NATIVE_FALLBACK_URL);
                return true;
            }
        }
        try {
            z zVar2 = new z(z10, view);
            if (!f0.z(context, null, str2, zVar2)) {
                if (str2 == null || !str2.startsWith("http")) {
                    return false;
                }
                z(yVar, str, context, str2, zVar2);
            }
            return true;
        } catch (Throwable th2) {
            LogUtil.v(f66242z, "onClickEvent:" + th2.getMessage());
            return false;
        }
    }

    public static void z(com.taurusx.tax.w.c.y yVar, String str, Context context, String str2, f0.z zVar) {
        Intent intent;
        if (l.z()) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            Intent intent2 = new Intent(context, (Class<?>) TaxWebViewActivity.class);
            intent2.putExtra("url", str2);
            String string = UUID.randomUUID().toString();
            com.taurusx.tax.g.n0.c.z().z(string, yVar);
            intent2.putExtra(TaxWebViewActivity.f66910a, string);
            intent2.putExtra(TaxWebViewActivity.f66911n, str);
            intent = intent2;
        }
        intent.setFlags(268435456);
        if (zVar != null) {
            zVar.z(context, intent);
        } else {
            context.startActivity(intent);
        }
    }
}
