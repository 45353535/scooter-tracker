package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.mrf;
import com.bytedance.sdk.openadsdk.utils.bjy;

/* JADX INFO: loaded from: classes6.dex */
public class TTAdActivity extends TTBaseActivity {
    private int lnr = -1;
    private ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f16805ud;

    private void lnr() {
        ud udVar = this.qdl;
        if (udVar == null) {
            super.onBackPressed();
        } else {
            udVar.jpc();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        boolean z10 = false;
        if (bundle != null) {
            this.tvp = bundle.getString("single_process_listener_key");
            z10 = bundle.getBoolean("enable_new_arch", false);
        } else {
            this.tvp = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
                z10 = true;
            }
        }
        this.f16805ud = z10;
        aaj.qdl("BVA", "onCreate: isEnableNewArch = " + this.f16805ud + ",listenerKey=" + this.tvp);
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVarQdl = qdl(this.tvp);
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVarUd = ud(this.tvp);
        ljh ljhVarQdl = com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.exu.mml.ud) null);
        if (ljhVarQdl == null) {
            finish();
            return;
        }
        ud udVar = new ud(this, ljhVarQdl, this.f16805ud);
        this.qdl = udVar;
        udVar.qdl(this, bundle, qdlVarQdl, udVarUd);
        com.bytedance.sdk.openadsdk.utils.ud.qdl(ljhVarQdl);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.mzz(this);
        }
        if (!this.f16805ud) {
            koa.qdl().qdl((com.bytedance.sdk.openadsdk.qdl.mzz.qdl) null);
            koa.qdl().qdl((com.bytedance.sdk.openadsdk.qdl.lnr.ud) null);
        } else if (!TextUtils.isEmpty(this.tvp)) {
            koa.qdl().qdl(this.tvp, isFinishing(), isChangingConfigurations());
        }
        bjy.qdl();
        mrf.qdl().qdl(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.lnr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.ud(this);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.tvp)) {
            bundle.putString("single_process_listener_key", this.tvp);
        }
        bundle.putBoolean("enable_new_arch", this.f16805ud);
        ud udVar = this.qdl;
        if (udVar != null) {
            int iQdl = koa.qdl().qdl(udVar.qdl());
            this.lnr = iQdl;
            this.qdl.qdl(this, bundle, iQdl);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.lnr >= 0) {
            koa.qdl().lnr(this.lnr);
            this.lnr = -1;
        }
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl(this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.mml(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected boolean qdl() {
        return true;
    }

    public com.bytedance.sdk.openadsdk.qdl.lnr.ud ud(String str) {
        if (!this.f16805ud) {
            return koa.qdl().lnr();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.qdl.lnr.ud) koa.qdl().qdl(str, com.bytedance.sdk.openadsdk.qdl.lnr.ud.class);
    }

    public com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdl(String str) {
        if (!this.f16805ud) {
            return koa.qdl().ud();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.qdl.mzz.qdl) koa.qdl().qdl(str, com.bytedance.sdk.openadsdk.qdl.mzz.qdl.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void ud() {
        lnr();
    }
}
