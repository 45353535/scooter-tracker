package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    @Nullable
    byte[] getLogAsBytes();

    @Nullable
    String getLogAsString();

    void writeToLog(long j10, String str);
}
