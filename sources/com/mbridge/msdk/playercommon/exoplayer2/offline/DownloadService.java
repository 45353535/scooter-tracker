package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.Requirements;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.Scheduler;
import com.mbridge.msdk.playercommon.exoplayer2.util.NotificationUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD = "com.google.android.exoplayer.downloadService.action.ADD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    private static final String ACTION_START_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS";
    private static final String ACTION_STOP_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS";
    private static final boolean DEBUG = false;
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final String KEY_DOWNLOAD_ACTION = "download_action";
    public static final String KEY_FOREGROUND = "foreground";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, RequirementsHelper> requirementsHelpers = new HashMap<>();

    @Nullable
    private final String channelId;

    @StringRes
    private final int channelName;
    private DownloadManager downloadManager;
    private DownloadManagerListener downloadManagerListener;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    private final class DownloadManagerListener implements DownloadManager.Listener {
        private DownloadManagerListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService.this.stop();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
            DownloadService.this.maybeStartWatchingRequirements();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public void onTaskStateChanged(DownloadManager downloadManager, DownloadManager.TaskState taskState) {
            DownloadService.this.onTaskStateChanged(taskState);
            if (taskState.state == 1) {
                DownloadService.this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                DownloadService.this.foregroundNotificationUpdater.update();
            }
        }
    }

    private final class ForegroundNotificationUpdater implements Runnable {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i10, long j10) {
            this.notificationId = i10;
            this.updateInterval = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            update();
        }

        public void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }

        public void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacks(this);
        }

        public void update() {
            DownloadManager.TaskState[] allTaskStates = DownloadService.this.downloadManager.getAllTaskStates();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.notificationId, downloadService.getForegroundNotification(allTaskStates));
            this.notificationDisplayed = true;
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacks(this);
                this.handler.postDelayed(this, this.updateInterval);
            }
        }
    }

    private static final class RequirementsHelper implements RequirementsWatcher.Listener {
        private final Context context;
        private final Requirements requirements;
        private final RequirementsWatcher requirementsWatcher;

        @Nullable
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        private void startServiceWithAction(String str) {
            Util.startForegroundService(this.context, new Intent(this.context, this.serviceClass).setAction(str).putExtra("foreground", true));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher.Listener
        public void requirementsMet(RequirementsWatcher requirementsWatcher) {
            startServiceWithAction(DownloadService.ACTION_START_DOWNLOADS);
            Scheduler scheduler = this.scheduler;
            if (scheduler != null) {
                scheduler.cancel();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher.Listener
        public void requirementsNotMet(RequirementsWatcher requirementsWatcher) {
            startServiceWithAction(DownloadService.ACTION_STOP_DOWNLOADS);
            if (this.scheduler != null) {
                String strI = c.n().i();
                if (TextUtils.isEmpty(strI)) {
                    strI = this.context.getPackageName();
                }
                if (this.scheduler.schedule(this.requirements, strI, DownloadService.ACTION_RESTART)) {
                    return;
                }
                Log.e(DownloadService.TAG, "Scheduling downloads failed.");
            }
        }

        public void start() {
            this.requirementsWatcher.start();
        }

        public void stop() {
            this.requirementsWatcher.stop();
            Scheduler scheduler = this.scheduler;
            if (scheduler != null) {
                scheduler.cancel();
            }
        }

        private RequirementsHelper(Context context, Requirements requirements, @Nullable Scheduler scheduler, Class<? extends DownloadService> cls) {
            this.context = context;
            this.requirements = requirements;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            this.requirementsWatcher = new RequirementsWatcher(context, this, requirements);
        }
    }

    protected DownloadService(int i10) {
        this(i10, 1000L);
    }

    public static Intent buildAddActionIntent(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z10) {
        return new Intent(context, cls).setAction(ACTION_ADD).putExtra(KEY_DOWNLOAD_ACTION, downloadAction.toByteArray()).putExtra("foreground", z10);
    }

    private void logd(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartWatchingRequirements() {
        if (this.downloadManager.getDownloadCount() != 0) {
            Class<?> cls = getClass();
            HashMap<Class<? extends DownloadService>, RequirementsHelper> map = requirementsHelpers;
            if (map.get(cls) == null) {
                RequirementsHelper requirementsHelper = new RequirementsHelper(this, getRequirements(), getScheduler(), cls);
                map.put((Class<? extends DownloadService>) cls, requirementsHelper);
                requirementsHelper.start();
                logd("started watching requirements");
            }
        }
    }

    private void maybeStopWatchingRequirements() {
        RequirementsHelper requirementsHelperRemove;
        if (this.downloadManager.getDownloadCount() <= 0 && (requirementsHelperRemove = requirementsHelpers.remove(getClass())) != null) {
            requirementsHelperRemove.stop();
            logd("stopped watching requirements");
        }
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(new Intent(context, cls).setAction("com.google.android.exoplayer.downloadService.action.INIT"));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.startForegroundService(context, new Intent(context, cls).setAction("com.google.android.exoplayer.downloadService.action.INIT").putExtra("foreground", true));
    }

    public static void startWithAction(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z10) {
        Intent intentBuildAddActionIntent = buildAddActionIntent(context, cls, downloadAction, z10);
        if (z10) {
            Util.startForegroundService(context, intentBuildAddActionIntent);
        } else {
            context.startService(intentBuildAddActionIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        this.foregroundNotificationUpdater.stopPeriodicUpdates();
        if (this.startedInForeground && Util.SDK_INT >= 26) {
            this.foregroundNotificationUpdater.showNotificationIfNotAlready();
        }
        if (Util.SDK_INT < 28 && this.taskRemoved) {
            stopSelf();
            logd("stopSelf()");
            return;
        }
        logd("stopSelf(" + this.lastStartId + ") result: " + stopSelfResult(this.lastStartId));
    }

    protected abstract DownloadManager getDownloadManager();

    protected abstract Notification getForegroundNotification(DownloadManager.TaskState[] taskStateArr);

    protected Requirements getRequirements() {
        return new Requirements(1, false, false);
    }

    @Nullable
    protected abstract Scheduler getScheduler();

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        logd("onCreate");
        String str = this.channelId;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.channelName, 2);
        }
        this.downloadManager = getDownloadManager();
        DownloadManagerListener downloadManagerListener = new DownloadManagerListener();
        this.downloadManagerListener = downloadManagerListener;
        this.downloadManager.addListener(downloadManagerListener);
    }

    @Override // android.app.Service
    public void onDestroy() {
        logd("onDestroy");
        this.foregroundNotificationUpdater.stopPeriodicUpdates();
        this.downloadManager.removeListener(this.downloadManagerListener);
        maybeStopWatchingRequirements();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        this.lastStartId = i11;
        this.taskRemoved = false;
        if (intent != null) {
            action = intent.getAction();
            this.startedInForeground |= intent.getBooleanExtra("foreground", false) || ACTION_RESTART.equals(action);
        } else {
            action = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        logd("onStartCommand action: " + action + " startId: " + i11);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.ADD":
                byte[] byteArrayExtra = intent.getByteArrayExtra(KEY_DOWNLOAD_ACTION);
                if (byteArrayExtra == null) {
                    Log.e(TAG, "Ignoring ADD action with no action data");
                    break;
                } else {
                    try {
                        this.downloadManager.handleAction(byteArrayExtra);
                    } catch (IOException e10) {
                        Log.e(TAG, "Failed to handle ADD action", e10);
                    }
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS":
                this.downloadManager.startDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS":
                this.downloadManager.stopDownloads();
                break;
            default:
                Log.e(TAG, "Ignoring unrecognized action: " + action);
                break;
        }
        maybeStartWatchingRequirements();
        if (this.downloadManager.isIdle()) {
            stop();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        logd("onTaskRemoved rootIntent: " + intent);
        this.taskRemoved = true;
    }

    protected void onTaskStateChanged(DownloadManager.TaskState taskState) {
    }

    protected DownloadService(int i10, long j10) {
        this(i10, j10, null, 0);
    }

    protected DownloadService(int i10, long j10, @Nullable String str, @StringRes int i11) {
        this.foregroundNotificationUpdater = new ForegroundNotificationUpdater(i10, j10);
        this.channelId = str;
        this.channelName = i11;
    }
}
