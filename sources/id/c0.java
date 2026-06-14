package id;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f74395e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f74396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f74398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f74399d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c0(d0 eventTaskType, String target, Object obj, List stateGroups) {
        Intrinsics.checkNotNullParameter(eventTaskType, "eventTaskType");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        this.f74396a = eventTaskType;
        this.f74397b = target;
        this.f74398c = obj;
        this.f74399d = stateGroups;
    }

    public final d0 a() {
        return this.f74396a;
    }

    public final List b() {
        return this.f74399d;
    }

    public final String c() {
        return this.f74397b;
    }

    public final Object d() {
        return this.f74398c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f74396a == c0Var.f74396a && Intrinsics.areEqual(this.f74397b, c0Var.f74397b) && Intrinsics.areEqual(this.f74398c, c0Var.f74398c) && Intrinsics.areEqual(this.f74399d, c0Var.f74399d);
    }

    public int hashCode() {
        int iHashCode = ((this.f74396a.hashCode() * 31) + this.f74397b.hashCode()) * 31;
        Object obj = this.f74398c;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.f74399d.hashCode();
    }

    public String toString() {
        return "EventTaskParams(eventTaskType=" + this.f74396a + ", target=" + this.f74397b + ", value=" + this.f74398c + ", stateGroups=" + this.f74399d + ')';
    }
}
