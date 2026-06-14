package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f15828a;

    public a(File file) {
        this.f15828a = file;
    }

    protected abstract InputStream a(File file, String str) throws IOException;

    public final InputStream a(String str) throws IOException {
        return a(this.f15828a, str);
    }

    protected abstract boolean b(File file, String str) throws IOException;

    public final boolean b(String str) throws IOException {
        return b(this.f15828a, str);
    }
}
