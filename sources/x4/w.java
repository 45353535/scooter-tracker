package x4;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.ktwapps.speedometer.LocationService;
import com.ktwapps.speedometer.MainActivity;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    NotificationCompat.Builder f108150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    NotificationManager f108151b;

    public w(Context context) {
        this.f108151b = (NotificationManager) context.getSystemService("notification");
    }

    public NotificationCompat.Builder a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f108151b.getNotificationChannel("speedometer_chanel_01") == null) {
            androidx.media3.common.util.j.a();
            NotificationChannel notificationChannelA = androidx.browser.trusted.g.a("speedometer_chanel_01", context.getResources().getString(R.string.notification_title), 4);
            notificationChannelA.setSound(null, null);
            this.f108151b.createNotificationChannel(notificationChannelA);
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        PendingIntent service = PendingIntent.getService(context, 0, new Intent(context, (Class<?>) LocationService.class).setAction("com.ktwapps.speedometer.ACTION_STOP"), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        return new NotificationCompat.Builder(context, "speedometer_chanel_01").setContentTitle(context.getResources().getString(R.string.notification_title)).setContentText(str).setOngoing(true).setSound(null).setSmallIcon(R.drawable.ic_notification).setOnlyAlertOnce(true).setForegroundServiceBehavior(1).setContentIntent(activity).setPriority(1).addAction(0, HtmlCompat.fromHtml("<font color=\"" + ContextCompat.getColor(context, R.color.colorAccent) + "\">" + context.getString(R.string.stop) + "</font>", 0), service);
    }

    public Notification b(Context context, String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = context.getString(R.string.pause);
        }
        sb2.append(str);
        sb2.append(" • ");
        sb2.append(str2);
        String string = sb2.toString();
        NotificationCompat.Builder builder = this.f108150a;
        if (builder == null) {
            this.f108150a = a(context, string);
        } else {
            builder.setContentText(string);
        }
        return this.f108150a.build();
    }

    public void c(Context context, String str, String str2, boolean z10) {
        this.f108151b.notify(20191031, b(context, str, str2, z10));
    }
}
