package io.bidmachine;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/bidmachine/BidMachineSharedPreferenceKt;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "obtainBMIFV", "(Landroid/content/Context;)Ljava/lang/String;", "", "hasBMIFV", "(Landroid/content/Context;)Z", "", "sdkInstallTime", "", "setSdkInstallTime", "(Landroid/content/Context;J)V", "getSdkInstallTime", "(Landroid/content/Context;)J", "Lk9/f;", "versionMilestone", "setCurrentVersionMilestone", "(Landroid/content/Context;Lk9/f;)V", "getCurrentVersionMilestone", "(Landroid/content/Context;)Lk9/f;", "", "historyVersionMilestoneList", "setHistoryVersionMilestoneList", "(Landroid/content/Context;Ljava/util/List;)V", "getHistoryVersionMilestoneList", "(Landroid/content/Context;)Ljava/util/List;", "clear", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BidMachineSharedPreferenceKt {

    @NotNull
    public static final BidMachineSharedPreferenceKt INSTANCE = new BidMachineSharedPreferenceKt();

    private BidMachineSharedPreferenceKt() {
    }

    @VisibleForTesting
    public final /* synthetic */ void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n2.c(context);
    }

    public final /* synthetic */ k9.f getCurrentVersionMilestone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n2.f(context);
    }

    public final /* synthetic */ List getHistoryVersionMilestoneList(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List listG = n2.g(context);
        Intrinsics.checkNotNullExpressionValue(listG, "getHistoryVersionMilestoneList(context)");
        return listG;
    }

    public final /* synthetic */ long getSdkInstallTime(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n2.s(context);
    }

    public final /* synthetic */ boolean hasBMIFV(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n2.y(context);
    }

    public final /* synthetic */ String obtainBMIFV(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strB = n2.B(context);
        Intrinsics.checkNotNullExpressionValue(strB, "obtainBMIFV(context)");
        return strB;
    }

    public final /* synthetic */ void setCurrentVersionMilestone(Context context, k9.f versionMilestone) {
        Intrinsics.checkNotNullParameter(context, "context");
        n2.F(context, versionMilestone);
    }

    public final /* synthetic */ void setHistoryVersionMilestoneList(Context context, List historyVersionMilestoneList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(historyVersionMilestoneList, "historyVersionMilestoneList");
        n2.G(context, historyVersionMilestoneList);
    }

    public final /* synthetic */ void setSdkInstallTime(Context context, long sdkInstallTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        n2.J(context, sdkInstallTime);
    }
}
