package androidx.test.platform.view.inspector;

import android.os.Build;
import android.view.View;
import android.view.inspector.WindowInspector;
import androidx.annotation.RestrictTo;
import androidx.test.internal.platform.reflect.ReflectionException;
import androidx.test.internal.platform.reflect.ReflectiveField;
import androidx.test.internal.platform.reflect.ReflectiveMethod;
import androidx.test.internal.util.Checks;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WindowInspectorCompat {
    private static final ReflectiveMethod<Object> getWindowManagerGlobalReflectiveCall = new ReflectiveMethod<>("android.view.WindowManagerGlobal", Constants.GET_INSTANCE, (Class<?>[]) new Class[0]);
    private static final ReflectiveField<List<View>> windowViewsReflectiveField = new ReflectiveField<>("android.view.WindowManagerGlobal", "mViews");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class ViewRetrievalException extends Exception {
        ViewRetrievalException(Throwable th2) {
            super("failed to retrieve window views", th2);
        }
    }

    private WindowInspectorCompat() {
    }

    public static List<View> getGlobalWindowViews() throws ViewRetrievalException {
        Checks.checkMainThread();
        if (Build.VERSION.SDK_INT >= 29) {
            return WindowInspector.getGlobalWindowViews();
        }
        try {
            return getViews(getWindowManager());
        } catch (ReflectionException e10) {
            throw new ViewRetrievalException(e10.getCause());
        }
    }

    private static List<View> getViews(Object obj) throws ReflectionException {
        return new ArrayList(windowViewsReflectiveField.get(obj));
    }

    private static Object getWindowManager() throws ReflectionException {
        return getWindowManagerGlobalReflectiveCall.invokeStatic(new Object[0]);
    }
}
