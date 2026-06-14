package com.startapp.sdk.internal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65127b;

    public q(Context context, lb lbVar, k5 k5Var) {
        this.f65126a = context;
        this.f65127b = lbVar;
    }

    public final void a(String str, String str2) {
        boolean z10;
        Object systemService;
        AdDebuggerMetadata adDebuggerMetadataD = MetaData.E().d();
        if (adDebuggerMetadataD != null && adDebuggerMetadataD.b()) {
            g9 g9Var = new g9(h9.f64609d);
            g9Var.f64553d = "adDebugInfo";
            g9Var.f64554e = str;
            g9Var.f64556g = str2;
            g9Var.a();
        }
        if (str == null && str2 == null) {
            Toast.makeText(this.f65126a, "Ad debug info not available", 0).show();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Ad debug info");
        String str3 = IOUtils.LINE_SEPARATOR_UNIX;
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        if (str != null) {
            sb2.append("url: ");
            sb2.append(str);
        } else {
            str3 = "";
        }
        if (str2 != null) {
            sb2.append(str3);
            sb2.append("d: ");
            sb2.append(str2);
        }
        try {
            systemService = this.f65126a.getSystemService("clipboard");
        } catch (Throwable unused) {
        }
        if (systemService instanceof ClipboardManager) {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ad debug info", sb2));
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            Toast.makeText(this.f65126a, "Ad debug info".concat(z10 ? " copied to clipboard" : " printed to logcat"), 0).show();
        } catch (Throwable unused2) {
        }
    }
}
