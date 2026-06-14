package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.kh;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.w7;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class OverlayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w7 f63786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bundle f63790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63791f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ad f63792g;

    private boolean b() {
        return this.f63787b && Build.VERSION.SDK_INT != 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f63789d) {
            this.f63789d = false;
            this.f63791f = vi.a((Activity) this, this.f63788c, false);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        w7 w7Var = this.f63786a;
        if (w7Var != null) {
            w7Var.h();
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        w7 w7Var = this.f63786a;
        if (w7Var == null || !w7Var.c()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (b()) {
            a();
            w7 w7Var = this.f63786a;
            if (w7Var != null) {
                w7Var.a(this.f63790e);
                this.f63786a.g();
            }
            this.f63787b = false;
        }
        w7 w7Var2 = this.f63786a;
        if (w7Var2 != null) {
            w7Var2.d();
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        int intExtra2 = getIntent().getIntExtra("ad", -1);
        if (intExtra2 <= 0) {
            finish();
            return;
        }
        Ad ad2 = (Ad) kh.a(intExtra2, Ad.class);
        this.f63792g = ad2;
        if (ad2 == null) {
            finish();
            return;
        }
        if (intExtra >= 0) {
            sg sgVar = (sg) com.startapp.sdk.components.a.a(getApplicationContext()).f64185l.a();
            AdPreferences.Placement byIndex = AdPreferences.Placement.getByIndex(intExtra);
            String adId = this.f63792g.getAdId();
            if (adId != null) {
                sgVar.f65269a.put(new rg(byIndex), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.f63789d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f63791f = bundle.getInt("activityLockedOrientation", -1);
            this.f63789d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f63788c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
        this.f63787b = getResources().getConfiguration().orientation != this.f63788c;
        if (b()) {
            this.f63790e = bundle;
            return;
        }
        a();
        w7 w7Var = this.f63786a;
        if (w7Var != null) {
            w7Var.a(bundle);
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        if (!b()) {
            w7 w7Var = this.f63786a;
            if (w7Var != null) {
                w7Var.e();
                this.f63786a = null;
            }
            WeakHashMap weakHashMap = vi.f65408a;
            vi.a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        w7 w7Var = this.f63786a;
        if (w7Var == null || w7Var.a(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        if (!b()) {
            w7 w7Var = this.f63786a;
            if (w7Var != null) {
                w7Var.f();
            }
            h0.d(this);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        w7 w7Var;
        super.onResume();
        int i10 = this.f63791f;
        if (i10 == -1) {
            this.f63791f = vi.a(this, this.f63788c, this.f63789d);
        } else {
            int i11 = q0.f65128a;
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        }
        if (b() || (w7Var = this.f63786a) == null) {
            return;
        }
        w7Var.g();
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (b()) {
            return;
        }
        w7 w7Var = this.f63786a;
        if (w7Var != null) {
            w7Var.b(bundle);
        }
        bundle.putInt("activityLockedOrientation", this.f63791f);
        bundle.putBoolean("activityShouldLockOrientation", this.f63789d);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        super.onStop();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.interstitials.OverlayActivity.a():void");
    }
}
