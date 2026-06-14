package com.chartboost.sdk.internal.video.repository.exoplayer;

import android.app.Notification;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.ui.DownloadNotificationHelper;
import f1.rd;
import f1.td;
import f1.y3;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/chartboost/sdk/internal/video/repository/exoplayer/VideoRepositoryDownloadService;", "Lcom/google/android/exoplayer2/offline/DownloadService;", "<init>", "()V", "", "onCreate", "Lcom/google/android/exoplayer2/offline/DownloadManager;", "getDownloadManager", "()Lcom/google/android/exoplayer2/offline/DownloadManager;", "Lcom/google/android/exoplayer2/scheduler/Scheduler;", "getScheduler", "()Lcom/google/android/exoplayer2/scheduler/Scheduler;", "", "Lcom/google/android/exoplayer2/offline/Download;", "downloads", "", "notMetRequirements", "Landroid/app/Notification;", "getForegroundNotification", "(Ljava/util/List;I)Landroid/app/Notification;", "Lf1/y3;", "b", "Lkotlin/Lazy;", "a", "()Lf1/y3;", "exoPlayerDownloadManager", "Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", "downloadNotificationHelper", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class VideoRepositoryDownloadService extends DownloadService {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Lazy exoPlayerDownloadManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public DownloadNotificationHelper downloadNotificationHelper;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f17992f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final y3 invoke() {
            return rd.f70996b.a().d();
        }
    }

    public VideoRepositoryDownloadService() {
        super(0);
        this.exoPlayerDownloadManager = i.a(a.f17992f);
    }

    public final y3 a() {
        return (y3) this.exoPlayerDownloadManager.getValue();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    public DownloadManager getDownloadManager() {
        y3 y3VarA = a();
        y3VarA.a();
        return y3VarA.d();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    public Notification getForegroundNotification(List downloads, int notMetRequirements) {
        Intrinsics.checkNotNullParameter(downloads, "downloads");
        DownloadNotificationHelper downloadNotificationHelper = this.downloadNotificationHelper;
        if (downloadNotificationHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadNotificationHelper");
            downloadNotificationHelper = null;
        }
        Notification notificationBuildProgressNotification = downloadNotificationHelper.buildProgressNotification(this, 0, null, null, CollectionsKt.emptyList(), 0);
        Intrinsics.checkNotNullExpressionValue(notificationBuildProgressNotification, "buildProgressNotification(...)");
        return notificationBuildProgressNotification;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    public Scheduler getScheduler() {
        return td.g(this, 0, 2, null);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService, android.app.Service
    public void onCreate() {
        rd.f70996b.b(this);
        super.onCreate();
        this.downloadNotificationHelper = new DownloadNotificationHelper(this, "chartboost");
    }
}
