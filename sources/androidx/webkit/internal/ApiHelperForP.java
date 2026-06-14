package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(28)
public class ApiHelperForP {
    private ApiHelperForP() {
    }

    @NonNull
    public static TracingController getTracingControllerInstance() {
        return TracingController.getInstance();
    }

    @NonNull
    public static ClassLoader getWebViewClassLoader() {
        return WebView.getWebViewClassLoader();
    }

    @NonNull
    public static Looper getWebViewLooper(@NonNull WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean isTracing(@NonNull TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void setDataDirectorySuffix(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void start(@NonNull TracingController tracingController, @NonNull TracingConfig tracingConfig) {
        tracingController.start(c0.a().addCategories(tracingConfig.getPredefinedCategories()).addCategories((Collection<String>) tracingConfig.getCustomIncludedCategories()).setTracingMode(tracingConfig.getTracingMode()).build());
    }

    public static boolean stop(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
