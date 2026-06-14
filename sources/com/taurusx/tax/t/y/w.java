package com.taurusx.tax.t.y;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.taurusx.tax.R;
import com.taurusx.tax.g.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w extends Dialog {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66584y = "BaseAlert";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f66585w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public WeakReference<Activity> f66586z;

    public class z extends g {
        public z() {
        }

        @Override // com.taurusx.tax.g.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            super.onActivityDestroyed(activity);
            Activity activityY = w.this.y();
            if (activityY == null || activityY != activity) {
                return;
            }
            Log.d(w.f66584y, "host activity Destroyed: dismiss self");
            w.this.z();
        }
    }

    public w(@NonNull Activity activity) {
        super(activity, R.style.taurusx_dialogNoBg);
        this.f66586z = null;
        this.f66586z = new WeakReference<>(activity);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            z zVar = new z();
            this.f66585w = zVar;
            ((Application) applicationContext).registerActivityLifecycleCallbacks(zVar);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        View viewZ = z(getLayoutInflater());
        if (viewZ != null) {
            setContentView(viewZ);
        }
        Window window = getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        g gVar;
        super.onDetachedFromWindow();
        Context applicationContext = getContext().getApplicationContext();
        if (!(applicationContext instanceof Application) || (gVar = this.f66585w) == null) {
            return;
        }
        try {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(gVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void w() {
        Activity activity;
        try {
            WeakReference<Activity> weakReference = this.f66586z;
            if (weakReference != null && (activity = weakReference.get()) != null) {
                if (activity.isFinishing()) {
                    return;
                }
                if (activity.isDestroyed()) {
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            show();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public Activity y() {
        WeakReference<Activity> weakReference = this.f66586z;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public abstract View z(LayoutInflater layoutInflater);

    public void z() {
        try {
            dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
