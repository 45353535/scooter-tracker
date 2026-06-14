package io.sentry.rrweb;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.taurusx.tax.y.z.w.s;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.n3;
import io.sentry.protocol.r;
import io.sentry.rrweb.b;
import io.sentry.v4;
import io.sentry.v7;
import io.sentry.x7;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f84135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f84136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f84137g;

    public h() {
        super(c.Custom);
        this.f84135e = new HashMap();
        this.f84134d = "options";
    }

    private void g(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(s.z.f67720z).a(this.f84134d);
        n3Var.e("payload");
        h(n3Var, iLogger);
        Map map = this.f84137g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84137g.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    private void h(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        Map map = this.f84135e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84135e.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        g(n3Var, iLogger);
        Map map = this.f84136f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84136f.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public h(v7 v7Var) {
        String str;
        this();
        r sdkVersion = v7Var.getSdkVersion();
        if (sdkVersion != null) {
            this.f84135e.put("nativeSdkName", sdkVersion.e());
            this.f84135e.put("nativeSdkVersion", sdkVersion.g());
        }
        x7 sessionReplay = v7Var.getSessionReplay();
        this.f84135e.put("errorSampleRate", sessionReplay.g());
        this.f84135e.put("sessionSampleRate", sessionReplay.l());
        this.f84135e.put("maskAllImages", Boolean.valueOf(sessionReplay.e().contains("android.widget.ImageView")));
        this.f84135e.put("maskAllText", Boolean.valueOf(sessionReplay.e().contains(AndroidComposeViewAccessibilityDelegateCompat.TextClassName)));
        this.f84135e.put("quality", sessionReplay.h().serializedName());
        this.f84135e.put("maskedViewClasses", sessionReplay.e());
        this.f84135e.put("unmaskedViewClasses", sessionReplay.n());
        if (sessionReplay.i() == v4.PIXEL_COPY) {
            str = "pixelCopy";
        } else {
            str = "canvas";
        }
        this.f84135e.put("screenshotStrategy", str);
    }
}
