package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class a1 extends a4 implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f62033b;

    a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f62033b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f62036a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f62033b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
