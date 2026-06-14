package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.utils.ljh;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class TTBaseActivity extends Activity {
    protected boolean jpc = false;
    private OnBackInvokedCallback qdl;
    protected String tvp;

    private static class qdl implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> qdl;

        qdl(TTBaseActivity tTBaseActivity) {
            this.qdl = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.qdl.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.ud();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public void lnr(boolean z10) {
        this.jpc = z10;
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (qdl() && ljh.qdl()) {
            this.qdl = new qdl(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.qdl);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!ljh.qdl() || this.qdl == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.qdl);
        this.qdl = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (IllegalArgumentException unused) {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || i10 < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            aaj.qdl("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                aaj.qdl("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }

    protected boolean qdl() {
        return false;
    }

    protected void ud() {
        onBackPressed();
    }
}
