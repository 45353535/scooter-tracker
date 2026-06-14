package sg.bigo.ads.controller.f;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.d.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f103673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<InterfaceC1281a> f103674b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.controller.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1281a {
        void a(boolean z10);
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        boolean zB = sg.bigo.ads.common.aa.c.b(context);
        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(zB)));
        synchronized (this.f103674b) {
            try {
                for (InterfaceC1281a interfaceC1281a : this.f103674b) {
                    if (interfaceC1281a != null) {
                        interfaceC1281a.a(zB);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void a(Context context, @Nullable InterfaceC1281a interfaceC1281a) {
        try {
            if (f103673a == null) {
                f103673a = new a();
                sg.bigo.ads.common.d.a.a().a(context, f103673a);
            }
            synchronized (f103673a.f103674b) {
                if (interfaceC1281a != null) {
                    try {
                        f103673a.f103674b.add(interfaceC1281a);
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
