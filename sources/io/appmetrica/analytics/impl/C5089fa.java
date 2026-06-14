package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5089fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f77155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f77156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f77157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f77158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77159e;

    public C5089fa(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f77155a, "rw");
            this.f77157c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f77158d = channel;
            if (this.f77159e == 0) {
                this.f77156b = channel.lock();
            }
            this.f77159e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            this.f77155a.getAbsolutePath();
            int i10 = this.f77159e - 1;
            this.f77159e = i10;
            if (i10 == 0) {
                Qa.a(this.f77156b);
            }
            no.a((Closeable) this.f77157c);
            no.a((Closeable) this.f77158d);
            this.f77157c = null;
            this.f77156b = null;
            this.f77158d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C5089fa(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C5089fa(File file) {
        this.f77159e = 0;
        this.f77155a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
