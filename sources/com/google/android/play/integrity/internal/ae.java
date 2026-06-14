package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class ae {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f28761o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f28763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28764c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f28769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f28770i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServiceConnection f28774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IInterface f28775n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f28765d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f28766e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f28767f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f28772k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae.k(this.f28787a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f28773l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f28771j = new WeakReference(null);

    public ae(Context context, s sVar, String str, Intent intent, z zVar, @Nullable y yVar) {
        this.f28762a = context;
        this.f28763b = sVar;
        this.f28764c = str;
        this.f28769h = intent;
        this.f28770i = zVar;
    }

    public static /* synthetic */ void k(ae aeVar) {
        aeVar.f28763b.d("reportBinderDeath", new Object[0]);
        y yVar = (y) aeVar.f28771j.get();
        if (yVar != null) {
            aeVar.f28763b.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            aeVar.f28763b.d("%s : Binder has died.", aeVar.f28764c);
            Iterator it = aeVar.f28765d.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(aeVar.w());
            }
            aeVar.f28765d.clear();
        }
        synchronized (aeVar.f28767f) {
            aeVar.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final ae aeVar, final TaskCompletionSource taskCompletionSource) {
        aeVar.f28766e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f28788a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(ae aeVar, t tVar) {
        if (aeVar.f28775n != null || aeVar.f28768g) {
            if (!aeVar.f28768g) {
                tVar.run();
                return;
            } else {
                aeVar.f28763b.d("Waiting to bind to the service.", new Object[0]);
                aeVar.f28765d.add(tVar);
                return;
            }
        }
        aeVar.f28763b.d("Initiate binding to the service.", new Object[0]);
        aeVar.f28765d.add(tVar);
        ad adVar = new ad(aeVar, null);
        aeVar.f28774m = adVar;
        aeVar.f28768g = true;
        if (aeVar.f28762a.bindService(aeVar.f28769h, adVar, 1)) {
            return;
        }
        aeVar.f28763b.d("Failed to bind to the service.", new Object[0]);
        aeVar.f28768g = false;
        Iterator it = aeVar.f28765d.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af());
        }
        aeVar.f28765d.clear();
    }

    static /* bridge */ /* synthetic */ void r(ae aeVar) {
        aeVar.f28763b.d("linkToDeath", new Object[0]);
        try {
            aeVar.f28775n.asBinder().linkToDeath(aeVar.f28772k, 0);
        } catch (RemoteException e10) {
            aeVar.f28763b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(ae aeVar) {
        aeVar.f28763b.d("unlinkToDeath", new Object[0]);
        aeVar.f28775n.asBinder().unlinkToDeath(aeVar.f28772k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f28764c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f28766e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f28766e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f28761o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f28764c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f28764c, 10);
                    handlerThread.start();
                    map.put(this.f28764c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f28764c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @Nullable
    public final IInterface e() {
        return this.f28775n;
    }

    public final void t(t tVar, @Nullable TaskCompletionSource taskCompletionSource) {
        c().post(new w(this, tVar.d(), taskCompletionSource, tVar));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f28767f) {
            this.f28766e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f28767f) {
            this.f28766e.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }
}
