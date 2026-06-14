package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15780g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j10) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j10);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j10) throws IOException {
        if (j10 <= 0) {
            try {
                return new b(file);
            } catch (Exception e10) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e10.getMessage(), e10);
            }
        }
        try {
            return new c(j10, file);
        } catch (Exception e11) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e11.getMessage(), e11);
        }
    }
}
