package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.core.os.OutcomeReceiverKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
final class MeasurementManagerImplCommon$registerSource$4$1$1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ SourceRegistrationRequest $request;
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MeasurementManagerImplCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeasurementManagerImplCommon$registerSource$4$1$1(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, SourceRegistrationRequest sourceRegistrationRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = measurementManagerImplCommon;
        this.$uri = uri;
        this.$request = sourceRegistrationRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new MeasurementManagerImplCommon$registerSource$4$1$1(this.this$0, this.$uri, this.$request, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            Uri uri = this.$uri;
            SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            this.L$0 = measurementManagerImplCommon;
            this.L$1 = uri;
            this.L$2 = sourceRegistrationRequest;
            this.label = 1;
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
            eVar.I();
            measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, sourceRegistrationRequest.getInputEvent(), new androidx.media3.exoplayer.hls.offline.a(), OutcomeReceiverKt.asOutcomeReceiver(eVar));
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(this);
            }
            if (objC == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MeasurementManagerImplCommon$registerSource$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
