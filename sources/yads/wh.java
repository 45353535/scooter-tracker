package yads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f117454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f117455b = lf.i.a(new rh(this));

    public wh(Context context) {
        this.f117454a = context;
    }

    public static final ef a(wh whVar, ApplicationExitInfo applicationExitInfo) {
        whVar.getClass();
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                    try {
                        String strI = uf.r.i(bufferedReader);
                        uf.c.a(bufferedReader, null);
                        uf.c.a(traceInputStream, null);
                        if (strI != null) {
                            long timestamp = applicationExitInfo.getTimestamp();
                            String description = applicationExitInfo.getDescription();
                            if (description == null) {
                                description = "ANR";
                            }
                            String str = description;
                            int importance = applicationExitInfo.getImportance();
                            int pid = applicationExitInfo.getPid();
                            long pss = applicationExitInfo.getPss();
                            long rss = applicationExitInfo.getRss();
                            String processName = applicationExitInfo.getProcessName();
                            applicationExitInfo.getReason();
                            return new ef(timestamp, str, strI, importance, pid, pss, rss, processName, applicationExitInfo.getStatus(), applicationExitInfo.getRealUid());
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final List a(int i10, int i11, long j10) {
        ActivityManager activityManager = (ActivityManager) this.f117455b.getValue();
        if (activityManager != null) {
            return kotlin.sequences.k.c0(kotlin.sequences.k.R(kotlin.sequences.k.E(kotlin.sequences.k.E(kotlin.sequences.k.E(CollectionsKt.asSequence(activityManager.getHistoricalProcessExitReasons(this.f117454a.getPackageName(), 0, i10)), sh.f115793b), new th(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i11))), new uh(j10)), new vh(this)));
        }
        return CollectionsKt.emptyList();
    }
}
