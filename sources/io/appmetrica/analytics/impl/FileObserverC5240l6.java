package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class FileObserverC5240l6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f77644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f77645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5141ha f77646c;

    public FileObserverC5240l6(File file, C5290n6 c5290n6, C5141ha c5141ha) {
        super(file.getAbsolutePath(), 8);
        this.f77644a = c5290n6;
        this.f77645b = file;
        this.f77646c = c5141ha;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (i10 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f77644a;
        C5141ha c5141ha = this.f77646c;
        File file = this.f77645b;
        c5141ha.getClass();
        consumer.consume(new File(file, str));
    }
}
