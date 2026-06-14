package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: loaded from: classes10.dex */
public interface a extends e {

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0598a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i10, String str);

        void a(boolean z10);

        void onInitSuccess();
    }

    void a(int i10);

    void a(int i10, String str);

    void a(InterfaceC0598a interfaceC0598a);

    void a(String str);

    void a(boolean z10);

    boolean a();

    int b();

    void b(int i10);

    void b(boolean z10);

    String c();

    void c(int i10);

    int d();

    void d(int i10);

    String e();

    void e(int i10);

    String f(int i10);

    void f();

    String g();

    void g(int i10);

    void h();

    int i();

    void release();

    void setActivity(Activity activity);

    void setAdEvents(AdEvents adEvents);

    void setAdSession(AdSession adSession);

    void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar);

    void setUnitId(String str);

    void setVideoEvents(MediaEvents mediaEvents);

    void setWebViewFront(int i10);
}
