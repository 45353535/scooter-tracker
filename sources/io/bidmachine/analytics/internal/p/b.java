package io.bidmachine.analytics.internal.p;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import uf.r;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f79702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f79703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f79704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Job f79705d;

    public interface a {
        b a();
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p.b$b, reason: collision with other inner class name */
    static final class C0959b extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f79707b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79709d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0959b(String str, Continuation continuation) {
            super(2, continuation);
            this.f79709d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0959b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C0959b c0959b = b.this.new C0959b(this.f79709d, continuation);
            c0959b.f79707b = obj;
            return c0959b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f79706a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            f fVar = b.this.f79703b;
            b bVar = b.this;
            String str = this.f79709d;
            synchronized (fVar) {
                try {
                    Result.Companion companion = Result.f93230c;
                    InputStream inputStreamA = bVar.f79703b.a(StringsKt.split$default(io.bidmachine.analytics.internal.a.e.b(str), new String[]{" "}, false, 0, 6, null));
                    Unit unit = null;
                    BufferedReader bufferedReader = inputStreamA != null ? new BufferedReader(new InputStreamReader(inputStreamA, Charsets.UTF_8), 8192) : null;
                    if (bufferedReader != null) {
                        try {
                            bVar.a(str, r.e(bufferedReader));
                            Unit unit2 = Unit.f93236a;
                            uf.c.a(bufferedReader, null);
                        } finally {
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        unit = Unit.f93236a;
                    }
                    Result.b(unit);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(kotlin.d.a(th2));
                }
            }
            return Unit.f93236a;
        }
    }

    public b(e eVar, f fVar, CoroutineScope coroutineScope) {
        this.f79702a = eVar;
        this.f79703b = fVar;
        this.f79704c = coroutineScope;
    }

    private final boolean b() {
        Job job = this.f79705d;
        return job != null && job.isActive();
    }

    public final void a(String str) {
        Job job = this.f79705d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f79705d = eg.i.d(this.f79704c, null, null, new C0959b(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Sequence sequence) {
        Iterator it = sequence.iterator();
        while (b() && it.hasNext()) {
            this.f79702a.a(str, (String) it.next());
        }
    }

    public final void a() {
        Job job = this.f79705d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f79705d = null;
        synchronized (this.f79703b) {
            try {
                Result.Companion companion = Result.f93230c;
                this.f79703b.a();
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
    }
}
