package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class gf3 implements ef3, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f111178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public df3 f111179b;

    public gf3(DisplayManager displayManager) {
        this.f111178a = displayManager;
    }

    public static gf3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new gf3(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        df3 df3Var = this.f111179b;
        if (df3Var == null || i10 != 0) {
            return;
        }
        df3Var.a(this.f111178a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // yads.ef3
    public final void a(df3 df3Var) {
        this.f111179b = df3Var;
        this.f111178a.registerDisplayListener(this, w83.a((Handler.Callback) null));
        df3Var.a(this.f111178a.getDisplay(0));
    }

    @Override // yads.ef3
    public final void a() {
        this.f111178a.unregisterDisplayListener(this);
        this.f111179b = null;
    }
}
