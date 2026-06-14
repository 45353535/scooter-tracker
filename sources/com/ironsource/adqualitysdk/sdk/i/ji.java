package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import androidx.annotation.MainThread;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass2;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ji {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ji f2835;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<View> f2837 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<jl> f2839 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<View> f2836 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private io f2838 = new io() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.1
        @Override // com.ironsource.adqualitysdk.sdk.i.io
        /* JADX INFO: renamed from: ｋ */
        public final void mo6127() {
            List<View> listM7027 = ju.m7027();
            ji.this.f2836.clear();
            ji.this.f2836.addAll(ji.this.f2837);
            for (int i10 = 0; i10 < listM7027.size(); i10++) {
                View view = listM7027.get(i10);
                ji.this.f2836.remove(view);
                if (!ji.this.f2837.contains(view)) {
                    ji.this.f2837.add(view);
                    ji.this.m6956(view);
                }
            }
            for (int i11 = 0; i11 < ji.this.f2836.size(); i11++) {
                View view2 = (View) ji.this.f2836.get(i11);
                ji.this.f2837.remove(view2);
                ji.this.m6959(view2);
            }
            ji.this.f2836.clear();
        }
    };

    private ji() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized ji m6955() {
        try {
            if (f2835 == null) {
                f2835 = new ji();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2835;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m6959(View view) {
        Iterator<jl> it = this.f2839.iterator();
        while (it.hasNext()) {
            it.next().mo4573(view);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6962(final jl jlVar) {
        synchronized (this) {
            this.f2839.add(jlVar);
        }
        t.m7279(jd.m6903().new AnonymousClass3(this.f2838));
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                Iterator it = ji.this.f2837.iterator();
                while (it.hasNext()) {
                    jlVar.mo4577((View) it.next());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6963(jl jlVar) {
        synchronized (this) {
            try {
                this.f2839.remove(jlVar);
                if (this.f2839.size() == 0) {
                    t.m7279(jd.m6903().new AnonymousClass2(this.f2838));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public synchronized void m6956(View view) {
        Iterator<jl> it = this.f2839.iterator();
        while (it.hasNext()) {
            it.next().mo4577(view);
        }
    }
}
