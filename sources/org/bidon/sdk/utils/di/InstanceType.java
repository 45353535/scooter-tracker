package org.bidon.sdk.utils.di;

import com.ironsource.C4424m2;
import com.unity3d.services.core.fid.Constants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.di.InstanceType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/utils/di/InstanceType;", "T", "", "Factory", "ParamFactory", "Singleton", "Lorg/bidon/sdk/utils/di/InstanceType$Factory;", "Lorg/bidon/sdk/utils/di/InstanceType$ParamFactory;", "Lorg/bidon/sdk/utils/di/InstanceType$Singleton;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InstanceType<T> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\r\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/bidon/sdk/utils/di/InstanceType$Factory;", "T", "Lorg/bidon/sdk/utils/di/InstanceType;", "build", "()Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory<T> extends InstanceType<T> {
        T build();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\bJ!\u0010\u0003\u001a\u00028\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/utils/di/InstanceType$ParamFactory;", "T", "Lorg/bidon/sdk/utils/di/InstanceType;", "build", "params", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "Params", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ParamFactory<T> extends InstanceType<T> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001¢\u0006\u0002\u0010\fR0\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/utils/di/InstanceType$ParamFactory$Params;", "", "<init>", "()V", "value", "", "parameters", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "params", "", "([Ljava/lang/Object;)V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Params {

            @NotNull
            private Object[] parameters = new Object[0];

            @NotNull
            public final Object[] getParameters() {
                return this.parameters;
            }

            public final void params(@NotNull Object... parameters) {
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                this.parameters = parameters;
            }
        }

        T build(@NotNull Object... params);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00028\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/utils/di/InstanceType$Singleton;", "T", "Lorg/bidon/sdk/utils/di/InstanceType;", "factory", "Lorg/bidon/sdk/utils/di/InstanceType$Factory;", "<init>", "(Lorg/bidon/sdk/utils/di/InstanceType$Factory;)V", C4424m2.f43617p, Constants.GET_INSTANCE, "()Ljava/lang/Object;", "instance$delegate", "Lkotlin/Lazy;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Singleton<T> implements InstanceType<T> {

        @NotNull
        private final Factory<T> factory;

        /* JADX INFO: renamed from: instance$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy instance;

        public Singleton(@NotNull Factory<T> factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            this.factory = factory;
            this.instance = lf.i.a(new Function0() { // from class: org.bidon.sdk.utils.di.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InstanceType.Singleton.instance_delegate$lambda$0(this.f97650b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object instance_delegate$lambda$0(Singleton singleton) {
            return singleton.factory.build();
        }

        public final T getInstance() {
            return (T) this.instance.getValue();
        }
    }
}
