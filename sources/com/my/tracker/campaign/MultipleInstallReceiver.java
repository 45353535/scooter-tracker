package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.x2;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class MultipleInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61224a = CampaignReceiver.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f61225b = MultipleInstallReceiver.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f61226c = new AtomicBoolean();

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            return;
        }
        if (!f61226c.compareAndSet(false, true)) {
            x2.a("MultipleInstallReceiver: attempt to call, but it was called before");
            return;
        }
        x2.a("MultipleInstallReceiver called");
        CampaignReceiver.a(context, intent);
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                String str = activityInfo.name;
                if (!f61224a.equals(str) && !f61225b.equals(str)) {
                    x2.a("MultipleInstallReceiver: trigger onReceive class " + str);
                    try {
                        ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                    } catch (Throwable th2) {
                        x2.a("MultipleInstallReceiver: error in BroadcastReceiver " + str + " : " + th2.getMessage());
                    }
                }
            }
        }
    }
}
