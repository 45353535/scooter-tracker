package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Uninterruptibles {
    @J2ktIncompatible
    @GwtIncompatible
    public static void awaitTerminationUninterruptibly(ExecutorService executorService) {
        Verify.verify(awaitTerminationUninterruptibly(executorService, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        boolean z10 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread) {
        boolean z10 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void sleepUninterruptibly(long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z10 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, long j10, TimeUnit timeUnit) {
        return tryAcquireUninterruptibly(semaphore, 1, j10, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean tryLockUninterruptibly(Lock lock, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return lock.tryLock(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean awaitTerminationUninterruptibly(ExecutorService executorService, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return executorService.awaitTermination(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, int i10, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return semaphore.tryAcquire(i10, nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @J2ktIncompatible
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return future.get(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread, long j10, TimeUnit timeUnit) {
        Preconditions.checkNotNull(thread);
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean awaitUninterruptibly(Condition condition, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return condition.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
