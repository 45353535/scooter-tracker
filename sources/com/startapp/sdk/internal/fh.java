package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class fh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vf f64513c;

    public fh(Context context, com.startapp.sdk.components.a aVar, vf vfVar) {
        this.f64511a = context;
        this.f64512b = aVar;
        this.f64513c = vfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dg dgVar = new dg(this.f64511a);
            dgVar.a(this.f64511a, new AdPreferences());
            q8 q8Var = (q8) this.f64512b.f64187n.a();
            p8 p8Var = new p8(q8Var, dgVar.a(MetaData.E().c0() + i0.f64663c));
            p8Var.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(dgVar.Z);
            t8 t8VarA = p8Var.a();
            if (t8VarA != null) {
                String str = t8VarA.f65299b;
                if (!TextUtils.isEmpty(str)) {
                    String strA = vi.a(str, "@ct@", "@ct@");
                    String strA2 = vi.a(str, "@tsc@", "@tsc@");
                    String strA3 = vi.a(str, "@apc@", "@apc@");
                    try {
                        Integer numValueOf = !TextUtils.isEmpty(strA) ? Integer.valueOf(Integer.parseInt(strA)) : null;
                        Long lValueOf = !TextUtils.isEmpty(strA2) ? Long.valueOf(Long.parseLong(strA2)) : null;
                        Boolean boolValueOf = TextUtils.isEmpty(strA3) ? null : Boolean.valueOf(Boolean.parseBoolean(strA3));
                        if (numValueOf != null || lValueOf != null || boolValueOf != null) {
                            ((h6) this.f64512b.f64183j.a()).a(numValueOf, lValueOf, boolValueOf, false, true);
                        }
                    } catch (Throwable th2) {
                        g9.a(th2);
                    }
                }
            }
            uf ufVarEdit = this.f64513c.edit();
            ufVarEdit.a("shared_prefs_first_init", Boolean.FALSE);
            ufVarEdit.f65346a.putBoolean("shared_prefs_first_init", false);
            ufVarEdit.apply();
        } catch (Throwable th3) {
            g9.a(th3);
        }
    }
}
