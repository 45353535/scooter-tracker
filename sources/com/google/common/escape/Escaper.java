package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes9.dex */
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Escaper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function f30506a = new Function() { // from class: com.google.common.escape.a
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return this.f30515b.escape((String) obj);
        }
    };

    protected Escaper() {
    }

    public final Function<String, String> asFunction() {
        return this.f30506a;
    }

    public abstract String escape(String str);
}
