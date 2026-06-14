package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.N6;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Map f59231a;

    public synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        if (f0.a()) {
            gb.a("AppSetIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.f59231a != null) {
            return new HashMap(this.f59231a);
        }
        this.f59231a = new HashMap();
        final v8 v8VarA = v8.a(context);
        final String strA = v8VarA.a();
        final int iB = v8VarA.b();
        if (!TextUtils.isEmpty(strA)) {
            this.f59231a.put(N6.L0, strA);
        }
        if (iB != -1) {
            this.f59231a.put("asis", String.valueOf(iB));
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(f0.f59610b, new OnSuccessListener() { // from class: k5.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f86034a.a(iB, v8VarA, strA, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable unused) {
            gb.a("AppSetIdDataProvider: error occurred while trying to access app set id info");
        }
        return new HashMap(this.f59231a);
    }

    public final /* synthetic */ void a(int i10, v8 v8Var, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i10) {
            v8Var.a(scope);
            synchronized (this) {
                this.f59231a.put("asis", String.valueOf(scope));
            }
            gb.a("AppSetIdDataProvider: new scope value has been received: " + scope);
        }
        String id2 = appSetIdInfo.getId();
        if (id2.equals(str)) {
            return;
        }
        v8Var.c(id2);
        synchronized (this) {
            this.f59231a.put(N6.L0, id2);
        }
        gb.a("AppSetIdDataProvider: new id value has been received: " + id2);
    }
}
