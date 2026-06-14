package com.mbridge.msdk.config.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes10.dex */
public class MBRewardVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewGroup f46634b;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(i0.a(getApplicationContext(), "mbridge_activity", "layout"), (ViewGroup) null);
        this.f46634b = viewGroup;
        setContentView(viewGroup);
        this.f46633a = new a(this, this.f46634b);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
