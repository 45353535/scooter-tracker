package io.bidmachine.rendering.ad.fullscreen;

import android.os.Bundle;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import gc.m;
import io.bidmachine.rendering.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pd.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/bidmachine/rendering/ad/fullscreen/FullScreenActivity;", "Lio/bidmachine/rendering/internal/a;", "<init>", "()V", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lgc/m;", "b", "Lgc/m;", "fullScreenAd", "bidmachine-android-sdk_bi_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FullScreenActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private m fullScreenAd;

    private final void e() {
        d0.e(this);
        m mVar = this.fullScreenAd;
        if (mVar != null) {
            mVar.V();
        }
        this.fullScreenAd = null;
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m mVar = gc.a.f72719a;
        this.fullScreenAd = mVar;
        if (mVar == null) {
            e();
        } else {
            mVar.Z(this);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        if (Intrinsics.areEqual(gc.a.f72719a, this.fullScreenAd)) {
            gc.a.f72719a = null;
        }
        e();
    }
}
