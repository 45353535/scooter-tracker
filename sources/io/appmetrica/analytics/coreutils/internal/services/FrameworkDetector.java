package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes12.dex */
public class FrameworkDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f75278a = new FrameworkDetector().detectFramework();

    @VisibleForTesting
    public FrameworkDetector() {
    }

    @NonNull
    public static String framework() {
        return f75278a;
    }

    public static boolean isNative() {
        return "native".equals(f75278a);
    }

    @NonNull
    @VisibleForTesting
    public String detectFramework() {
        return ReflectionUtils.detectClassExists(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME) ? "unity" : ReflectionUtils.detectClassExists("mono.MonoPackageManager") ? PluginErrorDetails.Platform.XAMARIN : ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin") ? PluginErrorDetails.Platform.CORDOVA : ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView") ? "react" : ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
    }
}
