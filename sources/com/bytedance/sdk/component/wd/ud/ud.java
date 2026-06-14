package com.bytedance.sdk.component.wd.ud;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.mo;
import com.bytedance.sdk.component.ud.qdl.qdl;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.ud.qdl.wd;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends lnr {
    public static final com.bytedance.sdk.component.ud.qdl.qdl qdl = new qdl.C0237qdl().qdl().ud();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final com.bytedance.sdk.component.ud.qdl.qdl f16742ud = new qdl.C0237qdl().ud();
    private Map<String, String> fs;
    private boolean rq;
    private com.bytedance.sdk.component.ud.qdl.qdl to;

    public ud(rq rqVar) {
        super(rqVar);
        this.to = qdl;
        this.rq = false;
        this.fs = new HashMap();
    }

    public void qdl(boolean z10) {
        this.rq = z10;
    }

    public void qdl(final com.bytedance.sdk.component.wd.qdl.qdl qdlVar) {
        try {
            fs.qdl qdlVar2 = new fs.qdl();
            if (this.rq) {
                qdlVar2.ud(this.jpc);
            } else {
                wd.qdl qdlVar3 = new wd.qdl();
                Uri uri = Uri.parse(this.jpc);
                qdlVar3.qdl(uri.getScheme());
                qdlVar3.ud(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    qdlVar3.lnr(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.fs.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.fs.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        qdlVar3.qdl(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                qdlVar2.qdl(qdlVar3.ud());
            }
            qdl(qdlVar2);
            qdlVar2.qdl(this.to);
            qdlVar2.qdl((Object) lnr());
            if (!TextUtils.isEmpty(this.mzz)) {
                qdlVar2.qdl(this.mzz);
            }
            int i10 = this.mo;
            if (i10 > 0) {
                qdlVar2.qdl(i10);
            }
            this.lnr.qdl(qdlVar2.qdl().ud()).qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bytedance.sdk.component.wd.ud.ud.1
                @Override // com.bytedance.sdk.component.ud.qdl.lnr
                public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
                    com.bytedance.sdk.component.wd.qdl.qdl qdlVar4 = qdlVar;
                    if (qdlVar4 != null) {
                        qdlVar4.qdl(ud.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.ud.qdl.lnr
                public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
                    String strUd;
                    if (qdlVar != null) {
                        HashMap map = new HashMap();
                        if (rdpVar != null) {
                            mo moVarWd = rdpVar.wd();
                            if (moVarWd != null) {
                                for (int i11 = 0; i11 < moVarWd.qdl(); i11++) {
                                    map.put(moVarWd.qdl(i11), moVarWd.ud(i11));
                                }
                            }
                            bjy bjyVarMo = rdpVar.mo();
                            if (bjyVarMo == null) {
                                strUd = "";
                            } else {
                                strUd = bjyVarMo.ud();
                            }
                            qdlVar.qdl(ud.this, new com.bytedance.sdk.component.wd.ud(rdpVar.mml(), rdpVar.lnr(), rdpVar.mzz(), map, strUd, rdpVar.ud(), rdpVar.qdl()));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (qdlVar != null) {
                qdlVar.qdl(this, new IOException(th2.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.wd.ud qdl() {
        try {
            fs.qdl qdlVar = new fs.qdl();
            if (this.rq) {
                qdlVar.ud(this.jpc);
            } else {
                wd.qdl qdlVar2 = new wd.qdl();
                Uri uri = Uri.parse(this.jpc);
                qdlVar2.qdl(uri.getScheme());
                qdlVar2.ud(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    qdlVar2.lnr(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.fs.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.fs.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        qdlVar2.qdl(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                qdlVar.qdl(qdlVar2.ud());
            }
            qdl(qdlVar);
            qdlVar.qdl(this.to);
            qdlVar.qdl((Object) lnr());
            rdp rdpVarUd = this.lnr.qdl(qdlVar.qdl().ud()).ud();
            if (rdpVarUd == null) {
                return null;
            }
            HashMap map = new HashMap();
            mo moVarWd = rdpVarUd.wd();
            if (moVarWd != null) {
                for (int i10 = 0; i10 < moVarWd.qdl(); i10++) {
                    map.put(moVarWd.qdl(i10), moVarWd.ud(i10));
                }
            }
            bjy bjyVarMo = rdpVarUd.mo();
            return new com.bytedance.sdk.component.wd.ud(rdpVarUd.mml(), rdpVarUd.lnr(), rdpVarUd.mzz(), map, bjyVarMo != null ? bjyVarMo.ud() : "", rdpVarUd.ud(), rdpVarUd.qdl());
        } catch (Throwable unused) {
            return null;
        }
    }
}
