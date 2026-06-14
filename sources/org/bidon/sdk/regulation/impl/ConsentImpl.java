package org.bidon.sdk.regulation.impl;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.v0;
import lf.i;
import lf.m;
import org.bidon.sdk.regulation.Consent;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/regulation/impl/ConsentImpl;", "Lorg/bidon/sdk/regulation/Consent;", "<init>", "()V", "regulation", "Lorg/bidon/sdk/regulation/Regulation;", "getRegulation", "()Lorg/bidon/sdk/regulation/Regulation;", "regulation$delegate", "Lkotlin/Lazy;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentImpl implements Consent {

    /* JADX INFO: renamed from: regulation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy regulation = i.a(new Function0() { // from class: org.bidon.sdk.regulation.impl.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ConsentImpl.regulation_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regulation regulation_delegate$lambda$0() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(Regulation.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (Regulation) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.Regulation");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (Regulation) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.regulation.Regulation");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + Regulation.class).toString());
    }

    @Override // org.bidon.sdk.regulation.Consent
    @NotNull
    public Regulation getRegulation() {
        return (Regulation) this.regulation.getValue();
    }
}
