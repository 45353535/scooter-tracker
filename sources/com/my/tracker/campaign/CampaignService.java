package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.p0;
import com.my.tracker.obfuscated.x2;

/* JADX INFO: loaded from: classes11.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        x2.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        x2.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        final Runnable runnable = new Runnable() { // from class: com.my.tracker.campaign.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f61227b.stopSelf();
            }
        };
        if (intent != null) {
            final String stringExtra = intent.getStringExtra(Constants.REFERRER);
            if (!TextUtils.isEmpty(stringExtra)) {
                m.a(new Runnable() { // from class: com.my.tracker.campaign.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61228b.a(stringExtra, runnable);
                    }
                });
                return super.onStartCommand(null, i10, i11);
            }
        }
        m.a(runnable);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        p0.a(str, this, runnable);
    }
}
