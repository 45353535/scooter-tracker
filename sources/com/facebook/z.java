package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends AbstractList {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f20059h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f20060i = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f20061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f20064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f20065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f20066g;

    public interface a {
        void a(z zVar);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public z(Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f20063d = String.valueOf(Integer.valueOf(f20060i.incrementAndGet()));
        this.f20065f = new ArrayList();
        this.f20064e = new ArrayList(requests);
    }

    private final List i() {
        return GraphRequest.f19547n.i(this);
    }

    private final y k() {
        return GraphRequest.f19547n.l(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f20064e.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f20064e.add(element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f20064e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return f((GraphRequest) obj);
        }
        return false;
    }

    public final void e(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f20065f.contains(callback)) {
            return;
        }
        this.f20065f.add(callback);
    }

    public /* bridge */ boolean f(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    public final List g() {
        return i();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return t((GraphRequest) obj);
        }
        return -1;
    }

    public final y j() {
        return k();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i10) {
        return (GraphRequest) this.f20064e.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return u((GraphRequest) obj);
        }
        return -1;
    }

    public final String m() {
        return this.f20066g;
    }

    public final Handler n() {
        return this.f20061b;
    }

    public final List o() {
        return this.f20065f;
    }

    public final String p() {
        return this.f20063d;
    }

    public final List q() {
        return this.f20064e;
    }

    public int r() {
        return this.f20064e.size();
    }

    public final int s() {
        return this.f20062c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return r();
    }

    public /* bridge */ int t(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    public /* bridge */ int u(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i10) {
        return x(i10);
    }

    public /* bridge */ boolean w(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    public GraphRequest x(int i10) {
        return (GraphRequest) this.f20064e.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i10, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (GraphRequest) this.f20064e.set(i10, element);
    }

    public final void z(Handler handler) {
        this.f20061b = handler;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return w((GraphRequest) obj);
        }
        return false;
    }

    public z(GraphRequest... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f20063d = String.valueOf(Integer.valueOf(f20060i.incrementAndGet()));
        this.f20065f = new ArrayList();
        this.f20064e = new ArrayList(ArraysKt.asList(requests));
    }
}
