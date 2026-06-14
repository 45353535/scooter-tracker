package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f61546a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f61547b = false;

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f61548a;

        static {
            boolean z10 = false;
            try {
                if (AppSet.class.equals(AppSet.class) && AppSetIdClient.class.equals(AppSetIdClient.class)) {
                    if (AppSetIdInfo.class.equals(AppSetIdInfo.class)) {
                        z10 = true;
                    }
                }
            } catch (Throwable th2) {
                x2.a("AppSetIdProvider: error occurred while working with App Set library classes", th2);
            }
            f61548a = z10;
        }
    }

    private void b(Context context) {
        final p1 p1VarA = p1.a(context);
        final String strD = p1VarA.d();
        final int iE = p1VarA.e();
        if (!TextUtils.isEmpty(strD)) {
            this.f61546a.set(new g(strD, iE));
        }
        if (!a.f61548a) {
            x2.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(m.f61659c, new OnSuccessListener() { // from class: com.my.tracker.obfuscated.q5
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f61802a.a(iE, p1VarA, strD, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th2) {
            x2.a("AppSetIdProvider: error occurred while trying to access app set id info", th2);
        }
        a();
    }

    public g a(Context context) {
        if (!this.f61547b) {
            b(context);
            this.f61547b = true;
        }
        return (g) this.f61546a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, p1 p1Var, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i10) {
            p1Var.a(scope);
        }
        String id2 = appSetIdInfo.getId();
        if (!id2.equals(str)) {
            p1Var.f(id2);
            x2.a("AppSetIdProvider: new id value has been received: " + id2);
        }
        if (!TextUtils.isEmpty(id2) && scope != -1) {
            this.f61546a.set(new g(id2, scope));
        } else {
            this.f61546a.set(null);
        }
        synchronized (this.f61546a) {
            this.f61546a.notify();
        }
    }

    private void a() {
        try {
            g gVar = (g) this.f61546a.get();
            if (gVar != null) {
                x2.a("AppSetIdProvider: app set id has been collected, value: " + gVar.f61517a);
                return;
            }
            synchronized (this.f61546a) {
                this.f61546a.wait(300L);
            }
            x2.a("AppSetIdProvider: timeout for collecting id has exceeded");
        } catch (Throwable th2) {
            x2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th2);
        }
    }
}
