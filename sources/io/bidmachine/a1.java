package io.bidmachine;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f79175a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f79176b;

    class a implements OnSuccessListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            if (appSetIdInfo.getScope() == 2) {
                a1.this.f79176b = appSetIdInfo.getId();
            }
        }
    }

    a1() {
    }

    public static /* synthetic */ void a(a1 a1Var, Context context) {
        a1Var.getClass();
        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(a1Var.new a());
    }

    public String c() {
        return this.f79176b;
    }

    public void d(final Context context) {
        if (this.f79175a.compareAndSet(false, true)) {
            x2.a().execute(new i9.b() { // from class: io.bidmachine.z0
                @Override // ae.j
                public /* synthetic */ void c(Throwable th2) {
                    i9.a.a(this, th2);
                }

                @Override // ae.j
                public final void onRun() {
                    a1.a(this.f82029b, context);
                }

                @Override // java.lang.Runnable
                public /* synthetic */ void run() {
                    ae.i.a(this);
                }
            });
        }
    }
}
