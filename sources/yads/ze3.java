package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ze3 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f118643a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qs3 f118644b;

    public final void a() {
        this.f118643a.post(new Runnable() { // from class: yads.p71
            @Override // java.lang.Runnable
            public final void run() {
                ze3.a(this.f114577b);
            }
        });
    }

    public static final void a(ze3 ze3Var) {
        qs3 qs3Var = ze3Var.f118644b;
        if (qs3Var != null) {
            new CallbackStackTraceMarker(new ps3(qs3Var));
        }
    }
}
