package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.N6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23903a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f23904b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f23905c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f23906d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f23907e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.f23904b)) {
            return this.f23904b;
        }
        if (this.f23907e != null && this.f23903a.get()) {
            Handler handler = r.f23896b;
            handler.removeCallbacks(this.f23907e);
            handler.postDelayed(this.f23907e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.f23905c == null || !TextUtils.isEmpty(this.f23904b)) {
            return;
        }
        this.f23904b = this.f23905c.getSharedPreferences("fyber.ua", 0).getString(N6.f41375d0, null);
        if (!TextUtils.isEmpty(this.f23904b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f23906d.compareAndSet(false, true);
        }
        r.f23895a.execute(new r1(this));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void c() {
        String defaultUserAgent;
        Context context = this.f23905c;
        if (context != null) {
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f23903a.set(false);
                defaultUserAgent = null;
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f23904b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f23904b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f23906d.compareAndSet(false, true);
            }
            r.f23895a.execute(new q1(this, defaultUserAgent));
        }
    }
}
