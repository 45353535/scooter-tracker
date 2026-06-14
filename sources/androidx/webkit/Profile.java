package androidx.webkit;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface Profile {
    public static final String DEFAULT_PROFILE_NAME = "Default";

    @NonNull
    @AnyThread
    CookieManager getCookieManager();

    @NonNull
    @AnyThread
    GeolocationPermissions getGeolocationPermissions();

    @NonNull
    @AnyThread
    String getName();

    @NonNull
    @AnyThread
    ServiceWorkerController getServiceWorkerController();

    @NonNull
    @AnyThread
    WebStorage getWebStorage();
}
