package com.my.target;

import android.content.Context;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class u6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile u6 f60894b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieHandler f60895a;

    public u6(CookieManager cookieManager) {
        this.f60895a = cookieManager;
    }

    public static u6 a(Context context) {
        u6 u6Var;
        u6 u6Var2 = f60894b;
        if (u6Var2 != null) {
            return u6Var2;
        }
        synchronized (u6.class) {
            try {
                u6Var = f60894b;
                if (u6Var == null) {
                    u6Var = new u6(new CookieManager(new v6(context.getApplicationContext()), null));
                    f60894b = u6Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u6Var;
    }

    public void b(URLConnection uRLConnection) {
        try {
            a(uRLConnection, this.f60895a.get(URI.create(uRLConnection.getURL().toString()), new HashMap()));
        } catch (Throwable th2) {
            gb.a("MyTargetCookieManager: Unable to set cookies to urlconnection - " + th2.getMessage());
        }
    }

    public void a(URLConnection uRLConnection) {
        try {
            this.f60895a.put(URI.create(uRLConnection.getURL().toString()), uRLConnection.getHeaderFields());
        } catch (Throwable th2) {
            gb.a("MyTargetCookieManager: Unable to set cookies from urlconnection - " + th2.getMessage());
        }
    }

    public final void a(URLConnection uRLConnection, Map map) {
        Iterator it = map.entrySet().iterator();
        for (boolean zHasNext = it.hasNext(); zHasNext; zHasNext = it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Iterator it2 = ((List) entry.getValue()).iterator();
            for (boolean zHasNext2 = it2.hasNext(); zHasNext2; zHasNext2 = it2.hasNext()) {
                uRLConnection.addRequestProperty(str, (String) it2.next());
            }
        }
    }
}
