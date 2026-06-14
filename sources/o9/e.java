package o9;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o9.f;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableList f96385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f96386b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f96387c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.a f96388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.a f96389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f96390f;

    public e(ImmutableList immutableList) {
        this.f96385a = immutableList;
        f.a aVar = f.a.f96392e;
        this.f96388d = aVar;
        this.f96389e = aVar;
        this.f96390f = false;
    }

    private int c() {
        return this.f96387c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.f96387c[i10].hasRemaining()) {
                    f fVar = (f) this.f96386b.get(i10);
                    if (!fVar.isEnded()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f96387c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : f.f96391a;
                        long jRemaining = byteBuffer2.remaining();
                        fVar.queueInput(byteBuffer2);
                        this.f96387c[i10] = fVar.getOutput();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f96387c[i10].hasRemaining();
                    } else if (!this.f96387c[i10].hasRemaining() && i10 < c()) {
                        ((f) this.f96386b.get(i10 + 1)).queueEndOfStream();
                    }
                }
                i10++;
            }
        }
    }

    public f.a a(f.a aVar) throws f.b {
        if (aVar.equals(f.a.f96392e)) {
            throw new f.b(aVar);
        }
        for (int i10 = 0; i10 < this.f96385a.size(); i10++) {
            f fVar = (f) this.f96385a.get(i10);
            f.a aVarA = fVar.a(aVar);
            if (fVar.isActive()) {
                q9.a.g(!aVarA.equals(f.a.f96392e));
                aVar = aVarA;
            }
        }
        this.f96389e = aVar;
        return aVar;
    }

    public void b() {
        this.f96386b.clear();
        this.f96388d = this.f96389e;
        this.f96390f = false;
        for (int i10 = 0; i10 < this.f96385a.size(); i10++) {
            f fVar = (f) this.f96385a.get(i10);
            fVar.flush();
            if (fVar.isActive()) {
                this.f96386b.add(fVar);
            }
        }
        this.f96387c = new ByteBuffer[this.f96386b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f96387c[i11] = ((f) this.f96386b.get(i11)).getOutput();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return f.f96391a;
        }
        ByteBuffer byteBuffer = this.f96387c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(f.f96391a);
        return this.f96387c[c()];
    }

    public boolean e() {
        return this.f96390f && ((f) this.f96386b.get(c())).isEnded() && !this.f96387c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f96385a.size() != eVar.f96385a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f96385a.size(); i10++) {
            if (this.f96385a.get(i10) != eVar.f96385a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f96386b.isEmpty();
    }

    public void h() {
        if (!f() || this.f96390f) {
            return;
        }
        this.f96390f = true;
        ((f) this.f96386b.get(0)).queueEndOfStream();
    }

    public int hashCode() {
        return this.f96385a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f96390f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f96385a.size(); i10++) {
            f fVar = (f) this.f96385a.get(i10);
            fVar.flush();
            fVar.reset();
        }
        this.f96387c = new ByteBuffer[0];
        f.a aVar = f.a.f96392e;
        this.f96388d = aVar;
        this.f96389e = aVar;
        this.f96390f = false;
    }
}
