package io.ktor.utils.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f82204d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c0 f82205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f82206c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public z(c0 c0Var, Object obj) {
        this.f82205b = c0Var;
        this.f82206c = obj;
    }

    private final Object readResolve() {
        Object obj = this.f82206c;
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(in, "in");
        Object object = in.readObject();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type io.ktor.utils.io.JvmSerializer<T of io.ktor.utils.io.DefaultJvmSerializerReplacement>");
        c0 c0Var = (c0) object;
        this.f82205b = c0Var;
        Intrinsics.checkNotNull(c0Var);
        Object object2 = in.readObject();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.ByteArray");
        this.f82206c = c0Var.n0((byte[]) object2);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeObject(this.f82205b);
        c0 c0Var = this.f82205b;
        Intrinsics.checkNotNull(c0Var);
        Object obj = this.f82206c;
        Intrinsics.checkNotNull(obj);
        out.writeObject(c0Var.z(obj));
    }
}
