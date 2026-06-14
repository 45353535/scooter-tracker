package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.browser.trusted.g;
import androidx.media3.common.util.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"InlinedApi"})
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, @StringRes int i10, int i11) {
        if (Util.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            j.a();
            notificationManager.createNotificationChannel(g.a(str, context.getString(i10), i11));
        }
    }

    public static void setNotification(Context context, int i10, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
