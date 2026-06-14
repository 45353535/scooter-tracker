package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.ironsource.Sd;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected sg.bigo.ads.common.h.a.a f102607b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, C1268a> f102606a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<C1268a> f102610e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f102611f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f102608c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f102609d = new byte[0];

    /* JADX INFO: renamed from: sg.bigo.ads.common.p.a$a, reason: collision with other inner class name */
    class C1268a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f102638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        final String f102639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f102640c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f102642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<g> f102643f;

        private C1268a(String str, @NonNull String str2, @Nullable boolean z10, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f102643f = arrayList;
            this.f102640c = false;
            this.f102638a = str;
            this.f102639b = str2;
            this.f102642e = z10;
            arrayList.add(gVar);
        }

        final void a(@Nullable Executor executor, final Context context) {
            if (this.f102640c) {
                return;
            }
            this.f102640c = true;
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(this.f102638a), this.f102642e, context);
            if (executor == null) {
                executor = sg.bigo.ads.common.u.a.e.h();
            }
            aVar.f102749l = executor;
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.a>() { // from class: sg.bigo.ads.common.p.a.a.2
                @Override // sg.bigo.ads.common.u.b
                public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar2) {
                    return aVar2;
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
                    sg.bigo.ads.common.u.c.a aVar2 = (sg.bigo.ads.common.u.c.a) cVar2;
                    C1268a.this.f102640c = false;
                    String strA = aVar2.a("Content-Type");
                    sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "Content-Type:".concat(String.valueOf(strA)));
                    if (Build.VERSION.SDK_INT == 28 && MimeTypes.IMAGE_WEBP.equalsIgnoreCase(strA)) {
                        C1268a.a(C1268a.this, context, 1303, "Not support parsing webp images in Android P.", strA);
                        return;
                    }
                    C1268a c1268a = C1268a.this;
                    String strA2 = a.a(c1268a.f102638a, c1268a.f102639b);
                    a aVar3 = a.this;
                    Context context2 = context;
                    InputStream inputStream = aVar2.f102757b;
                    sg.bigo.ads.common.c cVarA = inputStream == null ? null : aVar3.a(aVar3.a(inputStream, strA2, context2).getPath(), context2);
                    if (cVarA == null) {
                        C1268a.a(C1268a.this, context, 1304, "Failed to parse image.", strA);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "mimeType:" + cVarA.f102293b);
                    if (q.a((CharSequence) cVarA.f102293b)) {
                        cVarA.f102293b = strA;
                    }
                    a.this.a(context, strA2, cVarA);
                    C1268a.a(C1268a.this, context, cVarA.f102292a, cVarA.f102293b, sg.bigo.ads.common.utils.f.a(a.this.c(context, strA2), 2), cVarA.f102294c);
                    a.this.d(context);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.h hVar) {
                    C1268a.this.f102640c = false;
                    C1268a.a(C1268a.this, context, hVar.f102773a, hVar.getMessage(), "");
                }
            });
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1268a.class != obj.getClass()) {
                return false;
            }
            return this.f102638a.equals(((C1268a) obj).f102638a);
        }

        /* synthetic */ C1268a(a aVar, String str, String str2, boolean z10, g gVar, byte b10) {
            this(str, str2, z10, gVar);
        }

        static /* synthetic */ void a(C1268a c1268a, Context context, int i10, String str, String str2) {
            synchronized (a.this.f102609d) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 5, a.this.a(), "Failed to download image: " + c1268a.f102638a);
                    Iterator<g> it = c1268a.f102643f.iterator();
                    while (it.hasNext()) {
                        it.next().a(i10, str, str2);
                    }
                    a.this.f102606a.remove(c1268a.f102638a);
                    a.this.c(context);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        static /* synthetic */ void a(C1268a c1268a, Context context, final Bitmap bitmap, final String str, final long j10, final String str2) {
            synchronized (a.this.f102609d) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "Succeed to download image: " + c1268a.f102638a);
                    for (final g gVar : c1268a.f102643f) {
                        a.this.f102608c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                gVar.a(bitmap, new f(1, str, j10, str2, C1268a.this.f102638a));
                            }
                        });
                    }
                    a.this.f102606a.remove(c1268a.f102638a);
                    a.this.c(context);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        final void a(g gVar) {
            synchronized (a.this.f102609d) {
                this.f102643f.add(gVar);
            }
        }
    }

    @NonNull
    final File a(@NonNull InputStream inputStream, String str, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th2;
        String strB = b(context);
        sg.bigo.ads.common.utils.f.a(strB, str);
        File file = new File(strB, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                        sg.bigo.ads.common.utils.g.a(fileOutputStream);
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (IOException unused) {
                fileOutputStream2 = fileOutputStream;
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream2);
                return file;
            } catch (Throwable th3) {
                th2 = th3;
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream);
                throw th2;
            }
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            fileOutputStream = null;
            th2 = th4;
        }
    }

    protected abstract String a();

    protected abstract sg.bigo.ads.common.c a(Context context, String str);

    protected abstract void a(Context context);

    protected abstract void a(Context context, String str, sg.bigo.ads.common.c cVar);

    protected abstract int b();

    protected abstract String b(Context context);

    protected abstract void b(Context context, String str);

    protected abstract String c(Context context, String str);

    final synchronized void c(final Context context) {
        try {
            if (this.f102610e.isEmpty()) {
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, a(), "scheduleDownload");
            while (this.f102606a.size() < this.f102607b.f102478a) {
                if (this.f102610e.isEmpty()) {
                    return;
                }
                final C1268a c1268aRemove = this.f102610e.remove(0);
                this.f102606a.put(c1268aRemove.f102638a, c1268aRemove);
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1268aRemove.a(null, context);
                    }
                });
            }
            sg.bigo.ads.common.t.a.a(0, 3, a(), "Current size of waiting list: " + this.f102610e.size());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(final Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f102611f > 3600000) {
            this.f102611f = jCurrentTimeMillis;
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.common.p.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, context);
                }
            });
        }
    }

    public final void e(Context context) {
        synchronized (this.f102609d) {
            this.f102610e.clear();
            this.f102606a.clear();
            a(context);
        }
    }

    static String a(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : String.valueOf(str.hashCode());
    }

    public final boolean d(Context context, String str) {
        String strA = a(str, (String) null);
        return a(context, strA) != null || sg.bigo.ads.common.utils.f.b(c(context, strA));
    }

    final sg.bigo.ads.common.c a(String str, Context context) {
        return this instanceof d ? sg.bigo.ads.common.utils.d.b(str) : sg.bigo.ads.common.utils.d.b(str, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, @Nullable Executor executor, @NonNull String str, @Nullable String str2, boolean z10, g gVar) {
        String str3;
        String str4;
        int i10;
        if (!URLUtil.isNetworkUrl(str)) {
            str3 = "Unknown scheme.";
            str4 = "";
            i10 = Sd.c.f41757e;
        } else {
            if (!this.f102607b.b()) {
                sg.bigo.ads.common.t.a.a(0, 3, a(), "Obtain the bitmap through network.");
                synchronized (this.f102609d) {
                    try {
                        if (this.f102606a.containsKey(str)) {
                            sg.bigo.ads.common.t.a.a(0, 3, a(), "The target url is already in the requesting list: ".concat(String.valueOf(str)));
                            C1268a c1268a = this.f102606a.get(str);
                            if (c1268a != null) {
                                c1268a.a(gVar);
                            }
                        } else {
                            C1268a c1268a2 = new C1268a(this, str, str2, z10, gVar, (byte) 0);
                            int iIndexOf = this.f102610e.indexOf(c1268a2);
                            if (iIndexOf >= 0) {
                                sg.bigo.ads.common.t.a.a(0, 3, a(), "The target url is already in the waiting list: ".concat(String.valueOf(str)));
                                C1268a c1268a3 = this.f102610e.get(iIndexOf);
                                c1268a3.a(gVar);
                                if (executor != null) {
                                    this.f102610e.remove(c1268a3);
                                    a(context, executor, c1268a3);
                                }
                            } else if (executor != null) {
                                a(context, executor, c1268a2);
                            } else {
                                this.f102610e.add(c1268a2);
                                c(context);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            str3 = "Unable to download image.";
            str4 = "";
            i10 = 1302;
        }
        gVar.a(i10, str3, str4);
    }

    public final void a(final Context context, @Nullable final Executor executor, @NonNull final String str, final boolean z10, final g gVar) {
        String strA = a(str, (String) null);
        final sg.bigo.ads.common.c cVarA = a(context, strA);
        if (cVarA != null) {
            if (!cVarA.f102292a.isRecycled()) {
                sg.bigo.ads.common.t.a.a(0, 3, a(), "Get bitmap from cache, mimeType=" + cVarA.f102293b);
                this.f102608c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar2 = gVar;
                        sg.bigo.ads.common.c cVar = cVarA;
                        gVar2.a(cVar.f102292a, new f(2, cVar.f102293b, 0L, cVar.f102294c, str));
                    }
                });
                return;
            }
            b(context, strA);
        }
        if (!sg.bigo.ads.common.utils.f.b(c(context, strA))) {
            a(context, executor, str, null, z10, gVar);
            return;
        }
        final String strA2 = a(str, (String) null);
        final String strC = c(context, strA2);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.2

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f102622g = null;

            @Override // java.lang.Runnable
            public final void run() {
                final sg.bigo.ads.common.c cVarA2 = a.this.a(strC, context);
                if (cVarA2 == null) {
                    a.this.a(context, executor, str, this.f102622g, z10, gVar);
                    return;
                }
                a.this.a(context, strA2, cVarA2);
                final long jA = sg.bigo.ads.common.utils.f.a(strC, 2);
                sg.bigo.ads.common.t.a.a(0, 3, a.this.a(), "Obtain the bitmap from local file, mimeType=" + cVarA2.f102293b);
                a.this.f102608c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        g gVar2 = gVar;
                        sg.bigo.ads.common.c cVar = cVarA2;
                        gVar2.a(cVar.f102292a, new f(0, cVar.f102293b, jA, cVar.f102294c, str));
                    }
                });
                new File(strC).setLastModified(System.currentTimeMillis());
                a.this.d(context);
            }
        });
    }

    private synchronized void a(final Context context, @NonNull final Executor executor, final C1268a c1268a) {
        if (executor == null || c1268a == null) {
            return;
        }
        this.f102606a.put(c1268a.f102638a, c1268a);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.3
            @Override // java.lang.Runnable
            public final void run() {
                c1268a.a(executor, context);
            }
        });
    }

    public final void a(sg.bigo.ads.common.h.a.a aVar) {
        this.f102607b = aVar;
    }

    static /* synthetic */ void a(a aVar, Context context) {
        File[] fileArrListFiles;
        if (sg.bigo.ads.common.n.d.b()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, aVar.a(), "Start check and delete expired images.");
        File file = new File(aVar.b(context));
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: sg.bigo.ads.common.p.a.6
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                long jLastModified = file2.lastModified() - file3.lastModified();
                if (jLastModified > 0) {
                    return -1;
                }
                return jLastModified == 0 ? 0 : 1;
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f102607b.f102481d;
        for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
            File file2 = fileArrListFiles[i10];
            if (i10 >= aVar.b() || file2.lastModified() <= jCurrentTimeMillis) {
                file2.delete();
            }
        }
    }

    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f102609d) {
            try {
                zContainsKey = this.f102606a.containsKey(str);
                if (!zContainsKey) {
                    Iterator<C1268a> it = this.f102610e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (TextUtils.equals(it.next().f102638a, str)) {
                            zContainsKey = true;
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        return zContainsKey;
    }
}
