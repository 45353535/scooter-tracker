package m2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.internal.o;
import com.facebook.internal.z;
import com.facebook.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f94424f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f94425g = g.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static g f94426h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f94427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f94428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f94429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashSet f94430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f94431e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized g a() {
            g gVarB;
            try {
                if (g.b() == null) {
                    g.d(new g(null));
                }
                gVarB = g.b();
                Intrinsics.checkNotNull(gVarB, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th2) {
                throw th2;
            }
            return gVarB;
        }

        public final Bundle b(n2.a aVar, View rootView, View hostView) {
            List<n2.b> listC;
            n2.a aVar2;
            View view;
            List listA;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (aVar != null && (listC = aVar.c()) != null) {
                for (n2.b bVar : listC) {
                    if (bVar.d() != null && bVar.d().length() > 0) {
                        bundle.putString(bVar.a(), bVar.d());
                    } else if (bVar.b().size() > 0) {
                        if (Intrinsics.areEqual(bVar.c(), "relative")) {
                            c.a aVar3 = c.f94434g;
                            List listB = bVar.b();
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            n2.a aVar4 = aVar;
                            listA = aVar3.a(aVar4, hostView, listB, 0, -1, simpleName);
                            aVar2 = aVar4;
                            view = rootView;
                        } else {
                            aVar2 = aVar;
                            c.a aVar5 = c.f94434g;
                            List listB2 = bVar.b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            view = rootView;
                            listA = aVar5.a(aVar2, view, listB2, 0, -1, simpleName2);
                        }
                        Iterator it = listA.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b bVar2 = (b) it.next();
                            if (bVar2.a() != null) {
                                String strK = n2.f.k(bVar2.a());
                                if (strK.length() > 0) {
                                    bundle.putString(bVar.a(), strK);
                                    break;
                                }
                            }
                        }
                        aVar = aVar2;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f94432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94433b;

        public b(View view, String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.f94432a = new WeakReference(view);
            this.f94433b = viewMapKey;
        }

        public final View a() {
            WeakReference weakReference = this.f94432a;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public final String b() {
            return this.f94433b;
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f94434g = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f94435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f94436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f94437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final HashSet f94438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f94439f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View child = viewGroup.getChildAt(i10);
                    if (child.getVisibility() == 0) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        arrayList.add(child);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private final boolean c(android.view.View r10, n2.c r11, int r12) {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: m2.g.c.a.c(android.view.View, n2.c, int):boolean");
            }

            public final List a(n2.a aVar, View view, List path, int i10, int i11, String mapKey) {
                n2.a aVar2;
                List list;
                a aVar3;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i10 >= path.size()) {
                        arrayList.add(new b(view, str));
                        aVar2 = aVar;
                        list = path;
                        aVar3 = this;
                    } else {
                        n2.c cVar = (n2.c) path.get(i10);
                        if (Intrinsics.areEqual(cVar.a(), "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List listB = b((ViewGroup) parent);
                                int size = listB.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    n2.a aVar4 = aVar;
                                    List list2 = path;
                                    arrayList.addAll(a(aVar4, (View) listB.get(i12), list2, i10 + 1, i12, str));
                                    i12++;
                                    aVar = aVar4;
                                    path = list2;
                                }
                            }
                        } else {
                            aVar2 = aVar;
                            list = path;
                            aVar3 = this;
                            if (Intrinsics.areEqual(cVar.a(), ".")) {
                                arrayList.add(new b(view, str));
                                return arrayList;
                            }
                            if (c(view, cVar, i11)) {
                                if (i10 == list.size() - 1) {
                                    arrayList.add(new b(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List listB2 = b((ViewGroup) view);
                        int size2 = listB2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            arrayList.addAll(aVar3.a(aVar2, (View) listB2.get(i13), list, i10 + 1, i13, str));
                            i13++;
                            aVar3 = this;
                        }
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        public c(View view, Handler handler, HashSet listenerSet, String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.f94435b = new WeakReference(view);
            this.f94437d = handler;
            this.f94438e = listenerSet;
            this.f94439f = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, n2.a aVar) {
            if (aVar == null) {
                return;
            }
            try {
                View viewA = bVar.a();
                if (viewA == null) {
                    return;
                }
                View viewA2 = n2.f.a(viewA);
                if (viewA2 != null && n2.f.f95103a.p(viewA, viewA2)) {
                    e(bVar, view, aVar);
                    return;
                }
                String name = viewA.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.a0(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewA instanceof AdapterView)) {
                    b(bVar, view, aVar);
                } else if (viewA instanceof ListView) {
                    d(bVar, view, aVar);
                }
            } catch (Exception e10) {
                z.Z(g.c(), e10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b(m2.g.b r4, android.view.View r5, n2.a r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.a()
                if (r0 != 0) goto L7
                goto L39
            L7:
                java.lang.String r4 = r4.b()
                android.view.View$OnClickListener r1 = n2.f.g(r0)
                boolean r2 = r1 instanceof m2.b.a
                if (r2 == 0) goto L22
                java.lang.String r2 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                m2.b$a r1 = (m2.b.a) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L22
                r1 = 1
                goto L23
            L22:
                r1 = 0
            L23:
                java.util.HashSet r2 = r3.f94438e
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L39
                if (r1 != 0) goto L39
                m2.b$a r5 = m2.b.b(r6, r5, r0)
                r0.setOnClickListener(r5)
                java.util.HashSet r5 = r3.f94438e
                r5.add(r4)
            L39:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.g.c.b(m2.g$b, android.view.View, n2.a):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void d(m2.g.b r4, android.view.View r5, n2.a r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.a()
                android.widget.AdapterView r0 = (android.widget.AdapterView) r0
                if (r0 != 0) goto L9
                goto L3b
            L9:
                java.lang.String r4 = r4.b()
                android.widget.AdapterView$OnItemClickListener r1 = r0.getOnItemClickListener()
                boolean r2 = r1 instanceof m2.b.C1083b
                if (r2 == 0) goto L24
                java.lang.String r2 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                m2.b$b r1 = (m2.b.C1083b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L24
                r1 = 1
                goto L25
            L24:
                r1 = 0
            L25:
                java.util.HashSet r2 = r3.f94438e
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L3b
                if (r1 != 0) goto L3b
                m2.b$b r5 = m2.b.c(r6, r5, r0)
                r0.setOnItemClickListener(r5)
                java.util.HashSet r5 = r3.f94438e
                r5.add(r4)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.g.c.d(m2.g$b, android.view.View, n2.a):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void e(m2.g.b r4, android.view.View r5, n2.a r6) {
            /*
                r3 = this;
                android.view.View r0 = r4.a()
                if (r0 != 0) goto L7
                goto L39
            L7:
                java.lang.String r4 = r4.b()
                android.view.View$OnTouchListener r1 = n2.f.h(r0)
                boolean r2 = r1 instanceof m2.h.a
                if (r2 == 0) goto L22
                java.lang.String r2 = "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                m2.h$a r1 = (m2.h.a) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L22
                r1 = 1
                goto L23
            L22:
                r1 = 0
            L23:
                java.util.HashSet r2 = r3.f94438e
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L39
                if (r1 != 0) goto L39
                m2.h$a r5 = m2.h.a(r6, r5, r0)
                r0.setOnTouchListener(r5)
                java.util.HashSet r5 = r3.f94438e
                r5.add(r4)
            L39:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.g.c.e(m2.g$b, android.view.View, n2.a):void");
        }

        private final void f(n2.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            String strA = aVar.a();
            if (strA == null || strA.length() == 0 || Intrinsics.areEqual(aVar.a(), this.f94439f)) {
                List listD = aVar.d();
                if (listD.size() > 25) {
                    return;
                }
                Iterator it = f94434g.a(aVar, view, listD, 0, -1, this.f94439f).iterator();
                while (it.hasNext()) {
                    a((b) it.next(), view, aVar);
                }
            }
        }

        private final void g() {
            List list = this.f94436c;
            if (list == null || this.f94435b.get() == null) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f((n2.a) list.get(i10), (View) this.f94435b.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            g();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (e3.a.d(this)) {
                return;
            }
            try {
                com.facebook.internal.i iVarF = com.facebook.internal.m.f(s.n());
                if (iVarF != null && iVarF.d()) {
                    List listB = n2.a.f95061j.b(iVarF.h());
                    this.f94436c = listB;
                    if (listB != null && (view = (View) this.f94435b.get()) != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        g();
                    }
                }
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (e3.a.d(g.class)) {
            return null;
        }
        try {
            return f94426h;
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (e3.a.d(g.class)) {
            return null;
        }
        try {
            return f94425g;
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            f94426h = gVar;
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    private final void g() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f94428b) {
                if (activity != null) {
                    View viewD = v2.h.d(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f94427a;
                    HashSet hashSet = this.f94430d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.f94429c.add(new c(viewD, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void i() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f94427a.post(new Runnable() { // from class: m2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(this.f94423b);
                    }
                });
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g this$0) {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.g();
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    public final void e(Activity activity) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (o.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new com.facebook.i("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f94428b.add(activity);
            this.f94430d.clear();
            HashSet hashSet = (HashSet) this.f94431e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f94430d = hashSet;
            }
            i();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void f(Activity activity) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f94431e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void h(Activity activity) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (o.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new com.facebook.i("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f94428b.remove(activity);
            this.f94429c.clear();
            HashMap map = this.f94431e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.f94430d.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
            map.put(numValueOf, (HashSet) objClone);
            this.f94430d.clear();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private g() {
        this.f94427a = new Handler(Looper.getMainLooper());
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f94428b = setNewSetFromMap;
        this.f94429c = new LinkedHashSet();
        this.f94430d = new HashSet();
        this.f94431e = new HashMap();
    }
}
