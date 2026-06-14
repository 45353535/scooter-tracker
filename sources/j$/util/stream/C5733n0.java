package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5733n0 extends AbstractC5752r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumC5757s0 f85316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f85317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5733n0(EnumC5757s0 enumC5757s0, Predicate predicate) {
        super(enumC5757s0);
        this.f85316c = enumC5757s0;
        this.f85317d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f85349a) {
            return;
        }
        boolean zTest = this.f85317d.test(obj);
        EnumC5757s0 enumC5757s0 = this.f85316c;
        if (zTest == enumC5757s0.f85355a) {
            this.f85349a = true;
            this.f85350b = enumC5757s0.f85356b;
        }
    }
}
