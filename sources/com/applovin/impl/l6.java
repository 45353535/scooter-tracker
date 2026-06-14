package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l6 extends i5 implements q0.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f9262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f9263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d6.b f9264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x4 f9265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x4 f9266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected q0.b f9267l;

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    @Override // java.lang.Runnable
    public void run() {
        q0 q0VarW = b().w();
        if (!b().E0() && !b().B0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f9262g.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f9262g.f()) || this.f9262g.f().length() < 4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Task has an invalid or null request endpoint.");
            }
            a(this.f9262g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f9262g.h())) {
                this.f9262g.b(this.f9262g.b() != null ? "POST" : "GET");
            }
            q0VarW.a(this.f9262g, this.f9267l, this.f9263h);
        }
    }

    class a implements q0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f9268a;

        a(com.applovin.impl.sdk.k kVar) {
            this.f9268a = kVar;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            l6.this.f9262g.a(0);
            l6.this.a(str, obj, i10);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || l6.this.f9262g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || l6.this.f9262g.p())) {
                String strA = l6.this.f9262g.a();
                if (l6.this.f9262g.j() <= 0) {
                    if (strA != null && strA.equals(l6.this.f9262g.f())) {
                        l6 l6Var = l6.this;
                        l6Var.a(l6Var.f9266k);
                    } else {
                        l6 l6Var2 = l6.this;
                        l6Var2.a(l6Var2.f9265j);
                    }
                    l6 l6Var3 = l6.this;
                    l6Var3.a(l6Var3.f9262g.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = l6.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    l6 l6Var4 = l6.this;
                    l6Var4.f9073c.k(l6Var4.f9072b, "Unable to send request due to server failure (code " + i10 + "). " + l6.this.f9262g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(l6.this.f9262g.k()) + " seconds...");
                }
                int iJ = l6.this.f9262g.j() - 1;
                l6.this.f9262g.a(iJ);
                if (iJ == 0) {
                    l6 l6Var5 = l6.this;
                    l6Var5.a(l6Var5.f9265j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.o oVar2 = l6.this.f9073c;
                        if (com.applovin.impl.sdk.o.a()) {
                            l6 l6Var6 = l6.this;
                            l6Var6.f9073c.d(l6Var6.f9072b, "Switching to backup endpoint " + strA);
                        }
                        l6.this.f9262g.a(strA);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f9268a.a(x4.f11317g3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = l6.this.f9262g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, l6.this.f9262g.c())) : l6.this.f9262g.k();
                }
                d6 d6VarQ0 = this.f9268a.q0();
                l6 l6Var7 = l6.this;
                d6VarQ0.a(l6Var7, l6Var7.f9264i, millis);
                return;
            }
            l6 l6Var8 = l6.this;
            l6Var8.a(l6Var8.f9262g.f(), i10, str2, obj);
        }
    }

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.f9264i = d6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f9262g = aVar;
        this.f9267l = new q0.b();
        this.f9263h = new a(kVar);
    }

    public void b(x4 x4Var) {
        this.f9266k = x4Var;
    }

    public void c(x4 x4Var) {
        this.f9265j = x4Var;
    }

    public void a(d6.b bVar) {
        this.f9264i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x4 x4Var) {
        if (x4Var != null) {
            b().o0().a(x4Var, x4Var.a());
        }
    }
}
