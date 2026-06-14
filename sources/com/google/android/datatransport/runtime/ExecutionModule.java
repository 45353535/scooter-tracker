package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Module;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
@Module
abstract class ExecutionModule {
    static Executor a() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
