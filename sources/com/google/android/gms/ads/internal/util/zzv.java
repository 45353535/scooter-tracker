package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.j;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzejf;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(26)
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final zzcjw zzb(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z10, @Nullable zzejf zzejfVar) {
        return new zzcla(zzcjlVar, zzbgdVar, z10, zzejfVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final zzbgj.zzq zzf(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        return zzs.zzF(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? zzbgj.zzq.ENUM_TRUE : zzbgj.zzq.ENUM_FALSE : zzbgj.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzg(Context context, String str, String str2) {
        j.a();
        NotificationChannel notificationChannelA = androidx.browser.trusted.g.a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjO)).intValue());
        notificationChannelA.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelA);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzh(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    @Nullable
    public final Intent zzi(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
