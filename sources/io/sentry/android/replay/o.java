package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.android.replay.o;
import io.sentry.g1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f83057f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83058g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f83059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f83060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f83061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f83062e;

    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.o$a$a, reason: collision with other inner class name */
        static final class C1004a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o f83063f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1004a(o oVar) {
                super(1);
                this.f83063f = oVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke(ArrayList mViews) throws Exception {
                Intrinsics.checkNotNullParameter(mViews, "mViews");
                g1 g1VarD = this.f83063f.f83060c.d();
                try {
                    ArrayList arrayList = this.f83063f.f83062e;
                    arrayList.addAll(mViews);
                    wf.a.a(g1VarD, null);
                    return arrayList;
                } finally {
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(o oVar) {
            if (oVar.f83059b.get()) {
                return;
            }
            u.f83141a.e(new C1004a(oVar));
        }

        public final o b() {
            final o oVar = new o(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.a.c(oVar);
                }
            });
            return oVar;
        }

        private a() {
        }
    }

    public static final class b extends ArrayList {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            Intrinsics.checkNotNullParameter(element, "element");
            Iterator it = o.this.m().iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            for (e eVar : o.this.m()) {
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    eVar.c((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        public /* bridge */ boolean b(View view) {
            return super.contains(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return b((View) obj);
            }
            return false;
        }

        public /* bridge */ int i() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return j((View) obj);
            }
            return -1;
        }

        public /* bridge */ int j(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int k(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i10) {
            return o(i10);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return k((View) obj);
            }
            return -1;
        }

        public /* bridge */ boolean n(View view) {
            return super.remove(view);
        }

        public View o(int i10) {
            Object objRemove = super.remove(i10);
            Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
            View view = (View) objRemove;
            Iterator it = o.this.m().iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return i();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return n((View) obj);
            }
            return false;
        }
    }

    public static final class c extends CopyOnWriteArrayList {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(e eVar) throws Exception {
            g1 g1VarD = o.this.f83060c.d();
            try {
                for (View view : o.this.f83062e) {
                    if (eVar != null) {
                        eVar.c(view, true);
                    }
                }
                Unit unit = Unit.f93236a;
                wf.a.a(g1VarD, null);
                return super.add(eVar);
            } finally {
            }
        }

        public /* bridge */ boolean b(e eVar) {
            return super.contains(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return b((e) obj);
            }
            return false;
        }

        public /* bridge */ int i() {
            return super.size();
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return j((e) obj);
            }
            return -1;
        }

        public /* bridge */ int j(e eVar) {
            return super.indexOf(eVar);
        }

        public /* bridge */ int k(e eVar) {
            return super.lastIndexOf(eVar);
        }

        public /* bridge */ boolean l(e eVar) {
            return super.remove(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return k((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return l((e) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return i();
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f83059b.set(true);
        this.f83061d.clear();
    }

    public final CopyOnWriteArrayList m() {
        return this.f83061d;
    }

    private o() {
        this.f83059b = new AtomicBoolean(false);
        this.f83060c = new io.sentry.util.a();
        this.f83061d = new c();
        this.f83062e = new b();
    }
}
