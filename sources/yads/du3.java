package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class du3 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            int i10 = 1;
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                } else {
                    i10 = 2;
                }
            }
            fu3.f110933a = i10;
        }
    }
}
