package kotlinx.coroutines;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f93616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f93618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f93619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f93620e;

    public h(Object obj, d dVar, Function3 function3, Object obj2, Throwable th2) {
        this.f93616a = obj;
        this.f93617b = dVar;
        this.f93618c = function3;
        this.f93619d = obj2;
        this.f93620e = th2;
    }

    public static /* synthetic */ h b(h hVar, Object obj, d dVar, Function3 function3, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = hVar.f93616a;
        }
        if ((i10 & 2) != 0) {
            dVar = hVar.f93617b;
        }
        if ((i10 & 4) != 0) {
            function3 = hVar.f93618c;
        }
        if ((i10 & 8) != 0) {
            obj2 = hVar.f93619d;
        }
        if ((i10 & 16) != 0) {
            th2 = hVar.f93620e;
        }
        Throwable th3 = th2;
        Function3 function32 = function3;
        return hVar.a(obj, dVar, function32, obj2, th3);
    }

    public final h a(Object obj, d dVar, Function3 function3, Object obj2, Throwable th2) {
        return new h(obj, dVar, function3, obj2, th2);
    }

    public final boolean c() {
        return this.f93620e != null;
    }

    public final void d(e eVar, Throwable th2) {
        d dVar = this.f93617b;
        if (dVar != null) {
            eVar.l(dVar, th2);
        }
        Function3 function3 = this.f93618c;
        if (function3 != null) {
            eVar.m(function3, th2, this.f93616a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f93616a, hVar.f93616a) && Intrinsics.areEqual(this.f93617b, hVar.f93617b) && Intrinsics.areEqual(this.f93618c, hVar.f93618c) && Intrinsics.areEqual(this.f93619d, hVar.f93619d) && Intrinsics.areEqual(this.f93620e, hVar.f93620e);
    }

    public int hashCode() {
        Object obj = this.f93616a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f93617b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Function3 function3 = this.f93618c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f93619d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f93620e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f93616a + ", cancelHandler=" + this.f93617b + ", onCancellation=" + this.f93618c + ", idempotentResume=" + this.f93619d + ", cancelCause=" + this.f93620e + ')';
    }

    public /* synthetic */ h(Object obj, d dVar, Function3 function3, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
