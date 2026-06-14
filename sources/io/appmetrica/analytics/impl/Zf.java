package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class Zf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f76752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f76753b;

    public Zf(File file, C5290n6 c5290n6) {
        this.f76752a = file;
        this.f76753b = c5290n6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f76752a.exists() || !this.f76752a.isDirectory() || (fileArrListFiles = this.f76752a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f76753b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
