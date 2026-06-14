package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.android.billingclient.api.PendingPurchasesParams;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "pendingPurchasesParamsInternalInstance", "", "(Ljava/lang/Object;)V", "getClassName", "", "getInternalClass", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PendingPurchasesParamsBridge extends GenericBridge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NEW_BUILDER_METHOD_NAME = "newBuilder";

    @Nullable
    private final Object pendingPurchasesParamsInternalInstance;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBridge$Companion;", "", "()V", "NEW_BUILDER_METHOD_NAME", "", "callNonVoidStaticMethod", "methodName", "getClassForParams", "Ljava/lang/Class;", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBuilderBridge;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object callNonVoidStaticMethod(String methodName) throws IllegalAccessException, InvocationTargetException {
            Object objInvoke = getClassForParams().getMethod(methodName, null).invoke(null, null);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException("Static method " + methodName + " returned null");
        }

        @NotNull
        public final Class<?> getClassForParams() {
            Intrinsics.checkNotNullExpressionValue(PendingPurchasesParams.class, "forName(\"com.android.bil….PendingPurchasesParams\")");
            return PendingPurchasesParams.class;
        }

        @NotNull
        public final PendingPurchasesParamsBuilderBridge newBuilder() {
            return new PendingPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public PendingPurchasesParamsBridge(@Nullable Object obj) {
        super(MapsKt.hashMapOf(TuplesKt.to("newBuilder", new Class[0])));
        this.pendingPurchasesParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    protected String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams";
    }

    @Nullable
    /* JADX INFO: renamed from: getInternalClass, reason: from getter */
    public final Object getPendingPurchasesParamsInternalInstance() {
        return this.pendingPurchasesParamsInternalInstance;
    }
}
