package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes4.dex */
public final class gb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111135a;

    public gb2(Context context) {
        this.f111135a = context;
    }

    public final eb2 a() {
        Object systemService = this.f111135a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (boolValueOf != null && !boolValueOf.booleanValue()) {
            return eb2.f110297c;
        }
        Object systemService2 = this.f111135a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? eb2.f110298d : eb2.f110296b;
    }
}
