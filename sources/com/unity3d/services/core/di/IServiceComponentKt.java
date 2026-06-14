package com.unity3d.services.core.di;

import com.ironsource.C4240b4;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.v0;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lcom/unity3d/services/core/di/IServiceComponent;", "", "named", "get", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "Llf/l;", C4240b4.a.f42515t, "Lkotlin/Lazy;", "inject", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;Llf/l;)Lkotlin/Lazy;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IServiceComponentKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            IServiceComponent iServiceComponent = this.$this_inject;
            String str = this.$named;
            IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) registry.getService(str, v0.b(Object.class));
        }
    }

    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String named) {
        Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        Intrinsics.checkNotNullParameter(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) registry.getService(named, v0.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        Intrinsics.checkNotNullParameter(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        Intrinsics.reifiedOperationMarker(4, "T");
        return registry.getService(named, v0.b(Object.class));
    }

    public static final /* synthetic */ <T> Lazy inject(IServiceComponent iServiceComponent, String named, l mode) {
        Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return i.b(mode, new AnonymousClass1(iServiceComponent, named));
    }

    public static /* synthetic */ Lazy inject$default(IServiceComponent iServiceComponent, String named, l mode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        if ((i10 & 2) != 0) {
            mode = l.f94211d;
        }
        Intrinsics.checkNotNullParameter(iServiceComponent, "<this>");
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return i.b(mode, new AnonymousClass1(iServiceComponent, named));
    }
}
