package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.config.global.features.q;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.v;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.t0;
import com.fyber.inneractive.sdk.web.v0;
import io.bidmachine.protobuf.EventTypeExtended;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class InternalStoreWebpageActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f20137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v0 f20138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.features.p f20139d = com.fyber.inneractive.sdk.config.global.features.p.FullScreen;

    public static void startActivity(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InternalStoreWebpageActivity.class);
        intent.putExtra("spotId", str);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v0 v0Var = this.f20138c;
        if (v0Var != null) {
            v0Var.C = false;
            t0 t0Var = v0Var.f24058i;
            if (t0Var != null) {
                b0 b0Var = (b0) t0Var;
                IAlog.a("onInternalStoreWebpageDismissed callback called", new Object[0]);
                if (b0Var.f20623c != null) {
                    IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(b0Var));
                    b0Var.f20623c.onAdWillCloseInternalBrowser(b0Var.f20621a);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        v0 v0Var = this.f20138c;
        if (v0Var != null) {
            if (v0Var.f24073x) {
                return;
            }
            if (v0Var.f24072w) {
                v0Var.d("navigateBack();");
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.width == com.fyber.inneractive.sdk.util.o.e() || this.f20139d != com.fyber.inneractive.sdk.config.global.features.p.Modal) {
            return;
        }
        attributes.gravity = 83;
        attributes.height = (int) (com.fyber.inneractive.sdk.util.o.d() * 0.8f);
        attributes.width = com.fyber.inneractive.sdk.util.o.e();
        getWindow().setAttributes(attributes);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        String stringExtra = getIntent().getStringExtra("spotId");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.f("%sSpot id is empty", IAlog.a(this));
            spot = null;
        } else {
            spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
        }
        if (spot == null || spot.getAdContent() == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        q qVar = (q) spot.getAdContent().f21037c.a(q.class);
        com.fyber.inneractive.sdk.config.global.features.p pVarC = qVar != null ? qVar.c() : com.fyber.inneractive.sdk.config.global.features.p.FullScreen;
        this.f20139d = pVarC;
        if (pVarC == com.fyber.inneractive.sdk.config.global.features.p.Modal) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 83;
            attributes.height = (int) (com.fyber.inneractive.sdk.util.o.d() * 0.8f);
            attributes.width = com.fyber.inneractive.sdk.util.o.e();
            attributes.dimAmount = 0.3f;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setBackgroundColor(0);
            getWindow().addFlags(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } else {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
        }
        super.onCreate(bundle);
        setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_activity_internal_store_webpage);
        this.f20137b = (ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.internal_store_content);
        v0 v0VarA = spot.getAdContent().a();
        this.f20138c = v0VarA;
        if (v0VarA != null) {
            v0VarA.f24066q = new WeakReference(this);
            v0 v0Var = this.f20138c;
            v vVar = v0Var.f24057h;
            if (vVar != null) {
                vVar.a(u.IGNITE_FLOW_STORE_PAGE_OPENED, v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP);
            }
            this.f20138c.f24069t.set(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        InneractiveAdSpot spot;
        v0 v0Var;
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("spotId");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.f("%sSpot id is empty", IAlog.a(this));
            spot = null;
        } else {
            spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
        }
        if (spot == null || spot.getAdContent() == null || spot.getAdContent().c() || (v0Var = this.f20138c) == null) {
            return;
        }
        v0Var.f24074y = true;
        v0Var.D = false;
        v0Var.f24051b.f21076h.remove(v0Var);
        v0Var.f24058i = null;
        IAlog.a("destroy internalStoreWebpageController", new Object[0]);
        this.f20138c = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ViewGroup viewGroup = this.f20137b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        v0 v0Var = this.f20138c;
        if (v0Var != null) {
            this.f20137b.addView(v0Var.f24050a, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
