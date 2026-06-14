package io.sentry.android.replay;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends Closeable {
    void a(r rVar);

    void pause();

    void reset();

    void resume();

    void start();

    void stop();
}
