package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/task/ResendTpatJob;", "Lcom/vungle/ads/internal/task/Job;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "onRunJob", "", "bundle", "Landroid/os/Bundle;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", y.f66058y, "vungle-ads_release", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ResendTpatJob implements Job {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ResendTpatJob";

    @NotNull
    private final Context context;

    @NotNull
    private final PathProvider pathProvider;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/task/ResendTpatJob$Companion;", "", "()V", "TAG", "", "makeJobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JobInfo makeJobInfo() {
            return new JobInfo(ResendTpatJob.TAG).setPriority(0).setUpdateCurrent(true);
        }

        private Companion() {
        }
    }

    public ResendTpatJob(@NotNull Context context, @NotNull PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* JADX INFO: renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final TpatSender m7561onRunJob$lambda0(Lazy lazy) {
        return (TpatSender) lazy.getValue();
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
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        m7561onRunJob$lambda0(i.b(l.f94209b, new Function0<TpatSender>() { // from class: com.vungle.ads.internal.task.ResendTpatJob$onRunJob$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        })).resendStoredTpats$vungle_ads_release();
        return 0;
    }
}
