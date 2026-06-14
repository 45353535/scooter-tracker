package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.D5;
import com.my.target.bc;
import com.my.target.ja;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class ca implements ja.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa f59387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f59388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bc f59389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s8 f59390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f59391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f59392f;

    public interface a {
        void a(String str);

        void b(String str);
    }

    public ca(fa faVar, s8 s8Var, Context context) {
        gb.a("ShoppableAdPresenter: create presenter");
        this.f59387a = faVar;
        this.f59388b = new WeakReference(context);
        this.f59390d = s8Var;
        this.f59389c = bc.b(faVar.E(), faVar.x());
    }

    public void a(a aVar) {
        this.f59392f = aVar;
    }

    public long b() {
        ja jaVar;
        WeakReference weakReference = this.f59391e;
        if (weakReference == null || (jaVar = (ja) weakReference.get()) == null) {
            return 0L;
        }
        return jaVar.getAndResetInteractionEnd();
    }

    public View c() {
        ja jaVar;
        WeakReference weakReference = this.f59391e;
        if (weakReference != null && (jaVar = (ja) weakReference.get()) != null) {
            return jaVar;
        }
        Context context = (Context) this.f59388b.get();
        if (context == null) {
            gb.a("ShoppableAdPresenter: context is null");
            return null;
        }
        ja jaVar2 = new ja(context);
        jaVar2.setListener(this);
        jaVar2.a(this.f59390d);
        this.f59389c.c(jaVar2);
        jaVar2.a(null, this.f59387a.M(), "text/html", D5.N, null);
        this.f59391e = new WeakReference(jaVar2);
        return jaVar2;
    }

    public void a() {
        ja jaVar;
        gb.a("ShoppableAdPresenter: destroy presenter");
        this.f59389c.a((bc.a) null);
        this.f59389c.e();
        WeakReference weakReference = this.f59391e;
        if (weakReference != null && (jaVar = (ja) weakReference.get()) != null) {
            jaVar.setListener(null);
        }
        this.f59391e = null;
    }

    @Override // com.my.target.ja.a
    public void a(String str) {
        gb.a("ShoppableAdPresenter: on shoppable view click, url - " + str);
        a aVar = this.f59392f;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // com.my.target.ja.a
    public void a(int i10, String str, String str2) {
        a aVar = this.f59392f;
        if (aVar == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebView error - ");
        sb2.append(i10);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(", ");
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(", ");
            sb2.append(str2);
        }
        aVar.a(sb2.toString());
    }
}
