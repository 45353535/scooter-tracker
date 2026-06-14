package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    private static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ExecutionModule_ExecutorFactory f24358a = new ExecutionModule_ExecutorFactory();
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.f24358a;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNullFromProvides(ExecutionModule.a());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, kf.a
    public Executor get() {
        return executor();
    }
}
