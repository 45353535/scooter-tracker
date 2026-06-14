package com.explorestack.iab.mraid;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f18171a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View[] f18172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f18173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Runnable f18175d = new RunnableC0312a();

        /* JADX INFO: renamed from: com.explorestack.iab.mraid.s$a$a, reason: collision with other inner class name */
        class RunnableC0312a implements Runnable {

            /* JADX INFO: renamed from: com.explorestack.iab.mraid.s$a$a$a, reason: collision with other inner class name */
            class ViewTreeObserverOnPreDrawListenerC0313a implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f18177b;

                ViewTreeObserverOnPreDrawListenerC0313a(View view) {
                    this.f18177b = view;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    this.f18177b.getViewTreeObserver().removeOnPreDrawListener(this);
                    a.this.d();
                    return true;
                }
            }

            RunnableC0312a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (View view : a.this.f18172a) {
                    if (view.getHeight() > 0 || view.getWidth() > 0) {
                        a.this.d();
                    } else {
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0313a(view));
                    }
                }
            }
        }

        public a(View[] viewArr) {
            this.f18172a = viewArr;
        }

        void a() {
            e2.g.i(this.f18175d);
            this.f18173b = null;
        }

        public void b(Runnable runnable) {
            this.f18173b = runnable;
            this.f18174c = this.f18172a.length;
            e2.g.E(this.f18175d);
        }

        void d() {
            Runnable runnable;
            int i10 = this.f18174c - 1;
            this.f18174c = i10;
            if (i10 != 0 || (runnable = this.f18173b) == null) {
                return;
            }
            runnable.run();
            this.f18173b = null;
        }
    }

    public a a(View... viewArr) {
        b();
        a aVar = new a(viewArr);
        this.f18171a = aVar;
        return aVar;
    }

    public void b() {
        a aVar = this.f18171a;
        if (aVar != null) {
            aVar.a();
            this.f18171a = null;
        }
    }
}
