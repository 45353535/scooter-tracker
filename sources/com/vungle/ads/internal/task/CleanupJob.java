package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.ironsource.sdk.controller.f;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob;", "Lcom/vungle/ads/internal/task/Job;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "checkIfSdkUpgraded", "", "dropV6Data", "dropV700Data", "dropV730TempData", "dropV742TpatData", "dropV750Data", "onRunJob", "", "bundle", "Landroid/os/Bundle;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", y.f66058y, "vungle-ads_release", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CleanupJob implements Job {

    @NotNull
    private static final String AD_ID_KEY = "AD_ID_KEY";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CleanupJob";

    @NotNull
    private final Context context;

    @NotNull
    private final PathProvider pathProvider;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob$Companion;", "", "()V", CleanupJob.AD_ID_KEY, "", "TAG", "makeJobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", f.b.f45109c, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ JobInfo makeJobInfo$default(Companion companion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return companion.makeJobInfo(str);
        }

        @NotNull
        public final JobInfo makeJobInfo(@Nullable String adId) {
            JobInfo priority = new JobInfo(CleanupJob.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (adId != null) {
                bundle.putString(CleanupJob.AD_ID_KEY, adId);
            }
            return priority.setExtras(bundle).setUpdateCurrent(adId == null);
        }

        private Companion() {
        }
    }

    public CleanupJob(@NotNull Context context, @NotNull PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        Lazy lazyB = i.b(l.f94209b, new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.task.CleanupJob$checkIfSdkUpgraded$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        });
        int i10 = m7560checkIfSdkUpgraded$lambda4(lazyB).getInt("VERSION_CODE", -1);
        if (i10 < 70601) {
            if (i10 < 70000) {
                dropV6Data();
            }
            if (i10 < 70100) {
                dropV700Data();
            }
            if (i10 < 70301) {
                dropV730TempData();
            }
            if (i10 < 70500) {
                dropV742TpatData();
            }
            if (i10 < 70600) {
                dropV750Data();
            }
            m7560checkIfSdkUpgraded$lambda4(lazyB).put("VERSION_CODE", BuildConfig.VERSION_CODE).apply();
        }
    }

    /* JADX INFO: renamed from: checkIfSdkUpgraded$lambda-4, reason: not valid java name */
    private static final FilePreferences m7560checkIfSdkUpgraded$lambda4(Lazy lazy) {
        return (FilePreferences) lazy.getValue();
    }

    private final void dropV6Data() {
        Logger.INSTANCE.d(TAG, "CleanupJob: drop old files data");
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            FileUtility.delete$default(file, null, 2, null);
            FileUtility.delete$default(new File(file.getPath() + "-journal"), null, 2, null);
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sp = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String string = sp.getString("cache_path", null);
        if (Build.VERSION.SDK_INT >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            Intrinsics.checkNotNullExpressionValue(sp, "sp");
            SharedPreferences.Editor editor = sp.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.clear();
            editor.apply();
        }
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        FileUtility.delete$default(new File(noBackupFilesDir, "vungle_settings"), null, 2, null);
        if (string != null) {
            FileUtility.delete$default(new File(string), null, 2, null);
        }
    }

    private final void dropV700Data() {
        FileUtility.delete$default(new File(this.context.getApplicationInfo().dataDir, "vungle"), null, 2, null);
    }

    private final void dropV730TempData() {
        try {
            FileUtility.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"), null, 2, null);
            FileUtility.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"), null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to delete temp data", e10);
        }
    }

    private final void dropV742TpatData() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            FileUtility.delete$default(new File(noBackupFilesDir, "failedTpats"), null, 2, null);
            FileUtility.delete$default(new File(noBackupFilesDir, "failedGenericTpats"), null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to delete 742 tpat data", e10);
        }
    }

    private final void dropV750Data() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            FileUtility.delete$default(new File(noBackupFilesDir, "vungle_cache/downloads"), null, 2, null);
            FileUtility.delete$default(new File(noBackupFilesDir, "vungle_cache/js"), null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to delete 750 data", e10);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(@NotNull Bundle bundle, @NotNull JobRunner jobRunner) {
        File downloadsDirForAd;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        File vmDir = this.pathProvider.getVmDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = vmDir;
        }
        Logger.INSTANCE.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!Intrinsics.areEqual(downloadsDirForAd, vmDir)) {
                FileUtility.delete$default(downloadsDirForAd, null, 2, null);
                return 0;
            }
            checkIfSdkUpgraded();
            FileUtility.deleteContents(downloadsDirForAd, SetsKt.setOf((Object[]) new String[]{Constants.OM_SDK_JS, Constants.OM_SESSION_JS}));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
