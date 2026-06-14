package com.facebook.internal;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f19970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f19972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f19973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f19974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f19975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer[] f19976g;

    private static final class a extends d {
        @Override // com.facebook.internal.t.d
        public String b() {
            return "com.facebook.arstudio.player";
        }
    }

    private static final class b extends d {
        private final boolean d() {
            return com.facebook.s.m().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.t.d
        public String b() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.t.d
        public void c() {
            if (d()) {
                Log.w(t.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    private static final class c extends d {
        @Override // com.facebook.internal.t.d
        public String b() {
            return "com.facebook.orca";
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TreeSet f19977a;

        /* JADX WARN: Removed duplicated region for block: B:12:0x0012 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:7:0x0009, B:13:0x001a, B:15:0x001e, B:17:0x0024, B:12:0x0012), top: B:22:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L12
                java.util.TreeSet r1 = r0.f19977a     // Catch: java.lang.Throwable -> L10
                if (r1 == 0) goto L12
                if (r1 == 0) goto L12
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10
                if (r1 != 0) goto L12
                goto L1a
            L10:
                r1 = move-exception
                goto L29
            L12:
                com.facebook.internal.t r1 = com.facebook.internal.t.f19970a     // Catch: java.lang.Throwable -> L10
                java.util.TreeSet r1 = com.facebook.internal.t.b(r1, r0)     // Catch: java.lang.Throwable -> L10
                r0.f19977a = r1     // Catch: java.lang.Throwable -> L10
            L1a:
                java.util.TreeSet r1 = r0.f19977a     // Catch: java.lang.Throwable -> L10
                if (r1 == 0) goto L24
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L10
                if (r1 == 0) goto L27
            L24:
                r0.c()     // Catch: java.lang.Throwable -> L10
            L27:
                monitor-exit(r0)
                return
            L29:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.t.d.a(boolean):void");
        }

        public abstract String b();

        public void c() {
        }
    }

    private static final class e extends d {
        @Override // com.facebook.internal.t.d
        public String b() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    static {
        t tVar = new t();
        f19970a = tVar;
        f19971b = t.class.getName();
        f19972c = tVar.f();
        f19973d = tVar.e();
        f19974e = tVar.d();
        f19975f = new AtomicBoolean(false);
        f19976g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private t() {
    }

    public static final /* synthetic */ TreeSet b(t tVar, d dVar) {
        if (e3.a.d(t.class)) {
            return null;
        }
        try {
            return tVar.h(dVar);
        } catch (Throwable th2) {
            e3.a.b(th2, t.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (e3.a.d(t.class)) {
            return null;
        }
        try {
            return f19971b;
        } catch (Throwable th2) {
            e3.a.b(th2, t.class);
            return null;
        }
    }

    private final Map d() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c());
            List list = f19972c;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", f19973d);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final List e() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new a());
            arrayListArrayListOf.addAll(f());
            return arrayListArrayListOf;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final List f() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new b(), new e());
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final Uri g(d dVar) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + dVar.b() + ".provider.PlatformProvider/versions");
            Intrinsics.checkNotNullExpressionValue(uri, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f A[EXC_TOP_SPLITTER, LOOP:0: B:47:0x006f->B:28:0x0075, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[Catch: all -> 0x0091, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:5:0x000c, B:39:0x0097, B:40:0x009a, B:34:0x008d), top: B:43:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.TreeSet h(com.facebook.internal.t.d r13) {
        /*
            r12 = this;
            java.lang.String r1 = "version"
            java.lang.String r2 = "Failed to query content resolver."
            boolean r0 = e3.a.d(r12)
            r3 = 0
            if (r0 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r4 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L91
            r4.<init>()     // Catch: java.lang.Throwable -> L91
            android.content.Context r0 = com.facebook.s.m()     // Catch: java.lang.Throwable -> L91
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L91
            java.lang.String[] r7 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L91
            android.net.Uri r6 = r12.g(r13)     // Catch: java.lang.Throwable -> L91
            android.content.Context r0 = com.facebook.s.m()     // Catch: java.lang.Throwable -> L44
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r8.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r13 = r13.b()     // Catch: java.lang.Throwable -> L44
            r8.append(r13)     // Catch: java.lang.Throwable -> L44
            java.lang.String r13 = ".provider.PlatformProvider"
            r8.append(r13)     // Catch: java.lang.Throwable -> L44
            java.lang.String r13 = r8.toString()     // Catch: java.lang.Throwable -> L44
            r8 = 0
            android.content.pm.ProviderInfo r13 = r0.resolveContentProvider(r13, r8)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L48
            goto L50
        L44:
            r0 = move-exception
            r13 = r0
            r0 = r3
            goto L95
        L48:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = com.facebook.internal.t.f19971b     // Catch: java.lang.Throwable -> L44
            android.util.Log.e(r0, r2, r13)     // Catch: java.lang.Throwable -> L44
            r13 = r3
        L50:
            if (r13 == 0) goto L8a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L5a java.lang.SecurityException -> L61 java.lang.NullPointerException -> L67
            goto L6d
        L5a:
            java.lang.String r13 = com.facebook.internal.t.f19971b     // Catch: java.lang.Throwable -> L44
            android.util.Log.e(r13, r2)     // Catch: java.lang.Throwable -> L44
        L5f:
            r13 = r3
            goto L6d
        L61:
            java.lang.String r13 = com.facebook.internal.t.f19971b     // Catch: java.lang.Throwable -> L44
            android.util.Log.e(r13, r2)     // Catch: java.lang.Throwable -> L44
            goto L5f
        L67:
            java.lang.String r13 = com.facebook.internal.t.f19971b     // Catch: java.lang.Throwable -> L44
            android.util.Log.e(r13, r2)     // Catch: java.lang.Throwable -> L44
            goto L5f
        L6d:
            if (r13 == 0) goto L8b
        L6f:
            boolean r0 = r13.moveToNext()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L8b
            int r0 = r13.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L85
            int r0 = r13.getInt(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L85
            r4.add(r0)     // Catch: java.lang.Throwable -> L85
            goto L6f
        L85:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L95
        L8a:
            r13 = r3
        L8b:
            if (r13 == 0) goto L94
            r13.close()     // Catch: java.lang.Throwable -> L91
            goto L94
        L91:
            r0 = move-exception
            r13 = r0
            goto L9b
        L94:
            return r4
        L95:
            if (r0 == 0) goto L9a
            r0.close()     // Catch: java.lang.Throwable -> L91
        L9a:
            throw r13     // Catch: java.lang.Throwable -> L91
        L9b:
            e3.a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.t.h(com.facebook.internal.t$d):java.util.TreeSet");
    }

    public static final void i() {
        if (e3.a.d(t.class)) {
            return;
        }
        try {
            if (f19975f.compareAndSet(false, true)) {
                com.facebook.s.t().execute(new Runnable() { // from class: com.facebook.internal.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.j();
                    }
                });
            }
        } catch (Throwable th2) {
            e3.a.b(th2, t.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        if (e3.a.d(t.class)) {
            return;
        }
        try {
            try {
                Iterator it = f19972c.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(true);
                }
            } finally {
                f19975f.set(false);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, t.class);
        }
    }
}
