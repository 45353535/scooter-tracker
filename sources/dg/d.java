package dg;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class d implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f68669d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f68670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f68671c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(long j10, long j11) {
        this.f68670b = j10;
        this.f68671c = j11;
    }

    private final Object readResolve() {
        return dg.a.f68665d.a(this.f68670b, this.f68671c);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f68670b = input.readLong();
        this.f68671c = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.f68670b);
        output.writeLong(this.f68671c);
    }
}
