package p002if;

import eg.h;
import io.ktor.utils.io.e;
import io.ktor.utils.io.f;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import pf.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final InputStream a(e eVar, Job job) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new C0923a(eVar);
    }

    /* JADX INFO: renamed from: if.a$a, reason: collision with other inner class name */
    public static final class C0923a extends InputStream implements AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f74725b;

        /* JADX INFO: renamed from: if.a$a$a, reason: collision with other inner class name */
        static final class C0924a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f74726r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ e f74727s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0924a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f74727s = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0924a(this.f74727s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = b.g();
                int i10 = this.f74726r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    return obj;
                }
                d.b(obj);
                e eVar = this.f74727s;
                this.f74726r = 1;
                Object objA = e.b.a(eVar, 0, this, 1, null);
                return objA == objG ? objG : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0924a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        C0923a(e eVar) {
            this.f74725b = eVar;
        }

        private final void m() {
            h.b(null, new C0924a(this.f74725b, null), 1, null);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f.a(this.f74725b);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f74725b.h()) {
                return -1;
            }
            if (this.f74725b.g().exhausted()) {
                m();
            }
            if (this.f74725b.h()) {
                return -1;
            }
            return this.f74725b.g().readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] b10, int i10, int i11) {
            Intrinsics.checkNotNullParameter(b10, "b");
            if (this.f74725b.h()) {
                return -1;
            }
            if (this.f74725b.g().exhausted()) {
                m();
            }
            int iJ0 = this.f74725b.g().j0(b10, i10, Math.min(io.ktor.utils.io.h.e(this.f74725b), i11) + i10);
            return iJ0 >= 0 ? iJ0 : this.f74725b.h() ? -1 : 0;
        }
    }
}
