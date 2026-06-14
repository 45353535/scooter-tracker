package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/crashlytics/internal/ProcessDetailsProvider;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$ProcessDetails;", "getAppProcessDetails", "(Landroid/content/Context;)Ljava/util/List;", "getCurrentProcessDetails", "(Landroid/content/Context;)Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$ProcessDetails;", "processName", "", "pid", "importance", "", "isDefaultProcess", "buildProcessDetails", "(Ljava/lang/String;IIZ)Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$ProcessDetails;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDetailsProvider {

    @NotNull
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final String a() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            return (i10 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        Intrinsics.checkNotNull(strMyProcessName);
        return strMyProcessName;
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i10, i11, z10);
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, 0, 0, false, 14, null);
    }

    @NotNull
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(@NotNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> listEmptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listEmptyList = activityManager.getRunningAppProcesses()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(listEmptyList);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(Intrinsics.areEqual(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList2;
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, a(), iMyPid, 0, false, 12, null) : processDetails;
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i10, 0, false, 12, null);
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int i10, int i11) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i10, i11, false, 8, null);
    }

    @NotNull
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(@NotNull String processName, int pid, int importance, boolean isDefaultProcess) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsBuild = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(processName).setPid(pid).setImportance(importance).setDefaultProcess(isDefaultProcess).build();
        Intrinsics.checkNotNullExpressionValue(processDetailsBuild, "build(...)");
        return processDetailsBuild;
    }
}
