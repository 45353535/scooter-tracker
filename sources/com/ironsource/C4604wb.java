package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4604wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f45734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f45735b;

    /* JADX INFO: renamed from: com.ironsource.wb$a */
    private class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f45736a;

        public Handler a() {
            return this.f45736a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f45736a = new Handler();
            Looper.loop();
        }

        private a() {
        }
    }

    public C4604wb() {
        a aVar = new a();
        this.f45734a = aVar;
        aVar.start();
        this.f45735b = new Date().getTime();
    }

    protected boolean a(Object obj) {
        return (obj == null || this.f45734a == null) ? false : true;
    }

    protected void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.f45734a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }
}
