package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f23710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f23712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23713d = true;

    public abstract e a();

    public final e a(String str) throws Exception {
        this.f23713d = str != null;
        e eVar = this.f23710a;
        eVar.getClass();
        eVar.f23723c = System.currentTimeMillis();
        this.f23712c.a(this);
        String strA = this.f23712c.a();
        this.f23710a.f23728h = strA;
        r0 r0VarA = com.fyber.inneractive.sdk.config.a.a(this.f23711b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.f23711b);
        IAlog.a("%s%s", IAlog.a(this), r0VarA);
        if (this.f23713d) {
            a(str, r0VarA);
        } else if (b()) {
            h hVar = new h(strA);
            if (hVar.f23747a) {
                String str2 = hVar.f23748b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                a(str2, r0VarA);
            }
        } else {
            a(strA, r0VarA);
        }
        return this.f23710a;
    }

    public abstract void a(String str, r0 r0Var);

    public boolean b() {
        return !(this instanceof com.fyber.inneractive.sdk.dv.h);
    }

    public boolean c() {
        return this instanceof com.fyber.inneractive.sdk.dv.h;
    }
}
