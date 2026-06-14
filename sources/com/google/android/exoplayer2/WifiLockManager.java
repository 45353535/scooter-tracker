package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes7.dex */
final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;

    @Nullable
    private WifiManager.WifiLock wifiLock;

    @Nullable
    private final WifiManager wifiManager;

    public WifiLockManager(Context context) {
        this.wifiManager = (WifiManager) context.getApplicationContext().getSystemService(X3.f42018b);
    }

    private void updateWifiLock() {
        WifiManager.WifiLock wifiLock = this.wifiLock;
        if (wifiLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setEnabled(boolean z10) {
        if (z10 && this.wifiLock == null) {
            WifiManager wifiManager = this.wifiManager;
            if (wifiManager == null) {
                Log.w(TAG, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, WIFI_LOCK_TAG);
                this.wifiLock = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.enabled = z10;
        updateWifiLock();
    }

    public void setStayAwake(boolean z10) {
        this.stayAwake = z10;
        updateWifiLock();
    }
}
