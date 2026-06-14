package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    private static final String TAG = Logger.tagWithPrefix("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    @RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    @RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
        }

        static void startForeground(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e11);
            }
        }
    }

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    @MainThread
    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void cancelNotification(int i10) {
        this.mNotificationManager.cancel(i10);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @MainThread
    public void notify(int i10, Notification notification) {
        this.mNotificationManager.notify(i10, notification);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent, i11);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.onTimeout(i10, 2048);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void startForeground(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            Api31Impl.startForeground(this, i10, notification, i11);
        } else if (i12 >= 29) {
            Api29Impl.startForeground(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void stop(int i10) {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf(i10);
    }

    public void onTimeout(int i10, int i11) {
        this.mDispatcher.onTimeout(i10, i11);
    }
}
