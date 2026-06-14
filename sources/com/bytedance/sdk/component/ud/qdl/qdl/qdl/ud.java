package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.exu;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.jpc;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements com.bytedance.sdk.component.ud.qdl.ud {
    private static List<Object> mml;
    private AtomicBoolean lnr = new AtomicBoolean(false);
    fs qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    com.bytedance.sdk.component.ud.qdl.mml f16700ud;

    static {
        try {
            mml = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                mml.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                mml.add(enumValueOf2);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    ud(fs fsVar, com.bytedance.sdk.component.ud.qdl.mml mmlVar) {
        this.qdl = fsVar;
        this.f16700ud = mmlVar;
    }

    private boolean mzz() {
        if (this.qdl.mml() == null) {
            return false;
        }
        return this.qdl.mml().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud
    public void lnr() {
        this.lnr.set(true);
    }

    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.ud.qdl.ud clone() {
        return new ud(this.qdl, this.f16700ud);
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud
    public fs qdl() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud
    public rdp ud() throws IOException {
        List<com.bytedance.sdk.component.ud.qdl.jpc> list;
        com.bytedance.sdk.component.lnr.qdl.qdl qdlVar;
        fs fsVar = this.qdl;
        if (fsVar != null && (qdlVar = fsVar.f16690ud) != null) {
            if (qdlVar.rdp() == 0) {
                this.qdl.f16690ud.bjy();
            }
            this.qdl.f16690ud.qdl();
        }
        this.f16700ud.lnr().remove(this);
        this.f16700ud.mml().add(this);
        com.bytedance.sdk.component.ud.qdl.mml mmlVar = this.f16700ud;
        if ((mmlVar instanceof mo) && (mmlVar.lnr().size() + this.f16700ud.mml().size() > this.f16700ud.qdl() || this.lnr.get())) {
            this.f16700ud.mml().remove(this);
            return new jpc(jpc.qdl, "Maximum number of requests exceeded", this.qdl);
        }
        try {
            rq rqVar = this.qdl.qdl;
            if (rqVar == null || (list = rqVar.qdl) == null || list.size() <= 0) {
                return qdl(this.qdl);
            }
            ArrayList arrayList = new ArrayList(this.qdl.qdl.qdl);
            arrayList.add(new com.bytedance.sdk.component.ud.qdl.jpc() { // from class: com.bytedance.sdk.component.ud.qdl.qdl.qdl.ud.1
                @Override // com.bytedance.sdk.component.ud.qdl.jpc
                public rdp qdl(jpc.qdl qdlVar2) throws IOException {
                    return ud.this.qdl(qdlVar2.qdl());
                }
            });
            return ((com.bytedance.sdk.component.ud.qdl.jpc) arrayList.get(0)).qdl(new lnr(arrayList, this.qdl));
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    private boolean qdl(exu exuVar) {
        fs fsVar;
        byte[] bArr;
        return exuVar != null && (fsVar = this.qdl) != null && "POST".equalsIgnoreCase(fsVar.lnr()) && exuVar.mo == exu.qdl.BYTE_ARRAY_TYPE && (bArr = exuVar.mzz) != null && bArr.length > 0;
    }

    public rdp qdl(fs fsVar) throws IOException {
        return qdl(fsVar, com.bytedance.sdk.component.wd.qdl.mzz());
    }

    public rdp qdl(fs fsVar, boolean z10) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e10;
        String strQdl;
        int responseCode = jpc.qdl;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(fsVar.ud().qdl().toString()).openConnection();
                if (z10) {
                    try {
                        if (!"setting".equals(fsVar.mo()) && !"gecko".equals(fsVar.mo()) && !"load_ug_t".equals(fsVar.mo())) {
                            qdl(httpURLConnection);
                        }
                    } catch (IOException e11) {
                        e10 = e11;
                        if (responseCode == -1 && z10) {
                            rdp rdpVarQdl = qdl(fsVar, false);
                            this.f16700ud.mml().remove(this);
                            return rdpVarQdl;
                        }
                        strQdl = qdl(httpURLConnection, e10);
                        this.f16700ud.mml().remove(this);
                    } catch (Exception e12) {
                        e = e12;
                        httpURLConnection2 = httpURLConnection;
                        strQdl = qdl(httpURLConnection2, e);
                        this.f16700ud.mml().remove(this);
                    }
                }
                if (fsVar.mml() != null && fsVar.mml().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : fsVar.mml().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                ud(httpURLConnection);
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                rq rqVar = fsVar.qdl;
                if (rqVar != null) {
                    TimeUnit timeUnit = rqVar.lnr;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(rqVar.f16703ud));
                    }
                    rq rqVar2 = fsVar.qdl;
                    if (rqVar2.lnr != null) {
                        httpURLConnection.setReadTimeout((int) rqVar2.mzz.toMillis(rqVar2.mml));
                    }
                }
                if (fsVar.jpc() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!mzz() && fsVar.jpc().lnr != null) {
                        httpURLConnection.addRequestProperty("Content-Type", fsVar.jpc().lnr.qdl());
                    }
                    httpURLConnection.setRequestMethod(fsVar.lnr());
                    if ("POST".equalsIgnoreCase(fsVar.lnr())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        if (qdl(fsVar.jpc())) {
                            outputStream.write(fsVar.jpc().mzz);
                        } else if (ud(fsVar.jpc())) {
                            outputStream.write(fsVar.jpc().mml.getBytes());
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                com.bytedance.sdk.component.lnr.qdl.qdl qdlVar = fsVar.f16690ud;
                if (qdlVar != null) {
                    qdlVar.ud();
                }
                httpURLConnection.connect();
                com.bytedance.sdk.component.lnr.qdl.qdl qdlVar2 = fsVar.f16690ud;
                if (qdlVar2 != null) {
                    qdlVar2.lnr();
                }
                responseCode = httpURLConnection.getResponseCode();
                com.bytedance.sdk.component.lnr.qdl.qdl qdlVar3 = fsVar.f16690ud;
                if (qdlVar3 != null) {
                    qdlVar3.mzz();
                }
            } catch (IOException e13) {
                httpURLConnection = null;
                e10 = e13;
            } catch (Exception e14) {
                e = e14;
            }
            if (this.lnr.get()) {
                httpURLConnection.disconnect();
                this.f16700ud.mml().remove(this);
                strQdl = "internal error";
                return new jpc(responseCode, strQdl, fsVar);
            }
            jpc jpcVar = new jpc(httpURLConnection, fsVar);
            this.f16700ud.mml().remove(this);
            return jpcVar;
        } catch (Throwable th2) {
            this.f16700ud.mml().remove(this);
            throw th2;
        }
    }

    private boolean ud(exu exuVar) {
        fs fsVar;
        return (exuVar == null || (fsVar = this.qdl) == null || !"POST".equalsIgnoreCase(fsVar.lnr()) || exuVar.mo != exu.qdl.STRING_TYPE || TextUtils.isEmpty(exuVar.mml)) ? false : true;
    }

    private static void ud(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private static String qdl(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    private static void qdl(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (mml.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, mml);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud
    public void qdl(final com.bytedance.sdk.component.ud.qdl.lnr lnrVar) {
        com.bytedance.sdk.component.lnr.qdl.qdl qdlVar;
        fs fsVar = this.qdl;
        if (fsVar != null && (qdlVar = fsVar.f16690ud) != null) {
            qdlVar.bjy();
        }
        this.f16700ud.ud().submit(new com.bytedance.sdk.component.jpc.lnr.ud(this.qdl.wd(), this.qdl.mo()) { // from class: com.bytedance.sdk.component.ud.qdl.qdl.qdl.ud.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    rdp rdpVarUd = ud.this.ud();
                    if (rdpVarUd == null) {
                        lnrVar.qdl(ud.this, new IOException("response is null"));
                    } else {
                        lnrVar.qdl(ud.this, rdpVarUd);
                    }
                } catch (IOException e10) {
                    lnrVar.qdl(ud.this, e10);
                }
            }
        });
    }
}
