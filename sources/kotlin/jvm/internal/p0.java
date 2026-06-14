package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public class p0 extends o0 {
    public p0(Class cls, String str, String str2, int i10) {
        super(cls, str, str2, i10);
    }

    @Override // kotlin.reflect.KProperty2
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
