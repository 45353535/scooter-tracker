package com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.utils.aaj;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements lnr {
    private File lnr;
    private File mml;
    private long mzz;
    private final com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr rq;
    private RandomAccessFile to;
    private volatile long qdl = SieveCacheKt.NodeMetaAndPreviousMask;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Object f15933ud = new Object();
    private volatile long mo = -1;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile int f15934wd = -100;
    private volatile boolean jpc = false;
    private volatile boolean tvp = false;

    public ud(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        this.mzz = 0L;
        this.to = null;
        this.rq = lnrVar;
        try {
            this.lnr = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.ud(lnrVar.mzz(), lnrVar.yt());
            this.mml = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.lnr(lnrVar.mzz(), lnrVar.yt());
            if (mml()) {
                this.to = new RandomAccessFile(this.mml, "r");
            } else {
                this.to = new RandomAccessFile(this.lnr, "rw");
            }
            if (mml()) {
                return;
            }
            this.mzz = this.lnr.length();
            qdl();
        } catch (Throwable unused) {
            lnrVar.jtx();
        }
    }

    private boolean mml() {
        return this.mml.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() throws IOException {
        synchronized (this.f15933ud) {
            if (mml()) {
                this.rq.jtx();
                this.rq.yt();
                return;
            }
            try {
            } finally {
            }
            if (!this.lnr.renameTo(this.mml)) {
                throw new IOException("Error renaming file " + this.lnr + " to " + this.mml + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.to;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.to = new RandomAccessFile(this.mml, "rw");
            this.rq.yt();
            this.rq.jtx();
        }
    }

    private long mzz() {
        return mml() ? this.mml.length() : this.lnr.length();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr
    public long lnr() throws IOException {
        if (mml()) {
            this.qdl = this.mml.length();
        } else {
            synchronized (this.f15933ud) {
                int i10 = 0;
                while (this.qdl == SieveCacheKt.NodeMetaAndPreviousMask) {
                    try {
                        i10 += 15;
                        try {
                            this.f15933ud.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return this.qdl;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr
    public void ud() {
        try {
            if (!this.jpc) {
                this.to.close();
            }
            File file = this.lnr;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.mml;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.jpc = true;
    }

    public void qdl() {
        rq.qdl qdlVar;
        if (com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml() != null) {
            qdlVar = com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml().ud();
        } else {
            qdlVar = new rq.qdl("v_cache");
        }
        long jExc = this.rq.exc();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qdlVar.qdl(jExc, timeUnit).ud(this.rq.aaj(), timeUnit).lnr(this.rq.jyq(), timeUnit);
        rq rqVarQdl = qdlVar.qdl();
        this.rq.yt();
        rqVarQdl.qdl(new fs.qdl().qdl("RANGE", "bytes=" + this.mzz + TokenBuilder.TOKEN_DELIMITER).ud(this.rq.jtx()).qdl().qdl("videoLoadWhenPlaying").qdl(9).ud()).qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.ud.1
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
                ud.this.qdl(30000, iOException.getMessage());
            }

            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
                bjy bjyVarMo;
                boolean z10;
                if (rdpVar == null) {
                    ud.this.qdl(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStreamLnr = null;
                try {
                    try {
                        ud.this.tvp = rdpVar.mml();
                        if (ud.this.tvp) {
                            bjyVarMo = rdpVar.mo();
                            try {
                                if (ud.this.tvp && bjyVarMo != null) {
                                    ud.this.qdl = bjyVarMo.qdl() + ud.this.mzz;
                                    inputStreamLnr = bjyVarMo.lnr();
                                }
                                if (inputStreamLnr == null) {
                                    ud.this.qdl(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                    if (inputStreamLnr != null) {
                                        inputStreamLnr.close();
                                    }
                                    if (bjyVarMo != null) {
                                        bjyVarMo.close();
                                    }
                                    rdpVar.close();
                                    if (!ud.this.tvp || ud.this.lnr.length() != ud.this.qdl) {
                                        return;
                                    }
                                    ud.this.mo();
                                }
                                byte[] bArr = new byte[8192];
                                long j10 = ud.this.mzz;
                                long j11 = 0;
                                loop0: while (true) {
                                    int i10 = 0;
                                    do {
                                        int i11 = inputStreamLnr.read(bArr, i10, 8192 - i10);
                                        if (i11 == -1) {
                                            break loop0;
                                        }
                                        i10 += i11;
                                        j11 += (long) i11;
                                        z10 = j11 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0 || j11 == ud.this.qdl - ud.this.mzz;
                                        long unused = ud.this.qdl;
                                        long unused2 = ud.this.mzz;
                                        ud.this.rq.yt();
                                        ud.this.rq.jtx();
                                    } while (!z10);
                                    synchronized (ud.this.f15933ud) {
                                        com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.qdl(ud.this.to, bArr, Long.valueOf(j10).intValue(), i10, ud.this.rq.yt());
                                    }
                                    j10 += (long) i10;
                                }
                                long unused3 = ud.this.mzz;
                                long unused4 = ud.this.qdl;
                                long unused5 = ud.this.qdl;
                                long unused6 = ud.this.mzz;
                                ud.this.rq.jtx();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    ud.this.qdl(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                    if (inputStreamLnr != null) {
                                        inputStreamLnr.close();
                                    }
                                    if (bjyVarMo != null) {
                                        bjyVarMo.close();
                                    }
                                    rdpVar.close();
                                    if (ud.this.tvp && ud.this.lnr.length() == ud.this.qdl) {
                                        ud.this.mo();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    if (inputStreamLnr != null) {
                                        try {
                                            inputStreamLnr.close();
                                        } catch (Throwable unused7) {
                                            throw th3;
                                        }
                                    }
                                    if (bjyVarMo != null) {
                                        bjyVarMo.close();
                                    }
                                    rdpVar.close();
                                    if (ud.this.tvp && ud.this.lnr.length() == ud.this.qdl) {
                                        ud.this.mo();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            ud.this.qdl(rdpVar.lnr(), rdpVar.mzz());
                            bjyVarMo = null;
                        }
                        if (inputStreamLnr != null) {
                            inputStreamLnr.close();
                        }
                        if (bjyVarMo != null) {
                            bjyVarMo.close();
                        }
                        rdpVar.close();
                        if (!ud.this.tvp || ud.this.lnr.length() != ud.this.qdl) {
                            return;
                        }
                        ud.this.mo();
                    } catch (Throwable th4) {
                        th = th4;
                        bjyVarMo = null;
                    }
                } catch (Throwable unused8) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i10, String str) {
        JSONObject jSONObjectLnr;
        this.tvp = false;
        this.f15934wd = i10;
        this.qdl = this.mo;
        aaj.ud("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), " ", str);
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar = this.rq;
        if (lnrVar == null || !lnrVar.qdl() || (jSONObjectLnr = this.rq.lnr()) == null) {
            return;
        }
        try {
            jSONObjectLnr.put("error_real_code", i10);
            jSONObjectLnr.put("error_real_msg", str);
        } catch (Throwable th2) {
            aaj.qdl("CSJ_MediaDLPlay", "handleFailResponse: ", th2);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr
    public int qdl(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.qdl) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.jpc) {
                synchronized (this.f15933ud) {
                    try {
                        if (j10 < mzz()) {
                            this.to.seek(j10);
                            i13 = this.to.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.f15933ud.wait(33L);
                        }
                    } finally {
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar = this.rq;
                if (lnrVar != null && lnrVar.qdl() && this.f15934wd != -100 && (!this.tvp || this.qdl == this.mo)) {
                    throw new IOException();
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}
