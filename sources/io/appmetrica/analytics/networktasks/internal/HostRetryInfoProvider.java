package io.appmetrica.analytics.networktasks.internal;

/* JADX INFO: loaded from: classes12.dex */
public interface HostRetryInfoProvider {
    long getLastAttemptTimeSeconds();

    int getNextSendAttemptNumber();

    void saveLastAttemptTimeSeconds(long j10);

    void saveNextSendAttemptNumber(int i10);
}
