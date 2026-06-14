package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7202a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f7203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f7204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f7205d;

    public static String getVersion() {
        return "3.61.0";
    }

    public final synchronized void a() {
        if (this.f7202a) {
            return;
        }
        this.f7203b = new d();
        this.f7205d = new c(Build.VERSION.SDK_INT);
        this.f7204c = new NativeLibHelper();
        this.f7202a = true;
    }

    public synchronized void onResume() {
        a();
        d dVar = this.f7203b;
        a aVar = this.f7204c;
        dVar.getClass();
        if (!d.f7207a) {
            ((NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        a();
        d dVar = this.f7203b;
        c cVar = this.f7205d;
        a aVar = this.f7204c;
        dVar.getClass();
        d.a(context, cVar, aVar, map, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0192 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0001, B:5:0x000f, B:10:0x001b, B:12:0x0031, B:15:0x0056, B:17:0x0082, B:19:0x008e, B:21:0x0096, B:23:0x009e, B:25:0x00a6, B:28:0x00b0, B:29:0x016d, B:30:0x0175, B:32:0x0192, B:33:0x01b3), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void sign(android.content.Context r10, java.util.Map<java.lang.String, java.lang.String> r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.sig.Signer.sign(android.content.Context, java.util.Map, java.util.Map, java.util.Map):void");
    }
}
