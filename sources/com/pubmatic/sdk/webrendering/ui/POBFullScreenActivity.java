package com.pubmatic.sdk.webrendering.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.R$id;
import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class POBFullScreenActivity extends Activity {
    public static final String ALLOW_ORIENTATION_CHANGE = "AllowOrientation";
    public static final String ENABLE_BACK_PRESS = "EnableBackPress";
    public static final String RENDERER_IDENTIFIER = "RendererIdentifier";
    public static final String REQUESTED_ORIENTATION = "RequestedOrientation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f63427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LocalBroadcastManager f63429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBFullScreenActivityListener f63430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBFullScreenActivityBackPressListener f63431e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63433g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BroadcastReceiver f63432f = new a();

    public enum ACTIONS {
        POB_CLOSE,
        POB_BACK_PRESS
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Integer.valueOf(intent.getIntExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, 0)).equals(Integer.valueOf(POBFullScreenActivity.this.f63428b))) {
                POBFullScreenActivity.this.onBroadcastReceived(intent);
            }
        }
    }

    public static void closeActivity(@NonNull Context context, int i10) {
        String strName = ACTIONS.POB_CLOSE.name();
        Intent intent = new Intent(strName);
        intent.putExtra(RENDERER_IDENTIFIER, i10);
        try {
            sendBroadcast(context, intent);
        } catch (Exception e10) {
            POBLog.warn("POBFullScreenActivity", "Unable to close full screen activity for %s. Error: %s", strName, e10.getMessage());
        }
    }

    public static void sendBroadcast(@NonNull Context context, @NonNull Intent intent) throws Exception {
        try {
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Exception e10) {
            POBLog.warn("POBFullScreenActivity", "Unable to send broadcast for %s", intent.getAction());
            throw new Exception(e10);
        }
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) throws Exception {
        intent.setClass(context, POBFullScreenActivity.class);
        intent.addFlags(268435456);
        POBUtils.startActivity(context, intent);
    }

    public static void startFullScreenActivity(@NonNull Context context, int i10, @NonNull POBAdDescriptor pOBAdDescriptor, int i11) throws Exception {
        Intent intent = new Intent();
        intent.putExtra(REQUESTED_ORIENTATION, i10);
        intent.putExtra(RENDERER_IDENTIFIER, i11);
        intent.putExtra(ENABLE_BACK_PRESS, false);
        if (!pOBAdDescriptor.isVideo()) {
            intent.putExtra(ALLOW_ORIENTATION_CHANGE, Boolean.FALSE);
        }
        startActivity(context, intent);
    }

    public static void updateBackButtonState(@NonNull Context context, int i10, boolean z10) {
        String strName = ACTIONS.POB_BACK_PRESS.name();
        Intent intent = new Intent(strName);
        intent.putExtra(RENDERER_IDENTIFIER, i10);
        intent.putExtra(ENABLE_BACK_PRESS, z10);
        try {
            sendBroadcast(context, intent);
        } catch (Exception e10) {
            POBLog.warn("POBFullScreenActivity", "Unable to update back button state for %s. Error: %s", strName, e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f63433g) {
            POBFullScreenActivityBackPressListener pOBFullScreenActivityBackPressListener = this.f63431e;
            if (pOBFullScreenActivityBackPressListener != null) {
                pOBFullScreenActivityBackPressListener.onBackPressed();
            } else {
                super.onBackPressed();
            }
        }
    }

    protected void onBroadcastReceived(@NonNull Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, ACTIONS.POB_CLOSE.name())) {
            finish();
        } else if (Objects.equals(action, ACTIONS.POB_BACK_PRESS.name())) {
            this.f63433g = intent.getBooleanExtra(ENABLE_BACK_PRESS, false);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(REQUESTED_ORIENTATION, POBUtils.getDeviceOrientation(getApplicationContext()));
        boolean booleanExtra = intent.getBooleanExtra(ALLOW_ORIENTATION_CHANGE, true);
        this.f63433g = intent.getBooleanExtra(ENABLE_BACK_PRESS, false);
        int intExtra2 = intent.getIntExtra(RENDERER_IDENTIFIER, 0);
        this.f63428b = intExtra2;
        if (intExtra2 != 0) {
            POBAdViewCacheService.AdViewConfig adViewConfigPopStoredAdView = POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(this.f63428b));
            if (adViewConfigPopStoredAdView == null) {
                POBLog.error("POBFullScreenActivity", "Unable to retrieve stored ad view config for %s", Integer.valueOf(this.f63428b));
                finish();
                return;
            }
            this.f63427a = (ViewGroup) adViewConfigPopStoredAdView.getAdView();
            this.f63430d = adViewConfigPopStoredAdView.getEventListener();
            this.f63431e = adViewConfigPopStoredAdView.getBackPressListener();
            this.f63427a.setId(R$id.pob_modal_view);
            if (Build.VERSION.SDK_INT >= 30) {
                POBUtils.setSystemFitWindowsForEdgeToEdge(this.f63427a);
            }
            setContentView(this.f63427a);
            try {
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(getApplicationContext());
                this.f63429c = localBroadcastManager;
                localBroadcastManager.registerReceiver(this.f63432f, a());
            } catch (Exception e10) {
                POBLog.warn("POBFullScreenActivity", "Unable to register broadcast receiver for %s. Error: %s", Integer.valueOf(this.f63428b), e10.getMessage());
            }
            POBFullScreenActivityListener pOBFullScreenActivityListener = this.f63430d;
            if (pOBFullScreenActivityListener != null) {
                pOBFullScreenActivityListener.onCreate(this);
            }
        }
        if (booleanExtra) {
            setRequestedOrientation(-1);
        } else {
            a(intExtra);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup = this.f63427a;
        if (viewGroup != null && (viewGroup.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f63427a.getParent()).removeView(this.f63427a);
            this.f63427a.removeAllViews();
        }
        super.onDestroy();
        setRequestedOrientation(-1);
        POBFullScreenActivityListener pOBFullScreenActivityListener = this.f63430d;
        if (pOBFullScreenActivityListener != null) {
            pOBFullScreenActivityListener.onDestroy();
        }
        try {
            LocalBroadcastManager localBroadcastManager = this.f63429c;
            if (localBroadcastManager != null) {
                localBroadcastManager.unregisterReceiver(this.f63432f);
            }
        } catch (Exception e10) {
            POBLog.warn("POBFullScreenActivity", "Unable to unregister broadcast receiver for %s. Error: %s", Integer.valueOf(this.f63428b), e10.getMessage());
        }
    }

    private IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTIONS.POB_CLOSE.name());
        intentFilter.addAction(ACTIONS.POB_BACK_PRESS.name());
        return intentFilter;
    }

    private void a(int i10) {
        if (i10 == 0) {
            setRequestedOrientation(-1);
        } else if (i10 == 2) {
            setRequestedOrientation(6);
        } else if (i10 == 1) {
            setRequestedOrientation(7);
        }
    }

    public static void startFullScreenActivity(@NonNull Context context, boolean z10, int i10) throws Exception {
        Intent intent = new Intent();
        intent.putExtra(RENDERER_IDENTIFIER, i10);
        if (z10) {
            intent.putExtra(ENABLE_BACK_PRESS, false);
        } else {
            intent.putExtra(ALLOW_ORIENTATION_CHANGE, Boolean.FALSE);
        }
        startActivity(context, intent);
    }
}
