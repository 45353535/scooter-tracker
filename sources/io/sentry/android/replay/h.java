package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.v7;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.b1;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f83031m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f83032n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.protocol.x f83034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f83035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f83036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.a f83037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.a f83038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.sentry.android.replay.video.c f83039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f83040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f83041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashMap f83042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f83043l;

    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.h$a$a, reason: collision with other inner class name */
        public static final class C1003a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return mf.a.d(Long.valueOf(((i) obj).c()), Long.valueOf(((i) obj2).c()));
            }
        }

        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return mf.a.d(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(h hVar, File file, String str) throws Exception {
            Intrinsics.checkNotNull(str);
            if (StringsKt.M(str, ".jpg", false, 2, null)) {
                File file2 = new File(file, str);
                Long lX = StringsKt.x(uf.i.z(file2));
                if (lX != null) {
                    h.h(hVar, file2, lX.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:89:0x0205  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.sentry.android.replay.d c(io.sentry.v7 r26, io.sentry.protocol.x r27, kotlin.jvm.functions.Function1 r28) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 581
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.h.a.c(io.sentry.v7, io.sentry.protocol.x, kotlin.jvm.functions.Function1):io.sentry.android.replay.d");
        }

        public final File d(v7 options, io.sentry.protocol.x replayId) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(g7.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.checkNotNull(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() throws IOException {
            if (h.this.z() == null) {
                return null;
            }
            File file = new File(h.this.z(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f83045f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return ((String) entry.getKey()) + D5.T + ((String) entry.getValue());
        }
    }

    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return h.f83031m.d(h.this.f83033b, h.this.f83034c);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f83047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f83048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f83049h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, h hVar, Ref$ObjectRef ref$ObjectRef) {
            super(1);
            this.f83047f = j10;
            this.f83048g = hVar;
            this.f83049h = ref$ObjectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c() < this.f83047f) {
                this.f83048g.p(it.b());
                return Boolean.TRUE;
            }
            Ref$ObjectRef ref$ObjectRef = this.f83049h;
            if (ref$ObjectRef.f93280b == null) {
                ref$ObjectRef.f93280b = it.a();
            }
            return Boolean.FALSE;
        }
    }

    public h(v7 options, io.sentry.protocol.x replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f83033b = options;
        this.f83034c = replayId;
        this.f83035d = new AtomicBoolean(false);
        this.f83036e = new io.sentry.util.a();
        this.f83037f = new io.sentry.util.a();
        this.f83038g = new io.sentry.util.a();
        this.f83040i = lf.i.a(new d());
        this.f83041j = new ArrayList();
        this.f83042k = new LinkedHashMap();
        this.f83043l = lf.i.a(new b());
    }

    public static /* synthetic */ void h(h hVar, File file, long j10, String str, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str = null;
        }
        hVar.f(file, j10, str);
    }

    public static /* synthetic */ io.sentry.android.replay.c o(h hVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, File file, int i15, Object obj) {
        int i16;
        File file2;
        if ((i15 & 128) != 0) {
            File fileZ = hVar.z();
            StringBuilder sb2 = new StringBuilder();
            i16 = i10;
            sb2.append(i16);
            sb2.append(".mp4");
            file2 = new File(fileZ, sb2.toString());
        } else {
            i16 = i10;
            file2 = file;
        }
        return hVar.n(j10, j11, i16, i11, i12, i13, i14, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.f83033b.getLogger().c(g7.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f83033b.getLogger().b(g7.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean q(i iVar) {
        if (iVar == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(iVar.b().getAbsolutePath());
            g1 g1VarD = this.f83036e.d();
            try {
                io.sentry.android.replay.video.c cVar = this.f83039h;
                if (cVar != null) {
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    cVar.b(bitmapDecodeFile);
                    Unit unit = Unit.f93236a;
                }
                wf.a.a(g1VarD, null);
                bitmapDecodeFile.recycle();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.f83033b.getLogger().a(g7.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th2);
            return false;
        }
    }

    public final void M(String key, String str) throws Exception {
        File fileY;
        File fileY2;
        Intrinsics.checkNotNullParameter(key, "key");
        g1 g1VarD = this.f83037f.d();
        try {
            if (this.f83035d.get()) {
                wf.a.a(g1VarD, null);
                return;
            }
            File fileY3 = y();
            if ((fileY3 == null || !fileY3.exists()) && (fileY = y()) != null) {
                fileY.createNewFile();
            }
            if (this.f83042k.isEmpty() && (fileY2 = y()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileY2), Charsets.UTF_8), 8192);
                try {
                    Sequence sequenceE = uf.r.e(bufferedReader);
                    LinkedHashMap linkedHashMap = this.f83042k;
                    Iterator it = sequenceE.iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt.split$default((String) it.next(), new String[]{C4240b4.j.f42668b}, false, 2, 2, null);
                        Pair pair = TuplesKt.to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    uf.c.a(bufferedReader, null);
                } finally {
                }
            }
            if (str == null) {
                this.f83042k.remove(key);
            } else {
                this.f83042k.put(key, str);
            }
            File fileY4 = y();
            if (fileY4 != null) {
                Set setEntrySet = this.f83042k.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                uf.i.p(fileY4, CollectionsKt.joinToString$default(setEntrySet, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, c.f83045f, 30, null), null, 2, null);
                Unit unit = Unit.f93236a;
            }
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    public final String R(long j10) throws Exception {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        g1 g1VarD = this.f83038g.d();
        try {
            CollectionsKt.removeAll(this.f83041j, (Function1) new e(j10, this, ref$ObjectRef));
            wf.a.a(g1VarD, null);
            return (String) ref$ObjectRef.f93280b;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        g1 g1VarD = this.f83036e.d();
        try {
            io.sentry.android.replay.video.c cVar = this.f83039h;
            if (cVar != null) {
                cVar.i();
            }
            this.f83039h = null;
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
            this.f83035d.set(true);
        } finally {
        }
    }

    public final void f(File screenshot, long j10, String str) throws Exception {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        i iVar = new i(screenshot, j10, str);
        g1 g1VarD = this.f83038g.d();
        try {
            this.f83041j.add(iVar);
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    public final void m(Bitmap bitmap, long j10, String str) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (z() == null || bitmap.isRecycled()) {
            return;
        }
        File fileZ = z();
        if (fileZ != null) {
            fileZ.mkdirs();
        }
        File file = new File(z(), j10 + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.f83033b.getSessionReplay().h().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                Unit unit = Unit.f93236a;
                uf.c.a(fileOutputStream, null);
                f(file, j10, str);
            } finally {
            }
        }
    }

    public final io.sentry.android.replay.c n(long j10, long j11, int i10, int i11, int i12, int i13, int i14, File videoFile) throws Exception {
        g1 g1Var;
        int i15;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        g1 g1VarD = this.f83038g.d();
        try {
            List arrayList = this.f83041j.isEmpty() ? new ArrayList() : CollectionsKt.toMutableList((Collection) this.f83041j);
            wf.a.a(g1VarD, null);
            if (arrayList.isEmpty()) {
                this.f83033b.getLogger().c(g7.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            g1 g1VarD2 = this.f83036e.d();
            try {
                g1Var = g1VarD2;
            } catch (Throwable th2) {
                th = th2;
                g1Var = g1VarD2;
            }
            try {
                io.sentry.android.replay.video.c cVar = new io.sentry.android.replay.video.c(this.f83033b, new io.sentry.android.replay.video.a(videoFile, i12, i11, i13, i14, null, 32, null), null, 4, null);
                cVar.j();
                wf.a.a(g1Var, null);
                this.f83039h = cVar;
                long j12 = ((long) 1000) / ((long) i13);
                Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                long j13 = j11 + j10;
                kotlin.ranges.e eVarU = kotlin.ranges.g.u(kotlin.ranges.g.w(j11, j13), j12);
                long jE = eVarU.e();
                long jF = eVarU.f();
                long jG = eVarU.g();
                if ((jG <= 0 || jE > jF) && (jG >= 0 || jF > jE)) {
                    i15 = 0;
                } else {
                    long j14 = jE;
                    int i16 = 0;
                    while (true) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            i iVar = (i) it.next();
                            long j15 = j14 + j12;
                            long jC = iVar.c();
                            if (j14 <= jC && jC <= j15) {
                                objFirstOrNull = iVar;
                                break;
                            }
                            if (iVar.c() > j15) {
                                break;
                            }
                        }
                        if (q((i) objFirstOrNull)) {
                            i16++;
                        } else if (objFirstOrNull != null) {
                            p(((i) objFirstOrNull).b());
                            g1VarD = this.f83038g.d();
                            try {
                                b1.a(this.f83041j).remove(objFirstOrNull);
                                wf.a.a(g1VarD, null);
                                arrayList.remove(objFirstOrNull);
                                objFirstOrNull = null;
                            } finally {
                            }
                        }
                        if (j14 == jF) {
                            break;
                        }
                        j14 += jG;
                    }
                    i15 = i16;
                }
                if (i15 == 0) {
                    this.f83033b.getLogger().c(g7.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    p(videoFile);
                    return null;
                }
                g1VarD = this.f83036e.d();
                try {
                    io.sentry.android.replay.video.c cVar2 = this.f83039h;
                    if (cVar2 != null) {
                        cVar2.i();
                    }
                    io.sentry.android.replay.video.c cVar3 = this.f83039h;
                    long jC2 = cVar3 != null ? cVar3.c() : 0L;
                    this.f83039h = null;
                    Unit unit = Unit.f93236a;
                    wf.a.a(g1VarD, null);
                    R(j13);
                    return new io.sentry.android.replay.c(videoFile, i15, jC2);
                } finally {
                }
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                try {
                    throw th4;
                } catch (Throwable th5) {
                    wf.a.a(g1Var, th4);
                    throw th5;
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final Long s() throws Exception {
        g1 g1VarD = this.f83038g.d();
        try {
            i iVar = (i) CollectionsKt.firstOrNull(this.f83041j);
            Long lValueOf = iVar != null ? Long.valueOf(iVar.c()) : null;
            wf.a.a(g1VarD, null);
            return lValueOf;
        } finally {
        }
    }

    public final List w() {
        return this.f83041j;
    }

    public final File y() {
        return (File) this.f83043l.getValue();
    }

    public final File z() {
        return (File) this.f83040i.getValue();
    }
}
