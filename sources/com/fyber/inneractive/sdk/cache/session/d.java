package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f20234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c f20235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f20236c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.f20236c = eVar;
        this.f20234a = aVar;
        this.f20235b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20236c.f20239c) {
            try {
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f20234a;
                if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                    g gVar = (g) this.f20236c.f20237a.f20247a.get(this.f20235b);
                    if (gVar != null) {
                        int i10 = f.f20242a[aVar.ordinal()];
                        if (i10 == 1) {
                            gVar.f20244b++;
                        } else if (i10 == 2) {
                            gVar.f20245c++;
                        } else if (i10 == 3) {
                            gVar.f20243a++;
                        }
                    }
                } else {
                    this.f20236c.f20237a = new i();
                }
                try {
                    o.a(o.f23888a, e.a(this.f20236c).toString().getBytes("UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
                this.f20236c.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
