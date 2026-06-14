package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f48896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f48897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WeakReference<Context> f48898c;

    class a implements a.InterfaceC0520a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f48899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0520a f48900b;

        a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0520a interfaceC0520a) {
            this.f48899a = aVar;
            this.f48900b = interfaceC0520a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0520a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL || bVar == a.b.FINISH) {
                b.this.f48897b.remove(Long.valueOf(this.f48899a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.f48898c.get() == null) {
                b.this.a();
            }
            a.InterfaceC0520a interfaceC0520a = this.f48900b;
            if (interfaceC0520a != null) {
                interfaceC0520a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i10) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f48896a = c.b();
        } else {
            if (i10 == 0) {
                this.f48896a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f48896a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f48896a.allowCoreThreadTimeOut(true);
        }
        this.f48897b = new HashMap<>();
        this.f48898c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f48896a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0520a interfaceC0520a) {
        a(aVar, interfaceC0520a);
        this.f48896a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0520a interfaceC0520a) {
        this.f48897b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0520a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f48897b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f48897b.clear();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f48896a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f48896a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f48896a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f48896a.allowCoreThreadTimeOut(true);
        }
        this.f48897b = new HashMap<>();
        this.f48898c = new WeakReference<>(context);
    }
}
