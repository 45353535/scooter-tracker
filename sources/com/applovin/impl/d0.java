package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f8539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f8540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f8541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f8542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f8543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f8544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f8545o;

    class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8546a;

        a(String str) {
            this.f8546a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f8475a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f8541k) {
                        StringUtils.replaceAll(d0.this.f8540j, this.f8546a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f8540j, this.f8546a, uri.toString());
                }
                d0.this.f8537g.a(uri.toString(), this.f8546a);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.f8477c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                d0Var.f8477c.a(d0Var.f8476b, "Failed to cache JavaScript resource " + this.f8546a);
            }
            if (d0.this.f8539i != null) {
                d0.this.f8539i.a(d0.this.f8536f, true);
            }
        }
    }

    class b implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8550c;

        b(String str, String str2, String str3) {
            this.f8548a = str;
            this.f8549b = str2;
            this.f8550c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f8475a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f8541k) {
                        StringUtils.replaceAll(d0.this.f8540j, this.f8548a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f8540j, this.f8548a, uri.toString());
                }
                d0.this.f8537g.a(uri.toString(), this.f8548a);
                return;
            }
            if (!d0.this.f8537g.Q().contains(this.f8549b + this.f8550c) || d0.this.f8539i == null) {
                return;
            }
            d0.this.f8539i.a(d0.this.f8536f, true);
        }
    }

    public interface c {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f8536f = str;
        this.f8537g = bVar;
        this.f8538h = list;
        this.f8542l = executorService;
        this.f8543m = str2;
        this.f8539i = cVar;
        this.f8540j = new StringBuffer(str);
        this.f8541k = new Object();
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f8475a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f8542l.submit((e0) it.next()));
        }
        this.f8545o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.HashSet d() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f8536f, (String) this.f8475a.a(x4.f11328h5)), 1)) {
            if (this.f8479e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f8537g, Collections.EMPTY_LIST, false, this.f8543m, this.f8475a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f8477c.a(this.f8476b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f8479e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f8536f)) {
            a(this.f8536f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f8475a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8477c.a(this.f8476b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f8536f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f8475a.a(x4.f11319g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f8544n = new ArrayList(hashSet);
        if (this.f8479e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f8544n;
        if (list == null || list.isEmpty()) {
            a(this.f8536f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8477c.a(this.f8476b, "Executing " + this.f8544n.size() + " caching operations...");
        }
        if (this.f8475a.q0().e()) {
            a(this.f8544n);
        } else {
            this.f8542l.invokeAll(this.f8544n);
        }
        if (((Boolean) this.f8475a.a(x4.T0)).booleanValue()) {
            synchronized (this.f8541k) {
                a(this.f8540j.toString());
            }
        } else {
            a(this.f8540j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f8544n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f8545o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f8479e.get() || (cVar = this.f8539i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
