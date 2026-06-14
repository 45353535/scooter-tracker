package io.bidmachine.rendering.internal;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;
import pd.d0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends Activity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    protected void b() {
    }

    protected void d() {
        d0.g(this, ViewCompat.MEASURED_STATE_MASK);
        d0.h(this);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        d();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: ic.c
                public final void onBackInvoked() {
                    io.bidmachine.rendering.internal.a.c(this.f74211a);
                }
            });
        }
    }
}
