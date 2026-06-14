package oe;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import ve.g;
import ye.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    public static final class a extends c.AbstractC1337c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Long f96822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve.g f96823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f96824c;

        a(re.d dVar, ve.g gVar, Object obj) {
            this.f96824c = obj;
            String strJ = dVar.getHeaders().j(ve.u.f106718a.g());
            this.f96822a = strJ != null ? Long.valueOf(Long.parseLong(strJ)) : null;
            this.f96823b = gVar == null ? g.a.f106629a.a() : gVar;
        }

        @Override // ye.c
        public Long a() {
            return this.f96822a;
        }

        @Override // ye.c
        public ve.g b() {
            return this.f96823b;
        }

        @Override // ye.c.AbstractC1337c
        public io.ktor.utils.io.e d() {
            return p002if.c.c((InputStream) this.f96824c, null, null, 3, null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96825r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96826s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96827t;

        public static final class a extends InputStream implements AutoCloseable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InputStream f96828b;

            a(InputStream inputStream) {
                this.f96828b = inputStream;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f96828b.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                this.f96828b.close();
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f96828b.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b10, int i10, int i11) {
                Intrinsics.checkNotNullParameter(b10, "b");
                return this.f96828b.read(b10, i10, i11);
            }
        }

        b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.d dVar, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f96826s = eVar;
            bVar.f96827t = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96825r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ef.e eVar = (ef.e) this.f96826s;
                se.d dVar = (se.d) this.f96827t;
                ff.a aVarA = dVar.a();
                Object objB = dVar.b();
                if (!(objB instanceof io.ktor.utils.io.e)) {
                    return Unit.f93236a;
                }
                if (Intrinsics.areEqual(aVarA.a(), kotlin.jvm.internal.v0.b(InputStream.class))) {
                    se.d dVar2 = new se.d(aVarA, new a(p002if.a.a((io.ktor.utils.io.e) objB, (Job) ((je.b) eVar.b()).getCoroutineContext().get(Job.N8))));
                    this.f96826s = null;
                    this.f96825r = 1;
                    if (eVar.e(dVar2, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final ye.c a(ve.g gVar, re.d context, Object body) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        if (body instanceof InputStream) {
            return new a(context, gVar, body);
        }
        return null;
    }

    public static final void b(ie.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.w().l(se.f.f100026g.a(), new b(null));
    }
}
