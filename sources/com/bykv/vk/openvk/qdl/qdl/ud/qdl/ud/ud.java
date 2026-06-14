package com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private File mml;
    private File mzz;
    private Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr f15935ud;
    private volatile boolean lnr = false;
    private final List<qdl.InterfaceC0201qdl> mo = new ArrayList();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile boolean f15936wd = false;

    public ud(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        this.mml = null;
        this.mzz = null;
        this.qdl = context;
        this.f15935ud = lnrVar;
        this.mml = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.ud(lnrVar.mzz(), lnrVar.yt());
        this.mzz = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.lnr(lnrVar.mzz(), lnrVar.yt());
    }

    private void lnr() {
        rq.qdl qdlVarUd = com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml() != null ? com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml().ud() : new rq.qdl("v_preload");
        long jExc = this.f15935ud.exc();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qdlVarUd.qdl(jExc, timeUnit).ud(this.f15935ud.aaj(), timeUnit).lnr(this.f15935ud.jyq(), timeUnit);
        rq rqVarQdl = qdlVarUd.qdl();
        fs.qdl qdlVar = new fs.qdl();
        final long length = this.mml.length();
        int iMo = this.f15935ud.mo();
        boolean zExu = this.f15935ud.exu();
        int iMml = this.f15935ud.mml();
        if (iMml > 0) {
            if (iMml >= this.f15935ud.fs()) {
                zExu = true;
            } else {
                iMo = iMml;
            }
        }
        qdlVar.qdl("videoPreload").qdl(6);
        if (zExu) {
            qdlVar.qdl("RANGE", "bytes=" + length + TokenBuilder.TOKEN_DELIMITER).ud(this.f15935ud.jtx()).qdl().ud();
        } else {
            qdlVar.qdl("RANGE", "bytes=" + length + TokenBuilder.TOKEN_DELIMITER + iMo).ud(this.f15935ud.jtx()).qdl().ud();
        }
        rqVarQdl.qdl(qdlVar.ud()).qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud.ud.1
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
                ud udVar2 = ud.this;
                udVar2.qdl(udVar2.f15935ud, 601, iOException.getMessage());
                lnr.qdl(ud.this.f15935ud);
            }

            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
                InputStream inputStreamLnr;
                RandomAccessFile randomAccessFile;
                bjy bjyVarMo;
                long jQdl;
                long j10 = length;
                bjy bjyVar = null;
                bjyVar = null;
                randomAccessFile = null;
                randomAccessFile = null;
                RandomAccessFile randomAccessFile2 = null;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamLnr = null;
                    randomAccessFile = null;
                }
                if (rdpVar != null) {
                    boolean zMml = rdpVar.mml();
                    if (!zMml) {
                        ud udVar2 = ud.this;
                        udVar2.qdl(udVar2.f15935ud, rdpVar.lnr(), rdpVar.mzz());
                        ud.this.qdl((Closeable) null);
                        ud.this.qdl((Closeable) null);
                        ud.this.qdl(bjyVar);
                        ud.this.qdl(rdpVar);
                        ud.this.f15935ud.jtx();
                        ud.this.f15935ud.mo();
                        lnr.qdl(ud.this.f15935ud);
                    }
                    bjyVarMo = rdpVar.mo();
                    try {
                        bjyVarMo = rdpVar.mo();
                        if (!zMml || bjyVarMo == null) {
                            inputStreamLnr = null;
                            jQdl = 0;
                        } else {
                            jQdl = length + bjyVarMo.qdl();
                            inputStreamLnr = bjyVarMo.lnr();
                        }
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = randomAccessFile2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamLnr = null;
                        randomAccessFile = null;
                    }
                    if (inputStreamLnr == null) {
                        ud udVar3 = ud.this;
                        udVar3.qdl(udVar3.f15935ud, rdpVar.lnr(), rdpVar.mzz());
                    } else {
                        randomAccessFile = new RandomAccessFile(ud.this.mml, "rw");
                        try {
                            byte[] bArr = new byte[8192];
                            int i10 = 0;
                            long j11 = 0;
                            while (true) {
                                int i11 = inputStreamLnr.read(bArr, i10, 8192 - i10);
                                if (i11 != -1) {
                                    if (ud.this.lnr) {
                                        ud udVar4 = ud.this;
                                        udVar4.ud(udVar4.f15935ud, rdpVar.lnr());
                                        ud.this.qdl(randomAccessFile);
                                        break;
                                    } else {
                                        i10 += i11;
                                        j11 += (long) i11;
                                        if (j11 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0 || j11 == jQdl - length) {
                                            com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.qdl(randomAccessFile, bArr, Long.valueOf(j10).intValue(), i10, ud.this.f15935ud.yt());
                                            j10 += (long) i10;
                                            i10 = 0;
                                        }
                                    }
                                } else {
                                    if (ud.this.f15935ud.exu() && jQdl == ud.this.mml.length()) {
                                        ud.this.mzz();
                                    }
                                    ud udVar5 = ud.this;
                                    udVar5.qdl(udVar5.f15935ud, rdpVar.lnr());
                                    randomAccessFile2 = randomAccessFile;
                                }
                            }
                            ud.this.qdl(inputStreamLnr);
                            ud.this.qdl(bjyVarMo);
                        } catch (Throwable th5) {
                            th = th5;
                            bjyVar = bjyVarMo;
                            try {
                                ud.this.mml();
                                ud udVar6 = ud.this;
                                udVar6.qdl(udVar6.f15935ud, rdpVar != null ? rdpVar.lnr() : 601, th.getMessage());
                                ud.this.qdl(randomAccessFile);
                                ud.this.qdl(inputStreamLnr);
                                ud.this.qdl(bjyVar);
                            } catch (Throwable th6) {
                                ud.this.qdl(randomAccessFile);
                                ud.this.qdl(inputStreamLnr);
                                ud.this.qdl(bjyVar);
                                ud.this.qdl(rdpVar);
                                ud.this.f15935ud.jtx();
                                ud.this.f15935ud.mo();
                                lnr.qdl(ud.this.f15935ud);
                                throw th6;
                            }
                        }
                        ud.this.qdl(rdpVar);
                        ud.this.f15935ud.jtx();
                        ud.this.f15935ud.mo();
                        lnr.qdl(ud.this.f15935ud);
                    }
                } else {
                    ud udVar7 = ud.this;
                    udVar7.qdl(udVar7.f15935ud, 601, "Network link failed.");
                    bjyVarMo = null;
                    inputStreamLnr = null;
                }
                ud.this.qdl(randomAccessFile2);
                ud.this.qdl(inputStreamLnr);
                ud.this.qdl(bjyVarMo);
                ud.this.qdl(rdpVar);
                ud.this.f15935ud.jtx();
                ud.this.f15935ud.mo();
                lnr.qdl(ud.this.f15935ud);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        try {
            this.mzz.delete();
            this.mml.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mzz() {
        try {
            if (this.mml.renameTo(this.mzz)) {
                return;
            }
            throw new IOException("Error renaming file " + this.mml + " to " + this.mzz + " for completion!");
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean ud() {
        if (this.mzz.exists()) {
            return true;
        }
        if (!this.f15935ud.exu()) {
            if (this.mml.length() >= this.f15935ud.mo()) {
                return true;
            }
            if (this.f15935ud.mml() > 0 && this.mml.length() >= this.f15935ud.mml()) {
                return true;
            }
        }
        return false;
    }

    public void qdl(qdl.InterfaceC0201qdl interfaceC0201qdl) {
        if (this.f15936wd) {
            synchronized (qdl.InterfaceC0201qdl.class) {
                this.mo.add(interfaceC0201qdl);
            }
            return;
        }
        this.mo.add(interfaceC0201qdl);
        if (ud()) {
            this.f15935ud.jpc(1);
            qdl(this.f15935ud, 200);
            lnr.qdl(this.f15935ud);
        } else {
            this.f15936wd = true;
            this.f15935ud.jpc(0);
            lnr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10) {
        synchronized (qdl.InterfaceC0201qdl.class) {
            try {
                for (qdl.InterfaceC0201qdl interfaceC0201qdl : this.mo) {
                    if (interfaceC0201qdl != null) {
                        interfaceC0201qdl.ud(lnrVar, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr qdl() {
        return this.f15935ud;
    }

    public void qdl(boolean z10) {
        this.lnr = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10) {
        synchronized (qdl.InterfaceC0201qdl.class) {
            try {
                for (qdl.InterfaceC0201qdl interfaceC0201qdl : this.mo) {
                    if (interfaceC0201qdl != null) {
                        interfaceC0201qdl.qdl(lnrVar, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10, String str) {
        synchronized (qdl.InterfaceC0201qdl.class) {
            try {
                for (qdl.InterfaceC0201qdl interfaceC0201qdl : this.mo) {
                    if (interfaceC0201qdl != null) {
                        interfaceC0201qdl.qdl(lnrVar, i10, str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
