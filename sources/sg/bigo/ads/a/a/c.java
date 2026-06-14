package sg.bigo.ads.a.a;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<d> f100087a;

    public c(d dVar) {
        this.f100087a = new WeakReference<>(dVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        d dVar = this.f100087a.get();
        if (dVar != null) {
            dVar.a(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f100087a.get();
        if (dVar != null) {
            dVar.b();
        }
    }
}
