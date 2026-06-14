package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes7.dex */
public class AlarmManagerScheduler implements WorkScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventStore f24460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlarmManager f24461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SchedulerConfig f24462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Clock f24463e;

    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) {
        this(context, eventStore, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), clock, schedulerConfig);
    }

    boolean a(Intent intent) {
        return PendingIntent.getBroadcast(this.f24459a, 0, intent, 603979776) != null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10) {
        schedule(transportContext, i10, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.getBackendName());
        builder.appendQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, String.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        if (transportContext.getExtras() != null) {
            builder.appendQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(transportContext.getExtras(), 0));
        }
        Intent intent = new Intent(this.f24459a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && a(intent)) {
            Logging.d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f24460b.getNextCallTime(transportContext);
        long scheduleDelay = this.f24462d.getScheduleDelay(transportContext.getPriority(), nextCallTime, i10);
        Logging.d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i10));
        this.f24461c.set(3, this.f24463e.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.f24459a, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }

    AlarmManagerScheduler(Context context, EventStore eventStore, AlarmManager alarmManager, Clock clock, SchedulerConfig schedulerConfig) {
        this.f24459a = context;
        this.f24460b = eventStore;
        this.f24461c = alarmManager;
        this.f24463e = clock;
        this.f24462d = schedulerConfig;
    }
}
