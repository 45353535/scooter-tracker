package com.bykv.vk.openvk.qdl.qdl.ud.qdl;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import androidx.collection.SieveCacheKt;
import com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr;
import com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.ud;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends MediaDataSource implements AutoCloseable {
    public static final ConcurrentHashMap<String, qdl> qdl = new ConcurrentHashMap<>();
    private long lnr = SieveCacheKt.NodeMetaAndPreviousMask;
    private final Context mml;
    private final lnr mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr f15930ud;

    public qdl(Context context, lnr lnrVar) {
        this.mml = context;
        this.mzz = lnrVar;
        this.f15930ud = new ud(context, lnrVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mzz.jtx();
        com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr lnrVar = this.f15930ud;
        if (lnrVar != null) {
            lnrVar.ud();
        }
        qdl.remove(this.mzz.yt());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.lnr == SieveCacheKt.NodeMetaAndPreviousMask) {
            if (this.mml == null || TextUtils.isEmpty(this.mzz.jtx())) {
                return -1L;
            }
            this.lnr = this.f15930ud.lnr();
        }
        return this.lnr;
    }

    public lnr qdl() {
        return this.mzz;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        int iQdl = this.f15930ud.qdl(j10, bArr, i10, i11);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return iQdl;
    }

    public static qdl qdl(Context context, lnr lnrVar) {
        qdl qdlVar = new qdl(context, lnrVar);
        qdl.put(lnrVar.yt(), qdlVar);
        return qdlVar;
    }
}
