package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 5), @RequiresExtension(extension = 31, version = 9)})
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0097@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0097@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0097@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0097@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001cH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001fH\u0097@¢\u0006\u0002\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "mMeasurementManager", "Landroid/adservices/measurement/MeasurementManager;", "(Landroid/adservices/measurement/MeasurementManager;)V", "getMMeasurementManager", "()Landroid/adservices/measurement/MeasurementManager;", "deleteRegistrations", "", "deletionRequest", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMeasurementApiStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSource", "attributionSource", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerTrigger", "trigger", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebSource", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebTrigger", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MeasurementManagerImplCommon extends MeasurementManager {

    @NotNull
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ SourceRegistrationRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(SourceRegistrationRequest sourceRegistrationRequest, MeasurementManagerImplCommon measurementManagerImplCommon, Continuation continuation) {
            super(2, continuation);
            this.$request = sourceRegistrationRequest;
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$request, this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<Uri> registrationUris = this.$request.getRegistrationUris();
            MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            Iterator<T> it = registrationUris.iterator();
            while (it.hasNext()) {
                eg.i.d(coroutineScope, null, null, new MeasurementManagerImplCommon$registerSource$4$1$1(measurementManagerImplCommon, (Uri) it.next(), sourceRegistrationRequest, null), 3, null);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public MeasurementManagerImplCommon(@NotNull android.adservices.measurement.MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    @DoNotInline
    static /* synthetic */ Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    static /* synthetic */ Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    static /* synthetic */ Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new AnonymousClass4(sourceRegistrationRequest, measurementManagerImplCommon, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    static /* synthetic */ Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    static /* synthetic */ Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    static /* synthetic */ Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @DoNotInline
    @Nullable
    public Object deleteRegistrations(@NotNull DeletionRequest deletionRequest, @NotNull Continuation continuation) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, continuation);
    }

    @NotNull
    protected final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object getMeasurementApiStatus(@NotNull Continuation continuation) {
        return getMeasurementApiStatus$suspendImpl(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerSource(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation continuation) {
        return registerSource$suspendImpl(this, uri, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerTrigger(@NotNull Uri uri, @NotNull Continuation continuation) {
        return registerTrigger$suspendImpl(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerWebSource(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest, @NotNull Continuation continuation) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerWebTrigger(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest, @NotNull Continuation continuation) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, continuation);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    static /* synthetic */ Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @Nullable
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object registerSource(@NotNull SourceRegistrationRequest sourceRegistrationRequest, @NotNull Continuation continuation) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, continuation);
    }
}
