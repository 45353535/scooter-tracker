package com.applovin.shadow.okio;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.my.target.common.menu.MenuActionType;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\b*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\f\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b\f\u0010/R\u0017\u0010\u0014\u001a\u00020\u00118G¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b\u0014\u0010=¨\u0006>"}, d2 = {"Lcom/applovin/shadow/okio/Pipe;", "", "", "maxBufferSize", "<init>", "(J)V", "Lcom/applovin/shadow/okio/Sink;", "Lkotlin/Function1;", "", "block", ToolBar.FORWARD, "(Lcom/applovin/shadow/okio/Sink;Lkotlin/jvm/functions/Function1;)V", "sink", "fold", "(Lcom/applovin/shadow/okio/Sink;)V", "-deprecated_sink", "()Lcom/applovin/shadow/okio/Sink;", "Lcom/applovin/shadow/okio/Source;", "-deprecated_source", "()Lcom/applovin/shadow/okio/Source;", "source", MenuActionType.CANCEL, "()V", "J", "getMaxBufferSize$okio", "()J", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "Lcom/applovin/shadow/okio/Buffer;", "getBuffer$okio", "()Lvh/e;", "", "canceled", "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "foldedSink", "Lcom/applovin/shadow/okio/Sink;", "getFoldedSink$okio", "()Lvh/j0;", "setFoldedSink$okio", "(Lvh/j0;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "Lcom/applovin/shadow/okio/Source;", "()Lvh/l0;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Pipe {

    @NotNull
    private final Buffer buffer = new Buffer();
    private boolean canceled;

    @NotNull
    private final Condition condition;

    @Nullable
    private Sink foldedSink;

    @NotNull
    private final ReentrantLock lock;
    private final long maxBufferSize;

    @NotNull
    private final Sink sink;
    private boolean sinkClosed;

    @NotNull
    private final Source source;
    private boolean sourceClosed;

    /* JADX INFO: renamed from: com.applovin.shadow.okio.Pipe$sink$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"com/applovin/shadow/okio/Pipe$sink$1", "Lcom/applovin/shadow/okio/Sink;", "timeout", "Lcom/applovin/shadow/okio/Timeout;", "close", "", "flush", "write", "source", "Lcom/applovin/shadow/okio/Buffer;", "byteCount", "", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Sink, AutoCloseable {

        @NotNull
        private final Timeout timeout = new Timeout();

        AnonymousClass1() {
        }

        @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSinkClosed()) {
                    lock.unlock();
                    return;
                }
                Sink foldedSink = pipe.getFoldedSink();
                if (foldedSink == null) {
                    if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    pipe.setSinkClosed$okio(true);
                    pipe.getCondition().signalAll();
                    foldedSink = null;
                }
                Unit unit = Unit.f93236a;
                lock.unlock();
                if (foldedSink != null) {
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink.getTimeout();
                    Timeout timeout2 = pipe2.sink().getTimeout();
                    long timeoutNanos = timeout.getTimeoutNanos();
                    long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(jMinTimeout, timeUnit);
                    if (!timeout.getHasDeadline()) {
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.close();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th2;
                        }
                    }
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink.close();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    } catch (Throwable th3) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        }

        @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
        public void flush() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSinkClosed()) {
                    throw new IllegalStateException("closed");
                }
                if (pipe.getCanceled()) {
                    throw new IOException("canceled");
                }
                Sink foldedSink = pipe.getFoldedSink();
                if (foldedSink == null) {
                    if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    foldedSink = null;
                }
                Unit unit = Unit.f93236a;
                lock.unlock();
                if (foldedSink != null) {
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink.getTimeout();
                    Timeout timeout2 = pipe2.sink().getTimeout();
                    long timeoutNanos = timeout.getTimeoutNanos();
                    long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(jMinTimeout, timeUnit);
                    if (!timeout.getHasDeadline()) {
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink.flush();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th2;
                        }
                    }
                    long jDeadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink.flush();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    } catch (Throwable th3) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        }

        @Override // com.applovin.shadow.okio.Sink
        @NotNull
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            r1 = kotlin.Unit.f93236a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            r0 = r12.this$0;
            r1 = r2.getTimeout();
            r0 = r0.sink().getTimeout();
            r3 = r1.getTimeoutNanos();
            r5 = com.applovin.shadow.okio.Timeout.INSTANCE.minTimeout(r0.getTimeoutNanos(), r1.getTimeoutNanos());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.timeout(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
        
            if (r1.getHasDeadline() == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
        
            r5 = r1.deadlineNanoTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            if (r0.getHasDeadline() == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        
            r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        
            if (r0.getHasDeadline() == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
        
            if (r0.getHasDeadline() != false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
        
            if (r0.getHasDeadline() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
        
            r1.deadlineNanoTime(r0.deadlineNanoTime());
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
        
            if (r0.getHasDeadline() == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        
            if (r0.getHasDeadline() != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            return;
         */
        @Override // com.applovin.shadow.okio.Sink
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void write(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r13, long r14) {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Pipe.AnonymousClass1.write(com.applovin.shadow.okio.Buffer, long):void");
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okio.Pipe$source$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/applovin/shadow/okio/Pipe$source$1", "Lcom/applovin/shadow/okio/Source;", "timeout", "Lcom/applovin/shadow/okio/Timeout;", "close", "", "read", "", "sink", "Lcom/applovin/shadow/okio/Buffer;", "byteCount", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C16991 implements Source, AutoCloseable {

        @NotNull
        private final Timeout timeout = new Timeout();

        C16991() {
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                pipe.setSourceClosed$okio(true);
                pipe.getCondition().signalAll();
                Unit unit = Unit.f93236a;
            } finally {
                lock.unlock();
            }
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(@NotNull Buffer sink, long byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSourceClosed()) {
                    throw new IllegalStateException("closed");
                }
                if (pipe.getCanceled()) {
                    throw new IOException("canceled");
                }
                while (pipe.getBuffer().size() == 0) {
                    if (pipe.getSinkClosed()) {
                        lock.unlock();
                        return -1L;
                    }
                    this.timeout.awaitSignal(pipe.getCondition());
                    if (pipe.getCanceled()) {
                        throw new IOException("canceled");
                    }
                }
                long j10 = pipe.getBuffer().read(sink, byteCount);
                pipe.getCondition().signalAll();
                lock.unlock();
                return j10;
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Override // com.applovin.shadow.okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    public Pipe(long j10) {
        this.maxBufferSize = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j10 >= 1) {
            this.sink = new AnonymousClass1();
            this.source = new C16991();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    private final void forward(Sink sink, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink.getTimeout();
        Timeout timeout2 = sink().getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(jMinTimeout, timeUnit);
        if (!timeout.getHasDeadline()) {
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                function1.invoke(sink);
                Unit unit = Unit.f93236a;
                kotlin.jvm.internal.z.b(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.getHasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.z.a(1);
                return;
            } catch (Throwable th2) {
                kotlin.jvm.internal.z.b(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.z.a(1);
                throw th2;
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.getHasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            function1.invoke(sink);
            Unit unit2 = Unit.f93236a;
            kotlin.jvm.internal.z.b(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            kotlin.jvm.internal.z.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.z.b(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            kotlin.jvm.internal.z.a(1);
            throw th3;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name and from getter */
    public final Sink getSink() {
        return this.sink;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name and from getter */
    public final Source getSource() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            Unit unit = Unit.f93236a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(@NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                boolean z10 = this.sinkClosed;
                Buffer buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                this.condition.signalAll();
                Unit unit = Unit.f93236a;
                try {
                    sink.write(buffer, buffer.size());
                    if (z10) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th2) {
                    this.lock.lock();
                    try {
                        this.sourceClosed = true;
                        this.condition.signalAll();
                        Unit unit2 = Unit.f93236a;
                        throw th2;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBuffer$okio, reason: from getter */
    public final Buffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: getCanceled$okio, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @Nullable
    /* JADX INFO: renamed from: getFoldedSink$okio, reason: from getter */
    public final Sink getFoldedSink() {
        return this.foldedSink;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.lock;
    }

    /* JADX INFO: renamed from: getMaxBufferSize$okio, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* JADX INFO: renamed from: getSinkClosed$okio, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    /* JADX INFO: renamed from: getSourceClosed$okio, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z10) {
        this.canceled = z10;
    }

    public final void setFoldedSink$okio(@Nullable Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.sinkClosed = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.sourceClosed = z10;
    }

    @NotNull
    public final Sink sink() {
        return this.sink;
    }

    @NotNull
    public final Source source() {
        return this.source;
    }
}
