package zg;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlinx.serialization.json.b f119491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f119492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 writer, kotlinx.serialization.json.b json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f119491c = json;
    }

    @Override // zg.r
    public void b() {
        o(true);
        this.f119492d++;
    }

    @Override // zg.r
    public void c() {
        o(false);
        k(IOUtils.LINE_SEPARATOR_UNIX);
        int i10 = this.f119492d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f119491c.e().n());
        }
    }

    @Override // zg.r
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // zg.r
    public void p() {
        f(' ');
    }

    @Override // zg.r
    public void q() {
        this.f119492d--;
    }
}
