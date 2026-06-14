package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
class CrashlyticsFileMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileStore f32052b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f32051a = str;
        this.f32052b = fileStore;
    }

    private File a() {
        return this.f32052b.getCommonFile(this.f32051a);
    }

    public boolean create() {
        try {
            return a().createNewFile();
        } catch (IOException e10) {
            Logger.getLogger().e("Error creating marker: " + this.f32051a, e10);
            return false;
        }
    }

    public boolean isPresent() {
        return a().exists();
    }

    public boolean remove() {
        return a().delete();
    }
}
