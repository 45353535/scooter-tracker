package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface ListenableScheduledFuture<V> extends ScheduledFuture<V>, ListenableFuture<V> {
}
