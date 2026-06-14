package com.startapp.sdk.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf f64686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f64687b;

    public ia(vf vfVar) {
        this.f64686a = vfVar;
    }

    public final String a() {
        String string;
        String str = this.f64687b;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                string = this.f64687b;
                if (string == null) {
                    string = this.f64686a.getString("e695c6d894060903", null);
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        uf ufVarEdit = this.f64686a.edit();
                        ufVarEdit.a("e695c6d894060903", string);
                        ufVarEdit.f65346a.putString("e695c6d894060903", string);
                        if (!ufVarEdit.f65346a.commit()) {
                            string = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f64687b = string;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
