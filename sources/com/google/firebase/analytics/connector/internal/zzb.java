package com.google.firebase.analytics.connector.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class zzb implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ zzb f31742a = new zzb();

    private /* synthetic */ zzb() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final /* synthetic */ Object create(ComponentContainer componentContainer) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(componentContainer);
    }
}
