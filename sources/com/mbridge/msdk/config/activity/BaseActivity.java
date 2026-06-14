package com.mbridge.msdk.config.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class BaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f46633a;

    private void a() {
        try {
            if (getIntent().getIntExtra("hide_status_bar", 0) != 1) {
                f1.b(getWindow());
                f1.c(getWindow());
            } else {
                f1.a(getWindow());
                f1.d(getWindow());
                f1.c(getWindow());
            }
        } catch (Exception e10) {
            q0.b("BaseActivity", e10.getMessage());
        }
    }

    private void b() {
        if (getIntent().getIntExtra("modal", 0) == 1) {
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80000000")));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a("onBackPressed");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        b();
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a("onDestroy");
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a(C4240b4.i.f42653t0);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a("onReStart");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a(C4240b4.i.f42655u0);
        c.n().a(this);
        if (getIntent().getIntExtra("hide_status_bar", 0) == 1) {
            f1.a(getWindow());
        } else {
            f1.b(getWindow());
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a("onStart");
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        a aVar = this.f46633a;
        if (aVar == null) {
            return;
        }
        aVar.a("onStop");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (getIntent().getIntExtra("hide_status_bar", 0) == 1) {
            f1.a(getWindow());
        } else {
            f1.b(getWindow());
        }
    }
}
