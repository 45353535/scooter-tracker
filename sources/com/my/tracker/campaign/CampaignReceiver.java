package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.my.tracker.obfuscated.x2;

/* JADX INFO: loaded from: classes11.dex */
public class CampaignReceiver extends BroadcastReceiver {
    static void a(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString(Constants.REFERRER);
        if (TextUtils.isEmpty(string)) {
            x2.a("CampaignReceiver: referrer is null or empty");
            return;
        }
        x2.a("CampaignReceiver: got referrer " + string);
        try {
            context.startService(new Intent(context, (Class<?>) CampaignService.class).putExtra(Constants.REFERRER, string));
        } catch (Throwable th2) {
            x2.b("CampaignReceiver error: " + th2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        a(context, intent);
    }
}
