package io.bidmachine.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import c9.j;
import c9.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastAd f80444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f80445c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f80443a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80446d = true;

    List a() {
        return this.f80443a;
    }

    void b(j jVar) {
        this.f80445c = jVar;
    }

    void c(e9.a aVar, j jVar) {
        b(jVar);
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", jVar.a());
        List listE0 = aVar.e0();
        if (listE0 == null || listE0.isEmpty()) {
            return;
        }
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            String strA = k.a((String) it.next(), bundle);
            if (!TextUtils.isEmpty(strA)) {
                this.f80443a.add(strA);
            }
        }
    }

    void d(VastAd vastAd) {
        this.f80444b = vastAd;
    }

    void e(boolean z10) {
        this.f80446d = z10;
    }

    boolean f() {
        return this.f80446d;
    }

    public VastAd g() {
        return this.f80444b;
    }

    public j h() {
        return this.f80445c;
    }

    public boolean i() {
        return this.f80444b != null;
    }
}
