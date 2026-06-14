package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jyq;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static boolean qdl = true;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final AtomicBoolean f17769ud = new AtomicBoolean(false);

    public static void qdl(Context context) {
        if (context != null && qdl && f17769ud.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (jyq.qdl(context)) {
                        ud(context);
                        return;
                    }
                    String strUd = jyq.ud(context);
                    try {
                        if (TextUtils.isEmpty(strUd)) {
                            strUd = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strUd);
                    } catch (IllegalStateException unused) {
                        qdl(strUd);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th2) {
                aaj.lnr(th2.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ud(android.content.Context r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = ud()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld
            java.lang.String r0 = "webview"
            goto L17
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "webview_"
            java.lang.String r0 = r1.concat(r0)
        L17:
            r1 = 0
            java.io.File r3 = r3.getDir(r0, r1)
            java.lang.String r3 = r3.getPath()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "webview_data.lock"
            r0.<init>(r3, r1)
            r0.getAbsolutePath()
            boolean r3 = r0.exists()
            if (r3 != 0) goto L31
            goto L84
        L31:
            r3 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            if (r2 == 0) goto L46
            java.nio.channels.FileLock r3 = r2.tryLock()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L62
            goto L46
        L44:
            r3 = move-exception
            goto L85
        L46:
            if (r3 == 0) goto L4c
            r3.close()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L62
            goto L4f
        L4c:
            qdl(r0)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L62
        L4f:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r3 = move-exception
            r3.getMessage()
        L59:
            r1.close()     // Catch: java.lang.Throwable -> L5d
            goto L84
        L5d:
            r3 = move-exception
            r3.getMessage()
            return
        L62:
            r3 = r2
            goto L6d
        L64:
            r0 = move-exception
            r2 = r3
        L66:
            r3 = r0
            goto L85
        L68:
            r0 = move-exception
            r1 = r3
            r2 = r1
            goto L66
        L6c:
            r1 = r3
        L6d:
            qdl(r0)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r3 = move-exception
            r3.getMessage()
        L7a:
            if (r1 == 0) goto L84
            r1.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r3 = move-exception
            r3.getMessage()
        L84:
            return
        L85:
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r0 = move-exception
            r0.getMessage()
        L8f:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            r0 = move-exception
            r0.getMessage()
        L99:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.lnr.ud(android.content.Context):void");
    }

    public static void qdl() {
        qdl = false;
    }

    private static void qdl(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void qdl(File file) {
        qdl(file, file.exists() ? file.delete() : false);
    }

    private static void qdl(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            aaj.lnr("TTAD.TTMultiInitHelper", e10.getMessage());
        }
    }

    private static String ud() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
