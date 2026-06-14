package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class yk implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65625a;

    public yk(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f65625a = context;
        } else {
            this.f65625a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.startapp.sdk.internal.tk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f65625a     // Catch: java.lang.Throwable -> L8
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r1)     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            r1 = move-exception
            com.startapp.sdk.internal.g9.a(r1)
            r1 = r0
        Ld:
            if (r1 == 0) goto L1a
            boolean r2 = kotlin.text.StringsKt.y0(r1)
            if (r2 == 0) goto L16
            r1 = r0
        L16:
            if (r1 == 0) goto L1a
        L18:
            r0 = r1
            goto L2d
        L1a:
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2d
            boolean r2 = kotlin.text.StringsKt.y0(r1)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L18
            goto L2d
        L29:
            r1 = move-exception
            com.startapp.sdk.internal.g9.a(r1)
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.yk.a():java.lang.String");
    }

    @Override // com.startapp.sdk.internal.tk
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.tk
    public final WebView c() {
        return new WebView(this.f65625a);
    }
}
