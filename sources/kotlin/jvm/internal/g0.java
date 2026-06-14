package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public class g0 extends f0 {
    public g0(Class cls, String str, String str2, int i10) {
        super(o.NO_RECEIVER, cls, str, str2, i10);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
