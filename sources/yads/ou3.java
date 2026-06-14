package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ou3 {
    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static float b(View view) {
        return view.getZ();
    }

    public static boolean c(View view) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity != null) {
            return activity.isInPictureInPictureMode();
        }
        return false;
    }

    public static boolean d(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }
}
