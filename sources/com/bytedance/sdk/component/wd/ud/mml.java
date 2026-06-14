package com.bytedance.sdk.component.wd.ud;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.exu;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.mo;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.ud.qdl.tvp;
import com.ironsource.D5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends lnr {
    exu qdl;

    public mml(rq rqVar) {
        super(rqVar);
        this.qdl = null;
    }

    private byte[] mzz(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes(D5.N));
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused5) {
                        throw th;
                    }
                }
            } catch (IOException unused6) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused7) {
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        return byteArray;
    }

    public void mml(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.qdl = exu.qdl(tvp.qdl("application/json; charset=utf-8"), str);
    }

    public void qdl(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = JsonUtils.EMPTY_JSON;
        }
        this.qdl = exu.qdl(tvp.qdl("application/json; charset=utf-8"), string);
    }

    public void qdl(String str, byte[] bArr) {
        this.qdl = exu.qdl(tvp.qdl(str), bArr);
    }

    public void qdl(final com.bytedance.sdk.component.wd.qdl.qdl qdlVar) {
        try {
            fs.qdl qdlVar2 = new fs.qdl();
            if (TextUtils.isEmpty(this.jpc)) {
                qdlVar.qdl(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.mzz)) {
                qdlVar2.qdl(this.mzz);
            }
            int i10 = this.mo;
            if (i10 > 0) {
                qdlVar2.qdl(i10);
            }
            qdlVar2.ud(this.jpc);
            if (this.qdl == null) {
                if (qdlVar != null) {
                    qdlVar.qdl(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                qdl(qdlVar2);
                qdlVar2.qdl((Object) lnr());
                this.lnr.qdl(qdlVar2.qdl(this.qdl).ud()).qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bytedance.sdk.component.wd.ud.mml.1
                    @Override // com.bytedance.sdk.component.ud.qdl.lnr
                    public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
                        com.bytedance.sdk.component.wd.qdl.qdl qdlVar3 = qdlVar;
                        if (qdlVar3 != null) {
                            qdlVar3.qdl(mml.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.ud.qdl.mo] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.wd.qdl.qdl] */
                    /* JADX WARN: Type inference failed for: r1v0 */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v8 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.wd.ud] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.wd.ud] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.ud.qdl.lnr
                    public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
                        Throwable th2;
                        ?? r22;
                        ?? udVar2;
                        com.bytedance.sdk.component.wd.qdl.qdl qdlVar3 = qdlVar;
                        if (qdlVar3 != null) {
                            if (rdpVar == null) {
                                qdlVar3.qdl(mml.this, new IOException("No response"));
                                return;
                            }
                            ?? r12 = 0;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                ?? Wd = rdpVar.wd();
                                if (Wd != 0) {
                                    udVar2 = 0;
                                    while (udVar2 < Wd.qdl()) {
                                        String strQdl = Wd.qdl(udVar2);
                                        String strUd = Wd.ud(udVar2);
                                        map.put(strQdl, strUd);
                                        if (strQdl != null && strQdl.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strUd == null ? "" : strUd.toLowerCase());
                                        }
                                        udVar2++;
                                    }
                                }
                                bjy bjyVarMo = rdpVar.mo();
                                try {
                                    if (com.bytedance.sdk.component.wd.lnr.qdl.qdl(map)) {
                                        byte[] bArrMml = bjyVarMo.mml();
                                        com.bytedance.sdk.component.wd.ud udVar3 = new com.bytedance.sdk.component.wd.ud(rdpVar.mml(), rdpVar.lnr(), rdpVar.mzz(), map, null, rdpVar.ud(), rdpVar.qdl());
                                        udVar3.qdl(bArrMml);
                                        udVar2 = udVar3;
                                    } else if (mml.this.tvp) {
                                        byte[] bArrMml2 = bjyVarMo.mml();
                                        mml mmlVar = mml.this;
                                        com.bytedance.sdk.component.wd.ud udVar4 = new com.bytedance.sdk.component.wd.ud(rdpVar.mml(), rdpVar.lnr(), rdpVar.mzz(), map, new String(bArrMml2, mmlVar.qdl(mmlVar.qdl(bjyVarMo))), rdpVar.ud(), rdpVar.qdl());
                                        udVar4.qdl(bArrMml2);
                                        udVar2 = udVar4;
                                    } else if (bjyVarMo != null) {
                                        udVar2 = new com.bytedance.sdk.component.wd.ud(rdpVar.mml(), rdpVar.lnr(), rdpVar.mzz(), map, bjyVarMo.ud(), rdpVar.ud(), rdpVar.qdl());
                                    } else {
                                        throw new IOException(rdpVar.mzz());
                                    }
                                    mml.this.qdl((com.bytedance.sdk.component.wd.ud) udVar2, rdpVar);
                                    r22 = udVar2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    r12 = udVar2;
                                    r22 = r12;
                                    iOException = new IOException(th2);
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                            if (r22 != 0) {
                                qdlVar.qdl(mml.this, r22);
                                return;
                            }
                            com.bytedance.sdk.component.wd.qdl.qdl qdlVar4 = qdlVar;
                            if (qdlVar4 instanceof com.bytedance.sdk.component.wd.qdl.ud) {
                                com.bytedance.sdk.component.wd.qdl.ud udVar5 = (com.bytedance.sdk.component.wd.qdl.ud) qdlVar4;
                                mml mmlVar2 = mml.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                udVar5.qdl(mmlVar2, iOException, new com.bytedance.sdk.component.wd.ud(rdpVar.mml(), rdpVar.lnr(), rdpVar.mzz(), null, null, rdpVar.ud(), rdpVar.qdl()));
                                return;
                            }
                            mml mmlVar3 = mml.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            qdlVar4.qdl(mmlVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            qdlVar.qdl(this, new IOException(th2.getMessage()));
        }
    }

    public com.bytedance.sdk.component.wd.ud qdl() {
        com.bytedance.sdk.component.wd.ud udVar;
        try {
            fs.qdl qdlVar = new fs.qdl();
            if (TextUtils.isEmpty(this.jpc)) {
                return new com.bytedance.sdk.component.wd.ud(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            qdlVar.ud(this.jpc);
            if (this.qdl == null) {
                return new com.bytedance.sdk.component.wd.ud(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            qdl(qdlVar);
            qdlVar.qdl((Object) lnr());
            rdp rdpVarUd = this.lnr.qdl(qdlVar.qdl(this.qdl).ud()).ud();
            if (rdpVarUd == null) {
                return null;
            }
            HashMap map = new HashMap();
            mo moVarWd = rdpVarUd.wd();
            if (moVarWd != null) {
                for (int i10 = 0; i10 < moVarWd.qdl(); i10++) {
                    String strQdl = moVarWd.qdl(i10);
                    String strUd = moVarWd.ud(i10);
                    map.put(strQdl, strUd);
                    if (strQdl != null && strQdl.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strUd == null ? "" : strUd.toLowerCase());
                    }
                }
            }
            bjy bjyVarMo = rdpVarUd.mo();
            if (com.bytedance.sdk.component.wd.lnr.qdl.qdl(map)) {
                byte[] bArrMml = bjyVarMo.mml();
                udVar = new com.bytedance.sdk.component.wd.ud(rdpVarUd.mml(), rdpVarUd.lnr(), rdpVarUd.mzz(), map, null, rdpVarUd.ud(), rdpVarUd.qdl());
                udVar.qdl(bArrMml);
            } else if (this.tvp) {
                byte[] bArrMml2 = bjyVarMo.mml();
                udVar = new com.bytedance.sdk.component.wd.ud(rdpVarUd.mml(), rdpVarUd.lnr(), rdpVarUd.mzz(), map, new String(bArrMml2, qdl(qdl(bjyVarMo))), rdpVarUd.ud(), rdpVarUd.qdl());
                udVar.qdl(bArrMml2);
            } else if (bjyVarMo != null) {
                udVar = new com.bytedance.sdk.component.wd.ud(rdpVarUd.mml(), rdpVarUd.lnr(), rdpVarUd.mzz(), map, bjyVarMo.ud(), rdpVarUd.ud(), rdpVarUd.qdl());
            } else {
                throw new IOException(rdpVarUd.mzz());
            }
            qdl(udVar, rdpVarUd);
            return udVar;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.wd.ud(false, 5001, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void qdl(String str, boolean z10) {
        if (z10) {
            qdl("application/json; charset=utf-8", mzz(str));
            ud("Content-Encoding", "gzip");
        } else {
            mml(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset qdl(tvp tvpVar) {
        try {
            return tvpVar != null ? tvpVar.qdl(com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl) : com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.ud.qdl.ud.tvp.qdl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tvp qdl(bjy bjyVar) {
        try {
            return bjyVar.mzz();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.component.wd.ud udVar, rdp rdpVar) {
        if (udVar == null || rdpVar == null) {
            return;
        }
        udVar.qdl(rdpVar.jpc());
    }
}
