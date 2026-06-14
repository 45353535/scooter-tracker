package com.pubmatic.sdk.crashanalytics;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.WorkerThread;
import androidx.work.impl.utils.j;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.y.z.w.s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0007\u0010\u0011J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0007\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBANRReader;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "", "a", "()V", "Landroid/app/ApplicationExitInfo;", "applicationExitInfo", "", "timeStamp", "(Landroid/app/ApplicationExitInfo;J)V", "Ljava/io/InputStream;", "inputStream", "", "(Ljava/io/InputStream;)Ljava/lang/String;", "data", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()J", "(J)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", s.z.f67720z, "Lorg/json/JSONArray;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "crashanalytics_release"}, k = 1, mv = {1, 7, 1})
@WorkerThread
public final class POBANRReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final JSONArray jsonArray;

    public POBANRReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.tag = "POBANRReader";
        this.jsonArray = new JSONArray();
        if (Build.VERSION.SDK_INT >= 30) {
            a();
        } else {
            POBLog.debug("POBANRReader", "Cannot read ANRs as current OS version is below Android 11.", new Object[0]);
        }
    }

    private final void a() {
        long jB = b();
        try {
            Object systemService = this.context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(this.context.getPackageName(), 0, 10);
            Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "activityManager.getHisto…ntext.packageName, 0, 10)");
            Iterator it = historicalProcessExitReasons.iterator();
            long j10 = 0;
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfo = j.a(it.next());
                if (applicationExitInfo.getReason() == 6) {
                    long timestamp = applicationExitInfo.getTimestamp();
                    if (j10 == 0) {
                        j10 = timestamp;
                    }
                    if (jB == 0) {
                        Intrinsics.checkNotNullExpressionValue(applicationExitInfo, "applicationExitInfo");
                        a(applicationExitInfo, timestamp);
                    } else if (timestamp > jB) {
                        Intrinsics.checkNotNullExpressionValue(applicationExitInfo, "applicationExitInfo");
                        a(applicationExitInfo, timestamp);
                    }
                }
            }
            if (j10 != 0) {
                a(j10);
            }
        } catch (Exception e10) {
            POBLog.debug(this.tag, e10.getClass().getName() + " caught while fetching the historical process exit reasons. Message -> " + e10.getMessage() + '.', new Object[0]);
        }
    }

    private final long b() {
        String fromFile = POBCrashAnalyticsUtils.readFromFile(this.context, "pob_anr.json");
        if (fromFile == null) {
            return 0L;
        }
        try {
            return new JSONObject(fromFile).optLong("POBLastSyncedANRTimeStamp", 0L);
        } catch (JSONException e10) {
            POBLog.debug(this.tag, "JSONException caught while reading ANR timestamp from file. Message -> " + e10.getMessage() + '.', new Object[0]);
            return 0L;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    private final void a(ApplicationExitInfo applicationExitInfo, long timeStamp) throws IOException {
        String strA;
        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
        if (traceInputStream == null || (strA = a(a(traceInputStream))) == null || !StringsKt.g0(strA, "com.pubmatic.sdk", false, 2, null)) {
            return;
        }
        this.jsonArray.put(new POBCrashHelper("Application Not Responding", strA, timeStamp).getCrashJson(this.context));
    }

    private final String a(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                } else {
                    Unit unit = Unit.f93236a;
                    uf.c.a(bufferedReader, null);
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
                    return string;
                }
            } finally {
            }
        }
    }

    private final String a(String data) {
        MatchResult matchResultC = Regex.c(new Regex("\"main\" prio=.*?(?=\n\n)", k.f93539i), data, 0, 2, null);
        if (matchResultC != null) {
            return matchResultC.getValue();
        }
        return null;
    }

    private final void a(long timeStamp) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("POBLastSyncedANRTimeStamp", timeStamp);
            Context context = this.context;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
            POBCrashAnalyticsUtils.writeToFile(context, "pob_anr.json", string);
        } catch (JSONException e10) {
            POBLog.error(this.tag, "JSONException caught while putting timestamp in JSON. Message -> " + e10.getMessage() + '.', new Object[0]);
        }
    }
}
