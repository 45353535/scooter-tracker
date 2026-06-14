package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f82166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Job f82167b;

    public h0(e channel, Job job) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f82166a = channel;
        this.f82167b = job;
    }

    @Override // io.ktor.utils.io.o
    public Job a() {
        return this.f82167b;
    }

    public final e b() {
        return this.f82166a;
    }
}
