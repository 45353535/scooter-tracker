package androidx.privacysandbox.ads.adservices.signals;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0097@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl;", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "protectedSignalsManager", "Landroid/adservices/signals/ProtectedSignalsManager;", "(Landroid/adservices/signals/ProtectedSignalsManager;)V", "convertUpdateRequest", "Landroid/adservices/signals/UpdateSignalsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", MRAIDPresenter.UPDATE_SIGNALS, "", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@ExperimentalFeatures.Ext12OptIn
@RequiresExtension(extension = 1000000, version = 12)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {

    @NotNull
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    public ProtectedSignalsManagerImpl(@NotNull android.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
        Intrinsics.checkNotNullParameter(protectedSignalsManager, "protectedSignalsManager");
        this.protectedSignalsManager = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(UpdateSignalsRequest request) {
        e.a();
        android.adservices.signals.UpdateSignalsRequest updateSignalsRequestBuild = d.a(request.getUpdateUri()).build();
        Intrinsics.checkNotNullExpressionValue(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @DoNotInline
    static /* synthetic */ Object updateSignals$suspendImpl(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @DoNotInline
    @Nullable
    public Object updateSignals(@NotNull UpdateSignalsRequest updateSignalsRequest, @NotNull Continuation continuation) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, continuation);
    }
}
