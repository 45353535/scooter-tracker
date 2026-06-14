package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.r;
import io.sentry.b1;
import io.sentry.d4;
import io.sentry.i0;
import io.sentry.j4;
import io.sentry.protocol.x;
import io.sentry.v7;
import io.sentry.w7;
import io.sentry.y0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f82982a = a.f82983a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f82983a = new a();

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$a, reason: collision with other inner class name */
        static final class C1001a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Date f82984f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f82985g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1001a(Date date, List list) {
                super(1);
                this.f82984f = date;
                this.f82985g = list;
            }

            public final void a(io.sentry.rrweb.b event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.e() >= this.f82984f.getTime()) {
                    this.f82985g.add(event);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((io.sentry.rrweb.b) obj);
                return Unit.f93236a;
            }
        }

        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return mf.a.d(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final io.sentry.android.replay.capture.h.c b(io.sentry.v7 r19, java.io.File r20, io.sentry.protocol.x r21, java.util.Date r22, int r23, int r24, int r25, int r26, int r27, long r28, io.sentry.w7.b r30, java.lang.String r31, java.util.List r32, java.util.Deque r33) {
            /*
                Method dump skipped, instruction units count: 401
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.h.a.b(io.sentry.v7, java.io.File, io.sentry.protocol.x, java.util.Date, int, int, int, int, int, long, io.sentry.w7$b, java.lang.String, java.util.List, java.util.Deque):io.sentry.android.replay.capture.h$c");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Ref$ObjectRef ref$ObjectRef, y0 scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            ref$ObjectRef.f93280b = new ArrayList(scope.h());
        }

        private final boolean e(io.sentry.e eVar) {
            if (eVar == null || !Intrinsics.areEqual(eVar.k(), "network.event")) {
                return false;
            }
            Map mapM = eVar.m();
            Intrinsics.checkNotNullExpressionValue(mapM, "getData(...)");
            Object obj = mapM.get("action");
            if (obj == null) {
                obj = null;
            }
            return Intrinsics.areEqual(obj, "NETWORK_AVAILABLE");
        }

        private final boolean f(io.sentry.e eVar) {
            return Intrinsics.areEqual(eVar.k(), "network.event") && eVar.m().containsKey("network_type");
        }

        public static /* synthetic */ void h(a aVar, Deque deque, long j10, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                function1 = null;
            }
            aVar.g(deque, j10, function1);
        }

        public final c c(b1 b1Var, v7 options, long j10, Date currentSegmentTimestamp, x replayId, int i10, int i11, int i12, w7.b replayType, io.sentry.android.replay.h hVar, int i13, int i14, String str, List list, Deque events) {
            io.sentry.android.replay.c cVarO;
            List list2;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (hVar == null || (cVarO = io.sentry.android.replay.h.o(hVar, Math.min(j10, 300000L), currentSegmentTimestamp.getTime(), i10, i11, i12, i13, i14, null, 128, null)) == null) {
                return c.b.f82988a;
            }
            File fileA = cVarO.a();
            int iB = cVarO.b();
            long jC = cVarO.c();
            if (list == null) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f93280b = CollectionsKt.emptyList();
                if (b1Var != null) {
                    b1Var.x(new j4() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.j4
                        public final void a(y0 y0Var) {
                            h.a.d(ref$ObjectRef, y0Var);
                        }
                    });
                }
                list2 = (List) ref$ObjectRef.f93280b;
            } else {
                list2 = list;
            }
            return b(options, fileA, replayId, currentSegmentTimestamp, i10, i11, i12, iB, i13, jC, replayType, str, list2, events);
        }

        public final void g(Deque events, long j10, Function1 function1) {
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) it.next();
                if (bVar.e() < j10) {
                    if (function1 != null) {
                        Intrinsics.checkNotNull(bVar);
                        function1.invoke(bVar);
                    }
                    it.remove();
                }
            }
        }
    }

    public static final class b {
        public static /* synthetic */ void a(h hVar, int i10, x xVar, w7.b bVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                xVar = new x();
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            hVar.f(i10, xVar, bVar);
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final w7 f82986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final d4 f82987b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w7 replay, d4 recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.f82986a = replay;
                this.f82987b = recording;
            }

            public static /* synthetic */ void b(a aVar, b1 b1Var, i0 i0Var, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    i0Var = new i0();
                }
                aVar.a(b1Var, i0Var);
            }

            public final void a(b1 b1Var, i0 hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (b1Var != null) {
                    w7 w7Var = this.f82986a;
                    hint.l(this.f82987b);
                    Unit unit = Unit.f93236a;
                    b1Var.y(w7Var, hint);
                }
            }

            public final w7 c() {
                return this.f82986a;
            }

            public final void d(int i10) {
                this.f82986a.o0(i10);
                List<io.sentry.rrweb.b> listA = this.f82987b.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).C(i10);
                        }
                    }
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f82986a, aVar.f82986a) && Intrinsics.areEqual(this.f82987b, aVar.f82987b);
            }

            public int hashCode() {
                return (this.f82986a.hashCode() * 31) + this.f82987b.hashCode();
            }

            public String toString() {
                return "Created(replay=" + this.f82986a + ", recording=" + this.f82987b + ')';
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f82988a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    void a(r rVar);

    void b(int i10);

    int c();

    void d(Bitmap bitmap, Function2 function2);

    h e();

    void f(int i10, x xVar, w7.b bVar);

    x g();

    void h(boolean z10, Function1 function1);

    void i(Date date);

    void onTouchEvent(MotionEvent motionEvent);

    void pause();

    void resume();

    void stop();
}
