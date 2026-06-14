package com.applovin.shadow.okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "", "", "name", "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "runOnce", "()J", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "queue", "", "initQueue$okhttp", "(Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "Z", "getCancelable", "()Z", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Llh/d;", "setQueue$okhttp", "(Llh/d;)V", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "setNextExecuteNanoTime$okhttp", "(J)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Task {
    private final boolean cancelable;

    @NotNull
    private final String name;
    private long nextExecuteNanoTime;

    @Nullable
    private TaskQueue queue;

    public Task(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.cancelable = z10;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getNextExecuteNanoTime$okhttp, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    @Nullable
    /* JADX INFO: renamed from: getQueue$okhttp, reason: from getter */
    public final TaskQueue getQueue() {
        return this.queue;
    }

    public final void initQueue$okhttp(@NotNull TaskQueue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.queue = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j10) {
        this.nextExecuteNanoTime = j10;
    }

    public final void setQueue$okhttp(@Nullable TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @NotNull
    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
