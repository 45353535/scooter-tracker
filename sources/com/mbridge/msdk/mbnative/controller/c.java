package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f49599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f49600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f49601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f49602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f49603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49605g;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    class RunnableC0536c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f49608a;

        RunnableC0536c(View view) {
            this.f49608a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f49608a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f49599a = new WeakReference(viewTreeObserver);
                if (c.this.f49601c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f49601c);
                }
            }
        }
    }

    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f49600b = arrayList;
        this.f49601c = null;
        this.f49602d = dVar;
        this.f49603e = handler;
        this.f49605g = i10;
        if (list != null) {
            this.f49600b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f49604f = false;
            List<View> list = this.f49600b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f49600b.size(); i10++) {
                View view = this.f49600b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f49602d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f49604f) {
            return;
        }
        Handler handler = this.f49603e;
        if (handler != null) {
            if (this.f49605g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f49604f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f49601c = new a();
        } catch (Throwable th3) {
            q0.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    public void a(View view) {
        View viewA;
        View view2;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f49600b.add(view);
        } else {
            List<View> list = this.f49600b;
            viewA = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f49600b.size() && ((view2 = this.f49600b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0536c(viewA));
    }

    private boolean b(View view) {
        return !e1.a(view, this.f49605g);
    }

    public void a() {
        try {
            this.f49604f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f49599a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f49599a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f49601c);
                }
                this.f49599a.clear();
            }
            this.f49602d = null;
            this.f49601c = null;
            List<View> list = this.f49600b;
            if (list != null) {
                list.clear();
            }
            this.f49600b = null;
        } catch (Throwable unused) {
        }
    }
}
