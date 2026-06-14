package com.bytedance.sdk.component.ud.qdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fs {
    public rq qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public com.bytedance.sdk.component.lnr.qdl.qdl f16690ud = new com.bytedance.sdk.component.lnr.qdl.qdl();

    public static class qdl {
        String jpc;
        wd lnr;
        String mml;
        exu mo;
        Object mzz;
        com.bytedance.sdk.component.ud.qdl.qdl qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        Map<String, List<String>> f16691ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        int f16692wd;

        public qdl() {
            this.f16691ud = new HashMap();
        }

        public qdl qdl(com.bytedance.sdk.component.ud.qdl.qdl qdlVar) {
            this.qdl = qdlVar;
            return this;
        }

        public qdl ud(String str) {
            return qdl(wd.lnr(str));
        }

        public qdl qdl(String str) {
            this.jpc = str;
            return this;
        }

        public qdl ud(String str, String str2) {
            if (!this.f16691ud.containsKey(str)) {
                this.f16691ud.put(str, new ArrayList());
            }
            this.f16691ud.get(str).add(str2);
            return this;
        }

        qdl(fs fsVar) {
            this.lnr = fsVar.ud();
            this.mml = fsVar.lnr();
            this.f16691ud = fsVar.mml();
            this.mzz = fsVar.qdl();
            this.mo = fsVar.jpc();
            this.qdl = fsVar.mzz();
            this.f16692wd = fsVar.wd();
            this.jpc = fsVar.mo();
        }

        public qdl qdl(int i10) {
            this.f16692wd = i10;
            return this;
        }

        public qdl qdl(Object obj) {
            this.mzz = obj;
            return this;
        }

        public qdl qdl(wd wdVar) {
            this.lnr = wdVar;
            return this;
        }

        public fs ud() {
            return new fs() { // from class: com.bytedance.sdk.component.ud.qdl.fs.qdl.1
                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public exu jpc() {
                    return qdl.this.mo;
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public String lnr() {
                    return qdl.this.mml;
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public Map mml() {
                    return qdl.this.f16691ud;
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public String mo() {
                    return qdl.this.jpc;
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public com.bytedance.sdk.component.ud.qdl.qdl mzz() {
                    return qdl.this.qdl;
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public Object qdl() {
                    return qdl.this.mzz;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public wd ud() {
                    return qdl.this.lnr;
                }

                @Override // com.bytedance.sdk.component.ud.qdl.fs
                public int wd() {
                    return qdl.this.f16692wd;
                }
            };
        }

        public qdl qdl(String str, String str2) {
            return ud(str, str2);
        }

        public qdl qdl() {
            return qdl("GET", (exu) null);
        }

        private qdl qdl(String str, exu exuVar) {
            this.mml = str;
            this.mo = exuVar;
            return this;
        }

        public qdl qdl(exu exuVar) {
            return qdl("POST", exuVar);
        }
    }

    public exu jpc() {
        return null;
    }

    public abstract String lnr();

    public abstract Map<String, List<String>> mml();

    public abstract String mo();

    public abstract com.bytedance.sdk.component.ud.qdl.qdl mzz();

    public abstract Object qdl();

    public void qdl(rq rqVar) {
        this.qdl = rqVar;
    }

    public qdl tvp() {
        return new qdl(this);
    }

    public abstract wd ud();

    public abstract int wd();
}
