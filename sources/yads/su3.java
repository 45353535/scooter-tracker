package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class su3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final su3 f115957d = new su3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f115958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115959b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115960c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f115960c || this.f115959b)) {
            return;
        }
        Iterator it = DesugarCollections.unmodifiableCollection(ut3.f116776c.f116777a).iterator();
        while (it.hasNext()) {
            ia iaVar = ((dt3) it.next()).f110065e;
            boolean z12 = z11 || z10;
            if (iaVar.f111922b.get() != 0) {
                pu3.f114791a.a((WebView) iaVar.f111922b.get(), "setDeviceLockState", z12 ? "locked" : "unlocked");
            }
        }
    }

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f115958a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f115959b, zIsDeviceLocked);
        this.f115960c = zIsDeviceLocked;
    }
}
