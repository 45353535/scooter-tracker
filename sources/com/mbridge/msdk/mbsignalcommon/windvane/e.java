package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f49826d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f49827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f49828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindVaneWebView f49829c;

    public e(Context context, WindVaneWebView windVaneWebView) {
        this.f49827a = context;
        this.f49829c = windVaneWebView;
        a();
    }

    public void a(Context context) {
        this.f49827a = context;
    }

    public void a(Object obj) {
        this.f49828b = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f49826d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f49828b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f49826d == null) {
            f49826d = new HashMap<>();
        }
        f49826d.put(str, cls);
    }

    public Object a(String str) {
        if (f49826d == null) {
            f49826d = new HashMap<>();
        }
        return a(str, this.f49829c, this.f49827a);
    }

    public void a() {
        try {
            int i10 = interstitial.f49213i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49699a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i11 = RewardSignal.f52804i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49700b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i12 = VideoCommunication.f52830j;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49701c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i13 = MraidSignalCommunication.f49770h;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49703e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i14 = BannerSignalPlugin.f49758i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49704f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            int i15 = SplashSignal.f50884i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49705g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i16 = WebGLCheckSignal.f49782g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f49706h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}
