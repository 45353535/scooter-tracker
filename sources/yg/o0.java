package yg;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public interface o0 extends KSerializer {

    public static final class a {
        public static KSerializer[] a(o0 o0Var) {
            return n0.a(o0Var);
        }
    }

    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
