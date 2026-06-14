package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3939ok;
import java.util.HashMap;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3939ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3845l1 f39213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f39214b;

    public C3939ok(AbstractC3845l1 timeOutInformer) {
        Intrinsics.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.f39213a = timeOutInformer;
        this.f39214b = new HashMap();
    }

    public final boolean a(byte b10, long j10) {
        Intrinsics.checkNotNullExpressionValue("ok", "TAG");
        if (this.f39214b.containsKey(Byte.valueOf(b10))) {
            a(b10);
        }
        try {
            Timer timer = new Timer("ok");
            this.f39214b.put(Byte.valueOf(b10), timer);
            timer.schedule(new C3914nk(this, b10), j10);
            return true;
        } catch (InternalError e10) {
            Intrinsics.checkNotNullExpressionValue("ok", "TAG");
            e10.toString();
            return false;
        }
    }

    public final void b(final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: w3.ga
            @Override // java.lang.Runnable
            public final void run() {
                C3939ok.a(this.f107068b, b10);
            }
        });
    }

    public static final void a(C3939ok c3939ok, byte b10) {
        c3939ok.f39213a.a(b10);
    }

    public final void a(byte b10) {
        Intrinsics.checkNotNullExpressionValue("ok", "TAG");
        Timer timer = (Timer) this.f39214b.get(Byte.valueOf(b10));
        if (timer != null) {
            timer.cancel();
            this.f39214b.remove(Byte.valueOf(b10));
        }
    }
}
