package n2;

import android.util.Log;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f95100a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f95101b = e.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f95102c;

    private e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class b() throws ClassNotFoundException {
        Class<?> cls = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (f95102c == null) {
                f95102c = f95100a.b();
            }
            Class cls = f95102c;
            Class cls2 = null;
            if (cls == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                cls = null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls3 = f95102c;
            if (cls3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
            } else {
                cls2 = cls3;
            }
            method.invoke(cls2, str, str2, str3);
        } catch (Exception e10) {
            Log.e(f95101b, "Failed to send message to Unity", e10);
        }
    }
}
