package yads;

import android.app.ActivityManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh f115445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(wh whVar) {
        super(0);
        this.f115445b = whVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Object systemService = this.f115445b.f117454a.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
