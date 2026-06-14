package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: loaded from: classes4.dex */
public final class c93 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f109290c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f109291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f109292b;

    public /* synthetic */ c93(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f109291a.post(new Runnable() { // from class: yads.v4
            @Override // java.lang.Runnable
            public final void run() {
                c93.a(this.f116866b);
            }
        });
    }

    public static final void a(c93 c93Var) {
        Toast.makeText(c93Var.f109292b, f109290c, 1).show();
    }

    public c93(Context context, Handler handler) {
        this.f109291a = handler;
        this.f109292b = context.getApplicationContext();
    }
}
