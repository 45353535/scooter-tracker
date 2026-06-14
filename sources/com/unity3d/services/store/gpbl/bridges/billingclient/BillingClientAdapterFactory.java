package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0002J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapterFactory;", "", "()V", "createBillingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "createV6Adapter", "fallbackVersion", "", "createV8Adapter", "Lkotlin/Result;", "createV8Adapter-IoAF18A", "(Landroid/content/Context;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int fallbackVersion) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            BillingClientBuilderBridge builder = BillingClientBridge.newBuilder(context);
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            objB = Result.b(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, fallbackVersion));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (BillingClientAdapter) objB;
    }

    static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i10);
    }

    /* JADX INFO: renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m7484createV8AdapterIoAF18A(Context context) {
        try {
            Result.Companion companion = Result.f93230c;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.INSTANCE.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return Result.b(billingClientAdapter);
            }
            throw new FallbackException(7);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(d.a(th2));
        }
    }

    @Nullable
    public final BillingClientAdapter createBillingClientAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object objM7484createV8AdapterIoAF18A = m7484createV8AdapterIoAF18A(context);
        Throwable thG = Result.g(objM7484createV8AdapterIoAF18A);
        if (thG != null) {
            objM7484createV8AdapterIoAF18A = thG instanceof FallbackException ? createV6Adapter(context, ((FallbackException) thG).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) objM7484createV8AdapterIoAF18A;
    }
}
