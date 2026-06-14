package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f93262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext.Element f93263c;

    private static final class a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C1065a f93264c = new C1065a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoroutineContext[] f93265b;

        /* JADX INFO: renamed from: kotlin.coroutines.c$a$a, reason: collision with other inner class name */
        public static final class C1065a {
            public /* synthetic */ C1065a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1065a() {
            }
        }

        public a(CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f93265b = elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f93265b;
            CoroutineContext coroutineContextPlus = e.f93267b;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    public c(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f93262b = left;
        this.f93263c = element;
    }

    private final boolean c(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean g(c cVar) {
        while (c(cVar.f93263c)) {
            CoroutineContext coroutineContext = cVar.f93262b;
            if (!(coroutineContext instanceof c)) {
                Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((CoroutineContext.Element) coroutineContext);
            }
            cVar = (c) coroutineContext;
        }
        return false;
    }

    private final int i() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f93262b;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(CoroutineContext[] coroutineContextArr, t0 t0Var, Unit unit, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(element, "element");
        int i10 = t0Var.f93331b;
        t0Var.f93331b = i10 + 1;
        coroutineContextArr[i10] = element;
        return Unit.f93236a;
    }

    private final Object writeReplace() {
        int i10 = i();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[i10];
        final t0 t0Var = new t0();
        fold(Unit.f93236a, new Function2() { // from class: of.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return kotlin.coroutines.c.k(coroutineContextArr, t0Var, (Unit) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (t0Var.f93331b == i10) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.i() == i() && cVar.g(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f93262b.fold(obj, operation), this.f93263c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f93263c.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f93262b;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f93262b.hashCode() + this.f93263c.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f93263c.get(key) != null) {
            return this.f93262b;
        }
        CoroutineContext coroutineContextMinusKey = this.f93262b.minusKey(key);
        return coroutineContextMinusKey == this.f93262b ? this : coroutineContextMinusKey == e.f93267b ? this.f93263c : new c(coroutineContextMinusKey, this.f93263c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.b(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold("", new Function2() { // from class: of.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return kotlin.coroutines.c.j((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }
}
