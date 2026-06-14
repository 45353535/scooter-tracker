package net.pubnative.lite.sdk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.volume.VolumeObserver;

/* JADX INFO: loaded from: classes3.dex */
public class VolumeChangedActionReceiver extends BroadcastReceiver {
    private static VolumeChangedActionReceiver instance;
    private boolean isRegistered = false;

    public static VolumeChangedActionReceiver getInstance() {
        if (instance == null) {
            instance = new VolumeChangedActionReceiver();
        }
        return instance;
    }

    protected void notifyVolumeChange() {
        VolumeObserver.getInstance().notifyObservers();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
            notifyVolumeChange();
        }
    }

    public void register(Context context) {
        if (this.isRegistered) {
            return;
        }
        context.registerReceiver(this, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        this.isRegistered = true;
    }

    public void unregister(Context context) {
        if (this.isRegistered) {
            try {
                context.unregisterReceiver(this);
                this.isRegistered = false;
            } catch (IllegalArgumentException e10) {
                Logger.e("VolumeChangedActionReceiver", e10.toString());
            }
        }
    }
}
