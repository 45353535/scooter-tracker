package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f8773a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8774b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8775c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8776d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f8777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f8779g;

    public interface a {
        void a(int i10, int i11);
    }

    public e5(View view) {
        this.f8777e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f8778f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.ba
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f8460b.b();
            }
        };
        this.f8778f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f8774b) {
            try {
                this.f8776d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f8773a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f8779g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        if (this.f8776d) {
            return;
        }
        this.f8776d = true;
        this.f8775c.postDelayed(new Runnable() { // from class: com.applovin.impl.ca
            @Override // java.lang.Runnable
            public final void run() {
                this.f8516b.c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f8779g = null;
        View view = (View) this.f8777e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f8778f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f8777e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f8774b) {
            this.f8773a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f8779g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f8774b) {
            this.f8773a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
