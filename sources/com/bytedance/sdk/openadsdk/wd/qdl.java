package com.bytedance.sdk.openadsdk.wd;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.ud.qdl.exu;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.lnr;
import com.bytedance.sdk.component.ud.qdl.mo;
import com.bytedance.sdk.component.ud.qdl.mzz;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.ud.qdl.tvp;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements INetWork {
    protected rq qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected rq f17894ud;

    public qdl() {
        rq.qdl qdlVar = new rq.qdl();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.qdl = qdlVar.qdl(10L, timeUnit).ud(10L, timeUnit).lnr(10L, timeUnit).qdl();
        this.f17894ud = new rq.qdl().qdl(10L, timeUnit).ud(30L, timeUnit).lnr(30L, timeUnit).qdl();
    }

    private Map<String, String> qdl(mo moVar) {
        if (moVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < moVar.qdl(); i10++) {
            map.put(moVar.qdl(i10), moVar.ud(i10));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        rdp rdpVarUd = this.qdl.qdl(new fs.qdl().qdl().ud(str).qdl("gecko").ud()).ud();
        return new Response(qdl(rdpVarUd.wd()), rdpVarUd.lnr() == 200 ? rdpVarUd.mo().ud() : null, rdpVarUd.lnr(), rdpVarUd.mzz());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        mzz.qdl qdlVar = new mzz.qdl();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                qdlVar.qdl((String) pair.first, (String) pair.second);
            }
        }
        rdp rdpVarUd = this.qdl.qdl(new fs.qdl().ud(str).qdl((exu) qdlVar.qdl()).qdl("gecko").ud()).ud();
        return new Response(qdl(rdpVarUd.wd()), rdpVarUd.lnr() == 200 ? rdpVarUd.mo().ud() : null, rdpVarUd.lnr(), rdpVarUd.mzz());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e10;
        Closeable closeable;
        Closeable closeable2 = null;
        int i10 = 0;
        try {
            try {
                try {
                    rdp rdpVarUd = this.f17894ud.qdl(new fs.qdl().qdl().qdl("gecko").ud(str).ud()).ud();
                    int iLnr = rdpVarUd.lnr();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(rdpVarUd.mo().lnr());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i11 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i11 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i11);
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            i10 = iLnr;
                            throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e13) {
                e10 = e13;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.qdl.qdl(new fs.qdl().qdl().ud(str).qdl("gecko").ud()).qdl(new lnr() { // from class: com.bytedance.sdk.openadsdk.wd.qdl.1
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        rdp rdpVarUd = this.qdl.qdl(new fs.qdl().ud(str).qdl(exu.qdl(tvp.qdl("application/json; charset=utf-8"), str2)).qdl("gecko").ud()).ud();
        return new Response(qdl(rdpVarUd.wd()), rdpVarUd.lnr() == 200 ? rdpVarUd.mo().ud() : null, rdpVarUd.lnr(), rdpVarUd.mzz());
    }
}
