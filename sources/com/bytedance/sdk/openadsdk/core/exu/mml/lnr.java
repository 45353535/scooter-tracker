package com.bytedance.sdk.openadsdk.core.exu.mml;

import com.bykv.vk.openvk.qdl.qdl.qdl.qdl;
import com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends mml {
    private final qdl mml;
    private final List<ud> qdl = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17166ud = 1;
    private int lnr = 1;

    public interface ud extends qdl.InterfaceC0202qdl {
        void qdl(int i10, int i11);
    }

    public lnr() {
        qdl qdlVar = new qdl();
        this.mml = qdlVar;
        super.qdl(qdlVar);
        qdl(500);
    }

    static /* synthetic */ int qdl(lnr lnrVar) {
        int i10 = lnrVar.lnr;
        lnrVar.lnr = i10 + 1;
        return i10;
    }

    public int aaj() {
        return this.lnr;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml
    public long jtx() {
        return super.jtx() * ((long) this.f17166ud);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml
    public long yt() {
        long jYt = super.yt();
        return this.f17166ud == 1 ? jYt : jYt + (((long) (this.lnr - 1)) * super.jtx());
    }

    private class qdl implements qdl.InterfaceC0202qdl {
        private qdl() {
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).lnr(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void mml(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).mml(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).mzz(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            lnr.qdl(lnr.this);
            if (lnr.this.lnr > lnr.this.f17166ud) {
                Iterator it = lnr.this.qdl.iterator();
                while (it.hasNext()) {
                    ((ud) it.next()).qdl(qdlVar);
                }
            } else {
                Iterator it2 = lnr.this.qdl.iterator();
                while (it2.hasNext()) {
                    ((ud) it2.next()).qdl(lnr.this.lnr, lnr.this.f17166ud);
                }
                lnr.this.tvp();
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).ud(qdlVar);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).ud(qdlVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j10) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, j10);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar2) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, qdlVar2);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, boolean z10) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, z10);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10, int i11) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10, int i11, int i12) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, i10, i11, i12);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j10, long j11) {
            Iterator it = lnr.this.qdl.iterator();
            while (it.hasNext()) {
                ((ud) it.next()).qdl(qdlVar, j10, j11);
            }
        }
    }

    public void lnr(int i10) {
        this.f17166ud = Math.max(1, i10);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.mml
    public void qdl(qdl.InterfaceC0202qdl interfaceC0202qdl) {
        if (!(interfaceC0202qdl instanceof ud)) {
            super.qdl(interfaceC0202qdl);
        } else {
            if (this.qdl.contains(interfaceC0202qdl)) {
                return;
            }
            this.qdl.add((ud) interfaceC0202qdl);
        }
    }
}
