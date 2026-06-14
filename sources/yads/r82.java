package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pt3 f115366a = new pt3();

    public static void a(Context context) {
        pt3 pt3Var = f115366a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (pt3Var.f114782a) {
            return;
        }
        pt3Var.f114782a = true;
        qu3 qu3VarA = qu3.a();
        qu3VarA.f115171c.getClass();
        vs3 vs3Var = new vs3();
        hu3 hu3Var = qu3VarA.f115170b;
        Handler handler = new Handler();
        hu3Var.getClass();
        qu3VarA.f115172d = new cu3(handler, applicationContext, vs3Var, qu3VarA);
        it3.f112137d.a(applicationContext);
        zs3.a(applicationContext);
        WindowManager windowManager = st3.f115944a;
        st3.f115946c = applicationContext.getResources().getDisplayMetrics().density;
        st3.f115944a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new du3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        mu3.f113613b.f113614a = applicationContext.getApplicationContext();
        ws3 ws3Var = ws3.f117555f;
        if (!ws3Var.f117558c) {
            ws3Var.f117559d.a(applicationContext);
            yt3 yt3Var = ws3Var.f117559d;
            yt3Var.f118382c = ws3Var;
            yt3Var.b();
            ws3Var.f117560e = ws3Var.f117559d.f118381b;
            ws3Var.f117558c = true;
        }
        su3.f115957d.f115958a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new ru3(), intentFilter);
    }
}
