package com.google.android.datatransport.runtime.retries;

/* JADX INFO: loaded from: classes7.dex */
public final class Retries {
    public static <TInput, TResult, TException extends Throwable> TResult retry(int i10, TInput tinput, Function<TInput, TResult, TException> function, RetryStrategy<TInput, TResult> retryStrategy) throws Throwable {
        TResult tresultApply;
        if (i10 < 1) {
            return function.apply(tinput);
        }
        do {
            tresultApply = function.apply(tinput);
            tinput = retryStrategy.shouldRetry(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresultApply;
    }
}
