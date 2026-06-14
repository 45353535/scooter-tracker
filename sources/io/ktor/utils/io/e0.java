package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f82101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Job f82102b;

    public e0(k channel, Job job) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f82101a = channel;
        this.f82102b = job;
    }

    @Override // io.ktor.utils.io.o
    public Job a() {
        return this.f82102b;
    }

    public final k b() {
        return this.f82101a;
    }
}
