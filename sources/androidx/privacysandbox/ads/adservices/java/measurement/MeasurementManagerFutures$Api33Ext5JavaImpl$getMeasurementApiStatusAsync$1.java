package androidx.privacysandbox.ads.adservices.java.measurement;

import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
final class MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ MeasurementManagerFutures.Api33Ext5JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(MeasurementManagerFutures.Api33Ext5JavaImpl api33Ext5JavaImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = api33Ext5JavaImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        MeasurementManager measurementManager = this.this$0.mMeasurementManager;
        this.label = 1;
        Object measurementApiStatus = measurementManager.getMeasurementApiStatus(this);
        return measurementApiStatus == objG ? objG : measurementApiStatus;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
