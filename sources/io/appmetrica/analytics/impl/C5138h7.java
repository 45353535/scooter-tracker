package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5138h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P6 f77298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77300c;

    public C5138h7(P6 p62, ArrayList arrayList, boolean z10) {
        this.f77298a = p62;
        this.f77299b = arrayList;
        this.f77300c = z10;
    }

    public final String a(Context context, InterfaceC5060e7 interfaceC5060e7) {
        File parentFile;
        try {
            File fileA = this.f77298a.a(context, interfaceC5060e7.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC5060e7.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return interfaceC5060e7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f77299b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileA = ((P6) it.next()).a(context, str);
            if (fileA.exists()) {
                try {
                    if (this.f77300c) {
                        FileUtils.copyToNullable(fileA, file);
                    } else {
                        FileUtils.move(fileA, file);
                    }
                    String path = fileA.getPath();
                    String path2 = file.getPath();
                    for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"-journal", "-shm", "-wal"})) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f77300c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
