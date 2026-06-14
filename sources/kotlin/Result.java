package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Result implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Companion f93230c = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f93231b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006H\u0087\b¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Result$Companion;", "", "<init>", "()V", "success", "Lkotlin/Result;", "T", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", "exception", "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> Object failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return Result.b(d.a(exception));
        }

        private final <T> Object success(T value) {
            return Result.b(value);
        }

        private Companion() {
        }
    }

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f93232b;

        public a(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f93232b = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f93232b, ((a) obj).f93232b);
        }

        public int hashCode() {
            return this.f93232b.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f93232b + ')';
        }
    }

    private /* synthetic */ Result(Object obj) {
        this.f93231b = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).l());
    }

    public static final boolean d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final Throwable g(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f93232b;
        }
        return null;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof a;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof a);
    }

    public static String k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f93231b, obj);
    }

    public int hashCode() {
        return h(this.f93231b);
    }

    public final /* synthetic */ Object l() {
        return this.f93231b;
    }

    public String toString() {
        return k(this.f93231b);
    }
}
