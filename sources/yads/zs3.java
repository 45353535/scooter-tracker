package yads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UiModeManager f118799a;

    public static int a() {
        UiModeManager uiModeManager = f118799a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }

    public static void a(Context context) {
        f118799a = (UiModeManager) context.getSystemService("uimode");
    }
}
