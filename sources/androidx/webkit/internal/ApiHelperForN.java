package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(24)
public class ApiHelperForN {
    private ApiHelperForN() {
    }

    public static boolean getAllowContentAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static boolean getAllowFileAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static boolean getBlockNetworkLoads(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    public static int getCacheMode(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    @NonNull
    public static File getDataDir(@NonNull Context context) {
        return context.getDataDir();
    }

    public static int getDisabledActionModeMenuItems(@NonNull WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    @NonNull
    public static ServiceWorkerController getServiceWorkerControllerInstance() {
        return ServiceWorkerController.getInstance();
    }

    @NonNull
    public static ServiceWorkerWebSettings getServiceWorkerWebSettings(@NonNull ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    @NonNull
    public static ServiceWorkerWebSettingsImpl getServiceWorkerWebSettingsImpl(@NonNull ServiceWorkerController serviceWorkerController) {
        return new ServiceWorkerWebSettingsImpl(getServiceWorkerWebSettings(serviceWorkerController));
    }

    public static boolean isRedirect(@NonNull WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static void setAllowContentAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowContentAccess(z10);
    }

    public static void setAllowFileAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowFileAccess(z10);
    }

    public static void setBlockNetworkLoads(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z10);
    }

    public static void setCacheMode(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, int i10) {
        serviceWorkerWebSettings.setCacheMode(i10);
    }

    public static void setDisabledActionModeMenuItems(@NonNull WebSettings webSettings, int i10) {
        webSettings.setDisabledActionModeMenuItems(i10);
    }

    public static void setServiceWorkerClient(@NonNull ServiceWorkerController serviceWorkerController, @Nullable ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void setServiceWorkerClientCompat(@NonNull ServiceWorkerController serviceWorkerController, @NonNull ServiceWorkerClientCompat serviceWorkerClientCompat) {
        serviceWorkerController.setServiceWorkerClient(new FrameworkServiceWorkerClient(serviceWorkerClientCompat));
    }
}
