package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.i.ba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ba> f769 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$4, reason: invalid class name */
    final class AnonymousClass4 extends ir {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ String f776;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ ba.c f777;

        AnonymousClass4(String str, ba.c cVar) {
            this.f776 = str;
            this.f777 = cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            ba baVarM5076 = bb.m5076(bb.this, this.f776);
            if (baVarM5076 != null) {
                baVarM5076.m5069(this.f777);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$5, reason: invalid class name */
    final class AnonymousClass5 extends ir {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ ba.b f778;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f780;

        AnonymousClass5(String str, ba.b bVar) {
            this.f780 = str;
            this.f778 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            ba baVarM5076 = bb.m5076(bb.this, this.f780);
            if (baVarM5076 != null) {
                baVarM5076.m5068(this.f778);
            }
        }
    }

    public interface e extends r {
    }

    public bb() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m5079() {
        Iterator it = new ArrayList(this.f769.values()).iterator();
        while (it.hasNext()) {
            if (((ba) it.next()).m5066()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m5080(String str) {
        this.f769.put(str, new ba(str));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ ba m5076(bb bbVar, String str) {
        Map<String, ba> map = bbVar.f769;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final String m5078(String str) {
        Map<String, ba> map = this.f769;
        ba baVar = map != null ? map.get(str) : null;
        if (baVar != null) {
            return baVar.m5067();
        }
        return null;
    }
}
