package f1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f71550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f71551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f71552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71553d;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71554f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new URL(it);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f71555f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke(InputStream it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BitmapFactory.decodeStream(it);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f71556r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f71557s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f71558t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f71559u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f71561w;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f71562r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f71563s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ URL f71564t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f71565u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f71566v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ x9 f71567w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref$ObjectRef ref$ObjectRef, URL url, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, x9 x9Var, Continuation continuation) {
                super(2, continuation);
                this.f71563s = ref$ObjectRef;
                this.f71564t = url;
                this.f71565u = ref$ObjectRef2;
                this.f71566v = ref$ObjectRef3;
                this.f71567w = x9Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f71563s, this.f71564t, this.f71565u, this.f71566v, this.f71567w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws IOException {
                Bitmap bitmap;
                pf.b.g();
                if (this.f71562r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Ref$ObjectRef ref$ObjectRef = this.f71563s;
                URLConnection uRLConnectionOpenConnection = this.f71564t.openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                Ref$ObjectRef ref$ObjectRef2 = this.f71566v;
                httpsURLConnection.setDoInput(true);
                ref$ObjectRef2.f93280b = httpsURLConnection.getInputStream();
                ref$ObjectRef.f93280b = httpsURLConnection;
                Ref$ObjectRef ref$ObjectRef3 = this.f71565u;
                InputStream inputStream = (InputStream) this.f71566v.f93280b;
                if (inputStream == null || (bitmap = (Bitmap) this.f71567w.f71552c.invoke(inputStream)) == null) {
                    throw new IOException("Bitmap decoded to null");
                }
                ref$ObjectRef3.f93280b = bitmap;
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.f71561w = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return x9.this.new c(this.f71561w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[PHI: r3 r13
  0x009a: PHI (r3v4 kotlin.jvm.internal.Ref$ObjectRef) = (r3v3 kotlin.jvm.internal.Ref$ObjectRef), (r3v6 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:34:0x0098, B:23:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r13v15 javax.net.ssl.HttpsURLConnection) = (r13v14 javax.net.ssl.HttpsURLConnection), (r13v20 javax.net.ssl.HttpsURLConnection) binds: [B:34:0x0098, B:23:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r12.f71559u
                r2 = 1
                if (r1 == 0) goto L2d
                if (r1 != r2) goto L25
                java.lang.Object r0 = r12.f71558t
                r1 = r0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r0 = r12.f71557s
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r0 = r12.f71556r
                r3 = r0
                kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
                kotlin.d.b(r13)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L22
                goto L6e
            L1e:
                r0 = move-exception
                r13 = r0
                goto La0
            L22:
                r0 = move-exception
                r13 = r0
                goto L86
            L25:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L2d:
                kotlin.d.b(r13)
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                r4.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
                r7.<init>()
                f1.x9 r13 = f1.x9.this     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                kotlin.jvm.functions.Function1 r13 = f1.x9.d(r13)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                java.lang.String r1 = r12.f71561w     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                java.lang.Object r13 = r13.invoke(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                r5 = r13
                java.net.URL r5 = (java.net.URL) r5     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                f1.x9 r13 = f1.x9.this     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                long r10 = f1.x9.c(r13)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                f1.x9$c$a r3 = new f1.x9$c$a     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                f1.x9 r8 = f1.x9.this     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                r9 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                r12.f71556r = r6     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                r12.f71557s = r4     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                r12.f71558t = r7     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                r12.f71559u = r2     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                java.lang.Object r13 = eg.x1.c(r10, r3, r12)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
                if (r13 != r0) goto L6b
                return r0
            L6b:
                r2 = r4
                r3 = r6
                r1 = r7
            L6e:
                java.lang.Object r13 = r1.f93280b
                java.io.InputStream r13 = (java.io.InputStream) r13
                if (r13 == 0) goto L77
                r13.close()
            L77:
                java.lang.Object r13 = r2.f93280b
                javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13
                if (r13 == 0) goto L9d
                goto L9a
            L7e:
                r0 = move-exception
                r13 = r0
                goto La2
            L81:
                r0 = move-exception
                r13 = r0
                r2 = r4
                r3 = r6
                r1 = r7
            L86:
                java.lang.String r0 = "Unable to download the info icon image"
                f1.eg.o(r0, r13)     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r13 = r1.f93280b
                java.io.InputStream r13 = (java.io.InputStream) r13
                if (r13 == 0) goto L94
                r13.close()
            L94:
                java.lang.Object r13 = r2.f93280b
                javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13
                if (r13 == 0) goto L9d
            L9a:
                r13.disconnect()
            L9d:
                java.lang.Object r13 = r3.f93280b
                return r13
            La0:
                r7 = r1
                r4 = r2
            La2:
                java.lang.Object r0 = r7.f93280b
                java.io.InputStream r0 = (java.io.InputStream) r0
                if (r0 == 0) goto Lab
                r0.close()
            Lab:
                java.lang.Object r0 = r4.f93280b
                javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0
                if (r0 == 0) goto Lb4
                r0.disconnect()
            Lb4:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.x9.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public x9(CoroutineDispatcher ioDispatcher, Function1 urlFactory, Function1 bitmapFactory) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        this.f71550a = ioDispatcher;
        this.f71551b = urlFactory;
        this.f71552c = bitmapFactory;
        this.f71553d = 1000L;
    }

    public final Object a(String str, Continuation continuation) {
        return eg.g.g(this.f71550a, new c(str, null), continuation);
    }

    public /* synthetic */ x9(CoroutineDispatcher coroutineDispatcher, Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? eg.o0.b() : coroutineDispatcher, (i10 & 2) != 0 ? a.f71554f : function1, (i10 & 4) != 0 ? b.f71555f : function12);
    }
}
