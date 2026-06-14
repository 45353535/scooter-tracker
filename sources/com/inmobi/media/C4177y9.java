package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4177y9 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f39981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SdkInitializationListener f39983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4177y9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10, Continuation continuation) {
        super(1, continuation);
        this.f39981b = context;
        this.f39982c = str;
        this.f39983d = sdkInitializationListener;
        this.f39984e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C4177y9(this.f39981b, this.f39982c, this.f39983d, this.f39984e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4177y9) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39980a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                Yk.a(this.f39981b);
                Context context = Ji.f37157a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || !file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    } else {
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    }
                }
                eg.h.b(null, new Xk(null), 1, null);
                String primaryAccountId = this.f39982c;
                Intrinsics.checkNotNullParameter(primaryAccountId, "primaryAccountId");
                Context context2 = Ji.f37157a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                    Da.a(context2, "coppa_store").a("im_accid", primaryAccountId, false);
                }
                Context context3 = this.f39981b;
                this.f39980a = 1;
                if (eg.h.b(null, new Wk(context3, null), 1, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            Ji.f37165i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.f39983d, null);
            Og.f37496a.getClass();
            eg.i.d(A9.f36559e, null, null, new Kg(null), 3, null);
            Map mapAccess$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.f39984e);
            Wj wj = Wj.f37959a;
            Wj.b("SdkInitialized", mapAccess$prepareTelemetryPayload, EnumC3585ak.f38215a);
            InMobiUnifiedIdService.push(C3572a7.f38171b);
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue(InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e10.getMessage();
            Ji.f37159c = null;
            Ji.f37157a = null;
            Ji.f37165i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.f39983d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return Unit.f93236a;
    }
}
